package com.example.ui

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioFocusRequest
import android.media.AudioManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import android.widget.Toast
import java.util.Locale

class TTSManager(private val context: Context) {
    private var tts: TextToSpeech? = null
    private var isInitialized = false
    private val mainHandler = Handler(Looper.getMainLooper())
    private val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as? AudioManager

    private data class PendingSpeech(
        val text: String,
        val onStart: () -> Unit,
        val onDone: () -> Unit
    )
    private var pendingSpeech: PendingSpeech? = null

    init {
        initTTS()
    }

    private fun initTTS() {
        tts = TextToSpeech(context.applicationContext) { status ->
            if (status == TextToSpeech.SUCCESS) {
                try {
                    // Set audio attributes for media/speech streaming
                    val audioAttributes = AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                        .build()
                    tts?.setAudioAttributes(audioAttributes)
                } catch (e: Exception) {
                    Log.e("TTSManager", "Error setting audio attributes", e)
                }

                // Try UK English first, with sequential fallback options
                var langResult = tts?.setLanguage(Locale.UK)
                if (langResult == TextToSpeech.LANG_MISSING_DATA || langResult == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.w("TTSManager", "UK English not available, trying US English.")
                    langResult = tts?.setLanguage(Locale.US)
                    if (langResult == TextToSpeech.LANG_MISSING_DATA || langResult == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.w("TTSManager", "US English not available, trying general English.")
                        langResult = tts?.setLanguage(Locale.ENGLISH)
                        if (langResult == TextToSpeech.LANG_MISSING_DATA || langResult == TextToSpeech.LANG_NOT_SUPPORTED) {
                            Log.w("TTSManager", "General English not available, using default.")
                            tts?.setLanguage(Locale.getDefault())
                        }
                    }
                }

                tts?.setSpeechRate(0.85f)
                isInitialized = true
                Log.d("TTSManager", "TextToSpeech initialized successfully.")

                pendingSpeech?.let { pending ->
                    pendingSpeech = null
                    speak(pending.text, pending.onStart, pending.onDone)
                }
            } else {
                Log.e("TTSManager", "Initialization of TextToSpeech failed with status: $status")
                mainHandler.post {
                    Toast.makeText(
                        context,
                        "⚠️ Motor TTS no disponible en este dispositivo.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    fun speak(text: String, onStart: () -> Unit = {}, onDone: () -> Unit = {}) {
        if (!isInitialized) {
            Log.w("TTSManager", "TTS not fully initialized yet. Queueing speech request.")
            pendingSpeech = PendingSpeech(text, onStart, onDone)
            return
        }

        // Check audio volume & request focus
        audioManager?.let { am ->
            val currentVol = am.getStreamVolume(AudioManager.STREAM_MUSIC)
            val maxVol = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
            if (currentVol == 0) {
                // Try raising volume slightly if muted
                try {
                    am.setStreamVolume(AudioManager.STREAM_MUSIC, maxVol / 2, 0)
                } catch (e: Exception) {
                    Log.w("TTSManager", "Could not adjust stream volume", e)
                }
            }

            // Request Audio Focus
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val focusRequest = AudioFocusRequest.Builder(AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)
                    .setAudioAttributes(
                        AudioAttributes.Builder()
                            .setUsage(AudioAttributes.USAGE_MEDIA)
                            .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                            .build()
                    )
                    .build()
                am.requestAudioFocus(focusRequest)
            } else {
                @Suppress("DEPRECATION")
                am.requestAudioFocus(null, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)
            }
        }

        tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {
                mainHandler.post { onStart() }
            }

            override fun onDone(utteranceId: String?) {
                mainHandler.post { onDone() }
            }

            @Deprecated("Deprecated in Java")
            override fun onError(utteranceId: String?) {
                mainHandler.post { onDone() }
            }

            override fun onError(utteranceId: String?, errorCode: Int) {
                Log.e("TTSManager", "Utterance progress error code: $errorCode")
                mainHandler.post { onDone() }
            }
        })

        val utteranceId = "MarbellaPoliceSpeech_${System.currentTimeMillis()}"
        val params = Bundle().apply {
            putInt(TextToSpeech.Engine.KEY_PARAM_STREAM, AudioManager.STREAM_MUSIC)
        }

        mainHandler.post {
            Toast.makeText(context, "🔊 $text", Toast.LENGTH_SHORT).show()
        }

        val result = tts?.speak(text, TextToSpeech.QUEUE_FLUSH, params, utteranceId)
        if (result == TextToSpeech.ERROR) {
            Log.e("TTSManager", "Error executing speak()")
            mainHandler.post { onDone() }
        }
    }

    fun stop() {
        pendingSpeech = null
        if (isInitialized) {
            tts?.stop()
        }
    }

    fun shutdown() {
        pendingSpeech = null
        tts?.stop()
        tts?.shutdown()
        tts = null
        isInitialized = false
    }
}


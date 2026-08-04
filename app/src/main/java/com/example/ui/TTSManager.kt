package com.example.ui

import android.content.Context
import android.media.AudioAttributes
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
                // Configure audio attributes for media/speech streaming
                val audioAttributes = AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                    .build()
                tts?.setAudioAttributes(audioAttributes)

                // Try UK English first, with sequential fallback options
                val resultUK = tts?.setLanguage(Locale.UK)
                if (resultUK == TextToSpeech.LANG_MISSING_DATA || resultUK == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.w("TTSManager", "UK English not available, trying US English.")
                    val resultUS = tts?.setLanguage(Locale.US)
                    if (resultUS == TextToSpeech.LANG_MISSING_DATA || resultUS == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.w("TTSManager", "US English not available, trying general English.")
                        val resultEN = tts?.setLanguage(Locale.ENGLISH)
                        if (resultEN == TextToSpeech.LANG_MISSING_DATA || resultEN == TextToSpeech.LANG_NOT_SUPPORTED) {
                            Log.w("TTSManager", "General English not available, using system default.")
                            tts?.setLanguage(Locale.getDefault())
                        }
                    }
                }

                // Set speed rate
                tts?.setSpeechRate(0.85f)
                isInitialized = true
                Log.d("TTSManager", "TextToSpeech initialized successfully.")

                // Execute any queued speech request received while initializing
                pendingSpeech?.let { pending ->
                    pendingSpeech = null
                    speak(pending.text, pending.onStart, pending.onDone)
                }
            } else {
                Log.e("TTSManager", "Initialization of TextToSpeech failed with status: $status")
                mainHandler.post {
                    Toast.makeText(
                        context,
                        "No se pudo iniciar el motor de síntesis de voz.",
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
        val result = tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
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

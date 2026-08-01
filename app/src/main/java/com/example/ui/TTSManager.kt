package com.example.ui

import android.content.Context
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import java.util.Locale

class TTSManager(context: Context) {
    private var tts: TextToSpeech? = null
    private var isInitialized = false

    init {
        tts = TextToSpeech(context.applicationContext) { status ->
            if (status == TextToSpeech.SUCCESS) {
                val result = tts?.setLanguage(Locale.UK)
                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.e("TTSManager", "British English (UK) language is not supported or missing data.")
                    // Fallback to English US if UK is not available
                    tts?.setLanguage(Locale.US)
                }
                // Set speed to exactly 0.85 as requested
                tts?.setSpeechRate(0.85f)
                isInitialized = true
            } else {
                Log.e("TTSManager", "Initialization of TextToSpeech failed.")
            }
        }
    }

    fun speak(text: String, onStart: () -> Unit = {}, onDone: () -> Unit = {}) {
        if (!isInitialized) {
            Log.w("TTSManager", "TTS not fully initialized yet.")
            return
        }
        
        tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {
                onStart()
            }

            override fun onDone(utteranceId: String?) {
                onDone()
            }

            @Deprecated("Deprecated in Java")
            override fun onError(utteranceId: String?) {
                onDone()
            }

            override fun onError(utteranceId: String?, errorCode: Int) {
                onDone()
            }
        })

        // Speak and flush previous queue
        tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, "MarbellaPoliceSpeechId")
    }

    fun stop() {
        if (isInitialized) {
            tts?.stop()
        }
    }

    fun shutdown() {
        tts?.stop()
        tts?.shutdown()
        tts = null
        isInitialized = false
    }
}

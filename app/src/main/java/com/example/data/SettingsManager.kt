package com.example.data

import android.content.Context
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

enum class VoiceGender(val label: String) {
    MALE("Masculina"),
    FEMALE("Femenina")
}

enum class SpeechSpeed(val label: String, val rate: Float) {
    SLOW("Lenta", 0.65f),
    NORMAL("Normal", 0.90f),
    FAST("Rápida", 1.15f)
}

enum class RepeatMode(val label: String, val extraTimes: Int) {
    NONE("Sin repetición", 0),
    ONCE("1 vez", 1),
    TWICE("2 veces", 2)
}

enum class AppTheme(val label: String) {
    DARK("Modo noche"),
    LIGHT("Modo día")
}

data class AppSettings(
    val voiceGender: VoiceGender = VoiceGender.MALE,
    val speechSpeed: SpeechSpeed = SpeechSpeed.NORMAL,
    val repeatMode: RepeatMode = RepeatMode.NONE,
    val appTheme: AppTheme = AppTheme.DARK
)

class SettingsManager(context: Context) {
    private val prefs = context.getSharedPreferences("marbella_police_settings", Context.MODE_PRIVATE)

    private val _settings = MutableStateFlow(loadSettings())
    val settings: StateFlow<AppSettings> = _settings.asStateFlow()

    private fun loadSettings(): AppSettings {
        val voiceStr = prefs.getString("voice_gender", VoiceGender.MALE.name) ?: VoiceGender.MALE.name
        val speedStr = prefs.getString("speech_speed", SpeechSpeed.NORMAL.name) ?: SpeechSpeed.NORMAL.name
        val repeatStr = prefs.getString("repeat_mode", RepeatMode.NONE.name) ?: RepeatMode.NONE.name
        val themeStr = prefs.getString("app_theme", AppTheme.DARK.name) ?: AppTheme.DARK.name

        return AppSettings(
            voiceGender = runCatching { VoiceGender.valueOf(voiceStr) }.getOrDefault(VoiceGender.MALE),
            speechSpeed = runCatching { SpeechSpeed.valueOf(speedStr) }.getOrDefault(SpeechSpeed.NORMAL),
            repeatMode = runCatching { RepeatMode.valueOf(repeatStr) }.getOrDefault(RepeatMode.NONE),
            appTheme = runCatching { AppTheme.valueOf(themeStr) }.getOrDefault(AppTheme.DARK)
        )
    }

    fun updateVoiceGender(gender: VoiceGender) {
        prefs.edit().putString("voice_gender", gender.name).apply()
        _settings.value = _settings.value.copy(voiceGender = gender)
    }

    fun updateSpeechSpeed(speed: SpeechSpeed) {
        prefs.edit().putString("speech_speed", speed.name).apply()
        _settings.value = _settings.value.copy(speechSpeed = speed)
    }

    fun updateRepeatMode(repeatMode: RepeatMode) {
        prefs.edit().putString("repeat_mode", repeatMode.name).apply()
        _settings.value = _settings.value.copy(repeatMode = repeatMode)
    }

    fun updateAppTheme(theme: AppTheme) {
        prefs.edit().putString("app_theme", theme.name).apply()
        _settings.value = _settings.value.copy(appTheme = theme)
    }
}

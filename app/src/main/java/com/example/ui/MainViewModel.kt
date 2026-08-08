package com.example.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.data.AppSettings
import com.example.data.AppTheme
import com.example.data.DatabaseManager
import com.example.data.RepeatMode
import com.example.data.SettingsManager
import com.example.data.SpeechSpeed
import com.example.data.VoiceGender
import com.example.data.model.Lesson
import com.example.data.model.Module
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private var settingsManager: SettingsManager? = null

    private val _modules = MutableStateFlow<List<Module>>(DatabaseManager.allModules)
    val modules: StateFlow<List<Module>> = _modules.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedLesson = MutableStateFlow<Lesson?>(null)
    val selectedLesson: StateFlow<Lesson?> = _selectedLesson.asStateFlow()

    private val _expandedModuleId = MutableStateFlow<Int?>(null)
    val expandedModuleId: StateFlow<Int?> = _expandedModuleId.asStateFlow()

    private val _currentlyPlayingPhrase = MutableStateFlow<String?>(null)
    val currentlyPlayingPhrase: StateFlow<String?> = _currentlyPlayingPhrase.asStateFlow()

    // Estado para controlar la visualización de la pantalla de información / créditos
    private val _infoMode = MutableStateFlow(false)
    val infoMode: StateFlow<Boolean> = _infoMode.asStateFlow()

    private val _settings = MutableStateFlow(AppSettings())
    val settings: StateFlow<AppSettings> = _settings.asStateFlow()

    fun initSettings(context: Context) {
        if (settingsManager == null) {
            val manager = SettingsManager(context.applicationContext)
            settingsManager = manager
            _settings.value = manager.settings.value
        }
    }

    fun updateVoiceGender(gender: VoiceGender) {
        settingsManager?.updateVoiceGender(gender)
        _settings.value = _settings.value.copy(voiceGender = gender)
    }

    fun updateSpeechSpeed(speed: SpeechSpeed) {
        settingsManager?.updateSpeechSpeed(speed)
        _settings.value = _settings.value.copy(speechSpeed = speed)
    }

    fun updateRepeatMode(repeatMode: RepeatMode) {
        settingsManager?.updateRepeatMode(repeatMode)
        _settings.value = _settings.value.copy(repeatMode = repeatMode)
    }

    fun updateAppTheme(theme: AppTheme) {
        settingsManager?.updateAppTheme(theme)
        _settings.value = _settings.value.copy(appTheme = theme)
    }

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun selectLesson(lesson: Lesson?) {
        _selectedLesson.value = lesson
    }

    fun toggleModuleExpanded(moduleId: Int) {
        if (_expandedModuleId.value == moduleId) {
            _expandedModuleId.value = null
        } else {
            _expandedModuleId.value = moduleId
        }
    }

    fun setCurrentlyPlaying(phraseText: String?) {
        _currentlyPlayingPhrase.value = phraseText
    }

    fun setInfoMode(active: Boolean) {
        _infoMode.value = active
    }
}

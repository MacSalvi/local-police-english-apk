package com.example.ui

import androidx.lifecycle.ViewModel
import com.example.data.DatabaseManager
import com.example.data.model.Lesson
import com.example.data.model.Module
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

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
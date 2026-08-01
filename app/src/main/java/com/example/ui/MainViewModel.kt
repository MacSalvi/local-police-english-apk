package com.example.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.data.DatabaseManager
import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val context = application.applicationContext

    private val _modules = MutableStateFlow<List<Module>>(emptyList())
    val modules: StateFlow<List<Module>> = _modules.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedLesson = MutableStateFlow<Lesson?>(null)
    val selectedLesson: StateFlow<Lesson?> = _selectedLesson.asStateFlow()

    private val _expandedModuleId = MutableStateFlow<Int?>(null)
    val expandedModuleId: StateFlow<Int?> = _expandedModuleId.asStateFlow()

    private val _currentlyPlayingPhrase = MutableStateFlow<String?>(null)
    val currentlyPlayingPhrase: StateFlow<String?> = _currentlyPlayingPhrase.asStateFlow()

    private val _managerMode = MutableStateFlow(false)
    val managerMode: StateFlow<Boolean> = _managerMode.asStateFlow()

    init {
        loadData()
    }

    fun loadData() {
        _modules.value = DatabaseManager.loadDatabase(context)
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

    fun setManagerMode(active: Boolean) {
        _managerMode.value = active
    }

    // --- Database Management (Gestor / Admin Panel Actions) ---

    fun saveAndRefresh(updatedList: List<Module>) {
        _modules.value = updatedList
        DatabaseManager.saveDatabase(context, updatedList)
    }

    fun addLessonToModule(
        moduleId: Int,
        lessonTitle: String,
        vocabulary: List<VocabularyItem>,
        phrases: List<PhraseItem>,
        tips: List<String>
    ) {
        val currentList = _modules.value.toMutableList()
        val index = currentList.indexOfFirst { it.moduleId == moduleId }
        if (index != -1) {
            val module = currentList[index]
            val newLessonId = (module.lessons.maxOfOrNull { it.lessonId } ?: (moduleId * 100)) + 1
            val newLesson = Lesson(
                lessonId = newLessonId,
                lessonTitle = lessonTitle,
                vocabulary = vocabulary,
                phrases = phrases,
                tips = tips
            )
            
            val updatedLessons = module.lessons.toMutableList().apply { add(newLesson) }
            currentList[index] = module.copy(lessons = updatedLessons)
            saveAndRefresh(currentList)
        }
    }

    fun deleteLesson(moduleId: Int, lessonId: Int) {
        val currentList = _modules.value.toMutableList()
        val index = currentList.indexOfFirst { it.moduleId == moduleId }
        if (index != -1) {
            val module = currentList[index]
            val updatedLessons = module.lessons.filter { it.lessonId != lessonId }
            currentList[index] = module.copy(lessons = updatedLessons)
            
            // Clear selection if deleted
            if (_selectedLesson.value?.lessonId == lessonId) {
                _selectedLesson.value = null
            }
            saveAndRefresh(currentList)
        }
    }

    fun updateLesson(
        moduleId: Int,
        lessonId: Int,
        newTitle: String,
        vocabulary: List<VocabularyItem>,
        phrases: List<PhraseItem>,
        tips: List<String>
    ) {
        val currentList = _modules.value.toMutableList()
        val mIndex = currentList.indexOfFirst { it.moduleId == moduleId }
        if (mIndex != -1) {
            val module = currentList[mIndex]
            val updatedLessons = module.lessons.map { lesson ->
                if (lesson.lessonId == lessonId) {
                    lesson.copy(
                        lessonTitle = newTitle,
                        vocabulary = vocabulary,
                        phrases = phrases,
                        tips = tips
                    )
                } else {
                    lesson
                }
            }
            currentList[mIndex] = module.copy(lessons = updatedLessons)
            
            val updatedLessonObj = updatedLessons.firstOrNull { it.lessonId == lessonId }
            if (_selectedLesson.value?.lessonId == lessonId) {
                _selectedLesson.value = updatedLessonObj
            }
            saveAndRefresh(currentList)
        }
    }

    fun importJson(jsonString: String): Boolean {
        return try {
            val parsed = DatabaseManager.parseJson(jsonString)
            if (parsed.isNotEmpty()) {
                _modules.value = parsed
                DatabaseManager.saveDatabase(context, parsed)
                true
            } else {
                false
            }
        } catch (e: Exception) {
            false
        }
    }

    fun exportJson(): String {
        return DatabaseManager.serializeModules(_modules.value)
    }

    fun resetToDefaults(): Boolean {
        return try {
            val file = DatabaseManager.getDatabaseFile(context)
            if (file.exists()) {
                file.delete()
            }
            loadData()
            _selectedLesson.value = null
            _expandedModuleId.value = null
            true
        } catch (e: Exception) {
            false
        }
    }
}

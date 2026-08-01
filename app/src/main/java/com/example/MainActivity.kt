package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.ui.MainViewModel
import com.example.ui.TTSManager
import com.example.ui.screens.LessonScreen
import com.example.ui.screens.ManagerScreen
import com.example.ui.screens.SyllabusScreen
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var ttsManager: TTSManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize British English TTS at 0.85 rate
        ttsManager = TTSManager(this)

        setContent {
            MyApplicationTheme {
                val modules by viewModel.modules.collectAsState()
                val searchQuery by viewModel.searchQuery.collectAsState()
                val selectedLesson by viewModel.selectedLesson.collectAsState()
                val expandedModuleId by viewModel.expandedModuleId.collectAsState()
                val currentlyPlayingPhrase by viewModel.currentlyPlayingPhrase.collectAsState()
                val managerMode by viewModel.managerMode.collectAsState()

                when {
                    selectedLesson != null -> {
                        LessonScreen(
                            lesson = selectedLesson!!,
                            currentlyPlayingText = currentlyPlayingPhrase,
                            onBackClick = {
                                ttsManager.stop()
                                viewModel.setCurrentlyPlaying(null)
                                viewModel.selectLesson(null)
                            },
                            onSpeakClick = { text ->
                                if (currentlyPlayingPhrase == text) {
                                    ttsManager.stop()
                                    viewModel.setCurrentlyPlaying(null)
                                } else {
                                    viewModel.setCurrentlyPlaying(text)
                                    ttsManager.speak(
                                        text = text,
                                        onStart = { /* active flag set */ },
                                        onDone = { viewModel.setCurrentlyPlaying(null) }
                                    )
                                }
                            }
                        )
                    }
                    managerMode -> {
                        ManagerScreen(
                            modules = modules,
                            onBackClick = {
                                viewModel.setManagerMode(false)
                            },
                            onAddLesson = { moduleId, title, vocabulary, phrases, tips ->
                                viewModel.addLessonToModule(moduleId, title, vocabulary, phrases, tips)
                            },
                            onUpdateLesson = { moduleId, lessonId, title, vocabulary, phrases, tips ->
                                viewModel.updateLesson(moduleId, lessonId, title, vocabulary, phrases, tips)
                            },
                            onDeleteLesson = { moduleId, lessonId ->
                                viewModel.deleteLesson(moduleId, lessonId)
                            },
                            onImportJson = { json ->
                                viewModel.importJson(json)
                            },
                            onExportJson = {
                                viewModel.exportJson()
                            },
                            onResetToDefaults = {
                                viewModel.resetToDefaults()
                            }
                        )
                    }
                    else -> {
                        SyllabusScreen(
                            modules = modules,
                            searchQuery = searchQuery,
                            expandedModuleId = expandedModuleId,
                            currentlyPlayingText = currentlyPlayingPhrase,
                            onSearchQueryChange = { query ->
                                viewModel.setSearchQuery(query)
                            },
                            onModuleToggle = { moduleId ->
                                viewModel.toggleModuleExpanded(moduleId)
                            },
                            onLessonClick = { lesson ->
                                viewModel.selectLesson(lesson)
                            },
                            onSpeakClick = { text ->
                                if (currentlyPlayingPhrase == text) {
                                    ttsManager.stop()
                                    viewModel.setCurrentlyPlaying(null)
                                } else {
                                    viewModel.setCurrentlyPlaying(text)
                                    ttsManager.speak(
                                        text = text,
                                        onStart = {},
                                        onDone = { viewModel.setCurrentlyPlaying(null) }
                                    )
                                }
                            },
                            onEnterManagerMode = {
                                viewModel.setManagerMode(true)
                            }
                        )
                    }
                }
            }
        }
    }

    override fun onPause() {
        super.onPause()
        ttsManager.stop()
        viewModel.setCurrentlyPlaying(null)
    }

    override fun onDestroy() {
        super.onDestroy()
        ttsManager.shutdown()
    }
}

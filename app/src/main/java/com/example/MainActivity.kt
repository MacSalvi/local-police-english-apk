package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.ui.MainViewModel
import com.example.ui.TTSManager
import com.example.ui.screens.AppInfoScreen
import com.example.ui.screens.LessonScreen
import com.example.ui.screens.SyllabusScreen
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var ttsManager: TTSManager

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        ttsManager = TTSManager(this)

        setContent {
            MyApplicationTheme {
                val modules by viewModel.modules.collectAsState()
                val searchQuery by viewModel.searchQuery.collectAsState()
                val selectedLesson by viewModel.selectedLesson.collectAsState()
                val expandedModuleId by viewModel.expandedModuleId.collectAsState()
                val currentlyPlayingPhrase by viewModel.currentlyPlayingPhrase.collectAsState()
                val infoMode by viewModel.infoMode.collectAsState()

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
                                        onStart = {},
                                        onDone = { viewModel.setCurrentlyPlaying(null) }
                                    )
                                }
                            }
                        )
                    }
                    infoMode -> {
                        AppInfoScreen(
                            onBackClick = {
                                viewModel.setInfoMode(false)
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
                            onEnterInfoMode = {
                                viewModel.setInfoMode(true)
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
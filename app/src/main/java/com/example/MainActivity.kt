package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.ui.MainViewModel
import com.example.ui.TTSManager
import com.example.ui.screens.AppInfoScreen
import com.example.ui.screens.LessonScreen
import com.example.ui.screens.SplashScreen
import com.example.ui.screens.SyllabusScreen
import com.example.ui.theme.MyApplicationTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var ttsManager: TTSManager

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        ttsManager = TTSManager(this)
        viewModel.initSettings(this)

        setContent {
            val settings by viewModel.settings.collectAsState()

            MyApplicationTheme(appTheme = settings.appTheme) {
                var showSplash by remember { mutableStateOf(true) }

                LaunchedEffect(Unit) {
                    delay(1600)
                    showSplash = false
                }

                Crossfade(
                    targetState = showSplash,
                    animationSpec = tween(durationMillis = 300),
                    label = "SplashTransition"
                ) { isSplash ->
                    if (isSplash) {
                        SplashScreen()
                    } else {
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
                                                settings = settings,
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
                                    settings = settings,
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
                                                settings = settings,
                                                onStart = {},
                                                onDone = { viewModel.setCurrentlyPlaying(null) }
                                            )
                                        }
                                    },
                                    onEnterInfoMode = {
                                        viewModel.setInfoMode(true)
                                    },
                                    onVoiceGenderChange = { viewModel.updateVoiceGender(it) },
                                    onSpeechSpeedChange = { viewModel.updateSpeechSpeed(it) },
                                    onRepeatModeChange = { viewModel.updateRepeatMode(it) },
                                    onAppThemeChange = { viewModel.updateAppTheme(it) }
                                )
                            }
                        }
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
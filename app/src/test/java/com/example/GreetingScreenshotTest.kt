package com.example

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.Phrase
import com.example.ui.screens.SyllabusScreen
import com.example.ui.theme.MyApplicationTheme
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(qualifiers = RobolectricDeviceQualifiers.Pixel8, sdk = [36])
class GreetingScreenshotTest {

  @get:Rule val composeTestRule = createComposeRule()

  @Test
  fun greeting_screenshot() {
    val mockModules = listOf(
      Module(
        moduleId = 1,
        moduleName = "Módulo I: Asistencia y Servicio",
        lessons = listOf(
          Lesson(
            lessonId = 101,
            lessonTitle = "Saludo y Primer Contacto",
            phrases = listOf(
              Phrase("Hola, soy Policía Local.", "Hello, I am Local Police.")
            )
          )
        )
      )
    )

    composeTestRule.setContent {
      MyApplicationTheme {
        SyllabusScreen(
          modules = mockModules,
          searchQuery = "",
          expandedModuleId = null,
          currentlyPlayingText = null,
          onSearchQueryChange = {},
          onModuleToggle = {},
          onLessonClick = {},
          onSpeakClick = {},
          onEnterManagerMode = {}
        )
      }
    }

    composeTestRule.onRoot().captureRoboImage(filePath = "src/test/screenshots/greeting.png")
  }
}

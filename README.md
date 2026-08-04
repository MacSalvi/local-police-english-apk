# Local Police English App

Aplicación nativa para Android desarrollada con **Jetpack Compose** y **Kotlin**, concebida como una herramienta de referencia y consulta especializada en terminología policial en inglés británico (`en-GB`).

## 👨‍💻 Autor / Creador
* **Desarrollador**: Policía Local de Marbella (CP214 S.C.R.)
* **Contacto**: macsalvi@gmail.com

## 🚀 Características Principales

* **Estructura Académica**: 30 módulos organizados en 7 áreas temáticas especializadas.
* **Base de Datos Extensa**: Más de 3,099 términos y 798 frases técnicas integradas.
* **Síntesis de Voz (TTS)**: Integración con el motor de voz nativo en inglés británico (`en-GB`) y transcripción fonética personalizada.
* **Consulta Rápida**: Hoja de comandos de emergencia y acceso optimizado a contenidos operativos.
* **Diseño UI/UX Moderno**: Interfaz fluida desarrollada íntegramente con Jetpack Compose y soporte para Splash Screen nativo.

## 🛠️ Stack Tecnológico

* **Lenguaje**: Kotlin
* **Interfaz de Usuario**: Jetpack Compose & Material 3
* **Arquitectura**: MVVM (`MainViewModel` con gestión de estados reactivos)
* **Audio**: Android Text-to-Speech (`TTSManager`)

## 📦 Compilación y Distribución

Para generar el archivo ejecutable optimizado para producción (`release`) en local:

```bash
./gradlew assembleRelease

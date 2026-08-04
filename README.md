# 🚔 Inglés Operativo - Policía Local

## 👤 Créditos y Autoría
* **Desarrollo:** Policía Local de Marbella — CP214 S.C.R.
* **Contacto:** macsalvi@gmail.com ✉️

---

## 📱 Descripción del Proyecto
Aplicación móvil nativa desarrollada para Android, diseñada para facilitar la intervención y la comunicación operativa en lengua inglesa para los cuerpos de seguridad. 👮‍♂️💬

## ⚙️ Características Técnicas
* **Plataforma:** Android (Nativo) 🤖
* **Lenguaje:** Kotlin 💻
* **Interfaz de Usuario:** Jetpack Compose 🎨
* **Estructura:** Arquitectura modular compuesta por 30 bloques temáticos adaptados a procedimientos policiales, control de tráfico y atención ciudadana. 🗂️
* **Funcionalidad de Audio:** Motor integrado de Texto a Voz (*Text-to-Speech*) para la reproducción y práctica de frases operativas. 🔊

## 🗂️ Estructura de Módulos
La aplicación se divide en 30 módulos especializados orientados a situaciones profesionales específicas:
* 🪪 Identificaciones y requerimientos normativos.
* 🚦 Regulación de tráfico y seguridad vial.
* 🚨 Gestión de incidencias y alteraciones del orden.
* 📘 Terminología técnico-policial de uso frecuente.

## 🚀 Compilación y Automatización
El repositorio incluye un flujo de trabajo automatizado mediante **GitHub Actions** (`.github/workflows/build-release.yml`) encargado de compilar el proyecto en entornos virtuales de Linux (Java 17, SDK de Android y Gradle 8.7) y adjuntar de manera automática el archivo ejecutable `.apk` a la sección de *Releases* al publicar una nueva etiqueta (*Tag*). 📦⚙️

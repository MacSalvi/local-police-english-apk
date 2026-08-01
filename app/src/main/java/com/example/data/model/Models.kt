package com.example.data.model

data class Module(
    val moduleId: Int,
    val moduleName: String,
    val lessons: List<Lesson>
)

data class Lesson(
    val lessonId: Int,
    val lessonTitle: String,
    val vocabulary: List<VocabularyItem> = emptyList(),
    val phrases: List<PhraseItem> = emptyList(),
    val tips: List<String> = emptyList()
) {
    val id: Int get() = lessonId
    val title: String get() = lessonTitle
}

data class VocabularyItem(
    val es: String,
    val en: String,
    val phonetic: String = ""
)

data class PhraseItem(
    val es: String,
    val en: String,
    val phonetic: String = ""
)

typealias Phrase = PhraseItem
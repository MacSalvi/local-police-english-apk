package com.example.data.model

data class Module(
    val moduleId: Int = 0,
    val moduleName: String = "",
    val lessons: List<Lesson> = emptyList()
) {
    val id: Int get() = moduleId
    val title: String get() = moduleName

    companion object {
        operator fun invoke(
            id: Int,
            title: String,
            description: String = "",
            lessons: List<Lesson>
        ): Module = Module(moduleId = id, moduleName = title, lessons = lessons)
    }
}

data class Lesson(
    val lessonId: Int = 0,
    val lessonTitle: String = "",
    val vocabulary: List<VocabularyItem> = emptyList(),
    val phrases: List<PhraseItem> = emptyList(),
    val tips: List<String> = emptyList()
) {
    val id: Int get() = lessonId
    val title: String get() = lessonTitle

    companion object {
        operator fun invoke(
            id: Int,
            title: String,
            vocabulary: List<VocabularyItem> = emptyList(),
            phrases: List<PhraseItem> = emptyList(),
            tips: List<String> = emptyList()
        ): Lesson = Lesson(
            lessonId = id,
            lessonTitle = title,
            vocabulary = vocabulary,
            phrases = phrases,
            tips = tips
        )
    }
}

data class VocabularyItem(
    val es: String = "",
    val en: String = "",
    val phonetic: String = ""
) {
    val term: String get() = en
    val translation: String get() = es

    companion object {
        operator fun invoke(
            term: String,
            phonetic: String = "",
            translation: String
        ): VocabularyItem = VocabularyItem(es = translation, en = term, phonetic = phonetic)
    }
}

data class PhraseItem(
    val es: String = "",
    val en: String = "",
    val phonetic: String = ""
) {
    val english: String get() = en
    val spanish: String get() = es

    companion object {
        operator fun invoke(
            english: String,
            phonetic: String = "",
            spanish: String
        ): PhraseItem = PhraseItem(es = spanish, en = english, phonetic = phonetic)
    }
}

typealias Phrase = PhraseItem

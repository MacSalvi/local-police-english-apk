package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module2 = Module(
    moduleId = 2,
    moduleName = "Módulo 2: Identificación de personas",
    lessons = listOf(
        Lesson(
            lessonId = 201,
            lessonTitle = "Documentos de identificación",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Documento",
                    en = "DOCUMENT",
                    phonetic = "dókiument"
                ),
                VocabularyItem(
                    es = "Documento de identidad",
                    en = "ID CARD",
                    phonetic = "aidí card"
                ),
                VocabularyItem(
                    es = "Pasaporte",
                    en = "PASSPORT",
                    phonetic = "pásport"
                ),
                VocabularyItem(
                    es = "Permiso de residencia",
                    en = "RESIDENCE PERMIT",
                    phonetic = "résidens permít"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Muéstreme su documento de identidad, por favor.",
                    en = "SHOW ME YOUR ID, PLEASE.",
                    phonetic = "shou mi yor aidí, plis"
                ),
                PhraseItem(
                    es = "¿Tiene algún documento de identificación?",
                    en = "DO YOU HAVE ANY IDENTIFICATION?",
                    phonetic = "du yu jav éni aidentifikéishon"
                ),
                PhraseItem(
                    es = "¿Lleva su pasaporte consigo?",
                    en = "DO YOU HAVE YOUR PASSPORT WITH YOU?",
                    phonetic = "du yu jav yor pásport güiz yu"
                ),
                PhraseItem(
                    es = "Muéstreme su pasaporte, por favor.",
                    en = "SHOW ME YOUR PASSPORT, PLEASE.",
                    phonetic = "shou mi yor pásport, plis"
                ),
                PhraseItem(
                    es = "¿Tiene permiso de residencia?",
                    en = "DO YOU HAVE A RESIDENCE PERMIT?",
                    phonetic = "du yu jav a résidens permít"
                ),
                PhraseItem(
                    es = "Muéstreme su permiso de residencia, por favor.",
                    en = "SHOW ME YOUR RESIDENCE PERMIT, PLEASE.",
                    phonetic = "shou mi yor résidens permít, plis"
                )
            )
        ),
        Lesson(
            lessonId = 202,
            lessonTitle = "Datos personales",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Nombre",
                    en = "NAME",
                    phonetic = "néim"
                ),
                VocabularyItem(
                    es = "Apellidos",
                    en = "SURNAME",
                    phonetic = "sörneim"
                ),
                VocabularyItem(
                    es = "Fecha de nacimiento",
                    en = "DATE OF BIRTH",
                    phonetic = "déit ov berz"
                ),
                VocabularyItem(
                    es = "Dirección",
                    en = "ADDRESS",
                    phonetic = "ádres"
                ),
                VocabularyItem(
                    es = "Nacionalidad",
                    en = "NATIONALITY",
                    phonetic = "nashonáliti"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Cuál es su nombre completo?",
                    en = "WHAT'S YOUR FULL NAME?",
                    phonetic = "guats yor ful néim"
                ),
                PhraseItem(
                    es = "¿Cuál es su fecha de nacimiento?",
                    en = "WHAT'S YOUR DATE OF BIRTH?",
                    phonetic = "guats yor déit ov berz"
                ),
                PhraseItem(
                    es = "¿Cuál es su dirección?",
                    en = "WHAT'S YOUR ADDRESS?",
                    phonetic = "guats yor ádres"
                ),
                PhraseItem(
                    es = "¿Cuál es su número de teléfono?",
                    en = "WHAT'S YOUR PHONE NUMBER?",
                    phonetic = "guats yor fóun námber"
                ),
                PhraseItem(
                    es = "¿Cuál es su nacionalidad?",
                    en = "WHAT'S YOUR NATIONALITY?",
                    phonetic = "guats yor nashonáliti"
                ),
                PhraseItem(
                    es = "¿De dónde es usted?",
                    en = "WHERE ARE YOU FROM?",
                    phonetic = "güer ar yu from"
                )
            )
        ),
        Lesson(
            lessonId = 203,
            lessonTitle = "Verificación y barreras idiomáticas",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Comprobar",
                    en = "CHECK",
                    phonetic = "chek"
                ),
                VocabularyItem(
                    es = "Caducado",
                    en = "EXPIRED",
                    phonetic = "ikspáiad"
                ),
                VocabularyItem(
                    es = "Perdido",
                    en = "LOST",
                    phonetic = "lost"
                ),
                VocabularyItem(
                    es = "Intérprete",
                    en = "INTERPRETER",
                    phonetic = "intérpriter"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Necesito comprobar sus datos.",
                    en = "I NEED TO CHECK YOUR DETAILS.",
                    phonetic = "ai nid tu chek yor ditéils"
                ),
                PhraseItem(
                    es = "Un momento, por favor.",
                    en = "ONE MOMENT, PLEASE.",
                    phonetic = "güan móument, plis"
                ),
                PhraseItem(
                    es = "Su documento ha caducado.",
                    en = "YOUR DOCUMENT HAS EXPIRED.",
                    phonetic = "yor dókiument jas ikspáiad"
                ),
                PhraseItem(
                    es = "¿Ha perdido su documentación?",
                    en = "HAVE YOU LOST YOUR DOCUMENTS?",
                    phonetic = "jav yu lost yor dókiuments"
                ),
                PhraseItem(
                    es = "¿Necesita un intérprete?",
                    en = "DO YOU NEED AN INTERPRETER?",
                    phonetic = "du yu nid an intérpriter"
                ),
                PhraseItem(
                    es = "¿Habla usted inglés?",
                    en = "DO YOU SPEAK ENGLISH?",
                    phonetic = "du yu spik ínglish"
                )
            )
        )
    )
)

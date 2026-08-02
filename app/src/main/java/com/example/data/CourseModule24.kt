package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module24 = Module(
    moduleId = 24,
    moduleName = "Módulo 24: Vocabulario transversal",
    lessons = listOf(
        Lesson(
            lessonId = 2401,
            lessonTitle = "Números, horas y fechas",
            vocabulary = listOf(
                VocabularyItem(es = "Uno", en = "ONE", phonetic = "güan"),
                VocabularyItem(es = "Dos", en = "TWO", phonetic = "tu"),
                VocabularyItem(es = "Tres", en = "THREE", phonetic = "zri"),
                VocabularyItem(es = "Diez", en = "TEN", phonetic = "ten"),
                VocabularyItem(es = "Veinte", en = "TWENTY", phonetic = "twénti"),
                VocabularyItem(es = "Cien", en = "ONE HUNDRED", phonetic = "güan já ndred"),
                VocabularyItem(es = "Hora", en = "HOUR", phonetic = "áuer"),
                VocabularyItem(es = "Minuto", en = "MINUTE", phonetic = "mínit"),
                VocabularyItem(es = "Hoy", en = "TODAY", phonetic = "tudéi"),
                VocabularyItem(es = "Ayer", en = "YESTERDAY", phonetic = "yésterdei"),
                VocabularyItem(es = "Mañana (día siguiente)", en = "TOMORROW", phonetic = "tumórou"),
                VocabularyItem(es = "Fecha", en = "DATE", phonetic = "déit"),
                VocabularyItem(es = "Semana", en = "WEEK", phonetic = "güik"),
                VocabularyItem(es = "Mes", en = "MONTH", phonetic = "manz"),
                VocabularyItem(es = "Qué / Cuál", en = "WHAT", phonetic = "guat"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Lo / El", en = "IT", phonetic = "it"),
                VocabularyItem(es = "Qué es", en = "WHAT'S", phonetic = "guats"),
                VocabularyItem(es = "De hoy", en = "TODAY'S", phonetic = "tudéis")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Qué hora es?",
                    en = "WHAT TIME IS IT?",
                    phonetic = "guat táim is it"
                ),
                PhraseItem(
                    es = "¿Cuál es la fecha de hoy?",
                    en = "WHAT'S TODAY'S DATE?",
                    phonetic = "guats tudéis déit"
                )
            )
        ),
        Lesson(
            lessonId = 2402,
            lessonTitle = "Direcciones, colores y posiciones",
            vocabulary = listOf(
                VocabularyItem(es = "Izquierda", en = "LEFT", phonetic = "left"),
                VocabularyItem(es = "Derecha", en = "RIGHT", phonetic = "ráit"),
                VocabularyItem(es = "Recto", en = "STRAIGHT ON", phonetic = "stréit on"),
                VocabularyItem(es = "Norte", en = "NORTH", phonetic = "norz"),
                VocabularyItem(es = "Sur", en = "SOUTH", phonetic = "sauz"),
                VocabularyItem(es = "Rojo", en = "RED", phonetic = "red"),
                VocabularyItem(es = "Azul", en = "BLUE", phonetic = "blu"),
                VocabularyItem(es = "Negro", en = "BLACK", phonetic = "blak"),
                VocabularyItem(es = "Blanco", en = "WHITE", phonetic = "güáit"),
                VocabularyItem(es = "Delante", en = "IN FRONT", phonetic = "in front"),
                VocabularyItem(es = "Detrás", en = "BEHIND", phonetic = "bijáind"),
                VocabularyItem(es = "Girar", en = "TURN", phonetic = "tern"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Es (It is)", en = "IT'S", phonetic = "its"),
                VocabularyItem(es = "Recto", en = "STRAIGHT", phonetic = "stréit"),
                VocabularyItem(es = "Adelante", en = "AHEAD", phonetic = "ajéd")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Gire a la izquierda aquí.",
                    en = "TURN LEFT HERE.",
                    phonetic = "tern left jía"
                ),
                PhraseItem(
                    es = "Está todo recto.",
                    en = "IT'S STRAIGHT AHEAD.",
                    phonetic = "its stréit ajéd"
                )
            )
        ),
        Lesson(
            lessonId = 2403,
            lessonTitle = "Países, familia, profesiones y objetos",
            vocabulary = listOf(
                VocabularyItem(es = "País", en = "COUNTRY", phonetic = "kántri"),
                VocabularyItem(es = "Nacionalidad", en = "NATIONALITY", phonetic = "nashonáliti"),
                VocabularyItem(es = "Esposo/a", en = "SPOUSE", phonetic = "spáus"),
                VocabularyItem(es = "Hijo/a", en = "CHILD", phonetic = "cháild"),
                VocabularyItem(es = "Padre", en = "FATHER", phonetic = "fáder"),
                VocabularyItem(es = "Madre", en = "MOTHER", phonetic = "máder"),
                VocabularyItem(es = "Trabajo", en = "JOB", phonetic = "yob"),
                VocabularyItem(es = "Documento", en = "DOCUMENT", phonetic = "dókiument"),
                VocabularyItem(es = "Llave", en = "KEY", phonetic = "ki"),
                VocabularyItem(es = "Dinero", en = "MONEY", phonetic = "máni"),
                VocabularyItem(es = "Edificio", en = "BUILDING", phonetic = "bílding"),
                VocabularyItem(es = "Qué / Cuál", en = "WHAT", phonetic = "guat"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "De / Desde", en = "FROM", phonetic = "from"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Persona", en = "PERSON", phonetic = "pörson"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Familiar", en = "RELATIVE", phonetic = "rélativ"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Tuyo / Suyo", en = "YOURS", phonetic = "yors")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿De qué país es usted?",
                    en = "WHAT COUNTRY ARE YOU FROM?",
                    phonetic = "guat kántri ar yu from"
                ),
                PhraseItem(
                    es = "¿Es esta persona familiar suya?",
                    en = "IS THIS PERSON A RELATIVE OF YOURS?",
                    phonetic = "is dis pörson a rélativ ov yors"
                )
            )
        )
    )
)
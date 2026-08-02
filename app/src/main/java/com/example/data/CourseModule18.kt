package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module18 = Module(
    moduleId = 18,
    moduleName = "Módulo 18: Incendios y evacuaciones",
    lessons = listOf(
        Lesson(
            lessonId = 1801,
            lessonTitle = "Detección y localización del incendio",
            vocabulary = listOf(
                VocabularyItem(es = "Incendio", en = "FIRE", phonetic = "fáiar"),
                VocabularyItem(es = "Humo", en = "SMOKE", phonetic = "smóuk"),
                VocabularyItem(es = "Llamas", en = "FLAMES", phonetic = "fléims"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Hay (existencial)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Mucho / Lote", en = "LOT", phonetic = "lot"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Ver", en = "SEE", phonetic = "si"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Llamar", en = "CALL", phonetic = "col"),
                VocabularyItem(es = "Bomberos", en = "FIRE BRIGADE", phonetic = "fáiar brigéid"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Mantener / Permanecer", en = "STAY", phonetic = "stéi"),
                VocabularyItem(es = "Bajo / Agachado", en = "LOW", phonetic = "lóu"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Evitar", en = "AVOID", phonetic = "avóid"),
                VocabularyItem(es = "Hacer (auxiliar negativo)", en = "DO NOT", phonetic = "du not"),
                VocabularyItem(es = "Usar", en = "USE", phonetic = "iús"),
                VocabularyItem(es = "Ascensor", en = "LIFT", phonetic = "lift")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Dónde está el incendio?",
                    en = "WHERE IS THE FIRE?",
                    phonetic = "güer is de fáiar"
                ),
                PhraseItem(
                    es = "¿Hay mucho humo?",
                    en = "IS THERE A LOT OF SMOKE?",
                    phonetic = "is der a lot ov smóuk"
                ),
                PhraseItem(
                    es = "¿Puede ver llamas?",
                    en = "CAN YOU SEE ANY FLAMES?",
                    phonetic = "can yu si éni fléims"
                ),
                PhraseItem(
                    es = "Llame a los bomberos ahora.",
                    en = "CALL THE FIRE BRIGADE NOW.",
                    phonetic = "col de fáiar brigéid nau"
                ),
                PhraseItem(
                    es = "Manténgase agachado para evitar el humo.",
                    en = "STAY LOW TO AVOID THE SMOKE.",
                    phonetic = "stéi lóu tu avóid de smóuk"
                ),
                PhraseItem(
                    es = "No use el ascensor.",
                    en = "DO NOT USE THE LIFT.",
                    phonetic = "du not iús de lift"
                )
            )
        ),
        Lesson(
            lessonId = 1802,
            lessonTitle = "Personas atrapadas y bomberos",
            vocabulary = listOf(
                VocabularyItem(es = "Atrapado", en = "TRAPPED", phonetic = "trapt"),
                VocabularyItem(es = "Bomberos", en = "FIRE BRIGADE", phonetic = "fáiar brigéid"),
                VocabularyItem(es = "Rescate", en = "RESCUE", phonetic = "réskiu"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Alguien", en = "ANYONE", phonetic = "éniuan"),
                VocabularyItem(es = "Dentro", en = "INSIDE", phonetic = "insáid"),
                VocabularyItem(es = "Cuántos / Cuántas", en = "HOW MUCH / HOW MANY", phonetic = "jau méni"),
                VocabularyItem(es = "Gente / Personas", en = "PEOPLE", phonetic = "pípol"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "En", en = "ON", phonetic = "on"),
                VocabularyItem(es = "Su (de ello)", en = "ITS", phonetic = "its"),
                VocabularyItem(es = "Camino", en = "WAY", phonetic = "güéi"),
                VocabularyItem(es = "Permanecer / Quedarse", en = "STAY", phonetic = "stéi"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Ayuda", en = "HELP", phonetic = "jelp"),
                VocabularyItem(es = "Viniendo", en = "COMING", phonetic = "cáming"),
                VocabularyItem(es = "Hacer (auxiliar negativo)", en = "DO NOT", phonetic = "du not"),
                VocabularyItem(es = "Ir", en = "GO", phonetic = "gou"),
                VocabularyItem(es = "Atrás / De vuelta", en = "BACK", phonetic = "bak"),
                VocabularyItem(es = "Nosotros", en = "WE", phonetic = "güi"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Pronto", en = "SOON", phonetic = "sun")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Hay alguien atrapado dentro?",
                    en = "IS ANYONE TRAPPED INSIDE?",
                    phonetic = "is éniuan trapt insáid"
                ),
                PhraseItem(
                    es = "¿Cuántas personas hay dentro?",
                    en = "HOW MANY PEOPLE ARE INSIDE?",
                    phonetic = "jau méni pípol ar insáid"
                ),
                PhraseItem(
                    es = "Los bomberos están en camino.",
                    en = "THE FIRE BRIGADE IS ON ITS WAY.",
                    phonetic = "de fáiar brigéid is on its güéi"
                ),
                PhraseItem(
                    es = "Quédese donde está, la ayuda llega.",
                    en = "STAY WHERE YOU ARE, HELP IS COMING.",
                    phonetic = "stéi güer yu ar, jelp is cáming"
                ),
                PhraseItem(
                    es = "No vuelva a entrar.",
                    en = "DO NOT GO BACK INSIDE.",
                    phonetic = "du not gou bak insáid"
                ),
                PhraseItem(
                    es = "Le rescataremos pronto.",
                    en = "WE WILL RESCUE YOU SOON.",
                    phonetic = "güi güil réskiu yu sun"
                )
            )
        ),
        Lesson(
            lessonId = 1803,
            lessonTitle = "Evacuación y perímetro de seguridad",
            vocabulary = listOf(
                VocabularyItem(es = "Evacuación", en = "EVACUATION", phonetic = "ivakiuéishon"),
                VocabularyItem(es = "Salida de emergencia", en = "EMERGENCY EXIT", phonetic = "imöryensi égsit"),
                VocabularyItem(es = "Perímetro", en = "PERIMETER", phonetic = "perímeter"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Edificio", en = "BUILDING", phonetic = "bílding"),
                VocabularyItem(es = "Debe / Tener que", en = "MUST", phonetic = "mast"),
                VocabularyItem(es = "Ser / Estar (auxiliar pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Evacuado", en = "EVACUATED", phonetic = "ivakiuéited"),
                VocabularyItem(es = "Usar", en = "USE", phonetic = "iús"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "di"),
                VocabularyItem(es = "Moverse", en = "MOVE", phonetic = "muv"),
                VocabularyItem(es = "Fuera / Lejos", en = "AWAY", phonetic = "aguéi"),
                VocabularyItem(es = "De / Desde", en = "FROM", phonetic = "from"),
                VocabularyItem(es = "Reunirse", en = "GATHER", phonetic = "gáder"),
                VocabularyItem(es = "En", en = "AT", phonetic = "at"),
                VocabularyItem(es = "Punto", en = "POINT", phonetic = "póint"),
                VocabularyItem(es = "Hacer (auxiliar negativo)", en = "DO NOT", phonetic = "du not"),
                VocabularyItem(es = "Cruzar", en = "CROSS", phonetic = "cros"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Todo el mundo / Todos", en = "EVERYONE", phonetic = "évriuan"),
                VocabularyItem(es = "Contabilizado / Localizado", en = "ACCOUNTED", phonetic = "akáunted"),
                VocabularyItem(es = "Para", en = "FOR", phonetic = "for")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Este edificio debe ser evacuado.",
                    en = "THIS BUILDING MUST BE EVACUATED.",
                    phonetic = "dis bílding mast bi ivakiuéited"
                ),
                PhraseItem(
                    es = "Use la salida de emergencia.",
                    en = "USE THE EMERGENCY EXIT.",
                    phonetic = "iús di imöryensi égsit"
                ),
                PhraseItem(
                    es = "Aléjese del edificio.",
                    en = "MOVE AWAY FROM THE BUILDING.",
                    phonetic = "muv aguéi from de bílding"
                ),
                PhraseItem(
                    es = "Reúnase en el punto de encuentro.",
                    en = "GATHER AT THE MEETING POINT.",
                    phonetic = "gáder at de míting póint"
                ),
                PhraseItem(
                    es = "No cruce este perímetro.",
                    en = "DO NOT CROSS THIS PERIMETER.",
                    phonetic = "du not cros dis perímeter"
                ),
                PhraseItem(
                    es = "¿Están todos localizados?",
                    en = "IS EVERYONE ACCOUNTED FOR?",
                    phonetic = "is évriuan akáunted for"
                )
            )
        )
    )
)
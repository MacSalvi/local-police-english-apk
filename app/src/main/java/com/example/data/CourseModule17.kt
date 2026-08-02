package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module17 = Module(
    moduleId = 17,
    moduleName = "Módulo 17: Primeros auxilios y anatomía",
    lessons = listOf(
        Lesson(
            lessonId = 1701,
            lessonTitle = "Partes del cuerpo y dolor",
            vocabulary = listOf(
                VocabularyItem(es = "Cabeza", en = "HEAD", phonetic = "jed"),
                VocabularyItem(es = "Pecho", en = "CHEST", phonetic = "chest"),
                VocabularyItem(es = "Brazo", en = "ARM", phonetic = "arm"),
                VocabularyItem(es = "Pierna", en = "LEG", phonetic = "leg"),
                VocabularyItem(es = "Espalda", en = "BACK", phonetic = "bak"),
                VocabularyItem(es = "Estómago", en = "STOMACH", phonetic = "stómak"),
                VocabularyItem(es = "Dolor", en = "PAIN", phonetic = "péin"),
                VocabularyItem(es = "Cuello", en = "NECK", phonetic = "nek"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DOES", phonetic = "das"),
                VocabularyItem(es = "Lo / El", en = "IT", phonetic = "it"),
                VocabularyItem(es = "Doler", en = "HURT", phonetic = "hört"),
                VocabularyItem(es = "Mostrar", en = "SHOW", phonetic = "shou"),
                VocabularyItem(es = "Me", en = "ME", phonetic = "mi"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Dónde le duele?",
                    en = "WHERE DOES IT HURT?",
                    phonetic = "güer das it hört"
                ),
                PhraseItem(
                    es = "Muéstreme dónde está el dolor.",
                    en = "SHOW ME WHERE THE PAIN IS.",
                    phonetic = "shou mi güer de péin is"
                )
            )
        ),
        Lesson(
            lessonId = 1702,
            lessonTitle = "Heridas, sangrado y fracturas",
            vocabulary = listOf(
                VocabularyItem(es = "Herida", en = "WOUND", phonetic = "wund"),
                VocabularyItem(es = "Sangre", en = "BLOOD", phonetic = "blad"),
                VocabularyItem(es = "Fractura", en = "FRACTURE", phonetic = "frákcher"),
                VocabularyItem(es = "Hematoma", en = "BRUISE", phonetic = "brus"),
                VocabularyItem(es = "Quemadura", en = "BURN", phonetic = "börn"),
                VocabularyItem(es = "Vendaje", en = "BANDAGE", phonetic = "bándich"),
                VocabularyItem(es = "Hueso", en = "BONE", phonetic = "bóun"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Profundo", en = "DEEP", phonetic = "dip"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Sangrando", en = "BLEEDING", phonetic = "blíding"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Pensar / Creer", en = "THINK", phonetic = "zink"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Roto", en = "BROKEN", phonetic = "bróuken"),
                VocabularyItem(es = "Hacer (auxiliar negativo)", en = "DON'T", phonetic = "dont"),
                VocabularyItem(es = "Mover", en = "MOVE", phonetic = "muv"),
                VocabularyItem(es = "Brazo / Pierna", en = "ARM / LEG", phonetic = "arm/leg"),
                VocabularyItem(es = "Nosotros", en = "WE", phonetic = "güi"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Aplicar", en = "APPLY", phonetic = "aplái"),
                VocabularyItem(es = "Presión", en = "PRESSURE", phonetic = "présher"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Tiene una herida profunda.",
                    en = "YOU HAVE A DEEP WOUND.",
                    phonetic = "yu jav a dip wund"
                ),
                PhraseItem(
                    es = "¿Está sangrando?",
                    en = "ARE YOU BLEEDING?",
                    phonetic = "ar yu blíding"
                ),
                PhraseItem(
                    es = "Creo que este hueso está roto.",
                    en = "I THINK THIS BONE IS BROKEN.",
                    phonetic = "ai zink dis bóun is bróuken"
                ),
                PhraseItem(
                    es = "No mueva este brazo/pierna.",
                    en = "DON'T MOVE THIS ARM/LEG.",
                    phonetic = "dont muv dis arm/leg"
                ),
                PhraseItem(
                    es = "Necesitamos aplicar presión aquí.",
                    en = "WE NEED TO APPLY PRESSURE HERE.",
                    phonetic = "güi nid tu aplái présher jía"
                )
            )
        ),
        Lesson(
            lessonId = 1703,
            lessonTitle = "Emergencias vitales",
            vocabulary = listOf(
                VocabularyItem(es = "Respiración", en = "BREATHING", phonetic = "bríding"),
                VocabularyItem(es = "Inconsciente", en = "UNCONSCIOUS", phonetic = "ankónshos"),
                VocabularyItem(es = "Convulsión", en = "SEIZURE", phonetic = "síller"),
                VocabularyItem(es = "Alergia", en = "ALLERGY", phonetic = "álöryi"),
                VocabularyItem(es = "Ambulancia", en = "AMBULANCE", phonetic = "ámbiulans"),
                VocabularyItem(es = "Medicación", en = "MEDICATION", phonetic = "medikéishon"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Teniendo", en = "HAVING", phonetic = "jáving"),
                VocabularyItem(es = "Dificultad", en = "DIFFICULTY", phonetic = "dífikölti"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Hay (existencial)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Dolor", en = "PAIN", phonetic = "péin"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Pecho", en = "CHEST", phonetic = "chest"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Alergias (plural)", en = "ALLERGIES", phonetic = "álöryis"),
                VocabularyItem(es = "Permanecer / Quedarse", en = "STAY", phonetic = "stéi"),
                VocabularyItem(es = "Con", en = "WITH", phonetic = "güiz"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Despierto", en = "AWAKE", phonetic = "aguéik"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "di"),
                VocabularyItem(es = "En", en = "ON", phonetic = "on"),
                VocabularyItem(es = "Su (de ello)", en = "ITS", phonetic = "its"),
                VocabularyItem(es = "Camino", en = "WAY", phonetic = "güéi"),
                VocabularyItem(es = "Tomar", en = "TAKE", phonetic = "téik"),
                VocabularyItem(es = "Habitual / Regular", en = "REGULAR", phonetic = "régiular")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Tiene dificultad para respirar?",
                    en = "ARE YOU HAVING DIFFICULTY BREATHING?",
                    phonetic = "ar yu jáving dífikölti bríding"
                ),
                PhraseItem(
                    es = "¿Siente dolor en el pecho?",
                    en = "IS THERE PAIN IN YOUR CHEST?",
                    phonetic = "is der péin in yor chest"
                ),
                PhraseItem(
                    es = "¿Tiene alguna alergia?",
                    en = "DO YOU HAVE ANY ALLERGIES?",
                    phonetic = "du yu jav éni álöryis"
                ),
                PhraseItem(
                    es = "Quédese conmigo, no se duerma.",
                    en = "STAY WITH ME, STAY AWAKE.",
                    phonetic = "stéi güiz mi, stéi aguéik"
                ),
                PhraseItem(
                    es = "La ambulancia está en camino.",
                    en = "THE AMBULANCE IS ON ITS WAY.",
                    phonetic = "di ámbiulans is on its güéi"
                ),
                PhraseItem(
                    es = "¿Toma alguna medicación habitual?",
                    en = "DO YOU TAKE ANY REGULAR MEDICATION?",
                    phonetic = "du yu téik éni régiular medikéishon"
                )
            )
        )
    )
)
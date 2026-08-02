package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module20 = Module(
    moduleId = 20,
    moduleName = "Módulo 20: Menores y personas desaparecidas",
    lessons = listOf(
        Lesson(
            lessonId = 2001,
            lessonTitle = "Datos personales y último lugar visto",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Menor",
                    en = "MINOR",
                    phonetic = "máinor"
                ),
                VocabularyItem(
                    es = "Último lugar visto",
                    en = "LAST SEEN",
                    phonetic = "last sin"
                ),
                VocabularyItem(
                    es = "Descripción",
                    en = "DESCRIPTION",
                    phonetic = "diskrípshon"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Cuál es el nombre del menor?",
                    en = "WHAT IS THE CHILD'S NAME?",
                    phonetic = "guat is de cháilds néim"
                ),
                PhraseItem(
                    es = "¿Qué edad tiene el menor?",
                    en = "HOW OLD IS THE CHILD?",
                    phonetic = "jau old is de cháild"
                ),
                PhraseItem(
                    es = "¿Dónde se le vio por última vez?",
                    en = "WHERE WERE THEY LAST SEEN?",
                    phonetic = "güer wör déi last sin"
                ),
                PhraseItem(
                    es = "¿A qué hora notó que faltaba?",
                    en = "WHAT TIME DID YOU NOTICE THEY WERE MISSING?",
                    phonetic = "guat táim did yu nóutis déi wör mísing"
                ),
                PhraseItem(
                    es = "¿Qué llevaba puesto el menor?",
                    en = "WHAT WAS THE CHILD WEARING?",
                    phonetic = "guat guas de cháild güéring"
                ),
                PhraseItem(
                    es = "¿Tiene una fotografía reciente?",
                    en = "DO YOU HAVE A RECENT PHOTOGRAPH?",
                    phonetic = "du yu jav a rísent fóutograf"
                )
            )
        ),
        Lesson(
            lessonId = 2002,
            lessonTitle = "Familiares, hotel y lugares frecuentes",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Familiar",
                    en = "RELATIVE",
                    phonetic = "rélativ"
                ),
                VocabularyItem(
                    es = "Alojamiento",
                    en = "ACCOMMODATION",
                    phonetic = "akomodéishon"
                ),
                VocabularyItem(
                    es = "Lugar frecuente",
                    en = "REGULAR PLACE",
                    phonetic = "régiular pléis"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Dónde se aloja?",
                    en = "WHERE ARE YOU STAYING?",
                    phonetic = "güer ar yu stéiing"
                ),
                PhraseItem(
                    es = "¿Es este su único hijo con usted?",
                    en = "IS THIS YOUR ONLY CHILD WITH YOU?",
                    phonetic = "is dis yor óunli cháild güiz yu"
                ),
                PhraseItem(
                    es = "¿Tiene móvil el menor?",
                    en = "DOES THE CHILD HAVE A PHONE?",
                    phonetic = "das de cháild jav a fóun"
                ),
                PhraseItem(
                    es = "¿Hay lugares que suele frecuentar?",
                    en = "ARE THERE ANY PLACES THEY LIKE TO VISIT?",
                    phonetic = "ar der éni pléises déi láik tu vísit"
                ),
                PhraseItem(
                    es = "¿Hay algún familiar cerca?",
                    en = "IS THERE A FAMILY MEMBER NEARBY?",
                    phonetic = "is der a fámili mémber nírbai"
                ),
                PhraseItem(
                    es = "Le contactaremos de inmediato.",
                    en = "WE WILL CONTACT YOU IMMEDIATELY.",
                    phonetic = "güi güil kóntakt yu imídietli"
                )
            )
        ),
        Lesson(
            lessonId = 2003,
            lessonTitle = "Menor encontrado y entrega segura",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Encontrado",
                    en = "FOUND",
                    phonetic = "fáund"
                ),
                VocabularyItem(
                    es = "Responsable",
                    en = "GUARDIAN",
                    phonetic = "gárdian"
                ),
                VocabularyItem(
                    es = "Entrega",
                    en = "HANDOVER",
                    phonetic = "jándóuver"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Hemos encontrado a su hijo.",
                    en = "WE HAVE FOUND YOUR CHILD.",
                    phonetic = "güi jav fáund yor cháild"
                ),
                PhraseItem(
                    es = "Está a salvo y bien.",
                    en = "THEY ARE SAFE AND WELL.",
                    phonetic = "déi ar séif and güel"
                ),
                PhraseItem(
                    es = "¿Puede confirmar que es el padre/tutor?",
                    en = "CAN YOU CONFIRM YOU ARE THE PARENT/GUARDIAN?",
                    phonetic = "can yu konfírm yu ar de pérent/gárdian"
                ),
                PhraseItem(
                    es = "Muéstreme su identificación, por favor.",
                    en = "PLEASE SHOW ME YOUR IDENTIFICATION.",
                    phonetic = "plís shou mi yor aidentifikéishon"
                ),
                PhraseItem(
                    es = "Necesitamos registrar esta entrega.",
                    en = "WE NEED TO NOTE THIS HANDOVER.",
                    phonetic = "güi nid tu nóut dis jándóuver"
                ),
                PhraseItem(
                    es = "Firme aquí para confirmar.",
                    en = "SIGN HERE TO CONFIRM.",
                    phonetic = "sáin jía tu konfírm"
                )
            )
        )
    )
)
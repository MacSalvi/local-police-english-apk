package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module1 = Module(
    moduleId = 1,
    moduleName = "Módulo 1: Comunicación policial básica",
    lessons = listOf(
        Lesson(
            lessonId = 101,
            lessonTitle = "Primer contacto",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Policía Local",
                    en = "LOCAL POLICE",
                    phonetic = "lóukal polís"
                ),
                VocabularyItem(
                    es = "Agente",
                    en = "OFFICER",
                    phonetic = "ófisa"
                ),
                VocabularyItem(
                    es = "Atención",
                    en = "ATTENTION",
                    phonetic = "aténshon"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Buenos días, señor/señora.",
                    en = "GOOD MORNING, SIR/MADAM.",
                    phonetic = "gud mórning, ser/mádam"
                ),
                PhraseItem(
                    es = "Buenas tardes.",
                    en = "GOOD AFTERNOON.",
                    phonetic = "gud afternún"
                ),
                PhraseItem(
                    es = "Soy agente de la Policía Local.",
                    en = "I'M A LOCAL POLICE OFFICER.",
                    phonetic = "aim a lóukal polís ófisa"
                ),
                PhraseItem(
                    es = "Policía Local de Marbella.",
                    en = "MARBELLA LOCAL POLICE.",
                    phonetic = "marbéya lóukal polís"
                ),
                PhraseItem(
                    es = "Disculpe, señor.",
                    en = "EXCUSE ME, SIR.",
                    phonetic = "exkiús mi, ser"
                ),
                PhraseItem(
                    es = "¿Puede prestarme atención, por favor?",
                    en = "CAN I HAVE YOUR ATTENTION, PLEASE?",
                    phonetic = "can ai jav yor aténshon, plis"
                )
            )
        ),
        Lesson(
            lessonId = 102,
            lessonTitle = "Control de la situación",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Calma",
                    en = "CALM",
                    phonetic = "carm"
                ),
                VocabularyItem(
                    es = "Esperar",
                    en = "WAIT",
                    phonetic = "güéit"
                ),
                VocabularyItem(
                    es = "Entender",
                    en = "UNDERSTAND",
                    phonetic = "anderstán"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Por favor, mantenga la calma.",
                    en = "PLEASE STAY CALM.",
                    phonetic = "plís stéi carm"
                ),
                PhraseItem(
                    es = "No hay motivo de preocupación.",
                    en = "THERE'S NO NEED TO WORRY.",
                    phonetic = "ders no nid tu güóri"
                ),
                PhraseItem(
                    es = "Por favor, espere aquí.",
                    en = "PLEASE WAIT HERE.",
                    phonetic = "plís güéit jía"
                ),
                PhraseItem(
                    es = "Por favor, espere un momento.",
                    en = "PLEASE WAIT A MOMENT.",
                    phonetic = "plís güéit a móument"
                ),
                PhraseItem(
                    es = "¿Entiende?",
                    en = "DO YOU UNDERSTAND?",
                    phonetic = "du yu anderstán"
                ),
                PhraseItem(
                    es = "¿Queda claro?",
                    en = "IS THAT CLEAR?",
                    phonetic = "is dat clíar"
                )
            )
        ),
        Lesson(
            lessonId = 103,
            lessonTitle = "Cierre de la intervención",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Cooperar",
                    en = "COOPERATE",
                    phonetic = "kouópereit"
                ),
                VocabularyItem(
                    es = "Instrucción",
                    en = "INSTRUCTION",
                    phonetic = "inströkshon"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Necesito su cooperación, por favor.",
                    en = "I NEED YOUR COOPERATION, PLEASE.",
                    phonetic = "ai nid yor kouoperéishon, plis"
                ),
                PhraseItem(
                    es = "Por favor, siga mis instrucciones.",
                    en = "PLEASE FOLLOW MY INSTRUCTIONS.",
                    phonetic = "plís fólou mai inströkshons"
                ),
                PhraseItem(
                    es = "Venga conmigo, por favor.",
                    en = "COME WITH ME, PLEASE.",
                    phonetic = "cam güiz mi, plis"
                ),
                PhraseItem(
                    es = "Colóquese aquí, por favor.",
                    en = "STAND HERE, PLEASE.",
                    phonetic = "stand jía, plis"
                ),
                PhraseItem(
                    es = "Gracias por su cooperación.",
                    en = "THANK YOU FOR YOUR COOPERATION.",
                    phonetic = "zenk yu for yor kouoperéishon"
                ),
                PhraseItem(
                    es = "Que tenga un buen día.",
                    en = "HAVE A GOOD DAY.",
                    phonetic = "jav a gud déi"
                )
            )
        )
    )
)

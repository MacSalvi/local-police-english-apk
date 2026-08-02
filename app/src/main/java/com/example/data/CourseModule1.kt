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
            lessonTitle = "Primer contacto y presentación",
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
                ),
                VocabularyItem(
                    es = "Señor",
                    en = "SIR",
                    phonetic = "ser"
                ),
                VocabularyItem(
                    es = "Señora",
                    en = "MADAM",
                    phonetic = "mádam"
                ),
                VocabularyItem(
                    es = "Identificación",
                    en = "IDENTIFICATION",
                    phonetic = "ayadantifiquéishon"
                ),
                VocabularyItem(
                    es = "Bueno / Buen",
                    en = "GOOD",
                    phonetic = "gud"
                ),
                VocabularyItem(
                    es = "Mañana",
                    en = "MORNING",
                    phonetic = "mórning"
                ),
                VocabularyItem(
                    es = "Tarde",
                    en = "AFTERNOON",
                    phonetic = "afternún"
                ),
                VocabularyItem(
                    es = "Disculpar",
                    en = "EXCUSE",
                    phonetic = "exkiús"
                ),
                VocabularyItem(
                    es = "Poder (capacidad)",
                    en = "CAN",
                    phonetic = "can"
                ),
                VocabularyItem(
                    es = "Tener",
                    en = "HAVE",
                    phonetic = "jav"
                ),
                VocabularyItem(
                    es = "Por favor",
                    en = "PLEASE",
                    phonetic = "plís"
                ),
                VocabularyItem(
                    es = "Este / Esta",
                    en = "THIS",
                    phonetic = "dis"
                ),
                VocabularyItem(
                    es = "Oficial",
                    en = "OFFICIAL",
                    phonetic = "ofíshal"
                ),
                VocabularyItem(
                    es = "Pedir / Rogar",
                    en = "ASK",
                    phonetic = "ask"
                ),
                VocabularyItem(
                    es = "Escuchar",
                    en = "LISTEN",
                    phonetic = "lísen"
                ),
                VocabularyItem(
                    es = "Instrucción",
                    en = "INSTRUCTION",
                    phonetic = "inströkshon"
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
                ),
                PhraseItem(
                    es = "Esta es mi identificación oficial como agente.",
                    en = "THIS IS MY OFFICIAL OFFICER IDENTIFICATION.",
                    phonetic = "dis is mai ofíshal ófisa ayadantifiquéishon"
                ),
                PhraseItem(
                    es = "Le ruego que escuche mis indicaciones.",
                    en = "I ASK YOU TO LISTEN TO MY INSTRUCTIONS.",
                    phonetic = "ai ask yu tu lísen tu mai inströkshons"
                )
            )
        ),
        Lesson(
            lessonId = 102,
            lessonTitle = "Control de la situación y calma",
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
                ),
                VocabularyItem(
                    es = "Momento",
                    en = "MOMENT",
                    phonetic = "móument"
                ),
                VocabularyItem(
                    es = "Claro",
                    en = "CLEAR",
                    phonetic = "clíar"
                ),
                VocabularyItem(
                    es = "Preocupación / Preocuparse",
                    en = "WORRY",
                    phonetic = "güóri"
                ),
                VocabularyItem(
                    es = "Mantener / Permanecer",
                    en = "STAY",
                    phonetic = "stéi"
                ),
                VocabularyItem(
                    es = "Necesidad / Necesitar",
                    en = "NEED",
                    phonetic = "nid"
                ),
                VocabularyItem(
                    es = "Aquí",
                    en = "HERE",
                    phonetic = "jía"
                ),
                VocabularyItem(
                    es = "Muy",
                    en = "VERY",
                    phonetic = "véri"
                ),
                VocabularyItem(
                    es = "Importante",
                    en = "IMPORTANT",
                    phonetic = "ímportant"
                ),
                VocabularyItem(
                    es = "Tiempo / Vez",
                    en = "TIME",
                    phonetic = "táim"
                ),
                VocabularyItem(
                    es = "Derecho / Justo",
                    en = "RIGHT",
                    phonetic = "ráit"
                ),
                VocabularyItem(
                    es = "Lugar / Sitio",
                    en = "PLACE",
                    phonetic = "pléis"
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
                ),
                PhraseItem(
                    es = "Es muy importante que mantenga la calma en todo momento.",
                    en = "IT IS VERY IMPORTANT THAT YOU STAY CALM AT ALL TIMES.",
                    phonetic = "it is véri ímportant dat yu stéi carm at ol táims"
                ),
                PhraseItem(
                    es = "Espere en este mismo sitio, por favor.",
                    en = "PLEASE WAIT RIGHT IN THIS PLACE.",
                    phonetic = "plís güéit ráit in dis pléis"
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
                ),
                VocabularyItem(
                    es = "Venir",
                    en = "COME",
                    phonetic = "cam"
                ),
                VocabularyItem(
                    es = "Estar de pie / Colocarse",
                    en = "STAND",
                    phonetic = "stand"
                ),
                VocabularyItem(
                    es = "Gracias",
                    en = "THANK YOU",
                    phonetic = "zenk yu"
                ),
                VocabularyItem(
                    es = "Día",
                    en = "DAY",
                    phonetic = "déi"
                ),
                VocabularyItem(
                    es = "Seguir",
                    en = "FOLLOW",
                    phonetic = "fólou"
                ),
                VocabularyItem(
                    es = "Con",
                    en = "WITH",
                    phonetic = "güiz"
                ),
                VocabularyItem(
                    es = "Necesario",
                    en = "NECESSARY",
                    phonetic = "nésesari"
                ),
                VocabularyItem(
                    es = "Terminar / Finalizar",
                    en = "FINISH",
                    phonetic = "fínish"
                ),
                VocabularyItem(
                    es = "Acción",
                    en = "ACTION",
                    phonetic = "ácshon"
                ),
                VocabularyItem(
                    es = "Mucho",
                    en = "MUCH",
                    phonetic = "macer"
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
                ),
                PhraseItem(
                    es = "Su colaboración es necesaria para finalizar.",
                    en = "YOUR COOPERATION IS NECESSARY TO FINISH.",
                    phonetic = "yor kouoperéishon is nésesari tu fínish"
                ),
                PhraseItem(
                    es = "La actuación ha terminado. Muchas gracias.",
                    en = "THE ACTION HAS FINISHED. THANK YOU VERY MUCH.",
                    phonetic = "da ácshon has fínisht. zenk yu véri macer"
                )
            )
        )
    )
)
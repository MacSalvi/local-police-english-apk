package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module23 = Module(
    moduleId = 23,
    moduleName = "Módulo 23: Emisora y coordinación operativa",
    lessons = listOf(
        Lesson(
            lessonId = 2301,
            lessonTitle = "Identificación de indicativos y confirmación",
            vocabulary = listOf(
                VocabularyItem(es = "Indicativo", en = "CALL SIGN", phonetic = "col sáin"),
                VocabularyItem(es = "Confirmar", en = "CONFIRM", phonetic = "konfírm"),
                VocabularyItem(es = "Repetir", en = "REPEAT", phonetic = "ripít"),
                VocabularyItem(es = "Este / Aquí", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Unidad", en = "UNIT", phonetic = "iúnit"),
                VocabularyItem(es = "Dos", en = "TWO", phonetic = "tu"),
                VocabularyItem(es = "Uno", en = "ONE", phonetic = "güan"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Ubicación", en = "LOCATION", phonetic = "loukéishon"),
                VocabularyItem(es = "Copia / Recibido", en = "COPY", phonetic = "kópi"),
                VocabularyItem(es = "Ese / Eso", en = "THAT", phonetic = "dat"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plis"),
                VocabularyItem(es = "Decir", en = "SAY", phonetic = "séi"),
                VocabularyItem(es = "Otra vez / De nuevo", en = "AGAIN", phonetic = "aguén"),
                VocabularyItem(es = "Cambio", en = "OVER", phonetic = "óuver"),
                VocabularyItem(es = "Mensaje", en = "MESSAGE", phonetic = "mésich"),
                VocabularyItem(es = "Recibido", en = "RECEIVED", phonetic = "risívd")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Aquí unidad dos-uno.",
                    en = "THIS IS UNIT TWO-ONE.",
                    phonetic = "dis is iúnit tu-güan"
                ),
                PhraseItem(
                    es = "Confirme su ubicación.",
                    en = "CONFIRM YOUR LOCATION.",
                    phonetic = "konfírm yor loukéishon"
                ),
                PhraseItem(
                    es = "Recibido.",
                    en = "COPY THAT.",
                    phonetic = "kópi dat"
                ),
                PhraseItem(
                    es = "Repita, por favor.",
                    en = "REPEAT, PLEASE.",
                    phonetic = "ripít, plis"
                ),
                PhraseItem(
                    es = "Repita, cambio.",
                    en = "SAY AGAIN, OVER.",
                    phonetic = "séi aguén, óuver"
                ),
                PhraseItem(
                    es = "Mensaje recibido.",
                    en = "MESSAGE RECEIVED.",
                    phonetic = "mésich risívd"
                )
            )
        ),
        Lesson(
            lessonId = 2302,
            lessonTitle = "Posición, descripciones y matrículas",
            vocabulary = listOf(
                VocabularyItem(es = "Posición", en = "POSITION", phonetic = "posíshon"),
                VocabularyItem(es = "Matrícula", en = "REGISTRATION", phonetic = "reyistréishon"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Qué es", en = "WHAT'S", phonetic = "guats"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Actual", en = "CURRENT", phonetic = "kárrent"),
                VocabularyItem(es = "Sospechoso", en = "SUSPECT", phonetic = "sáspekt"),
                VocabularyItem(es = "Descripción", en = "DESCRIPTION", phonetic = "diskrípshon"),
                VocabularyItem(es = "Sigue / A continuación", en = "FOLLOWS", phonetic = "fólous"),
                VocabularyItem(es = "Número", en = "NUMBER", phonetic = "námber"),
                VocabularyItem(es = "Es", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Dirigiéndose", en = "HEADING", phonetic = "jéding"),
                VocabularyItem(es = "Norte / Dirección norte", en = "NORTHBOUND", phonetic = "nórzbaund"),
                VocabularyItem(es = "Solicito / Petición", en = "REQUEST", phonetic = "rikuést"),
                VocabularyItem(es = "Comprobación / Chequeo", en = "CHECK", phonetic = "chek"),
                VocabularyItem(es = "Permanecer", en = "STAND", phonetic = "stand"),
                VocabularyItem(es = "Por / Junto a", en = "BY", phonetic = "bái"),
                VocabularyItem(es = "Para", en = "FOR", phonetic = "for"),
                VocabularyItem(es = "Adicional / Más", en = "FURTHER", phonetic = "förder"),
                VocabularyItem(es = "Instrucciones", en = "INSTRUCTIONS", phonetic = "inströkshons")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Cuál es su posición actual?",
                    en = "WHAT'S YOUR CURRENT POSITION?",
                    phonetic = "guats yor kárrent posíshon"
                ),
                PhraseItem(
                    es = "A continuación, descripción del sospechoso.",
                    en = "SUSPECT DESCRIPTION FOLLOWS.",
                    phonetic = "sáspekt diskrípshon fólous"
                ),
                PhraseItem(
                    es = "El número de matrícula es...",
                    en = "REGISTRATION NUMBER IS...",
                    phonetic = "reyistréishon námber is"
                ),
                PhraseItem(
                    es = "Vehículo con dirección norte.",
                    en = "VEHICLE HEADING NORTHBOUND.",
                    phonetic = "víikol jéding nórzbaund"
                ),
                PhraseItem(
                    es = "Solicito comprobación de vehículo.",
                    en = "REQUEST VEHICLE CHECK.",
                    phonetic = "rikuést víikol chek"
                ),
                PhraseItem(
                    es = "Manténgase a la espera de instrucciones.",
                    en = "STAND BY FOR FURTHER INSTRUCTIONS.",
                    phonetic = "stand bái for förder inströkshons"
                )
            )
        ),
        Lesson(
            lessonId = 2303,
            lessonTitle = "Solicitud de apoyo y servicios",
            vocabulary = listOf(
                VocabularyItem(es = "Apoyo", en = "SUPPORT", phonetic = "sapórt"),
                VocabularyItem(es = "Bomberos", en = "FIRE BRIGADE", phonetic = "fáiar brigéid"),
                VocabularyItem(es = "Grúa", en = "TOW TRUCK", phonetic = "tóu trak"),
                VocabularyItem(es = "Solicitando", en = "REQUESTING", phonetic = "rikuésting"),
                VocabularyItem(es = "Refuerzo / Apoyo", en = "BACKUP", phonetic = "bákap"),
                VocabularyItem(es = "En / A", en = "AT", phonetic = "at"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Ubicación", en = "LOCATION", phonetic = "loukéishon"),
                VocabularyItem(es = "Solicitar", en = "REQUEST", phonetic = "rikuést"),
                VocabularyItem(es = "Ambulancia", en = "AMBULANCE", phonetic = "ámbiulans"),
                VocabularyItem(es = "Prioridad", en = "PRIORITY", phonetic = "praioriti"),
                VocabularyItem(es = "Uno", en = "ONE", phonetic = "güan"),
                VocabularyItem(es = "Asistencia", en = "ASSISTANCE", phonetic = "asístans"),
                VocabularyItem(es = "Para", en = "FOR", phonetic = "for"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Sospechoso", en = "SUSPECT", phonetic = "sáspekt"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Detenido", en = "DETAINED", phonetic = "ditéind"),
                VocabularyItem(es = "Todo / Todos", en = "ALL", phonetic = "ol"),
                VocabularyItem(es = "Unidades", en = "UNITS", phonetic = "iúnits"),
                VocabularyItem(es = "Ser / Estar", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Avisado / Informado", en = "ADVISED", phonetic = "advaisd")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Solicito apoyo en esta ubicación.",
                    en = "REQUESTING BACKUP AT THIS LOCATION.",
                    phonetic = "rikuésting bákap at dis loukéishon"
                ),
                PhraseItem(
                    es = "Solicito ambulancia, prioridad uno.",
                    en = "REQUEST AMBULANCE, PRIORITY ONE.",
                    phonetic = "rikuést ámbiulans, praioriti güan"
                ),
                PhraseItem(
                    es = "Solicito asistencia de bomberos.",
                    en = "REQUEST FIRE BRIGADE ASSISTANCE.",
                    phonetic = "rikuést fáiar brigéid asístans"
                ),
                PhraseItem(
                    es = "Solicito grúa para este vehículo.",
                    en = "REQUEST TOW TRUCK FOR THIS VEHICLE.",
                    phonetic = "rikuést tóu trak for dis víikol"
                ),
                PhraseItem(
                    es = "Sospechoso detenido.",
                    en = "SUSPECT IS DETAINED.",
                    phonetic = "sáspekt is ditéind"
                ),
                PhraseItem(
                    es = "Aviso para todas las unidades.",
                    en = "ALL UNITS BE ADVISED.",
                    phonetic = "ol iúnits bi advaisd"
                )
            )
        ),
        Lesson(
            lessonId = 2304,
            lessonTitle = "Traslado y finalización del servicio",
            vocabulary = listOf(
                VocabularyItem(es = "Traslado", en = "TRANSFER", phonetic = "tránsfer"),
                VocabularyItem(es = "Finalizar", en = "END", phonetic = "end"),
                VocabularyItem(es = "Servicio", en = "SHIFT", phonetic = "shift"),
                VocabularyItem(es = "Trasladando", en = "TRANSFERRING", phonetic = "transförring"),
                VocabularyItem(es = "Detenido", en = "DETAINEE", phonetic = "ditéini"),
                VocabularyItem(es = "A (dirección)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Comisaría / Estación", en = "STATION", phonetic = "stéishon"),
                VocabularyItem(es = "Llegando", en = "ARRIVING", phonetic = "arráiving"),
                VocabularyItem(es = "En / A", en = "AT", phonetic = "at"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Incidente", en = "INCIDENT", phonetic = "ínsident"),
                VocabularyItem(es = "Resuelto", en = "RESOLVED", phonetic = "risólvd"),
                VocabularyItem(es = "No / Ninguno", en = "NO", phonetic = "nóu"),
                VocabularyItem(es = "Adicional / Más", en = "FURTHER", phonetic = "förder"),
                VocabularyItem(es = "Acción", en = "ACTION", phonetic = "ákshon"),
                VocabularyItem(es = "Necesario", en = "NEEDED", phonetic = "níded"),
                VocabularyItem(es = "Finalizando", en = "ENDING", phonetic = "énding"),
                VocabularyItem(es = "Todos / Todas", en = "ALL", phonetic = "ol"),
                VocabularyItem(es = "Unidades", en = "UNITS", phonetic = "iúnits"),
                VocabularyItem(es = "Contabilizado / Localizado", en = "ACCOUNTED", phonetic = "akáunted"),
                VocabularyItem(es = "Para", en = "FOR", phonetic = "for")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Trasladando al detenido a comisaría.",
                    en = "TRANSFERRING DETAINEE TO THE STATION.",
                    phonetic = "transförring ditéini tu de stéishon"
                ),
                PhraseItem(
                    es = "Llegando a comisaría ahora.",
                    en = "ARRIVING AT THE STATION NOW.",
                    phonetic = "arráiving at de stéishon nau"
                ),
                PhraseItem(
                    es = "Incidente resuelto, sin más actuación necesaria.",
                    en = "INCIDENT RESOLVED, NO FURTHER ACTION NEEDED.",
                    phonetic = "ínsident risólvd, nóu förder ákshon níded"
                ),
                PhraseItem(
                    es = "Fin de servicio, todas las unidades localizadas.",
                    en = "ENDING SHIFT, ALL UNITS ACCOUNTED FOR.",
                    phonetic = "énding shift, ol iúnits akáunted for"
                )
            )
        )
    )
)
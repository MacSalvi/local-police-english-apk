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
                VocabularyItem(
                    es = "Indicativo",
                    en = "CALL SIGN",
                    phonetic = "col sáin"
                ),
                VocabularyItem(
                    es = "Confirmar",
                    en = "CONFIRM",
                    phonetic = "konfírm"
                ),
                VocabularyItem(
                    es = "Repetir",
                    en = "REPEAT",
                    phonetic = "ripít"
                )
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
                VocabularyItem(
                    es = "Posición",
                    en = "POSITION",
                    phonetic = "posíshon"
                ),
                VocabularyItem(
                    es = "Matrícula",
                    en = "REGISTRATION",
                    phonetic = "reyistréishon"
                ),
                VocabularyItem(
                    es = "Vehículo",
                    en = "VEHICLE",
                    phonetic = "víikol"
                )
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
                VocabularyItem(
                    es = "Apoyo",
                    en = "SUPPORT",
                    phonetic = "sapórt"
                ),
                VocabularyItem(
                    es = "Bomberos",
                    en = "FIRE BRIGADE",
                    phonetic = "fáiar brigéid"
                ),
                VocabularyItem(
                    es = "Grúa",
                    en = "TOW TRUCK",
                    phonetic = "tóu trak"
                )
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
                VocabularyItem(
                    es = "Traslado",
                    en = "TRANSFER",
                    phonetic = "tránsfer"
                ),
                VocabularyItem(
                    es = "Finalizar",
                    en = "END",
                    phonetic = "end"
                ),
                VocabularyItem(
                    es = "Servicio",
                    en = "SHIFT",
                    phonetic = "shift"
                )
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
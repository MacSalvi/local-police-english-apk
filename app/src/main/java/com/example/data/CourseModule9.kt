package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module9 = Module(
    moduleId = 9,
    moduleName = "Módulo 9: Estacionamiento, grúa e inmovilización",
    lessons = listOf(
        Lesson(
            lessonId = 901,
            lessonTitle = "Zonas prohibidas y reservadas",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Estacionamiento prohibido",
                    en = "NO PARKING",
                    phonetic = "nóu párking"
                ),
                VocabularyItem(
                    es = "Vado",
                    en = "DROPPED KERB",
                    phonetic = "dropt kerb"
                ),
                VocabularyItem(
                    es = "Reservado",
                    en = "RESERVED",
                    phonetic = "risörvd"
                ),
                VocabularyItem(
                    es = "Discapacitado",
                    en = "DISABLED",
                    phonetic = "diséibold"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "No puede aparcar aquí.",
                    en = "YOU CANNOT PARK HERE.",
                    phonetic = "yu kánot park jía"
                ),
                PhraseItem(
                    es = "Esta es una zona de estacionamiento prohibido.",
                    en = "THIS IS A NO-PARKING ZONE.",
                    phonetic = "dis is a nóu-párking zóun"
                ),
                PhraseItem(
                    es = "Está bloqueando un vado.",
                    en = "YOU'RE BLOCKING A DROPPED KERB.",
                    phonetic = "yur blóking a dropt kerb"
                ),
                PhraseItem(
                    es = "Debe mover el vehículo ahora.",
                    en = "YOU MUST MOVE THE VEHICLE NOW.",
                    phonetic = "yu mast muv de víikol nau"
                ),
                PhraseItem(
                    es = "Esta plaza está reservada.",
                    en = "THIS SPACE IS RESERVED.",
                    phonetic = "dis spéis is risörvd"
                ),
                PhraseItem(
                    es = "No puede aparcar en una plaza reservada.",
                    en = "YOU CANNOT PARK IN A RESERVED SPACE.",
                    phonetic = "yu kánot park in a risörvd spéis"
                ),
                PhraseItem(
                    es = "Esta es una plaza para personas con discapacidad.",
                    en = "THIS IS A DISABLED PARKING SPACE.",
                    phonetic = "dis is a diséibold párking spéis"
                ),
                PhraseItem(
                    es = "¿Tiene tarjeta de discapacidad?",
                    en = "DO YOU HAVE A DISABLED PERMIT?",
                    phonetic = "du yu jav a diséibold pörmit"
                )
            )
        ),
        Lesson(
            lessonId = 902,
            lessonTitle = "Carga, doble fila y retirada",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Carga y descarga",
                    en = "LOADING ZONE",
                    phonetic = "lóuding zóun"
                ),
                VocabularyItem(
                    es = "Doble fila",
                    en = "DOUBLE FILE",
                    phonetic = "dábol fail"
                ),
                VocabularyItem(
                    es = "Retirar",
                    en = "TOW AWAY",
                    phonetic = "tóu aguéi"
                ),
                VocabularyItem(
                    es = "Depósito municipal",
                    en = "MUNICIPAL POUND",
                    phonetic = "miunísipal páund"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Esta zona es solo para carga y descarga.",
                    en = "THIS IS A LOADING ZONE ONLY.",
                    phonetic = "dis is a lóuding zóun óunli"
                ),
                PhraseItem(
                    es = "No puede aparcar aquí fuera de horario.",
                    en = "YOU CANNOT PARK HERE OUTSIDE LOADING HOURS.",
                    phonetic = "yu kánot park jía áutsaid lóuding áuers"
                ),
                PhraseItem(
                    es = "Está aparcado en doble fila.",
                    en = "YOU'RE PARKED IN DOUBLE FILE.",
                    phonetic = "yur parkt in dábol fail"
                ),
                PhraseItem(
                    es = "Esto está causando una obstrucción.",
                    en = "THIS IS CAUSING AN OBSTRUCTION.",
                    phonetic = "dis is kósing an obstrákshon"
                ),
                PhraseItem(
                    es = "Su vehículo será retirado.",
                    en = "YOUR VEHICLE WILL BE TOWED AWAY.",
                    phonetic = "yor víikol güil bi tóud aguéi"
                ),
                PhraseItem(
                    es = "La grúa está en camino.",
                    en = "THE TOW TRUCK IS ON ITS WAY.",
                    phonetic = "de tóu trak is on its güéi"
                ),
                PhraseItem(
                    es = "Su vehículo está en el depósito municipal.",
                    en = "YOUR VEHICLE IS AT THE MUNICIPAL POUND.",
                    phonetic = "yor víikol is at de miunísipal páund"
                ),
                PhraseItem(
                    es = "Aquí tiene la dirección del depósito.",
                    en = "HERE'S THE ADDRESS OF THE POUND.",
                    phonetic = "jias de ádres ov de páund"
                )
            )
        ),
        Lesson(
            lessonId = 903,
            lessonTitle = "Cepo, recuperación y tasas",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Cepo",
                    en = "WHEEL CLAMP",
                    phonetic = "güíl clamp"
                ),
                VocabularyItem(
                    es = "Inmovilización",
                    en = "IMMOBILISATION",
                    phonetic = "imobilaizéishon"
                ),
                VocabularyItem(
                    es = "Recuperar",
                    en = "RETRIEVE",
                    phonetic = "ritriv"
                ),
                VocabularyItem(
                    es = "Tasa",
                    en = "FEE",
                    phonetic = "fi"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Su vehículo será inmovilizado.",
                    en = "YOUR VEHICLE WILL BE IMMOBILISED.",
                    phonetic = "yor víikol güil bi imóbilaizd"
                ),
                PhraseItem(
                    es = "No puede conducir hasta resolver esto.",
                    en = "YOU CANNOT DRIVE UNTIL THIS IS RESOLVED.",
                    phonetic = "yu kánot dráiv antíl dis is risólvd"
                ),
                PhraseItem(
                    es = "Se ha colocado un cepo.",
                    en = "A WHEEL CLAMP HAS BEEN FITTED.",
                    phonetic = "a güíl clamp jas bin fíted"
                ),
                PhraseItem(
                    es = "No intente retirar el cepo.",
                    en = "DO NOT TRY TO REMOVE THE CLAMP.",
                    phonetic = "du not trai tu rimúv de clamp"
                ),
                PhraseItem(
                    es = "Puede recuperar su vehículo mañana.",
                    en = "YOU CAN RETRIEVE YOUR VEHICLE TOMORROW.",
                    phonetic = "yu can ritriv yor víikol tumórou"
                ),
                PhraseItem(
                    es = "Traiga su identificación para recogerlo.",
                    en = "BRING YOUR ID TO COLLECT IT.",
                    phonetic = "bring yor aidí tu koléct it"
                ),
                PhraseItem(
                    es = "Debe pagar una tasa de liberación.",
                    en = "YOU MUST PAY A RELEASE FEE.",
                    phonetic = "yu mast péi a rilís fi"
                ),
                PhraseItem(
                    es = "Conserve el justificante de pago.",
                    en = "KEEP THE PAYMENT RECEIPT.",
                    phonetic = "kip de péiment risít"
                )
            )
        )
    )
)
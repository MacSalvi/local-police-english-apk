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
                VocabularyItem(es = "Estacionamiento prohibido", en = "NO PARKING", phonetic = "nóu párking"),
                VocabularyItem(es = "Vado", en = "DROPPED KERB", phonetic = "dropt kerb"),
                VocabularyItem(es = "Reservado", en = "RESERVED", phonetic = "risörvd"),
                VocabularyItem(es = "Discapacitado", en = "DISABLED", phonetic = "diséibold"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "No poder", en = "CANNOT", phonetic = "kánot"),
                VocabularyItem(es = "Aparcar", en = "PARK", phonetic = "park"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Zona / Área", en = "ZONE", phonetic = "zóun"),
                VocabularyItem(es = "Estás / Eres (You are)", en = "YOU'RE", phonetic = "yur"),
                VocabularyItem(es = "Bloqueando", en = "BLOCKING", phonetic = "blóking"),
                VocabularyItem(es = "Debe / Tener que (obligación)", en = "MUST", phonetic = "mast"),
                VocabularyItem(es = "Mover", en = "MOVE", phonetic = "muv"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Espacio / Plaza", en = "SPACE", phonetic = "spéis"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Permiso / Tarjeta", en = "PERMIT", phonetic = "pörmit")
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
                VocabularyItem(es = "Carga y descarga", en = "LOADING ZONE", phonetic = "lóuding zóun"),
                VocabularyItem(es = "Doble fila", en = "DOUBLE FILE", phonetic = "dábol fail"),
                VocabularyItem(es = "Retirar", en = "TOW AWAY", phonetic = "tóu aguéi"),
                VocabularyItem(es = "Depósito municipal", en = "MUNICIPAL POUND", phonetic = "miunísipal páund"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Solamente / Solo", en = "ONLY", phonetic = "óunli"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "No poder", en = "CANNOT", phonetic = "kánot"),
                VocabularyItem(es = "Aparcar", en = "PARK", phonetic = "park"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Fuera de", en = "OUTSIDE", phonetic = "áutsaid"),
                VocabularyItem(es = "Horas / Horario", en = "HOURS", phonetic = "auers"),
                VocabularyItem(es = "Estás / Eres (You are)", en = "YOU'RE", phonetic = "yur"),
                VocabularyItem(es = "Aparcado", en = "PARKED", phonetic = "parkt"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Causando", en = "CAUSING", phonetic = "kósing"),
                VocabularyItem(es = "Un / Una (ante vocal)", en = "AN", phonetic = "an"),
                VocabularyItem(es = "Obstrucción", en = "OBSTRUCTION", phonetic = "obstrákshon"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar (auxiliar pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Remolcado / Retirado", en = "TOWED", phonetic = "tóud"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Grúa / Camión de remolque", en = "TOW TRUCK", phonetic = "tóu trak"),
                VocabularyItem(es = "En / Sobre", en = "ON", phonetic = "on"),
                VocabularyItem(es = "Su (de ello)", en = "ITS", phonetic = "its"),
                VocabularyItem(es = "Camino / Ruta", en = "WAY", phonetic = "güéi"),
                VocabularyItem(es = "En / En el", en = "AT", phonetic = "at"),
                VocabularyItem(es = "Aquí está (Here is)", en = "HERE'S", phonetic = "jias"),
                VocabularyItem(es = "Dirección", en = "ADDRESS", phonetic = "adres"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Depósito", en = "POUND", phonetic = "páund")
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
                VocabularyItem(es = "Cepo", en = "WHEEL CLAMP", phonetic = "güíl clamp"),
                VocabularyItem(es = "Inmovilización", en = "IMMOBILISATION", phonetic = "imobilaizéishon"),
                VocabularyItem(es = "Recuperar", en = "RETRIEVE", phonetic = "ritriv"),
                VocabularyItem(es = "Tasa", en = "FEE", phonetic = "fi"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar (auxiliar pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Inmovilizado", en = "IMMOBILISED", phonetic = "imóbilaizd"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "No poder", en = "CANNOT", phonetic = "kánot"),
                VocabularyItem(es = "Conducir", en = "DRIVE", phonetic = "dráiv"),
                VocabularyItem(es = "Hasta que", en = "UNTIL", phonetic = "antíl"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Resuelto", en = "RESOLVED", phonetic = "risólvd"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Haber (auxiliar)", en = "HAS", phonetic = "jas"),
                VocabularyItem(es = "Sido (participio)", en = "BEEN", phonetic = "bin"),
                VocabularyItem(es = "Colocado / Instalado", en = "FITTED", phonetic = "fíted"),
                VocabularyItem(es = "Hacer (auxiliar negativo)", en = "DO NOT", phonetic = "du not"),
                VocabularyItem(es = "Intentar", en = "TRY", phonetic = "trai"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Quitar / Retirar", en = "REMOVE", phonetic = "rimúv"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Cepo / Abrazadera", en = "CLAMP", phonetic = "clamp"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Mañana", en = "TOMORROW", phonetic = "tumórou"),
                VocabularyItem(es = "Traer", en = "BRING", phonetic = "bring"),
                VocabularyItem(es = "Identificación", en = "ID", phonetic = "aidí"),
                VocabularyItem(es = "Recoger", en = "COLLECT", phonetic = "koléct"),
                VocabularyItem(es = "Lo / El", en = "IT", phonetic = "it"),
                VocabularyItem(es = "Debe / Tener que", en = "MUST", phonetic = "mast"),
                VocabularyItem(es = "Pagar", en = "PAY", phonetic = "péi"),
                VocabularyItem(es = "Liberación", en = "RELEASE", phonetic = "rilís"),
                VocabularyItem(es = "Mantener / Guardar", en = "KEEP", phonetic = "kip"),
                VocabularyItem(es = "Pago", en = "PAYMENT", phonetic = "péiment"),
                VocabularyItem(es = "Recibo / Justificante", en = "RECEIPT", phonetic = "risít")
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
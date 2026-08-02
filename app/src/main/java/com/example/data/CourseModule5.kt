package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module5 = Module(
    moduleId = 5,
    moduleName = "Módulo 5: Vehículos y sus partes",
    lessons = listOf(
        Lesson(
            lessonId = 501,
            lessonTitle = "Carrocería e interior",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Capó",
                    en = "BONNET",
                    phonetic = "bónet"
                ),
                VocabularyItem(
                    es = "Maletero",
                    en = "BOOT",
                    phonetic = "but"
                ),
                VocabularyItem(
                    es = "Parachoques",
                    en = "BUMPER",
                    phonetic = "bámper"
                ),
                VocabularyItem(
                    es = "Parabrisas",
                    en = "WINDSCREEN",
                    phonetic = "güíndscrin"
                ),
                VocabularyItem(
                    es = "Espejo",
                    en = "MIRROR",
                    phonetic = "míror"
                ),
                VocabularyItem(
                    es = "Carrocería",
                    en = "BODY",
                    phonetic = "bódi"
                ),
                VocabularyItem(
                    es = "Manija",
                    en = "HANDLE",
                    phonetic = "jándel"
                ),
                VocabularyItem(
                    es = "Techo",
                    en = "ROOF",
                    phonetic = "ruf"
                ),
                VocabularyItem(
                    es = "Cristal",
                    en = "WINDOW",
                    phonetic = "güíndou"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Compruebe el capó, por favor.",
                    en = "CHECK THE BONNET, PLEASE.",
                    phonetic = "chek de bónet, plis"
                ),
                PhraseItem(
                    es = "Abra el maletero, por favor.",
                    en = "OPEN THE BOOT, PLEASE.",
                    phonetic = "óupen de but, plis"
                ),
                PhraseItem(
                    es = "Compruebe la guantera.",
                    en = "CHECK THE GLOVE COMPARTMENT.",
                    phonetic = "chek de glav kompártment"
                ),
                PhraseItem(
                    es = "¿Hay algo dentro del vehículo?",
                    en = "IS THERE ANYTHING INSIDE THE VEHICLE?",
                    phonetic = "is der énizing insáid de víikol"
                ),
                PhraseItem(
                    es = "El parabrisas está agrietado.",
                    en = "THE WINDSCREEN IS CRACKED.",
                    phonetic = "de güíndscrin is crakt"
                ),
                PhraseItem(
                    es = "La matrícula está dañada.",
                    en = "THE NUMBER PLATE IS DAMAGED.",
                    phonetic = "de námber pléit is dámichd"
                )
            )
        ),
        Lesson(
            lessonId = 502,
            lessonTitle = "Mecánica y luces",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Motor",
                    en = "ENGINE",
                    phonetic = "énllin"
                ),
                VocabularyItem(
                    es = "Neumático",
                    en = "TYRE",
                    phonetic = "táiar"
                ),
                VocabularyItem(
                    es = "Freno",
                    en = "BRAKE",
                    phonetic = "bréik"
                ),
                VocabularyItem(
                    es = "Luz",
                    en = "LIGHT",
                    phonetic = "láit"
                ),
                VocabularyItem(
                    es = "Faro",
                    en = "HEADLIGHT",
                    phonetic = "jédláit"
                ),
                VocabularyItem(
                    es = "Aceite",
                    en = "OIL",
                    phonetic = "óil"
                ),
                VocabularyItem(
                    es = "Batería",
                    en = "BATTERY",
                    phonetic = "báteri"
                ),
                VocabularyItem(
                    es = "Tubo de escape",
                    en = "EXHAUST",
                    phonetic = "eksóst"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Funciona correctamente el motor?",
                    en = "IS THE ENGINE WORKING PROPERLY?",
                    phonetic = "is di énllin wörking próperli"
                ),
                PhraseItem(
                    es = "Sale humo del motor.",
                    en = "THERE'S SMOKE COMING FROM THE ENGINE.",
                    phonetic = "ders smóuk cáming from di énllin"
                ),
                PhraseItem(
                    es = "Sus luces no funcionan.",
                    en = "YOUR LIGHTS ARE NOT WORKING.",
                    phonetic = "yor láits ar not wörking"
                ),
                PhraseItem(
                    es = "Este neumático está pinchado.",
                    en = "THIS TYRE IS FLAT.",
                    phonetic = "dis táiar is flat"
                ),
                PhraseItem(
                    es = "Compruebe la presión de los neumáticos.",
                    en = "CHECK THE TYRE PRESSURE.",
                    phonetic = "chek de táiar présher"
                ),
                PhraseItem(
                    es = "Los frenos no funcionan.",
                    en = "THE BRAKES ARE NOT WORKING.",
                    phonetic = "de bréiks ar not wörking"
                )
            )
        ),
        Lesson(
            lessonId = 503,
            lessonTitle = "Seguridad, daños y tipos de vehículo",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Cinturón",
                    en = "SEATBELT",
                    phonetic = "sítbelt"
                ),
                VocabularyItem(
                    es = "Airbag",
                    en = "AIRBAG",
                    phonetic = "érbag"
                ),
                VocabularyItem(
                    es = "Daño",
                    en = "DAMAGE",
                    phonetic = "dámich"
                ),
                VocabularyItem(
                    es = "Avería",
                    en = "BREAKDOWN",
                    phonetic = "bréikdaun"
                ),
                VocabularyItem(
                    es = "Motocicleta",
                    en = "MOTORBIKE",
                    phonetic = "móutorbaik"
                ),
                VocabularyItem(
                    es = "Furgoneta",
                    en = "VAN",
                    phonetic = "van"
                ),
                VocabularyItem(
                    es = "Camión",
                    en = "TRUCK",
                    phonetic = "trak"
                ),
                VocabularyItem(
                    es = "Coche",
                    en = "CAR",
                    phonetic = "car"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Abróchese el cinturón, por favor.",
                    en = "PLEASE FASTEN YOUR SEATBELT.",
                    phonetic = "plís fásen yor sítbelt"
                ),
                PhraseItem(
                    es = "¿Funciona el airbag?",
                    en = "IS THE AIRBAG WORKING?",
                    phonetic = "is di érbag wörking"
                ),
                PhraseItem(
                    es = "El vehículo presenta daños visibles.",
                    en = "THE VEHICLE HAS VISIBLE DAMAGE.",
                    phonetic = "de víikol jas vísibol dámich"
                ),
                PhraseItem(
                    es = "¿Está averiado el vehículo?",
                    en = "IS THE VEHICLE BROKEN DOWN?",
                    phonetic = "is de víikol bróuken daun"
                ),
                PhraseItem(
                    es = "¿Es esto una moto o un coche?",
                    en = "IS THIS A MOTORBIKE OR A CAR?",
                    phonetic = "is dis a móutorbaik or a car"
                ),
                PhraseItem(
                    es = "¿Es este un vehículo comercial?",
                    en = "IS THIS A COMMERCIAL VEHICLE?",
                    phonetic = "is dis a komérshal víikol"
                )
            )
        )
    )
)
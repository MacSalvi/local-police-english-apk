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
                VocabularyItem(es = "Capó", en = "BONNET", phonetic = "bónet"),
                VocabularyItem(es = "Maletero", en = "BOOT", phonetic = "but"),
                VocabularyItem(es = "Parachoques", en = "BUMPER", phonetic = "bámper"),
                VocabularyItem(es = "Parabrisas", en = "WINDSCREEN", phonetic = "güíndscrin"),
                VocabularyItem(es = "Espejo", en = "MIRROR", phonetic = "míror"),
                VocabularyItem(es = "Carrocería", en = "BODY", phonetic = "bódi"),
                VocabularyItem(es = "Manija / Tirador", en = "HANDLE", phonetic = "jándel"),
                VocabularyItem(es = "Techo", en = "ROOF", phonetic = "ruf"),
                VocabularyItem(es = "Ventana / Cristal", en = "WINDOW", phonetic = "güíndou"),
                VocabularyItem(es = "Guantera", en = "GLOVE COMPARTMENT", phonetic = "glav kompártment"),
                VocabularyItem(es = "Comprobar / Revisar", en = "CHECK", phonetic = "chek"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Abrir", en = "OPEN", phonetic = "óupen"),
                VocabularyItem(es = "Haber (existencial - hay)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Algo / Cualquier cosa", en = "ANYTHING", phonetic = "énizing"),
                VocabularyItem(es = "Dentro", en = "INSIDE", phonetic = "insáid"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Agrietado / Roto", en = "CRACKED", phonetic = "crakt"),
                VocabularyItem(es = "Número", en = "NUMBER", phonetic = "námber"),
                VocabularyItem(es = "Placa / Matrícula", en = "PLATE", phonetic = "pléit"),
                VocabularyItem(es = "Dañado", en = "DAMAGED", phonetic = "dámichd")
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
                VocabularyItem(es = "Motor", en = "ENGINE", phonetic = "én-yin"),
                VocabularyItem(es = "Neumático", en = "TYRE", phonetic = "táiar"),
                VocabularyItem(es = "Freno", en = "BRAKE", phonetic = "bréik"),
                VocabularyItem(es = "Luz", en = "LIGHT", phonetic = "láit"),
                VocabularyItem(es = "Faro", en = "HEADLIGHT", phonetic = "jédláit"),
                VocabularyItem(es = "Aceite", en = "OIL", phonetic = "óil"),
                VocabularyItem(es = "Batería", en = "BATTERY", phonetic = "báteri"),
                VocabularyItem(es = "Tubo de escape", en = "EXHAUST", phonetic = "eksóst"),
                VocabularyItem(es = "Humo", en = "SMOKE", phonetic = "smóuk"),
                VocabularyItem(es = "Presión", en = "PRESSURE", phonetic = "présher"),
                VocabularyItem(es = "Plano / Pinchado", en = "FLAT", phonetic = "flat"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Trabajando / Funcionando", en = "WORKING", phonetic = "wörking"),
                VocabularyItem(es = "Correctamente", en = "PROPERLY", phonetic = "próperli"),
                VocabularyItem(es = "Haber (existencial - hay)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Viniendo / Saliendo", en = "COMING", phonetic = "cáming"),
                VocabularyItem(es = "De / Desde", en = "FROM", phonetic = "from"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Luces", en = "LIGHTS", phonetic = "láits"),
                VocabularyItem(es = "No", en = "NOT", phonetic = "not"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Funciona correctamente el motor?",
                    en = "IS THE ENGINE WORKING PROPERLY?",
                    phonetic = "is di én-yin wörking próperli"
                ),
                PhraseItem(
                    es = "Sale humo del motor.",
                    en = "THERE'S SMOKE COMING FROM THE ENGINE.",
                    phonetic = "ders smóuk cáming from di én-yin"
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
                VocabularyItem(es = "Cinturón de seguridad", en = "SEATBELT", phonetic = "sítbelt"),
                VocabularyItem(es = "Airbag", en = "AIRBAG", phonetic = "érbag"),
                VocabularyItem(es = "Daño", en = "DAMAGE", phonetic = "dámich"),
                VocabularyItem(es = "Averiado / Roto", en = "BROKEN DOWN", phonetic = "bróuken daun"),
                VocabularyItem(es = "Motocicleta", en = "MOTORBIKE", phonetic = "móutorbaik"),
                VocabularyItem(es = "Furgoneta", en = "VAN", phonetic = "van"),
                VocabularyItem(es = "Camión", en = "TRUCK", phonetic = "trak"),
                VocabularyItem(es = "Coche / Automóvil", en = "CAR", phonetic = "car"),
                VocabularyItem(es = "Comercial", en = "COMMERCIAL", phonetic = "komérshal"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Abrochar / Asegurar", en = "FASTEN", phonetic = "fásen"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Trabajando / Funcionando", en = "WORKING", phonetic = "wörking"),
                VocabularyItem(es = "Tiene / Haber", en = "HAS", phonetic = "jas"),
                VocabularyItem(es = "Visible", en = "VISIBLE", phonetic = "vísibol"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "O", en = "OR", phonetic = "or")
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
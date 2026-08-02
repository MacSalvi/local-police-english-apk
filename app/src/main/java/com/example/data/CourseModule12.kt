package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module12 = Module(
    moduleId = 12,
    moduleName = "Módulo 12: Drogas y sustancias",
    lessons = listOf(
        Lesson(
            lessonId = 1201,
            lessonTitle = "Cannabis y hachís",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Cannabis",
                    en = "CANNABIS",
                    phonetic = "kánabis"
                ),
                VocabularyItem(
                    es = "Hachís",
                    en = "HASHISH",
                    phonetic = "jáshish"
                ),
                VocabularyItem(
                    es = "Olor",
                    en = "SMELL",
                    phonetic = "smel"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Puedo oler cannabis.",
                    en = "I CAN SMELL CANNABIS.",
                    phonetic = "ai can smel kánabis"
                ),
                PhraseItem(
                    es = "¿Lleva cannabis encima?",
                    en = "ARE YOU CARRYING ANY CANNABIS?",
                    phonetic = "ar yu kárring éni kánabis"
                ),
                PhraseItem(
                    es = "¿Es esto hachís?",
                    en = "IS THIS HASHISH?",
                    phonetic = "is dis jáshish"
                ),
                PhraseItem(
                    es = "Esta sustancia será analizada.",
                    en = "THIS SUBSTANCE WILL BE TESTED.",
                    phonetic = "dis sábstans güil bi téstid"
                ),
                PhraseItem(
                    es = "¿De dónde ha sacado esto?",
                    en = "WHERE DID YOU GET THIS?",
                    phonetic = "güer did yu guet dis"
                ),
                PhraseItem(
                    es = "Poseer esto es una infracción.",
                    en = "POSSESSION OF THIS IS AN OFFENCE.",
                    phonetic = "posésion ov dis is an ofens"
                )
            )
        ),
        Lesson(
            lessonId = 1202,
            lessonTitle = "Cocaína y heroína",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Cocaína",
                    en = "COCAINE",
                    phonetic = "kóukein"
                ),
                VocabularyItem(
                    es = "Heroína",
                    en = "HEROIN",
                    phonetic = "jérouin"
                ),
                VocabularyItem(
                    es = "Polvo",
                    en = "POWDER",
                    phonetic = "páuder"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Es esto cocaína?",
                    en = "IS THIS COCAINE?",
                    phonetic = "is dis kóukein"
                ),
                PhraseItem(
                    es = "Este polvo blanco será analizado.",
                    en = "THIS WHITE POWDER WILL BE TESTED.",
                    phonetic = "dis guáit páuder güil bi téstid"
                ),
                PhraseItem(
                    es = "¿Lleva heroína encima?",
                    en = "ARE YOU CARRYING ANY HEROIN?",
                    phonetic = "ar yu kárring éni jérouin"
                ),
                PhraseItem(
                    es = "Esta es una sustancia controlada.",
                    en = "THIS IS A CONTROLLED SUBSTANCE.",
                    phonetic = "dis is a kontróuld sábstans"
                ),
                PhraseItem(
                    es = "¿Cuánto tiene de esto?",
                    en = "HOW MUCH OF THIS DO YOU HAVE?",
                    phonetic = "jau mach ov dis du yu jav"
                ),
                PhraseItem(
                    es = "Esto será incautado.",
                    en = "THIS WILL BE CONFISCATED.",
                    phonetic = "dis güil bi kónfiskeited"
                )
            )
        ),
        Lesson(
            lessonId = 1203,
            lessonTitle = "Éxtasis, anfetaminas y pastillas",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Éxtasis",
                    en = "ECSTASY",
                    phonetic = "ékstasi"
                ),
                VocabularyItem(
                    es = "Pastilla",
                    en = "PILL",
                    phonetic = "pil"
                ),
                VocabularyItem(
                    es = "Anfetamina",
                    en = "AMPHETAMINE",
                    phonetic = "amfétamin"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Son estas pastillas de éxtasis?",
                    en = "ARE THESE ECSTASY PILLS?",
                    phonetic = "ar dis ékstasi pils"
                ),
                PhraseItem(
                    es = "¿Cuántas pastillas hay?",
                    en = "HOW MANY PILLS ARE THERE?",
                    phonetic = "jau méni pils ar der"
                ),
                PhraseItem(
                    es = "¿Es esto anfetamina?",
                    en = "IS THIS AMPHETAMINE?",
                    phonetic = "is dis amfétamin"
                ),
                PhraseItem(
                    es = "¿Dónde ha comprado esto?",
                    en = "WHERE DID YOU BUY THESE?",
                    phonetic = "güer did yu bái dis"
                ),
                PhraseItem(
                    es = "¿Son estas para uso personal?",
                    en = "ARE THESE FOR PERSONAL USE?",
                    phonetic = "ar dis for pörsonal iús"
                ),
                PhraseItem(
                    es = "Estas serán enviadas para análisis.",
                    en = "THESE WILL BE SENT FOR ANALYSIS.",
                    phonetic = "dis güil bi sent for análisis"
                )
            )
        ),
        Lesson(
            lessonId = 1204,
            lessonTitle = "Dosis, envoltorios y parafernalia",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Dosis",
                    en = "DOSE",
                    phonetic = "dóus"
                ),
                VocabularyItem(
                    es = "Envoltorio",
                    en = "WRAP",
                    phonetic = "rap"
                ),
                VocabularyItem(
                    es = "Parafernalia",
                    en = "PARAPHERNALIA",
                    phonetic = "parafernália"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Cuántas dosis hay?",
                    en = "HOW MANY DOSES ARE THERE?",
                    phonetic = "jau méni dóuses ar der"
                ),
                PhraseItem(
                    es = "¿Es este envoltorio suyo?",
                    en = "IS THIS WRAP YOURS?",
                    phonetic = "is dis rap yors"
                ),
                PhraseItem(
                    es = "Esto parece parafernalia de drogas.",
                    en = "THIS LOOKS LIKE DRUG PARAPHERNALIA.",
                    phonetic = "dis luks láik drag parafernália"
                ),
                PhraseItem(
                    es = "¿Tiene alguna báscula?",
                    en = "DO YOU HAVE ANY SCALES?",
                    phonetic = "du yu jav éni skéils"
                ),
                PhraseItem(
                    es = "Este material será incautado.",
                    en = "THIS EQUIPMENT WILL BE SEIZED.",
                    phonetic = "dis ikuípment güil bi sízd"
                ),
                PhraseItem(
                    es = "¿A quién pertenece esto?",
                    en = "WHO DOES THIS BELONG TO?",
                    phonetic = "ju das dis bilóng tu"
                )
            )
        ),
        Lesson(
            lessonId = 1205,
            lessonTitle = "Consumo, tenencia y venta",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Consumo",
                    en = "USE",
                    phonetic = "iús"
                ),
                VocabularyItem(
                    es = "Tenencia",
                    en = "POSSESSION",
                    phonetic = "posésion"
                ),
                VocabularyItem(
                    es = "Venta",
                    en = "DEALING",
                    phonetic = "díling"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Está consumiendo drogas ahora mismo?",
                    en = "ARE YOU USING DRUGS RIGHT NOW?",
                    phonetic = "ar yu iúsing dragz ráit nau"
                ),
                PhraseItem(
                    es = "La tenencia de drogas es una infracción.",
                    en = "POSSESSION OF DRUGS IS AN OFFENCE.",
                    phonetic = "posésion ov dragz is an ofens"
                ),
                PhraseItem(
                    es = "¿Está vendiendo estas drogas?",
                    en = "ARE YOU SELLING THESE DRUGS?",
                    phonetic = "ar yu séling dis dragz"
                ),
                PhraseItem(
                    es = "Vender drogas es un delito grave.",
                    en = "DEALING DRUGS IS A SERIOUS CRIME.",
                    phonetic = "díling dragz is a sírios cráim"
                ),
                PhraseItem(
                    es = "¿Desde cuándo consume?",
                    en = "HOW LONG HAVE YOU BEEN USING?",
                    phonetic = "jau long jav yu bin iúsing"
                ),
                PhraseItem(
                    es = "Queda detenido por tráfico de drogas.",
                    en = "YOU ARE UNDER ARREST FOR DEALING.",
                    phonetic = "yu ar ánder arést for díling"
                )
            )
        ),
        Lesson(
            lessonId = 1206,
            lessonTitle = "Síntomas de intoxicación",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Síntoma",
                    en = "SYMPTOM",
                    phonetic = "símptom"
                ),
                VocabularyItem(
                    es = "Pupila",
                    en = "PUPIL",
                    phonetic = "piúpil"
                ),
                VocabularyItem(
                    es = "Confuso",
                    en = "CONFUSED",
                    phonetic = "konfiúsd"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Se encuentra mal?",
                    en = "ARE YOU FEELING UNWELL?",
                    phonetic = "ar yu fíling anwél"
                ),
                PhraseItem(
                    es = "Tiene las pupilas dilatadas.",
                    en = "YOUR PUPILS ARE DILATED.",
                    phonetic = "yor piúpils ar dailéited"
                ),
                PhraseItem(
                    es = "Parece confundido.",
                    en = "YOU SEEM CONFUSED.",
                    phonetic = "yu sim konfiúsd"
                ),
                PhraseItem(
                    es = "¿Está bajo los efectos de drogas?",
                    en = "ARE YOU UNDER THE INFLUENCE OF DRUGS?",
                    phonetic = "ar yu ánder di ínfluens ov dragz"
                ),
                PhraseItem(
                    es = "¿Puede caminar en línea recta?",
                    en = "CAN YOU WALK IN A STRAIGHT LINE?",
                    phonetic = "can yu güok in a stréit láin"
                ),
                PhraseItem(
                    es = "Necesito comprobar su estado.",
                    en = "I NEED TO CHECK YOUR CONDITION.",
                    phonetic = "ai nid tu chek yor kondíshon"
                )
            )
        ),
        Lesson(
            lessonId = 1207,
            lessonTitle = "Sobredosis e intervención",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Sobredosis",
                    en = "OVERDOSE",
                    phonetic = "óuverdóus"
                ),
                VocabularyItem(
                    es = "Inconsciente",
                    en = "UNCONSCIOUS",
                    phonetic = "ankónshos"
                ),
                VocabularyItem(
                    es = "Emergencia",
                    en = "EMERGENCY",
                    phonetic = "imöryensi"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Esto es una emergencia médica.",
                    en = "THIS IS A MEDICAL EMERGENCY.",
                    phonetic = "dis is a médikal imöryensi"
                ),
                PhraseItem(
                    es = "Llame a una ambulancia ahora.",
                    en = "CALL AN AMBULANCE NOW.",
                    phonetic = "col an ámbiulans nau"
                ),
                PhraseItem(
                    es = "Está inconsciente.",
                    en = "HE/SHE IS UNCONSCIOUS.",
                    phonetic = "ji/shi is ankónshos"
                ),
                PhraseItem(
                    es = "¿Qué han tomado?",
                    en = "WHAT DID THEY TAKE?",
                    phonetic = "guat did déi téik"
                ),
                PhraseItem(
                    es = "¿Cuánto han tomado?",
                    en = "HOW MUCH DID THEY TAKE?",
                    phonetic = "jau mach did déi téik"
                ),
                PhraseItem(
                    es = "Quédese con ellos hasta que llegue la ayuda.",
                    en = "STAY WITH THEM UNTIL HELP ARRIVES.",
                    phonetic = "stéi güiz dem antíl jelp aráivs"
                )
            )
        )
    )
)
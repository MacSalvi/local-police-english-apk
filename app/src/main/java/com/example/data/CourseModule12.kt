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
                VocabularyItem(es = "Cannabis", en = "CANNABIS", phonetic = "kánabis"),
                VocabularyItem(es = "Hachís", en = "HASHISH", phonetic = "jáshish"),
                VocabularyItem(es = "Olor", en = "SMELL", phonetic = "smel"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Llevando / Transportando", en = "CARRYING", phonetic = "kárring"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Sustancia", en = "SUBSTANCE", phonetic = "sábstans"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar (auxiliar pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Analizado / Probado", en = "TESTED", phonetic = "téstid"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Pasado (auxiliar)", en = "DID", phonetic = "did"),
                VocabularyItem(es = "Conseguir / Obtener", en = "GET", phonetic = "guet"),
                VocabularyItem(es = "Tenencia / Posesión", en = "POSSESSION", phonetic = "posésion"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Un / Una (ante vocal)", en = "AN", phonetic = "an"),
                VocabularyItem(es = "Infracción / Delito", en = "OFFENCE", phonetic = "ofens")
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
                VocabularyItem(es = "Cocaína", en = "COCAINE", phonetic = "kóukein"),
                VocabularyItem(es = "Heroína", en = "HEROIN", phonetic = "jérouin"),
                VocabularyItem(es = "Polvo", en = "POWDER", phonetic = "páuder"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Blanco", en = "WHITE", phonetic = "guáit"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar (auxiliar pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Analizado / Probado", en = "TESTED", phonetic = "téstid"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Llevando / Transportando", en = "CARRYING", phonetic = "kárring"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Controlado", en = "CONTROLLED", phonetic = "kontróuld"),
                VocabularyItem(es = "Sustancia", en = "SUBSTANCE", phonetic = "sábstans"),
                VocabularyItem(es = "Cuánto / Cuántos", en = "HOW MUCH", phonetic = "jau mach"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Incautado / Confiscado", en = "CONFISCATED", phonetic = "kónfiskeited")
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
                VocabularyItem(es = "Éxtasis", en = "ECSTASY", phonetic = "ékstasi"),
                VocabularyItem(es = "Pastilla", en = "PILL", phonetic = "pil"),
                VocabularyItem(es = "Anfetamina", en = "AMPHETAMINE", phonetic = "amfétamin"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Estos / Estas", en = "THESE", phonetic = "dis"),
                VocabularyItem(es = "Pastillas", en = "PILLS", phonetic = "pils"),
                VocabularyItem(es = "Cuántos / Cuántas", en = "HOW MANY", phonetic = "jau méni"),
                VocabularyItem(es = "Haber (existencial - hay)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Pasado (auxiliar)", en = "DID", phonetic = "did"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Comprar", en = "BUY", phonetic = "bái"),
                VocabularyItem(es = "Para", en = "FOR", phonetic = "for"),
                VocabularyItem(es = "Personal", en = "PERSONAL", phonetic = "pörsonal"),
                VocabularyItem(es = "Uso", en = "USE", phonetic = "iús"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar (auxiliar pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Enviado", en = "SENT", phonetic = "sent"),
                VocabularyItem(es = "Análisis", en = "ANALYSIS", phonetic = "análisis")
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
                VocabularyItem(es = "Dosis", en = "DOSE", phonetic = "dóus"),
                VocabularyItem(es = "Envoltorio", en = "WRAP", phonetic = "rap"),
                VocabularyItem(es = "Parafernalia", en = "PARAPHERNALIA", phonetic = "parafernália"),
                VocabularyItem(es = "Cuántos / Cuántas", en = "HOW MANY", phonetic = "jau méni"),
                VocabularyItem(es = "Dosis (plural)", en = "DOSES", phonetic = "dóuses"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Haber (existencial - hay)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Tuyo / Suya", en = "YOURS", phonetic = "yors"),
                VocabularyItem(es = "Parece", en = "LOOKS LIKE", phonetic = "luks láik"),
                VocabularyItem(es = "Droga", en = "DRUG", phonetic = "drag"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Básculas", en = "SCALES", phonetic = "skéils"),
                VocabularyItem(es = "Equipamiento / Material", en = "EQUIPMENT", phonetic = "ikuípment"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar (auxiliar pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Incautado / Confiscado", en = "SEIZED", phonetic = "sízd"),
                VocabularyItem(es = "Quién", en = "WHO", phonetic = "ju"),
                VocabularyItem(es = "Hacer (auxiliar presente)", en = "DOES", phonetic = "das"),
                VocabularyItem(es = "Pertenecer", en = "BELONG", phonetic = "bilóng"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu")
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
                VocabularyItem(es = "Consumo / Uso", en = "USE", phonetic = "iús"),
                VocabularyItem(es = "Tenencia", en = "POSSESSION", phonetic = "posésion"),
                VocabularyItem(es = "Venta / Tráfico", en = "DEALING", phonetic = "díling"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Usando / Consumiendo", en = "USING", phonetic = "iúsing"),
                VocabularyItem(es = "Drogas", en = "DRUGS", phonetic = "dragz"),
                VocabularyItem(es = "Ahora mismo", en = "RIGHT NOW", phonetic = "ráit nau"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una (ante vocal)", en = "AN", phonetic = "an"),
                VocabularyItem(es = "Infracción / Delito", en = "OFFENCE", phonetic = "ofens"),
                VocabularyItem(es = "Vendiendo", en = "SELLING", phonetic = "séling"),
                VocabularyItem(es = "Estos / Estas", en = "THESE", phonetic = "dis"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Grave / Serio", en = "SERIOUS", phonetic = "sírios"),
                VocabularyItem(es = "Delito / Crimen", en = "CRIME", phonetic = "cráim"),
                VocabularyItem(es = "Cuánto tiempo", en = "HOW LONG", phonetic = "jau long"),
                VocabularyItem(es = "Haber (auxiliar)", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Sido / Estado (participio)", en = "BEEN", phonetic = "bin"),
                VocabularyItem(es = "Bajo", en = "UNDER", phonetic = "ánder"),
                VocabularyItem(es = "Detenido", en = "ARREST", phonetic = "arést"),
                VocabularyItem(es = "Para / Por", en = "FOR", phonetic = "for")
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
                VocabularyItem(es = "Síntoma", en = "SYMPTOM", phonetic = "símptom"),
                VocabularyItem(es = "Pupila", en = "PUPIL", phonetic = "piúpil"),
                VocabularyItem(es = "Confuso", en = "CONFUSED", phonetic = "konfiúsd"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Sintiéndose", en = "FEELING", phonetic = "fíling"),
                VocabularyItem(es = "Mal / Indispuesto", en = "UNWELL", phonetic = "anwél"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Pupilas", en = "PUPILS", phonetic = "piúpils"),
                VocabularyItem(es = "Dilatadas", en = "DILATED", phonetic = "dailéited"),
                VocabularyItem(es = "Parecer", en = "SEEM", phonetic = "sim"),
                VocabularyItem(es = "Bajo", en = "UNDER", phonetic = "ánder"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "di"),
                VocabularyItem(es = "Efectos / Influencia", en = "INFLUENCE", phonetic = "ínfluens"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Drogas", en = "DRUGS", phonetic = "dragz"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Caminar", en = "WALK", phonetic = "güok"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Recto", en = "STRAIGHT", phonetic = "stréit"),
                VocabularyItem(es = "Línea", en = "LINE", phonetic = "láin"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Comprobar", en = "CHECK", phonetic = "chek"),
                VocabularyItem(es = "Condición / Estado", en = "CONDITION", phonetic = "kondíshon")
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
                VocabularyItem(es = "Sobredosis", en = "OVERDOSE", phonetic = "óuverdóus"),
                VocabularyItem(es = "Inconsciente", en = "UNCONSCIOUS", phonetic = "ankónshos"),
                VocabularyItem(es = "Emergencia", en = "EMERGENCY", phonetic = "imöryensi"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Médico", en = "MEDICAL", phonetic = "médikal"),
                VocabularyItem(es = "Llamar", en = "CALL", phonetic = "col"),
                VocabularyItem(es = "Un / Una (ante vocal)", en = "AN", phonetic = "an"),
                VocabularyItem(es = "Ambulancia", en = "AMBULANCE", phonetic = "ámbiulans"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Él / Ella", en = "HE / SHE", phonetic = "ji/shi"),
                VocabularyItem(es = "Qué", en = "WHAT", phonetic = "guat"),
                VocabularyItem(es = "Pasado (auxiliar)", en = "DID", phonetic = "did"),
                VocabularyItem(es = "Ellos", en = "THEY", phonetic = "déi"),
                VocabularyItem(es = "Tomar / Tomaron", en = "TAKE", phonetic = "téik"),
                VocabularyItem(es = "Cuánto", en = "HOW MUCH", phonetic = "jau mach"),
                VocabularyItem(es = "Permanecer / Quedarse", en = "STAY", phonetic = "stéi"),
                VocabularyItem(es = "Con", en = "WITH", phonetic = "güiz"),
                VocabularyItem(es = "Ellos / Las / Los", en = "THEM", phonetic = "dem"),
                VocabularyItem(es = "Hasta que", en = "UNTIL", phonetic = "antíl"),
                VocabularyItem(es = "Ayuda", en = "HELP", phonetic = "jelp"),
                VocabularyItem(es = "Llega", en = "ARRIVES", phonetic = "aráivs")
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
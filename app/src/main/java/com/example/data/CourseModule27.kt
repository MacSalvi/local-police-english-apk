package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module27 = Module(
    moduleId = 27,
    moduleName = "Módulo 27: Falsedad documental e identificación de sospechosos",
    lessons = listOf(
        Lesson(
            lessonId = 2701,
            lessonTitle = "Detección de documentos falsificados o manipulados",
            vocabulary = listOf(
                VocabularyItem(es = "Falsificado", en = "FORGED", phonetic = "forllid"),
                VocabularyItem(es = "Manipulado", en = "TAMPERED", phonetic = "témpörd"),
                VocabularyItem(es = "Documento auténtico", en = "GENUINE DOCUMENT", phonetic = "yéniuin dókiument"),
                VocabularyItem(es = "Sospechoso (adj.)", en = "SUSPICIOUS", phonetic = "saspíshos"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Documento", en = "DOCUMENT", phonetic = "dókiument"),
                VocabularyItem(es = "Parece", en = "LOOKS", phonetic = "luks"),
                VocabularyItem(es = "Apunta / Parece", en = "APPEARS", phonetic = "apírs"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Ser / Estar", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Fotografía / Foto", en = "PHOTO", phonetic = "fóutou"),
                VocabularyItem(es = "Hacer (auxiliar tercera persona)", en = "DOES", phonetic = "das"),
                VocabularyItem(es = "No", en = "NOT", phonetic = "not"),
                VocabularyItem(es = "Coincidir", en = "MATCH", phonetic = "match"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Cara / Rostro", en = "FACE", phonetic = "féis"),
                VocabularyItem(es = "Haber (auxiliar)", en = "HAS", phonetic = "jas"),
                VocabularyItem(es = "Sido / Estado", en = "BEEN", phonetic = "bin"),
                VocabularyItem(es = "Con", en = "WITH", phonetic = "güiz"),
                VocabularyItem(es = "Seguridad", en = "SECURITY", phonetic = "sekiúriti"),
                VocabularyItem(es = "Características / Elementos", en = "FEATURES", phonetic = "fíchers"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Desaparecido / Faltante", en = "MISSING", phonetic = "mísing"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "Verificar", en = "VERIFY", phonetic = "vérifai"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Este documento parece sospechoso.",
                    en = "THIS DOCUMENT LOOKS SUSPICIOUS.",
                    phonetic = "dis dókiument luks saspíshos"
                ),
                PhraseItem(
                    es = "Este documento parece falsificado.",
                    en = "THIS DOCUMENT APPEARS TO BE FORGED.",
                    phonetic = "dis dókiument apírs tu bi forllid"
                ),
                PhraseItem(
                    es = "La foto no coincide con su rostro.",
                    en = "THE PHOTO DOES NOT MATCH YOUR FACE.",
                    phonetic = "de fóutou das not match yor féis"
                ),
                PhraseItem(
                    es = "Este documento ha sido manipulado.",
                    en = "THIS DOCUMENT HAS BEEN TAMPERED WITH.",
                    phonetic = "dis dókiument jas bin témpörd güiz"
                ),
                PhraseItem(
                    es = "Faltan las medidas de seguridad.",
                    en = "THE SECURITY FEATURES ARE MISSING.",
                    phonetic = "de sekiúriti fíchers ar mísing"
                ),
                PhraseItem(
                    es = "Necesito verificar este documento.",
                    en = "I NEED TO VERIFY THIS DOCUMENT.",
                    phonetic = "ai nid tu vérifai dis dókiument"
                ),
                PhraseItem(
                    es = "Este no es un documento auténtico.",
                    en = "THIS IS NOT A GENUINE DOCUMENT.",
                    phonetic = "dis is not a yéniuin dókiument"
                )
            )
        ),
        Lesson(
            lessonId = 2702,
            lessonTitle = "Discrepancias de identidad y verificación de datos filiatorios",
            vocabulary = listOf(
                VocabularyItem(es = "Discrepancia", en = "DISCREPANCY", phonetic = "diskrépansi"),
                VocabularyItem(es = "Filiación", en = "PERSONAL DETAILS", phonetic = "pörsonal ditéils"),
                VocabularyItem(es = "Coincidir", en = "MATCH", phonetic = "match"),
                VocabularyItem(es = "Confirmar", en = "CONFIRM", phonetic = "konfírm"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Nombre", en = "NAME", phonetic = "néim"),
                VocabularyItem(es = "Hacer (auxiliar tercera persona)", en = "DOES", phonetic = "das"),
                VocabularyItem(es = "No", en = "NOT", phonetic = "not"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Documento", en = "DOCUMENT", phonetic = "dókiument"),
                VocabularyItem(es = "Haber (existencial - hay)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Detalles / Datos", en = "DETAILS", phonetic = "ditéils"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Fecha", en = "DATE", phonetic = "déit"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Nacimiento", en = "BIRTH", phonetic = "berz"),
                VocabularyItem(es = "Otra vez / De nuevo", en = "AGAIN", phonetic = "aguén"),
                VocabularyItem(es = "Firma", en = "SIGNATURE", phonetic = "sígnacher"),
                VocabularyItem(es = "Por qué", en = "WHY", phonetic = "güai"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Identidad", en = "IDENTITY", phonetic = "aidéntiti"),
                VocabularyItem(es = "Realmente", en = "REALLY", phonetic = "ríali")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Su nombre no coincide con este documento.",
                    en = "YOUR NAME DOES NOT MATCH THIS DOCUMENT.",
                    phonetic = "yor néim das not match dis dókiument"
                ),
                PhraseItem(
                    es = "Hay una discrepancia en sus datos.",
                    en = "THERE IS A DISCREPANCY IN YOUR DETAILS.",
                    phonetic = "der is a diskrépansi in yor ditéils"
                ),
                PhraseItem(
                    es = "¿Puede confirmar de nuevo su fecha de nacimiento?",
                    en = "CAN YOU CONFIRM YOUR DATE OF BIRTH AGAIN?",
                    phonetic = "can yu konfírm yor déit ov berz aguén"
                ),
                PhraseItem(
                    es = "Esta firma no coincide.",
                    en = "THIS SIGNATURE DOES NOT MATCH.",
                    phonetic = "dis sígnacher das not match"
                ),
                PhraseItem(
                    es = "¿Por qué no coinciden sus datos?",
                    en = "WHY DO YOUR DETAILS NOT MATCH?",
                    phonetic = "güai du yor ditéils not match"
                ),
                PhraseItem(
                    es = "Necesito confirmar su identidad.",
                    en = "I NEED TO CONFIRM YOUR IDENTITY.",
                    phonetic = "ai nid tu konfírm yor aidéntiti"
                ),
                PhraseItem(
                    es = "¿Es este realmente su documento?",
                    en = "IS THIS REALLY YOUR DOCUMENT?",
                    phonetic = "is dis ríali yor dókiument"
                )
            )
        ),
        Lesson(
            lessonId = 2703,
            lessonTitle = "Requerimiento de segunda identificación",
            vocabulary = listOf(
                VocabularyItem(es = "Segunda identificación", en = "SECONDARY IDENTIFICATION", phonetic = "sékonderi aidentifikéishon"),
                VocabularyItem(es = "Tarjeta de crédito", en = "CREDIT CARD", phonetic = "crédit card"),
                VocabularyItem(es = "Adicional", en = "ADDITIONAL", phonetic = "adíshonal"),
                VocabularyItem(es = "Verificación cruzada", en = "CROSS-CHECK", phonetic = "cros-chek"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Otro", en = "OTHER", phonetic = "óder"),
                VocabularyItem(es = "Forma", en = "FORM", phonetic = "form"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Identificación", en = "ID", phonetic = "aidí"),
                VocabularyItem(es = "Mostrar", en = "SHOW", phonetic = "shou"),
                VocabularyItem(es = "Me", en = "ME", phonetic = "mi"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Segundo", en = "SECOND", phonetic = "sékond"),
                VocabularyItem(es = "Documento", en = "DOCUMENT", phonetic = "dókiument"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plis"),
                VocabularyItem(es = "Crédito", en = "CREDIT", phonetic = "crédit"),
                VocabularyItem(es = "Tarjeta", en = "CARD", phonetic = "card"),
                VocabularyItem(es = "Con", en = "WITH", phonetic = "güiz"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Nombre", en = "NAME", phonetic = "néim"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Información", en = "INFORMATION", phonetic = "informéishon"),
                VocabularyItem(es = "Documentación", en = "DOCUMENTATION", phonetic = "dokiumentéishon"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ayudar", en = "HELP", phonetic = "jelp"),
                VocabularyItem(es = "Confirmar", en = "CONFIRM", phonetic = "konfírm"),
                VocabularyItem(es = "Identidad", en = "IDENTITY", phonetic = "aidéntiti"),
                VocabularyItem(es = "Sin", en = "WITHOUT", phonetic = "güizáut"),
                VocabularyItem(es = "No poder", en = "CANNOT", phonetic = "kánot"),
                VocabularyItem(es = "Verificar", en = "VERIFY", phonetic = "vérifai")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Tiene otra forma de identificación?",
                    en = "DO YOU HAVE ANY OTHER FORM OF ID?",
                    phonetic = "du yu jav éni óder form ov aidí"
                ),
                PhraseItem(
                    es = "Muéstreme un segundo documento, por favor.",
                    en = "SHOW ME A SECOND DOCUMENT, PLEASE.",
                    phonetic = "shou mi a sékond dókiument, plis"
                ),
                PhraseItem(
                    es = "¿Tiene una tarjeta de crédito con su nombre?",
                    en = "DO YOU HAVE A CREDIT CARD WITH YOUR NAME?",
                    phonetic = "du yu jav a crédit card güiz yor néim"
                ),
                PhraseItem(
                    es = "Necesito verificar de forma cruzada su información.",
                    en = "I NEED TO CROSS-CHECK YOUR INFORMATION.",
                    phonetic = "ai nid tu cros-chek yor informéishon"
                ),
                PhraseItem(
                    es = "¿Tiene documentación adicional?",
                    en = "DO YOU HAVE ANY ADDITIONAL DOCUMENTATION?",
                    phonetic = "du yu jav éni adíshonal dokiumentéishon"
                ),
                PhraseItem(
                    es = "Esto ayudará a confirmar su identidad.",
                    en = "THIS WILL HELP CONFIRM YOUR IDENTITY.",
                    phonetic = "dis güil jelp konfírm yor aidéntiti"
                ),
                PhraseItem(
                    es = "Sin una segunda identificación, no puedo verificar esto.",
                    en = "WITHOUT SECOND ID, I CANNOT VERIFY THIS.",
                    phonetic = "güizáut sékond aidí, ai kánot vérifai dis"
                )
            )
        )
    )
)
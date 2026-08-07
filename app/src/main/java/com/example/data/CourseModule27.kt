package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module27 {
    val module = Module(
        id = 27,
        title = "Módulo 27",
        description = "Documentación falsa y fraude documental",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Documentación sospechosa e identificación del sospechoso",
                vocabulary = listOf(
                    VocabularyItem(term = "SUSPECT", phonetic = "sáspekt", translation = "Sospechoso"),
                    VocabularyItem(term = "IDENTITY DOCUMENT", phonetic = "aidéntiti dókiument", translation = "Documento de identidad"),
                    VocabularyItem(term = "PASSPORT", phonetic = "pásport", translation = "Pasaporte"),
                    VocabularyItem(term = "IDENTITY CARD", phonetic = "aidéntiti kad", translation = "Documento nacional de identidad"),
                    VocabularyItem(term = "DRIVING LICENCE", phonetic = "dráivin láisens", translation = "Permiso de conducir"),
                    VocabularyItem(term = "RESIDENCE PERMIT", phonetic = "résidens pérmit", translation = "Permiso de residencia"),
                    VocabularyItem(term = "RESIDENCE CARD", phonetic = "résidens kad", translation = "Tarjeta de residencia"),
                    VocabularyItem(term = "DOCUMENT HOLDER", phonetic = "dókiument jóulda", translation = "Titular del documento"),
                    VocabularyItem(term = "DOCUMENT NUMBER", phonetic = "dókiument námba", translation = "Número del documento"),
                    VocabularyItem(term = "DATE OF ISSUE", phonetic = "deit ov íshu", translation = "Fecha de expedición"),
                    VocabularyItem(term = "EXPIRY DATE", phonetic = "ikspáiri deit", translation = "Fecha de caducidad"),
                    VocabularyItem(term = "ISSUING AUTHORITY", phonetic = "íshuin ozóriti", translation = "Autoridad expedidora"),
                    VocabularyItem(term = "PHOTOGRAPH", phonetic = "fóutograf", translation = "Fotografía"),
                    VocabularyItem(term = "SIGNATURE", phonetic = "sígnacha", translation = "Firma"),
                    VocabularyItem(term = "SECURITY FEATURE", phonetic = "sikiúriti fícha", translation = "Medida de seguridad"),
                    VocabularyItem(term = "HOLOGRAM", phonetic = "jólogram", translation = "Holograma"),
                    VocabularyItem(term = "WATERMARK", phonetic = "uótermark", translation = "Marca de agua"),
                    VocabularyItem(term = "SECURITY THREAD", phonetic = "sikiúriti zred", translation = "Hilo de seguridad"),
                    VocabularyItem(term = "MICROPRINT", phonetic = "máikroprint", translation = "Microimpresión"),
                    VocabularyItem(term = "ULTRAVIOLET FEATURE", phonetic = "áltraváilot fícha", translation = "Elemento visible con luz UV"),
                    VocabularyItem(term = "OPTICALLY VARIABLE INK", phonetic = "óptikali váriabol ink", translation = "Tinta ópticamente variable"),
                    VocabularyItem(term = "RAISED PRINTING", phonetic = "réizd príntin", translation = "Impresión en relieve"),
                    VocabularyItem(term = "LAMINATE", phonetic = "lámineit", translation = "Laminado protector"),
                    VocabularyItem(term = "MACHINE READABLE ZONE (MRZ)", phonetic = "mashín ridabol zóun", translation = "Zona de lectura mecánica"),
                    VocabularyItem(term = "ALTERED DOCUMENT", phonetic = "ólterd dókiument", translation = "Documento alterado"),
                    VocabularyItem(term = "FORGED DOCUMENT", phonetic = "forlld dókiument", translation = "Documento falsificado"),
                    VocabularyItem(term = "COUNTERFEIT DOCUMENT", phonetic = "káunterfit dókiument", translation = "Documento falso"),
                    VocabularyItem(term = "GENUINE DOCUMENT", phonetic = "yényuin dókiument", translation = "Documento auténtico")
                ),
                phrases = listOf(
                    PhraseItem(english = "LOCAL POLICE. SHOW ME YOUR IDENTIFICATION.", phonetic = "lóukal polís shóu mi yor aidéntifikeishon", spanish = "Policía Local. Muéstreme su documentación."),
                    PhraseItem(english = "HAND ME YOUR PASSPORT.", phonetic = "jand mi yor pásport", spanish = "Entrégueme su pasaporte."),
                    PhraseItem(english = "PLEASE REMOVE THE DOCUMENT FROM ITS HOLDER.", phonetic = "plís rimúv de dókiument from its jóulda", spanish = "Saque el documento de la funda."),
                    PhraseItem(english = "PLACE THE DOCUMENT ON THE BONNET.", phonetic = "pleis de dókiument on de bónet", spanish = "Coloque el documento sobre el capó."),
                    PhraseItem(english = "DO NOT TOUCH THE DOCUMENT.", phonetic = "du not tach de dókiument", spanish = "No toque el documento."),
                    PhraseItem(english = "IS THIS YOUR DOCUMENT?", phonetic = "is dis yor dókiument", spanish = "¿Es este su documento?"),
                    PhraseItem(english = "IS THIS YOUR PHOTOGRAPH?", phonetic = "is dis yor fóutograf", spanish = "¿Es esta su fotografía?"),
                    PhraseItem(english = "SHOW ME THE DOCUMENT NUMBER.", phonetic = "shóu mi de dókiument námba", spanish = "Muéstreme el número del documento."),
                    PhraseItem(english = "SHOW ME THE DATE OF ISSUE.", phonetic = "shóu mi de deit ov íshu", spanish = "Muéstreme la fecha de expedición."),
                    PhraseItem(english = "SHOW ME THE EXPIRY DATE.", phonetic = "shóu mi di ikspáiri deit", spanish = "Muéstreme la fecha de caducidad."),
                    PhraseItem(english = "WHO ISSUED THIS DOCUMENT?", phonetic = "ju íshud dis dókiument", spanish = "¿Qué autoridad expidió este documento?"),
                    PhraseItem(english = "WHEN WAS THIS DOCUMENT ISSUED?", phonetic = "guen woz dis dókiument íshud", spanish = "¿Cuándo fue expedido?"),
                    PhraseItem(english = "WHEN DOES IT EXPIRE?", phonetic = "guen das it ikspáia", spanish = "¿Cuándo caduca?"),
                    PhraseItem(english = "PLEASE SPELL YOUR FULL NAME.", phonetic = "plís spel yor ful néim", spanish = "Deletree su nombre completo."),
                    PhraseItem(english = "IS THIS YOUR CURRENT ADDRESS?", phonetic = "is dis yor kárrent adrés", spanish = "¿Es este su domicilio actual?"),
                    PhraseItem(english = "WHERE DID YOU OBTAIN THIS DOCUMENT?", phonetic = "güea did yu obtéin dis dókiument", spanish = "¿Dónde obtuvo este documento?"),
                    PhraseItem(english = "WHO GAVE YOU THIS DOCUMENT?", phonetic = "ju geiv yu dis dókiument", spanish = "¿Quién le entregó este documento?"),
                    PhraseItem(english = "DID YOU APPLY FOR THIS DOCUMENT YOURSELF?", phonetic = "did yu aplái for dis dókiument yorsélf", spanish = "¿Solicitó usted personalmente este documento?"),
                    PhraseItem(english = "HAVE YOU REPORTED THIS DOCUMENT AS LOST OR STOLEN?", phonetic = "jav yu ripórtid dis dókiument az lost or stóulen", spanish = "¿Ha denunciado este documento como perdido o robado?"),
                    PhraseItem(english = "THIS DOCUMENT APPEARS TO HAVE BEEN ALTERED.", phonetic = "dis dókiument apíars tu jav bin ólterd", spanish = "Este documento parece haber sido alterado."),
                    PhraseItem(english = "THIS SECURITY FEATURE APPEARS TO BE MISSING.", phonetic = "dis sikiúriti fícha apíars tu bi mísin", spanish = "Parece faltar una medida de seguridad."),
                    PhraseItem(english = "THE HOLOGRAM DOES NOT LOOK GENUINE.", phonetic = "de jólogram das not luk yényuin", spanish = "El holograma no parece auténtico."),
                    PhraseItem(english = "THE PHOTOGRAPH DOES NOT MATCH YOUR APPEARANCE.", phonetic = "de fóutograf das not mach yor apíarans", spanish = "La fotografía no coincide con su aspecto."),
                    PhraseItem(english = "THE DETAILS DO NOT MATCH.", phonetic = "de díteils du not mach", spanish = "Los datos no coinciden."),
                    PhraseItem(english = "I AM GOING TO CARRY OUT FURTHER CHECKS.", phonetic = "ai am góuin tu kári aut férda cheks", spanish = "Voy a realizar más comprobaciones."),
                    PhraseItem(english = "I AM GOING TO KEEP THIS DOCUMENT WHILE WE COMPLETE OUR CHECKS.", phonetic = "ai am góuin tu kip dis dókiument guáil güi komplít aur cheks", spanish = "Voy a conservar este documento mientras realizamos las comprobaciones."),
                    PhraseItem(english = "PLEASE WAIT HERE.", phonetic = "plís güeit jía", spanish = "Espere aquí."),
                    PhraseItem(english = "DO NOT LEAVE UNTIL I TELL YOU.", phonetic = "du not liv antíl ai tel yu", spanish = "No se marche hasta que se lo indique."),
                    PhraseItem(english = "FOLLOW MY INSTRUCTIONS.", phonetic = "fólou mai instrákshons", spanish = "Siga mis instrucciones.")
                )
            )
        )
    )
}
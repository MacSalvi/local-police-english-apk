package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module25 {
    val module = Module(
        id = 25,
        title = "Módulo 25",
        description = "Ciudadanos extranjeros y documentación.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Ciudadanos extranjeros y documentación",
                vocabulary = listOf(
                    VocabularyItem(term = "FOREIGN NATIONAL", phonetic = "fórin náshonal", translation = "Ciudadano extranjero"),
                    VocabularyItem(term = "PASSPORT", phonetic = "pásport", translation = "Pasaporte"),
                    VocabularyItem(term = "IDENTITY CARD", phonetic = "aidéntiti kad", translation = "Documento nacional de identidad"),
                    VocabularyItem(term = "RESIDENCE PERMIT", phonetic = "résidens pérmit", translation = "Permiso de residencia"),
                    VocabularyItem(term = "RESIDENCE CARD", phonetic = "résidens kad", translation = "Tarjeta de residencia"),
                    VocabularyItem(term = "VISA", phonetic = "vísa", translation = "Visado"),
                    VocabularyItem(term = "ENTRY STAMP", phonetic = "éntri stamp", translation = "Sello de entrada"),
                    VocabularyItem(term = "BORDER", phonetic = "bóder", translation = "Frontera"),
                    VocabularyItem(term = "IMMIGRATION OFFICE", phonetic = "imigreishon ófis", translation = "Oficina de Extranjería"),
                    VocabularyItem(term = "NATIONAL POLICE", phonetic = "náshonal polís", translation = "Policía Nacional"),
                    VocabularyItem(term = "ORIGINAL DOCUMENT", phonetic = "oríllinal dókiument", translation = "Documento original"),
                    VocabularyItem(term = "COPY", phonetic = "cópi", translation = "Copia"),
                    VocabularyItem(term = "VALID", phonetic = "válid", translation = "Válido"),
                    VocabularyItem(term = "EXPIRED", phonetic = "ikspáiad", translation = "Caducado"),
                    VocabularyItem(term = "DOCUMENT HOLDER", phonetic = "dókiument jóulda", translation = "Titular del documento"),
                    VocabularyItem(term = "IDENTITY CHECK", phonetic = "aidéntiti chek", translation = "Comprobación de identidad")
                ),
                phrases = listOf(
                    PhraseItem(english = "GOOD AFTERNOON. LOCAL POLICE.", phonetic = "gud afternún. lóukal polís", spanish = "Buenas tardes. Policía Local."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR PASSPORT.", phonetic = "plís shóu mi yor pásport", spanish = "Muéstreme su pasaporte."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR IDENTITY CARD.", phonetic = "plís shóu mi yor aidéntiti kad", spanish = "Muéstreme su documento de identidad."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR RESIDENCE CARD.", phonetic = "plís shóu mi yor résidens kad", spanish = "Muéstreme su tarjeta de residencia."),
                    PhraseItem(english = "DO YOU HAVE ANY IDENTIFICATION WITH YOU?", phonetic = "du yu jav éni aidéntifikeishon güiz yu", spanish = "¿Lleva alguna documentación?"),
                    PhraseItem(english = "IS THIS YOUR PASSPORT?", phonetic = "is dis yor pásport", spanish = "¿Es este su pasaporte?"),
                    PhraseItem(english = "IS THIS DOCUMENT YOURS?", phonetic = "is dis dókiument yors", spanish = "¿Es este su documento?"),
                    PhraseItem(english = "PLEASE HAND ME THE DOCUMENT.", phonetic = "plís jand mi de dókiument", spanish = "Entrégueme el documento, por favor."),
                    PhraseItem(english = "PLEASE OPEN THE PASSPORT.", phonetic = "plís óupen de pásport", spanish = "Abra el pasaporte, por favor."),
                    PhraseItem(english = "PLEASE REMOVE THE DOCUMENT FROM THE COVER.", phonetic = "plís rimúv de dókiument from de káva", spanish = "Saque el documento de la funda."),
                    PhraseItem(english = "THIS DOCUMENT HAS EXPIRED.", phonetic = "dis dókiument jas ikspáiad", spanish = "Este documento está caducado."),
                    PhraseItem(english = "THIS DOCUMENT IS NOT VALID.", phonetic = "dis dókiument is not válid", spanish = "Este documento no es válido."),
                    PhraseItem(english = "DO YOU HAVE THE ORIGINAL DOCUMENT?", phonetic = "du yu jav di oríllinal dókiument", spanish = "¿Tiene el documento original?"),
                    PhraseItem(english = "A PHOTOCOPY IS NOT ENOUGH.", phonetic = "a fóutokopi is not ináf", spanish = "Una fotocopia no es suficiente."),
                    PhraseItem(english = "PLEASE KEEP YOUR DOCUMENT WITH YOU AT ALL TIMES.", phonetic = "plís kip yor dókiument güiz yu at ol táims", spanish = "Lleve siempre su documentación consigo."),
                    PhraseItem(english = "I NEED TO VERIFY YOUR IDENTITY.", phonetic = "ai nid tu vérifai yor aidéntiti", spanish = "Necesito comprobar su identidad."),
                    PhraseItem(english = "PLEASE WAIT WHILE I CHECK YOUR DETAILS.", phonetic = "plís güeit guáil ai chek yor díteils", spanish = "Espere mientras compruebo sus datos."),
                    PhraseItem(english = "THIS CHECK WILL ONLY TAKE A FEW MINUTES.", phonetic = "dis chek wil ónli teik a fiú mínits", spanish = "Esta comprobación solo tardará unos minutos."),
                    PhraseItem(english = "IF YOU HAVE ANY IMMIGRATION QUESTIONS, YOU MUST CONTACT THE NATIONAL POLICE.", phonetic = "if yu jav éni imigreishon kuéstchons yu mast cóntakt de náshonal polís", spanish = "Si tiene cuestiones de extranjería, debe dirigirse a la Policía Nacional."),
                    PhraseItem(english = "YOU NEED TO GO TO THE IMMIGRATION OFFICE.", phonetic = "yu nid tu góu tu di imigreishon ófis", spanish = "Debe acudir a la Oficina de Extranjería."),
                    PhraseItem(english = "YOU NEED TO RENEW YOUR RESIDENCE PERMIT.", phonetic = "yu nid tu riníu yor résidens pérmit", spanish = "Debe renovar su permiso de residencia."),
                    PhraseItem(english = "YOUR DOCUMENT APPEARS TO BE DAMAGED.", phonetic = "yor dókiument apíars tu bi dámalld", spanish = "Su documento parece estar deteriorado."),
                    PhraseItem(english = "PLEASE DO NOT LEAVE UNTIL THE CHECK IS FINISHED.", phonetic = "plís du not liv antíl de chek is fínisht", spanish = "No se marche hasta que finalice la comprobación."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module4 {
    val module = Module(
        id = 4,
        title = "Módulo 4",
        description = "Documentación personal, extranjería e identificación internacional.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Documentación y Extranjería",
                vocabulary = listOf(
                    VocabularyItem(term = "IDENTITY CARD", phonetic = "aidéntiti card", translation = "Documento nacional de identidad"),
                    VocabularyItem(term = "NATIONAL ID CARD", phonetic = "náshonal ai-di card", translation = "Documento nacional de identidad"),
                    VocabularyItem(term = "RESIDENCE PERMIT", phonetic = "résidens pérmit", translation = "Permiso de residencia"),
                    VocabularyItem(term = "VISA", phonetic = "vísa", translation = "Visado"),
                    VocabularyItem(term = "ENTRY STAMP", phonetic = "éntri stamp", translation = "Sello de entrada"),
                    VocabularyItem(term = "EXPIRY DATE", phonetic = "ekspáiri déit", translation = "Fecha de caducidad"),
                    VocabularyItem(term = "ISSUE DATE", phonetic = "íshu déit", translation = "Fecha de expedición"),
                    VocabularyItem(term = "ISSUING COUNTRY", phonetic = "íshuin cántri", translation = "País expedidor"),
                    VocabularyItem(term = "BORDER", phonetic = "bórda", translation = "Frontera"),
                    VocabularyItem(term = "CUSTOMS", phonetic = "cástoms", translation = "Aduana"),
                    VocabularyItem(term = "IMMIGRATION", phonetic = "imigreishon", translation = "Inmigración"),
                    VocabularyItem(term = "EUROPEAN UNION", phonetic = "yúropean yúnion", translation = "Unión Europea"),
                    VocabularyItem(term = "SCHENGEN AREA", phonetic = "shénguen éria", translation = "Espacio Schengen"),
                    VocabularyItem(term = "CITIZEN", phonetic = "sítisen", translation = "Ciudadano"),
                    VocabularyItem(term = "FOREIGN NATIONAL", phonetic = "fórin náshonal", translation = "Ciudadano extranjero"),
                    VocabularyItem(term = "RESIDENT", phonetic = "résident", translation = "Residente"),
                    VocabularyItem(term = "NON-RESIDENT", phonetic = "non résident", translation = "No residente"),
                    VocabularyItem(term = "PERMANENT RESIDENCE", phonetic = "pérmanant résidens", translation = "Residencia permanente"),
                    VocabularyItem(term = "TEMPORARY RESIDENCE", phonetic = "témporari résidens", translation = "Residencia temporal"),
                    VocabularyItem(term = "ADDRESS IN SPAIN", phonetic = "adrés in spéin", translation = "Domicilio en España"),
                    VocabularyItem(term = "COUNTRY OF RESIDENCE", phonetic = "cántri ov résidens", translation = "País de residencia"),
                    VocabularyItem(term = "CONSULATE", phonetic = "cónsiulat", translation = "Consulado"),
                    VocabularyItem(term = "EMBASSY", phonetic = "émbasi", translation = "Embajada")
                ),
                phrases = listOf(
                    PhraseItem(english = "PLEASE SHOW ME YOUR PASSPORT.", phonetic = "plís shóu mi yor pásport", spanish = "Muéstreme su pasaporte, por favor."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR RESIDENCE PERMIT.", phonetic = "plís shóu mi yor résidens pérmit", spanish = "Muéstreme su permiso de residencia, por favor."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR IDENTITY CARD.", phonetic = "plís shóu mi yor aidéntiti card", spanish = "Muéstreme su documento de identidad, por favor."),
                    PhraseItem(english = "ARE YOU A RESIDENT IN SPAIN?", phonetic = "ar yu a résident in spéin", spanish = "¿Reside en España?"),
                    PhraseItem(english = "HOW LONG HAVE YOU BEEN IN SPAIN?", phonetic = "jau long jav yu bin in spéin", spanish = "¿Cuánto tiempo lleva en España?"),
                    PhraseItem(english = "WHAT IS THE PURPOSE OF YOUR VISIT?", phonetic = "guot is de pérpos ov yor vísit", spanish = "¿Cuál es el motivo de su visita?"),
                    PhraseItem(english = "WHERE ARE YOU STAYING?", phonetic = "güea ar yu stéiin", spanish = "¿Dónde se aloja?"),
                    PhraseItem(english = "WHAT IS YOUR ADDRESS IN SPAIN?", phonetic = "guot is yor adrés in spéin", spanish = "¿Cuál es su dirección en España?"),
                    PhraseItem(english = "WHEN DID YOU ARRIVE IN SPAIN?", phonetic = "guen did yu arráiv in spéin", spanish = "¿Cuándo llegó a España?"),
                    PhraseItem(english = "WHEN ARE YOU LEAVING SPAIN?", phonetic = "guen ar yu lívin spéin", spanish = "¿Cuándo abandona España?"),
                    PhraseItem(english = "IS THIS YOUR CURRENT ADDRESS?", phonetic = "is dis yor cárrent adrés", spanish = "¿Es esta su dirección actual?"),
                    PhraseItem(english = "PLEASE CHECK THAT YOUR DOCUMENT IS VALID.", phonetic = "plís chek dat yor dókiument is válid", spanish = "Compruebe que su documento está en vigor."),
                    PhraseItem(english = "YOUR PASSPORT HAS EXPIRED.", phonetic = "yor pásport jas ekspáid", spanish = "Su pasaporte está caducado."),
                    PhraseItem(english = "YOUR DOCUMENT IS NOT VALID.", phonetic = "yor dókiument is not válid", spanish = "Su documento no es válido."),
                    PhraseItem(english = "YOUR DOCUMENT APPEARS TO BE DAMAGED.", phonetic = "yor dókiument apíars tu bi dámichd", spanish = "Su documento parece estar deteriorado."),
                    PhraseItem(english = "I NEED TO VERIFY YOUR DOCUMENTS.", phonetic = "ai nid tu vérifai yor dókiuments", spanish = "Necesito comprobar su documentación."),
                    PhraseItem(english = "PLEASE WAIT WHILE I CHECK YOUR DETAILS.", phonetic = "plís güeit guáil ai chek yor díteils", spanish = "Espere mientras compruebo sus datos."),
                    PhraseItem(english = "DO NOT LEAVE UNTIL I TELL YOU.", phonetic = "du not lív antíl ai tel yu", spanish = "No se marche hasta que se lo indique."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración."),
                    PhraseItem(english = "YOU MAY GO NOW.", phonetic = "yu méi góu náu", spanish = "Ya puede marcharse.")
                )
            )
        )
    )
}
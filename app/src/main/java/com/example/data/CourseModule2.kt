package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module2 {
    val module = Module(
        id = 2,
        title = "Módulo 2",
        description = "Identificación personal y comprobación de documentos.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Identificación y Documentación",
                vocabulary = listOf(
                    VocabularyItem(term = "IDENTITY", phonetic = "aidéntiti", translation = "Identidad"),
                    VocabularyItem(term = "IDENTIFY", phonetic = "aidéntifai", translation = "Identificar"),
                    VocabularyItem(term = "FULL NAME", phonetic = "ful néim", translation = "Nombre completo"),
                    VocabularyItem(term = "FIRST NAME", phonetic = "ferst néim", translation = "Nombre"),
                    VocabularyItem(term = "SURNAME", phonetic = "sérneim", translation = "Apellidos"),
                    VocabularyItem(term = "MIDDLE NAME", phonetic = "mídol néim", translation = "Segundo nombre"),
                    VocabularyItem(term = "DATE OF BIRTH", phonetic = "déit ov berth", translation = "Fecha de nacimiento"),
                    VocabularyItem(term = "PLACE OF BIRTH", phonetic = "pleis ov berth", translation = "Lugar de nacimiento"),
                    VocabularyItem(term = "NATIONALITY", phonetic = "nashonáliti", translation = "Nacionalidad"),
                    VocabularyItem(term = "COUNTRY", phonetic = "cántri", translation = "País"),
                    VocabularyItem(term = "ADDRESS", phonetic = "adrés", translation = "Dirección"),
                    VocabularyItem(term = "POSTCODE", phonetic = "póustkóud", translation = "Código postal"),
                    VocabularyItem(term = "CITY", phonetic = "síti", translation = "Ciudad"),
                    VocabularyItem(term = "HOTEL", phonetic = "joutél", translation = "Hotel"),
                    VocabularyItem(term = "ROOM", phonetic = "rum", translation = "Habitación"),
                    VocabularyItem(term = "HOME ADDRESS", phonetic = "jóum adrés", translation = "Domicilio"),
                    VocabularyItem(term = "TELEPHONE NUMBER", phonetic = "télefoun námba", translation = "Número de teléfono"),
                    VocabularyItem(term = "MOBILE PHONE", phonetic = "móubail fóun", translation = "Teléfono móvil"),
                    VocabularyItem(term = "EMAIL ADDRESS", phonetic = "ímeil adrés", translation = "Correo electrónico"),
                    VocabularyItem(term = "IDENTITY CARD", phonetic = "aidéntiti card", translation = "Documento nacional de identidad"),
                    VocabularyItem(term = "PASSPORT", phonetic = "pásport", translation = "Pasaporte"),
                    VocabularyItem(term = "DRIVING LICENCE", phonetic = "dráivin láisens", translation = "Permiso de conducir"),
                    VocabularyItem(term = "RESIDENCE PERMIT", phonetic = "résidence pérmit", translation = "Permiso de residencia"),
                    VocabularyItem(term = "DOCUMENT", phonetic = "dókiument", translation = "Documento"),
                    VocabularyItem(term = "PHOTOGRAPH", phonetic = "fóutograaf", translation = "Fotografía"),
                    VocabularyItem(term = "SIGNATURE", phonetic = "sígnacha", translation = "Firma"),
                    VocabularyItem(term = "OWNER", phonetic = "óuna", translation = "Titular"),
                    VocabularyItem(term = "VISITOR", phonetic = "vísita", translation = "Visitante"),
                    VocabularyItem(term = "TOURIST", phonetic = "túrist", translation = "Turista"),
                    VocabularyItem(term = "RESIDENT", phonetic = "résident", translation = "Residente")
                ),
                phrases = listOf(
                    PhraseItem(english = "I NEED TO IDENTIFY YOU.", phonetic = "ai nid tu aidéntifai yu", spanish = "Necesito identificarle."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR ID.", phonetic = "plís shóu mi yor ai-di", spanish = "Muéstreme su documento de identidad, por favor."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR PASSPORT.", phonetic = "plís shóu mi yor pásport", spanish = "Muéstreme su pasaporte, por favor."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR DRIVING LICENCE.", phonetic = "plís shóu mi yor dráivin láisens", spanish = "Muéstreme su permiso de conducir, por favor."),
                    PhraseItem(english = "DO YOU HAVE ANY IDENTIFICATION WITH YOU?", phonetic = "du yu jav éni aidéntifikeishon güiz yu", spanish = "¿Lleva alguna documentación encima?"),
                    PhraseItem(english = "WHAT IS YOUR FULL NAME?", phonetic = "guot is yor ful néim", spanish = "¿Cuál es su nombre completo?"),
                    PhraseItem(english = "PLEASE SPELL YOUR NAME.", phonetic = "plís spel yor néim", spanish = "Deletree su nombre, por favor."),
                    PhraseItem(english = "WHAT IS YOUR DATE OF BIRTH?", phonetic = "guot is yor déit ov berth", spanish = "¿Cuál es su fecha de nacimiento?"),
                    PhraseItem(english = "WHAT IS YOUR NATIONALITY?", phonetic = "guot is yor nashonáliti", spanish = "¿Cuál es su nacionalidad?"),
                    PhraseItem(english = "WHAT IS YOUR HOME ADDRESS?", phonetic = "guot is yor jóum adrés", spanish = "¿Cuál es su domicilio?"),
                    PhraseItem(english = "WHERE ARE YOU STAYING?", phonetic = "güea ar yu stéiin", spanish = "¿Dónde se aloja?"),
                    PhraseItem(english = "WHAT HOTEL ARE YOU STAYING AT?", phonetic = "guot joutél ar yu stéiin at", spanish = "¿En qué hotel se aloja?"),
                    PhraseItem(english = "WHAT IS YOUR ROOM NUMBER?", phonetic = "guot is yor rum námba", spanish = "¿Cuál es el número de su habitación?"),
                    PhraseItem(english = "WHAT IS YOUR TELEPHONE NUMBER?", phonetic = "guot is yor télefoun námba", spanish = "¿Cuál es su número de teléfono?"),
                    PhraseItem(english = "IS THIS YOUR PASSPORT?", phonetic = "is dis yor pásport", spanish = "¿Es este su pasaporte?"),
                    PhraseItem(english = "IS THIS YOUR DRIVING LICENCE?", phonetic = "is dis yor dráivin láisens", spanish = "¿Es este su permiso de conducir?"),
                    PhraseItem(english = "IS THIS YOUR DOCUMENT?", phonetic = "is dis yor dókiument", spanish = "¿Es este su documento?"),
                    PhraseItem(english = "ARE YOU THE OWNER OF THIS DOCUMENT?", phonetic = "ar yu di óuna ov dis dókiument", spanish = "¿Es usted el titular de este documento?"),
                    PhraseItem(english = "PLEASE KEEP YOUR DOCUMENT WITH YOU.", phonetic = "plís kip yor dókiument güiz yu", spanish = "Lleve siempre consigo su documentación."),
                    PhraseItem(english = "PLEASE TAKE YOUR DOCUMENTS OUT OF YOUR BAG.", phonetic = "plís teik yor dókiuments aut ov yor bag", spanish = "Saque su documentación de la bolsa, por favor."),
                    PhraseItem(english = "PLEASE PUT YOUR DOCUMENTS BACK.", phonetic = "plís put yor dókiuments bac", spanish = "Guarde de nuevo su documentación."),
                    PhraseItem(english = "PLEASE HOLD YOUR PASSPORT OPEN.", phonetic = "plís jóuld yor pásport óupen", spanish = "Mantenga el pasaporte abierto, por favor."),
                    PhraseItem(english = "PLEASE LET ME CHECK YOUR DOCUMENTS.", phonetic = "plís let mi chek yor dókiuments", spanish = "Permítame comprobar su documentación."),
                    PhraseItem(english = "I NEED TO VERIFY YOUR IDENTITY.", phonetic = "ai nid tu vérifai yor aidéntiti", spanish = "Necesito comprobar su identidad."),
                    PhraseItem(english = "THIS WILL ONLY TAKE A FEW MINUTES.", phonetic = "dis güil ónli teik a fiu mínits", spanish = "Esto solo llevará unos minutos."),
                    PhraseItem(english = "THANK YOU. YOUR DOCUMENTS ARE CORRECT.", phonetic = "zénk yu. yor dókiuments ar corréct", spanish = "Gracias. Su documentación es correcta."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración."),
                    PhraseItem(english = "YOU MAY KEEP YOUR DOCUMENTS.", phonetic = "yu méi kip yor dókiuments", spanish = "Puede guardar su documentación."),
                    PhraseItem(english = "YOU MAY GO NOW.", phonetic = "yu méi góu náu", spanish = "Ya puede marcharse.")
                )
            )
        )
    )
}
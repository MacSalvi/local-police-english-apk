package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module1 {
    val module = Module(
        id = 1,
        title = "Módulo 1",
        description = "Vocabulario y frases esenciales para la intervención policial.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Vocabulario Policial y Documentación",
                vocabulary = listOf(
                    VocabularyItem(term = "LOCAL POLICE", phonetic = "lóukal polís", translation = "Policía Local"),
                    VocabularyItem(term = "POLICE OFFICER", phonetic = "polís ófisa", translation = "Agente de policía"),
                    VocabularyItem(term = "POLICE", phonetic = "polís", translation = "Policía"),
                    VocabularyItem(term = "PATROL", phonetic = "patróul", translation = "Patrulla"),
                    VocabularyItem(term = "UNIFORM", phonetic = "yúniform", translation = "Uniforme"),
                    VocabularyItem(term = "BADGE", phonetic = "badch", translation = "Placa policial"),
                    VocabularyItem(term = "IDENTIFICATION", phonetic = "aidéntifikeishon", translation = "Identificación"),
                    VocabularyItem(term = "ID CARD", phonetic = "ai-di card", translation = "Documento de identidad"),
                    VocabularyItem(term = "PASSPORT", phonetic = "pásport", translation = "Pasaporte"),
                    VocabularyItem(term = "DRIVING LICENCE", phonetic = "dráivin láisens", translation = "Permiso de conducir"),
                    VocabularyItem(term = "DOCUMENT", phonetic = "dókiument", translation = "Documento"),
                    VocabularyItem(term = "NAME", phonetic = "néim", translation = "Nombre"),
                    VocabularyItem(term = "SURNAME", phonetic = "sérneim", translation = "Apellidos"),
                    VocabularyItem(term = "ADDRESS", phonetic = "adrés", translation = "Dirección"),
                    VocabularyItem(term = "TELEPHONE NUMBER", phonetic = "télefoun námba", translation = "Número de teléfono"),
                    VocabularyItem(term = "DATE OF BIRTH", phonetic = "déit ov berth", translation = "Fecha de nacimiento"),
                    VocabularyItem(term = "NATIONALITY", phonetic = "nashonáliti", translation = "Nacionalidad"),
                    VocabularyItem(term = "VISITOR", phonetic = "vísita", translation = "Visitante"),
                    VocabularyItem(term = "TOURIST", phonetic = "túrist", translation = "Turista"),
                    VocabularyItem(term = "HOTEL", phonetic = "joutél", translation = "Hotel"),
                    VocabularyItem(term = "APARTMENT", phonetic = "apártment", translation = "Apartamento"),
                    VocabularyItem(term = "EMERGENCY", phonetic = "imérllensi", translation = "Emergencia"),
                    VocabularyItem(term = "HELP", phonetic = "jelp", translation = "Ayuda"),
                    VocabularyItem(term = "ASSISTANCE", phonetic = "asístans", translation = "Asistencia"),
                    VocabularyItem(term = "PROBLEM", phonetic = "próblem", translation = "Problema"),
                    VocabularyItem(term = "SITUATION", phonetic = "sichuéishon", translation = "Situación"),
                    VocabularyItem(term = "INFORMATION", phonetic = "informéishon", translation = "Información"),
                    VocabularyItem(term = "QUESTION", phonetic = "kuéstchon", translation = "Pregunta"),
                    VocabularyItem(term = "ANSWER", phonetic = "ánsa", translation = "Respuesta"),
                    VocabularyItem(term = "INSTRUCTION", phonetic = "instrákshon", translation = "Instrucción"),
                    VocabularyItem(term = "COOPERATION", phonetic = "kouópareishon", translation = "Colaboración"),
                    VocabularyItem(term = "SAFETY", phonetic = "séifti", translation = "Seguridad"),
                    VocabularyItem(term = "ATTENTION", phonetic = "aténshon", translation = "Atención"),
                    VocabularyItem(term = "CALM", phonetic = "cam", translation = "Calma")
                ),
                phrases = listOf(
                    PhraseItem(english = "GOOD MORNING.", phonetic = "gud mórnin", spanish = "Buenos días."),
                    PhraseItem(english = "GOOD AFTERNOON.", phonetic = "gud afternún", spanish = "Buenas tardes."),
                    PhraseItem(english = "GOOD EVENING.", phonetic = "gud ívning", spanish = "Buenas noches."),
                    PhraseItem(english = "HELLO.", phonetic = "jelóu", spanish = "Hola."),
                    PhraseItem(english = "I'M A POLICE OFFICER WITH MARBELLA LOCAL POLICE.", phonetic = "aim a polís ófisa güiz marbéya lóukal polís", spanish = "Soy agente de la Policía Local de Marbella."),
                    PhraseItem(english = "PLEASE LISTEN TO ME.", phonetic = "plís lísen tu mi", spanish = "Escúcheme, por favor."),
                    PhraseItem(english = "PLEASE PAY ATTENTION.", phonetic = "plís péi aténshon", spanish = "Preste atención, por favor."),
                    PhraseItem(english = "PLEASE FOLLOW MY INSTRUCTIONS.", phonetic = "plís fólou mai instrákshons", spanish = "Siga mis instrucciones, por favor."),
                    PhraseItem(english = "PLEASE REMAIN CALM.", phonetic = "plís riméin cam", spanish = "Mantenga la calma, por favor."),
                    PhraseItem(english = "THERE IS NO PROBLEM.", phonetic = "dea is nóu próblem", spanish = "No hay ningún problema."),
                    PhraseItem(english = "EVERYTHING IS UNDER CONTROL.", phonetic = "évrizin is ánda contróul", spanish = "Todo está bajo control."),
                    PhraseItem(english = "WE ARE HERE TO HELP YOU.", phonetic = "güi ar jía tu jelp yu", spanish = "Estamos aquí para ayudarle."),
                    PhraseItem(english = "I NEED TO SPEAK TO YOU.", phonetic = "ai nid tu spik tu yu", spanish = "Necesito hablar con usted."),
                    PhraseItem(english = "I NEED SOME INFORMATION.", phonetic = "ai nid sam informéishon", spanish = "Necesito alguna información."),
                    PhraseItem(english = "PLEASE ANSWER MY QUESTIONS.", phonetic = "plís ánsa mai kuéstchons", spanish = "Responda a mis preguntas, por favor."),
                    PhraseItem(english = "PLEASE SPEAK SLOWLY.", phonetic = "plís spik slóuli", spanish = "Hable despacio, por favor."),
                    PhraseItem(english = "PLEASE SPEAK MORE SLOWLY.", phonetic = "plís spik mor slóuli", spanish = "Hable más despacio, por favor."),
                    PhraseItem(english = "PLEASE REPEAT THAT.", phonetic = "plís ripít dat", spanish = "Repítalo, por favor."),
                    PhraseItem(english = "I DON'T UNDERSTAND. PLEASE SPEAK SLOWLY.", phonetic = "ai dóunt ánderstand. plís spik slóuli", spanish = "No le entiendo. Hable despacio, por favor."),
                    PhraseItem(english = "DO YOU UNDERSTAND ME?", phonetic = "du yu ánderstand mi", spanish = "¿Me entiende?"),
                    PhraseItem(english = "IS EVERYTHING OK?", phonetic = "is évrizin oukéi", spanish = "¿Está todo bien?"),
                    PhraseItem(english = "WHAT HAPPENED?", phonetic = "guot jápend", spanish = "¿Qué ha ocurrido?"),
                    PhraseItem(english = "WHAT IS THE PROBLEM?", phonetic = "guot is de próblem", spanish = "¿Cuál es el problema?"),
                    PhraseItem(english = "CAN I HELP YOU?", phonetic = "can ai jelp yu", spanish = "¿Puedo ayudarle?"),
                    PhraseItem(english = "HOW CAN I HELP YOU?", phonetic = "jau can ai jelp yu", spanish = "¿En qué puedo ayudarle?"),
                    PhraseItem(english = "PLEASE WAIT A MOMENT.", phonetic = "plís güeit a móument", spanish = "Espere un momento, por favor."),
                    PhraseItem(english = "PLEASE WAIT HERE.", phonetic = "plís güeit jía", spanish = "Espere aquí, por favor."),
                    PhraseItem(english = "PLEASE COME WITH ME.", phonetic = "plís cam güiz mi", spanish = "Acompáñeme, por favor."),
                    PhraseItem(english = "PLEASE STAND HERE.", phonetic = "plís stand jía", spanish = "Colóquese aquí, por favor."),
                    PhraseItem(english = "PLEASE STAY WHERE YOU ARE.", phonetic = "plís stéi güea yu ar", spanish = "Permanezca donde está, por favor."),
                    PhraseItem(english = "PLEASE DON'T LEAVE.", phonetic = "plís dóunt lív", spanish = "No se marche, por favor."),
                    PhraseItem(english = "PLEASE DON'T TOUCH ANYTHING.", phonetic = "plís dóunt tach énitin", spanish = "No toque nada, por favor."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR ID.", phonetic = "plís shóu mi yor ai-di", spanish = "Muéstreme su documento de identidad, por favor."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR PASSPORT.", phonetic = "plís shóu mi yor pásport", spanish = "Muéstreme su pasaporte, por favor."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR DRIVING LICENCE.", phonetic = "plís shóu mi yor dráivin láisens", spanish = "Muéstreme su permiso de conducir, por favor."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración."),
                    PhraseItem(english = "THANK YOU FOR YOUR PATIENCE.", phonetic = "zénk yu for yor péishens", spanish = "Gracias por su paciencia."),
                    PhraseItem(english = "YOU MAY GO NOW.", phonetic = "yu méi góu náu", spanish = "Ya puede marcharse."),
                    PhraseItem(english = "HAVE A NICE DAY.", phonetic = "jav a nais déi", spanish = "Que tenga un buen día."),
                    PhraseItem(english = "STAY SAFE.", phonetic = "stéi séif", spanish = "Cuídese."),
                    PhraseItem(english = "GOODBYE.", phonetic = "gudbái", spanish = "Adiós.")
                )
            )
        )
    )
}
package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module24 {
    val module = Module(
        id = 24,
        title = "Módulo 24",
        description = "Alojamiento turístico y quejas por ruido",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Viviendas turísticas y molestias por ruido",
                vocabulary = listOf(
                    VocabularyItem(term = "HOLIDAY APARTMENT", phonetic = "hólidei apátment", translation = "Apartamento turístico"),
                    VocabularyItem(term = "TOURIST ACCOMMODATION", phonetic = "túrist akómodeishon", translation = "Alojamiento turístico"),
                    VocabularyItem(term = "BOOKING", phonetic = "búkin", translation = "Reserva"),
                    VocabularyItem(term = "GUEST", phonetic = "guest", translation = "Huésped"),
                    VocabularyItem(term = "HOST", phonetic = "jóust", translation = "Anfitrión"),
                    VocabularyItem(term = "PROPERTY OWNER", phonetic = "próperti óuna", translation = "Propietario"),
                    VocabularyItem(term = "PERSON IN CHARGE", phonetic = "pérson in charch", translation = "Responsable"),
                    VocabularyItem(term = "NOISE", phonetic = "noiz", translation = "Ruido"),
                    VocabularyItem(term = "LOUD MUSIC", phonetic = "laud miúsik", translation = "Música alta"),
                    VocabularyItem(term = "PARTY", phonetic = "párti", translation = "Fiesta"),
                    VocabularyItem(term = "LOUDSPEAKER", phonetic = "láudspika", translation = "Altavoz"),
                    VocabularyItem(term = "NEIGHBOUR", phonetic = "néiba", translation = "Vecino"),
                    VocabularyItem(term = "NOISE COMPLAINT", phonetic = "noiz kompléint", translation = "Queja por ruido"),
                    VocabularyItem(term = "DISTURBANCE", phonetic = "distérbans", translation = "Molestias"),
                    VocabularyItem(term = "PUBLIC PEACE", phonetic = "páblik pis", translation = "Tranquilidad pública"),
                    VocabularyItem(term = "MUNICIPAL BY-LAWS", phonetic = "miunísipol báilos", translation = "Ordenanzas municipales"),
                    VocabularyItem(term = "IDENTIFICATION", phonetic = "aidéntifikeishon", translation = "Documento de identidad"),
                    VocabularyItem(term = "PASSPORT", phonetic = "pásport", translation = "Pasaporte"),
                    VocabularyItem(term = "IDENTITY CARD", phonetic = "aidéntiti kad", translation = "Documento de identidad"),
                    VocabularyItem(term = "OFFICIAL REPORT", phonetic = "ofíshal ripót", translation = "Acta / denuncia administrativa"),
                    VocabularyItem(term = "WARNING", phonetic = "uórnin", translation = "Advertencia"),
                    VocabularyItem(term = "INFRINGEMENT", phonetic = "infrínchment", translation = "Infracción"),
                    VocabularyItem(term = "COMPLIANCE", phonetic = "kompláians", translation = "Cumplimiento")
                ),
                phrases = listOf(
                    PhraseItem(english = "LOCAL POLICE. PLEASE OPEN THE DOOR.", phonetic = "lóukal polís plís óupen de dor", spanish = "Policía Local. Abra la puerta, por favor."),
                    PhraseItem(english = "WE NEED TO SPEAK TO THE PERSON WHO RENTED THIS PROPERTY.", phonetic = "güi nid tu spik tu de pérson ju réntid dis próperti", spanish = "Necesitamos hablar con la persona que ha alquilado esta vivienda."),
                    PhraseItem(english = "WHO RENTED THIS APARTMENT?", phonetic = "ju réntid dis apátment", spanish = "¿Quién ha alquilado este apartamento?"),
                    PhraseItem(english = "ARE YOU THE PERSON WHO MADE THE BOOKING?", phonetic = "ar yu de pérson ju meid de búkin", spanish = "¿Es usted la persona que hizo la reserva?"),
                    PhraseItem(english = "WE HAVE RECEIVED A NOISE COMPLAINT.", phonetic = "güi jav risívd a noiz kompléint", spanish = "Hemos recibido una queja por ruido."),
                    PhraseItem(english = "YOUR MUSIC IS DISTURBING THE NEIGHBOURS.", phonetic = "yor miúsik is distérbin de néibas", spanish = "Su música está molestando a los vecinos."),
                    PhraseItem(english = "THE NEIGHBOURS CANNOT REST.", phonetic = "de néibas cánot rest", spanish = "Los vecinos no pueden descansar."),
                    PhraseItem(english = "PLEASE TURN THE MUSIC OFF.", phonetic = "plís tern de miúsik of", spanish = "Apague la música, por favor."),
                    PhraseItem(english = "PLEASE LOWER THE VOLUME IMMEDIATELY.", phonetic = "plís lóua de vólium imídiatli", spanish = "Baje el volumen inmediatamente."),
                    PhraseItem(english = "ASK YOUR GUESTS TO KEEP THE NOISE DOWN.", phonetic = "ask yor guests tu kip de noiz daun", spanish = "Pida a sus invitados que bajen el ruido."),
                    PhraseItem(english = "PLEASE KEEP YOUR VOICES DOWN.", phonetic = "plís kip yor vóicis daun", spanish = "Bajen la voz, por favor."),
                    PhraseItem(english = "PLEASE GO INSIDE THE APARTMENT.", phonetic = "plís góu insáid di apátment", spanish = "Entren en el apartamento, por favor."),
                    PhraseItem(english = "DO NOT MAKE ANY MORE NOISE.", phonetic = "du not meik éni mor noiz", spanish = "No hagan más ruido."),
                    PhraseItem(english = "YOU ARE BREACHING THE MUNICIPAL BY-LAWS.", phonetic = "yu ar bríchin de miunísipol báilos", spanish = "Está incumpliendo las ordenanzas municipales."),
                    PhraseItem(english = "I NEED TO SEE YOUR IDENTIFICATION.", phonetic = "ai nid tu si yor aidéntifikeishon", spanish = "Necesito ver su documentación."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR PASSPORT OR IDENTITY CARD.", phonetic = "plís shóu mi yor pásport or aidéntiti kad", spanish = "Muéstreme su pasaporte o documento de identidad."),
                    PhraseItem(english = "I AM RECORDING YOUR PERSONAL DETAILS.", phonetic = "ai am rikórdin yor pérsonal díteils", spanish = "Voy a tomar sus datos personales."),
                    PhraseItem(english = "YOUR DETAILS WILL BE INCLUDED IN THE OFFICIAL REPORT.", phonetic = "yor díteils güil bi inklúdid in di ofíshal ripót", spanish = "Sus datos se incluirán en el acta."),
                    PhraseItem(english = "THIS IS AN OFFICIAL WARNING.", phonetic = "dis is an ofíshal uórnin", spanish = "Esta es una advertencia oficial."),
                    PhraseItem(english = "THIS IS THE ONLY WARNING YOU WILL RECEIVE.", phonetic = "dis is di ónli uórnin yu güil risív", spanish = "Esta es la única advertencia que va a recibir."),
                    PhraseItem(english = "IF WE HAVE TO RETURN, AN OFFICIAL REPORT WILL BE FILED.", phonetic = "if güi jav tu ritérn an ofíshal ripót güil bi fáild", spanish = "Si tenemos que volver, se levantará un acta."),
                    PhraseItem(english = "IF WE ARE CALLED HERE AGAIN, FURTHER ACTION WILL BE TAKEN.", phonetic = "if güi ar kold jía aguén férda ákshon güil bi téiken", spanish = "Si vuelven a requerir nuestra presencia, se adoptarán nuevas medidas."),
                    PhraseItem(english = "YOU MUST FOLLOW OUR INSTRUCTIONS.", phonetic = "yu mast fólou aur instrákshons", spanish = "Debe seguir nuestras instrucciones."),
                    PhraseItem(english = "FAILING TO OBEY A LAWFUL POLICE ORDER MAY CONSTITUTE AN OFFENCE.", phonetic = "féilin tu obéi a lóful polís órder méi kónstitiut an oféns", spanish = "No obedecer una orden legítima de la policía puede constituir una infracción o un delito, según las circunstancias."),
                    PhraseItem(english = "DO YOU UNDERSTAND?", phonetic = "du yu ánderstánd", spanish = "¿Lo ha entendido?"),
                    PhraseItem(english = "PLEASE MAKE SURE THIS DOES NOT HAPPEN AGAIN.", phonetic = "plís meik shua dis das not jápen aguén", spanish = "Procure que esto no vuelva a ocurrir."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
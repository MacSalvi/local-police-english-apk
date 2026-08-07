package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module24 {
    val module = Module(
        id = 24,
        title = "M�dulo 24",
        description = "Viviendas tur�sticas y molestias por ruido.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Viviendas tur�sticas y molestias por ruido",
                vocabulary = listOf(
                    VocabularyItem(term = "HOLIDAY APARTMENT", phonetic = "h�lidei ap�tment", translation = "Apartamento tur�stico"),
                    VocabularyItem(term = "TOURIST ACCOMMODATION", phonetic = "t�rist ak�modeishon", translation = "Alojamiento tur�stico"),
                    VocabularyItem(term = "BOOKING", phonetic = "b�kin", translation = "Reserva"),
                    VocabularyItem(term = "GUEST", phonetic = "guest", translation = "Hu�sped"),
                    VocabularyItem(term = "HOST", phonetic = "j�ust", translation = "Anfitri�n"),
                    VocabularyItem(term = "PROPERTY OWNER", phonetic = "pr�perti �una", translation = "Propietario"),
                    VocabularyItem(term = "PERSON IN CHARGE", phonetic = "p�rson in charch", translation = "Responsable"),
                    VocabularyItem(term = "NOISE", phonetic = "noiz", translation = "Ruido"),
                    VocabularyItem(term = "LOUD MUSIC", phonetic = "laud mi�sik", translation = "M�sica alta"),
                    VocabularyItem(term = "PARTY", phonetic = "p�rti", translation = "Fiesta"),
                    VocabularyItem(term = "LOUDSPEAKER", phonetic = "l�udspika", translation = "Altavoz"),
                    VocabularyItem(term = "NEIGHBOUR", phonetic = "n�iba", translation = "Vecino"),
                    VocabularyItem(term = "NOISE COMPLAINT", phonetic = "noiz kompl�int", translation = "Queja por ruido"),
                    VocabularyItem(term = "DISTURBANCE", phonetic = "dist�rbans", translation = "Molestias"),
                    VocabularyItem(term = "PUBLIC PEACE", phonetic = "p�blik pis", translation = "Tranquilidad p�blica"),
                    VocabularyItem(term = "MUNICIPAL BY-LAWS", phonetic = "miun�sipol b�ilos", translation = "Ordenanzas municipales"),
                    VocabularyItem(term = "IDENTIFICATION", phonetic = "aid�ntifikeishon", translation = "Documento de identidad"),
                    VocabularyItem(term = "PASSPORT", phonetic = "p�sport", translation = "Pasaporte"),
                    VocabularyItem(term = "IDENTITY CARD", phonetic = "aid�ntiti kad", translation = "Documento de identidad"),
                    VocabularyItem(term = "OFFICIAL REPORT", phonetic = "of�shal rip�t", translation = "Acta / denuncia administrativa"),
                    VocabularyItem(term = "WARNING", phonetic = "u�rnin", translation = "Advertencia"),
                    VocabularyItem(term = "INFRINGEMENT", phonetic = "infr�nchment", translation = "Infracci�n"),
                    VocabularyItem(term = "COMPLIANCE", phonetic = "kompl�ians", translation = "Cumplimiento")
                ),
                phrases = listOf(
                    PhraseItem(english = "LOCAL POLICE. PLEASE OPEN THE DOOR.", phonetic = "l�ukal pol�s pl�s �upen de dor", spanish = "Polic�a Local. Abra la puerta, por favor."),
                    PhraseItem(english = "WE NEED TO SPEAK TO THE PERSON WHO RENTED THIS PROPERTY.", phonetic = "g�i nid tu spik tu de p�rson ju r�ntid dis pr�perti", spanish = "Necesitamos hablar con la persona que ha alquilado esta vivienda."),
                    PhraseItem(english = "WHO RENTED THIS APARTMENT?", phonetic = "ju r�ntid dis ap�tment", spanish = "�Qui�n ha alquilado este apartamento?"),
                    PhraseItem(english = "ARE YOU THE PERSON WHO MADE THE BOOKING?", phonetic = "ar yu de p�rson ju meid de b�kin", spanish = "�Es usted la persona que hizo la reserva?"),
                    PhraseItem(english = "WE HAVE RECEIVED A NOISE COMPLAINT.", phonetic = "g�i jav ris�vd a noiz kompl�int", spanish = "Hemos recibido una queja por ruido."),
                    PhraseItem(english = "YOUR MUSIC IS DISTURBING THE NEIGHBOURS.", phonetic = "yor mi�sik is dist�rbin de n�ibas", spanish = "Su m�sica est� molestando a los vecinos."),
                    PhraseItem(english = "THE NEIGHBOURS CANNOT REST.", phonetic = "de n�ibas c�not rest", spanish = "Los vecinos no pueden descansar."),
                    PhraseItem(english = "PLEASE TURN THE MUSIC OFF.", phonetic = "pl�s tern de mi�sik of", spanish = "Apague la m�sica, por favor."),
                    PhraseItem(english = "PLEASE LOWER THE VOLUME IMMEDIATELY.", phonetic = "pl�s l�ua de v�lium im�diatli", spanish = "Baje el volumen inmediatamente."),
                    PhraseItem(english = "ASK YOUR GUESTS TO KEEP THE NOISE DOWN.", phonetic = "ask yor guests tu kip de noiz daun", spanish = "Pida a sus invitados que bajen el ruido."),
                    PhraseItem(english = "PLEASE KEEP YOUR VOICES DOWN.", phonetic = "pl�s kip yor v�icis daun", spanish = "Bajen la voz, por favor."),
                    PhraseItem(english = "PLEASE GO INSIDE THE APARTMENT.", phonetic = "pl�s g�u ins�id di ap�tment", spanish = "Entren en el apartamento, por favor."),
                    PhraseItem(english = "DO NOT MAKE ANY MORE NOISE.", phonetic = "du not meik �ni mor noiz", spanish = "No hagan m�s ruido."),
                    PhraseItem(english = "YOU ARE BREACHING THE MUNICIPAL BY-LAWS.", phonetic = "yu ar br�chin de miun�sipol b�ilos", spanish = "Est� incumpliendo las ordenanzas municipales."),
                    PhraseItem(english = "I NEED TO SEE YOUR IDENTIFICATION.", phonetic = "ai nid tu si yor aid�ntifikeishon", spanish = "Necesito ver su documentaci�n."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR PASSPORT OR IDENTITY CARD.", phonetic = "pl�s sh�u mi yor p�sport or aid�ntiti kad", spanish = "Mu�streme su pasaporte o documento de identidad."),
                    PhraseItem(english = "I AM RECORDING YOUR PERSONAL DETAILS.", phonetic = "ai am rik�rdin yor p�rsonal d�teils", spanish = "Voy a tomar sus datos personales."),
                    PhraseItem(english = "YOUR DETAILS WILL BE INCLUDED IN THE OFFICIAL REPORT.", phonetic = "yor d�teils g�il bi inkl�did in di of�shal rip�t", spanish = "Sus datos se incluir�n en el acta."),
                    PhraseItem(english = "THIS IS AN OFFICIAL WARNING.", phonetic = "dis is an of�shal u�rnin", spanish = "Esta es una advertencia oficial."),
                    PhraseItem(english = "THIS IS THE ONLY WARNING YOU WILL RECEIVE.", phonetic = "dis is di �nli u�rnin yu g�il ris�v", spanish = "Esta es la �nica advertencia que va a recibir."),
                    PhraseItem(english = "IF WE HAVE TO RETURN, AN OFFICIAL REPORT WILL BE FILED.", phonetic = "if g�i jav tu rit�rn an of�shal rip�t g�il bi f�ild", spanish = "Si tenemos que volver, se levantar� un acta."),
                    PhraseItem(english = "IF WE ARE CALLED HERE AGAIN, FURTHER ACTION WILL BE TAKEN.", phonetic = "if g�i ar kold j�a agu�n f�rda �kshon g�il bi t�iken", spanish = "Si vuelven a requerir nuestra presencia, se adoptar�n nuevas medidas."),
                    PhraseItem(english = "YOU MUST FOLLOW OUR INSTRUCTIONS.", phonetic = "yu mast f�lou aur instr�kshons", spanish = "Debe seguir nuestras instrucciones."),
                    PhraseItem(english = "FAILING TO OBEY A LAWFUL POLICE ORDER MAY CONSTITUTE AN OFFENCE.", phonetic = "f�ilin tu ob�i a l�ful pol�s �rder m�i k�nstitiut an of�ns", spanish = "No obedecer una orden leg�tima de la polic�a puede constituir una infracci�n o un delito, seg�n las circunstancias."),
                    PhraseItem(english = "DO YOU UNDERSTAND?", phonetic = "du yu �nderst�nd", spanish = "�Lo ha entendido?"),
                    PhraseItem(english = "PLEASE MAKE SURE THIS DOES NOT HAPPEN AGAIN.", phonetic = "pl�s meik shua dis das not j�pen agu�n", spanish = "Procure que esto no vuelva a ocurrir."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "z�nk yu for yor kou�pareishon", spanish = "Gracias por su colaboraci�n.")
                )
            )
        )
    )
}
package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module9 {
    val module = Module(
        id = 9,
        title = "Módulo 9",
        description = "Retirada por grúa e inmovilización del vehículo.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Retirada por grúa e inmovilización",
                vocabulary = listOf(
                    VocabularyItem(term = "RECOVERY VEHICLE", phonetic = "rikóveri víikol", translation = "Grúa municipal"),
                    VocabularyItem(term = "VEHICLE POUND", phonetic = "víikol paund", translation = "Depósito municipal de vehículos"),
                    VocabularyItem(term = "WHEEL CLAMP", phonetic = "juíl clamp", translation = "Cepo"),
                    VocabularyItem(term = "IMMOBILISATION", phonetic = "imóbilaiséishon", translation = "Inmovilización"),
                    VocabularyItem(term = "REMOVAL", phonetic = "rimúvol", translation = "Retirada del vehículo"),
                    VocabularyItem(term = "RELEASE", phonetic = "rilís", translation = "Liberación del vehículo"),
                    VocabularyItem(term = "RELEASE FEE", phonetic = "rilís fi", translation = "Tasa de retirada"),
                    VocabularyItem(term = "NOTICE", phonetic = "nóutis", translation = "Notificación"),
                    VocabularyItem(term = "RECEIPT", phonetic = "risít", translation = "Recibo"),
                    VocabularyItem(term = "AUTHORISATION", phonetic = "ozoraiséishon", translation = "Autorización"),
                    VocabularyItem(term = "PERSONAL BELONGINGS", phonetic = "pérsonal bilóngins", translation = "Objetos personales"),
                    VocabularyItem(term = "VALUABLES", phonetic = "váliuabols", translation = "Objetos de valor"),
                    VocabularyItem(term = "COLLECTION", phonetic = "colékshon", translation = "Recogida"),
                    VocabularyItem(term = "OWNER", phonetic = "óuna", translation = "Titular"),
                    VocabularyItem(term = "REGISTERED KEEPER", phonetic = "rellísted kípa", translation = "Titular registral"),
                    VocabularyItem(term = "PROCEDURE", phonetic = "prosídya", translation = "Procedimiento")
                ),
                phrases = listOf(
                    PhraseItem(english = "A RECOVERY VEHICLE HAS BEEN CALLED.", phonetic = "a rikóveri víikol jas bin cold", spanish = "Se ha solicitado la grúa."),
                    PhraseItem(english = "YOUR VEHICLE WILL BE REMOVED.", phonetic = "yor víikol wil bi rimúvd", spanish = "Su vehículo será retirado."),
                    PhraseItem(english = "YOUR VEHICLE HAS BEEN REMOVED.", phonetic = "yor víikol jas bin rimúvd", spanish = "Su vehículo ha sido retirado."),
                    PhraseItem(english = "YOUR VEHICLE HAS BEEN TAKEN TO THE VEHICLE POUND.", phonetic = "yor víikol jas bin téiken tu de víikol paund", spanish = "Su vehículo ha sido trasladado al depósito municipal."),
                    PhraseItem(english = "YOUR VEHICLE HAS BEEN CLAMPED.", phonetic = "yor víikol jas bin clampt", spanish = "Su vehículo ha sido inmovilizado con un cepo."),
                    PhraseItem(english = "YOU MUST NOT MOVE THE VEHICLE.", phonetic = "yu mast not muv de víikol", spanish = "No debe mover el vehículo."),
                    PhraseItem(english = "PLEASE REMOVE YOUR PERSONAL BELONGINGS.", phonetic = "plís rimúv yor pérsonal bilóngins", spanish = "Retire sus objetos personales."),
                    PhraseItem(english = "PLEASE DO NOT LEAVE ANY VALUABLES INSIDE THE VEHICLE.", phonetic = "plís du not liv éni váliuabols insáid de víikol", spanish = "No deje objetos de valor en el vehículo."),
                    PhraseItem(english = "YOU CAN COLLECT YOUR VEHICLE FROM THE VEHICLE POUND.", phonetic = "yu can colékt yor víikol from de víikol paund", spanish = "Puede recoger su vehículo en el depósito municipal."),
                    PhraseItem(english = "YOU WILL NEED THIS NOTICE TO COLLECT YOUR VEHICLE.", phonetic = "yu wil nid dis nóutis tu colékt yor víikol", spanish = "Necesitará esta notificación para recoger el vehículo."),
                    PhraseItem(english = "YOU WILL NEED TO PAY THE RELEASE FEE.", phonetic = "yu wil nid tu pei de rilís fi", spanish = "Deberá abonar la tasa de retirada."),
                    PhraseItem(english = "PLEASE KEEP THIS RECEIPT.", phonetic = "plís kip dis risít", spanish = "Conserve este recibo."),
                    PhraseItem(english = "I WILL EXPLAIN THE PROCEDURE.", phonetic = "ail ikspléin de prosídya", spanish = "Le explicaré el procedimiento."),
                    PhraseItem(english = "IF YOU HAVE ANY QUESTIONS, PLEASE ASK ME.", phonetic = "if yu jav éni kuéstchons plís ask mi", spanish = "Si tiene alguna duda, pregúntemela."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module28 {
    val module = Module(
        id = 28,
        title = "Módulo 28",
        description = "Vehículo retirado por la grúa.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Vehículo retirado por la grúa",
                vocabulary = listOf(
                    VocabularyItem(term = "TOW TRUCK", phonetic = "tóu trak", translation = "Grúa"),
                    VocabularyItem(term = "TOWING", phonetic = "tóuin", translation = "Retirada mediante grúa"),
                    VocabularyItem(term = "TO TOW", phonetic = "tu tóu", translation = "Retirar mediante grúa"),
                    VocabularyItem(term = "VEHICLE POUND", phonetic = "víikol paund", translation = "Depósito de vehículos"),
                    VocabularyItem(term = "IMPOUNDED VEHICLE", phonetic = "impáundid víikol", translation = "Vehículo depositado"),
                    VocabularyItem(term = "RECOVERY CHARGE", phonetic = "rikóveri charch", translation = "Tasa de retirada"),
                    VocabularyItem(term = "STORAGE CHARGE", phonetic = "stórich charch", translation = "Tasa de estancia"),
                    VocabularyItem(term = "VEHICLE OWNER", phonetic = "víikol óuna", translation = "Titular del vehículo"),
                    VocabularyItem(term = "PROOF OF IDENTITY", phonetic = "pruf ov aidéntiti", translation = "Documento acreditativo de identidad"),
                    VocabularyItem(term = "PROOF OF OWNERSHIP", phonetic = "pruf ov óunership", translation = "Acreditación de titularidad"),
                    VocabularyItem(term = "DRIVING LICENCE", phonetic = "dráivin láisens", translation = "Permiso de conducir"),
                    VocabularyItem(term = "VEHICLE REGISTRATION DOCUMENT", phonetic = "víikol rellistréishon dókiument", translation = "Documento de matriculación"),
                    VocabularyItem(term = "INSURANCE CERTIFICATE", phonetic = "inshúarans satífiket", translation = "Certificado de seguro"),
                    VocabularyItem(term = "RELEASE", phonetic = "rilís", translation = "Entrega del vehículo"),
                    VocabularyItem(term = "TO RECLAIM A VEHICLE", phonetic = "tu rikléim a víikol", translation = "Recuperar un vehículo"),
                    VocabularyItem(term = "ABANDONED VEHICLE", phonetic = "abandond víikol", translation = "Vehículo abandonado"),
                    VocabularyItem(term = "BREAKDOWN", phonetic = "bréikdaun", translation = "Avería"),
                    VocabularyItem(term = "OBSTRUCTION", phonetic = "obstrákshon", translation = "Obstaculización")
                ),
                phrases = listOf(
                    PhraseItem(english = "LOCAL POLICE.", phonetic = "lóukal polís", spanish = "Policía Local."),
                    PhraseItem(english = "YOUR VEHICLE HAS BEEN TOWED AWAY.", phonetic = "yor víikol jas bin tóud aguéi", spanish = "Su vehículo ha sido retirado por la grúa."),
                    PhraseItem(english = "YOUR VEHICLE HAS BEEN REMOVED.", phonetic = "yor víikol jas bin rimúvd", spanish = "Su vehículo ha sido retirado."),
                    PhraseItem(english = "YOUR VEHICLE HAS BEEN TAKEN TO THE VEHICLE POUND.", phonetic = "yor víikol jas bin téiken tu de víikol paund", spanish = "Su vehículo ha sido trasladado al depósito de vehículos."),
                    PhraseItem(english = "YOUR VEHICLE HAS NOT BEEN STOLEN.", phonetic = "yor víikol jas not bin stóulen", spanish = "Su vehículo no ha sido robado."),
                    PhraseItem(english = "YOU NEED TO GO TO THE VEHICLE POUND.", phonetic = "yu nid tu góu tu de víikol paund", spanish = "Debe acudir al depósito de vehículos."),
                    PhraseItem(english = "YOU CAN RECLAIM YOUR VEHICLE THERE.", phonetic = "yu can rikléim yor víikol dea", spanish = "Allí podrá recuperar su vehículo."),
                    PhraseItem(english = "YOU WILL NEED PROOF OF IDENTITY.", phonetic = "yu wil nid pruf ov aidéntiti", spanish = "Necesitará acreditar su identidad."),
                    PhraseItem(english = "YOU WILL NEED YOUR DRIVING LICENCE.", phonetic = "yu wil nid yor dráivin láisens", spanish = "Necesitará su permiso de conducir."),
                    PhraseItem(english = "YOU WILL NEED THE VEHICLE REGISTRATION DOCUMENT.", phonetic = "yu wil nid de víikol rellistréishon dókiument", spanish = "Necesitará el documento de matriculación del vehículo."),
                    PhraseItem(english = "YOU WILL NEED PROOF OF OWNERSHIP.", phonetic = "yu wil nid pruf ov óunership", spanish = "Necesitará acreditar que es el titular del vehículo."),
                    PhraseItem(english = "IF YOU ARE NOT THE OWNER, YOU MUST BE AUTHORISED TO COLLECT THE VEHICLE.", phonetic = "if yu ar not di óuna yu mast bi ózoraizd tu kolékt de víikol", spanish = "Si no es el titular, debe estar autorizado para retirar el vehículo."),
                    PhraseItem(english = "YOU WILL HAVE TO PAY THE RECOVERY CHARGE.", phonetic = "yu wil jav tu péi de rikóveri charch", spanish = "Tendrá que pagar la tasa de retirada."),
                    PhraseItem(english = "STORAGE CHARGES MAY ALSO APPLY.", phonetic = "stórich chárchiz méi ólso aplái", spanish = "También pueden aplicarse tasas de estancia."),
                    PhraseItem(english = "THE VEHICLE CANNOT BE RELEASED UNTIL THE PROCEDURE IS COMPLETED.", phonetic = "de víikol kánot bi rilíst antíl de prosílla is komplítid", spanish = "El vehículo no puede entregarse hasta completar el procedimiento."),
                    PhraseItem(english = "YOUR VEHICLE WAS TOWED BECAUSE IT WAS CAUSING AN OBSTRUCTION.", phonetic = "yor víikol woz tóud bikóz it woz kósin an obstrákshon", spanish = "Su vehículo fue retirado porque estaba obstaculizando la circulación."),
                    PhraseItem(english = "YOUR VEHICLE WAS PARKED IN A PROHIBITED PLACE.", phonetic = "yor víikol woz parkt in a proibítid pleis", spanish = "Su vehículo estaba estacionado en un lugar prohibido."),
                    PhraseItem(english = "YOUR VEHICLE WAS REMOVED FOR SAFETY REASONS.", phonetic = "yor víikol woz rimúvd for séifti rísons", spanish = "Su vehículo fue retirado por motivos de seguridad."),
                    PhraseItem(english = "THE STAFF AT THE VEHICLE POUND WILL HELP YOU.", phonetic = "de staf at de víikol paund wil jelp yu", spanish = "El personal del depósito le ayudará."),
                    PhraseItem(english = "PLEASE FOLLOW THEIR INSTRUCTIONS.", phonetic = "plís fólou dea instrákshons", spanish = "Siga sus instrucciones."),
                    PhraseItem(english = "DO YOU KNOW WHERE THE VEHICLE POUND IS?", phonetic = "du yu nóu güea de víikol paund is", spanish = "¿Sabe dónde está el depósito de vehículos?"),
                    PhraseItem(english = "I CAN SHOW YOU HOW TO GET THERE.", phonetic = "ai can shóu yu jau tu get dea", spanish = "Puedo indicarle cómo llegar."),
                    PhraseItem(english = "IF YOU HAVE ANY QUESTIONS, PLEASE ASK THE STAFF AT THE VEHICLE POUND.", phonetic = "if yu jav éni kuéstions plís ask de staf at de víikol paund", spanish = "Si tiene alguna duda, pregunte al personal del depósito."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
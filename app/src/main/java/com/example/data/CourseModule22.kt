package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module22 {
    val module = Module(
        id = 22,
        title = "Módulo 22",
        description = "Trámites administrativos, documentación y atención al ciudadano",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Trámites administrativos y orientación al ciudadano",
                vocabulary = listOf(
                    VocabularyItem(term = "TOWN HALL", phonetic = "taun jol", translation = "Ayuntamiento"),
                    VocabularyItem(term = "CITIZEN SERVICE OFFICE", phonetic = "sítizen sérvis ófis", translation = "Oficina de Atención al Ciudadano"),
                    VocabularyItem(term = "MUNICIPAL REGISTER", phonetic = "miunísipol réllista", translation = "Registro General"),
                    VocabularyItem(term = "APPLICATION", phonetic = "aplicéishon", translation = "Solicitud"),
                    VocabularyItem(term = "APPLICATION FORM", phonetic = "aplicéishon form", translation = "Impreso de solicitud"),
                    VocabularyItem(term = "WRITTEN REQUEST", phonetic = "ríten riküést", translation = "Instancia"),
                    VocabularyItem(term = "ADMINISTRATIVE APPEAL", phonetic = "admínistrativ apíl", translation = "Recurso administrativo"),
                    VocabularyItem(term = "CERTIFICATE", phonetic = "sertífiket", translation = "Certificado"),
                    VocabularyItem(term = "DOCUMENT", phonetic = "dókiument", translation = "Documento"),
                    VocabularyItem(term = "REFERENCE NUMBER", phonetic = "réferens nómba", translation = "Número de referencia"),
                    VocabularyItem(term = "APPOINTMENT", phonetic = "apóintment", translation = "Cita previa"),
                    VocabularyItem(term = "ONLINE APPOINTMENT", phonetic = "onláin apóintment", translation = "Cita previa por Internet"),
                    VocabularyItem(term = "ELECTRONIC OFFICE", phonetic = "ilektrónik ófis", translation = "Sede electrónica"),
                    VocabularyItem(term = "DIGITAL CERTIFICATE", phonetic = "dillital sertífiket", translation = "Certificado digital"),
                    VocabularyItem(term = "ELECTRONIC ID", phonetic = "ilektrónik aidí", translation = "DNI electrónico"),
                    VocabularyItem(term = "WEBSITE", phonetic = "uébsait", translation = "Página web"),
                    VocabularyItem(term = "ONLINE PROCEDURE", phonetic = "onláin prosíllia", translation = "Trámite por Internet"),
                    VocabularyItem(term = "LOCAL TAX", phonetic = "lóukal taks", translation = "Impuesto municipal"),
                    VocabularyItem(term = "MUNICIPAL TAX", phonetic = "miunísipol taks", translation = "Tasa municipal"),
                    VocabularyItem(term = "PAYMENT OFFICE", phonetic = "péiment ófis", translation = "Oficina de Recaudación"),
                    VocabularyItem(term = "RECEIPT", phonetic = "risít", translation = "Justificante"),
                    VocabularyItem(term = "CLAIM FORM", phonetic = "kleim form", translation = "Hoja Oficial de Reclamaciones"),
                    VocabularyItem(term = "CONSUMER OFFICE", phonetic = "konsiúma ófis", translation = "Oficina de Consumo"),
                    VocabularyItem(term = "NATIONAL POLICE", phonetic = "náshonal polís", translation = "Policía Nacional"),
                    VocabularyItem(term = "IMMIGRATION OFFICE", phonetic = "imigreishon ófis", translation = "Oficina de Extranjería"),
                    VocabularyItem(term = "PASSPORT", phonetic = "pásport", translation = "Pasaporte"),
                    VocabularyItem(term = "PASSPORT RENEWAL", phonetic = "pásport rinúal", translation = "Renovación del pasaporte"),
                    VocabularyItem(term = "IDENTITY CARD", phonetic = "aidéntiti kad", translation = "Documento de identidad"),
                    VocabularyItem(term = "FOREIGNER IDENTITY NUMBER (NIE)", phonetic = "fórina aidéntiti námba", translation = "NIE"),
                    VocabularyItem(term = "RESIDENCE PERMIT", phonetic = "résidens pérmit", translation = "Permiso de residencia"),
                    VocabularyItem(term = "RESIDENCE CARD", phonetic = "résidens kad", translation = "Tarjeta de residencia")
                ),
                phrases = listOf(
                    PhraseItem(english = "HOW CAN I HELP YOU?", phonetic = "jáu can ai jelp yu", spanish = "¿En qué puedo ayudarle?"),
                    PhraseItem(english = "WHAT DO YOU NEED?", phonetic = "guot du yu nid", spanish = "¿Qué necesita?"),
                    PhraseItem(english = "PLEASE TELL ME WHAT YOU NEED.", phonetic = "plís tel mi guot yu nid", spanish = "Dígame qué necesita."),
                    PhraseItem(english = "THIS PROCEDURE IS DONE AT THE TOWN HALL.", phonetic = "dis prosíllia is dan at de taun jol", spanish = "Este trámite se realiza en el Ayuntamiento."),
                    PhraseItem(english = "YOU NEED TO GO TO THE CITIZEN SERVICE OFFICE.", phonetic = "yu nid tu góu tu de sítizen sérvis ófis", spanish = "Debe acudir a la Oficina de Atención al Ciudadano."),
                    PhraseItem(english = "YOU CAN SUBMIT A WRITTEN REQUEST THERE.", phonetic = "yu can sabmít a ríten riküést dea", spanish = "Allí puede presentar una instancia."),
                    PhraseItem(english = "YOU CAN SUBMIT AN ADMINISTRATIVE APPEAL THERE.", phonetic = "yu can sabmít an admínistrativ apíl dea", spanish = "Allí puede presentar un recurso administrativo."),
                    PhraseItem(english = "YOU CAN REQUEST A CERTIFICATE THERE.", phonetic = "yu can riküést a sertífiket dea", spanish = "Allí puede solicitar un certificado."),
                    PhraseItem(english = "YOU NEED TO COMPLETE THIS APPLICATION FORM.", phonetic = "yu nid tu komplít dis aplicéishon form", spanish = "Debe rellenar este formulario."),
                    PhraseItem(english = "YOU NEED TO REGISTER THIS DOCUMENT.", phonetic = "yu nid tu réllista dis dókiument", spanish = "Debe registrar este documento."),
                    PhraseItem(english = "YOU CAN SUBMIT THIS DOCUMENT ONLINE.", phonetic = "yu can sabmít dis dókiument onláin", spanish = "Puede presentar este documento por Internet."),
                    PhraseItem(english = "YOU CAN USE THE ELECTRONIC OFFICE.", phonetic = "yu can yus di ilektrónik ófis", spanish = "Puede utilizar la sede electrónica."),
                    PhraseItem(english = "YOU MAY NEED A DIGITAL CERTIFICATE.", phonetic = "yu méi nid a díllital sertífiket", spanish = "Puede necesitar un certificado digital."),
                    PhraseItem(english = "YOU MAY NEED YOUR ELECTRONIC ID.", phonetic = "yu méi nid yor ilektrónik aidí", spanish = "Puede necesitar su DNI electrónico."),
                    PhraseItem(english = "THIS PROCEDURE REQUIRES AN APPOINTMENT.", phonetic = "dis prosíllia riküáias an apóintment", spanish = "Este trámite requiere cita previa."),
                    PhraseItem(english = "YOU NEED TO MAKE AN ONLINE APPOINTMENT.", phonetic = "yu nid tu meik an onláin apóintment", spanish = "Debe solicitar una cita previa por Internet."),
                    PhraseItem(english = "YOU CAN COMPLETE THIS PROCEDURE ONLINE.", phonetic = "yu can komplít dis prosíllia onláin", spanish = "Puede realizar este trámite por Internet."),
                    PhraseItem(english = "THIS IS THE OFFICIAL WEBSITE.", phonetic = "dis is di ofíshal uébsait", spanish = "Esta es la página web oficial."),
                    PhraseItem(english = "YOU NEED TO GO TO THE PAYMENT OFFICE.", phonetic = "yu nid tu góu tu de péiment ófis", spanish = "Debe acudir a la Oficina de Recaudación."),
                    PhraseItem(english = "YOU CAN PAY YOUR LOCAL TAXES THERE.", phonetic = "yu can pei yor lóukal táksis dea", spanish = "Allí puede pagar sus impuestos municipales."),
                    PhraseItem(english = "PLEASE KEEP YOUR RECEIPT.", phonetic = "plís kip yor risít", spanish = "Conserve el justificante."),
                    PhraseItem(english = "YOU CAN ASK FOR AN OFFICIAL CLAIM FORM.", phonetic = "yu can ask for an ofíshal kleim form", spanish = "Puede solicitar una Hoja Oficial de Reclamaciones."),
                    PhraseItem(english = "THE ESTABLISHMENT MUST PROVIDE YOU WITH A CLAIM FORM.", phonetic = "di estáblishment mast prováid yu güiz a kleim form", spanish = "El establecimiento debe facilitarle una Hoja Oficial de Reclamaciones."),
                    PhraseItem(english = "YOU CAN SUBMIT THE CLAIM TO THE CONSUMER OFFICE.", phonetic = "yu can sabmít de kleim tu de konsiúma ófis", spanish = "Puede presentar la reclamación ante la Oficina de Consumo."),
                    PhraseItem(english = "YOU NEED TO GO TO THE NATIONAL POLICE STATION.", phonetic = "yu nid tu góu tu de náshonal polís stéishon", spanish = "Debe acudir a la Policía Nacional."),
                    PhraseItem(english = "YOU MUST APPLY FOR YOUR PASSPORT THERE.", phonetic = "yu mast aplái for yor pásport dea", spanish = "Debe solicitar allí su pasaporte."),
                    PhraseItem(english = "YOU MUST RENEW YOUR PASSPORT THERE.", phonetic = "yu mast riníu yor pásport dea", spanish = "Debe renovar allí su pasaporte."),
                    PhraseItem(english = "YOU NEED TO GO TO THE IMMIGRATION OFFICE.", phonetic = "yu nid tu góu tu di imigreishon ófis", spanish = "Debe acudir a la Oficina de Extranjería."),
                    PhraseItem(english = "YOU CAN APPLY FOR A FOREIGNER IDENTITY NUMBER THERE.", phonetic = "yu can aplái for a fórina aidéntiti námba dea", spanish = "Allí puede solicitar un NIE."),
                    PhraseItem(english = "YOU CAN APPLY FOR A RESIDENCE PERMIT THERE.", phonetic = "yu can aplái for a résidens pérmit dea", spanish = "Allí puede solicitar un permiso de residencia."),
                    PhraseItem(english = "PLEASE BRING YOUR PASSPORT.", phonetic = "plís bring yor pásport", spanish = "Traiga su pasaporte."),
                    PhraseItem(english = "PLEASE BRING ALL YOUR DOCUMENTS.", phonetic = "plís bring ol yor dókiuments", spanish = "Traiga toda la documentación."),
                    PhraseItem(english = "PLEASE BRING A COPY OF YOUR DOCUMENTS.", phonetic = "plís bring a cópi ov yor dókiuments", spanish = "Traiga una copia de la documentación."),
                    PhraseItem(english = "THIS IS YOUR REFERENCE NUMBER.", phonetic = "dis is yor réferens nómba", spanish = "Este es su número de referencia."),
                    PhraseItem(english = "IF YOU ARE NOT SURE, THEY WILL HELP YOU THERE.", phonetic = "if yu ar not shua dei wil jelp yu dea", spanish = "Si tiene alguna duda, allí le ayudarán."),
                    PhraseItem(english = "IF YOU NEED FURTHER INFORMATION, PLEASE CONTACT THE TOWN HALL.", phonetic = "if yu nid férda informéishon plís cóntakt de taun jol", spanish = "Si necesita más información, póngase en contacto con el Ayuntamiento."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
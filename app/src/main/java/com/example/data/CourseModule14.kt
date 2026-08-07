package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module14 {
    val module = Module(
        id = 14,
        title = "Módulo 14",
        description = "Víctimas, testigos y denuncias.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Víctimas, testigos y denuncias",
                vocabulary = listOf(
                    VocabularyItem(term = "VICTIM", phonetic = "víctim", translation = "Víctima"),
                    VocabularyItem(term = "WITNESS", phonetic = "guítnes", translation = "Testigo"),
                    VocabularyItem(term = "COMPLAINANT", phonetic = "compléinant", translation = "Denunciante"),
                    VocabularyItem(term = "SUSPECT", phonetic = "sáspekt", translation = "Sospechoso"),
                    VocabularyItem(term = "STATEMENT", phonetic = "stéitment", translation = "Declaración"),
                    VocabularyItem(term = "REPORT", phonetic = "ripórt", translation = "Denuncia / Informe"),
                    VocabularyItem(term = "COMPLAINT", phonetic = "compléint", translation = "Denuncia"),
                    VocabularyItem(term = "INCIDENT", phonetic = "ínsident", translation = "Incidente"),
                    VocabularyItem(term = "CRIME", phonetic = "kráim", translation = "Delito"),
                    VocabularyItem(term = "OFFENCE", phonetic = "oféns", translation = "Infracción penal"),
                    VocabularyItem(term = "THEFT", phonetic = "zeft", translation = "Hurto"),
                    VocabularyItem(term = "ROBBERY", phonetic = "róberi", translation = "Robo"),
                    VocabularyItem(term = "ASSAULT", phonetic = "asólt", translation = "Agresión"),
                    VocabularyItem(term = "THREAT", phonetic = "zret", translation = "Amenaza"),
                    VocabularyItem(term = "DAMAGE", phonetic = "dámich", translation = "Daños"),
                    VocabularyItem(term = "PROPERTY", phonetic = "próperti", translation = "Pertenencias"),
                    VocabularyItem(term = "PASSPORT", phonetic = "pásport", translation = "Pasaporte"),
                    VocabularyItem(term = "IDENTITY CARD", phonetic = "aidéntiti kad", translation = "Documento de identidad"),
                    VocabularyItem(term = "DRIVING LICENCE", phonetic = "dráivin láisens", translation = "Permiso de conducir"),
                    VocabularyItem(term = "MOBILE PHONE", phonetic = "móubail fóun", translation = "Teléfono móvil"),
                    VocabularyItem(term = "WALLET", phonetic = "uólet", translation = "Cartera"),
                    VocabularyItem(term = "BAG", phonetic = "bag", translation = "Bolsa"),
                    VocabularyItem(term = "BACKPACK", phonetic = "bákpak", translation = "Mochila"),
                    VocabularyItem(term = "MONEY", phonetic = "máni", translation = "Dinero"),
                    VocabularyItem(term = "BANK CARD", phonetic = "bank kad", translation = "Tarjeta bancaria"),
                    VocabularyItem(term = "JEWELLERY", phonetic = "yúelri", translation = "Joyas"),
                    VocabularyItem(term = "LOCATION", phonetic = "loukéishon", translation = "Lugar"),
                    VocabularyItem(term = "DESCRIPTION", phonetic = "diskrípshon", translation = "Descripción"),
                    VocabularyItem(term = "DETAIL", phonetic = "díteil", translation = "Detalle"),
                    VocabularyItem(term = "EVIDENCE", phonetic = "évidens", translation = "Prueba"),
                    VocabularyItem(term = "CCTV", phonetic = "si-si-ti-vi", translation = "Cámaras de seguridad"),
                    VocabularyItem(term = "PHOTO", phonetic = "fóutou", translation = "Fotografía"),
                    VocabularyItem(term = "VIDEO", phonetic = "vídiou", translation = "Vídeo")
                ),
                phrases = listOf(
                    PhraseItem(english = "ARE YOU THE VICTIM?", phonetic = "ar yu de víctim", spanish = "¿Es usted la víctima?"),
                    PhraseItem(english = "ARE YOU A WITNESS?", phonetic = "ar yu a guítnes", spanish = "¿Es usted testigo?"),
                    PhraseItem(english = "PLEASE TELL ME WHAT HAPPENED.", phonetic = "plís tel mi guot jápend", spanish = "Dígame qué ha ocurrido."),
                    PhraseItem(english = "PLEASE SPEAK SLOWLY.", phonetic = "plís spik slóuli", spanish = "Hable despacio, por favor."),
                    PhraseItem(english = "PLEASE START FROM THE BEGINNING.", phonetic = "plís start from de bigíning", spanish = "Empiece desde el principio."),
                    PhraseItem(english = "PLEASE TELL ME EVERYTHING YOU REMEMBER.", phonetic = "plís tel mi évrizin yu rimémba", spanish = "Cuénteme todo lo que recuerde."),
                    PhraseItem(english = "WHEN DID IT HAPPEN?", phonetic = "guen did it jápen", spanish = "¿Cuándo ocurrió?"),
                    PhraseItem(english = "WHERE DID IT HAPPEN?", phonetic = "güea did it jápen", spanish = "¿Dónde ocurrió?"),
                    PhraseItem(english = "WHAT TIME DID IT HAPPEN?", phonetic = "guot taim did it jápen", spanish = "¿A qué hora ocurrió?"),
                    PhraseItem(english = "WHAT WAS STOLEN?", phonetic = "guot uoz stóulen", spanish = "¿Qué le han robado?"),
                    PhraseItem(english = "HAS ANYONE BEEN INJURED?", phonetic = "jaz éniuan bin ínyerd", spanish = "¿Ha resultado alguien herido?"),
                    PhraseItem(english = "DO YOU NEED MEDICAL ASSISTANCE?", phonetic = "du yu nid médikol asístans", spanish = "¿Necesita asistencia médica?"),
                    PhraseItem(english = "DO YOU KNOW THE SUSPECT?", phonetic = "du yu nóu de sáspekt", spanish = "¿Conoce al sospechoso?"),
                    PhraseItem(english = "CAN YOU DESCRIBE THE PERSON?", phonetic = "can yu diskráib de pérson", spanish = "¿Puede describir a la persona?"),
                    PhraseItem(english = "DID YOU SEE THE PERSON'S FACE?", phonetic = "did yu si de pérsons feis", spanish = "¿Vio la cara de esa persona?"),
                    PhraseItem(english = "WHICH DIRECTION DID THE PERSON GO?", phonetic = "guich dairékshon did de pérson góu", spanish = "¿En qué dirección se marchó?"),
                    PhraseItem(english = "HAS ANYTHING BEEN TOUCHED?", phonetic = "jaz énizin bin tocht", spanish = "¿Se ha tocado algo?"),
                    PhraseItem(english = "PLEASE DO NOT TOUCH ANYTHING.", phonetic = "plís du not toch énizin", spanish = "No toque nada, por favor."),
                    PhraseItem(english = "DO YOU HAVE ANY PHOTOGRAPHS OR VIDEOS?", phonetic = "du yu jav éni fóutougrafs or vídios", spanish = "¿Tiene fotografías o vídeos?"),
                    PhraseItem(english = "ARE THERE ANY WITNESSES?", phonetic = "ar dea éni guítnesis", spanish = "¿Hay testigos?"),
                    PhraseItem(english = "IS THERE CCTV IN THE AREA?", phonetic = "is dea si-si-ti-vi in di éria", spanish = "¿Hay cámaras de seguridad en la zona?"),
                    PhraseItem(english = "PLEASE SHOW ME THE LOCATION.", phonetic = "plís shóu mi de loukéishon", spanish = "Muéstreme el lugar."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR PASSPORT OR ID.", phonetic = "plís shóu mi yor pásport or ai-di", spanish = "Muéstreme su pasaporte o documento de identidad."),
                    PhraseItem(english = "I AM GOING TO TAKE YOUR STATEMENT.", phonetic = "ai am góuin tu teik yor stéitment", spanish = "Voy a tomarle declaración."),
                    PhraseItem(english = "PLEASE CHECK THAT THE INFORMATION IS CORRECT.", phonetic = "plís chek dat di informéishon is korékt", spanish = "Compruebe que la información es correcta."),
                    PhraseItem(english = "PLEASE SIGN HERE.", phonetic = "plís sain jía", spanish = "Firme aquí, por favor."),
                    PhraseItem(english = "YOU WILL RECEIVE A COPY OF THE REPORT.", phonetic = "yu wil risív a cópi ov de ripórt", spanish = "Recibirá una copia de la denuncia."),
                    PhraseItem(english = "IF YOU REMEMBER ANYTHING ELSE, PLEASE CONTACT THE POLICE.", phonetic = "if yu rimémba énizin els, plís cóntakt de polís", spanish = "Si recuerda algo más, póngase en contacto con la Policía."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
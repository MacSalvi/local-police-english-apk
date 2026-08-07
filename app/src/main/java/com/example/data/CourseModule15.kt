package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module15 {
    val module = Module(
        id = 15,
        title = "Módulo 15",
        description = "Hurtos, robos y delitos contra la propiedad",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Hurtos, robos y estafas a turistas",
                vocabulary = listOf(
                    VocabularyItem(term = "THEFT", phonetic = "zeft", translation = "Hurto"),
                    VocabularyItem(term = "ROBBERY", phonetic = "róberi", translation = "Robo"),
                    VocabularyItem(term = "MUGGING", phonetic = "máguin", translation = "Robo con violencia"),
                    VocabularyItem(term = "PICKPOCKET", phonetic = "píkpokit", translation = "Carterista"),
                    VocabularyItem(term = "PICKPOCKETING", phonetic = "píkpokitin", translation = "Hurto por carterista"),
                    VocabularyItem(term = "SHOPLIFTING", phonetic = "shópliftin", translation = "Hurto en establecimiento"),
                    VocabularyItem(term = "SCAM", phonetic = "skam", translation = "Estafa"),
                    VocabularyItem(term = "FRAUD", phonetic = "frod", translation = "Fraude"),
                    VocabularyItem(term = "THIEF", phonetic = "zif", translation = "Ladrón"),
                    VocabularyItem(term = "SUSPECT", phonetic = "sáspekt", translation = "Sospechoso"),
                    VocabularyItem(term = "VICTIM", phonetic = "víctim", translation = "Víctima"),
                    VocabularyItem(term = "WITNESS", phonetic = "guítnes", translation = "Testigo"),
                    VocabularyItem(term = "STOLEN", phonetic = "stóulen", translation = "Robado"),
                    VocabularyItem(term = "MISSING", phonetic = "mísin", translation = "Desaparecido / Extraviado"),
                    VocabularyItem(term = "PROPERTY", phonetic = "próperti", translation = "Pertenencias"),
                    VocabularyItem(term = "VALUABLES", phonetic = "váliuabols", translation = "Objetos de valor"),
                    VocabularyItem(term = "PASSPORT", phonetic = "pásport", translation = "Pasaporte"),
                    VocabularyItem(term = "IDENTITY CARD", phonetic = "aidéntiti kad", translation = "Documento de identidad"),
                    VocabularyItem(term = "DRIVING LICENCE", phonetic = "dráivin láisens", translation = "Permiso de conducir"),
                    VocabularyItem(term = "WALLET", phonetic = "uólet", translation = "Cartera"),
                    VocabularyItem(term = "PURSE", phonetic = "pers", translation = "Monedero"),
                    VocabularyItem(term = "HANDBAG", phonetic = "jándbag", translation = "Bolso"),
                    VocabularyItem(term = "BACKPACK", phonetic = "bákpak", translation = "Mochila"),
                    VocabularyItem(term = "SUITCASE", phonetic = "súitkeis", translation = "Maleta"),
                    VocabularyItem(term = "MOBILE PHONE", phonetic = "móubail fóun", translation = "Teléfono móvil"),
                    VocabularyItem(term = "WATCH", phonetic = "guoch", translation = "Reloj"),
                    VocabularyItem(term = "JEWELLERY", phonetic = "yúelri", translation = "Joyas"),
                    VocabularyItem(term = "BANK CARD", phonetic = "bank kad", translation = "Tarjeta bancaria"),
                    VocabularyItem(term = "CREDIT CARD", phonetic = "krédit kad", translation = "Tarjeta de crédito"),
                    VocabularyItem(term = "CASH", phonetic = "kash", translation = "Dinero en efectivo"),
                    VocabularyItem(term = "ATM", phonetic = "ei-ti-em", translation = "Cajero automático"),
                    VocabularyItem(term = "BANK", phonetic = "bank", translation = "Banco"),
                    VocabularyItem(term = "HOTEL", phonetic = "joutél", translation = "Hotel"),
                    VocabularyItem(term = "RECEPTION", phonetic = "risépshon", translation = "Recepción"),
                    VocabularyItem(term = "ROOM", phonetic = "rum", translation = "Habitación")
                ),
                phrases = listOf(
                    PhraseItem(english = "WHAT HAS BEEN STOLEN?", phonetic = "guot jaz bin stóulen", spanish = "¿Qué le han robado?"),
                    PhraseItem(english = "WHEN DID IT HAPPEN?", phonetic = "guen did it jápen", spanish = "¿Cuándo ocurrió?"),
                    PhraseItem(english = "WHERE DID IT HAPPEN?", phonetic = "güea did it jápen", spanish = "¿Dónde ocurrió?"),
                    PhraseItem(english = "CAN YOU DESCRIBE WHAT HAPPENED?", phonetic = "can yu diskráib guot jápend", spanish = "¿Puede describir lo ocurrido?"),
                    PhraseItem(english = "DO YOU KNOW WHEN YOU LAST SAW YOUR PROPERTY?", phonetic = "du yu nóu guen yu last so yor próperti", spanish = "¿Sabe cuándo vio por última vez sus pertenencias?"),
                    PhraseItem(english = "DID ANYONE TOUCH YOU?", phonetic = "did éniuan toch yu", spanish = "¿Alguien le tocó?"),
                    PhraseItem(english = "DID ANYONE THREATEN YOU?", phonetic = "did éniuan zréten yu", spanish = "¿Alguien le amenazó?"),
                    PhraseItem(english = "DID YOU SEE THE PERSON?", phonetic = "did yu si de pérson", spanish = "¿Vio a la persona?"),
                    PhraseItem(english = "CAN YOU DESCRIBE THE PERSON?", phonetic = "can yu diskráib de pérson", spanish = "¿Puede describir a la persona?"),
                    PhraseItem(english = "WHICH DIRECTION DID THE PERSON GO?", phonetic = "guich dairékshon did de pérson góu", spanish = "¿En qué dirección se marchó?"),
                    PhraseItem(english = "HAS YOUR BANK CARD BEEN USED?", phonetic = "jaz yor bank kad bin yúzd", spanish = "¿Han utilizado su tarjeta bancaria?"),
                    PhraseItem(english = "PLEASE CONTACT YOUR BANK IMMEDIATELY.", phonetic = "plís cóntakt yor bank imídietli", spanish = "Póngase en contacto con su banco inmediatamente."),
                    PhraseItem(english = "PLEASE CANCEL YOUR BANK CARDS.", phonetic = "plís kánsol yor bank kads", spanish = "Cancele sus tarjetas bancarias."),
                    PhraseItem(english = "HAS YOUR PASSPORT BEEN STOLEN?", phonetic = "jaz yor pásport bin stóulen", spanish = "¿Le han robado el pasaporte?"),
                    PhraseItem(english = "YOU SHOULD CONTACT YOUR EMBASSY OR CONSULATE.", phonetic = "yu shud cóntakt yor émbasi or kónsiulet", spanish = "Debe ponerse en contacto con su embajada o consulado."),
                    PhraseItem(english = "WE ARE GOING TO TAKE YOUR REPORT.", phonetic = "güi ar góuin tu teik yor ripórt", spanish = "Vamos a tramitar su denuncia."),
                    PhraseItem(english = "PLEASE GIVE ME A DESCRIPTION OF THE STOLEN ITEMS.", phonetic = "plís guiv mi a diskrípshon ov de stóulen áitems", spanish = "Descríbame los objetos robados."),
                    PhraseItem(english = "DO YOU HAVE THE SERIAL NUMBER?", phonetic = "du yu jav de sírial nómber", spanish = "¿Tiene el número de serie?"),
                    PhraseItem(english = "DO YOU HAVE ANY RECEIPTS OR PHOTOGRAPHS?", phonetic = "du yu jav éni risíts or fóutografs", spanish = "¿Tiene facturas o fotografías?"),
                    PhraseItem(english = "PLEASE CHECK THAT THIS INFORMATION IS CORRECT.", phonetic = "plís chek dat dis informéishon is korékt", spanish = "Compruebe que esta información es correcta."),
                    PhraseItem(english = "PLEASE SIGN HERE.", phonetic = "plís sain jía", spanish = "Firme aquí, por favor."),
                    PhraseItem(english = "YOU WILL RECEIVE A COPY OF THE REPORT.", phonetic = "yu wil risív a cópi ov de ripórt", spanish = "Recibirá una copia de la denuncia."),
                    PhraseItem(english = "KEEP THIS REPORT IN A SAFE PLACE.", phonetic = "kip dis ripórt in a séif pleis", spanish = "Guarde esta denuncia en un lugar seguro."),
                    PhraseItem(english = "IF YOU RECOVER YOUR PROPERTY, PLEASE LET US KNOW.", phonetic = "if yu rikóva yor próperti, plís let as nóu", spanish = "Si recupera sus pertenencias, comuníquenoslo."),
                    PhraseItem(english = "IF YOU REMEMBER ANYTHING ELSE, PLEASE CONTACT US.", phonetic = "if yu rimémba énizin els, plís cóntakt as", spanish = "Si recuerda algo más, póngase en contacto con nosotros."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
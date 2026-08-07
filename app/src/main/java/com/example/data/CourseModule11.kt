package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module11 {
    val module = Module(
        id = 11,
        title = "Módulo 11",
        description = "Cacheo, objetos peligrosos y armas.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Cacheo, objetos peligrosos y armas",
                vocabulary = listOf(
                    VocabularyItem(term = "SEARCH", phonetic = "serch", translation = "Cacheo / Registro"),
                    VocabularyItem(term = "PAT-DOWN", phonetic = "pat daun", translation = "Cacheo superficial"),
                    VocabularyItem(term = "WEAPON", phonetic = "uépon", translation = "Arma"),
                    VocabularyItem(term = "FIREARM", phonetic = "fáiarm", translation = "Arma de fuego"),
                    VocabularyItem(term = "HANDGUN", phonetic = "jand gan", translation = "Pistola"),
                    VocabularyItem(term = "PISTOL", phonetic = "pístol", translation = "Pistola"),
                    VocabularyItem(term = "REVOLVER", phonetic = "rivólver", translation = "Revólver"),
                    VocabularyItem(term = "RIFLE", phonetic = "ráifol", translation = "Rifle"),
                    VocabularyItem(term = "SHOTGUN", phonetic = "shótgan", translation = "Escopeta"),
                    VocabularyItem(term = "KNIFE", phonetic = "náif", translation = "Cuchillo"),
                    VocabularyItem(term = "FOLDING KNIFE", phonetic = "fóuldin náif", translation = "Navaja"),
                    VocabularyItem(term = "BLADE", phonetic = "bleid", translation = "Hoja"),
                    VocabularyItem(term = "MACHETE", phonetic = "machéti", translation = "Machete"),
                    VocabularyItem(term = "AXE", phonetic = "aks", translation = "Hacha"),
                    VocabularyItem(term = "HAMMER", phonetic = "jámer", translation = "Martillo"),
                    VocabularyItem(term = "SCREWDRIVER", phonetic = "skrúdraiva", translation = "Destornillador"),
                    VocabularyItem(term = "SCISSORS", phonetic = "sízors", translation = "Tijeras"),
                    VocabularyItem(term = "BOX CUTTER", phonetic = "boks káta", translation = "Cúter"),
                    VocabularyItem(term = "BATON", phonetic = "batón", translation = "Porra"),
                    VocabularyItem(term = "PEPPER SPRAY", phonetic = "péper sprei", translation = "Espray de defensa"),
                    VocabularyItem(term = "STUN GUN", phonetic = "stan gan", translation = "Pistola eléctrica"),
                    VocabularyItem(term = "IMITATION FIREARM", phonetic = "imitáishon fáiarm", translation = "Arma simulada"),
                    VocabularyItem(term = "AIR PISTOL", phonetic = "ea pístol", translation = "Pistola de aire comprimido"),
                    VocabularyItem(term = "SHARP OBJECT", phonetic = "sharp óbllikt", translation = "Objeto punzante o cortante"),
                    VocabularyItem(term = "DANGEROUS OBJECT", phonetic = "déinlleros óbllikt", translation = "Objeto peligroso"),
                    VocabularyItem(term = "POCKET", phonetic = "pókit", translation = "Bolsillo"),
                    VocabularyItem(term = "WAISTBAND", phonetic = "uéistband", translation = "Cintura del pantalón"),
                    VocabularyItem(term = "BELT", phonetic = "belt", translation = "Cinturón"),
                    VocabularyItem(term = "JACKET", phonetic = "yákit", translation = "Chaqueta"),
                    VocabularyItem(term = "COAT", phonetic = "kout", translation = "Abrigo"),
                    VocabularyItem(term = "BAG", phonetic = "bag", translation = "Bolsa"),
                    VocabularyItem(term = "BACKPACK", phonetic = "bákpak", translation = "Mochila"),
                    VocabularyItem(term = "HANDBAG", phonetic = "jandbag", translation = "Bolso"),
                    VocabularyItem(term = "WALLET", phonetic = "uólet", translation = "Cartera"),
                    VocabularyItem(term = "PURSE", phonetic = "pers", translation = "Monedero")
                ),
                phrases = listOf(
                    PhraseItem(english = "FOR MY SAFETY, I AM GOING TO SEARCH YOU.", phonetic = "for mai séifti ai am góuin tu serch yu", spanish = "Por mi seguridad, voy a cachearle."),
                    PhraseItem(english = "I AM GOING TO CARRY OUT A PAT-DOWN SEARCH.", phonetic = "ai am góuin tu kári aut a pat daun serch", spanish = "Voy a realizar un cacheo superficial."),
                    PhraseItem(english = "PLEASE STAND STILL.", phonetic = "plís stand stil", spanish = "Permanezca quieto."),
                    PhraseItem(english = "DO NOT MOVE.", phonetic = "du not muv", spanish = "No se mueva."),
                    PhraseItem(english = "KEEP YOUR HANDS WHERE I CAN SEE THEM.", phonetic = "kip yor jands güer ai can si dem", spanish = "Mantenga las manos donde pueda verlas."),
                    PhraseItem(english = "DO NOT PUT YOUR HANDS IN YOUR POCKETS.", phonetic = "du not put yor jands in yor pókits", spanish = "No meta las manos en los bolsillos."),
                    PhraseItem(english = "EMPTY YOUR POCKETS, PLEASE.", phonetic = "émpti yor pókits plís", spanish = "Vacíe los bolsillos, por favor."),
                    PhraseItem(english = "OPEN YOUR JACKET.", phonetic = "óupen yor yákit", spanish = "Abra la chaqueta."),
                    PhraseItem(english = "OPEN YOUR COAT.", phonetic = "óupen yor kout", spanish = "Abra el abrigo."),
                    PhraseItem(english = "OPEN YOUR BAG.", phonetic = "óupen yor bag", spanish = "Abra la bolsa."),
                    PhraseItem(english = "OPEN YOUR BACKPACK.", phonetic = "óupen yor bákpak", spanish = "Abra la mochila."),
                    PhraseItem(english = "SHOW ME THE CONTENTS OF YOUR BAG.", phonetic = "shóu mi de cóntents ov yor bag", spanish = "Muéstreme el contenido de la bolsa."),
                    PhraseItem(english = "DO YOU HAVE ANY WEAPONS?", phonetic = "du yu jav éni uépons", spanish = "¿Lleva alguna arma?"),
                    PhraseItem(english = "ARE YOU CARRYING A KNIFE?", phonetic = "ar yu kárin a náif", spanish = "¿Lleva algún cuchillo?"),
                    PhraseItem(english = "ARE YOU CARRYING ANY SHARP OBJECTS?", phonetic = "ar yu kárin éni sharp óbllekts", spanish = "¿Lleva algún objeto punzante o cortante?"),
                    PhraseItem(english = "ARE YOU CARRYING ANYTHING DANGEROUS?", phonetic = "ar yu kárin énizin déinlleros", spanish = "¿Lleva algún objeto peligroso?"),
                    PhraseItem(english = "IS THERE ANYTHING THAT COULD HURT ME?", phonetic = "is dea énizin dat kud jert mi", spanish = "¿Lleva algo con lo que pueda lesionarme?"),
                    PhraseItem(english = "PLEASE TELL ME BEFORE I SEARCH YOU.", phonetic = "plís tel mi bifó ai serch yu", spanish = "Dígamelo antes de que le cachee."),
                    PhraseItem(english = "REMOVE THE ITEM SLOWLY.", phonetic = "rimúv di áitem slóuli", spanish = "Saque el objeto despacio."),
                    PhraseItem(english = "PLACE IT ON THE GROUND.", phonetic = "pleis it on de graund", spanish = "Déjelo en el suelo."),
                    PhraseItem(english = "DO NOT TOUCH THE WEAPON.", phonetic = "du not toch de uépon", spanish = "No toque el arma."),
                    PhraseItem(english = "STEP AWAY FROM THE WEAPON.", phonetic = "step aguéi from de uépon", spanish = "Aléjese del arma."),
                    PhraseItem(english = "KEEP AWAY FROM THE OBJECT.", phonetic = "kip aguéi from di óbllikt", spanish = "Aléjese del objeto."),
                    PhraseItem(english = "IS THIS YOUR KNIFE?", phonetic = "is dis yor náif", spanish = "¿Es suyo este cuchillo?"),
                    PhraseItem(english = "WHO DOES THIS BELONG TO?", phonetic = "ju dus dis bilóng tu", spanish = "¿De quién es esto?"),
                    PhraseItem(english = "I AM GOING TO TAKE THIS ITEM.", phonetic = "ai am góuin tu teik dis áitem", spanish = "Voy a retirar este objeto."),
                    PhraseItem(english = "THIS ITEM WILL BE SEIZED.", phonetic = "dis áitem wil bi sízd", spanish = "Este objeto será intervenido."),
                    PhraseItem(english = "PLEASE DO NOT RESIST.", phonetic = "plís du not rizíst", spanish = "No se resista."),
                    PhraseItem(english = "COOPERATE WITH ME, PLEASE.", phonetic = "kouópareit güiz mi plís", spanish = "Colabore conmigo, por favor."),
                    PhraseItem(english = "THE SEARCH IS NOW FINISHED.", phonetic = "de serch is nau fínisht", spanish = "El cacheo ha finalizado."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
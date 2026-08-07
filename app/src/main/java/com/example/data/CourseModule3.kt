package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module3 {
    val module = Module(
        id = 3,
        title = "Módulo 3",
        description = "Descripción física y vestimenta de personas.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Descripción Física y Vestimenta",
                vocabulary = listOf(
                    VocabularyItem(term = "MAN", phonetic = "man", translation = "Hombre"),
                    VocabularyItem(term = "WOMAN", phonetic = "wúman", translation = "Mujer"),
                    VocabularyItem(term = "BOY", phonetic = "boi", translation = "Niño"),
                    VocabularyItem(term = "GIRL", phonetic = "guerl", translation = "Niña"),
                    VocabularyItem(term = "CHILD", phonetic = "cháild", translation = "Menor"),
                    VocabularyItem(term = "ADULT", phonetic = "adált", translation = "Adulto"),
                    VocabularyItem(term = "ELDERLY PERSON", phonetic = "élderli pérson", translation = "Persona mayor"),
                    VocabularyItem(term = "MALE", phonetic = "meil", translation = "Varón"),
                    VocabularyItem(term = "FEMALE", phonetic = "fímeil", translation = "Mujer"),
                    VocabularyItem(term = "HEIGHT", phonetic = "jáit", translation = "Altura"),
                    VocabularyItem(term = "TALL", phonetic = "tol", translation = "Alto"),
                    VocabularyItem(term = "MEDIUM HEIGHT", phonetic = "mídiam jáit", translation = "Estatura media"),
                    VocabularyItem(term = "SHORT", phonetic = "short", translation = "Bajo"),
                    VocabularyItem(term = "BUILD", phonetic = "bild", translation = "Complexión"),
                    VocabularyItem(term = "SLIM", phonetic = "slim", translation = "Delgado"),
                    VocabularyItem(term = "THIN", phonetic = "zin", translation = "Muy delgado"),
                    VocabularyItem(term = "AVERAGE BUILD", phonetic = "áverich bild", translation = "Complexión media"),
                    VocabularyItem(term = "HEAVY BUILD", phonetic = "jévi bild", translation = "Complexión fuerte"),
                    VocabularyItem(term = "HAIR", phonetic = "jea", translation = "Pelo"),
                    VocabularyItem(term = "SHORT HAIR", phonetic = "short jea", translation = "Pelo corto"),
                    VocabularyItem(term = "LONG HAIR", phonetic = "long jea", translation = "Pelo largo"),
                    VocabularyItem(term = "CURLY HAIR", phonetic = "kéli jea", translation = "Pelo rizado"),
                    VocabularyItem(term = "STRAIGHT HAIR", phonetic = "stréit jea", translation = "Pelo liso"),
                    VocabularyItem(term = "BALD", phonetic = "bold", translation = "Calvo"),
                    VocabularyItem(term = "BEARD", phonetic = "bíad", translation = "Barba"),
                    VocabularyItem(term = "MOUSTACHE", phonetic = "mustásh", translation = "Bigote"),
                    VocabularyItem(term = "GLASSES", phonetic = "glásis", translation = "Gafas"),
                    VocabularyItem(term = "BLUE EYES", phonetic = "blu áis", translation = "Ojos azules"),
                    VocabularyItem(term = "BROWN EYES", phonetic = "braun áis", translation = "Ojos marrones"),
                    VocabularyItem(term = "GREEN EYES", phonetic = "grin áis", translation = "Ojos verdes"),
                    VocabularyItem(term = "JACKET", phonetic = "yákit", translation = "Chaqueta"),
                    VocabularyItem(term = "COAT", phonetic = "kout", translation = "Abrigo"),
                    VocabularyItem(term = "HOODIE", phonetic = "júdi", translation = "Sudadera con capucha"),
                    VocabularyItem(term = "SHIRT", phonetic = "shert", translation = "Camisa"),
                    VocabularyItem(term = "T-SHIRT", phonetic = "tí shert", translation = "Camiseta"),
                    VocabularyItem(term = "TROUSERS", phonetic = "tráusers", translation = "Pantalones"),
                    VocabularyItem(term = "SHORTS", phonetic = "shorts", translation = "Pantalón corto"),
                    VocabularyItem(term = "JEANS", phonetic = "yíns", translation = "Vaqueros"),
                    VocabularyItem(term = "TRAINERS", phonetic = "tréinas", translation = "Zapatillas deportivas"),
                    VocabularyItem(term = "SHOES", phonetic = "shus", translation = "Zapatos"),
                    VocabularyItem(term = "BOOTS", phonetic = "buts", translation = "Botas"),
                    VocabularyItem(term = "HAT", phonetic = "jat", translation = "Sombrero"),
                    VocabularyItem(term = "CAP", phonetic = "cap", translation = "Gorra"),
                    VocabularyItem(term = "BACKPACK", phonetic = "bákpac", translation = "Mochila"),
                    VocabularyItem(term = "BAG", phonetic = "bag", translation = "Bolsa"),
                    VocabularyItem(term = "TATTOO", phonetic = "tatú", translation = "Tatuaje"),
                    VocabularyItem(term = "SCAR", phonetic = "scar", translation = "Cicatriz")
                ),
                phrases = listOf(
                    PhraseItem(english = "PLEASE DESCRIBE THE PERSON.", phonetic = "plís discráib de pérson", spanish = "Describa a la persona, por favor."),
                    PhraseItem(english = "IS IT A MAN OR A WOMAN?", phonetic = "is it a man or a wúman", spanish = "¿Es un hombre o una mujer?"),
                    PhraseItem(english = "HOW TALL IS THE PERSON?", phonetic = "jau tol is de pérson", spanish = "¿Qué altura tiene?"),
                    PhraseItem(english = "WHAT BUILD IS THE PERSON?", phonetic = "guot bild is de pérson", spanish = "¿Qué complexión tiene?"),
                    PhraseItem(english = "WHAT COLOUR IS THE HAIR?", phonetic = "guot cála is de jea", spanish = "¿De qué color tiene el pelo?"),
                    PhraseItem(english = "IS THE HAIR LONG OR SHORT?", phonetic = "is de jea long or short", spanish = "¿Tiene el pelo largo o corto?"),
                    PhraseItem(english = "DOES THE PERSON HAVE A BEARD?", phonetic = "das de pérson jav a bíad", spanish = "¿Tiene barba?"),
                    PhraseItem(english = "DOES THE PERSON WEAR GLASSES?", phonetic = "das de pérson güea glásis", spanish = "¿Lleva gafas?"),
                    PhraseItem(english = "WHAT WAS THE PERSON WEARING?", phonetic = "guot guoz de pérson güérin", spanish = "¿Qué ropa llevaba?"),
                    PhraseItem(english = "WHAT COLOUR WAS THE JACKET?", phonetic = "guot cála guoz de yákit", spanish = "¿De qué color era la chaqueta?"),
                    PhraseItem(english = "DID YOU SEE A HAT OR A CAP?", phonetic = "did yu si a jat or a cap", spanish = "¿Llevaba sombrero o gorra?"),
                    PhraseItem(english = "DID THE PERSON HAVE A BACKPACK?", phonetic = "did de pérson jav a bákpac", spanish = "¿Llevaba mochila?"),
                    PhraseItem(english = "DOES THE PERSON HAVE ANY TATTOOS?", phonetic = "das de pérson jav éni tatús", spanish = "¿Tiene algún tatuaje?"),
                    PhraseItem(english = "DOES THE PERSON HAVE ANY SCARS?", phonetic = "das de pérson jav éni scars", spanish = "¿Tiene alguna cicatriz?"),
                    PhraseItem(english = "PLEASE TELL ME EVERYTHING YOU REMEMBER.", phonetic = "plís tel mi évrizin yu rimémba", spanish = "Dígame todo lo que recuerde."),
                    PhraseItem(english = "ANY DETAIL MAY BE IMPORTANT.", phonetic = "éni díteil méi bi impórtant", spanish = "Cualquier detalle puede ser importante."),
                    PhraseItem(english = "TAKE YOUR TIME.", phonetic = "teik yor táim", spanish = "Tómese su tiempo."),
                    PhraseItem(english = "PLEASE THINK CAREFULLY.", phonetic = "plís zink kéafuli", spanish = "Piénselo bien, por favor."),
                    PhraseItem(english = "THANK YOU. THAT DESCRIPTION IS VERY HELPFUL.", phonetic = "zénk yu. dat discrípchon is véri jélpful", spanish = "Gracias. Esa descripción es muy útil.")
                )
            )
        )
    )
}
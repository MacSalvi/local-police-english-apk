package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module3 = Module(
    moduleId = 3,
    moduleName = "Módulo 3: Descripción de personas",
    lessons = listOf(
        Lesson(
            lessonId = 301,
            lessonTitle = "Rasgos físicos",
            vocabulary = listOf(
                VocabularyItem(es = "Hombre", en = "MAN", phonetic = "man"),
                VocabularyItem(es = "Mujer", en = "WOMAN", phonetic = "wúman"),
                VocabularyItem(es = "Edad / Viejo", en = "OLD", phonetic = "old"),
                VocabularyItem(es = "Alto", en = "TALL", phonetic = "tol"),
                VocabularyItem(es = "Bajo", en = "SHORT", phonetic = "short"),
                VocabularyItem(es = "Pelo / Cabello", en = "HAIR", phonetic = "jer"),
                VocabularyItem(es = "Ojos", en = "EYES", phonetic = "áis"),
                VocabularyItem(es = "Ropa / Vestir", en = "CLOTHES", phonetic = "klóuds"),
                VocabularyItem(es = "Ser / Estar", en = "IS", phonetic = "is"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Persona", en = "PERSON", phonetic = "pörson"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "O", en = "OR", phonetic = "or"),
                VocabularyItem(es = "Cómo", en = "HOW", phonetic = "jau"),
                VocabularyItem(es = "Aproximadamente", en = "APPROXIMATELY", phonetic = "aprócsimetli"),
                VocabularyItem(es = "Qué / Cuál", en = "WHAT", phonetic = "guat"),
                VocabularyItem(es = "Su / Sus (de ellos/ellas)", en = "THEIR", phonetic = "der"),
                VocabularyItem(es = "Complexión", en = "BUILD", phonetic = "bild"),
                VocabularyItem(es = "Color", en = "COLOUR", phonetic = "cólor"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Pasado (auxiliar/ser/estar)", en = "WAS", phonetic = "was"),
                VocabularyItem(es = "Llevar puesto", en = "WEARING", phonetic = "güéring"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Accesorios", en = "ACCESSORIES", phonetic = "aksésoris")
            ),
            phrases = listOf(
                PhraseItem(es = "¿Es la persona un hombre o una mujer?", en = "IS THE PERSON A MAN OR A WOMAN?", phonetic = "is de pörson a man or a wúman"),
                PhraseItem(es = "¿Qué edad tiene la persona, aproximadamente?", en = "HOW OLD IS THE PERSON, APPROXIMATELY?", phonetic = "jau old is de pörson, aprócsimetli"),
                PhraseItem(es = "¿Qué altura tiene la persona?", en = "HOW TALL IS THE PERSON?", phonetic = "jau tol is de pörson"),
                PhraseItem(es = "¿Cómo es su complexión?", en = "WHAT'S THEIR BUILD?", phonetic = "guats der bild"),
                PhraseItem(es = "¿De qué color es su pelo?", en = "WHAT COLOUR IS THEIR HAIR?", phonetic = "guat cólor is der jer"),
                PhraseItem(es = "¿De qué color son sus ojos?", en = "WHAT COLOUR ARE THEIR EYES?", phonetic = "guat cólor ar der áis"),
                PhraseItem(es = "¿Qué llevaba puesto la persona?", en = "WHAT WAS THE PERSON WEARING?", phonetic = "guat gas de pörson güéring"),
                PhraseItem(es = "¿Llevaba algún accesorio la persona?", en = "WAS THE PERSON WEARING ANY ACCESSORIES?", phonetic = "was de pörson güéring éni aksésoris")
            )
        ),
        Lesson(
            lessonId = 302,
            lessonTitle = "Señas particulares y descripción operativa",
            vocabulary = listOf(
                VocabularyItem(es = "Tatuaje", en = "TATTOO", phonetic = "tatú"),
                VocabularyItem(es = "Cicatriz", en = "SCAR", phonetic = "scar"),
                VocabularyItem(es = "Dirección", en = "DIRECTION", phonetic = "dairékshon"),
                VocabularyItem(es = "Sospechoso", en = "SUSPECT", phonetic = "sáspect"),
                VocabularyItem(es = "Persona", en = "PERSON", phonetic = "pörson"),
                VocabularyItem(es = "Descripción", en = "DESCRIPTION", phonetic = "diskrípshon"),
                VocabularyItem(es = "Foto", en = "PHOTO", phonetic = "fóutou"),
                VocabularyItem(es = "Hacer (auxiliar presente)", en = "DOES", phonetic = "das"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Haber (existencial - hay)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Visible", en = "VISIBLE", phonetic = "vísibol"),
                VocabularyItem(es = "Cuál / Qué (elección)", en = "WHICH", phonetic = "güich"),
                VocabularyItem(es = "Camino / Dirección", en = "WAY", phonetic = "güéi"),
                VocabularyItem(es = "Hacer (auxiliar pasado)", en = "DID", phonetic = "did"),
                VocabularyItem(es = "Ir", en = "GO", phonetic = "gou"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Ver", en = "SEE", phonetic = "si"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Ellos / Ellas", en = "THEY", phonetic = "déi"),
                VocabularyItem(es = "Ir (pasado)", en = "WENT", phonetic = "güent"),
                VocabularyItem(es = "Poder (capacidad)", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Describir", en = "DESCRIBE", phonetic = "diskráib"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Ver (pasado)", en = "SAW", phonetic = "so"),
                VocabularyItem(es = "Cuándo", en = "WHEN", phonetic = "güen"),
                VocabularyItem(es = "Último", en = "LAST", phonetic = "last"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Reciente", en = "RECENT", phonetic = "rísent")
            ),
            phrases = listOf(
                PhraseItem(es = "¿Tiene la persona algún tatuaje?", en = "DOES THE PERSON HAVE ANY TATTOOS?", phonetic = "das de pörson jav éni tatús"),
                PhraseItem(es = "¿Hay alguna cicatriz visible?", en = "ARE THERE ANY VISIBLE SCARS?", phonetic = "ar der éni vísibol scars"),
                PhraseItem(es = "¿Hacia dónde se fue la persona?", en = "WHICH WAY DID THE PERSON GO?", phonetic = "güich güéi did de pörson gou"),
                PhraseItem(es = "¿Vio hacia dónde se dirigió?", en = "DID YOU SEE WHERE THEY WENT?", phonetic = "did yu si güer déi güent"),
                PhraseItem(es = "¿Puede describir al sospechoso?", en = "CAN YOU DESCRIBE THE SUSPECT?", phonetic = "can yu diskráib de sáspect"),
                PhraseItem(es = "¿Es esta la persona que vio?", en = "IS THIS THE PERSON YOU SAW?", phonetic = "is dis de pörson yu so"),
                PhraseItem(es = "¿Cuándo vio a esta persona por última vez?", en = "WHEN DID YOU LAST SEE THIS PERSON?", phonetic = "güen did yu last si dis pörson"),
                PhraseItem(es = "¿Tiene una foto reciente?", en = "DO YOU HAVE A RECENT PHOTO?", phonetic = "du yu jav a rísent fóutou")
            )
        ),
        Lesson(
            lessonId = 303,
            lessonTitle = "Prendas específicas y accesorios",
            vocabulary = listOf(
                VocabularyItem(es = "Chaqueta", en = "JACKET", phonetic = "dzáket"),
                VocabularyItem(es = "Gorra / Sombrero", en = "HAT", phonetic = "hat"),
                VocabularyItem(es = "Gafas de sol", en = "SUNGLASSES", phonetic = "sánglases"),
                VocabularyItem(es = "Camisa", en = "SHIRT", phonetic = "shert"),
                VocabularyItem(es = "Pantalones", en = "TROUSERS", phonetic = "tráuzas"),
                VocabularyItem(es = "Mochila", en = "BACKPACK", phonetic = "bákpak"),
                VocabularyItem(es = "Contenido", en = "CONTENTS", phonetic = "cóntents"),
                VocabularyItem(es = "Bolsillo", en = "POCKET", phonetic = "pócket"),
                VocabularyItem(es = "Quieto / Fijo", en = "STILL", phonetic = "stil"),
                VocabularyItem(es = "Llevar / Transportar", en = "CARRY", phonetic = "kári"),
                VocabularyItem(es = "Ser / Estar", en = "IS", phonetic = "is"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Persona", en = "PERSON", phonetic = "pörson"),
                VocabularyItem(es = "Llevar puesto", en = "WEARING", phonetic = "güéring"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Qué / Cuál", en = "WHAT", phonetic = "guat"),
                VocabularyItem(es = "Color", en = "COLOUR", phonetic = "cólor"),
                VocabularyItem(es = "Su / Sus (de ellos/ellas)", en = "THEIR", phonetic = "der"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Mostrar / Enseñar", en = "SHOW", phonetic = "shou"),
                VocabularyItem(es = "De (posesión)", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Permanecer / Mantener", en = "STAY", phonetic = "stéi")
            ),
            phrases = listOf(
                PhraseItem(es = "¿Lleva chaqueta?", en = "IS THE PERSON WEARING A JACKET?", phonetic = "is de pörson güéring a dzáket"),
                PhraseItem(es = "¿Lleva gorra o sombrero?", en = "IS THE PERSON WEARING A HAT?", phonetic = "is de pörson güéring a hat"),
                PhraseItem(es = "¿Lleva gafas de sol?", en = "IS THE PERSON WEARING SUNGLASSES?", phonetic = "is de pörson güéring sánglases"),
                PhraseItem(es = "¿De qué color es su camisa?", en = "WHAT COLOUR IS THEIR SHIRT?", phonetic = "guat cólor is der shert"),
                PhraseItem(es = "¿De qué color son sus pantalones?", en = "WHAT COLOUR ARE THEIR TROUSERS?", phonetic = "guat cólor ar der tráuzas"),
                PhraseItem(es = "¿Lleva una mochila?", en = "IS THE PERSON CARRYING A BACKPACK?", phonetic = "is de pörson káriing a bákpak"),
                PhraseItem(es = "Muestre el contenido de sus bolsillos, por favor.", en = "SHOW THE CONTENTS OF YOUR POCKETS, PLEASE.", phonetic = "shou de cóntents ov yor póckets, plis"),
                PhraseItem(es = "Manténgase quieto, por favor.", en = "PLEASE STAY STILL.", phonetic = "plís stéi stil")
            )
        )
    )
)
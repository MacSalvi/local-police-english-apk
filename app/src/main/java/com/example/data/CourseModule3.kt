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
                VocabularyItem(es = "Edad", en = "AGE", phonetic = "eich"),
                VocabularyItem(es = "Alto", en = "TALL", phonetic = "tol"),
                VocabularyItem(es = "Bajo", en = "SHORT", phonetic = "short"),
                VocabularyItem(es = "Pelo", en = "HAIR", phonetic = "jer"),
                VocabularyItem(es = "Ojos", en = "EYES", phonetic = "áis"),
                VocabularyItem(es = "Ropa", en = "CLOTHES", phonetic = "klóuds")
            ),
            phrases = listOf(
                PhraseItem(es = "¿Es la persona un hombre o una mujer?", en = "IS THE PERSON A MAN OR A WOMAN?", phonetic = "is de pörson a man or a wúman"),
                PhraseItem(es = "¿Qué edad tiene la persona, aproximadamente?", en = "HOW OLD IS THE PERSON, APPROXIMATELY?", phonetic = "jau old is de pörson, aprócsimetli"),
                PhraseItem(es = "¿Qué altura tiene la persona?", en = "HOW TALL IS THE PERSON?", phonetic = "jau tol is de pörson"),
                PhraseItem(es = "¿Cómo es su complexión?", en = "WHAT'S THEIR BUILD?", phonetic = "guats der bild"),
                PhraseItem(es = "¿De qué color es su pelo?", en = "WHAT COLOUR IS THEIR HAIR?", phonetic = "guat cólor is der jer"),
                PhraseItem(es = "¿De qué color son sus ojos?", en = "WHAT COLOUR ARE THEIR EYES?", phonetic = "guat cólor ar der áis"),
                PhraseItem(es = "¿Qué llevaba puesto la persona?", en = "WHAT WAS THE PERSON WEARING?", phonetic = "guat guas de pörson güéring"),
                PhraseItem(es = "¿Llevaba algún accesorio la persona?", en = "WAS THE PERSON WEARING ANY ACCESSORIES?", phonetic = "guas de pörson güéring éni aksésoris")
            )
        ),
        Lesson(
            lessonId = 302,
            lessonTitle = "Señas particulares y descripción operativa",
            vocabulary = listOf(
                VocabularyItem(es = "Tatuaje", en = "TATTOO", phonetic = "tatú"),
                VocabularyItem(es = "Cicatriz", en = "SCAR", phonetic = "scar"),
                VocabularyItem(es = "Dirección (de huida)", en = "DIRECTION", phonetic = "dairékshon"),
                VocabularyItem(es = "Sospechoso", en = "SUSPECT", phonetic = "sáspect"),
                VocabularyItem(es = "Persona desaparecida", en = "MISSING PERSON", phonetic = "mísing pörson"),
                VocabularyItem(es = "Descripción", en = "DESCRIPTION", phonetic = "diskrípshon"),
                VocabularyItem(es = "Foto", en = "PHOTO", phonetic = "fóutou")
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
        )
    )
)

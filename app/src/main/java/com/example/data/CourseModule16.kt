package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module16 {
    val module = Module(
        id = 16,
        title = "Módulo 16",
        description = "Violencia doméstica y personas vulnerables.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Violencia doméstica y personas vulnerables",
                vocabulary = listOf(
                    VocabularyItem(term = "DOMESTIC VIOLENCE", phonetic = "doméstik váiolens", translation = "Violencia doméstica"),
                    VocabularyItem(term = "DOMESTIC ABUSE", phonetic = "doméstik abiús", translation = "Maltrato en el ámbito familiar"),
                    VocabularyItem(term = "VICTIM", phonetic = "víctim", translation = "Víctima"),
                    VocabularyItem(term = "AGGRESSOR", phonetic = "agrésa", translation = "Agresor"),
                    VocabularyItem(term = "ASSAULT", phonetic = "asólt", translation = "Agresión"),
                    VocabularyItem(term = "THREAT", phonetic = "zret", translation = "Amenaza"),
                    VocabularyItem(term = "HARASSMENT", phonetic = "járasmént", translation = "Acoso"),
                    VocabularyItem(term = "INJURY", phonetic = "ínyuri", translation = "Lesión"),
                    VocabularyItem(term = "BRUISE", phonetic = "brúz", translation = "Moratón"),
                    VocabularyItem(term = "CUT", phonetic = "kat", translation = "Corte"),
                    VocabularyItem(term = "BLEEDING", phonetic = "blídin", translation = "Hemorragia"),
                    VocabularyItem(term = "PAIN", phonetic = "péin", translation = "Dolor"),
                    VocabularyItem(term = "CHILD", phonetic = "chaild", translation = "Menor"),
                    VocabularyItem(term = "BABY", phonetic = "béibi", translation = "Bebé"),
                    VocabularyItem(term = "ELDERLY PERSON", phonetic = "éldeli pérson", translation = "Persona mayor"),
                    VocabularyItem(term = "VULNERABLE PERSON", phonetic = "válnerabol pérson", translation = "Persona vulnerable"),
                    VocabularyItem(term = "DISABILITY", phonetic = "disabíliti", translation = "Discapacidad"),
                    VocabularyItem(term = "CARER", phonetic = "kéara", translation = "Cuidador"),
                    VocabularyItem(term = "SAFE PLACE", phonetic = "séif pleis", translation = "Lugar seguro"),
                    VocabularyItem(term = "PROTECTION", phonetic = "protékshon", translation = "Protección"),
                    VocabularyItem(term = "AMBULANCE", phonetic = "ámbiulans", translation = "Ambulancia"),
                    VocabularyItem(term = "HOSPITAL", phonetic = "hóspital", translation = "Hospital"),
                    VocabularyItem(term = "EMERGENCY", phonetic = "imérllensi", translation = "Emergencia"),
                    VocabularyItem(term = "HELP", phonetic = "jelp", translation = "Ayuda"),
                    VocabularyItem(term = "SUPPORT", phonetic = "sapórt", translation = "Apoyo")
                ),
                phrases = listOf(
                    PhraseItem(english = "ARE YOU HURT?", phonetic = "ar yu jert", spanish = "¿Está herido?"),
                    PhraseItem(english = "DO YOU NEED AN AMBULANCE?", phonetic = "du yu nid an ámbiulans", spanish = "¿Necesita una ambulancia?"),
                    PhraseItem(english = "DO YOU NEED MEDICAL ASSISTANCE?", phonetic = "du yu nid médikol asístans", spanish = "¿Necesita asistencia médica?"),
                    PhraseItem(english = "ARE YOU IN PAIN?", phonetic = "ar yu in péin", spanish = "¿Tiene dolor?"),
                    PhraseItem(english = "HAS ANYONE HIT YOU?", phonetic = "jaz éniuan jit yu", spanish = "¿Alguien le ha golpeado?"),
                    PhraseItem(english = "HAS ANYONE THREATENED YOU?", phonetic = "jaz éniuan zrétend yu", spanish = "¿Alguien le ha amenazado?"),
                    PhraseItem(english = "ARE YOU SAFE NOW?", phonetic = "ar yu séif nau", spanish = "¿Está seguro ahora?"),
                    PhraseItem(english = "DO YOU FEEL SAFE GOING HOME?", phonetic = "du yu fil séif góuin joum", spanish = "¿Se siente seguro para volver a casa?"),
                    PhraseItem(english = "IS ANYONE ELSE INSIDE THE PROPERTY?", phonetic = "is éniuan els insáid de próperti", spanish = "¿Hay alguien más dentro de la vivienda?"),
                    PhraseItem(english = "ARE THERE ANY CHILDREN INSIDE?", phonetic = "ar dea éni chíldren insáid", spanish = "¿Hay menores dentro?"),
                    PhraseItem(english = "PLEASE STAY HERE.", phonetic = "plís stéi jía", spanish = "Permanezca aquí, por favor."),
                    PhraseItem(english = "PLEASE STAY CALM.", phonetic = "plís stéi cam", spanish = "Mantenga la calma, por favor."),
                    PhraseItem(english = "YOU ARE SAFE NOW.", phonetic = "yu ar séif nau", spanish = "Ahora está a salvo."),
                    PhraseItem(english = "WE ARE HERE TO HELP YOU.", phonetic = "güi ar jía tu jelp yu", spanish = "Estamos aquí para ayudarle."),
                    PhraseItem(english = "PLEASE TELL ME WHAT HAPPENED.", phonetic = "plís tel mi guot jápend", spanish = "Dígame qué ha ocurrido."),
                    PhraseItem(english = "PLEASE SPEAK SLOWLY.", phonetic = "plís spik slóuli", spanish = "Hable despacio, por favor."),
                    PhraseItem(english = "HAS THIS HAPPENED BEFORE?", phonetic = "jaz dis jápend bifó", spanish = "¿Ha ocurrido antes?"),
                    PhraseItem(english = "WHEN DID THIS HAPPEN?", phonetic = "guen did dis jápen", spanish = "¿Cuándo ocurrió?"),
                    PhraseItem(english = "WHO DID THIS TO YOU?", phonetic = "ju did dis tu yu", spanish = "¿Quién le hizo esto?"),
                    PhraseItem(english = "CAN YOU SHOW ME YOUR INJURIES?", phonetic = "can yu shóu mi yor ínyuris", spanish = "¿Puede mostrarme las lesiones?"),
                    PhraseItem(english = "DO YOU NEED SOMEONE TO STAY WITH YOU?", phonetic = "du yu nid sámuan tu stéi güiz yu", spanish = "¿Necesita que alguien permanezca con usted?"),
                    PhraseItem(english = "WE WILL CALL AN AMBULANCE.", phonetic = "güi wil kol an ámbiulans", spanish = "Vamos a llamar a una ambulancia."),
                    PhraseItem(english = "WE WILL MAKE SURE YOU ARE SAFE.", phonetic = "güi wil meik shua yu ar séif", spanish = "Nos aseguraremos de que esté seguro."),
                    PhraseItem(english = "PLEASE WAIT HERE WHILE WE HELP YOU.", phonetic = "plís güeit jía guáil güi jelp yu", spanish = "Espere aquí mientras le ayudamos."),
                    PhraseItem(english = "DO YOU UNDERSTAND?", phonetic = "du yu ánderstand", spanish = "¿Me entiende?"),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
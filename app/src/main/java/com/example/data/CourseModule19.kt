package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module19 {
    val module = Module(
        id = 19,
        title = "Módulo 19",
        description = "Playas, piscinas y rescate.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Playas, piscinas y rescate",
                vocabulary = listOf(
                    VocabularyItem(term = "BEACH", phonetic = "bich", translation = "Playa"),
                    VocabularyItem(term = "SWIMMING POOL", phonetic = "suímin pul", translation = "Piscina"),
                    VocabularyItem(term = "SEA", phonetic = "si", translation = "Mar"),
                    VocabularyItem(term = "WATER", phonetic = "guóta", translation = "Agua"),
                    VocabularyItem(term = "WAVES", phonetic = "gueivs", translation = "Olas"),
                    VocabularyItem(term = "CURRENT", phonetic = "kárrent", translation = "Corriente"),
                    VocabularyItem(term = "RIP CURRENT", phonetic = "rip kárrent", translation = "Corriente de resaca"),
                    VocabularyItem(term = "TIDE", phonetic = "taid", translation = "Marea"),
                    VocabularyItem(term = "ROCKS", phonetic = "roks", translation = "Rocas"),
                    VocabularyItem(term = "CLIFF", phonetic = "clif", translation = "Acantilado"),
                    VocabularyItem(term = "LIFEGUARD", phonetic = "láifgard", translation = "Socorrista"),
                    VocabularyItem(term = "RESCUE", phonetic = "réskiu", translation = "Rescate"),
                    VocabularyItem(term = "LIFE JACKET", phonetic = "láif yákit", translation = "Chaleco salvavidas"),
                    VocabularyItem(term = "LIFE BUOY", phonetic = "láif bói", translation = "Flotador salvavidas"),
                    VocabularyItem(term = "RED FLAG", phonetic = "red flag", translation = "Bandera roja"),
                    VocabularyItem(term = "YELLOW FLAG", phonetic = "yélou flag", translation = "Bandera amarilla"),
                    VocabularyItem(term = "GREEN FLAG", phonetic = "grin flag", translation = "Bandera verde"),
                    VocabularyItem(term = "NO SWIMMING", phonetic = "nóu suímin", translation = "Prohibido bañarse"),
                    VocabularyItem(term = "DEEP WATER", phonetic = "dip guóta", translation = "Agua profunda"),
                    VocabularyItem(term = "SHALLOW WATER", phonetic = "shálou guóta", translation = "Agua poco profunda"),
                    VocabularyItem(term = "DROWING", phonetic = "dráuin", translation = "Ahogamiento"),
                    VocabularyItem(term = "UNCONSCIOUS", phonetic = "ancónshas", translation = "Inconsciente"),
                    VocabularyItem(term = "EXHAUSTED", phonetic = "igsóstid", translation = "Exhausto"),
                    VocabularyItem(term = "SUNSTROKE", phonetic = "sánstrouk", translation = "Insolación"),
                    VocabularyItem(term = "DEHYDRATION", phonetic = "dihaidrèishon", translation = "Deshidratación"),
                    VocabularyItem(term = "JELLYFISH", phonetic = "yélifish", translation = "Medusa"),
                    VocabularyItem(term = "SHARK", phonetic = "shak", translation = "Tiburón"),
                    VocabularyItem(term = "BOAT", phonetic = "bout", translation = "Embarcación"),
                    VocabularyItem(term = "JET SKI", phonetic = "yet ski", translation = "Moto acuática")
                ),
                phrases = listOf(
                    PhraseItem(english = "THIS BEACH IS CLOSED.", phonetic = "dis bich is klóuzd", spanish = "Esta playa está cerrada."),
                    PhraseItem(english = "SWIMMING IS NOT ALLOWED.", phonetic = "suímin is not aláud", spanish = "Está prohibido bañarse."),
                    PhraseItem(english = "DO NOT GO INTO THE WATER.", phonetic = "du not góu intu de guóta", spanish = "No entre en el agua."),
                    PhraseItem(english = "PLEASE LEAVE THE WATER IMMEDIATELY.", phonetic = "plís liv de guóta imídietli", spanish = "Salga del agua inmediatamente."),
                    PhraseItem(english = "THE RED FLAG IS FLYING.", phonetic = "de red flag is fláin", spanish = "Está izada la bandera roja."),
                    PhraseItem(english = "PLEASE OBEY THE LIFEGUARDS.", phonetic = "plís obéi de láifgards", spanish = "Haga caso a los socorristas."),
                    PhraseItem(english = "PLEASE MOVE AWAY FROM THE ROCKS.", phonetic = "plís muv aguéi from de roks", spanish = "Aléjese de las rocas."),
                    PhraseItem(english = "THERE IS A STRONG CURRENT.", phonetic = "dea is a strong kárrent", spanish = "Hay una fuerte corriente."),
                    PhraseItem(english = "THE SEA IS NOT SAFE TODAY.", phonetic = "de si is not séif tudéi", spanish = "El mar no está seguro hoy."),
                    PhraseItem(english = "DO YOU NEED HELP?", phonetic = "du yu nid jelp", spanish = "¿Necesita ayuda?"),
                    PhraseItem(english = "ARE YOU INJURED?", phonetic = "ar yu ínyerd", spanish = "¿Está herido?"),
                    PhraseItem(english = "CAN YOU SWIM?", phonetic = "can yu suim", spanish = "¿Sabe nadar?"),
                    PhraseItem(english = "IS ANYONE STILL IN THE WATER?", phonetic = "is éniuan stil in de guóta", spanish = "¿Queda alguien en el agua?"),
                    PhraseItem(english = "HOW MANY PEOPLE ARE IN THE WATER?", phonetic = "jáu méni pípol ar in de guóta", spanish = "¿Cuántas personas hay en el agua?"),
                    PhraseItem(english = "POINT TO THEIR LOCATION.", phonetic = "point tu dea loukéishon", spanish = "Señale dónde están."),
                    PhraseItem(english = "STAY CALM.", phonetic = "stéi cam", spanish = "Mantenga la calma."),
                    PhraseItem(english = "DO NOT GO BACK INTO THE WATER.", phonetic = "du not góu bak intu de guóta", spanish = "No vuelva a entrar en el agua."),
                    PhraseItem(english = "SIT DOWN HERE.", phonetic = "sit daun jía", spanish = "Siéntese aquí."),
                    PhraseItem(english = "DRINK SOME WATER SLOWLY.", phonetic = "drink sam guóta slóuli", spanish = "Beba agua despacio."),
                    PhraseItem(english = "DO YOU FEEL DIZZY?", phonetic = "du yu fil dízi", spanish = "¿Se siente mareado?"),
                    PhraseItem(english = "HAVE YOU BEEN STUNG BY A JELLYFISH?", phonetic = "jav yu bin stang bai a yélifish", spanish = "¿Le ha picado una medusa?"),
                    PhraseItem(english = "DO YOU HAVE ANY PAIN?", phonetic = "du yu jav éni péin", spanish = "¿Tiene algún dolor?"),
                    PhraseItem(english = "THE AMBULANCE IS ON THE WAY.", phonetic = "di ámbiulans is on de güei", spanish = "La ambulancia está de camino."),
                    PhraseItem(english = "THE LIFEGUARDS ARE COMING.", phonetic = "de láifgards ar cámin", spanish = "Los socorristas están llegando."),
                    PhraseItem(english = "PLEASE WAIT HERE.", phonetic = "plís güeit jía", spanish = "Espere aquí, por favor."),
                    PhraseItem(english = "KEEP AWAY FROM THE WATER.", phonetic = "kip aguéi from de guóta", spanish = "Manténgase alejado del agua."),
                    PhraseItem(english = "PLEASE MOVE BEHIND THE POLICE LINE.", phonetic = "plís muv biháind de polís lain", spanish = "Colóquese detrás del cordón policial."),
                    PhraseItem(english = "DO NOT CROSS THE BARRIER.", phonetic = "du not kros de bária", spanish = "No cruce la barrera."),
                    PhraseItem(english = "FOLLOW MY INSTRUCTIONS.", phonetic = "fólou mai instrákshons", spanish = "Siga mis instrucciones."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
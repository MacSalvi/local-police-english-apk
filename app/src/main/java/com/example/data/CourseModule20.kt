package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module20 {
    val module = Module(
        id = 20,
        title = "Módulo 20",
        description = "Registros e inspecciones",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Menores y personas desaparecidas",
                vocabulary = listOf(
                    VocabularyItem(term = "CHILD", phonetic = "chaild", translation = "Niño"),
                    VocabularyItem(term = "MINOR", phonetic = "máinor", translation = "Menor"),
                    VocabularyItem(term = "TEENAGER", phonetic = "tíneiya", translation = "Adolescente"),
                    VocabularyItem(term = "MISSING PERSON", phonetic = "mísin pérson", translation = "Persona desaparecida"),
                    VocabularyItem(term = "LOST CHILD", phonetic = "lost chaild", translation = "Niño perdido"),
                    VocabularyItem(term = "PARENTS", phonetic = "pérents", translation = "Padres"),
                    VocabularyItem(term = "GUARDIAN", phonetic = "gádian", translation = "Tutor"),
                    VocabularyItem(term = "FAMILY MEMBER", phonetic = "fámili mémba", translation = "Familiar"),
                    VocabularyItem(term = "DESCRIPTION", phonetic = "diskrípshon", translation = "Descripción"),
                    VocabularyItem(term = "HEIGHT", phonetic = "jait", translation = "Altura"),
                    VocabularyItem(term = "BUILD", phonetic = "bild", translation = "Complexión"),
                    VocabularyItem(term = "HAIR", phonetic = "jea", translation = "Pelo"),
                    VocabularyItem(term = "EYES", phonetic = "ais", translation = "Ojos"),
                    VocabularyItem(term = "GLASSES", phonetic = "glásis", translation = "Gafas"),
                    VocabularyItem(term = "CLOTHING", phonetic = "klóuzin", translation = "Ropa"),
                    VocabularyItem(term = "JACKET", phonetic = "yákit", translation = "Chaqueta"),
                    VocabularyItem(term = "TROUSERS", phonetic = "tráusers", translation = "Pantalones"),
                    VocabularyItem(term = "SHORTS", phonetic = "shorts", translation = "Pantalón corto"),
                    VocabularyItem(term = "SHOES", phonetic = "shuz", translation = "Zapatos"),
                    VocabularyItem(term = "BACKPACK", phonetic = "bákpak", translation = "Mochila"),
                    VocabularyItem(term = "MOBILE PHONE", phonetic = "móubail fóun", translation = "Teléfono móvil"),
                    VocabularyItem(term = "PHOTOGRAPH", phonetic = "fóutograf", translation = "Fotografía"),
                    VocabularyItem(term = "LOCATION", phonetic = "loukéishon", translation = "Lugar"),
                    VocabularyItem(term = "PLAYGROUND", phonetic = "pléigraund", translation = "Parque infantil"),
                    VocabularyItem(term = "HOTEL", phonetic = "joutél", translation = "Hotel"),
                    VocabularyItem(term = "BEACH", phonetic = "bich", translation = "Playa"),
                    VocabularyItem(term = "MEDICATION", phonetic = "medikéishon", translation = "Medicación"),
                    VocabularyItem(term = "MEDICAL CONDITION", phonetic = "médikol kondíshon", translation = "Enfermedad"),
                    VocabularyItem(term = "DISTINGUISHING MARK", phonetic = "distintíguishin mak", translation = "Seña identificativa")
                ),
                phrases = listOf(
                    PhraseItem(english = "ARE YOU LOST?", phonetic = "ar yu lost", spanish = "¿Estás perdido?"),
                    PhraseItem(english = "WHAT IS YOUR NAME?", phonetic = "guot is yor neim", spanish = "¿Cómo te llamas?"),
                    PhraseItem(english = "HOW OLD ARE YOU?", phonetic = "jáu óuld ar yu", spanish = "¿Cuántos años tienes?"),
                    PhraseItem(english = "DO YOU KNOW YOUR PARENTS' NAMES?", phonetic = "du yu nóu yor pérents neims", spanish = "¿Sabes cómo se llaman tus padres?"),
                    PhraseItem(english = "DO YOU KNOW YOUR ADDRESS?", phonetic = "du yu nóu yor adrés", spanish = "¿Sabes dónde vives?"),
                    PhraseItem(english = "STAY WITH ME.", phonetic = "stéi güiz mi", spanish = "Quédate conmigo."),
                    PhraseItem(english = "DON'T WORRY.", phonetic = "dont güóri", spanish = "No te preocupes."),
                    PhraseItem(english = "WE ARE GOING TO HELP YOU.", phonetic = "güi ar góuin tu jelp yu", spanish = "Vamos a ayudarte."),
                    PhraseItem(english = "YOUR PARENTS ARE LOOKING FOR YOU.", phonetic = "yor pérents ar lúkin for yu", spanish = "Tus padres te están buscando."),
                    PhraseItem(english = "WHEN DID YOU LAST SEE THEM?", phonetic = "guen did yu last si dem", spanish = "¿Cuándo lo vio por última vez?"),
                    PhraseItem(english = "WHERE DID YOU LAST SEE THEM?", phonetic = "güea did yu last si dem", spanish = "¿Dónde lo vio por última vez?"),
                    PhraseItem(english = "WHO WAS THE CHILD WITH?", phonetic = "ju uoz de chaild güiz", spanish = "¿Con quién estaba el menor?"),
                    PhraseItem(english = "WHAT WERE THEY DOING?", phonetic = "guot güer dei dúin", spanish = "¿Qué estaba haciendo?"),
                    PhraseItem(english = "CAN YOU DESCRIBE THE CHILD?", phonetic = "can yu diskráib de chaild", spanish = "¿Puede describir al menor?"),
                    PhraseItem(english = "HOW TALL IS THE CHILD?", phonetic = "jáu tol is de chaild", spanish = "¿Qué altura tiene el menor?"),
                    PhraseItem(english = "WHAT COLOUR IS THEIR HAIR?", phonetic = "guot kála is dea jea", spanish = "¿De qué color tiene el pelo?"),
                    PhraseItem(english = "WHAT COLOUR ARE THEIR EYES?", phonetic = "guot kála ar dea ais", spanish = "¿De qué color tiene los ojos?"),
                    PhraseItem(english = "DO THEY WEAR GLASSES?", phonetic = "du dei güea glásis", spanish = "¿Lleva gafas?"),
                    PhraseItem(english = "DO THEY HAVE ANY DISTINGUISHING MARKS?", phonetic = "du dei jav éni distintíguishin maks", spanish = "¿Tiene alguna seña identificativa?"),
                    PhraseItem(english = "WHAT WAS THE CHILD WEARING?", phonetic = "guot uoz de chaild güérin", spanish = "¿Qué ropa llevaba el menor?"),
                    PhraseItem(english = "WHAT COLOUR WAS THE JACKET?", phonetic = "guot kála uoz de yákit", spanish = "¿De qué color era la chaqueta?"),
                    PhraseItem(english = "WHAT COLOUR WERE THE TROUSERS?", phonetic = "guot kála güer de tráusers", spanish = "¿De qué color eran los pantalones?"),
                    PhraseItem(english = "WHAT COLOUR WERE THE SHOES?", phonetic = "guot kála güer de shuz", spanish = "¿De qué color eran los zapatos?"),
                    PhraseItem(english = "WAS THE CHILD CARRYING A BACKPACK?", phonetic = "uoz de chaild kárrin a bákpak", spanish = "¿Llevaba mochila?"),
                    PhraseItem(english = "DO THEY HAVE A MOBILE PHONE?", phonetic = "du dei jav a móubail fóun", spanish = "¿Lleva teléfono móvil?"),
                    PhraseItem(english = "CAN YOU SHOW ME A RECENT PHOTOGRAPH?", phonetic = "can yu shóu mi a rísent fóutograf", spanish = "¿Puede enseñarme una fotografía reciente?"),
                    PhraseItem(english = "WHEN WAS THIS PHOTOGRAPH TAKEN?", phonetic = "guen uoz dis fóutograf téiken", spanish = "¿Cuándo se tomó esta fotografía?"),
                    PhraseItem(english = "HAS THIS HAPPENED BEFORE?", phonetic = "jas dis jápend bifó", spanish = "¿Ha ocurrido antes?"),
                    PhraseItem(english = "DO THEY HAVE ANY MEDICAL CONDITION?", phonetic = "du dei jav éni médikol kondíshon", spanish = "¿Tiene alguna enfermedad?"),
                    PhraseItem(english = "DO THEY NEED ANY MEDICATION?", phonetic = "du dei nid éni medikéishon", spanish = "¿Necesita medicación?"),
                    PhraseItem(english = "DO YOU THINK THEY MAY HAVE GONE TO A PARTICULAR PLACE?", phonetic = "du yu zink dei méi jav gon tu a patíkula pleis", spanish = "¿Cree que puede haber ido a algún lugar concreto?"),
                    PhraseItem(english = "DO THEY KNOW THIS AREA?", phonetic = "du dei nóu dis éria", spanish = "¿Conoce esta zona?"),
                    PhraseItem(english = "HAS ANYONE TRIED TO CONTACT THEM?", phonetic = "jas éniuan traid tu cóntakt dem", spanish = "¿Alguien ha intentado contactar con él o ella?"),
                    PhraseItem(english = "PLEASE STAY HERE.", phonetic = "plís stéi jía", spanish = "Permanezca aquí, por favor."),
                    PhraseItem(english = "PLEASE KEEP YOUR PHONE AVAILABLE.", phonetic = "plís kip yor fóun avéilabol", spanish = "Mantenga su teléfono disponible."),
                    PhraseItem(english = "IF YOU REMEMBER ANYTHING ELSE, PLEASE TELL ME.", phonetic = "if yu rimémba énizin els plís tel mi", spanish = "Si recuerda cualquier otro detalle, dígamelo."),
                    PhraseItem(english = "WE ARE SEARCHING THE AREA NOW.", phonetic = "güi ar sérchin di éria nau", spanish = "Estamos buscando por la zona."),
                    PhraseItem(english = "WE WILL CONTACT YOU AS SOON AS WE HAVE ANY NEWS.", phonetic = "güi wil cóntakt yu as sun as güi jav éni nius", spanish = "Nos pondremos en contacto con usted en cuanto tengamos noticias."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
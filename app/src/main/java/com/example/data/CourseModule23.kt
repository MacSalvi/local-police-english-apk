package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module23 {
    val module = Module(
        id = 23,
        title = "Módulo 23",
        description = "Personas ebrias, drogadas o con alteración del comportamiento.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Personas ebrias, drogadas o con alteración del comportamiento",
                vocabulary = listOf(
                    VocabularyItem(term = "DRUNK", phonetic = "drank", translation = "Borracho"),
                    VocabularyItem(term = "INTOXICATED", phonetic = "intóksikeitid", translation = "Intoxicado"),
                    VocabularyItem(term = "UNDER THE INFLUENCE", phonetic = "anda de ínfluens", translation = "Bajo los efectos"),
                    VocabularyItem(term = "ALCOHOL", phonetic = "álkohol", translation = "Alcohol"),
                    VocabularyItem(term = "DRUGS", phonetic = "drags", translation = "Drogas"),
                    VocabularyItem(term = "MEDICATION", phonetic = "medikéishon", translation = "Medicación"),
                    VocabularyItem(term = "AGGRESSIVE", phonetic = "agrésiv", translation = "Agresivo"),
                    VocabularyItem(term = "VIOLENT", phonetic = "váiolent", translation = "Violento"),
                    VocabularyItem(term = "UNCOOPERATIVE", phonetic = "ancouóperativ", translation = "No colaborador"),
                    VocabularyItem(term = "DISTURBANCE", phonetic = "distérbans", translation = "Alteración del orden"),
                    VocabularyItem(term = "PUBLIC ORDER", phonetic = "páblik órda", translation = "Orden público"),
                    VocabularyItem(term = "RISK", phonetic = "risk", translation = "Riesgo"),
                    VocabularyItem(term = "DANGER", phonetic = "déinlla", translation = "Peligro"),
                    VocabularyItem(term = "AMBULANCE", phonetic = "ámbiulans", translation = "Ambulancia"),
                    VocabularyItem(term = "PARAMEDIC", phonetic = "parámedik", translation = "Sanitario"),
                    VocabularyItem(term = "HOSPITAL", phonetic = "hóspital", translation = "Hospital"),
                    VocabularyItem(term = "SAFETY", phonetic = "séifti", translation = "Seguridad"),
                    VocabularyItem(term = "BEHAVIOUR", phonetic = "bihéivia", translation = "Comportamiento"),
                    VocabularyItem(term = "CONTROL", phonetic = "kontróul", translation = "Control"),
                    VocabularyItem(term = "ASSISTANCE", phonetic = "asistans", translation = "Ayuda")
                ),
                phrases = listOf(
                    PhraseItem(english = "POLICE. LOOK AT ME.", phonetic = "polís. luk at mi", spanish = "Policía. Míreme."),
                    PhraseItem(english = "LISTEN TO ME.", phonetic = "lísen tu mi", spanish = "Escúcheme."),
                    PhraseItem(english = "CALM DOWN.", phonetic = "kam daun", spanish = "Cálmese."),
                    PhraseItem(english = "STAY CALM.", phonetic = "stéi kam", spanish = "Mantenga la calma."),
                    PhraseItem(english = "STOP SHOUTING.", phonetic = "stop sháutin", spanish = "Deje de gritar."),
                    PhraseItem(english = "STOP SWEARING.", phonetic = "stop suérin", spanish = "Deje de insultar."),
                    PhraseItem(english = "STOP NOW.", phonetic = "stop nau", spanish = "Pare ahora."),
                    PhraseItem(english = "THAT'S ENOUGH.", phonetic = "dats ináf", spanish = "Ya está."),
                    PhraseItem(english = "STAY WHERE YOU ARE.", phonetic = "stéi güea yu ar", spanish = "Quédese donde está."),
                    PhraseItem(english = "DO NOT MOVE.", phonetic = "du not muv", spanish = "No se mueva."),
                    PhraseItem(english = "DO NOT COME ANY CLOSER.", phonetic = "du not cam éni klóusa", spanish = "No se acerque más."),
                    PhraseItem(english = "STEP BACK.", phonetic = "step bak", spanish = "Dé un paso atrás."),
                    PhraseItem(english = "MOVE AWAY.", phonetic = "muv aguéi", spanish = "Aléjese."),
                    PhraseItem(english = "KEEP YOUR HANDS WHERE I CAN SEE THEM.", phonetic = "kip yor jands güea ai can si dem", spanish = "Mantenga las manos donde pueda verlas."),
                    PhraseItem(english = "KEEP YOUR HANDS OUT OF YOUR POCKETS.", phonetic = "kip yor jands aut ov yor pókits", spanish = "Saque las manos de los bolsillos."),
                    PhraseItem(english = "SIT DOWN HERE.", phonetic = "sit daun jía", spanish = "Siéntese aquí."),
                    PhraseItem(english = "STAND STILL.", phonetic = "stand stil", spanish = "Quédese quieto."),
                    PhraseItem(english = "DO NOT TOUCH ANYONE.", phonetic = "du not tach éniuan", spanish = "No toque a nadie."),
                    PhraseItem(english = "LEAVE THESE PEOPLE ALONE.", phonetic = "liv diz pípol alóun", spanish = "Deje en paz a estas personas."),
                    PhraseItem(english = "YOU NEED TO CALM DOWN.", phonetic = "yu nid tu kam daun", spanish = "Necesita calmarse."),
                    PhraseItem(english = "YOU ARE DISTURBING OTHER PEOPLE.", phonetic = "yu ar distérbin áda pípol", spanish = "Está molestando a otras personas."),
                    PhraseItem(english = "YOUR BEHAVIOUR IS UNACCEPTABLE.", phonetic = "yor bihéivia is anakséptabol", spanish = "Su comportamiento es inaceptable."),
                    PhraseItem(english = "YOU ARE NOT IN A CONDITION TO CONTINUE.", phonetic = "yu ar not in a kondíshon tu kontíniu", spanish = "No está en condiciones de continuar."),
                    PhraseItem(english = "YOU ARE NOT IN A CONDITION TO LOOK AFTER YOURSELF.", phonetic = "yu ar not in a kondíshon tu luk áfta yorself", spanish = "No está en condiciones de cuidarse."),
                    PhraseItem(english = "FOR YOUR OWN SAFETY, STAY HERE.", phonetic = "for yor oun séifti stéi jía", spanish = "Por su propia seguridad, quédese aquí."),
                    PhraseItem(english = "WE ARE TRYING TO HELP YOU.", phonetic = "güi ar tráiin tu jelp yu", spanish = "Estamos intentando ayudarle."),
                    PhraseItem(english = "AN AMBULANCE IS ON THE WAY.", phonetic = "an ámbiulans is on de güei", spanish = "Una ambulancia está de camino."),
                    PhraseItem(english = "YOU NEED MEDICAL ASSISTANCE.", phonetic = "yu nid médikol asistans", spanish = "Necesita asistencia médica."),
                    PhraseItem(english = "DO NOT DRIVE.", phonetic = "du not dráiv", spanish = "No conduzca."),
                    PhraseItem(english = "HAND OVER THE BOTTLE.", phonetic = "jand óuva de bótol", spanish = "Entrégueme la botella."),
                    PhraseItem(english = "PUT THE BOTTLE ON THE GROUND.", phonetic = "put de bótol on de graund", spanish = "Deje la botella en el suelo."),
                    PhraseItem(english = "PUT THAT DOWN NOW.", phonetic = "put dat daun nau", spanish = "Deje eso en el suelo ahora mismo."),
                    PhraseItem(english = "IF YOU DO NOT COOPERATE, YOU MAY BE DETAINED.", phonetic = "if yu du not couópareit yu méi bi ditéinid", spanish = "Si no colabora, puede ser detenido."),
                    PhraseItem(english = "DO NOT MAKE THIS SITUATION WORSE.", phonetic = "du not meik dis sitchuéishon uérs", spanish = "No empeore esta situación.")
                )
            )
        )
    )
}
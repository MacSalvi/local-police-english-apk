package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module17 {
    val module = Module(
        id = 17,
        title = "Módulo 17",
        description = "Primera asistencia y emergencias médicas.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Primera asistencia y emergencias médicas",
                vocabulary = listOf(
                    VocabularyItem(term = "EMERGENCY", phonetic = "imérllensi", translation = "Emergencia"),
                    VocabularyItem(term = "AMBULANCE", phonetic = "ámbiulans", translation = "Ambulancia"),
                    VocabularyItem(term = "PARAMEDIC", phonetic = "paramédik", translation = "Sanitario"),
                    VocabularyItem(term = "FIRST AID", phonetic = "ferst eid", translation = "Primeros auxilios"),
                    VocabularyItem(term = "DEFIBRILLATOR", phonetic = "difibriléita", translation = "Desfibrilador"),
                    VocabularyItem(term = "CPR", phonetic = "si-pi-ar", translation = "Reanimación cardiopulmonar"),
                    VocabularyItem(term = "HEART ATTACK", phonetic = "jart atak", translation = "Infarto"),
                    VocabularyItem(term = "CARDIAC ARREST", phonetic = "kárdiak arrést", translation = "Parada cardíaca"),
                    VocabularyItem(term = "STROKE", phonetic = "stróuk", translation = "Ictus"),
                    VocabularyItem(term = "SEIZURE", phonetic = "sízha", translation = "Convulsión"),
                    VocabularyItem(term = "CHOKING", phonetic = "chóukin", translation = "Atragantamiento"),
                    VocabularyItem(term = "UNCONSCIOUS", phonetic = "ancónshas", translation = "Inconsciente"),
                    VocabularyItem(term = "CONSCIOUS", phonetic = "kónshas", translation = "Consciente"),
                    VocabularyItem(term = "BREATHING", phonetic = "brízin", translation = "Respiración"),
                    VocabularyItem(term = "PULSE", phonetic = "pals", translation = "Pulso"),
                    VocabularyItem(term = "CHEST PAIN", phonetic = "chest péin", translation = "Dolor en el pecho"),
                    VocabularyItem(term = "DIFFICULTY BREATHING", phonetic = "dífikolti brízin", translation = "Dificultad para respirar"),
                    VocabularyItem(term = "BLEEDING", phonetic = "blídin", translation = "Hemorragia"),
                    VocabularyItem(term = "FRACTURE", phonetic = "frákcha", translation = "Fractura"),
                    VocabularyItem(term = "BURN", phonetic = "bern", translation = "Quemadura"),
                    VocabularyItem(term = "HEAD INJURY", phonetic = "jed ínyuri", translation = "Lesión en la cabeza"),
                    VocabularyItem(term = "NECK INJURY", phonetic = "nek ínyuri", translation = "Lesión cervical"),
                    VocabularyItem(term = "BACK INJURY", phonetic = "bak ínyuri", translation = "Lesión de espalda"),
                    VocabularyItem(term = "PAIN", phonetic = "péin", translation = "Dolor"),
                    VocabularyItem(term = "DIZZY", phonetic = "dízi", translation = "Mareado"),
                    VocabularyItem(term = "FAINTING", phonetic = "féintin", translation = "Desmayo"),
                    VocabularyItem(term = "DIABETES", phonetic = "daiabítis", translation = "Diabetes"),
                    VocabularyItem(term = "LOW BLOOD SUGAR", phonetic = "lóu blad shúga", translation = "Hipoglucemia"),
                    VocabularyItem(term = "EPILEPSY", phonetic = "épilepsi", translation = "Epilepsia"),
                    VocabularyItem(term = "ASTHMA", phonetic = "ásma", translation = "Asma"),
                    VocabularyItem(term = "ALLERGY", phonetic = "áleryi", translation = "Alergia"),
                    VocabularyItem(term = "ANAPHYLAXIS", phonetic = "anafiláksis", translation = "Anafilaxia"),
                    VocabularyItem(term = "PREGNANT", phonetic = "prégnant", translation = "Embarazada"),
                    VocabularyItem(term = "MEDICATION", phonetic = "medikéishon", translation = "Medicación"),
                    VocabularyItem(term = "INHALER", phonetic = "injéila", translation = "Inhalador"),
                    VocabularyItem(term = "EPIPEN", phonetic = "épipen", translation = "Autoinyector de adrenalina")
                ),
                phrases = listOf(
                    PhraseItem(english = "CAN YOU HEAR ME?", phonetic = "can yu jía mi", spanish = "¿Me oye?"),
                    PhraseItem(english = "CAN YOU SPEAK?", phonetic = "can yu spik", spanish = "¿Puede hablar?"),
                    PhraseItem(english = "OPEN YOUR EYES.", phonetic = "óupen yor áis", spanish = "Abra los ojos."),
                    PhraseItem(english = "STAY WITH ME.", phonetic = "stéi güiz mi", spanish = "Permanezca conmigo."),
                    PhraseItem(english = "TRY TO STAY CALM.", phonetic = "trai tu stéi cam", spanish = "Intente mantener la calma."),
                    PhraseItem(english = "HELP IS ON THE WAY.", phonetic = "jelp is on de güei", spanish = "La ayuda está de camino."),
                    PhraseItem(english = "AN AMBULANCE IS COMING.", phonetic = "an ámbiulans is cámin", spanish = "Viene una ambulancia."),
                    PhraseItem(english = "CAN YOU BREATHE?", phonetic = "can yu bríz", spanish = "¿Puede respirar?"),
                    PhraseItem(english = "ARE YOU HAVING DIFFICULTY BREATHING?", phonetic = "ar yu jávin dífikolti brízin", spanish = "¿Tiene dificultad para respirar?"),
                    PhraseItem(english = "DO YOU HAVE CHEST PAIN?", phonetic = "du yu jav chest péin", spanish = "¿Le duele el pecho?"),
                    PhraseItem(english = "DO YOU THINK YOU ARE HAVING A HEART ATTACK?", phonetic = "du yu zink yu ar jávin a jart atak", spanish = "¿Cree que está sufriendo un infarto?"),
                    PhraseItem(english = "DO YOU HAVE PAIN ANYWHERE ELSE?", phonetic = "du yu jav péin éniüea els", spanish = "¿Le duele alguna otra parte del cuerpo?"),
                    PhraseItem(english = "WHERE DOES IT HURT?", phonetic = "güea das it jert", spanish = "¿Dónde le duele?"),
                    PhraseItem(english = "CAN YOU MOVE YOUR ARMS?", phonetic = "can yu muv yor arms", spanish = "¿Puede mover los brazos?"),
                    PhraseItem(english = "CAN YOU MOVE YOUR LEGS?", phonetic = "can yu muv yor legs", spanish = "¿Puede mover las piernas?"),
                    PhraseItem(english = "DO YOU FEEL DIZZY?", phonetic = "du yu fil dízi", spanish = "¿Se siente mareado?"),
                    PhraseItem(english = "HAVE YOU FAINTED?", phonetic = "jav yu féintid", spanish = "¿Se ha desmayado?"),
                    PhraseItem(english = "DO YOU HAVE DIABETES?", phonetic = "du yu jav daiabítis", spanish = "¿Tiene diabetes?"),
                    PhraseItem(english = "DO YOU HAVE ASTHMA?", phonetic = "du yu jav ásma", spanish = "¿Tiene asma?"),
                    PhraseItem(english = "DO YOU HAVE EPILEPSY?", phonetic = "du yu jav épilepsi", spanish = "¿Tiene epilepsia?"),
                    PhraseItem(english = "DO YOU HAVE ANY ALLERGIES?", phonetic = "du yu jav éni áleryis", spanish = "¿Tiene alguna alergia?"),
                    PhraseItem(english = "ARE YOU TAKING ANY MEDICATION?", phonetic = "ar yu téikin éni medikéishon", spanish = "¿Toma alguna medicación?"),
                    PhraseItem(english = "DO YOU HAVE YOUR MEDICATION WITH YOU?", phonetic = "du yu jav yor medikéishon güiz yu", spanish = "¿Lleva su medicación?"),
                    PhraseItem(english = "DO YOU HAVE AN INHALER?", phonetic = "du yu jav an injéila", spanish = "¿Lleva un inhalador?"),
                    PhraseItem(english = "DO YOU HAVE AN EPIPEN?", phonetic = "du yu jav an épipen", spanish = "¿Lleva un autoinyector de adrenalina?"),
                    PhraseItem(english = "ARE YOU PREGNANT?", phonetic = "ar yu prégnant", spanish = "¿Está embarazada?"),
                    PhraseItem(english = "PLEASE SIT DOWN.", phonetic = "plís sit daun", spanish = "Siéntese, por favor."),
                    PhraseItem(english = "PLEASE LIE DOWN.", phonetic = "plís lai daun", spanish = "Túmbese, por favor."),
                    PhraseItem(english = "DO NOT MOVE.", phonetic = "du not muv", spanish = "No se mueva."),
                    PhraseItem(english = "KEEP STILL.", phonetic = "kip stil", spanish = "Permanezca inmóvil."),
                    PhraseItem(english = "BREATHE SLOWLY.", phonetic = "bríz slóuli", spanish = "Respire despacio."),
                    PhraseItem(english = "DO NOT EAT OR DRINK ANYTHING.", phonetic = "du not it or drink énizin", spanish = "No coma ni beba nada."),
                    PhraseItem(english = "IS ANYONE WITH YOU?", phonetic = "is éniuan güiz yu", spanish = "¿Viene alguien con usted?"),
                    PhraseItem(english = "CAN YOU TELL ME YOUR NAME?", phonetic = "can yu tel mi yor neim", spanish = "¿Puede decirme su nombre?"),
                    PhraseItem(english = "DO YOU KNOW WHERE YOU ARE?", phonetic = "du yu nóu güea yu ar", spanish = "¿Sabe dónde está?"),
                    PhraseItem(english = "WHAT DAY IS IT TODAY?", phonetic = "guot déi is it tudéi", spanish = "¿Qué día es hoy?"),
                    PhraseItem(english = "THE PARAMEDICS WILL BE HERE SOON.", phonetic = "de paramédiks wil bi jía sun", spanish = "Los sanitarios llegarán enseguida."),
                    PhraseItem(english = "I AM GOING TO STAY WITH YOU.", phonetic = "ai am góuin tu stéi güiz yu", spanish = "Voy a permanecer con usted."),
                    PhraseItem(english = "TELL ME IF YOU FEEL WORSE.", phonetic = "tel mi if yu fil wers", spanish = "Dígame si se encuentra peor."),
                    PhraseItem(english = "YOU ARE DOING WELL.", phonetic = "yu ar dúin güel", spanish = "Lo está haciendo bien."),
                    PhraseItem(english = "WE ARE HERE TO HELP YOU.", phonetic = "güi ar jía tu jelp yu", spanish = "Estamos aquí para ayudarle.")
                )
            )
        )
    )
}
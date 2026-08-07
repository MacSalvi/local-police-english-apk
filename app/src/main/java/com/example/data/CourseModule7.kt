package com.policia.inglesoperativo.data.modules

import com.policia.inglesoperativo.domain.model.Module
import com.policia.inglesoperativo.domain.model.Lesson
import com.policia.inglesoperativo.domain.model.VocabularyItem
import com.policia.inglesoperativo.domain.model.PhraseItem

object Module7 {
    val module = Module(
        id = 7,
        title = "Módulo 7",
        description = "Alcohol y drogas al volante.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Alcohol y drogas al volante",
                vocabulary = listOf(
                    VocabularyItem(term = "ALCOHOL", phonetic = "álkohol", translation = "Alcohol"),
                    VocabularyItem(term = "DRUG", phonetic = "drag", translation = "Droga"),
                    VocabularyItem(term = "DRUGS", phonetic = "drags", translation = "Drogas"),
                    VocabularyItem(term = "ALCOHOL TEST", phonetic = "álkohol test", translation = "Prueba de alcoholemia"),
                    VocabularyItem(term = "BREATH TEST", phonetic = "breth test", translation = "Prueba de aire espirado"),
                    VocabularyItem(term = "BREATHALYSER", phonetic = "brézaláisa", translation = "Etilómetro"),
                    VocabularyItem(term = "DRUG TEST", phonetic = "drag test", translation = "Prueba de drogas"),
                    VocabularyItem(term = "SALIVA TEST", phonetic = "saláiva test", translation = "Prueba de saliva"),
                    VocabularyItem(term = "POSITIVE", phonetic = "pósitiv", translation = "Positivo"),
                    VocabularyItem(term = "NEGATIVE", phonetic = "négativ", translation = "Negativo"),
                    VocabularyItem(term = "LEGAL LIMIT", phonetic = "lígal límit", translation = "Límite legal"),
                    VocabularyItem(term = "UNDER THE INFLUENCE", phonetic = "ánder de ínfluens", translation = "Bajo los efectos"),
                    VocabularyItem(term = "IMPAIRED", phonetic = "impéid", translation = "Con facultades afectadas"),
                    VocabularyItem(term = "MEDICATION", phonetic = "medikéishon", translation = "Medicación"),
                    VocabularyItem(term = "PRESCRIPTION", phonetic = "priscrípchon", translation = "Receta médica"),
                    VocabularyItem(term = "MEDICINE", phonetic = "médisin", translation = "Medicamento"),
                    VocabularyItem(term = "REFUSE", phonetic = "rifiúz", translation = "Negarse"),
                    VocabularyItem(term = "COOPERATE", phonetic = "kouópareit", translation = "Colaborar"),
                    VocabularyItem(term = "EVIDENTIAL TEST", phonetic = "evidénshal test", translation = "Prueba evidencial"),
                    VocabularyItem(term = "BLOOD SAMPLE", phonetic = "blad sámpl", translation = "Muestra de sangre"),
                    VocabularyItem(term = "URINE SAMPLE", phonetic = "yúrin sámpl", translation = "Muestra de orina"),
                    VocabularyItem(term = "HOSPITAL", phonetic = "hóspital", translation = "Hospital"),
                    VocabularyItem(term = "LICENSE", phonetic = "láisens", translation = "Permiso de conducir"),
                    VocabularyItem(term = "DRIVING BAN", phonetic = "dráivin ban", translation = "Prohibición de conducir"),
                    VocabularyItem(term = "OFFENCE", phonetic = "oféns", translation = "Infracción"),
                    VocabularyItem(term = "ARREST", phonetic = "arrést", translation = "Detención"),
                    VocabularyItem(term = "ROAD SAFETY", phonetic = "roud séifti", translation = "Seguridad vial")
                ),
                phrases = listOf(
                    PhraseItem(english = "THIS IS A ROUTINE ALCOHOL CHECK.", phonetic = "dis is a rutín álkohol chek", spanish = "Este es un control rutinario de alcoholemia."),
                    PhraseItem(english = "THIS IS A ROUTINE DRUG CHECK.", phonetic = "dis is a rutín drag chek", spanish = "Este es un control rutinario de drogas."),
                    PhraseItem(english = "PLEASE SWITCH OFF THE ENGINE.", phonetic = "plís suích of di énllin", spanish = "Apague el motor, por favor."),
                    PhraseItem(english = "PLEASE REMAIN INSIDE THE VEHICLE.", phonetic = "plís riméin insáid de víikol", spanish = "Permanezca dentro del vehículo."),
                    PhraseItem(english = "PLEASE STEP OUT OF THE VEHICLE.", phonetic = "plís step aut ov de víikol", spanish = "Salga del vehículo, por favor."),
                    PhraseItem(english = "PLEASE FOLLOW MY INSTRUCTIONS.", phonetic = "plís fólou mai instrákshons", spanish = "Siga mis instrucciones."),
                    PhraseItem(english = "I NEED YOU TO TAKE A BREATH TEST.", phonetic = "ai nid yu tu teik a breth test", spanish = "Necesito que realice una prueba de alcoholemia."),
                    PhraseItem(english = "PLEASE BLOW INTO THE DEVICE.", phonetic = "plís blóu intu de diváis", spanish = "Sople en el aparato."),
                    PhraseItem(english = "KEEP BLOWING UNTIL I TELL YOU TO STOP.", phonetic = "kip blóuin antíl ai tel yu tu stop", spanish = "Continúe soplando hasta que le diga que pare."),
                    PhraseItem(english = "THAT IS NOT ENOUGH. PLEASE TRY AGAIN.", phonetic = "dat is not inóf. plís trai agéin", spanish = "No es suficiente. Inténtelo de nuevo."),
                    PhraseItem(english = "THE TEST WAS SUCCESSFUL.", phonetic = "de test guoz saksésful", spanish = "La prueba se ha realizado correctamente."),
                    PhraseItem(english = "THE RESULT IS POSITIVE.", phonetic = "de risált is pósitiv", spanish = "El resultado es positivo."),
                    PhraseItem(english = "THE RESULT IS NEGATIVE.", phonetic = "de risált is négativ", spanish = "El resultado es negativo."),
                    PhraseItem(english = "YOU ARE OVER THE LEGAL LIMIT.", phonetic = "yu ar óuver de lígal límit", spanish = "Ha superado el límite legal."),
                    PhraseItem(english = "YOU ARE UNDER THE INFLUENCE OF ALCOHOL.", phonetic = "yu ar ánder di ínfluens ov álkohol", spanish = "Está bajo los efectos del alcohol."),
                    PhraseItem(english = "YOU APPEAR TO BE UNDER THE INFLUENCE OF DRUGS.", phonetic = "yu apía tu bi ánder di ínfluens ov drags", spanish = "Parece estar bajo los efectos de las drogas."),
                    PhraseItem(english = "HAVE YOU CONSUMED ANY ALCOHOL TODAY?", phonetic = "jav yu consúmd éni álkohol tudéi", spanish = "¿Ha consumido alcohol hoy?"),
                    PhraseItem(english = "HAVE YOU TAKEN ANY DRUGS TODAY?", phonetic = "jav yu téiken éni drags tudéi", spanish = "¿Ha consumido alguna droga hoy?"),
                    PhraseItem(english = "ARE YOU TAKING ANY MEDICATION?", phonetic = "ar yu téikin éni medikéishon", spanish = "¿Está tomando algún medicamento?"),
                    PhraseItem(english = "DO YOU HAVE A PRESCRIPTION FOR THAT MEDICATION?", phonetic = "du yu jav a priscrípchon for dat medikéishon", spanish = "¿Tiene receta para ese medicamento?"),
                    PhraseItem(english = "I NEED YOU TO TAKE A SALIVA TEST.", phonetic = "ai nid yu tu teik a saláiva test", spanish = "Necesito que realice una prueba de saliva."),
                    PhraseItem(english = "PLEASE DO NOT EAT, DRINK OR SMOKE.", phonetic = "plís du not it, drink or smóuk", spanish = "No coma, beba ni fume."),
                    PhraseItem(english = "PLEASE WAIT A FEW MINUTES.", phonetic = "plís güeit a fiu mínits", spanish = "Espere unos minutos."),
                    PhraseItem(english = "REFUSING THE TEST IS AN OFFENCE.", phonetic = "rifiúsin de test is an oféns", spanish = "Negarse a la prueba constituye una infracción."),
                    PhraseItem(english = "YOU ARE REQUIRED TO TAKE THIS TEST.", phonetic = "yu ar rikwáierd tu teik dis test", spanish = "Está obligado a realizar esta prueba."),
                    PhraseItem(english = "YOU HAVE THE RIGHT TO ASK QUESTIONS.", phonetic = "yu jav de rait tu ask kuéstchons", spanish = "Tiene derecho a hacer preguntas."),
                    PhraseItem(english = "I WILL EXPLAIN THE PROCEDURE.", phonetic = "ai wil ikspléin de prosídya", spanish = "Le explicaré el procedimiento."),
                    PhraseItem(english = "YOU WILL NEED A FURTHER TEST.", phonetic = "yu wil nid a férder test", spanish = "Será necesaria una segunda prueba."),
                    PhraseItem(english = "YOU WILL BE TAKEN TO A HOSPITAL.", phonetic = "yu wil bi téiken tu a hóspital", spanish = "Será trasladado a un hospital."),
                    PhraseItem(english = "A BLOOD SAMPLE MAY BE REQUIRED.", phonetic = "a blad sámpl méi bi rikwáierd", spanish = "Puede ser necesaria una muestra de sangre."),
                    PhraseItem(english = "YOUR DRIVING LICENCE MAY BE SUSPENDED.", phonetic = "yor dráivin láisens méi bi sospéndid", spanish = "Su permiso de conducir puede ser suspendido."),
                    PhraseItem(english = "YOU MUST NOT CONTINUE DRIVING.", phonetic = "yu mast not contíniu dráivin", spanish = "No puede continuar conduciendo."),
                    PhraseItem(english = "PLEASE ARRANGE FOR SOMEONE TO COLLECT THE VEHICLE.", phonetic = "plís arréinch for sámuan tu colékt de víikol", spanish = "Organice que alguien recoja el vehículo."),
                    PhraseItem(english = "YOU ARE NOT FREE TO DRIVE AWAY.", phonetic = "yu ar not fri tu dráiv aguéi", spanish = "No puede marcharse conduciendo."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
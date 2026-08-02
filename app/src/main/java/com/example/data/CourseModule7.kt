package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module7 = Module(
    moduleId = 7,
    moduleName = "Módulo 7: Alcohol y drogas al volante",
    lessons = listOf(
        Lesson(
            lessonId = 701,
            lessonTitle = "Explicación de la prueba y alcoholímetro",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Alcoholímetro",
                    en = "BREATHALYSER",
                    phonetic = "brézalaizer"
                ),
                VocabularyItem(
                    es = "Alcohol",
                    en = "ALCOHOL",
                    phonetic = "álcojol"
                ),
                VocabularyItem(
                    es = "Prueba",
                    en = "TEST",
                    phonetic = "test"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Necesito que se someta a una prueba de alcoholemia.",
                    en = "I NEED YOU TO TAKE A BREATH TEST.",
                    phonetic = "ai nid yu tu téik a brez test"
                ),
                PhraseItem(
                    es = "Es un control rutinario.",
                    en = "THIS IS A ROUTINE CHECK.",
                    phonetic = "dis is a rutín chek"
                ),
                PhraseItem(
                    es = "Sople en el dispositivo, por favor.",
                    en = "BLOW INTO THE DEVICE, PLEASE.",
                    phonetic = "blóu íntu de diváis, plis"
                ),
                PhraseItem(
                    es = "Este es el alcoholímetro.",
                    en = "THIS IS THE BREATHALYSER.",
                    phonetic = "dis is de brézalaizer"
                ),
                PhraseItem(
                    es = "Sople de forma continua hasta que le indique.",
                    en = "BLOW CONTINUOUSLY UNTIL I TELL YOU TO STOP.",
                    phonetic = "blóu kontíniuosli antíl ai tel yu tu stap"
                ),
                PhraseItem(
                    es = "¿Ha consumido alcohol?",
                    en = "HAVE YOU CONSUMED ANY ALCOHOL?",
                    phonetic = "jav yu konsúmd éni álcojol"
                )
            )
        ),
        Lesson(
            lessonId = 702,
            lessonTitle = "Primera, segunda prueba y espera",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Primera prueba",
                    en = "FIRST TEST",
                    phonetic = "först test"
                ),
                VocabularyItem(
                    es = "Segunda prueba",
                    en = "SECOND TEST",
                    phonetic = "sékond test"
                ),
                VocabularyItem(
                    es = "Esperar",
                    en = "WAIT",
                    phonetic = "güéit"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Esta es la primera prueba.",
                    en = "THIS IS THE FIRST TEST.",
                    phonetic = "dis is de först test"
                ),
                PhraseItem(
                    es = "Ahora haremos una segunda prueba.",
                    en = "WE WILL NOW DO A SECOND TEST.",
                    phonetic = "güi güil nau du a sékond test"
                ),
                PhraseItem(
                    es = "Los resultados deben coincidir.",
                    en = "THE RESULTS MUST MATCH.",
                    phonetic = "de risálts mast match"
                ),
                PhraseItem(
                    es = "Debe esperar diez minutos.",
                    en = "YOU MUST WAIT TEN MINUTES.",
                    phonetic = "yu mast güéit ten mínits"
                ),
                PhraseItem(
                    es = "Por favor, no coma ni beba.",
                    en = "PLEASE DO NOT EAT OR DRINK.",
                    phonetic = "plís du not it or drink"
                ),
                PhraseItem(
                    es = "El tiempo de espera es obligatorio.",
                    en = "THE WAITING TIME IS MANDATORY.",
                    phonetic = "de güéiting táim is mándatori"
                )
            )
        ),
        Lesson(
            lessonId = 703,
            lessonTitle = "Resultado y síntomas observados",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Positivo",
                    en = "POSITIVE",
                    phonetic = "pósitiv"
                ),
                VocabularyItem(
                    es = "Negativo",
                    en = "NEGATIVE",
                    phonetic = "négativ"
                ),
                VocabularyItem(
                    es = "Síntoma",
                    en = "SYMPTOM",
                    phonetic = "símptom"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "El resultado es positivo.",
                    en = "THE RESULT IS POSITIVE.",
                    phonetic = "de risált is pósitiv"
                ),
                PhraseItem(
                    es = "El resultado es negativo.",
                    en = "THE RESULT IS NEGATIVE.",
                    phonetic = "de risált is négativ"
                ),
                PhraseItem(
                    es = "Supera el límite legal.",
                    en = "YOU ARE OVER THE LEGAL LIMIT.",
                    phonetic = "yu ar óuver de lígal límit"
                ),
                PhraseItem(
                    es = "Huele a alcohol.",
                    en = "YOU SMELL OF ALCOHOL.",
                    phonetic = "yu smel ov álcojol"
                ),
                PhraseItem(
                    es = "Tiene la voz pastosa.",
                    en = "YOUR SPEECH IS SLURRED.",
                    phonetic = "yor spich is slörd"
                ),
                PhraseItem(
                    es = "Tiene los ojos enrojecidos.",
                    en = "YOUR EYES ARE RED.",
                    phonetic = "yor áis ar red"
                )
            )
        ),
        Lesson(
            lessonId = 704,
            lessonTitle = "Prueba de drogas y muestra de saliva",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Prueba de drogas",
                    en = "DRUG TEST",
                    phonetic = "drag test"
                ),
                VocabularyItem(
                    es = "Saliva",
                    en = "SALIVA",
                    phonetic = "salaiva"
                ),
                VocabularyItem(
                    es = "Muestra",
                    en = "SAMPLE",
                    phonetic = "sámpol"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Necesito que se someta a una prueba de drogas.",
                    en = "I NEED YOU TO TAKE A DRUG TEST.",
                    phonetic = "ai nid yu tu téik a drag test"
                ),
                PhraseItem(
                    es = "¿Ha consumido alguna droga?",
                    en = "HAVE YOU TAKEN ANY DRUGS?",
                    phonetic = "jav yu téiken éni dragz"
                ),
                PhraseItem(
                    es = "Esta prueba también es obligatoria.",
                    en = "THIS TEST IS ALSO MANDATORY.",
                    phonetic = "dis test is ólsou mándatori"
                ),
                PhraseItem(
                    es = "Necesito una muestra de saliva.",
                    en = "I NEED A SALIVA SAMPLE.",
                    phonetic = "ai nid a salaiva sámpol"
                ),
                PhraseItem(
                    es = "Coloque el bastoncillo bajo la lengua.",
                    en = "PLACE THE SWAB UNDER YOUR TONGUE.",
                    phonetic = "pléis de suáb ánder yor tang"
                ),
                PhraseItem(
                    es = "El resultado tardará unos minutos.",
                    en = "THE RESULT WILL TAKE A FEW MINUTES.",
                    phonetic = "de risált güil téik a fiú mínits"
                )
            )
        ),
        Lesson(
            lessonId = 705,
            lessonTitle = "Medicación y prohibición de conducir",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Medicación",
                    en = "MEDICATION",
                    phonetic = "medikéishon"
                ),
                VocabularyItem(
                    es = "Prohibido",
                    en = "PROHIBITED",
                    phonetic = "prójibited"
                ),
                VocabularyItem(
                    es = "Continuar",
                    en = "CONTINUE",
                    phonetic = "kontíniu"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Está tomando alguna medicación?",
                    en = "ARE YOU TAKING ANY MEDICATION?",
                    phonetic = "ar yu téiking éni medikéishon"
                ),
                PhraseItem(
                    es = "Algunos medicamentos afectan a la conducción.",
                    en = "SOME MEDICATION AFFECTS DRIVING.",
                    phonetic = "sam medikéishon aféctz dráiving"
                ),
                PhraseItem(
                    es = "Muéstreme su receta, por favor.",
                    en = "SHOW ME YOUR PRESCRIPTION, PLEASE.",
                    phonetic = "shou mi yor preskrípshon, plis"
                ),
                PhraseItem(
                    es = "No puede continuar conduciendo.",
                    en = "YOU CANNOT CONTINUE DRIVING.",
                    phonetic = "yu kánot kontíniu dráiving"
                ),
                PhraseItem(
                    es = "Su permiso queda suspendido temporalmente.",
                    en = "YOUR LICENCE IS SUSPENDED TEMPORARILY.",
                    phonetic = "yor láisens is saspénded témporerili"
                ),
                PhraseItem(
                    es = "Conducir ahora sería ilegal.",
                    en = "DRIVING NOW WOULD BE ILLEGAL.",
                    phonetic = "dráiving nau güd bi ilígal"
                )
            )
        ),
        Lesson(
            lessonId = 706,
            lessonTitle = "Conductor alternativo e inmovilización",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Conductor alternativo",
                    en = "ALTERNATIVE DRIVER",
                    phonetic = "altérnativ dráiver"
                ),
                VocabularyItem(
                    es = "Inmovilizar",
                    en = "IMMOBILISE",
                    phonetic = "imóbilaiz"
                ),
                VocabularyItem(
                    es = "Retirar",
                    en = "IMPOUND",
                    phonetic = "impáund"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Puede conducir el vehículo otra persona?",
                    en = "CAN SOMEONE ELSE DRIVE THE VEHICLE?",
                    phonetic = "can sámuan els dráiv de víikol"
                ),
                PhraseItem(
                    es = "Llame a alguien para que le recoja.",
                    en = "CALL SOMEONE TO COLLECT YOU.",
                    phonetic = "col sámuan tu koléct yu"
                ),
                PhraseItem(
                    es = "Puede llamar a un taxi.",
                    en = "YOU CAN CALL A TAXI.",
                    phonetic = "yu can col a táxi"
                ),
                PhraseItem(
                    es = "El vehículo será inmovilizado.",
                    en = "THE VEHICLE WILL BE IMMOBILISED.",
                    phonetic = "de víikol güil bi imóbilaizd"
                ),
                PhraseItem(
                    es = "No puede conducir este vehículo hoy.",
                    en = "YOU CANNOT DRIVE THIS VEHICLE TODAY.",
                    phonetic = "yu kánot dráiv dis víikol tudéi"
                ),
                PhraseItem(
                    es = "El vehículo podría ser retirado.",
                    en = "THE VEHICLE MAY BE IMPOUNDED.",
                    phonetic = "de víikol méi bi impáundid"
                )
            )
        )
    )
)
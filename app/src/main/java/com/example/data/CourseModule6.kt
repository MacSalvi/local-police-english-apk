package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module6 = Module(
    moduleId = 6,
    moduleName = "Módulo 6: Infracciones de tráfico",
    lessons = listOf(
        Lesson(
            lessonId = 601,
            lessonTitle = "Velocidad, semáforos, señales y móvil",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Velocidad",
                    en = "SPEED",
                    phonetic = "spid"
                ),
                VocabularyItem(
                    es = "Semáforo",
                    en = "TRAFFIC LIGHT",
                    phonetic = "tráfik láit"
                ),
                VocabularyItem(
                    es = "Señal",
                    en = "SIGN",
                    phonetic = "sáin"
                ),
                VocabularyItem(
                    es = "Móvil",
                    en = "PHONE",
                    phonetic = "fóun"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Iba usted a exceso de velocidad.",
                    en = "YOU WERE SPEEDING.",
                    phonetic = "yu wör spíding"
                ),
                PhraseItem(
                    es = "Esta es una zona con radar.",
                    en = "THIS IS A SPEED CAMERA ZONE.",
                    phonetic = "dis is a spid kámera zóun"
                ),
                PhraseItem(
                    es = "Se saltó un semáforo en rojo.",
                    en = "YOU WENT THROUGH A RED LIGHT.",
                    phonetic = "yu güent zru a red láit"
                ),
                PhraseItem(
                    es = "El semáforo estaba en rojo.",
                    en = "THE LIGHT WAS RED.",
                    phonetic = "de láit guas red"
                ),
                PhraseItem(
                    es = "Ha ignorado una señal de tráfico.",
                    en = "YOU IGNORED A TRAFFIC SIGN.",
                    phonetic = "yu ignórd a tráfik sáin"
                ),
                PhraseItem(
                    es = "Esta es una señal de dirección prohibida.",
                    en = "THIS IS A NO-ENTRY SIGN.",
                    phonetic = "dis is a nóu-éntri sáin"
                ),
                PhraseItem(
                    es = "¿Estaba usando el móvil mientras conducía?",
                    en = "WERE YOU USING YOUR PHONE WHILE DRIVING?",
                    phonetic = "wör yu iúsing yor fóun guáil dráiving"
                ),
                PhraseItem(
                    es = "Usar el móvil al conducir es ilegal.",
                    en = "USING YOUR PHONE WHILE DRIVING IS ILLEGAL.",
                    phonetic = "iúsing yor fóun guáil dráiving is ilígal"
                )
            )
        ),
        Lesson(
            lessonId = 602,
            lessonTitle = "Cinturón, casco y conducción peligrosa",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Cinturón",
                    en = "SEATBELT",
                    phonetic = "sítbelt"
                ),
                VocabularyItem(
                    es = "Casco",
                    en = "HELMET",
                    phonetic = "jélmet"
                ),
                VocabularyItem(
                    es = "Peligroso",
                    en = "DANGEROUS",
                    phonetic = "déinllerous"
                ),
                VocabularyItem(
                    es = "Temerario",
                    en = "RECKLESS",
                    phonetic = "rékles"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "No lleva puesto el cinturón.",
                    en = "YOU'RE NOT WEARING YOUR SEATBELT.",
                    phonetic = "yur not güéring yor sítbelt"
                ),
                PhraseItem(
                    es = "Abróchese el cinturón ahora.",
                    en = "PLEASE FASTEN YOUR SEATBELT NOW.",
                    phonetic = "plís fásen yor sítbelt nau"
                ),
                PhraseItem(
                    es = "Debe llevar casco.",
                    en = "YOU MUST WEAR A HELMET.",
                    phonetic = "yu mast güer a jélmet"
                ),
                PhraseItem(
                    es = "Su casco no está bien abrochado.",
                    en = "YOUR HELMET IS NOT PROPERLY FASTENED.",
                    phonetic = "yor jélmet is not próperli fásend"
                ),
                PhraseItem(
                    es = "Eso ha sido conducción peligrosa.",
                    en = "THAT WAS DANGEROUS DRIVING.",
                    phonetic = "dat guas déinllerous dráiving"
                ),
                PhraseItem(
                    es = "Está conduciendo de forma temeraria.",
                    en = "YOU'RE DRIVING RECKLESSLY.",
                    phonetic = "yur dráiving réklesli"
                )
            )
        ),
        Lesson(
            lessonId = 603,
            lessonTitle = "Sentido contrario, distancia y permiso caducado",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Sentido único",
                    en = "ONE-WAY",
                    phonetic = "güán-güéi"
                ),
                VocabularyItem(
                    es = "Distancia",
                    en = "DISTANCE",
                    phonetic = "dístans"
                ),
                VocabularyItem(
                    es = "Por delante",
                    en = "AHEAD",
                    phonetic = "ajéd"
                ),
                VocabularyItem(
                    es = "Caducado",
                    en = "EXPIRED",
                    phonetic = "ikspáiad"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Circula en sentido contrario.",
                    en = "YOU'RE DRIVING THE WRONG WAY.",
                    phonetic = "yur dráiving de rong güéi"
                ),
                PhraseItem(
                    es = "Esta es una calle de sentido único.",
                    en = "THIS IS A ONE-WAY STREET.",
                    phonetic = "dis is a güán-güéi strit"
                ),
                PhraseItem(
                    es = "Iba demasiado cerca del vehículo de delante.",
                    en = "YOU WERE TOO CLOSE TO THE VEHICLE AHEAD.",
                    phonetic = "yu wör tu clóus tu de víikol ajéd"
                ),
                PhraseItem(
                    es = "Mantenga la distancia de seguridad.",
                    en = "KEEP A SAFE DISTANCE.",
                    phonetic = "kip a séif dístans"
                ),
                PhraseItem(
                    es = "Su permiso ha caducado.",
                    en = "YOUR DRIVING LICENCE HAS EXPIRED.",
                    phonetic = "yor dráiving láisens jas ikspáiad"
                ),
                PhraseItem(
                    es = "No puede conducir con el permiso caducado.",
                    en = "YOU CANNOT DRIVE WITH AN EXPIRED LICENCE.",
                    phonetic = "yu kánot dráiv güiz an ikspáiad láisens"
                )
            )
        ),
        Lesson(
            lessonId = 604,
            lessonTitle = "Seguro, denuncia y notificación",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Multa",
                    en = "FINE",
                    phonetic = "fáin"
                ),
                VocabularyItem(
                    es = "Obligatorio",
                    en = "COMPULSORY",
                    phonetic = "kompálsori"
                ),
                VocabularyItem(
                    es = "Notificación",
                    en = "NOTIFICATION",
                    phonetic = "noutifikéishon"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Debe tener el seguro obligatorio.",
                    en = "YOU MUST HAVE COMPULSORY INSURANCE.",
                    phonetic = "yu mast jav kompálsori inshúrans"
                ),
                PhraseItem(
                    es = "Su vehículo no está asegurado.",
                    en = "YOUR VEHICLE IS NOT INSURED.",
                    phonetic = "yor víikol is not inshúrd"
                ),
                PhraseItem(
                    es = "Le voy a poner una multa.",
                    en = "I'M ISSUING YOU A FINE.",
                    phonetic = "aim íshuing yu a fáin"
                ),
                PhraseItem(
                    es = "Este es el motivo de la denuncia.",
                    en = "THIS IS THE REASON FOR THE FINE.",
                    phonetic = "dis is de ríson for de fáin"
                ),
                PhraseItem(
                    es = "Puede pagar la multa online.",
                    en = "YOU CAN PAY THE FINE ONLINE.",
                    phonetic = "yu can péi de fáin ónláin"
                ),
                PhraseItem(
                    es = "Recibirá una notificación.",
                    en = "YOU WILL RECEIVE A NOTIFICATION.",
                    phonetic = "yu güil risív a noutifikéishon"
                )
            )
        )
    )
)
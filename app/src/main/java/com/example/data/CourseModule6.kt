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
                VocabularyItem(es = "Velocidad", en = "SPEED", phonetic = "spid"),
                VocabularyItem(es = "Semáforo", en = "TRAFFIC LIGHT", phonetic = "tráfic láit"),
                VocabularyItem(es = "Señal", en = "SIGN", phonetic = "sáin"),
                VocabularyItem(es = "Móvil / Teléfono", en = "PHONE", phonetic = "fóun"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Pasado plural / Ustedes", en = "WERE", phonetic = "wör"),
                VocabularyItem(es = "Con exceso de velocidad", en = "SPEEDING", phonetic = "spíding"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Cámara", en = "CAMERA", phonetic = "kámera"),
                VocabularyItem(es = "Zona / Área", en = "ZONE", phonetic = "zóun"),
                VocabularyItem(es = "Ir (pasado)", en = "WENT", phonetic = "güent"),
                VocabularyItem(es = "A través de / Por", en = "THROUGH", phonetic = "zru"),
                VocabularyItem(es = "Rojo", en = "RED", phonetic = "red"),
                VocabularyItem(es = "Luz / Semáforo", en = "LIGHT", phonetic = "láit"),
                VocabularyItem(es = "Pasado singular", en = "WAS", phonetic = "was"),
                VocabularyItem(es = "Ignorado", en = "IGNORED", phonetic = "ignórd"),
                VocabularyItem(es = "Tráfico", en = "TRAFFIC", phonetic = "tráfic"),
                VocabularyItem(es = "Sin entrada / Prohibido", en = "NO-ENTRY", phonetic = "nóu-éntri"),
                VocabularyItem(es = "Usando", en = "USING", phonetic = "iúsing"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Mientras", en = "WHILE", phonetic = "guáil"),
                VocabularyItem(es = "Conduciendo", en = "DRIVING", phonetic = "dráiving"),
                VocabularyItem(es = "Ilegal", en = "ILLEGAL", phonetic = "ilígal")
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
                VocabularyItem(es = "Cinturón de seguridad", en = "SEATBELT", phonetic = "sítbelt"),
                VocabularyItem(es = "Casco", en = "HELMET", phonetic = "jélmet"),
                VocabularyItem(es = "Peligroso", en = "DANGEROUS", phonetic = "déinllerous"),
                VocabularyItem(es = "Temerario", en = "RECKLESS", phonetic = "rékles"),
                VocabularyItem(es = "Eres / Estás (Tú estás)", en = "YOU'RE", phonetic = "yur"),
                VocabularyItem(es = "No", en = "NOT", phonetic = "not"),
                VocabularyItem(es = "Llevar puesto", en = "WEARING", phonetic = "güéring"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Abrochar", en = "FASTEN", phonetic = "fásen"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Debe / Tener que", en = "MUST", phonetic = "mast"),
                VocabularyItem(es = "Llevar / Vestir", en = "WEAR", phonetic = "güer"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Correctamente / Bien", en = "PROPERLY", phonetic = "próperli"),
                VocabularyItem(es = "Abrochado", en = "FASTENED", phonetic = "fásend"),
                VocabularyItem(es = "Eso / Ese", en = "THAT", phonetic = "dat"),
                VocabularyItem(es = "Pasado (ser/estar)", en = "WAS", phonetic = "was"),
                VocabularyItem(es = "Conducción", en = "DRIVING", phonetic = "dráiving"),
                VocabularyItem(es = "Temerariamente", en = "RECKLESSLY", phonetic = "réklesli")
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
                VocabularyItem(es = "Sentido único", en = "ONE-WAY", phonetic = "güán-güéi"),
                VocabularyItem(es = "Distancia", en = "DISTANCE", phonetic = "dístans"),
                VocabularyItem(es = "Por delante / Adelantado", en = "AHEAD", phonetic = "ajéd"),
                VocabularyItem(es = "Caducado", en = "EXPIRED", phonetic = "ikspáiad"),
                VocabularyItem(es = "Eres / Estás", en = "YOU'RE", phonetic = "yur"),
                VocabularyItem(es = "Conduciendo", en = "DRIVING", phonetic = "dráiving"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Equivocado / Malo", en = "WRONG", phonetic = "rong"),
                VocabularyItem(es = "Dirección / Camino", en = "WAY", phonetic = "güéi"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Calle", en = "STREET", phonetic = "strit"),
                VocabularyItem(es = "Pasado plural", en = "WERE", phonetic = "wör"),
                VocabularyItem(es = "Demasiado", en = "TOO", phonetic = "tu"),
                VocabularyItem(es = "Cerca", en = "CLOSE", phonetic = "clóus"),
                VocabularyItem(es = "A / Hacia", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Mantener", en = "KEEP", phonetic = "kip"),
                VocabularyItem(es = "Seguro / A salvo", en = "SAFE", phonetic = "séif"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Licencia / Permiso", en = "LICENCE", phonetic = "láisens"),
                VocabularyItem(es = "Tiene / Haber (auxiliar)", en = "HAS", phonetic = "jas"),
                VocabularyItem(es = "No poder", en = "CANNOT", phonetic = "kánot"),
                VocabularyItem(es = "Conducir", en = "DRIVE", phonetic = "dráiv"),
                VocabularyItem(es = "Con", en = "WITH", phonetic = "güiz"),
                VocabularyItem(es = "Un / Una (ante vocal)", en = "AN", phonetic = "an")
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
                VocabularyItem(es = "Multa", en = "FINE", phonetic = "fáin"),
                VocabularyItem(es = "Obligatorio", en = "COMPULSORY", phonetic = "kompálsori"),
                VocabularyItem(es = "Notificación", en = "NOTIFICATION", phonetic = "noutifikéishon"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Debe / Tener que", en = "MUST", phonetic = "mast"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Seguro", en = "INSURANCE", phonetic = "inshúrans"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "No", en = "NOT", phonetic = "not"),
                VocabularyItem(es = "Asegurado", en = "INSURED", phonetic = "inshúrd"),
                VocabularyItem(es = "Yo soy / Estoy (I'm)", en = "I'M", phonetic = "aim"),
                VocabularyItem(es = "Emitiendo / Imponiendo", en = "ISSUING", phonetic = "íshuing"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Razón / Motivo", en = "REASON", phonetic = "ríson"),
                VocabularyItem(es = "Para / Por", en = "FOR", phonetic = "for"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Pagar", en = "PAY", phonetic = "péi"),
                VocabularyItem(es = "Online / En línea", en = "ONLINE", phonetic = "ónláin"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Recibir", en = "RECEIVE", phonetic = "risív")
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
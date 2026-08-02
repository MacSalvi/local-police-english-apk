package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module16 = Module(
    moduleId = 16,
    moduleName = "Módulo 16: Violencia doméstica y personas vulnerables",
    lessons = listOf(
        Lesson(
            lessonId = 1601,
            lessonTitle = "Separar a las partes y comprobar lesiones",
            vocabulary = listOf(
                VocabularyItem(es = "Separar", en = "SEPARATE", phonetic = "séparet"),
                VocabularyItem(es = "Lesión", en = "INJURY", phonetic = "ínyuri"),
                VocabularyItem(es = "Seguridad", en = "SAFETY", phonetic = "séifti"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Hablar", en = "SPEAK", phonetic = "spik"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Por separado", en = "SEPARATELY", phonetic = "séparetli"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Herido / Lesionado", en = "INJURED", phonetic = "ínyurd"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Alguien", en = "ANYONE", phonetic = "éniuan"),
                VocabularyItem(es = "Otro / Más", en = "ELSE", phonetic = "els"),
                VocabularyItem(es = "Herido / Dolorido", en = "Hurt", phonetic = "hört"),
                VocabularyItem(es = "Seguro / A salvo", en = "SAFE", phonetic = "séif"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Yo soy / Estoy (I'm)", en = "I'M", phonetic = "aim"),
                VocabularyItem(es = "Yendo / Ir", en = "GOING", phonetic = "góing"),
                VocabularyItem(es = "Preguntar", en = "ASK", phonetic = "ask"),
                VocabularyItem(es = "Unos / Algunas", en = "SOME", phonetic = "sam"),
                VocabularyItem(es = "Preguntas", en = "QUESTIONS", phonetic = "kuéschons"),
                VocabularyItem(es = "Solo / A solas", en = "ALONE", phonetic = "alóun"),
                VocabularyItem(es = "Hacer (auxiliar negativo)", en = "DO NOT", phonetic = "du not"),
                VocabularyItem(es = "Preocuparse", en = "WORRY", phonetic = "güóri"),
                VocabularyItem(es = "Nosotros", en = "WE", phonetic = "güi"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Ayudar", en = "HELP", phonetic = "jelp")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Necesito hablar con usted por separado.",
                    en = "I NEED TO SPEAK TO YOU SEPARATELY.",
                    phonetic = "ai nid tu spik tu yu séparetli"
                ),
                PhraseItem(
                    es = "¿Está herida/o?",
                    en = "ARE YOU INJURED?",
                    phonetic = "ar yu ínyurd"
                ),
                PhraseItem(
                    es = "¿Hay alguien más herido?",
                    en = "IS ANYONE ELSE HURT?",
                    phonetic = "is éniuan els hört"
                ),
                PhraseItem(
                    es = "Ahora está a salvo.",
                    en = "YOU ARE SAFE NOW.",
                    phonetic = "yu ar séif nau"
                ),
                PhraseItem(
                    es = "Voy a hacerle unas preguntas a solas.",
                    en = "I'M GOING TO ASK YOU SOME QUESTIONS ALONE.",
                    phonetic = "aim góing tu ask yu sam kuéschons alóun"
                ),
                PhraseItem(
                    es = "No se preocupe, estamos aquí para ayudar.",
                    en = "DO NOT WORRY, WE ARE HERE TO HELP.",
                    phonetic = "du not güóri, güi ar jía tu jelp"
                )
            )
        ),
        Lesson(
            lessonId = 1602,
            lessonTitle = "Riesgo inmediato y menores presentes",
            vocabulary = listOf(
                VocabularyItem(es = "Riesgo", en = "RISK", phonetic = "risk"),
                VocabularyItem(es = "Menor", en = "MINOR", phonetic = "máinor"),
                VocabularyItem(es = "Peligro", en = "DANGER", phonetic = "déinllör"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Inmediato", en = "IMMEDIATE", phonetic = "imídiet"),
                VocabularyItem(es = "Hay (plural)", en = "ARE THERE", phonetic = "ar der"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Niños / Hijos", en = "CHILDREN", phonetic = "chíldren"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Casa", en = "HOUSE", phonetic = "jáus"),
                VocabularyItem(es = "Seguro / A salvo", en = "SAFE", phonetic = "séif"),
                VocabularyItem(es = "Haber (auxiliar)", en = "HAS", phonetic = "jas"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Ocurrido / Pasado", en = "HAPPENED", phonetic = "jápend"),
                VocabularyItem(es = "Antes", en = "BEFORE", phonetic = "bifór"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Sentir", en = "FEEL", phonetic = "fil"),
                VocabularyItem(es = "Quedándose / Permaneciendo", en = "STAYING", phonetic = "stéiing"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Esta noche", en = "TONIGHT", phonetic = "tunáit"),
                VocabularyItem(es = "Nosotros", en = "WE", phonetic = "güi"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Proteger", en = "PROTECT", phonetic = "protékt"),
                VocabularyItem(es = "Y", en = "AND", phonetic = "and"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Está en peligro inmediato?",
                    en = "ARE YOU IN IMMEDIATE DANGER?",
                    phonetic = "ar yu in imídiet déinllör"
                ),
                PhraseItem(
                    es = "¿Hay niños en la casa?",
                    en = "ARE THERE ANY CHILDREN IN THE HOUSE?",
                    phonetic = "ar der éni chíldren in de jáus"
                ),
                PhraseItem(
                    es = "¿Están los niños a salvo?",
                    en = "ARE THE CHILDREN SAFE?",
                    phonetic = "ar de chíldren séif"
                ),
                PhraseItem(
                    es = "¿Ha ocurrido esto antes?",
                    en = "HAS THIS HAPPENED BEFORE?",
                    phonetic = "jas dis jápend bifór"
                ),
                PhraseItem(
                    es = "¿Se siente segura quedándose aquí esta noche?",
                    en = "DO YOU FEEL SAFE STAYING HERE TONIGHT?",
                    phonetic = "du yu fil séif stéiing jía tunáit"
                ),
                PhraseItem(
                    es = "Le protegeremos a usted y a sus hijos.",
                    en = "WE WILL PROTECT YOU AND YOUR CHILDREN.",
                    phonetic = "güi güil protékt yu and yor chíldren"
                )
            )
        ),
        Lesson(
            lessonId = 1603,
            lessonTitle = "Lugar seguro y atención médica",
            vocabulary = listOf(
                VocabularyItem(es = "Lugar seguro", en = "SAFE PLACE", phonetic = "séif pléis"),
                VocabularyItem(es = "Atención médica", en = "MEDICAL CARE", phonetic = "médikal ker"),
                VocabularyItem(es = "Protección", en = "PROTECTION", phonetic = "protékshon"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Nosotros", en = "WE", phonetic = "güi"),
                VocabularyItem(es = "Llevar / Tomar", en = "TAKE", phonetic = "téik"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "A (dirección)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Seguro", en = "SAFE", phonetic = "séif"),
                VocabularyItem(es = "Lugar", en = "PLACE", phonetic = "pléis"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "Médico", en = "MEDICAL", phonetic = "médikal"),
                VocabularyItem(es = "Cuidado / Atención", en = "CARE", phonetic = "ker"),
                VocabularyItem(es = "Organizar / Tramitar", en = "ARRANGE", phonetic = "aréinll"),
                VocabularyItem(es = "Orden", en = "ORDER", phonetic = "órder"),
                VocabularyItem(es = "No", en = "DON'T", phonetic = "dont"),
                VocabularyItem(es = "Tener que", en = "HAVE TO", phonetic = "jav tu"),
                VocabularyItem(es = "Ir", en = "GO", phonetic = "gou"),
                VocabularyItem(es = "Atrás / De vuelta", en = "BACK", phonetic = "bak"),
                VocabularyItem(es = "Si", en = "IF", phonetic = "if"),
                VocabularyItem(es = "Querer", en = "WANT", phonetic = "güant"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Quedarse / Permanecer", en = "STAY", phonetic = "stéi"),
                VocabularyItem(es = "Con", en = "WITH", phonetic = "güiz"),
                VocabularyItem(es = "Condicional (auxiliar)", en = "WOULD", phonetic = "güd"),
                VocabularyItem(es = "Gustar", en = "LIKE", phonetic = "láik"),
                VocabularyItem(es = "Recoger", en = "COLLECT", phonetic = "koléct"),
                VocabularyItem(es = "Algunos / Unas", en = "SOME", phonetic = "sam"),
                VocabularyItem(es = "Pertenencias", en = "BELONGINGS", phonetic = "bilóngings")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Podemos llevarla a un lugar seguro?",
                    en = "CAN WE TAKE YOU TO A SAFE PLACE?",
                    phonetic = "can güi téik yu tu a séif pléis"
                ),
                PhraseItem(
                    es = "¿Necesita atención médica?",
                    en = "DO YOU NEED MEDICAL CARE?",
                    phonetic = "du yu nid médikal ker"
                ),
                PhraseItem(
                    es = "Podemos tramitar una orden de protección.",
                    en = "WE CAN ARRANGE A PROTECTION ORDER.",
                    phonetic = "güi can aréinll a protékshon órder"
                ),
                PhraseItem(
                    es = "No tiene que volver si no quiere.",
                    en = "YOU DON'T HAVE TO GO BACK IF YOU DON'T WANT TO.",
                    phonetic = "yu dont jav tu gou bak if yu dont güant tu"
                ),
                PhraseItem(
                    es = "Nos quedaremos con usted.",
                    en = "WE WILL STAY WITH YOU.",
                    phonetic = "güi güil stéi güiz yu"
                ),
                PhraseItem(
                    es = "¿Le gustaría recoger algunas pertenencias?",
                    en = "WOULD YOU LIKE TO COLLECT SOME BELONGINGS?",
                    phonetic = "güd yu láik tu koléct sam bilóngings"
                )
            )
        ),
        Lesson(
            lessonId = 1604,
            lessonTitle = "Persona mayor y con discapacidad",
            vocabulary = listOf(
                VocabularyItem(es = "Persona mayor", en = "ELDERLY PERSON", phonetic = "éldörli pörson"),
                VocabularyItem(es = "Discapacidad", en = "DISABILITY", phonetic = "disabíliti"),
                VocabularyItem(es = "Cuidador", en = "CARER", phonetic = "kérer"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Viviendo", en = "LIVING", phonetic = "lívin"),
                VocabularyItem(es = "Solo / Sola", en = "ALONE", phonetic = "alóun"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Alguien", en = "SOMEONE", phonetic = "sámuan"),
                VocabularyItem(es = "Tomando / Llevando", en = "TAKING", phonetic = "téiking"),
                VocabularyItem(es = "Cuidado", en = "CARE", phonetic = "ker"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Adecuadamente / Correctamente", en = "PROPERLY", phonetic = "próperli"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Dificultad", en = "DIFFICULTY", phonetic = "dífikölti"),
                VocabularyItem(es = "Moverse / Moviéndose", en = "MOVING", phonetic = "múving"),
                VocabularyItem(es = "Nosotros", en = "WE", phonetic = "güi"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Contactar", en = "CONTACT", phonetic = "kóntakt"),
                VocabularyItem(es = "Social", en = "SOCIAL", phonetic = "sóushal"),
                VocabularyItem(es = "Servicios", en = "SERVICES", phonetic = "sörvises"),
                VocabularyItem(es = "Hay (plural)", en = "IS THERE", phonetic = "is der"),
                VocabularyItem(es = "Familia", en = "FAMILY", phonetic = "fámili"),
                VocabularyItem(es = "Miembro", en = "MEMBER", phonetic = "mémber"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Llamar", en = "CALL", phonetic = "col")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Vive usted sola/o?",
                    en = "ARE YOU LIVING ALONE?",
                    phonetic = "ar yu lívin alóun"
                ),
                PhraseItem(
                    es = "¿Tiene cuidador?",
                    en = "DO YOU HAVE A CARER?",
                    phonetic = "du yu jav a kérer"
                ),
                PhraseItem(
                    es = "¿Le están cuidando adecuadamente?",
                    en = "IS SOMEONE TAKING CARE OF YOU PROPERLY?",
                    phonetic = "is sámuan téiking ker ov yu próperli"
                ),
                PhraseItem(
                    es = "¿Tiene dificultad para moverse?",
                    en = "DO YOU HAVE ANY DIFFICULTY MOVING?",
                    phonetic = "du yu jav éni dífikölti múving"
                ),
                PhraseItem(
                    es = "Contactaremos con servicios sociales.",
                    en = "WE WILL CONTACT SOCIAL SERVICES.",
                    phonetic = "güi güil kóntakt sóushal sörvises"
                ),
                PhraseItem(
                    es = "¿Hay algún familiar al que podamos llamar?",
                    en = "IS THERE A FAMILY MEMBER WE CAN CALL?",
                    phonetic = "is der a fámili mémber güi can col"
                )
            )
        ),
        Lesson(
            lessonId = 1605,
            lessonTitle = "Salud mental y comunicación calmada",
            vocabulary = listOf(
                VocabularyItem(es = "Salud mental", en = "MENTAL HEALTH", phonetic = "méntal jelz"),
                VocabularyItem(es = "Calma", en = "CALM", phonetic = "carm"),
                VocabularyItem(es = "Ayuda", en = "HELP", phonetic = "jelp"),
                VocabularyItem(es = "Yo soy / Estoy (I'm)", en = "I'M", phonetic = "aim"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "No", en = "NOT", phonetic = "not"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Problemas / Apuros", en = "TROUBLE", phonetic = "trábol"),
                VocabularyItem(es = "Nosotros", en = "WE", phonetic = "güi"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Hablar / Charlar", en = "TALK", phonetic = "tok"),
                VocabularyItem(es = "Despacio / Lentamente", en = "SLOWLY", phonetic = "slóuli"),
                VocabularyItem(es = "Y", en = "AND", phonetic = "and"),
                VocabularyItem(es = "Con calma / Tranquilamente", en = "CALMLY", phonetic = "cámli"),
                VocabularyItem(es = "Hay (plural)", en = "IS THERE", phonetic = "is der"),
                VocabularyItem(es = "Alguien", en = "SOMEONE", phonetic = "sámuan"),
                VocabularyItem(es = "Que / Quien", en = "WHO", phonetic = "ju"),
                VocabularyItem(es = "Apoya", en = "SUPPORTS", phonetic = "sapórts"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Contactar", en = "CONTACT", phonetic = "kóntakt"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Mental", en = "MENTAL", phonetic = "méntal"),
                VocabularyItem(es = "Salud", en = "HEALTH", phonetic = "jelz"),
                VocabularyItem(es = "Servicio", en = "SERVICE", phonetic = "sörvis"),
                VocabularyItem(es = "Tomar / Tomarse", en = "TAKE", phonetic = "téik"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Tiempo", en = "TIME", phonetic = "táim"),
                VocabularyItem(es = "Hay (existencial)", en = "THERE'S", phonetic = "ders"),
                VocabularyItem(es = "Prisa", en = "RUSH", phonetic = "rash")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Estoy aquí para ayudarle.",
                    en = "I'M HERE TO HELP YOU.",
                    phonetic = "aim jía tu jelp yu"
                ),
                PhraseItem(
                    es = "No está usted en problemas.",
                    en = "YOU ARE NOT IN TROUBLE.",
                    phonetic = "yu ar not in trábol"
                ),
                PhraseItem(
                    es = "Hablaremos despacio y con calma.",
                    en = "WE WILL TALK SLOWLY AND CALMLY.",
                    phonetic = "güi güil tok slóuli and cámli"
                ),
                PhraseItem(
                    es = "¿Hay alguien que le apoye?",
                    en = "IS THERE SOMEONE WHO SUPPORTS YOU?",
                    phonetic = "is der sámuan ju sapórts yu"
                ),
                PhraseItem(
                    es = "Podemos contactar con un servicio de salud mental.",
                    en = "WE CAN CONTACT A MENTAL HEALTH SERVICE.",
                    phonetic = "güi can kóntakt a méntal jelz sörvis"
                ),
                PhraseItem(
                    es = "Tómese su tiempo, no hay prisa.",
                    en = "TAKE YOUR TIME, THERE'S NO RUSH.",
                    phonetic = "téik yor táim, ders no rash"
                )
            )
        )
    )
)
package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module20 = Module(
    moduleId = 20,
    moduleName = "Módulo 20: Menores y personas desaparecidas",
    lessons = listOf(
        Lesson(
            lessonId = 2001,
            lessonTitle = "Datos personales y último lugar visto",
            vocabulary = listOf(
                VocabularyItem(es = "Menor", en = "MINOR", phonetic = "máinor"),
                VocabularyItem(es = "Último lugar visto", en = "LAST SEEN", phonetic = "last sin"),
                VocabularyItem(es = "Descripción", en = "DESCRIPTION", phonetic = "diskrípshon"),
                VocabularyItem(es = "Qué es / Cuál es", en = "WHAT", phonetic = "guat"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Del menor (posesivo)", en = "CHILD'S", phonetic = "cháilds"),
                VocabularyItem(es = "Nombre", en = "NAME", phonetic = "néim"),
                VocabularyItem(es = "Cuánto", en = "HOW", phonetic = "jau"),
                VocabularyItem(es = "Viejo / Edad", en = "OLD", phonetic = "old"),
                VocabularyItem(es = "Niño / Menor", en = "CHILD", phonetic = "cháild"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Ser / Estar (pasado plural)", en = "WERE", phonetic = "wör"),
                VocabularyItem(es = "Ellos / Les", en = "THEY", phonetic = "déi"),
                VocabularyItem(es = "Último", en = "LAST", phonetic = "last"),
                VocabularyItem(es = "Visto", en = "SEEN", phonetic = "sin"),
                VocabularyItem(es = "Hora / Tiempo", en = "TIME", phonetic = "táim"),
                VocabularyItem(es = "Pasado (auxiliar)", en = "DID", phonetic = "did"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Notar", en = "NOTICE", phonetic = "nóutis"),
                VocabularyItem(es = "Desaparecido", en = "MISSING", phonetic = "mísing"),
                VocabularyItem(es = "Pasado singular (ser/estar)", en = "WAS", phonetic = "guas"),
                VocabularyItem(es = "Vistiendo / Llevando puesto", en = "WEARING", phonetic = "güéring"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Reciente", en = "RECENT", phonetic = "rísent"),
                VocabularyItem(es = "Fotografía", en = "PHOTOGRAPH", phonetic = "fóutograf")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Cuál es el nombre del menor?",
                    en = "WHAT IS THE CHILD'S NAME?",
                    phonetic = "guat is de cháilds néim"
                ),
                PhraseItem(
                    es = "¿Qué edad tiene el menor?",
                    en = "HOW OLD IS THE CHILD?",
                    phonetic = "jau old is de cháild"
                ),
                PhraseItem(
                    es = "¿Dónde se le vio por última vez?",
                    en = "WHERE WERE THEY LAST SEEN?",
                    phonetic = "güer wör déi last sin"
                ),
                PhraseItem(
                    es = "¿A qué hora notó que faltaba?",
                    en = "WHAT TIME DID YOU NOTICE THEY WERE MISSING?",
                    phonetic = "guat táim did yu nóutis déi wör mísing"
                ),
                PhraseItem(
                    es = "¿Qué llevaba puesto el menor?",
                    en = "WHAT WAS THE CHILD WEARING?",
                    phonetic = "guat guas de cháild güéring"
                ),
                PhraseItem(
                    es = "¿Tiene una fotografía reciente?",
                    en = "DO YOU HAVE A RECENT PHOTOGRAPH?",
                    phonetic = "du yu jav a rísent fóutograf"
                )
            )
        ),
        Lesson(
            lessonId = 2002,
            lessonTitle = "Familiares, hotel y lugares frecuentes",
            vocabulary = listOf(
                VocabularyItem(es = "Familiar", en = "RELATIVE", phonetic = "rélativ"),
                VocabularyItem(es = "Alojamiento", en = "ACCOMMODATION", phonetic = "akomodéishon"),
                VocabularyItem(es = "Lugar frecuente", en = "REGULAR PLACE", phonetic = "régiular pléis"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Alojándose / Quedándose", en = "STAYING", phonetic = "stéiing"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Único", en = "ONLY", phonetic = "óunli"),
                VocabularyItem(es = "Niño / Hijo", en = "CHILD", phonetic = "cháild"),
                VocabularyItem(es = "Con", en = "WITH", phonetic = "güiz"),
                VocabularyItem(es = "Hacer (auxiliar tercera persona)", en = "DOES", phonetic = "das"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Teléfono / Móvil", en = "PHONE", phonetic = "fóun"),
                VocabularyItem(es = "Haber (existencial - hay)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Lugares", en = "PLACES", phonetic = "pléises"),
                VocabularyItem(es = "Ellos", en = "THEY", phonetic = "déi"),
                VocabularyItem(es = "Gustar", en = "LIKE", phonetic = "láik"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Visitar", en = "VISIT", phonetic = "vísit"),
                VocabularyItem(es = "Familia", en = "FAMILY", phonetic = "fámili"),
                VocabularyItem(es = "Miembro", en = "MEMBER", phonetic = "mémber"),
                VocabularyItem(es = "Cerca / Próximo", en = "NEARBY", phonetic = "nírbai"),
                VocabularyItem(es = "Nosotros", en = "WE", phonetic = "güi"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Contactar", en = "CONTACT", phonetic = "kóntakt"),
                VocabularyItem(es = "Inmediatamente", en = "IMMEDIATELY", phonetic = "imídietli")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Dónde se aloja?",
                    en = "WHERE ARE YOU STAYING?",
                    phonetic = "güer ar yu stéiing"
                ),
                PhraseItem(
                    es = "¿Es este su único hijo con usted?",
                    en = "IS THIS YOUR ONLY CHILD WITH YOU?",
                    phonetic = "is dis yor óunli cháild güiz yu"
                ),
                PhraseItem(
                    es = "¿Tiene móvil el menor?",
                    en = "DOES THE CHILD HAVE A PHONE?",
                    phonetic = "das de cháild jav a fóun"
                ),
                PhraseItem(
                    es = "¿Hay lugares que suele frecuentar?",
                    en = "ARE THERE ANY PLACES THEY LIKE TO VISIT?",
                    phonetic = "ar der éni pléises déi láik tu vísit"
                ),
                PhraseItem(
                    es = "¿Hay algún familiar cerca?",
                    en = "IS THERE A FAMILY MEMBER NEARBY?",
                    phonetic = "is der a fámili mémber nírbai"
                ),
                PhraseItem(
                    es = "Le contactaremos de inmediato.",
                    en = "WE WILL CONTACT YOU IMMEDIATELY.",
                    phonetic = "güi güil kóntakt yu imídietli"
                )
            )
        ),
        Lesson(
            lessonId = 2003,
            lessonTitle = "Menor encontrado y entrega segura",
            vocabulary = listOf(
                VocabularyItem(es = "Encontrado", en = "FOUND", phonetic = "fáund"),
                VocabularyItem(es = "Responsable", en = "GUARDIAN", phonetic = "gárdian"),
                VocabularyItem(es = "Entrega", en = "HANDOVER", phonetic = "jándóuver"),
                VocabularyItem(es = "Nosotros", en = "WE", phonetic = "güi"),
                VocabularyItem(es = "Haber (auxiliar)", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Niño / Hijo", en = "CHILD", phonetic = "cháild"),
                VocabularyItem(es = "Ellos / Las / Los", en = "THEY", phonetic = "déi"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Seguro / A salvo", en = "SAFE", phonetic = "séif"),
                VocabularyItem(es = "Y", en = "AND", phonetic = "and"),
                VocabularyItem(es = "Bien", en = "WELL", phonetic = "güel"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Confirmar", en = "CONFIRM", phonetic = "konfírm"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Padre / Madre", en = "PARENT", phonetic = "pérent"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Mostrar", en = "SHOW", phonetic = "shou"),
                VocabularyItem(es = "Me", en = "ME", phonetic = "mi"),
                VocabularyItem(es = "Identificación", en = "IDENTIFICATION", phonetic = "aidentifikéishon"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Tomar nota / Registrar", en = "NOTE", phonetic = "nóut"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Firmar", en = "SIGN", phonetic = "sáin"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Hemos encontrado a su hijo.",
                    en = "WE HAVE FOUND YOUR CHILD.",
                    phonetic = "güi jav fáund yor cháild"
                ),
                PhraseItem(
                    es = "Está a salvo y bien.",
                    en = "THEY ARE SAFE AND WELL.",
                    phonetic = "déi ar séif and güel"
                ),
                PhraseItem(
                    es = "¿Puede confirmar que es el padre/tutor?",
                    en = "CAN YOU CONFIRM YOU ARE THE PARENT/GUARDIAN?",
                    phonetic = "can yu konfírm yu ar de pérent/gárdian"
                ),
                PhraseItem(
                    es = "Muéstreme su identificación, por favor.",
                    en = "PLEASE SHOW ME YOUR IDENTIFICATION.",
                    phonetic = "plís shou mi yor aidentifikéishon"
                ),
                PhraseItem(
                    es = "Necesitamos registrar esta entrega.",
                    en = "WE NEED TO NOTE THIS HANDOVER.",
                    phonetic = "güi nid tu nóut dis jándóuver"
                ),
                PhraseItem(
                    es = "Firme aquí para confirmar.",
                    en = "SIGN HERE TO CONFIRM.",
                    phonetic = "sáin jía tu konfírm"
                )
            )
        )
    )
)
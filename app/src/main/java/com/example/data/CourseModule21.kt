package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module21 {
    val module = Module(
        id = 21,
        title = "Módulo 21",
        description = "Atención policial al turista y asistencia social.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Atención policial al turista y asistencia social",
                vocabulary = listOf(
                    VocabularyItem(term = "TOURIST", phonetic = "túrist", translation = "Turista"),
                    VocabularyItem(term = "VISITOR", phonetic = "vízita", translation = "Visitante"),
                    VocabularyItem(term = "HOTEL", phonetic = "joutél", translation = "Hotel"),
                    VocabularyItem(term = "HOLIDAY APARTMENT", phonetic = "hólidei apátment", translation = "Apartamento turístico"),
                    VocabularyItem(term = "PASSPORT", phonetic = "pásport", translation = "Pasaporte"),
                    VocabularyItem(term = "IDENTIFICATION", phonetic = "aidéntifikeishon", translation = "Documento de identidad"),
                    VocabularyItem(term = "POLICE STATION", phonetic = "polís stéishon", translation = "Comisaría"),
                    VocabularyItem(term = "LOCAL POLICE", phonetic = "lóukal polís", translation = "Policía Local"),
                    VocabularyItem(term = "NATIONAL POLICE", phonetic = "náshonal polís", translation = "Policía Nacional"),
                    VocabularyItem(term = "REPORT", phonetic = "ripót", translation = "Denuncia"),
                    VocabularyItem(term = "COMPLAINT", phonetic = "kompléint", translation = "Reclamación"),
                    VocabularyItem(term = "THEFT", phonetic = "zeft", translation = "Hurto"),
                    VocabularyItem(term = "ROBBERY", phonetic = "róberi", translation = "Robo"),
                    VocabularyItem(term = "LOST PROPERTY", phonetic = "lost próperti", translation = "Objetos perdidos"),
                    VocabularyItem(term = "STOLEN PROPERTY", phonetic = "stóulen próperti", translation = "Objetos robados"),
                    VocabularyItem(term = "VEHICLE", phonetic = "víikol", translation = "Vehículo"),
                    VocabularyItem(term = "ROAD ACCIDENT", phonetic = "roud áksident", translation = "Accidente de tráfico"),
                    VocabularyItem(term = "EMERGENCY", phonetic = "imérllensi", translation = "Emergencia"),
                    VocabularyItem(term = "EMBASSY", phonetic = "émbasi", translation = "Embajada"),
                    VocabularyItem(term = "CONSULATE", phonetic = "kónsiulet", translation = "Consulado"),
                    VocabularyItem(term = "INTERPRETER", phonetic = "intérpreta", translation = "Intérprete"),
                    VocabularyItem(term = "ADDRESS", phonetic = "adrés", translation = "Dirección"),
                    VocabularyItem(term = "LOCATION", phonetic = "loukéishon", translation = "Ubicación"),
                    VocabularyItem(term = "MAP", phonetic = "map", translation = "Mapa"),
                    VocabularyItem(term = "HOMELESS PERSON", phonetic = "jóumles pérson", translation = "Persona sin hogar"),
                    VocabularyItem(term = "SHELTER", phonetic = "shélta", translation = "Albergue"),
                    VocabularyItem(term = "SOCIAL SERVICES", phonetic = "sóushal sérvisis", translation = "Servicios Sociales"),
                    VocabularyItem(term = "SOCIAL WORKER", phonetic = "sóushal guórka", translation = "Trabajador social"),
                    VocabularyItem(term = "EMERGENCY ACCOMMODATION", phonetic = "imérllensi akómodeishon", translation = "Alojamiento de emergencia"),
                    VocabularyItem(term = "FOOD", phonetic = "fud", translation = "Comida"),
                    VocabularyItem(term = "WATER", phonetic = "uóta", translation = "Agua"),
                    VocabularyItem(term = "BLANKET", phonetic = "blánkit", translation = "Manta")
                ),
                phrases = listOf(
                    PhraseItem(english = "HOW CAN I HELP YOU?", phonetic = "jáu can ai jelp yu", spanish = "¿En qué puedo ayudarle?"),
                    PhraseItem(english = "PLEASE TELL ME WHAT HAPPENED.", phonetic = "plís tel mi guot jápend", spanish = "Cuénteme qué ha ocurrido."),
                    PhraseItem(english = "WHAT DO YOU NEED?", phonetic = "guot du yu nid", spanish = "¿Qué necesita?"),
                    PhraseItem(english = "ARE YOU A TOURIST?", phonetic = "ar yu a túrist", spanish = "¿Es usted turista?"),
                    PhraseItem(english = "CAN I SEE YOUR PASSPORT, PLEASE?", phonetic = "can ai si yor pásport plís", spanish = "¿Puedo ver su pasaporte, por favor?"),
                    PhraseItem(english = "WHERE ARE YOU STAYING?", phonetic = "güea ar yu stéiin", spanish = "¿Dónde se aloja?"),
                    PhraseItem(english = "WHAT IS THE NAME OF YOUR HOTEL?", phonetic = "guot is de neim ov yor joutél", spanish = "¿Cómo se llama su hotel?"),
                    PhraseItem(english = "ARE YOU LOST?", phonetic = "ar yu lost", spanish = "¿Se ha perdido?"),
                    PhraseItem(english = "I WILL SHOW YOU THE WAY.", phonetic = "ai wil shóu yu de güei", spanish = "Le indicaré el camino."),
                    PhraseItem(english = "YOU NEED TO GO TO THE NATIONAL POLICE STATION.", phonetic = "yu nid tu góu tu de náshonal polís stéishon", spanish = "Debe acudir a la Policía Nacional."),
                    PhraseItem(english = "YOU CAN REPORT THE THEFT THERE.", phonetic = "yu can ripót de zeft dea", spanish = "Allí puede denunciar el hurto."),
                    PhraseItem(english = "YOU CAN REPORT THE ROBBERY THERE.", phonetic = "yu can ripót de róberi dea", spanish = "Allí puede denunciar el robo."),
                    PhraseItem(english = "YOU CAN REPORT YOUR STOLEN PASSPORT THERE.", phonetic = "yu can ripót yor stóulen pásport dea", spanish = "Allí puede denunciar el robo de su pasaporte."),
                    PhraseItem(english = "YOU CAN REPORT YOUR STOLEN VEHICLE THERE.", phonetic = "yu can ripót yor stóulen víikol dea", spanish = "Allí puede denunciar el robo de su vehículo."),
                    PhraseItem(english = "IF YOU HAVE LOST YOUR PASSPORT, PLEASE CONTACT YOUR EMBASSY.", phonetic = "if yu jav lost yor pásport plís cóntakt yor émbasi", spanish = "Si ha perdido su pasaporte, contacte con su embajada."),
                    PhraseItem(english = "DO YOU NEED AN INTERPRETER?", phonetic = "du yu nid an intérpreta", spanish = "¿Necesita un intérprete?"),
                    PhraseItem(english = "WE WILL HELP YOU AS MUCH AS WE CAN.", phonetic = "güi wil jelp yu as mach as güi can", spanish = "Le ayudaremos en todo lo que podamos."),
                    PhraseItem(english = "THIS IS A MATTER FOR THE LOCAL POLICE.", phonetic = "dis is a máta for de lóukal polís", spanish = "Este asunto corresponde a la Policía Local."),
                    PhraseItem(english = "THIS IS A MATTER FOR THE NATIONAL POLICE.", phonetic = "dis is a máta for de náshonal polís", spanish = "Este asunto corresponde a la Policía Nacional."),
                    PhraseItem(english = "IF YOU NEED AN EMERGENCY SERVICE, CALL 112.", phonetic = "if yu nid an imérllensi sérvis kol uan uan tu", spanish = "Si necesita un servicio de emergencia, llame al 112."),
                    PhraseItem(english = "IF YOU NEED MEDICAL ASSISTANCE, GO TO THE HOSPITAL.", phonetic = "if yu nid médikol asistans góu tu de hóspital", spanish = "Si necesita asistencia médica, vaya al hospital."),
                    PhraseItem(english = "PLEASE KEEP THIS REFERENCE NUMBER.", phonetic = "plís kip dis réferens nómba", spanish = "Conserve este número de referencia."),
                    PhraseItem(english = "PLEASE FOLLOW MY DIRECTIONS.", phonetic = "plís fólou mai dairékshons", spanish = "Siga mis indicaciones."),
                    PhraseItem(english = "DO YOU HAVE SOMEWHERE TO STAY TONIGHT?", phonetic = "du yu jav sámgüea tu stéi tunáit", spanish = "¿Tiene algún lugar donde dormir esta noche?"),
                    PhraseItem(english = "DO YOU NEED A PLACE TO SLEEP?", phonetic = "du yu nid a pleis tu slip", spanish = "¿Necesita un lugar para dormir?"),
                    PhraseItem(english = "DO YOU HAVE ANY MONEY?", phonetic = "du yu jav éni máni", spanish = "¿Tiene dinero?"),
                    PhraseItem(english = "DO YOU HAVE ANY FAMILY OR FRIENDS HERE?", phonetic = "du yu jav éni fámili or frends jía", spanish = "¿Tiene familiares o amigos aquí?"),
                    PhraseItem(english = "DO YOU NEED FOOD OR WATER?", phonetic = "du yu nid fud or uóta", spanish = "¿Necesita comida o agua?"),
                    PhraseItem(english = "DO YOU NEED WARM CLOTHES OR A BLANKET?", phonetic = "du yu nid uorm klóudz or a blánkit", spanish = "¿Necesita ropa de abrigo o una manta?"),
                    PhraseItem(english = "WE CAN CONTACT SOCIAL SERVICES.", phonetic = "güi can cóntakt sóushal sérvisis", spanish = "Podemos contactar con los Servicios Sociales."),
                    PhraseItem(english = "A SOCIAL WORKER WILL COME TO HELP YOU.", phonetic = "a sóushal guórka wil cam tu jelp yu", spanish = "Un trabajador social vendrá a atenderle."),
                    PhraseItem(english = "WE CAN TAKE YOU TO A SHELTER.", phonetic = "güi can teik yu tu a shélta", spanish = "Podemos llevarle a un albergue."),
                    PhraseItem(english = "THERE IS EMERGENCY ACCOMMODATION AVAILABLE.", phonetic = "dea is imérllensi akómodeishon avéilabol", spanish = "Hay alojamiento de emergencia disponible."),
                    PhraseItem(english = "PLEASE WAIT HERE.", phonetic = "plís güeit jía", spanish = "Espere aquí, por favor."),
                    PhraseItem(english = "YOU ARE SAFE HERE.", phonetic = "yu ar séif jía", spanish = "Aquí está seguro."),
                    PhraseItem(english = "IF YOU NEED FURTHER ASSISTANCE, COME BACK TO US.", phonetic = "if yu nid férda asistans cam bak tu as", spanish = "Si necesita más ayuda, vuelva a acudir a nosotros."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module8 {
    val module = Module(
        id = 8,
        title = "Módulo 8",
        description = "Controles de tráfico",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Accidentes de Tráfico",
                vocabulary = listOf(
                    VocabularyItem(term = "ACCIDENT", phonetic = "áksident", translation = "Accidente"),
                    VocabularyItem(term = "ROAD TRAFFIC ACCIDENT", phonetic = "roud tráfik áksident", translation = "Accidente de tráfico"),
                    VocabularyItem(term = "COLLISION", phonetic = "colíshon", translation = "Colisión"),
                    VocabularyItem(term = "REAR-END COLLISION", phonetic = "ríar end colíshon", translation = "Colisión por alcance"),
                    VocabularyItem(term = "HEAD-ON COLLISION", phonetic = "jed on colíshon", translation = "Colisión frontal"),
                    VocabularyItem(term = "SIDE-IMPACT COLLISION", phonetic = "said ímpakt colíshon", translation = "Colisión lateral"),
                    VocabularyItem(term = "T-BONE COLLISION", phonetic = "ti boun colíshon", translation = "Colisión perpendicular"),
                    VocabularyItem(term = "SIDESWIPE", phonetic = "sáidsuáip", translation = "Roce lateral"),
                    VocabularyItem(term = "ROLLOVER", phonetic = "rólouva", translation = "Vuelco"),
                    VocabularyItem(term = "PILE-UP", phonetic = "páil ap", translation = "Colisión múltiple"),
                    VocabularyItem(term = "HIT-AND-RUN", phonetic = "jit and ran", translation = "Accidente con fuga"),
                    VocabularyItem(term = "IMPACT", phonetic = "ímpakt", translation = "Impacto"),
                    VocabularyItem(term = "POINT OF IMPACT", phonetic = "point ov ímpakt", translation = "Punto de impacto"),
                    VocabularyItem(term = "DAMAGE", phonetic = "dámich", translation = "Daños"),
                    VocabularyItem(term = "DEBRIS", phonetic = "déibris", translation = "Restos del accidente"),
                    VocabularyItem(term = "VEHICLE", phonetic = "víikol", translation = "Vehículo"),
                    VocabularyItem(term = "DRIVER", phonetic = "dráiva", translation = "Conductor"),
                    VocabularyItem(term = "PASSENGER", phonetic = "pásenya", translation = "Pasajero"),
                    VocabularyItem(term = "PEDESTRIAN", phonetic = "pedéstrian", translation = "Peatón"),
                    VocabularyItem(term = "CYCLIST", phonetic = "sáiklist", translation = "Ciclista"),
                    VocabularyItem(term = "MOTORCYCLIST", phonetic = "móutosaiklist", translation = "Motorista"),
                    VocabularyItem(term = "WITNESS", phonetic = "guítnes", translation = "Testigo"),
                    VocabularyItem(term = "STATEMENT", phonetic = "stéitment", translation = "Declaración"),
                    VocabularyItem(term = "INJURY", phonetic = "ínyuri", translation = "Lesión"),
                    VocabularyItem(term = "AMBULANCE", phonetic = "ámbiulans", translation = "Ambulancia"),
                    VocabularyItem(term = "FIREFIGHTERS", phonetic = "fáiafaiters", translation = "Bomberos"),
                    VocabularyItem(term = "EMERGENCY SERVICES", phonetic = "imérllensi sérvisis", translation = "Servicios de emergencia"),
                    VocabularyItem(term = "INSURANCE", phonetic = "inshúrans", translation = "Seguro"),
                    VocabularyItem(term = "TOW TRUCK", phonetic = "tóu trak", translation = "Grúa"),
                    VocabularyItem(term = "REGISTRATION NUMBER", phonetic = "rellistréishon námba", translation = "Matrícula")
                ),
                phrases = listOf(
                    PhraseItem(english = "IS ANYONE INJURED?", phonetic = "is éniuán ínyurd", spanish = "¿Hay algún herido?"),
                    PhraseItem(english = "DOES ANYONE NEED AN AMBULANCE?", phonetic = "das éniuán nid an ámbiulans", spanish = "¿Alguien necesita una ambulancia?"),
                    PhraseItem(english = "ARE YOU HURT?", phonetic = "ar yu jert", spanish = "¿Está herido?"),
                    PhraseItem(english = "PLEASE STAY CALM.", phonetic = "plís stéi cam", spanish = "Mantenga la calma."),
                    PhraseItem(english = "PLEASE REMAIN WHERE YOU ARE.", phonetic = "plís riméin güer yu ar", spanish = "Permanezca donde está."),
                    PhraseItem(english = "PLEASE DO NOT MOVE.", phonetic = "plís du not muv", spanish = "No se mueva."),
                    PhraseItem(english = "IF YOU CAN, MOVE TO A SAFE PLACE.", phonetic = "if yu can muv tu a séif pleis", spanish = "Si puede, desplácese a un lugar seguro."),
                    PhraseItem(english = "PLEASE STAY AWAY FROM THE ROAD.", phonetic = "plís stéi aguéi from de roud", spanish = "Manténgase alejado de la calzada."),
                    PhraseItem(english = "PLEASE TURN OFF THE ENGINE.", phonetic = "plís tern of di énllin", spanish = "Apague el motor."),
                    PhraseItem(english = "PLEASE SWITCH ON THE HAZARD LIGHTS.", phonetic = "plís suích on de házard laits", spanish = "Encienda las luces de emergencia."),
                    PhraseItem(english = "PLEASE DO NOT MOVE THE VEHICLES.", phonetic = "plís du not muv de víikols", spanish = "No muevan los vehículos."),
                    PhraseItem(english = "WE NEED TO EXAMINE THE SCENE.", phonetic = "güi nid tu igsámin de sín", spanish = "Necesitamos examinar el lugar del accidente."),
                    PhraseItem(english = "WHAT HAPPENED?", phonetic = "guot jápend", spanish = "¿Qué ha ocurrido?"),
                    PhraseItem(english = "WHAT TYPE OF ACCIDENT WAS IT?", phonetic = "guot taip ov áksident guoz it", spanish = "¿Qué tipo de accidente fue?"),
                    PhraseItem(english = "WAS IT A REAR-END COLLISION?", phonetic = "guoz it a ríar end colíshon", spanish = "¿Fue un alcance?"),
                    PhraseItem(english = "WAS IT A HEAD-ON COLLISION?", phonetic = "guoz it a jed on colíshon", spanish = "¿Fue una colisión frontal?"),
                    PhraseItem(english = "WAS IT A SIDE-IMPACT COLLISION?", phonetic = "guoz it a said ímpakt colíshon", spanish = "¿Fue una colisión lateral?"),
                    PhraseItem(english = "DID THE OTHER VEHICLE HIT YOU FROM BEHIND?", phonetic = "did di áda víikol jit yu from bijáind", spanish = "¿El otro vehículo le golpeó por detrás?"),
                    PhraseItem(english = "WHICH VEHICLE WAS HIT FIRST?", phonetic = "guich víikol guoz jit ferst", spanish = "¿Qué vehículo fue golpeado primero?"),
                    PhraseItem(english = "WHERE DID THE IMPACT OCCUR?", phonetic = "güer did di ímpakt okér", spanish = "¿Dónde se produjo el impacto?"),
                    PhraseItem(english = "DID ANY VEHICLE LEAVE THE SCENE?", phonetic = "did éni víikol liv de sín", spanish = "¿Algún vehículo abandonó el lugar?"),
                    PhraseItem(english = "DID YOU SEE WHO CAUSED THE ACCIDENT?", phonetic = "did yu si ju cózd di áksident", spanish = "¿Vio quién provocó el accidente?"),
                    PhraseItem(english = "ARE YOU A WITNESS?", phonetic = "ar yu a guítnes", spanish = "¿Es usted testigo?"),
                    PhraseItem(english = "PLEASE TELL ME WHAT YOU SAW.", phonetic = "plís tel mi guot yu só", spanish = "Dígame qué ha visto."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR DRIVING LICENCE.", phonetic = "plís shóu mi yor dráivin láisens", spanish = "Muéstreme su permiso de conducir."),
                    PhraseItem(english = "PLEASE SHOW ME YOUR INSURANCE DOCUMENTS.", phonetic = "plís shóu mi yor inshúrans dókiuments", spanish = "Muéstreme la documentación del seguro."),
                    PhraseItem(english = "PLEASE SHOW ME THE VEHICLE DOCUMENTS.", phonetic = "plís shóu mi de víikol dókiuments", spanish = "Muéstreme la documentación del vehículo."),
                    PhraseItem(english = "PLEASE SHOW ME THE DAMAGE.", phonetic = "plís shóu mi de dámich", spanish = "Muéstreme los daños."),
                    PhraseItem(english = "WE WILL PREPARE AN ACCIDENT REPORT.", phonetic = "güi wil pripea an áksident ripórt", spanish = "Vamos a redactar un informe del accidente."),
                    PhraseItem(english = "YOUR VEHICLE CANNOT BE DRIVEN.", phonetic = "yor víikol cánot bi dríven", spanish = "Su vehículo no puede continuar circulando."),
                    PhraseItem(english = "A TOW TRUCK IS ON THE WAY.", phonetic = "a tóu trak is on de güéi", spanish = "La grúa está de camino."),
                    PhraseItem(english = "PLEASE WAIT HERE UNTIL WE FINISH.", phonetic = "plís güeit jía antíl güi fínish", spanish = "Espere aquí hasta que terminemos."),
                    PhraseItem(english = "FOR YOUR SAFETY, PLEASE STAY BEHIND THE POLICE VEHICLE.", phonetic = "for yor séifti plís stéi bijáind de polís víikol", spanish = "Por su seguridad, permanezca detrás del vehículo policial."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}

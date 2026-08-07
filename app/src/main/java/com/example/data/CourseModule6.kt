package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module6 {
    val module = Module(
        id = 6,
        title = "Módulo 6",
        description = "Personas vulnerables, menores y violencia de género",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Infracciones de tráfico",
                vocabulary = listOf(
                    VocabularyItem(term = "TRAFFIC OFFENCE", phonetic = "tráfik ofens", translation = "Infracción de tráfico"),
                    VocabularyItem(term = "SPEED LIMIT", phonetic = "spid límit", translation = "Límite de velocidad"),
                    VocabularyItem(term = "SPEEDING", phonetic = "spídin", translation = "Exceso de velocidad"),
                    VocabularyItem(term = "RED LIGHT", phonetic = "red lait", translation = "Semáforo en rojo"),
                    VocabularyItem(term = "TRAFFIC LIGHTS", phonetic = "tráfik laits", translation = "Semáforos"),
                    VocabularyItem(term = "STOP SIGN", phonetic = "stop sain", translation = "Señal de STOP"),
                    VocabularyItem(term = "ROAD SIGN", phonetic = "roud sain", translation = "Señal de tráfico"),
                    VocabularyItem(term = "ONE-WAY STREET", phonetic = "uan güei strít", translation = "Calle de sentido único"),
                    VocabularyItem(term = "PEDESTRIAN CROSSING", phonetic = "pedéstrian crósin", translation = "Paso de peatones"),
                    VocabularyItem(term = "PAVEMENT", phonetic = "péivment", translation = "Acera"),
                    VocabularyItem(term = "JUNCTION", phonetic = "yánkshon", translation = "Cruce"),
                    VocabularyItem(term = "ROUNDABOUT", phonetic = "ráundabaut", translation = "Glorieta"),
                    VocabularyItem(term = "LANE", phonetic = "léin", translation = "Carril"),
                    VocabularyItem(term = "BUS LANE", phonetic = "bas léin", translation = "Carril bus"),
                    VocabularyItem(term = "CYCLE LANE", phonetic = "sáikol léin", translation = "Carril bici"),
                    VocabularyItem(term = "PARKING SPACE", phonetic = "párkin spéis", translation = "Plaza de aparcamiento"),
                    VocabularyItem(term = "DOUBLE PARKING", phonetic = "dábol párkin", translation = "Estacionamiento en doble fila"),
                    VocabularyItem(term = "DOUBLE YELLOW LINES", phonetic = "dábol yélou láins", translation = "Línea amarilla continua"),
                    VocabularyItem(term = "NO PARKING", phonetic = "nóu párkin", translation = "Prohibido estacionar"),
                    VocabularyItem(term = "NO ENTRY", phonetic = "nóu éntri", translation = "Dirección prohibida"),
                    VocabularyItem(term = "BUS STOP", phonetic = "bas stop", translation = "Parada de autobús"),
                    VocabularyItem(term = "TAXI RANK", phonetic = "táksi rank", translation = "Parada de taxis"),
                    VocabularyItem(term = "LOADING BAY", phonetic = "lóudin bei", translation = "Zona de carga y descarga"),
                    VocabularyItem(term = "DISABLED PARKING SPACE", phonetic = "diséibeld párkin spéis", translation = "Plaza reservada para personas con movilidad reducida"),
                    VocabularyItem(term = "DRIVEWAY", phonetic = "dráivguei", translation = "Vado"),
                    VocabularyItem(term = "KEEP CLEAR", phonetic = "kip klía", translation = "Marca vial \"No bloquear\""),
                    VocabularyItem(term = "EMERGENCY EXIT", phonetic = "imérllensi éksit", translation = "Salida de emergencia"),
                    VocabularyItem(term = "OBSTRUCTION", phonetic = "obstrákshon", translation = "Obstaculización"),
                    VocabularyItem(term = "TRAFFIC FLOW", phonetic = "tráfik flóu", translation = "Circulación del tráfico"),
                    VocabularyItem(term = "FINE", phonetic = "fáin", translation = "Multa"),
                    VocabularyItem(term = "PENALTY", phonetic = "pénalti", translation = "Sanción"),
                    VocabularyItem(term = "TOW TRUCK", phonetic = "tóu trak", translation = "Grúa municipal"),
                    VocabularyItem(term = "ROAD", phonetic = "roud", translation = "Vía"),
                    VocabularyItem(term = "FOOTPATH", phonetic = "futpaz", translation = "Zona peatonal")
                ),
                phrases = listOf(
                    PhraseItem(english = "I HAVE STOPPED YOU BECAUSE OF A TRAFFIC OFFENCE.", phonetic = "ai jav stopt yu bicós ov a tráfik ofens", spanish = "Le he detenido por una infracción de tráfico."),
                    PhraseItem(english = "YOU HAVE COMMITTED A TRAFFIC OFFENCE.", phonetic = "yu jav comítid a tráfik ofens", spanish = "Ha cometido una infracción de tráfico."),
                    PhraseItem(english = "YOU WERE DRIVING TOO FAST.", phonetic = "yu güer dráivin tu fast", spanish = "Circulaba a demasiada velocidad."),
                    PhraseItem(english = "YOU EXCEEDED THE SPEED LIMIT.", phonetic = "yu iksídid de spid límit", spanish = "Ha superado el límite de velocidad."),
                    PhraseItem(english = "YOU WENT THROUGH A RED LIGHT.", phonetic = "yu guent zru a red lait", spanish = "Ha pasado un semáforo en rojo."),
                    PhraseItem(english = "YOU FAILED TO STOP AT THE STOP SIGN.", phonetic = "yu feild tu stop at de stop sain", spanish = "No se detuvo en la señal de STOP."),
                    PhraseItem(english = "YOU WERE USING A MOBILE PHONE WHILE DRIVING.", phonetic = "yu güer yúsin a móubail fóun guáil dráivin", spanish = "Estaba utilizando el teléfono móvil mientras conducía."),
                    PhraseItem(english = "YOU WERE NOT WEARING YOUR SEAT BELT.", phonetic = "yu güer not güérin yor sít belt", spanish = "No llevaba puesto el cinturón de seguridad."),
                    PhraseItem(english = "YOU CANNOT PARK HERE.", phonetic = "yu cánot park jía", spanish = "No puede estacionar aquí."),
                    PhraseItem(english = "YOU PARKED IN A PROHIBITED AREA.", phonetic = "yu parkt in a proíbited éria", spanish = "Ha estacionado en una zona prohibida."),
                    PhraseItem(english = "YOU ARE PARKED ON THE PAVEMENT.", phonetic = "yu ar parkt on de péivment", spanish = "Ha estacionado sobre la acera."),
                    PhraseItem(english = "YOU ARE DOUBLE PARKED.", phonetic = "yu ar dábol parkt", spanish = "Está estacionado en doble fila."),
                    PhraseItem(english = "YOU ARE PARKED ON A PEDESTRIAN CROSSING.", phonetic = "yu ar parkt on a pedéstrian crósin", spanish = "Ha estacionado sobre un paso de peatones."),
                    PhraseItem(english = "YOU ARE PARKED ON DOUBLE YELLOW LINES.", phonetic = "yu ar parkt on dábol yélou láins", spanish = "Ha estacionado sobre línea amarilla."),
                    PhraseItem(english = "YOU ARE PARKED TOO CLOSE TO THE JUNCTION.", phonetic = "yu ar parkt tu clóus tu de yánkshon", spanish = "Ha estacionado demasiado cerca del cruce."),
                    PhraseItem(english = "YOU ARE PARKED AT A BUS STOP.", phonetic = "yu ar parkt at a bas stop", spanish = "Ha estacionado en una parada de autobús."),
                    PhraseItem(english = "YOU ARE PARKED IN A TAXI RANK.", phonetic = "yu ar parkt in a táksi rank", spanish = "Ha estacionado en una parada de taxis."),
                    PhraseItem(english = "YOU ARE PARKED IN A LOADING BAY.", phonetic = "yu ar parkt in a lóudin bei", spanish = "Ha estacionado en una zona de carga y descarga."),
                    PhraseItem(english = "YOU ARE PARKED IN A DISABLED PARKING SPACE.", phonetic = "yu ar parkt in a diséibeld párkin spéis", spanish = "Ha estacionado en una plaza reservada para personas con movilidad reducida."),
                    PhraseItem(english = "YOU ARE BLOCKING THE ROAD.", phonetic = "yu ar blókin de roud", spanish = "Está obstaculizando la circulación."),
                    PhraseItem(english = "YOU ARE BLOCKING THE PAVEMENT.", phonetic = "yu ar blókin de péivment", spanish = "Está obstaculizando la acera."),
                    PhraseItem(english = "YOU ARE BLOCKING A DRIVEWAY.", phonetic = "yu ar blókin a dráivguei", spanish = "Está bloqueando un vado."),
                    PhraseItem(english = "YOU ARE OBSTRUCTING TRAFFIC.", phonetic = "yu ar obstráktin tráfik", spanish = "Está obstaculizando la circulación."),
                    PhraseItem(english = "YOU ARE OBSTRUCTING PEDESTRIANS.", phonetic = "yu ar obstráktin pedéstrians", spanish = "Está obstaculizando el paso de peatones."),
                    PhraseItem(english = "YOUR VEHICLE IS CAUSING AN OBSTRUCTION.", phonetic = "yor víikol is cósin an obstrákshon", spanish = "Su vehículo está causando una obstrucción."),
                    PhraseItem(english = "YOU ARE CAUSING A DANGER TO OTHER ROAD USERS.", phonetic = "yu ar cósin a déinya tu áda roud yúsers", spanish = "Está poniendo en peligro a otros usuarios de la vía."),
                    PhraseItem(english = "THIS PARKING SPACE IS RESERVED.", phonetic = "dis párkin spéis is rizérvd", spanish = "Esta plaza está reservada."),
                    PhraseItem(english = "THIS IS NOT A PARKING SPACE.", phonetic = "dis is not a párkin spéis", spanish = "Esto no es una plaza de aparcamiento."),
                    PhraseItem(english = "YOU MUST NOT PARK IN THIS AREA.", phonetic = "yu mast not park in dis éria", spanish = "No puede estacionar en esta zona."),
                    PhraseItem(english = "PLEASE MOVE YOUR VEHICLE.", phonetic = "plís muv yor víikol", spanish = "Retire su vehículo, por favor."),
                    PhraseItem(english = "PLEASE MOVE YOUR VEHICLE IMMEDIATELY.", phonetic = "plís muv yor víikol imídietli", spanish = "Retire el vehículo inmediatamente."),
                    PhraseItem(english = "THIS VEHICLE MUST BE REMOVED.", phonetic = "dis víikol mast bi rimúvd", spanish = "Este vehículo debe ser retirado."),
                    PhraseItem(english = "YOUR VEHICLE WILL BE TOWED AWAY.", phonetic = "yor víikol wil bi tóud aguéi", spanish = "Su vehículo será retirado por la grúa."),
                    PhraseItem(english = "PLEASE PARK IN A DESIGNATED PARKING SPACE.", phonetic = "plís park in a dézigneitid párkin spéis", spanish = "Estacione en una plaza habilitada."),
                    PhraseItem(english = "PLEASE FOLLOW THE TRAFFIC SIGNS.", phonetic = "plís fólou de tráfik sains", spanish = "Respete la señalización de tráfico."),
                    PhraseItem(english = "PLEASE DRIVE CAREFULLY.", phonetic = "plís dráiv kéafuli", spanish = "Conduzca con precaución."),
                    PhraseItem(english = "PLEASE RESPECT THE SPEED LIMIT.", phonetic = "plís rispékt de spid límit", spanish = "Respete el límite de velocidad."),
                    PhraseItem(english = "YOU WILL RECEIVE A FINE.", phonetic = "yu wil risív a fáin", spanish = "Va a recibir una multa."),
                    PhraseItem(english = "THIS IS A TRAFFIC PENALTY.", phonetic = "dis is a tráfik pénalti", spanish = "Esta es una sanción de tráfico."),
                    PhraseItem(english = "PLEASE READ THE NOTICE CAREFULLY.", phonetic = "plís rid de nóutis kéafuli", spanish = "Lea atentamente la notificación."),
                    PhraseItem(english = "IF YOU HAVE ANY QUESTIONS, I WILL EXPLAIN THE PROCEDURE.", phonetic = "if yu jav éni kuéstchons ai wil ikspléin de prosídya", spanish = "Si tiene alguna duda, le explicaré el procedimiento."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
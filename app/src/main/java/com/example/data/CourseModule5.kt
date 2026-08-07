package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module5 {
    val module = Module(
        id = 5,
        title = "Módulo 5",
        description = "Vehículos y sus partes.",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Vehículos y sus partes",
                vocabulary = listOf(
                    VocabularyItem(term = "VEHICLE", phonetic = "víikol", translation = "Vehículo"),
                    VocabularyItem(term = "CAR", phonetic = "ka", translation = "Coche"),
                    VocabularyItem(term = "MOTORCYCLE", phonetic = "móutor sáikol", translation = "Motocicleta"),
                    VocabularyItem(term = "MOPED", phonetic = "móuped", translation = "Ciclomotor"),
                    VocabularyItem(term = "VAN", phonetic = "van", translation = "Furgoneta"),
                    VocabularyItem(term = "LORRY", phonetic = "lóri", translation = "Camión"),
                    VocabularyItem(term = "BUS", phonetic = "bas", translation = "Autobús"),
                    VocabularyItem(term = "TAXI", phonetic = "táksi", translation = "Taxi"),
                    VocabularyItem(term = "BICYCLE", phonetic = "báisikol", translation = "Bicicleta"),
                    VocabularyItem(term = "ELECTRIC SCOOTER", phonetic = "iléktrik skúta", translation = "Patinete eléctrico"),
                    VocabularyItem(term = "REGISTRATION PLATE", phonetic = "rechestréishon pleit", translation = "Matrícula"),
                    VocabularyItem(term = "ENGINE", phonetic = "énchin", translation = "Motor"),
                    VocabularyItem(term = "STEERING WHEEL", phonetic = "stíarin guíl", translation = "Volante"),
                    VocabularyItem(term = "BRAKE", phonetic = "breik", translation = "Freno"),
                    VocabularyItem(term = "HANDBRAKE", phonetic = "jandbreik", translation = "Freno de mano"),
                    VocabularyItem(term = "GEARBOX", phonetic = "guíaboks", translation = "Caja de cambios"),
                    VocabularyItem(term = "CLUTCH", phonetic = "clach", translation = "Embrague"),
                    VocabularyItem(term = "ACCELERATOR", phonetic = "akséleraita", translation = "Acelerador"),
                    VocabularyItem(term = "HEADLIGHT", phonetic = "jédlait", translation = "Faro delantero"),
                    VocabularyItem(term = "TAIL LIGHT", phonetic = "téil lait", translation = "Piloto trasero"),
                    VocabularyItem(term = "INDICATOR", phonetic = "índikeita", translation = "Intermitente"),
                    VocabularyItem(term = "WINDSCREEN", phonetic = "guíndskrin", translation = "Parabrisas"),
                    VocabularyItem(term = "WINDOW", phonetic = "guíndou", translation = "Ventanilla"),
                    VocabularyItem(term = "MIRROR", phonetic = "mírra", translation = "Espejo"),
                    VocabularyItem(term = "DOOR", phonetic = "do", translation = "Puerta"),
                    VocabularyItem(term = "BONNET", phonetic = "bónit", translation = "Capó"),
                    VocabularyItem(term = "BOOT", phonetic = "but", translation = "Maletero"),
                    VocabularyItem(term = "TYRE", phonetic = "táia", translation = "Neumático"),
                    VocabularyItem(term = "WHEEL", phonetic = "guíl", translation = "Rueda"),
                    VocabularyItem(term = "SEAT BELT", phonetic = "sít belt", translation = "Cinturón de seguridad"),
                    VocabularyItem(term = "CHILD SEAT", phonetic = "cháild sít", translation = "Silla infantil"),
                    VocabularyItem(term = "IGNITION KEY", phonetic = "igníshon ki", translation = "Llave de contacto"),
                    VocabularyItem(term = "FUEL", phonetic = "fiúl", translation = "Combustible"),
                    VocabularyItem(term = "PETROL", phonetic = "pétrol", translation = "Gasolina"),
                    VocabularyItem(term = "DIESEL", phonetic = "díisel", translation = "Diésel"),
                    VocabularyItem(term = "BATTERY", phonetic = "bátari", translation = "Batería")
                ),
                phrases = listOf(
                    PhraseItem(english = "IS THIS YOUR VEHICLE?", phonetic = "is dis yor víikol", spanish = "¿Es este su vehículo?"),
                    PhraseItem(english = "WHO IS THE OWNER OF THIS VEHICLE?", phonetic = "ju is di óuna ov dis víikol", spanish = "¿Quién es el propietario de este vehículo?"),
                    PhraseItem(english = "PLEASE SWITCH OFF THE ENGINE.", phonetic = "plís suích of di énchin", spanish = "Apague el motor, por favor."),
                    PhraseItem(english = "PLEASE REMOVE THE KEY FROM THE IGNITION.", phonetic = "plís rimúv de ki from di igníshon", spanish = "Saque la llave del contacto, por favor."),
                    PhraseItem(english = "PLEASE OPEN THE DRIVER'S WINDOW.", phonetic = "plís óupen de dráiva's guíndou", spanish = "Baje la ventanilla del conductor, por favor."),
                    PhraseItem(english = "PLEASE OPEN THE DOOR.", phonetic = "plís óupen de do", spanish = "Abra la puerta, por favor."),
                    PhraseItem(english = "PLEASE OPEN THE BOOT.", phonetic = "plís óupen de but", spanish = "Abra el maletero, por favor."),
                    PhraseItem(english = "PLEASE OPEN THE BONNET.", phonetic = "plís óupen de bónit", spanish = "Abra el capó, por favor."),
                    PhraseItem(english = "PLEASE TURN ON THE HEADLIGHTS.", phonetic = "plís tern on de jédlaits", spanish = "Encienda los faros, por favor."),
                    PhraseItem(english = "PLEASE TURN OFF THE HEADLIGHTS.", phonetic = "plís tern of de jédlaits", spanish = "Apague los faros, por favor."),
                    PhraseItem(english = "PLEASE TURN ON THE HAZARD LIGHTS.", phonetic = "plís tern on de házard laits", spanish = "Encienda las luces de emergencia, por favor."),
                    PhraseItem(english = "PLEASE APPLY THE HANDBRAKE.", phonetic = "plís aplái de jandbreik", spanish = "Ponga el freno de mano, por favor."),
                    PhraseItem(english = "PLEASE FASTEN YOUR SEAT BELT.", phonetic = "plís fásen yor sít belt", spanish = "Abróchese el cinturón de seguridad, por favor."),
                    PhraseItem(english = "PLEASE STEP OUT OF THE VEHICLE.", phonetic = "plís step aut ov de víikol", spanish = "Salga del vehículo, por favor."),
                    PhraseItem(english = "PLEASE STAND NEXT TO THE VEHICLE.", phonetic = "plís stand nekst tu de víikol", spanish = "Colóquese junto al vehículo, por favor."),
                    PhraseItem(english = "PLEASE STAY AWAY FROM THE ROAD.", phonetic = "plís stéi aguéi from de roud", spanish = "Aléjese de la calzada, por favor."),
                    PhraseItem(english = "DO NOT START THE ENGINE.", phonetic = "du not start di énchin", spanish = "No arranque el motor."),
                    PhraseItem(english = "DO NOT TOUCH ANYTHING INSIDE THE VEHICLE.", phonetic = "du not tach énizin insáid de víikol", spanish = "No toque nada dentro del vehículo."),
                    PhraseItem(english = "IS ANYONE ELSE INSIDE THE VEHICLE?", phonetic = "is éniuan els insáid de víikol", spanish = "¿Hay alguien más dentro del vehículo?"),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
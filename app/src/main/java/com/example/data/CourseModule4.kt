package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module4 = Module(
    moduleId = 4,
    moduleName = "Módulo 4: Parada e identificación de vehículos",
    lessons = listOf(
        Lesson(
            lessonId = 401,
            lessonTitle = "Orden de detenerse y motor",
            vocabulary = listOf(
                VocabularyItem(es = "Parar / Detener", en = "STOP", phonetic = "stap"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Orillar / Detenerse a un lado", en = "PULL OVER", phonetic = "pul óuver"),
                VocabularyItem(es = "Coche / Automóvil", en = "CAR", phonetic = "car"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Girar / Apagar", en = "TURN", phonetic = "tern"),
                VocabularyItem(es = "Apagado / Fuera", en = "OFF", phonetic = "of"),
                VocabularyItem(es = "Motor", en = "ENGINE", phonetic = "én-yin"),
                VocabularyItem(es = "Cambiar / Conmutar", en = "SWITCH", phonetic = "suích"),
                VocabularyItem(es = "Mantener", en = "KEEP", phonetic = "kip")
            ),
            phrases = listOf(
                PhraseItem(es = "Pare el vehículo, por favor.", en = "STOP THE VEHICLE, PLEASE.", phonetic = "stap de víikol, plis"),
                PhraseItem(es = "Deténgase, por favor.", en = "PULL OVER, PLEASE.", phonetic = "pul óuver, plis"),
                PhraseItem(es = "Pare el coche ahora.", en = "STOP THE CAR NOW.", phonetic = "stap de car nau"),
                PhraseItem(es = "Apague el motor, por favor.", en = "PLEASE TURN OFF THE ENGINE.", phonetic = "plís tern of di én-yin"),
                PhraseItem(es = "Apague el motor, por favor.", en = "SWITCH OFF THE ENGINE, PLEASE.", phonetic = "suích of di én-yin, plis"),
                PhraseItem(es = "Mantenga el motor apagado.", en = "KEEP THE ENGINE OFF.", phonetic = "kip di én-yin of")
            )
        ),
        Lesson(
            lessonId = 402,
            lessonTitle = "Permanecer dentro y posición de manos",
            vocabulary = listOf(
                VocabularyItem(es = "Permanecer / Quedarse", en = "STAY", phonetic = "stéi"),
                VocabularyItem(es = "Dentro", en = "INSIDE", phonetic = "insáid"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Hacer (auxiliar negativo)", en = "DO NOT / DON'T", phonetic = "du not / dont"),
                VocabularyItem(es = "Salir / Bajar", en = "GET OUT", phonetic = "guet aut"),
                VocabularyItem(es = "Todavía / Aún", en = "YET", phonetic = "yet"),
                VocabularyItem(es = "Permanecer / Mantenerse", en = "REMAIN", phonetic = "riméin"),
                VocabularyItem(es = "Sentado", en = "SEATED", phonetic = "síted"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Poner", en = "PUT", phonetic = "put"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Manos", en = "HANDS", phonetic = "jands"),
                VocabularyItem(es = "En / Sobre", en = "ON", phonetic = "on"),
                VocabularyItem(es = "Volante", en = "WHEEL", phonetic = "güíl"),
                VocabularyItem(es = "Mantener", en = "KEEP", phonetic = "kip"),
                VocabularyItem(es = "Visible", en = "VISIBLE", phonetic = "vísibol"),
                VocabularyItem(es = "Mover", en = "MOVE", phonetic = "muv")
            ),
            phrases = listOf(
                PhraseItem(es = "Permanezca dentro del vehículo.", en = "STAY INSIDE THE VEHICLE.", phonetic = "stéi insáid de víikol"),
                PhraseItem(es = "No salga todavía.", en = "DO NOT GET OUT YET.", phonetic = "du not guet aut yet"),
                PhraseItem(es = "Permanezca sentado, por favor.", en = "REMAIN SEATED, PLEASE.", phonetic = "riméin síted, plis"),
                PhraseItem(es = "Ponga las manos en el volante.", en = "PUT YOUR HANDS ON THE WHEEL.", phonetic = "put yor jands on de güíl"),
                PhraseItem(es = "Mantenga las manos visibles.", en = "KEEP YOUR HANDS VISIBLE.", phonetic = "kip yor jands vísibol"),
                PhraseItem(es = "No mueva las manos.", en = "DON'T MOVE YOUR HANDS.", phonetic = "dont muv yor jands")
            )
        ),
        Lesson(
            lessonId = 403,
            lessonTitle = "Salida del vehículo y ocupantes",
            vocabulary = listOf(
                VocabularyItem(es = "Salir / Bajar", en = "GET OUT", phonetic = "guet aut"),
                VocabularyItem(es = "De (posesión/origen)", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Despacio / Lentamente", en = "SLOWLY", phonetic = "slóuli"),
                VocabularyItem(es = "Abrir", en = "OPEN", phonetic = "óupen"),
                VocabularyItem(es = "Puerta", en = "DOOR", phonetic = "dor"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Dar un paso / Salir", en = "STEP OUT", phonetic = "step aut"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Dejar", en = "LEAVE", phonetic = "liv"),
                VocabularyItem(es = "Llaves", en = "KEYS", phonetic = "kis"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Ignición / Contacto", en = "IGNITION", phonetic = "igníshon"),
                VocabularyItem(es = "Cuántos / Cuántas", en = "HOW MANY", phonetic = "jau méni"),
                VocabularyItem(es = "Gente / Personas", en = "PEOPLE", phonetic = "pípol"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Algún / Cualquier", en = "ANY", phonetic = "éni"),
                VocabularyItem(es = "Otro / Otros", en = "OTHER", phonetic = "óder"),
                VocabularyItem(es = "Ocupantes", en = "OCCUPANTS", phonetic = "ókiupants")
            ),
            phrases = listOf(
                PhraseItem(es = "Salga del vehículo despacio.", en = "GET OUT OF THE VEHICLE SLOWLY.", phonetic = "guet aut ov de víikol slóuli"),
                PhraseItem(es = "Abra la puerta, por favor.", en = "OPEN THE DOOR, PLEASE.", phonetic = "óupen de dor, plis"),
                PhraseItem(es = "Salga ahora.", en = "STEP OUT NOW.", phonetic = "step aut nau"),
                PhraseItem(es = "Deje las llaves puestas.", en = "LEAVE THE KEYS IN THE IGNITION.", phonetic = "liv de kis in di igníshon"),
                PhraseItem(es = "¿Cuántas personas hay en el vehículo?", en = "HOW MANY PEOPLE ARE IN THE VEHICLE?", phonetic = "jau méni pípol ar in de víikol"),
                PhraseItem(es = "¿Hay algún otro ocupante?", en = "ARE THERE ANY OTHER OCCUPANTS?", phonetic = "ar der éni óder ókiupants")
            )
        ),
        Lesson(
            lessonId = 404,
            lessonTitle = "Permiso de conducir y documentación",
            vocabulary = listOf(
                VocabularyItem(es = "Mostrar / Enseñar", en = "SHOW", phonetic = "shou"),
                VocabularyItem(es = "Me / A mí", en = "ME", phonetic = "mi"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Permiso de conducir", en = "DRIVING LICENCE", phonetic = "dráiving láisens"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Actual / Vigente", en = "CURRENT", phonetic = "kárrent"),
                VocabularyItem(es = "Licencia / Permiso", en = "LICENCE", phonetic = "láisens"),
                VocabularyItem(es = "Haber / Tener (auxiliar)", en = "HAS", phonetic = "jas"),
                VocabularyItem(es = "Caducado", en = "EXPIRED", phonetic = "ikspáiad"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Matriculación / Documentación", en = "REGISTRATION", phonetic = "reyistréishon"),
                VocabularyItem(es = "Quién", en = "WHO", phonetic = "ju"),
                VocabularyItem(es = "Propietario", en = "OWNER", phonetic = "óuner"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Alquiler", en = "RENTAL", phonetic = "réntal"),
                VocabularyItem(es = "Coche", en = "CAR", phonetic = "car")
            ),
            phrases = listOf(
                PhraseItem(es = "Muéstreme su permiso de conducir, por favor.", en = "SHOW ME YOUR DRIVING LICENCE, PLEASE.", phonetic = "shou mi yor dráiving láisens, plis"),
                PhraseItem(es = "¿Es este su permiso vigente?", en = "IS THIS YOUR CURRENT LICENCE?", phonetic = "is dis yor kárrent láisens"),
                PhraseItem(es = "¿Ha caducado su permiso?", en = "HAS YOUR LICENCE EXPIRED?", phonetic = "jas yor láisens ikspáiad"),
                PhraseItem(es = "Muéstreme la documentación del vehículo.", en = "SHOW ME THE VEHICLE REGISTRATION.", phonetic = "shou mi de víikol reyistréishon"),
                PhraseItem(es = "¿Quién es el propietario de este vehículo?", en = "WHO IS THE OWNER OF THIS VEHICLE?", phonetic = "ju is di óuner ov dis víikol"),
                PhraseItem(es = "¿Es este un coche de alquiler?", en = "IS THIS A RENTAL CAR?", phonetic = "is dis a réntal car")
            )
        ),
        Lesson(
            lessonId = 405,
            lessonTitle = "Seguro y matrícula",
            vocabulary = listOf(
                VocabularyItem(es = "Mostrar", en = "SHOW", phonetic = "shou"),
                VocabularyItem(es = "Me", en = "ME", phonetic = "mi"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Seguro", en = "INSURANCE", phonetic = "inshúrans"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Asegurado", en = "INSURED", phonetic = "inshúrd"),
                VocabularyItem(es = "Haber (auxiliar)", en = "HAS", phonetic = "jas"),
                VocabularyItem(es = "Caducado", en = "EXPIRED", phonetic = "ikspáiad"),
                VocabularyItem(es = "Qué / Cuál", en = "WHAT", phonetic = "guat"),
                VocabularyItem(es = "Matrícula / Número de registro", en = "REGISTRATION NUMBER", phonetic = "reyistréishon námber"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Placa de matrícula", en = "NUMBER PLATE", phonetic = "námber pléit"),
                VocabularyItem(es = "No (auxiliar negativo)", en = "DOESN'T", phonetic = "dásent"),
                VocabularyItem(es = "Coincidir", en = "MATCH", phonetic = "match")
            ),
            phrases = listOf(
                PhraseItem(es = "Muéstreme su seguro, por favor.", en = "SHOW ME YOUR INSURANCE, PLEASE.", phonetic = "shou mi yor inshúrans, plis"),
                PhraseItem(es = "¿Está asegurado el vehículo?", en = "IS THE VEHICLE INSURED?", phonetic = "is de víikol inshúrd"),
                PhraseItem(es = "Su seguro ha caducado.", en = "YOUR INSURANCE HAS EXPIRED.", phonetic = "yor inshúrans jas ikspáiad"),
                PhraseItem(es = "¿Cuál es el número de matrícula?", en = "WHAT'S THE REGISTRATION NUMBER?", phonetic = "guats de reyistréishon námber"),
                PhraseItem(es = "Esta matrícula no coincide.", en = "THIS NUMBER PLATE DOESN'T MATCH.", phonetic = "dis námber pléit dásent match"),
                PhraseItem(es = "¿Es esta su matrícula?", en = "IS THIS YOUR NUMBER PLATE?", phonetic = "is dis yor námber pléit")
            )
        ),
        Lesson(
            lessonId = 406,
            lessonTitle = "Comprobaciones y cierre del control",
            vocabulary = listOf(
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Comprobar", en = "CHECK", phonetic = "chek"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Documentos", en = "DOCUMENTS", phonetic = "dókiuments"),
                VocabularyItem(es = "Esperar", en = "WAIT", phonetic = "güéit"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Mientras", en = "WHILE", phonetic = "guáil"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Solo / Solamente", en = "ONLY", phonetic = "óunli"),
                VocabularyItem(es = "Tomar / Llevar (tiempo)", en = "TAKE", phonetic = "téik"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Momento", en = "MOMENT", phonetic = "móument"),
                VocabularyItem(es = "Todo", en = "EVERYTHING", phonetic = "évrizing"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Orden", en = "ORDER", phonetic = "órder"),
                VocabularyItem(es = "Usted / Tú", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Poder (permiso)", en = "MAY", phonetic = "méi"),
                VocabularyItem(es = "Continuar", en = "CONTINUE", phonetic = "kontíniu"),
                VocabularyItem(es = "Gracias", en = "THANK YOU", phonetic = "zenk yu"),
                VocabularyItem(es = "Por", en = "FOR", phonetic = "for"),
                VocabularyItem(es = "Paciencia", en = "PATIENCE", phonetic = "péishens")
            ),
            phrases = listOf(
                PhraseItem(es = "Necesito comprobar sus documentos.", en = "I NEED TO CHECK YOUR DOCUMENTS.", phonetic = "ai nid tu chek yor dókiuments"),
                PhraseItem(es = "Espere aquí mientras lo compruebo.", en = "WAIT HERE WHILE I CHECK.", phonetic = "güéit jía guáil ai chek"),
                PhraseItem(es = "Esto solo tomará un momento.", en = "THIS WILL ONLY TAKE A MOMENT.", phonetic = "dis güil óunli téik a móument"),
                PhraseItem(es = "Todo está en orden.", en = "EVERYTHING IS IN ORDER.", phonetic = "évrizing is in órder"),
                PhraseItem(es = "Puede continuar.", en = "YOU MAY CONTINUE.", phonetic = "yu méi kontíniu"),
                PhraseItem(es = "Gracias por su paciencia.", en = "THANK YOU FOR YOUR PATIENCE.", phonetic = "zenk yu for yor péishens")
            )
        )
    )
)
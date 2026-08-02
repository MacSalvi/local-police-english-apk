package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module8 = Module(
    moduleId = 8,
    moduleName = "Módulo 8: Accidentes de tráfico",
    lessons = listOf(
        Lesson(
            lessonId = 801,
            lessonTitle = "Comprobar heridos y solicitar ambulancia",
            vocabulary = listOf(
                VocabularyItem(es = "Herido / Lesionado", en = "INJURED", phonetic = "ínyurd"),
                VocabularyItem(es = "Ambulancia", en = "AMBULANCE", phonetic = "ámbiulans"),
                VocabularyItem(es = "Accidente", en = "ACCIDENT", phonetic = "áksident"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Alguien / Cualquiera", en = "ANYONE", phonetic = "éniuan"),
                VocabularyItem(es = "No (auxiliar negativo)", en = "DON'T", phonetic = "dont"),
                VocabularyItem(es = "Mover", en = "MOVE", phonetic = "muv"),
                VocabularyItem(es = "Ayuda", en = "HELP", phonetic = "jelp"),
                VocabularyItem(es = "Viniendo", en = "COMING", phonetic = "cáming"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Dolor", en = "PAIN", phonetic = "péin"),
                VocabularyItem(es = "Yo soy / Estoy (I'm)", en = "I'M", phonetic = "aim"),
                VocabularyItem(es = "Llamando", en = "CALLING", phonetic = "cóling"),
                VocabularyItem(es = "Un / Una (ante vocal)", en = "AN", phonetic = "an"),
                VocabularyItem(es = "En / Sobre", en = "ON", phonetic = "on"),
                VocabularyItem(es = "Su / Sus (de ello)", en = "ITS", phonetic = "its"),
                VocabularyItem(es = "Camino / Ruta", en = "WAY", phonetic = "güéi"),
                VocabularyItem(es = "Permanecer / Quedarse", en = "STAY", phonetic = "stéi"),
                VocabularyItem(es = "Quieto / Inmóvil", en = "STILL", phonetic = "stil"),
                VocabularyItem(es = "Hasta que", en = "UNTIL", phonetic = "antíl"),
                VocabularyItem(es = "Llega", en = "ARRIVES", phonetic = "aráivs")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Hay algún herido?",
                    en = "IS ANYONE INJURED?",
                    phonetic = "is éniuan ínyurd"
                ),
                PhraseItem(
                    es = "No se mueva, la ayuda está en camino.",
                    en = "DON'T MOVE, HELP IS COMING.",
                    phonetic = "dont muv, jelp is cáming"
                ),
                PhraseItem(
                    es = "¿Siente dolor?",
                    en = "ARE YOU IN PAIN?",
                    phonetic = "ar yu in péin"
                ),
                PhraseItem(
                    es = "Voy a llamar a una ambulancia.",
                    en = "I'M CALLING AN AMBULANCE.",
                    phonetic = "aim cóling an ámbiulans"
                ),
                PhraseItem(
                    es = "Una ambulancia está en camino.",
                    en = "AN AMBULANCE IS ON ITS WAY.",
                    phonetic = "an ámbiulans is on its güéi"
                ),
                PhraseItem(
                    es = "Permanezca quieto hasta que llegue la ayuda.",
                    en = "STAY STILL UNTIL HELP ARRIVES.",
                    phonetic = "stéi stil antíl jelp aráivs"
                )
            )
        ),
        Lesson(
            lessonId = 802,
            lessonTitle = "Posición de vehículos, conductores y pasajeros",
            vocabulary = listOf(
                VocabularyItem(es = "Posición del vehículo", en = "VEHICLE POSITION", phonetic = "víikol posíshon"),
                VocabularyItem(es = "Conductor", en = "DRIVER", phonetic = "dráiver"),
                VocabularyItem(es = "Pasajero", en = "PASSENGER", phonetic = "pásenyer"),
                VocabularyItem(es = "No (auxiliar)", en = "DON'T", phonetic = "dont"),
                VocabularyItem(es = "Mover", en = "MOVE", phonetic = "muv"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Vehículos", en = "VEHICLES", phonetic = "víikols"),
                VocabularyItem(es = "Todavía / Aún", en = "YET", phonetic = "yet"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Pasado singular (ser/estar)", en = "WAS", phonetic = "was"),
                VocabularyItem(es = "Cada", en = "EACH", phonetic = "ich"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Posicionado", en = "POSITIONED", phonetic = "posíshond"),
                VocabularyItem(es = "Permanecer", en = "STAY", phonetic = "stéi"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Posición", en = "POSITION", phonetic = "posíshon"),
                VocabularyItem(es = "Quién", en = "WHO", phonetic = "ju"),
                VocabularyItem(es = "Conduciendo", en = "DRIVING", phonetic = "dráiving"),
                VocabularyItem(es = "Cuántos / Cuántas", en = "HOW MANY", phonetic = "jau méni"),
                VocabularyItem(es = "Pasajeros", en = "PASSENGERS", phonetic = "pásenyers"),
                VocabularyItem(es = "Pasado plural", en = "WERE", phonetic = "wör"),
                VocabularyItem(es = "Haber (existencial - hay)", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Todo el mundo / Todos", en = "EVERYONE", phonetic = "évriuan"),
                VocabularyItem(es = "Contabilizado / Localizado", en = "ACCOUNTED", phonetic = "akáunted"),
                VocabularyItem(es = "Por / Para", en = "FOR", phonetic = "for")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "No mueva los vehículos todavía.",
                    en = "DON'T MOVE THE VEHICLES YET.",
                    phonetic = "dont muv de víikols yet"
                ),
                PhraseItem(
                    es = "¿Dónde estaba posicionado cada vehículo?",
                    en = "WHERE WAS EACH VEHICLE POSITIONED?",
                    phonetic = "güer guas ich víikol posíshond"
                ),
                PhraseItem(
                    es = "Permanezca en esta posición.",
                    en = "STAY IN THIS POSITION.",
                    phonetic = "stéi in dis posíshon"
                ),
                PhraseItem(
                    es = "¿Quién conducía este vehículo?",
                    en = "WHO WAS DRIVING THIS VEHICLE?",
                    phonetic = "ju guas dráiving dis víikol"
                ),
                PhraseItem(
                    es = "¿Cuántos pasajeros había?",
                    en = "HOW MANY PASSENGERS WERE THERE?",
                    phonetic = "jau méni pásenyers wör der"
                ),
                PhraseItem(
                    es = "¿Están todos localizados?",
                    en = "IS EVERYONE ACCOUNTED FOR?",
                    phonetic = "is évriuan akáunted for"
                )
            )
        ),
        Lesson(
            lessonId = 803,
            lessonTitle = "Testigos y daños",
            vocabulary = listOf(
                VocabularyItem(es = "Testigo", en = "WITNESS", phonetic = "güítnes"),
                VocabularyItem(es = "Daño", en = "DAMAGE", phonetic = "dámich"),
                VocabularyItem(es = "Declaración", en = "STATEMENT", phonetic = "stéitment"),
                VocabularyItem(es = "Pasado (auxiliar)", en = "DID", phonetic = "did"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Ver", en = "SEE", phonetic = "si"),
                VocabularyItem(es = "Qué / Lo que", en = "WHAT", phonetic = "guat"),
                VocabularyItem(es = "Pasó / Sucedió", en = "HAPPENED", phonetic = "jápend"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Ser / Estar", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Dejar / Facilitar", en = "LEAVE", phonetic = "liv"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Contacto", en = "CONTACT", phonetic = "kóntakt"),
                VocabularyItem(es = "Detalles / Datos", en = "DETAILS", phonetic = "ditéils"),
                VocabularyItem(es = "Vamos a / Permítenos", en = "LET'S", phonetic = "lets"),
                VocabularyItem(es = "Evaluar", en = "ASSESS", phonetic = "asés"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Conducible / Transitable", en = "DRIVABLE", phonetic = "dráivabol"),
                VocabularyItem(es = "Tomar / Llevar", en = "TAKE", phonetic = "téik"),
                VocabularyItem(es = "Nota", en = "NOTE", phonetic = "nóut"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Todo / Todos", en = "ALL", phonetic = "ol")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Vio lo que pasó?",
                    en = "DID YOU SEE WHAT HAPPENED?",
                    phonetic = "did yu si guat jápend"
                ),
                PhraseItem(
                    es = "¿Puede ser testigo?",
                    en = "CAN YOU BE A WITNESS?",
                    phonetic = "can yu bi a güítnes"
                ),
                PhraseItem(
                    es = "Deje sus datos de contacto.",
                    en = "PLEASE LEAVE YOUR CONTACT DETAILS.",
                    phonetic = "plís liv yor kóntakt ditéils"
                ),
                PhraseItem(
                    es = "Vamos a evaluar los daños.",
                    en = "LET'S ASSESS THE DAMAGE.",
                    phonetic = "lets asés de dámich"
                ),
                PhraseItem(
                    es = "¿Es el vehículo conducible?",
                    en = "IS THE VEHICLE DRIVABLE?",
                    phonetic = "is de víikol dráivabol"
                ),
                PhraseItem(
                    es = "Anote todos los daños.",
                    en = "TAKE NOTE OF ALL DAMAGE.",
                    phonetic = "téik nóut ov ol dámich"
                )
            )
        ),
        Lesson(
            lessonId = 804,
            lessonTitle = "Seguro y parte amistoso",
            vocabulary = listOf(
                VocabularyItem(es = "Seguro", en = "INSURANCE", phonetic = "inshúrans"),
                VocabularyItem(es = "Parte amistoso", en = "ACCIDENT REPORT FORM", phonetic = "áksident ripórt form"),
                VocabularyItem(es = "Firmar", en = "SIGN", phonetic = "sáin"),
                VocabularyItem(es = "Mostrar / Enseñar", en = "SHOW", phonetic = "shou"),
                VocabularyItem(es = "Me / A mí", en = "ME", phonetic = "mi"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Detalles / Datos", en = "DETAILS", phonetic = "ditéils"),
                VocabularyItem(es = "Intercambiar", en = "EXCHANGE", phonetic = "ekschéinch"),
                VocabularyItem(es = "Información", en = "INFORMATION", phonetic = "informéishon"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Asegurado", en = "INSURED", phonetic = "inshúrd"),
                VocabularyItem(es = "Rellenar / Completar", en = "FILL OUT", phonetic = "fil aut"),
                VocabularyItem(es = "Accidente", en = "ACCIDENT", phonetic = "áksident"),
                VocabularyItem(es = "Informe / Parte", en = "REPORT", phonetic = "ripórt"),
                VocabularyItem(es = "Formulario", en = "FORM", phonetic = "form"),
                VocabularyItem(es = "Ambos / Los dos", en = "BOTH", phonetic = "bouz"),
                VocabularyItem(es = "Conductores", en = "DRIVERS", phonetic = "dráivers"),
                VocabularyItem(es = "Debe / Tener que", en = "MUST", phonetic = "mast"),
                VocabularyItem(es = "Mantener / Guardar", en = "KEEP", phonetic = "kip"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Copia", en = "COPY", phonetic = "kópi"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Muéstreme los datos de su seguro.",
                    en = "SHOW ME YOUR INSURANCE DETAILS.",
                    phonetic = "shou mi yor inshúrans ditéils"
                ),
                PhraseItem(
                    es = "Intercambien la información del seguro.",
                    en = "EXCHANGE INSURANCE INFORMATION.",
                    phonetic = "ekschéinch inshúrans informéishon"
                ),
                PhraseItem(
                    es = "¿Está asegurado el vehículo?",
                    en = "IS THE VEHICLE INSURED?",
                    phonetic = "is de víikol inshúrd"
                ),
                PhraseItem(
                    es = "Rellenen el parte amistoso.",
                    en = "FILL OUT THE ACCIDENT REPORT FORM.",
                    phonetic = "fil aut di áksident ripórt form"
                ),
                PhraseItem(
                    es = "Ambos conductores deben firmar.",
                    en = "BOTH DRIVERS MUST SIGN.",
                    phonetic = "bouz dráivers mast sáin"
                ),
                PhraseItem(
                    es = "Guarden una copia del parte.",
                    en = "KEEP A COPY OF THE REPORT.",
                    phonetic = "kip a kópi ov de ripórt"
                )
            )
        ),
        Lesson(
            lessonId = 805,
            lessonTitle = "Fotografías y corte de tráfico",
            vocabulary = listOf(
                VocabularyItem(es = "Fotografía", en = "PHOTOGRAPH", phonetic = "fóutograf"),
                VocabularyItem(es = "Corte de carretera", en = "ROAD CLOSURE", phonetic = "róud clóusher"),
                VocabularyItem(es = "Tráfico", en = "TRAFFIC", phonetic = "tráfik"),
                VocabularyItem(es = "Tomar / Hacer", en = "TAKE", phonetic = "téik"),
                VocabularyItem(es = "Fotos", en = "PHOTOS", phonetic = "fóutous"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Escena", en = "SCENE", phonetic = "sin"),
                VocabularyItem(es = "Fotografiar", en = "PHOTOGRAPH", phonetic = "fóutograf"),
                VocabularyItem(es = "Daño", en = "DAMAGE", phonetic = "dámich"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "En", en = "ON", phonetic = "on"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Móvil / Teléfono", en = "PHONE", phonetic = "fóun"),
                VocabularyItem(es = "Carretera / Camino", en = "ROAD", phonetic = "róud"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Temporalmente", en = "TEMPORARILY", phonetic = "témporerili"),
                VocabularyItem(es = "Cerrado", en = "CLOSED", phonetic = "clóusd"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Usar / Utilizar", en = "USE", phonetic = "iús"),
                VocabularyItem(es = "Alternativo", en = "ALTERNATIVE", phonetic = "altérnativ"),
                VocabularyItem(es = "Ruta", en = "ROUTE", phonetic = "rut"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar (pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Desviado", en = "DIVERTED", phonetic = "daivörted")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Haga fotos de la escena.",
                    en = "TAKE PHOTOS OF THE SCENE.",
                    phonetic = "téik fóutous ov de sin"
                ),
                PhraseItem(
                    es = "Fotografíe los daños.",
                    en = "PHOTOGRAPH THE DAMAGE.",
                    phonetic = "fóutograf de dámich"
                ),
                PhraseItem(
                    es = "¿Tiene fotos en su móvil?",
                    en = "DO YOU HAVE PHOTOS ON YOUR PHONE?",
                    phonetic = "du yu jav fóutous on yor fóun"
                ),
                PhraseItem(
                    es = "La carretera está cerrada temporalmente.",
                    en = "THE ROAD IS TEMPORARILY CLOSED.",
                    phonetic = "de róud is témporerili clóusd"
                ),
                PhraseItem(
                    es = "Utilice la ruta alternativa.",
                    en = "PLEASE USE THE ALTERNATIVE ROUTE.",
                    phonetic = "plís iús di altérnativ rut"
                ),
                PhraseItem(
                    es = "El tráfico será desviado.",
                    en = "TRAFFIC WILL BE DIVERTED.",
                    phonetic = "tráfik güil bi daivörted"
                )
            )
        ),
        Lesson(
            lessonId = 806,
            lessonTitle = "Grúa y hospital",
            vocabulary = listOf(
                VocabularyItem(es = "Grúa / Camión de remolque", en = "TOW TRUCK", phonetic = "tóu trak"),
                VocabularyItem(es = "Hospital", en = "HOSPITAL", phonetic = "jóspital"),
                VocabularyItem(es = "Lesión", en = "INJURY", phonetic = "ínyuri"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "En", en = "ON", phonetic = "on"),
                VocabularyItem(es = "Su (de ello)", en = "ITS", phonetic = "its"),
                VocabularyItem(es = "Camino / Ruta", en = "WAY", phonetic = "güéi"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Remolcado", en = "TOWED", phonetic = "tóud"),
                VocabularyItem(es = "Dónde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Debería", en = "SHOULD", phonetic = "shud"),
                VocabularyItem(es = "Tomar / Llevar", en = "TAKE", phonetic = "téik"),
                VocabularyItem(es = "Lo / El", en = "IT", phonetic = "it"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Ir", en = "GO", phonetic = "go"),
                VocabularyItem(es = "Cuál / Qué", en = "WHICH", phonetic = "güich"),
                VocabularyItem(es = "Llevado (participio)", en = "TAKEN", phonetic = "téiken"),
                VocabularyItem(es = "Alguien", en = "ANYONE", phonetic = "éniuan"),
                VocabularyItem(es = "Acompañando", en = "ACCOMPANYING", phonetic = "akámpaning")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Una grúa está en camino.",
                    en = "A TOW TRUCK IS ON ITS WAY.",
                    phonetic = "a tóu trak is on its güéi"
                ),
                PhraseItem(
                    es = "El vehículo será remolcado.",
                    en = "THE VEHICLE WILL BE TOWED.",
                    phonetic = "de víikol güil bi tóud"
                ),
                PhraseItem(
                    es = "¿Adónde debe llevarlo la grúa?",
                    en = "WHERE SHOULD THE TOW TRUCK TAKE IT?",
                    phonetic = "güer shud de tóu trak téik it"
                ),
                PhraseItem(
                    es = "Necesita ir al hospital.",
                    en = "YOU NEED TO GO TO HOSPITAL.",
                    phonetic = "yu nid tu gou tu jóspital"
                ),
                PhraseItem(
                    es = "¿A qué hospital le llevarán?",
                    en = "WHICH HOSPITAL WILL YOU BE TAKEN TO?",
                    phonetic = "güich jóspital güil yu bi téiken tu"
                ),
                PhraseItem(
                    es = "¿Le acompaña alguien?",
                    en = "IS ANYONE ACCOMPANYING YOU?",
                    phonetic = "is éniuan akámpaning yu"
                )
            )
        ),
        Lesson(
            lessonId = 807,
            lessonTitle = "Declaraciones y reconstrucción",
            vocabulary = listOf(
                VocabularyItem(es = "Declaración", en = "STATEMENT", phonetic = "stéitment"),
                VocabularyItem(es = "Reconstrucción", en = "RECONSTRUCTION", phonetic = "rikonstrákshon"),
                VocabularyItem(es = "Secuencia", en = "SEQUENCE", phonetic = "síkuens"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Hacer / Realizar", en = "MAKE", phonetic = "méik"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Describir", en = "DESCRIBE", phonetic = "diskráib"),
                VocabularyItem(es = "Qué / Lo que", en = "WHAT", phonetic = "guat"),
                VocabularyItem(es = "Pasó / Sucedió", en = "HAPPENED", phonetic = "jápend"),
                VocabularyItem(es = "Paso", en = "STEP", phonetic = "step"),
                VocabularyItem(es = "Por", en = "BY", phonetic = "bai"),
                VocabularyItem(es = "Firmar", en = "SIGN", phonetic = "sáin"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Cuál / Qué", en = "WHICH", phonetic = "güich"),
                VocabularyItem(es = "Vehículo", en = "VEHICLE", phonetic = "víikol"),
                VocabularyItem(es = "Llegó", en = "ARRIVED", phonetic = "aráivd"),
                VocabularyItem(es = "Primero", en = "FIRST", phonetic = "först"),
                VocabularyItem(es = "Pasado (ser/estar)", en = "WAS", phonetic = "was"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "da"),
                VocabularyItem(es = "De", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Hechos / Eventos", en = "EVENTS", phonetic = "ivénts"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ayudar", en = "HELP", phonetic = "jelp"),
                VocabularyItem(es = "Nosotros / Nos", en = "US", phonetic = "as"),
                VocabularyItem(es = "Reconstruir", en = "RECONSTRUCT", phonetic = "rikonstrákt")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Necesito que haga una declaración.",
                    en = "I NEED YOU TO MAKE A STATEMENT.",
                    phonetic = "ai nid yu tu méik a stéitment"
                ),
                PhraseItem(
                    es = "Describa lo ocurrido, paso a paso.",
                    en = "DESCRIBE WHAT HAPPENED, STEP BY STEP.",
                    phonetic = "diskráib guat jápend, step bai step"
                ),
                PhraseItem(
                    es = "Firme su declaración aquí.",
                    en = "SIGN YOUR STATEMENT HERE.",
                    phonetic = "sáin yor stéitment jía"
                ),
                PhraseItem(
                    es = "¿Qué vehículo llegó primero?",
                    en = "WHICH VEHICLE ARRIVED FIRST?",
                    phonetic = "güich víikol aráivd first"
                ),
                PhraseItem(
                    es = "¿Cuál fue la secuencia de los hechos?",
                    en = "WHAT WAS THE SEQUENCE OF EVENTS?",
                    phonetic = "guat guas de síkuens ov ivénts"
                ),
                PhraseItem(
                    es = "Esto ayudará a reconstruir el accidente.",
                    en = "THIS WILL HELP US RECONSTRUCT THE ACCIDENT.",
                    phonetic = "dis güil jelp as rikonstrákt di áksident"
                )
            )
        )
    )
)
package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module10 = Module(
    moduleId = 10,
    moduleName = "Módulo 10: Seguridad ciudadana",
    lessons = listOf(
        Lesson(
            lessonId = 1001,
            lessonTitle = "Alteraciones del orden y personas agresivas",
            vocabulary = listOf(
                VocabularyItem(es = "Alteración", en = "DISTURBANCE", phonetic = "distörbans"),
                VocabularyItem(es = "Agresivo", en = "AGGRESSIVE", phonetic = "agrésiv"),
                VocabularyItem(es = "Orden", en = "ORDER", phonetic = "órder"),
                VocabularyItem(es = "Haber (hay / ha habido)", en = "THERE'S / BEEN", phonetic = "ders / bin"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Calmarse", en = "CALM DOWN", phonetic = "carm daun"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Parar", en = "STOP", phonetic = "stap"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Paso / Retroceder", en = "STEP", phonetic = "step"),
                VocabularyItem(es = "Atrás", en = "BACK", phonetic = "bak"),
                VocabularyItem(es = "Siendo / Estándose", en = "BEING", phonetic = "bíing"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Tener que", en = "HAVE TO", phonetic = "jav tu"),
                VocabularyItem(es = "Reducir / Inmovilizar", en = "RESTRAIN", phonetic = "ristréin")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Ha habido una alteración del orden aquí.",
                    en = "THERE'S BEEN A DISTURBANCE HERE.",
                    phonetic = "ders bin a distörbans jía"
                ),
                PhraseItem(
                    es = "Por favor, cálmese.",
                    en = "PLEASE CALM DOWN.",
                    phonetic = "plís carm daun"
                ),
                PhraseItem(
                    es = "Necesito que pare ahora.",
                    en = "I NEED YOU TO STOP NOW.",
                    phonetic = "ai nid yu tu stap nau"
                ),
                PhraseItem(
                    es = "Retroceda, por favor.",
                    en = "STEP BACK, PLEASE.",
                    phonetic = "step bak, plis"
                ),
                PhraseItem(
                    es = "Deje de mostrarse agresivo.",
                    en = "STOP BEING AGGRESSIVE.",
                    phonetic = "stap bíing agrésiv"
                ),
                PhraseItem(
                    es = "Tendré que reducirle.",
                    en = "I WILL HAVE TO RESTRAIN YOU.",
                    phonetic = "ai güil jav tu ristréin yu"
                )
            )
        ),
        Lesson(
            lessonId = 1002,
            lessonTitle = "Peleas y amenazas",
            vocabulary = listOf(
                VocabularyItem(es = "Pelea", en = "FIGHT", phonetic = "fáit"),
                VocabularyItem(es = "Amenaza", en = "THREAT", phonetic = "zret"),
                VocabularyItem(es = "Separar", en = "SEPARATE", phonetic = "séparet"),
                VocabularyItem(es = "Parar", en = "STOP", phonetic = "stap"),
                VocabularyItem(es = "Luchando / Peleando", en = "FIGHTING", phonetic = "fáiting"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Desde / De", en = "FROM", phonetic = "from"),
                VocabularyItem(es = "Cada", en = "EACH", phonetic = "each"),
                VocabularyItem(es = "Otro", en = "OTHER", phonetic = "óder"),
                VocabularyItem(es = "Quién", en = "WHO", phonetic = "who"),
                VocabularyItem(es = "Empezado / Iniciado", en = "STARTED", phonetic = "stárted"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Pasado (auxiliar)", en = "DID", phonetic = "did"),
                VocabularyItem(es = "Alguien", en = "SOMEONE", phonetic = "sámuan"),
                VocabularyItem(es = "Amenazar", en = "THREATEN", phonetic = "zréten"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Haciendo", en = "MAKING", phonetic = "méiking"),
                VocabularyItem(es = "Amenazas", en = "THREATS", phonetic = "zrets"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Delito / Crimen", en = "CRIME", phonetic = "cráim"),
                VocabularyItem(es = "Hacer (auxiliar negativo)", en = "DO NOT", phonetic = "du not"),
                VocabularyItem(es = "Nadie / Alguien", en = "ANYONE", phonetic = "éniuan")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Dejen de pelear ahora.",
                    en = "STOP FIGHTING NOW.",
                    phonetic = "stap fáiting nau"
                ),
                PhraseItem(
                    es = "Sepárense el uno del otro.",
                    en = "SEPARATE FROM EACH OTHER.",
                    phonetic = "séparet from ich óder"
                ),
                PhraseItem(
                    es = "¿Quién empezó la pelea?",
                    en = "WHO STARTED THE FIGHT?",
                    phonetic = "ju stárted de fáit"
                ),
                PhraseItem(
                    es = "¿Le amenazó alguien?",
                    en = "DID SOMEONE THREATEN YOU?",
                    phonetic = "did sámuan zréten yu"
                ),
                PhraseItem(
                    es = "Amenazar es un delito.",
                    en = "MAKING THREATS IS A CRIME.",
                    phonetic = "méiking zrets is a cráim"
                ),
                PhraseItem(
                    es = "No amenace a nadie.",
                    en = "DO NOT THREATEN ANYONE.",
                    phonetic = "du not zréten éniuan"
                )
            )
        ),
        Lesson(
            lessonId = 1003,
            lessonTitle = "Daños y ruidos",
            vocabulary = listOf(
                VocabularyItem(es = "Daño", en = "DAMAGE", phonetic = "dámich"),
                VocabularyItem(es = "Ruido", en = "NOISE", phonetic = "nóis"),
                VocabularyItem(es = "Queja", en = "COMPLAINT", phonetic = "kompléint"),
                VocabularyItem(es = "Quién", en = "WHO", phonetic = "who"),
                VocabularyItem(es = "Causado", en = "CAUSED", phonetic = "cózd"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Criminal", en = "CRIMINAL", phonetic = "críminal"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Tomar", en = "TAKE", phonetic = "téik"),
                VocabularyItem(es = "Nota", en = "NOTE", phonetic = "nóut"),
                VocabularyItem(es = "De (posesión/origen)", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Nosotros hemos (We have)", en = "WE'VE", phonetic = "güiv"),
                VocabularyItem(es = "Recibido", en = "RECEIVED", phonetic = "risívd"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Bajar / Reducir", en = "LOWER", phonetic = "lóuer"),
                VocabularyItem(es = "Volumen", en = "VOLUME", phonetic = "vólium"),
                VocabularyItem(es = "Debe / Tener que", en = "MUST", phonetic = "mast"),
                VocabularyItem(es = "Parar", en = "STOP", phonetic = "stap"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Quién causó estos daños?",
                    en = "WHO CAUSED THIS DAMAGE?",
                    phonetic = "ju cózd dis dámich"
                ),
                PhraseItem(
                    es = "Esto es un delito de daños.",
                    en = "THIS IS CRIMINAL DAMAGE.",
                    phonetic = "dis is críminal dámich"
                ),
                PhraseItem(
                    es = "Necesito tomar nota de los daños.",
                    en = "I NEED TO TAKE NOTE OF THE DAMAGE.",
                    phonetic = "ai nid tu téik nóut ov de dámich"
                ),
                PhraseItem(
                    es = "Hemos recibido una queja por ruido.",
                    en = "WE'VE RECEIVED A NOISE COMPLAINT.",
                    phonetic = "güiv risívd a nóis kompléint"
                ),
                PhraseItem(
                    es = "Por favor, baje el volumen.",
                    en = "PLEASE LOWER THE VOLUME.",
                    phonetic = "plís lóuer de vólium"
                ),
                PhraseItem(
                    es = "Este ruido debe parar ahora.",
                    en = "THIS NOISE MUST STOP NOW.",
                    phonetic = "dis nóis mast stap nau"
                )
            )
        ),
        Lesson(
            lessonId = 1004,
            lessonTitle = "Alcohol en vía pública y grupos conflictivos",
            vocabulary = listOf(
                VocabularyItem(es = "Alcohol", en = "ALCOHOL", phonetic = "álcojol"),
                VocabularyItem(es = "Espacio público", en = "PUBLIC SPACE", phonetic = "páblik spéis"),
                VocabularyItem(es = "Grupo", en = "GROUP", phonetic = "grup"),
                VocabularyItem(es = "Bebiendo", en = "DRINKING", phonetic = "drínking"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Prohibido", en = "PROHIBITED", phonetic = "prójibited"),
                VocabularyItem(es = "Verter / Echar", en = "POUR", phonetic = "por"),
                VocabularyItem(es = "Fuera / Afuera", en = "OUT", phonetic = "aut"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "di"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Público", en = "PUBLIC", phonetic = "páblik"),
                VocabularyItem(es = "Espacio / Plaza", en = "SPACE", phonetic = "spéis"),
                VocabularyItem(es = "Debe / Tener que", en = "MUST", phonetic = "mast"),
                VocabularyItem(es = "Dispersarse", en = "DISPERSE", phonetic = "dispörs"),
                VocabularyItem(es = "Mover / Circular", en = "MOVE", phonetic = "muv"),
                VocabularyItem(es = "Adelante / A lo largo", en = "ALONG", phonetic = "alóng"),
                VocabularyItem(es = "Permanecer / Quedarse", en = "STAY", phonetic = "stéi"),
                VocabularyItem(es = "Lejos / Fuera", en = "AWAY", phonetic = "aguéi"),
                VocabularyItem(es = "De", en = "FROM", phonetic = "from"),
                VocabularyItem(es = "Cada", en = "EACH", phonetic = "each"),
                VocabularyItem(es = "Otro", en = "OTHER", phonetic = "óder")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Beber alcohol aquí está prohibido.",
                    en = "DRINKING ALCOHOL HERE IS PROHIBITED.",
                    phonetic = "drínking álcojol jía is prójibited"
                ),
                PhraseItem(
                    es = "Vierta el alcohol, por favor.",
                    en = "POUR OUT THE ALCOHOL, PLEASE.",
                    phonetic = "por aut di álcojol, plis"
                ),
                PhraseItem(
                    es = "Este es un espacio público.",
                    en = "THIS IS A PUBLIC SPACE.",
                    phonetic = "dis is a páblik spéis"
                ),
                PhraseItem(
                    es = "Este grupo debe dispersarse.",
                    en = "THIS GROUP MUST DISPERSE.",
                    phonetic = "dis grup mast dispörs"
                ),
                PhraseItem(
                    es = "Circulen, por favor.",
                    en = "MOVE ALONG, PLEASE.",
                    phonetic = "muv alóng, plis"
                ),
                PhraseItem(
                    es = "Manténganse alejados unos de otros.",
                    en = "STAY AWAY FROM EACH OTHER.",
                    phonetic = "stéi aguéi from ich óder"
                )
            )
        ),
        Lesson(
            lessonId = 1005,
            lessonTitle = "Identificación y separación de implicados",
            vocabulary = listOf(
                VocabularyItem(es = "Implicado", en = "INVOLVED", phonetic = "involvd"),
                VocabularyItem(es = "Identificación", en = "IDENTIFICATION", phonetic = "aidentifikéishon"),
                VocabularyItem(es = "Separado", en = "APART", phonetic = "apárt"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Identificar", en = "IDENTIFY", phonetic = "aidéntifai"),
                VocabularyItem(es = "Todo el mundo / Todos", en = "EVERYONE", phonetic = "évriuan"),
                VocabularyItem(es = "Mostrar", en = "SHOW", phonetic = "shou"),
                VocabularyItem(es = "Me", en = "ME", phonetic = "mi"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Identificación / DNI", en = "ID", phonetic = "aidí"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Pasado plural (ser/estar)", en = "WERE", phonetic = "wör"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Incidente", en = "INCIDENT", phonetic = "ínsident"),
                VocabularyItem(es = "Estar de pie / Colocarse", en = "STAND", phonetic = "stand"),
                VocabularyItem(es = "Por / Sobre", en = "OVER", phonetic = "óuver"),
                VocabularyItem(es = "Allí", en = "THERE", phonetic = "der"),
                VocabularyItem(es = "Mantener", en = "KEEP", phonetic = "kip"),
                VocabularyItem(es = "Separado / Aparte", en = "APART", phonetic = "apárt"),
                VocabularyItem(es = "De", en = "FROM", phonetic = "from"),
                VocabularyItem(es = "Cada", en = "EACH", phonetic = "each"),
                VocabularyItem(es = "Otro", en = "OTHER", phonetic = "óder"),
                VocabularyItem(es = "Hacer (auxiliar negativo)", en = "DO NOT", phonetic = "du not"),
                VocabularyItem(es = "Acercarse", en = "APPROACH", phonetic = "aprróuch")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Necesito identificar a todos los implicados.",
                    en = "I NEED TO IDENTIFY EVERYONE INVOLVED.",
                    phonetic = "ai nid tu aidéntifai évriuan involvd"
                ),
                PhraseItem(
                    es = "Muéstreme su identificación.",
                    en = "SHOW ME YOUR ID, PLEASE.",
                    phonetic = "shou mi yor aidí, plis"
                ),
                PhraseItem(
                    es = "¿Estuvo implicado en este incidente?",
                    en = "WERE YOU INVOLVED IN THIS INCIDENT?",
                    phonetic = "wör yu involvd in dis ínsident"
                ),
                PhraseItem(
                    es = "Colóquese allí, por favor.",
                    en = "STAND OVER THERE, PLEASE.",
                    phonetic = "stand óuver der, plis"
                ),
                PhraseItem(
                    es = "Manténganse separados.",
                    en = "KEEP APART FROM EACH OTHER.",
                    phonetic = "kip apárt from ich óder"
                ),
                PhraseItem(
                    es = "No se acerquen entre ustedes.",
                    en = "DO NOT APPROACH EACH OTHER.",
                    phonetic = "du not aprróuch ich óder"
                )
            )
        ),
        Lesson(
            lessonId = 1006,
            lessonTitle = "Solicitud de refuerzos y cierre",
            vocabulary = listOf(
                VocabularyItem(es = "Refuerzos", en = "BACKUP", phonetic = "bákap"),
                VocabularyItem(es = "Unidades adicionales", en = "REINFORCEMENTS", phonetic = "rienfórsments"),
                VocabularyItem(es = "Calma", en = "CALM", phonetic = "carm"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "Aquí", en = "HERE", phonetic = "jía"),
                VocabularyItem(es = "Enviar", en = "SEND", phonetic = "send"),
                VocabularyItem(es = "Adicional", en = "ADDITIONAL", phonetic = "adíshonal"),
                VocabularyItem(es = "Unidades", en = "UNITS", phonetic = "iúnits"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "En / Sobre", en = "ON", phonetic = "on"),
                VocabularyItem(es = "Su (de ello)", en = "ITS", phonetic = "its"),
                VocabularyItem(es = "Camino / Ruta", en = "WAY", phonetic = "güéi"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Situación", en = "SITUATION", phonetic = "sichuéishon"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Bajo", en = "UNDER", phonetic = "ánder"),
                VocabularyItem(es = "Control", en = "CONTROL", phonetic = "kontróul"),
                VocabularyItem(es = "Todo el mundo / Todos", en = "EVERYONE", phonetic = "évriuan"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Ir", en = "GO", phonetic = "go"),
                VocabularyItem(es = "Casa", en = "HOME", phonetic = "jóum"),
                VocabularyItem(es = "Gracias", en = "THANK YOU", phonetic = "zenk yu"),
                VocabularyItem(es = "Por", en = "FOR", phonetic = "for"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Cooperación", en = "COOPERATION", phonetic = "kouoperéishon")
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Necesito refuerzos aquí.",
                    en = "I NEED BACKUP HERE.",
                    phonetic = "ai nid bákap jía"
                ),
                PhraseItem(
                    es = "Envíen unidades adicionales.",
                    en = "SEND ADDITIONAL UNITS.",
                    phonetic = "send adíshonal iúnits"
                ),
                PhraseItem(
                    es = "Los refuerzos están en camino.",
                    en = "BACKUP IS ON ITS WAY.",
                    phonetic = "bákap is on its güéi"
                ),
                PhraseItem(
                    es = "La situación está bajo control.",
                    en = "THE SITUATION IS NOW UNDER CONTROL.",
                    phonetic = "de sichuéishon is nau ánder kontróul"
                ),
                PhraseItem(
                    es = "Todos pueden irse a casa ahora.",
                    en = "EVERYONE CAN GO HOME NOW.",
                    phonetic = "évriuan can gou jóum nau"
                ),
                PhraseItem(
                    es = "Gracias por su cooperación.",
                    en = "THANK YOU FOR YOUR COOPERATION.",
                    phonetic = "zenk yu for yor kouoperéishon"
                )
            )
        )
    )
)
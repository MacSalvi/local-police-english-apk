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
                VocabularyItem(
                    es = "Alteración",
                    en = "DISTURBANCE",
                    phonetic = "distörbans"
                ),
                VocabularyItem(
                    es = "Agresivo",
                    en = "AGGRESSIVE",
                    phonetic = "agrésiv"
                ),
                VocabularyItem(
                    es = "Orden",
                    en = "ORDER",
                    phonetic = "órder"
                )
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
                VocabularyItem(
                    es = "Pelea",
                    en = "FIGHT",
                    phonetic = "fáit"
                ),
                VocabularyItem(
                    es = "Amenaza",
                    en = "THREAT",
                    phonetic = "zret"
                ),
                VocabularyItem(
                    es = "Separar",
                    en = "SEPARATE",
                    phonetic = "séparet"
                )
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
                VocabularyItem(
                    es = "Daño",
                    en = "DAMAGE",
                    phonetic = "dámich"
                ),
                VocabularyItem(
                    es = "Ruido",
                    en = "NOISE",
                    phonetic = "nóis"
                ),
                VocabularyItem(
                    es = "Queja",
                    en = "COMPLAINT",
                    phonetic = "kompléint"
                )
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
                VocabularyItem(
                    es = "Alcohol",
                    en = "ALCOHOL",
                    phonetic = "álcojol"
                ),
                VocabularyItem(
                    es = "Espacio público",
                    en = "PUBLIC SPACE",
                    phonetic = "páblik spéis"
                ),
                VocabularyItem(
                    es = "Grupo",
                    en = "GROUP",
                    phonetic = "grup"
                )
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
                VocabularyItem(
                    es = "Implicado",
                    en = "INVOLVED",
                    phonetic = "involvd"
                ),
                VocabularyItem(
                    es = "Identificación",
                    en = "IDENTIFICATION",
                    phonetic = "aidentifikéishon"
                ),
                VocabularyItem(
                    es = "Separado",
                    en = "APART",
                    phonetic = "apárt"
                )
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
                VocabularyItem(
                    es = "Refuerzos",
                    en = "BACKUP",
                    phonetic = "bákap"
                ),
                VocabularyItem(
                    es = "Unidades adicionales",
                    en = "REINFORCEMENTS",
                    phonetic = "rienfórsments"
                ),
                VocabularyItem(
                    es = "Calma",
                    en = "CALM",
                    phonetic = "carm"
                )
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
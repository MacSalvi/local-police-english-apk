package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module11 = Module(
    moduleId = 11,
    moduleName = "Módulo 11: Cacheo, objetos peligrosos y armas",
    lessons = listOf(
        Lesson(
            lessonId = 1101,
            lessonTitle = "Explicación del cacheo",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Cacheo",
                    en = "SEARCH",
                    phonetic = "sörch"
                ),
                VocabularyItem(
                    es = "Registro",
                    en = "PAT-DOWN",
                    phonetic = "pat-daun"
                ),
                VocabularyItem(
                    es = "Bolsillo",
                    en = "POCKET",
                    phonetic = "póket"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Necesito cachearle.",
                    en = "I NEED TO SEARCH YOU.",
                    phonetic = "ai nid tu sörch yu"
                ),
                PhraseItem(
                    es = "Es un cacheo rutinario.",
                    en = "THIS IS A ROUTINE SEARCH.",
                    phonetic = "dis is a rutín sörch"
                ),
                PhraseItem(
                    es = "Voy a realizarle un registro superficial.",
                    en = "I'M GOING TO PAT YOU DOWN.",
                    phonetic = "aim góing tu pat yu daun"
                ),
                PhraseItem(
                    es = "Vacíe los bolsillos, por favor.",
                    en = "EMPTY YOUR POCKETS, PLEASE.",
                    phonetic = "émpti yor pókets, plis"
                ),
                PhraseItem(
                    es = "Coloque todo sobre la mesa.",
                    en = "PLACE EVERYTHING ON THE TABLE.",
                    phonetic = "pléis évrizing on de téibol"
                ),
                PhraseItem(
                    es = "¿Consiente este registro?",
                    en = "DO YOU CONSENT TO THIS SEARCH?",
                    phonetic = "du yu konsént tu dis sörch"
                )
            )
        ),
        Lesson(
            lessonId = 1102,
            lessonTitle = "Posición de manos y objetos personales",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Manos",
                    en = "HANDS",
                    phonetic = "jands"
                ),
                VocabularyItem(
                    es = "Mochila",
                    en = "BACKPACK",
                    phonetic = "bákpak"
                ),
                VocabularyItem(
                    es = "Bolso",
                    en = "BAG",
                    phonetic = "bag"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Ponga las manos en la cabeza.",
                    en = "PUT YOUR HANDS ON YOUR HEAD.",
                    phonetic = "put yor jands on yor jed"
                ),
                PhraseItem(
                    es = "Separe las piernas, por favor.",
                    en = "SPREAD YOUR LEGS, PLEASE.",
                    phonetic = "spred yor legs, plis"
                ),
                PhraseItem(
                    es = "Mantenga las manos donde pueda verlas.",
                    en = "KEEP YOUR HANDS WHERE I CAN SEE THEM.",
                    phonetic = "kip yor jands güer ai can si dem"
                ),
                PhraseItem(
                    es = "Abra su mochila, por favor.",
                    en = "OPEN YOUR BACKPACK, PLEASE.",
                    phonetic = "óupen yor bákpak, plis"
                ),
                PhraseItem(
                    es = "¿Es este bolso suyo?",
                    en = "IS THIS BAG YOURS?",
                    phonetic = "is dis bag yors"
                ),
                PhraseItem(
                    es = "¿Qué hay dentro de este bolso?",
                    en = "WHAT'S INSIDE THIS BAG?",
                    phonetic = "guats insáid dis bag"
                )
            )
        ),
        Lesson(
            lessonId = 1103,
            lessonTitle = "Cuchillos y armas blancas",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Cuchillo",
                    en = "KNIFE",
                    phonetic = "náif"
                ),
                VocabularyItem(
                    es = "Arma blanca",
                    en = "BLADE",
                    phonetic = "bléid"
                ),
                VocabularyItem(
                    es = "Peligroso",
                    en = "DANGEROUS",
                    phonetic = "déinllerous"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Lleva un cuchillo encima?",
                    en = "ARE YOU CARRYING A KNIFE?",
                    phonetic = "ar yu kárring a náif"
                ),
                PhraseItem(
                    es = "Llevar un cuchillo en público es ilegal.",
                    en = "CARRYING A KNIFE IN PUBLIC IS ILLEGAL.",
                    phonetic = "kárring a náif in páblik is ilígal"
                ),
                PhraseItem(
                    es = "Voy a incautar esto.",
                    en = "I'M GOING TO CONFISCATE THIS.",
                    phonetic = "aim góing tu kónfiskeit dis"
                ),
                PhraseItem(
                    es = "¿Es esta arma blanca suya?",
                    en = "IS THIS BLADE YOURS?",
                    phonetic = "is dis bléid yors"
                ),
                PhraseItem(
                    es = "¿Por qué lleva esto?",
                    en = "WHY ARE YOU CARRYING THIS?",
                    phonetic = "güai ar yu kárring dis"
                ),
                PhraseItem(
                    es = "Este es un objeto peligroso.",
                    en = "THIS IS A DANGEROUS OBJECT.",
                    phonetic = "dis is a déinllerous óbllekt"
                )
            )
        ),
        Lesson(
            lessonId = 1104,
            lessonTitle = "Armas de fuego y munición",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Arma de fuego",
                    en = "FIREARM",
                    phonetic = "fáiarm"
                ),
                VocabularyItem(
                    es = "Munición",
                    en = "AMMUNITION",
                    phonetic = "amiunishón"
                ),
                VocabularyItem(
                    es = "Licencia",
                    en = "LICENCE",
                    phonetic = "láisens"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Tiene en su poder un arma de fuego?",
                    en = "ARE YOU IN POSSESSION OF A FIREARM?",
                    phonetic = "ar yu in posésion ov a fáiarm"
                ),
                PhraseItem(
                    es = "¿Tiene licencia para esta arma?",
                    en = "DO YOU HAVE A LICENCE FOR THIS WEAPON?",
                    phonetic = "du yu jav a láisens for dis güépon"
                ),
                PhraseItem(
                    es = "¿Está cargada esta arma?",
                    en = "IS THIS FIREARM LOADED?",
                    phonetic = "is dis fáiarm lóuded"
                ),
                PhraseItem(
                    es = "Entregue el arma despacio.",
                    en = "HAND OVER THE WEAPON SLOWLY.",
                    phonetic = "jand óuver de güépon slóuli"
                ),
                PhraseItem(
                    es = "¿Es esta munición suya?",
                    en = "IS THIS AMMUNITION YOURS?",
                    phonetic = "is dis amiunishón yors"
                ),
                PhraseItem(
                    es = "Esta arma será incautada.",
                    en = "THIS WEAPON WILL BE SEIZED.",
                    phonetic = "dis güépon güil bi sízd"
                )
            )
        ),
        Lesson(
            lessonId = 1105,
            lessonTitle = "Réplicas, herramientas peligrosas y objetos contundentes",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Réplica",
                    en = "REPLICA",
                    phonetic = "réplika"
                ),
                VocabularyItem(
                    es = "Herramienta",
                    en = "TOOL",
                    phonetic = "tul"
                ),
                VocabularyItem(
                    es = "Objeto contundente",
                    en = "BLUNT OBJECT",
                    phonetic = "blant óbllekt"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Es esta un arma real o una réplica?",
                    en = "IS THIS A REAL WEAPON OR A REPLICA?",
                    phonetic = "is dis a ríal güépon or a réplika"
                ),
                PhraseItem(
                    es = "Las réplicas también pueden ser incautadas.",
                    en = "REPLICAS CAN ALSO BE CONFISCATED.",
                    phonetic = "réplikas can ólsou bi kónfiskeited"
                ),
                PhraseItem(
                    es = "¿Por qué lleva esta herramienta?",
                    en = "WHY ARE YOU CARRYING THIS TOOL?",
                    phonetic = "güai ar yu kárring dis tul"
                ),
                PhraseItem(
                    es = "Esta herramienta podría usarse como arma.",
                    en = "THIS TOOL COULD BE USED AS A WEAPON.",
                    phonetic = "dis tul kud bi iúsd as a güépon"
                ),
                PhraseItem(
                    es = "¿Es este objeto suyo?",
                    en = "IS THIS OBJECT YOURS?",
                    phonetic = "is dis óbllekt yors"
                ),
                PhraseItem(
                    es = "Estoy incautando este objeto contundente.",
                    en = "I'M CONFISCATING THIS BLUNT OBJECT.",
                    phonetic = "aim kónfiskeiting dis blant óbllekt"
                )
            )
        ),
        Lesson(
            lessonId = 1106,
            lessonTitle = "Entrega segura e incautación",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Entregar",
                    en = "HAND OVER",
                    phonetic = "jand óuver"
                ),
                VocabularyItem(
                    es = "Incautar",
                    en = "SEIZE",
                    phonetic = "siz"
                ),
                VocabularyItem(
                    es = "Efectos intervenidos",
                    en = "SEIZED ITEMS",
                    phonetic = "sízd áitems"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Entréguelo despacio, por favor.",
                    en = "HAND IT OVER SLOWLY, PLEASE.",
                    phonetic = "jand it óuver slóuli, plis"
                ),
                PhraseItem(
                    es = "Colóquelo en el suelo.",
                    en = "PLACE IT ON THE GROUND.",
                    phonetic = "pléis it on de gráund"
                ),
                PhraseItem(
                    es = "Este objeto será incautado.",
                    en = "THIS ITEM WILL BE SEIZED.",
                    phonetic = "dis áitem güil bi sízd"
                ),
                PhraseItem(
                    es = "Recibirá un justificante por esto.",
                    en = "YOU WILL RECEIVE A RECEIPT FOR THIS.",
                    phonetic = "yu güil risív a risít for dis"
                ),
                PhraseItem(
                    es = "Podrá reclamarlo más tarde en comisaría.",
                    en = "YOU CAN CLAIM IT LATER AT THE STATION.",
                    phonetic = "yu can cléim it léiter at de stéishon"
                ),
                PhraseItem(
                    es = "Esto ahora es una prueba.",
                    en = "THIS IS NOW EVIDENCE.",
                    phonetic = "dis is nau évidens"
                )
            )
        )
    )
)
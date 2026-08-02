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
                VocabularyItem(es = "Cacheo / Buscar", en = "SEARCH", phonetic = "sörch"),
                VocabularyItem(es = "Registro superficial", en = "PAT-DOWN", phonetic = "pat-daun"),
                VocabularyItem(es = "Bolsillo", en = "POCKET", phonetic = "póket"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Necesitar", en = "NEED", phonetic = "nid"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Rutinario", en = "ROUTINE", phonetic = "rutín"),
                VocabularyItem(es = "Yo soy / Estoy (I'm)", en = "I'M", phonetic = "aim"),
                VocabularyItem(es = "Yendo / Ir", en = "GOING", phonetic = "góing"),
                VocabularyItem(es = "Dar palmadas / Registrar", en = "PAT", phonetic = "pat"),
                VocabularyItem(es = "Abajo", en = "DOWN", phonetic = "daun"),
                VocabularyItem(es = "Vaciar", en = "EMPTY", phonetic = "émpti"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "Bolsillos", en = "POCKETS", phonetic = "pókets"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Colocar / Poner", en = "PLACE", phonetic = "pléis"),
                VocabularyItem(es = "Todo", en = "EVERYTHING", phonetic = "évrizing"),
                VocabularyItem(es = "En / Sobre", en = "ON", phonetic = "on"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Mesa", en = "TABLE", phonetic = "téibol"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Consentir", en = "CONSENT", phonetic = "konsént")
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
                VocabularyItem(es = "Manos", en = "HANDS", phonetic = "jands"),
                VocabularyItem(es = "Mochila", en = "BACKPACK", phonetic = "bákpak"),
                VocabularyItem(es = "Bolso / Bolsa", en = "BAG", phonetic = "bag"),
                VocabularyItem(es = "Poner", en = "PUT", phonetic = "put"),
                VocabularyItem(es = "Tu / Su", en = "YOUR", phonetic = "yor"),
                VocabularyItem(es = "En / Sobre", en = "ON", phonetic = "on"),
                VocabularyItem(es = "Cabeza", en = "HEAD", phonetic = "jed"),
                VocabularyItem(es = "Separar / Extender", en = "SPREAD", phonetic = "spred"),
                VocabularyItem(es = "Piernas", en = "LEGS", phonetic = "legs"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Mantener / Guardar", en = "KEEP", phonetic = "kip"),
                VocabularyItem(es = "Donde", en = "WHERE", phonetic = "güer"),
                VocabularyItem(es = "Yo", en = "I", phonetic = "ai"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Ver", en = "SEE", phonetic = "si"),
                VocabularyItem(es = "Ellos / Las / Los", en = "THEM", phonetic = "dem"),
                VocabularyItem(es = "Abrir", en = "OPEN", phonetic = "óupen"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Tuyo / Suya", en = "YOURS", phonetic = "yors"),
                VocabularyItem(es = "Qué es / Cuál es", en = "WHAT'S", phonetic = "guats"),
                VocabularyItem(es = "Dentro", en = "INSIDE", phonetic = "insáid")
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
                VocabularyItem(es = "Cuchillo", en = "KNIFE", phonetic = "náif"),
                VocabularyItem(es = "Arma blanca / Hoja", en = "BLADE", phonetic = "bléid"),
                VocabularyItem(es = "Peligroso", en = "DANGEROUS", phonetic = "déinllerous"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Llevando / Transportando", en = "CARRYING", phonetic = "kárring"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Público", en = "PUBLIC", phonetic = "páblik"),
                VocabularyItem(es = "Ilegal", en = "ILLEGAL", phonetic = "ilígal"),
                VocabularyItem(es = "Yo soy / Estoy (I'm)", en = "I'M", phonetic = "aim"),
                VocabularyItem(es = "Yendo / Ir", en = "GOING", phonetic = "góing"),
                VocabularyItem(es = "A (infinitivo)", en = "TO", phonetic = "tu"),
                VocabularyItem(es = "Incautar / Confiscar", en = "CONFISCATE", phonetic = "kónfiskeit"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Tuyo / Suya", en = "YOURS", phonetic = "yors"),
                VocabularyItem(es = "Por qué", en = "WHY", phonetic = "güai"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Objeto", en = "OBJECT", phonetic = "óbllekt")
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
                VocabularyItem(es = "Arma de fuego", en = "FIREARM", phonetic = "fáiarm"),
                VocabularyItem(es = "Munición", en = "AMMUNITION", phonetic = "amiunishón"),
                VocabularyItem(es = "Licencia", en = "LICENCE", phonetic = "láisens"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "En", en = "IN", phonetic = "in"),
                VocabularyItem(es = "Posesión", en = "POSSESSION", phonetic = "posésion"),
                VocabularyItem(es = "De (posesión/origen)", en = "OF", phonetic = "ov"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Hacer (auxiliar interrogativo)", en = "DO", phonetic = "du"),
                VocabularyItem(es = "Tener", en = "HAVE", phonetic = "jav"),
                VocabularyItem(es = "Para / Por", en = "FOR", phonetic = "for"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Arma", en = "WEAPON", phonetic = "güépon"),
                VocabularyItem(es = "Cargado", en = "LOADED", phonetic = "lóuded"),
                VocabularyItem(es = "Entregar / Pasar", en = "HAND OVER", phonetic = "jand óuver"),
                VocabularyItem(es = "Despacio / Lentamente", en = "SLOWLY", phonetic = "slóuli"),
                VocabularyItem(es = "Tuyo / Suya", en = "YOURS", phonetic = "yors"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar (auxiliar pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Incautado / Confiscado", en = "SEIZED", phonetic = "sízd")
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
                VocabularyItem(es = "Réplica", en = "REPLICA", phonetic = "réplika"),
                VocabularyItem(es = "Herramienta", en = "TOOL", phonetic = "tul"),
                VocabularyItem(es = "Objeto contundente", en = "BLUNT OBJECT", phonetic = "blant óbllekt"),
                VocabularyItem(es = "Es / Está", en = "IS", phonetic = "is"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Real", en = "REAL", phonetic = "ríal"),
                VocabularyItem(es = "Arma", en = "WEAPON", phonetic = "güépon"),
                VocabularyItem(es = "O", en = "OR", phonetic = "or"),
                VocabularyItem(es = "Réplicas (plural)", en = "REPLICAS", phonetic = "réplikas"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "También", en = "ALSO", phonetic = "ólsou"),
                VocabularyItem(es = "Incautado / Confiscado", en = "CONFISCATED", phonetic = "kónfiskeited"),
                VocabularyItem(es = "Por qué", en = "WHY", phonetic = "güai"),
                VocabularyItem(es = "Ser / Estar (plural)", en = "ARE", phonetic = "ar"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Llevando / Transportando", en = "CARRYING", phonetic = "kárring"),
                VocabularyItem(es = "Podría", en = "COULD", phonetic = "kud"),
                VocabularyItem(es = "Ser / Estar", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Usado", en = "USED", phonetic = "iúsd"),
                VocabularyItem(es = "Como", en = "AS", phonetic = "as"),
                VocabularyItem(es = "Yo soy / Estoy (I'm)", en = "I'M", phonetic = "aim"),
                VocabularyItem(es = "Incautando / Confiscando", en = "CONFISCATING", phonetic = "kónfiskeiting"),
                VocabularyItem(es = "Contundente / Romo", en = "BLUNT", phonetic = "blant")
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
                VocabularyItem(es = "Entregar", en = "HAND OVER", phonetic = "jand óuver"),
                VocabularyItem(es = "Incautar", en = "SEIZE", phonetic = "siz"),
                VocabularyItem(es = "Efectos intervenidos", en = "SEIZED ITEMS", phonetic = "sízd áitems"),
                VocabularyItem(es = "Entregar / Pasar", en = "HAND", phonetic = "jand"),
                VocabularyItem(es = "Lo / El", en = "IT", phonetic = "it"),
                VocabularyItem(es = "Despacio / Lentamente", en = "SLOWLY", phonetic = "slóuli"),
                VocabularyItem(es = "Por favor", en = "PLEASE", phonetic = "plís"),
                VocabularyItem(es = "Colocar / Poner", en = "PLACE", phonetic = "pléis"),
                VocabularyItem(es = "En / Sobre", en = "ON", phonetic = "on"),
                VocabularyItem(es = "El / La", en = "THE", phonetic = "de"),
                VocabularyItem(es = "Suelo", en = "GROUND", phonetic = "gráund"),
                VocabularyItem(es = "Este / Esta", en = "THIS", phonetic = "dis"),
                VocabularyItem(es = "Artículo / Objeto", en = "ITEM", phonetic = "áitem"),
                VocabularyItem(es = "Futuro (auxiliar)", en = "WILL", phonetic = "güil"),
                VocabularyItem(es = "Ser / Estar (auxiliar pasiva)", en = "BE", phonetic = "bi"),
                VocabularyItem(es = "Incautado", en = "SEIZED", phonetic = "sízd"),
                VocabularyItem(es = "Tú / Usted", en = "YOU", phonetic = "yu"),
                VocabularyItem(es = "Recibir", en = "RECEIVE", phonetic = "risív"),
                VocabularyItem(es = "Un / Una", en = "A", phonetic = "a"),
                VocabularyItem(es = "Justificante / Recibo", en = "RECEIPT", phonetic = "risít"),
                VocabularyItem(es = "Para / Por", en = "FOR", phonetic = "for"),
                VocabularyItem(es = "Poder", en = "CAN", phonetic = "can"),
                VocabularyItem(es = "Reclamar", en = "CLAIM", phonetic = "cléim"),
                VocabularyItem(es = "Más tarde", en = "LATER", phonetic = "léiter"),
                VocabularyItem(es = "En / En el", en = "AT", phonetic = "at"),
                VocabularyItem(es = "Comisaría / Estación", en = "STATION", phonetic = "stéishon"),
                VocabularyItem(es = "Ahora", en = "NOW", phonetic = "nau"),
                VocabularyItem(es = "Prueba / Evidencia", en = "EVIDENCE", phonetic = "évidens")
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
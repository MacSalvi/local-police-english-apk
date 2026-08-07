package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module18 {
    val module = Module(
        id = 18,
        title = "Módulo 18",
        description = "Drogas y sustancias estupefacientes",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Incendios, evacuaciones y sustancias peligrosas",
                vocabulary = listOf(
                    VocabularyItem(term = "FIRE", phonetic = "fáaia", translation = "Incendio"),
                    VocabularyItem(term = "SMOKE", phonetic = "smóuk", translation = "Humo"),
                    VocabularyItem(term = "FLAMES", phonetic = "fleims", translation = "Llamas"),
                    VocabularyItem(term = "EXPLOSION", phonetic = "eksplóushon", translation = "Explosión"),
                    VocabularyItem(term = "FIRE ALARM", phonetic = "fáaia alám", translation = "Alarma de incendios"),
                    VocabularyItem(term = "FIRE EXIT", phonetic = "fáaia éksit", translation = "Salida de emergencia"),
                    VocabularyItem(term = "EMERGENCY EXIT", phonetic = "imérllensi éksit", translation = "Salida de emergencia"),
                    VocabularyItem(term = "EMERGENCY", phonetic = "imérllensi", translation = "Emergencia"),
                    VocabularyItem(term = "EVACUATION", phonetic = "ivakiuéishon", translation = "Evacuación"),
                    VocabularyItem(term = "ASSEMBLY POINT", phonetic = "asémbli point", translation = "Punto de encuentro"),
                    VocabularyItem(term = "SAFE AREA", phonetic = "séif éria", translation = "Zona segura"),
                    VocabularyItem(term = "DANGER", phonetic = "déinya", translation = "Peligro"),
                    VocabularyItem(term = "RISK", phonetic = "risk", translation = "Riesgo"),
                    VocabularyItem(term = "GAS LEAK", phonetic = "gas lík", translation = "Fuga de gas"),
                    VocabularyItem(term = "CHEMICAL", phonetic = "kémikol", translation = "Sustancia química"),
                    VocabularyItem(term = "TOXIC SUBSTANCE", phonetic = "tóksik sástans", translation = "Sustancia tóxica"),
                    VocabularyItem(term = "HAZARDOUS MATERIAL", phonetic = "házadas matíarial", translation = "Material peligroso"),
                    VocabularyItem(term = "SMOKE INHALATION", phonetic = "smóuk inhaléishon", translation = "Inhalación de humo"),
                    VocabularyItem(term = "BURN", phonetic = "bern", translation = "Quemadura"),
                    VocabularyItem(term = "BREATHING", phonetic = "brízin", translation = "Respiración"),
                    VocabularyItem(term = "COUGH", phonetic = "kof", translation = "Tos"),
                    VocabularyItem(term = "FIRE BRIGADE", phonetic = "fáaia brigéid", translation = "Bomberos"),
                    VocabularyItem(term = "RESCUE", phonetic = "réskiu", translation = "Rescate"),
                    VocabularyItem(term = "TRAPPED PERSON", phonetic = "trapt pérson", translation = "Persona atrapada"),
                    VocabularyItem(term = "STAIRS", phonetic = "stéas", translation = "Escaleras"),
                    VocabularyItem(term = "LIFT", phonetic = "lift", translation = "Ascensor"),
                    VocabularyItem(term = "WINDOW", phonetic = "guíndou", translation = "Ventana"),
                    VocabularyItem(term = "BALCONY", phonetic = "bálkoni", translation = "Balcón"),
                    VocabularyItem(term = "DOOR", phonetic = "dóa", translation = "Puerta"),
                    VocabularyItem(term = "BUILDING", phonetic = "bíldin", translation = "Edificio"),
                    VocabularyItem(term = "PERIMETER", phonetic = "perímita", translation = "Perímetro")
                ),
                phrases = listOf(
                    PhraseItem(english = "ATTENTION PLEASE.", phonetic = "aténshon plís", spanish = "Atención, por favor."),
                    PhraseItem(english = "THIS IS THE LOCAL POLICE.", phonetic = "dis is de lóukal polís", spanish = "Habla la Policía Local."),
                    PhraseItem(english = "EVERYBODY, PLEASE LEAVE THE BUILDING IMMEDIATELY.", phonetic = "évribodi plís liv de bíldin imídietli", spanish = "Todo el mundo abandone el edificio inmediatamente."),
                    PhraseItem(english = "PLEASE REMAIN CALM.", phonetic = "plís riméin cam", spanish = "Mantengan la calma."),
                    PhraseItem(english = "DO NOT PANIC.", phonetic = "du not pánik", spanish = "No entren en pánico."),
                    PhraseItem(english = "DO NOT RUN.", phonetic = "du not ran", spanish = "No corran."),
                    PhraseItem(english = "WALK CALMLY.", phonetic = "guok cámli", spanish = "Caminen con calma."),
                    PhraseItem(english = "USE THE STAIRS.", phonetic = "yus de stéas", spanish = "Utilicen las escaleras."),
                    PhraseItem(english = "DO NOT USE THE LIFT.", phonetic = "du not yus de lift", spanish = "No utilicen el ascensor."),
                    PhraseItem(english = "FOLLOW THE EMERGENCY EXIT SIGNS.", phonetic = "fólou di imérllensi éksit sains", spanish = "Sigan las señales de salida de emergencia."),
                    PhraseItem(english = "MOVE AWAY FROM THE BUILDING.", phonetic = "muv aguéi from de bíldin", spanish = "Aléjense del edificio."),
                    PhraseItem(english = "GO TO THE ASSEMBLY POINT.", phonetic = "góu tu di asémbli point", spanish = "Diríjanse al punto de encuentro."),
                    PhraseItem(english = "KEEP THE ACCESS CLEAR FOR THE FIRE BRIGADE.", phonetic = "kip di ákses klía for de fáaia brigéid", spanish = "Mantengan libre el acceso para los bomberos."),
                    PhraseItem(english = "CAN YOU HEAR ME?", phonetic = "can yu jía mi", spanish = "¿Me oye?"),
                    PhraseItem(english = "STAY WHERE YOU ARE.", phonetic = "stéi güea yu ar", spanish = "Permanezca donde está."),
                    PhraseItem(english = "DO NOT JUMP.", phonetic = "du not yamp", spanish = "No salte."),
                    PhraseItem(english = "GO TO A WINDOW OR BALCONY IF YOU CAN.", phonetic = "góu tu a guíndou or bálkoni if yu can", spanish = "Acérquese a una ventana o a un balcón si puede."),
                    PhraseItem(english = "KEEP THE DOOR CLOSED.", phonetic = "kip de dóa klóuzd", spanish = "Mantenga la puerta cerrada."),
                    PhraseItem(english = "PUT A WET TOWEL UNDER THE DOOR.", phonetic = "put a guet táuel ánda de dóa", spanish = "Coloque una toalla mojada debajo de la puerta."),
                    PhraseItem(english = "STAY LOW TO AVOID THE SMOKE.", phonetic = "stéi lóu tu avóid de smóuk", spanish = "Manténgase agachado para evitar el humo."),
                    PhraseItem(english = "HELP IS ON THE WAY.", phonetic = "jelp is on de güei", spanish = "La ayuda está de camino."),
                    PhraseItem(english = "THE FIRE BRIGADE IS COMING.", phonetic = "de fáaia brigéid is cámin", spanish = "Los bomberos están llegando."),
                    PhraseItem(english = "CAN YOU BREATHE?", phonetic = "can yu bríz", spanish = "¿Puede respirar?"),
                    PhraseItem(english = "ARE YOU HAVING DIFFICULTY BREATHING?", phonetic = "ar yu jávin dífikolti brízin", spanish = "¿Tiene dificultad para respirar?"),
                    PhraseItem(english = "HAVE YOU INHALED ANY SMOKE?", phonetic = "jav yu injéild éni smóuk", spanish = "¿Ha inhalado humo?"),
                    PhraseItem(english = "ARE YOU COUGHING?", phonetic = "ar yu kófin", spanish = "¿Está tosiendo?"),
                    PhraseItem(english = "DO YOUR EYES HURT?", phonetic = "du yor áis jert", spanish = "¿Le escuecen los ojos?"),
                    PhraseItem(english = "DO YOU HAVE ANY BURNS?", phonetic = "du yu jav éni berns", spanish = "¿Tiene quemaduras?"),
                    PhraseItem(english = "WHERE ARE YOUR BURNS?", phonetic = "güea ar yor berns", spanish = "¿Dónde tiene las quemaduras?"),
                    PhraseItem(english = "HAVE YOU BEEN EXPOSED TO ANY CHEMICALS?", phonetic = "jav yu bin ekspóuzd tu éni kémikols", spanish = "¿Ha estado expuesto a alguna sustancia química?"),
                    PhraseItem(english = "DO YOU KNOW WHAT CAUSED THE FIRE?", phonetic = "du yu nóu guot kozd de fáaia", spanish = "¿Sabe qué provocó el incendio?"),
                    PhraseItem(english = "DID YOU HEAR AN EXPLOSION?", phonetic = "did yu jía an eksplóushon", spanish = "¿Oyó una explosión?"),
                    PhraseItem(english = "DO YOU SMELL GAS?", phonetic = "du yu smel gas", spanish = "¿Huele a gas?"),
                    PhraseItem(english = "IS ANYONE STILL INSIDE?", phonetic = "is éniuan stil insáid", spanish = "¿Queda alguien dentro?"),
                    PhraseItem(english = "HOW MANY PEOPLE ARE INSIDE?", phonetic = "jáu méni pípol ar insáid", spanish = "¿Cuántas personas hay dentro?"),
                    PhraseItem(english = "HAS EVERYONE LEFT THE BUILDING?", phonetic = "jaz évriguan left de bíldin", spanish = "¿Ha salido todo el mundo del edificio?"),
                    PhraseItem(english = "DO NOT GO BACK INSIDE.", phonetic = "du not góu bak insáid", spanish = "No vuelva a entrar."),
                    PhraseItem(english = "THIS AREA IS NOT SAFE.", phonetic = "dis éria is not séif", spanish = "Esta zona no es segura."),
                    PhraseItem(english = "PLEASE STAY BEHIND THE POLICE LINE.", phonetic = "plís stéi biháind de polís lain", spanish = "Permanezca detrás del cordón policial."),
                    PhraseItem(english = "FOLLOW MY INSTRUCTIONS.", phonetic = "fólou mai instrákshons", spanish = "Siga mis instrucciones."),
                    PhraseItem(english = "WE WILL TAKE CARE OF YOU.", phonetic = "güi wil teik kéa ov yu", spanish = "Nos ocuparemos de usted."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
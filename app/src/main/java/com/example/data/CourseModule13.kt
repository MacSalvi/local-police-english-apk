package com.example.data

import com.example.data.model.Module
import com.example.data.model.Lesson
import com.example.data.model.VocabularyItem
import com.example.data.model.PhraseItem

object Module13 {
    val module = Module(
        id = 13,
        title = "Módulo 13",
        description = "Patrullaje y prevención",
        lessons = listOf(
            Lesson(
                id = 1,
                title = "Detención y custodia",
                vocabulary = listOf(
                    VocabularyItem(term = "ARREST", phonetic = "arrést", translation = "Detención"),
                    VocabularyItem(term = "UNDER ARREST", phonetic = "ánder arrést", translation = "Detenido"),
                    VocabularyItem(term = "DETAIN", phonetic = "ditéin", translation = "Retener"),
                    VocabularyItem(term = "DETENTION", phonetic = "diténshon", translation = "Detención"),
                    VocabularyItem(term = "CUSTODY", phonetic = "kástodi", translation = "Custodia"),
                    VocabularyItem(term = "CUSTODY SUITE", phonetic = "kástodi suíit", translation = "Área de custodia"),
                    VocabularyItem(term = "HANDCUFFS", phonetic = "jándkafs", translation = "Esposas"),
                    VocabularyItem(term = "HANDCUFF", phonetic = "jándkaf", translation = "Esposar"),
                    VocabularyItem(term = "ESCORT", phonetic = "éskort", translation = "Custodiar / Acompañar"),
                    VocabularyItem(term = "POLICE VEHICLE", phonetic = "polís víikol", translation = "Vehículo policial"),
                    VocabularyItem(term = "POLICE STATION", phonetic = "polís stéishon", translation = "Comisaría"),
                    VocabularyItem(term = "CELL", phonetic = "sel", translation = "Calabozo"),
                    VocabularyItem(term = "SEARCH", phonetic = "serch", translation = "Registro"),
                    VocabularyItem(term = "PERSONAL BELONGINGS", phonetic = "pérsonal bilóngins", translation = "Efectos personales"),
                    VocabularyItem(term = "PROPERTY", phonetic = "próperti", translation = "Pertenencias"),
                    VocabularyItem(term = "SEIZE", phonetic = "síz", translation = "Intervenir"),
                    VocabularyItem(term = "EVIDENCE", phonetic = "évidens", translation = "Prueba"),
                    VocabularyItem(term = "OFFENCE", phonetic = "oféns", translation = "Delito / Infracción penal"),
                    VocabularyItem(term = "SUSPECT", phonetic = "sáspekt", translation = "Sospechoso"),
                    VocabularyItem(term = "VIOLENCE", phonetic = "váiolens", translation = "Violencia"),
                    VocabularyItem(term = "RESISTANCE", phonetic = "rizístans", translation = "Resistencia"),
                    VocabularyItem(term = "COOPERATE", phonetic = "kouópareit", translation = "Colaborar"),
                    VocabularyItem(term = "IDENTITY", phonetic = "aidéntiti", translation = "Identidad"),
                    VocabularyItem(term = "TRANSPORT", phonetic = "tránsport", translation = "Traslado"),
                    VocabularyItem(term = "SAFE", phonetic = "séif", translation = "Seguro")
                ),
                phrases = listOf(
                    PhraseItem(english = "YOU ARE UNDER ARREST.", phonetic = "yu ar ánder arrést", spanish = "Queda detenido."),
                    PhraseItem(english = "YOU ARE BEING DETAINED.", phonetic = "yu ar bíin ditéind", spanish = "Va a quedar detenido."),
                    PhraseItem(english = "PLEASE TURN AROUND.", phonetic = "plís tern aráund", spanish = "Dese la vuelta, por favor."),
                    PhraseItem(english = "PUT YOUR HANDS BEHIND YOUR BACK.", phonetic = "put yor jands bijáind yor bak", spanish = "Ponga las manos detrás de la espalda."),
                    PhraseItem(english = "DO NOT RESIST.", phonetic = "du not rizíst", spanish = "No se resista."),
                    PhraseItem(english = "PLEASE REMAIN STILL.", phonetic = "plís riméin stil", spanish = "Permanezca quieto."),
                    PhraseItem(english = "I AM GOING TO HANDCUFF YOU.", phonetic = "ai am góuin tu jándkaf yu", spanish = "Voy a esposarle."),
                    PhraseItem(english = "YOU ARE NOW HANDCUFFED.", phonetic = "yu ar nau jándkaft", spanish = "Está esposado."),
                    PhraseItem(english = "FOR YOUR SAFETY AND MINE, DO NOT MOVE.", phonetic = "for yor séifti and main, du not muv", spanish = "Por su seguridad y la mía, no se mueva."),
                    PhraseItem(english = "PLEASE WALK WITH ME.", phonetic = "plís guok güiz mi", spanish = "Acompáñeme, por favor."),
                    PhraseItem(english = "GET INTO THE POLICE VEHICLE.", phonetic = "get intu de polís víikol", spanish = "Suba al vehículo policial."),
                    PhraseItem(english = "PLEASE WATCH YOUR HEAD.", phonetic = "plís guoch yor jed", spanish = "Cuidado con la cabeza."),
                    PhraseItem(english = "YOU WILL BE TAKEN TO THE POLICE STATION.", phonetic = "yu wil bi téiken tu de polís stéishon", spanish = "Será trasladado a dependencias policiales."),
                    PhraseItem(english = "YOU WILL BE SEARCHED.", phonetic = "yu wil bi sercht", spanish = "Va a ser registrado."),
                    PhraseItem(english = "PLEASE EMPTY YOUR POCKETS.", phonetic = "plís émpti yor pókits", spanish = "Vacíe los bolsillos, por favor."),
                    PhraseItem(english = "DO YOU HAVE ANY WEAPONS OR SHARP OBJECTS?", phonetic = "du yu jav éni uépons or sharp óbllekts", spanish = "¿Lleva armas u objetos punzantes?"),
                    PhraseItem(english = "DO YOU HAVE ANYTHING THAT COULD HURT ME?", phonetic = "du yu jav énizin dat kud jert mi", spanish = "¿Lleva algo con lo que pueda lesionarme?"),
                    PhraseItem(english = "YOUR PERSONAL BELONGINGS WILL BE RECORDED.", phonetic = "yor pérsonal bilóngins wil bi rikórdid", spanish = "Se registrarán sus efectos personales."),
                    PhraseItem(english = "YOUR PROPERTY WILL BE RETURNED WHEN APPROPRIATE.", phonetic = "yor próperti wil bi ritérnd guen apróupriit", spanish = "Sus pertenencias le serán devueltas cuando proceda."),
                    PhraseItem(english = "PLEASE FOLLOW MY INSTRUCTIONS.", phonetic = "plís fólou mai instrákshons", spanish = "Siga mis instrucciones."),
                    PhraseItem(english = "DO NOT SPEAK TO OTHER PEOPLE.", phonetic = "du not spik tu áder pípol", spanish = "No hable con otras personas."),
                    PhraseItem(english = "DO NOT ATTEMPT TO LEAVE.", phonetic = "du not atémpt tu lív", spanish = "No intente marcharse."),
                    PhraseItem(english = "PLEASE WAIT HERE.", phonetic = "plís güeit jía", spanish = "Espere aquí."),
                    PhraseItem(english = "STAY WHERE YOU ARE.", phonetic = "stéi güer yu ar", spanish = "Permanezca donde está."),
                    PhraseItem(english = "WE WILL LEAVE SHORTLY.", phonetic = "güi wil lív shórtli", spanish = "Saldremos en unos momentos."),
                    PhraseItem(english = "THE OFFICER WILL EXPLAIN THE PROCEDURE.", phonetic = "di ófisa wil ikspléin de prosídcha", spanish = "El agente le explicará el procedimiento."),
                    PhraseItem(english = "DO YOU UNDERSTAND?", phonetic = "du yu ánderstand", spanish = "¿Me entiende?"),
                    PhraseItem(english = "PLEASE COOPERATE.", phonetic = "plís kouópareit", spanish = "Colabore, por favor."),
                    PhraseItem(english = "THANK YOU FOR YOUR COOPERATION.", phonetic = "zénk yu for yor kouópareishon", spanish = "Gracias por su colaboración.")
                )
            )
        )
    )
}
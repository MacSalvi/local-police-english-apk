package com.example.data

import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem

val module30 = Module(
    moduleId = 30,
    moduleName = "Módulo 30: Playas, vivienda turística ilegal, VTC y grandes eventos",
    lessons = listOf(
        Lesson(
            lessonId = 3001,
            lessonTitle = "Chiringuitos, hamacas y ocupación de playa",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Chiringuito",
                    en = "BEACH BAR",
                    phonetic = "bich bar"
                ),
                VocabularyItem(
                    es = "Hamaca",
                    en = "SUNBED",
                    phonetic = "sánbed"
                ),
                VocabularyItem(
                    es = "Concesión",
                    en = "CONCESSION",
                    phonetic = "konséshon"
                ),
                VocabularyItem(
                    es = "Dominio público",
                    en = "PUBLIC DOMAIN",
                    phonetic = "páblik doméin"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Esta zona excede la concesión autorizada.",
                    en = "THIS AREA EXCEEDS THE AUTHORISED CONCESSION.",
                    phonetic = "dis éria eksíds di ozoráisd konséshon"
                ),
                PhraseItem(
                    es = "¿Se están alquilando estas hamacas sin licencia?",
                    en = "ARE THESE SUNBEDS BEING RENTED WITHOUT A LICENCE?",
                    phonetic = "ar dis sánbeds bíing rénted güizáut a láisens"
                ),
                PhraseItem(
                    es = "¿Tiene permiso para este chiringuito?",
                    en = "DO YOU HAVE A PERMIT FOR THIS BEACH BAR?",
                    phonetic = "du yu jav a pörmit for dis bich bar"
                ),
                PhraseItem(
                    es = "La venta ambulante en la playa está prohibida.",
                    en = "STREET SELLING ON THE BEACH IS PROHIBITED.",
                    phonetic = "strit séling on de bich is prójibited"
                ),
                PhraseItem(
                    es = "Debe retirar estos objetos de la arena.",
                    en = "YOU MUST REMOVE THESE ITEMS FROM THE SAND.",
                    phonetic = "yu mast rimúv dis áitems from de sand"
                ),
                PhraseItem(
                    es = "Esto es dominio público, no espacio privado.",
                    en = "THIS IS PUBLIC DOMAIN, NOT PRIVATE SPACE.",
                    phonetic = "dis is páblik doméin, not práivet spéis"
                )
            )
        ),
        Lesson(
            lessonId = 3002,
            lessonTitle = "Vivienda turística ilegal y VTC",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Vivienda turística",
                    en = "TOURIST RENTAL",
                    phonetic = "túrist réntal"
                ),
                VocabularyItem(
                    es = "Licencia VUT",
                    en = "TOURIST LICENCE",
                    phonetic = "túrist láisens"
                ),
                VocabularyItem(
                    es = "Conductor VTC",
                    en = "PRIVATE HIRE DRIVER",
                    phonetic = "práivet jáiar dráiver"
                ),
                VocabularyItem(
                    es = "Vecino",
                    en = "NEIGHBOUR",
                    phonetic = "néibör"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "¿Tiene licencia de vivienda turística para esta propiedad?",
                    en = "DO YOU HAVE A TOURIST RENTAL LICENCE FOR THIS PROPERTY?",
                    phonetic = "du yu jav a túrist réntal láisens for dis próperti"
                ),
                PhraseItem(
                    es = "Hemos recibido una queja de un vecino.",
                    en = "WE'VE RECEIVED A COMPLAINT FROM A NEIGHBOUR.",
                    phonetic = "güiv risívd a kompléint from a néibör"
                ),
                PhraseItem(
                    es = "Muéstreme el número de registro de la vivienda.",
                    en = "SHOW ME THE PROPERTY REGISTRATION NUMBER.",
                    phonetic = "shou mi de próperti reyistréishon námber"
                ),
                PhraseItem(
                    es = "¿Es usted el propietario o un huésped?",
                    en = "ARE YOU THE OWNER OR A GUEST?",
                    phonetic = "ar yu di óuner or a guest"
                ),
                PhraseItem(
                    es = "¿Es usted conductor VTC autorizado?",
                    en = "ARE YOU A LICENSED PRIVATE HIRE DRIVER?",
                    phonetic = "ar yu a láisensd práivet jáiar dráiver"
                ),
                PhraseItem(
                    es = "Muéstreme su autorización VTC, por favor.",
                    en = "SHOW ME YOUR VTC AUTHORISATION, PLEASE.",
                    phonetic = "shou mi yor vi-ti-si ozorizéishon, plis"
                ),
                PhraseItem(
                    es = "Este vehículo no está autorizado para este servicio.",
                    en = "THIS VEHICLE IS NOT AUTHORISED FOR THIS SERVICE.",
                    phonetic = "dis víikol is not ózoraisd for dis sörvis"
                )
            )
        ),
        Lesson(
            lessonId = 3003,
            lessonTitle = "Grandes eventos y aforo en vía pública",
            vocabulary = listOf(
                VocabularyItem(
                    es = "Recinto ferial",
                    en = "FAIRGROUND",
                    phonetic = "férgraund"
                ),
                VocabularyItem(
                    es = "Punto de control",
                    en = "CHECKPOINT",
                    phonetic = "chékpoint"
                ),
                VocabularyItem(
                    es = "Corte de calle",
                    en = "STREET CLOSURE",
                    phonetic = "strit clóusher"
                ),
                VocabularyItem(
                    es = "Objeto prohibido",
                    en = "PROHIBITED ITEM",
                    phonetic = "prójibited áitem"
                )
            ),
            phrases = listOf(
                PhraseItem(
                    es = "Esta calle está cortada por el evento.",
                    en = "THIS STREET IS CLOSED FOR THE EVENT.",
                    phonetic = "dis strit is clóusd for di ivént"
                ),
                PhraseItem(
                    es = "Utilice el punto de control señalizado, por favor.",
                    en = "PLEASE USE THE DESIGNATED CHECKPOINT.",
                    phonetic = "plís iús de désignéited chékpoint"
                ),
                PhraseItem(
                    es = "Este objeto no está permitido dentro del recinto ferial.",
                    en = "THIS ITEM IS NOT ALLOWED INSIDE THE FAIRGROUND.",
                    phonetic = "dis áitem is not aláud insáid de férgraund"
                ),
                PhraseItem(
                    es = "Abra su bolso para inspección, por favor.",
                    en = "OPEN YOUR BAG FOR INSPECTION, PLEASE.",
                    phonetic = "óupen yor bag for inspékshon, plis"
                ),
                PhraseItem(
                    es = "El recinto ferial ha alcanzado su aforo máximo.",
                    en = "THE FAIRGROUND HAS REACHED MAXIMUM CAPACITY.",
                    phonetic = "de férgraund jas richt mácsimum kapásiti"
                ),
                PhraseItem(
                    es = "Siga la ruta señalizada, por favor.",
                    en = "PLEASE FOLLOW THE MARKED ROUTE.",
                    phonetic = "plís fólou de markt rut"
                ),
                PhraseItem(
                    es = "El acceso se reabrirá en breve.",
                    en = "ACCESS WILL REOPEN SHORTLY.",
                    phonetic = "ákses güil rióupen shórtli"
                )
            )
        )
    )
)
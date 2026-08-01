package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SyllabusScreen(
    modules: List<Module>,
    searchQuery: String,
    expandedModuleId: Int?,
    currentlyPlayingText: String?,
    onSearchQueryChange: (String) -> Unit,
    onModuleToggle: (Int) -> Unit,
    onLessonClick: (Lesson) -> Unit,
    onSpeakClick: (String) -> Unit,
    onEnterManagerMode: () -> Unit
) {
    var showEmergencySheet by remember { mutableStateOf(false) }

    // Verde Fósforo clásico de pantalla de tubo CRT / terminal 90s
    val crtGreen = Color(0xFF00FF66)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Local Police English",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    fontSize = 17.sp
                                ),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Box(
                                modifier = Modifier
                                    .background(Slate800, RoundedCornerShape(4.dp))
                                    .padding(horizontal = 5.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = "V1.0",
                                    color = Slate400,
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    softWrap = false
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(2.dp))

                        Text(
                            text = buildAnnotatedString {
                                append("Inglés Operativo • ")
                                withStyle(
                                    style = SpanStyle(
                                        color = crtGreen,
                                        fontWeight = FontWeight.Bold
                                    )
                                ) {
                                    append("CP214 SCR · PL Marbella")
                                }
                            },
                            fontSize = 11.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                },
                actions = {
                    // Botón de Comandos de Emergencia Rápida
                    IconButton(
                        onClick = { showEmergencySheet = true },
                        modifier = Modifier
                            .testTag("emergency_button")
                            .clip(CircleShape)
                            .background(Color(0xFFEF4444).copy(alpha = 0.15f))
                    ) {
                        Icon(
                            imageVector = Icons.Default.FlashOn,
                            contentDescription = "Comandos de Emergencia",
                            tint = Color(0xFFEF4444)
                        )
                    }

                    Spacer(modifier = Modifier.width(4.dp))

                    // Botón de Panel de Control
                    IconButton(
                        onClick = onEnterManagerMode,
                        modifier = Modifier
                            .testTag("admin_panel_button")
                            .clip(CircleShape)
                            .background(Slate800)
                    ) {
                        Icon(
                            imageVector = Icons.Default.AdminPanelSettings,
                            contentDescription = "Panel de Control",
                            tint = NeonTeal
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Slate950,
                    titleContentColor = Color.White
                )
            )
        },
        containerColor = Slate950
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Slate950)
                .padding(horizontal = 16.dp)
        ) {
            // Persistent Search Bar
            OutlinedTextField(
                value = searchQuery,
                onValueChange = onSearchQueryChange,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
                    .testTag("search_bar"),
                placeholder = { Text("Buscar vocabulario o frase táctica...", color = Slate400) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Buscar",
                        tint = Slate400
                    )
                },
                trailingIcon = {
                    if (searchQuery.isNotEmpty()) {
                        IconButton(onClick = { onSearchQueryChange("") }) {
                            Icon(
                                imageVector = Icons.Default.Clear,
                                contentDescription = "Limpiar",
                                tint = NeonTeal
                            )
                        }
                    }
                },
                singleLine = true,
                shape = RoundedCornerShape(24.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedContainerColor = Slate900,
                    unfocusedContainerColor = Slate900,
                    focusedBorderColor = NeonTeal,
                    unfocusedBorderColor = Slate800,
                    cursorColor = NeonTeal
                )
            )

            if (searchQuery.isNotEmpty()) {
                // Search Results Mode across both Vocabulary and Phrases
                val results = getFilteredPhrases(modules, searchQuery)
                Text(
                    text = "Resultados de búsqueda (${results.size})",
                    color = NeonTeal,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                if (results.isEmpty()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                imageVector = Icons.Default.SearchOff,
                                contentDescription = null,
                                tint = Slate400,
                                modifier = Modifier.size(64.dp)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(
                                text = "No se encontraron resultados para su búsqueda.",
                                color = Slate400,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                } else {
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        items(results) { item ->
                            SearchResultCard(
                                result = item,
                                currentlyPlayingText = currentlyPlayingText,
                                onSpeakClick = onSpeakClick
                            )
                        }
                    }
                }
            } else {
                // Syllabus Learning Path
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(bottom = 24.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    items(modules) { module ->
                        ModuleHeaderCard(
                            module = module,
                            isExpanded = expandedModuleId == module.moduleId,
                            onToggle = { onModuleToggle(module.moduleId) }
                        )

                        AnimatedVisibility(
                            visible = expandedModuleId == module.moduleId,
                            enter = fadeIn() + expandVertically(),
                            exit = fadeOut() + shrinkVertically()
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 16.dp, top = 8.dp, bottom = 8.dp)
                                    .border(
                                        width = 1.dp,
                                        color = Slate800,
                                        shape = RoundedCornerShape(16.dp)
                                    )
                                    .background(Slate900.copy(alpha = 0.5f), RoundedCornerShape(16.dp))
                                    .padding(12.dp)
                            ) {
                                if (module.lessons.isEmpty()) {
                                    Text(
                                        text = "No hay lecciones en este módulo.",
                                        color = Slate400,
                                        style = MaterialTheme.typography.bodyMedium,
                                        modifier = Modifier.padding(8.dp)
                                    )
                                } else {
                                    module.lessons.forEachIndexed { index, lesson ->
                                        LessonPathItem(
                                            lesson = lesson,
                                            isLast = index == module.lessons.size - 1,
                                            onClick = { onLessonClick(lesson) }
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Modal Flotante de Emergencia
    if (showEmergencySheet) {
        EmergencyBottomSheet(
            currentlyPlayingText = currentlyPlayingText,
            onDismiss = { showEmergencySheet = false },
            onSpeakClick = onSpeakClick
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmergencyBottomSheet(
    currentlyPlayingText: String?,
    onDismiss: () -> Unit,
    onSpeakClick: (String) -> Unit
) {
    val emergencyCommands = listOf(
        PhraseItem("Muestre sus manos, por favor.", "PLEASE SHOW ME YOUR HANDS.", "[plis shóu mi yur jands]"),
        PhraseItem("Quédese donde está, por favor.", "PLEASE STAY WHERE YOU ARE.", "[plis stei wer iú ar]"),
        PhraseItem("Apague el motor, por favor.", "PLEASE TURN OFF THE ENGINE.", "[plis tern of di én-djin]"),
        PhraseItem("Salga del vehículo, por favor.", "PLEASE STEP OUT OF THE VEHICLE.", "[plis step aut ov de ví-i-kel]"),
        PhraseItem("Mantenga la calma, por favor.", "PLEASE STAY CALM.", "[plis stei kam]"),
        PhraseItem("Mantenga una distancia de seguridad.", "PLEASE KEEP A SAFE DISTANCE.", "[plis kip e seif dís-tans]")
    )

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        containerColor = Color(0xFF0F172A),
        modifier = Modifier.testTag("emergency_sheet")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.FlashOn,
                        contentDescription = null,
                        tint = Color(0xFFEF4444),
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "COMANDOS TÁCTICOS DE EMERGENCIA",
                        color = Color(0xFFEF4444),
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        letterSpacing = 0.5.sp
                    )
                }
                IconButton(onClick = onDismiss) {
                    Icon(Icons.Default.Close, contentDescription = "Cerrar", tint = Slate400)
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                contentPadding = PaddingValues(bottom = 24.dp)
            ) {
                items(emergencyCommands) { command ->
                    val isPlaying = currentlyPlayingText == command.en
                    Surface(
                        color = Slate900,
                        shape = RoundedCornerShape(12.dp),
                        border = BorderStroke(1.2.dp, if (isPlaying) NeonTeal else Color(0xFFEF4444).copy(alpha = 0.3f)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onSpeakClick(command.en) }
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = command.en,
                                    color = Color.White,
                                    fontWeight = FontWeight.Black,
                                    fontSize = 16.sp
                                )
                                Text(
                                    text = command.phonetic,
                                    color = Slate400,
                                    fontSize = 12.sp,
                                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                                )
                                Text(
                                    text = command.es,
                                    color = Slate400,
                                    fontSize = 13.sp
                                )
                            }
                            IconButton(
                                onClick = { onSpeakClick(command.en) },
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .background(if (isPlaying) NeonTeal else Color(0xFFEF4444).copy(alpha = 0.15f))
                            ) {
                                Icon(
                                    imageVector = Icons.Default.VolumeUp,
                                    contentDescription = "Escuchar",
                                    tint = if (isPlaying) Slate950 else Color(0xFFEF4444)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

// Data class representation for aggregated search results
data class FilteredPhraseResult(
    val phrase: PhraseItem,
    val lessonTitle: String,
    val moduleName: String,
    val isVocabulary: Boolean
)

private fun getFilteredPhrases(modules: List<Module>, query: String): List<FilteredPhraseResult> {
    val results = mutableListOf<FilteredPhraseResult>()
    val q = query.lowercase().trim()
    for (module in modules) {
        for (lesson in module.lessons) {
            // Search Vocabulary items
            for (vocab in lesson.vocabulary) {
                if (vocab.es.lowercase().contains(q) || vocab.en.lowercase().contains(q)) {
                    results.add(
                        FilteredPhraseResult(
                            phrase = PhraseItem(es = vocab.es, en = vocab.en, phonetic = vocab.phonetic),
                            lessonTitle = lesson.lessonTitle,
                            moduleName = module.moduleName,
                            isVocabulary = true
                        )
                    )
                }
            }
            // Search Phrases items
            for (phrase in lesson.phrases) {
                if (phrase.es.lowercase().contains(q) || phrase.en.lowercase().contains(q)) {
                    results.add(
                        FilteredPhraseResult(
                            phrase = phrase,
                            lessonTitle = lesson.lessonTitle,
                            moduleName = module.moduleName,
                            isVocabulary = false
                        )
                    )
                }
            }
        }
    }
    return results
}

@Composable
fun ModuleHeaderCard(
    module: Module,
    isExpanded: Boolean,
    onToggle: () -> Unit
) {
    val icon = when (module.moduleId) {
        1 -> Icons.Default.SupportAgent
        2 -> Icons.Default.DirectionsCar
        3 -> Icons.Default.Shield
        4 -> Icons.Default.Warning
        else -> Icons.Default.MenuBook
    }

    val accentColor = when (module.moduleId) {
        1 -> CustomGreen
        2 -> RadiantBlue
        3 -> NeonTeal
        4 -> NeonOrange
        else -> Slate400
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onToggle() }
            .testTag("module_card_${module.moduleId}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Slate900
        ),
        border = BorderStroke(1.2.dp, if (isExpanded) accentColor else Slate800)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(accentColor.copy(alpha = 0.15f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = accentColor,
                        modifier = Modifier.size(26.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = module.moduleName,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Text(
                        text = "${module.lessons.size} Lecciones de entrenamiento",
                        color = Slate400,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            Icon(
                imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                contentDescription = if (isExpanded) "Colapsar" else "Expandir",
                tint = Slate400,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun LessonPathItem(
    lesson: Lesson,
    isLast: Boolean,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 10.dp, horizontal = 4.dp)
            .testTag("lesson_item_${lesson.lessonId}"),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Timeline dot
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.width(24.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(12.dp)
                    .clip(CircleShape)
                    .background(NeonTeal)
            )
            if (!isLast) {
                Box(
                    modifier = Modifier
                        .width(2.dp)
                        .height(36.dp)
                        .background(Slate800)
                )
            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = lesson.lessonTitle,
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )
            Text(
                text = "${lesson.vocabulary.size} Vocab • ${lesson.phrases.size} Frases • ${lesson.tips.size} Consejos",
                color = Slate400,
                fontSize = 12.sp
            )
        }
        Icon(
            imageVector = Icons.Default.PlayArrow,
            contentDescription = "Entrar a la lección",
            tint = NeonTeal,
            modifier = Modifier.size(18.dp)
        )
    }
}

@Composable
fun SearchResultCard(
    result: FilteredPhraseResult,
    currentlyPlayingText: String?,
    onSpeakClick: (String) -> Unit
) {
    val isPlaying = currentlyPlayingText == result.phrase.en

    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Slate900),
        border = BorderStroke(
            width = 1.dp,
            color = if (isPlaying) NeonTeal else Slate800
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            // Location Badge row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(4.dp))
                            .background(if (result.isVocabulary) NeonTeal.copy(alpha = 0.15f) else Slate800)
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = if (result.isVocabulary) "VOCABULARIO" else "FRASE TÁCTICA",
                            color = if (result.isVocabulary) NeonTeal else Slate400,
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = result.lessonTitle.uppercase(),
                        color = Slate400,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.5.sp
                    )
                }
                if (isPlaying) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(4.dp))
                            .background(NeonTeal.copy(alpha = 0.2f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = "Reproduciendo...",
                            color = NeonTeal,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // English Phrase first
            Text(
                text = result.phrase.en.uppercase(),
                color = NeonTeal,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                lineHeight = 24.sp
            )

            // Fonética en resultados de búsqueda (si existe)
            if (result.phrase.phonetic.isNotEmpty()) {
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = result.phrase.phonetic,
                    color = Slate400,
                    fontSize = 13.sp,
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                )
            }

            Spacer(modifier = Modifier.height(6.dp))

            // Spanish Phrase second
            Text(
                text = result.phrase.es,
                color = Slate400,
                fontSize = 14.sp,
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                fontWeight = FontWeight.Normal,
                lineHeight = 18.sp
            )

            Spacer(modifier = Modifier.height(14.dp))

            Button(
                onClick = { onSpeakClick(result.phrase.en) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isPlaying) NeonTeal else NeonTeal.copy(alpha = 0.1f),
                    contentColor = if (isPlaying) Slate950 else NeonTeal
                ),
                border = BorderStroke(1.2.dp, if (isPlaying) NeonTeal else NeonTeal.copy(alpha = 0.3f)),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .height(48.dp)
                    .align(Alignment.End)
                    .testTag("listen_button_search_${result.phrase.en.take(10)}")
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.VolumeUp,
                        contentDescription = null,
                        tint = if (isPlaying) Slate950 else NeonTeal,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = if (isPlaying) "PLAYING (en-GB)" else "LISTEN (en-GB)",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
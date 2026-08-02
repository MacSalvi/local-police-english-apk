package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
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
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
import kotlin.math.sin
import kotlin.random.Random

data class SyllabusSection(
    val title: String,
    val moduleIds: List<Int>
)

val operationalSections = listOf(
    SyllabusSection("COMUNICACIÓN Y PROCEDIMIENTO", listOf(1, 2, 3)),
    SyllabusSection("TRÁFICO Y VEHÍCULOS", listOf(4, 5, 6, 7, 8, 9, 28, 29)),
    SyllabusSection("SEGURIDAD CIUDADANA", listOf(10, 11, 12, 13, 16, 26)),
    SyllabusSection("VÍCTIMAS Y DELINCUENCIA", listOf(14, 15, 27)),
    SyllabusSection("EMERGENCIAS", listOf(17, 18, 19, 20)),
    SyllabusSection("TURISMO, EXTRANJERÍA Y CONVIVENCIA", listOf(21, 22, 25, 30)),
    SyllabusSection("COORDINACIÓN Y VOCABULARIO", listOf(23, 24))
)

data class Star(
    val xFraction: Float,
    val yFraction: Float,
    val radius: Float,
    val phase: Float,
    val speed: Float
)

@Composable
fun StarryBackground(
    modifier: Modifier = Modifier,
    starCount: Int = 75,
    content: @Composable () -> Unit
) {
    val stars = remember {
        val random = Random(42)
        List(starCount) {
            Star(
                xFraction = random.nextFloat(),
                yFraction = random.nextFloat(),
                radius = random.nextFloat() * 1.8f + 0.8f,
                phase = random.nextFloat() * 6.28f,
                speed = random.nextFloat() * 0.012f + 0.003f
            )
        }
    }

    val infiniteTransition = rememberInfiniteTransition(label = "star_animation")
    val animProgress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 100f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 35000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "star_progress"
    )

    Box(modifier = modifier) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            stars.forEach { star ->
                val currentY = ((star.yFraction - (animProgress * star.speed)) % 1f).let { if (it < 0f) it + 1f else it }
                val alpha = (sin(animProgress * 1.2f + star.phase) + 1f) / 2f * 0.65f + 0.15f
                
                drawCircle(
                    color = Color.White.copy(alpha = alpha),
                    radius = star.radius,
                    center = Offset(star.xFraction * width, currentY * height)
                )
            }
        }
        content()
    }
}

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
    onEnterInfoMode: () -> Unit = {}
) {
    var showEmergencySheet by remember { mutableStateOf(false) }
    val crtGreen = Color(0xFF00FF66)

    val expandedSections = remember { mutableStateMapOf<String, Boolean>().apply {
        operationalSections.forEach { put(it.title, false) }
    }}

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
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
                                withStyle(style = SpanStyle(color = crtGreen, fontWeight = FontWeight.Bold)) {
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
                    IconButton(
                        onClick = onEnterInfoMode,
                        modifier = Modifier
                            .testTag("info_button")
                            .clip(CircleShape)
                            .background(NeonTeal.copy(alpha = 0.15f))
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = "Información y Créditos",
                            tint = NeonTeal
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

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
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Slate950,
                    titleContentColor = Color.White
                )
            )
        },
        containerColor = Slate950
    ) { paddingValues ->
        StarryBackground(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Slate950)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = onSearchQueryChange,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp)
                        .height(48.dp)
                        .testTag("search_bar"),
                    placeholder = { 
                        Text(
                            text = "Buscar módulo, lección, vocabulario o frase...", 
                            color = Slate400,
                            fontSize = 12.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        ) 
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Buscar",
                            tint = Slate400,
                            modifier = Modifier.size(18.dp)
                        )
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(
                                onClick = { onSearchQueryChange("") },
                                modifier = Modifier.size(24.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Clear,
                                    contentDescription = "Limpiar",
                                    tint = NeonTeal,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    },
                    singleLine = true,
                    textStyle = MaterialTheme.typography.bodyMedium.copy(fontSize = 13.sp, color = Color.White),
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
                    val moduleMap = modules.associateBy { it.moduleId }

                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        contentPadding = PaddingValues(bottom = 24.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        operationalSections.forEach { section ->
                            val isSectionExpanded = expandedSections[section.title] ?: false
                            val sectionModules = section.moduleIds.mapNotNull { moduleMap[it] }

                            item(key = "section_${section.title}") {
                                val rotationAngle by animateFloatAsState(
                                    targetValue = if (isSectionExpanded) 180f else 0f,
                                    label = "section_chevron"
                                )

                                Surface(
                                    color = Slate900,
                                    shape = RoundedCornerShape(12.dp),
                                    border = BorderStroke(1.2.dp, if (isSectionExpanded) NeonTeal.copy(alpha = 0.5f) else Slate800),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            expandedSections[section.title] = !isSectionExpanded
                                        }
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(horizontal = 14.dp, vertical = 12.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Column(modifier = Modifier.weight(1f)) {
                                            Text(
                                                text = section.title,
                                                color = NeonTeal,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 13.sp,
                                                letterSpacing = 1.sp
                                            )
                                            Spacer(modifier = Modifier.height(2.dp))
                                            Text(
                                                text = "${sectionModules.size} módulos operativos",
                                                color = Slate400,
                                                fontSize = 11.sp
                                            )
                                        }
                                        Icon(
                                            imageVector = Icons.Default.KeyboardArrowDown,
                                            contentDescription = null,
                                            modifier = Modifier.rotate(rotationAngle),
                                            tint = NeonTeal
                                        )
                                    }
                                }
                            }

                            item(key = "content_${section.title}") {
                                AnimatedVisibility(
                                    visible = isSectionExpanded,
                                    enter = fadeIn() + expandVertically(),
                                    exit = fadeOut() + shrinkVertically()
                                ) {
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(12.dp),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(start = 8.dp, top = 4.dp, bottom = 4.dp)
                                    ) {
                                        sectionModules.forEach { module ->
                                            val isModuleExpanded = expandedModuleId == module.moduleId

                                            Column(modifier = Modifier.fillMaxWidth()) {
                                                ModuleHeaderCard(
                                                    module = module,
                                                    isExpanded = isModuleExpanded,
                                                    onToggle = { onModuleToggle(module.moduleId) }
                                                )

                                                AnimatedVisibility(
                                                    visible = isModuleExpanded,
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
                        }
                    }
                }
            }
        }
    }

    if (showEmergencySheet) {
        EmergencyBottomSheet(
            currentlyPlayingText = currentlyPlayingText,
            onDismiss = { showEmergencySheet = false },
            onSpeakClick = onSpeakClick
        )
    }
}

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
        val matchesModule = module.moduleName.lowercase().contains(q)
        
        for (lesson in module.lessons) {
            val matchesLesson = lesson.lessonTitle.lowercase().contains(q)

            for (vocab in lesson.vocabulary) {
                if (matchesModule || matchesLesson || vocab.es.lowercase().contains(q) || vocab.en.lowercase().contains(q)) {
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
            for (phrase in lesson.phrases) {
                if (matchesModule || matchesLesson || phrase.es.lowercase().contains(q) || phrase.en.lowercase().contains(q)) {
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
    return results.distinct()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmergencyBottomSheet(
    currentlyPlayingText: String?,
    onDismiss: () -> Unit,
    onSpeakClick: (String) -> Unit
) {
    val emergencyCommands = listOf(
        PhraseItem("Muestre sus manos, por favor.", "PLEASE SHOW ME YOUR HANDS.", "plis show mi yur jands"),
        PhraseItem("Quédese donde está, por favor.", "PLEASE STAY WHERE YOU ARE.", "plis stei wer iu ar"),
        PhraseItem("Apague el motor, por favor.", "PLEASE TURN OFF THE ENGINE.", "plis tern of di en-djin"),
        PhraseItem("Salga del vehículo, por favor.", "PLEASE STEP OUT OF THE VEHICLE.", "plis step aut ov de vi-i-kel"),
        PhraseItem("Mantenga la calma, por favor.", "PLEASE STAY CALM.", "plis stei kam"),
        PhraseItem("Mantenga una distancia de seguridad.", "PLEASE KEEP A SAFE DISTANCE.", "plis kip e seif dis-tans")
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

private fun getSectionVisuals(moduleId: Int): Pair<ImageVector, Color> {
    return when (moduleId) {
        in listOf(1, 2, 3) -> Icons.Default.SupportAgent to CustomGreen
        in listOf(4, 5, 6, 7, 8, 9, 28, 29) -> Icons.Default.DirectionsCar to RadiantBlue
        in listOf(10, 11, 12, 13, 16, 26) -> Icons.Default.Shield to NeonTeal
        in listOf(14, 15, 27) -> Icons.Default.GppGood to Color(0xFFC084FC)
        in listOf(17, 18, 19, 20) -> Icons.Default.Warning to NeonOrange
        in listOf(21, 22, 25, 30) -> Icons.Default.Public to Color(0xFFFACC15)
        else -> Icons.Default.MenuBook to Slate400
    }
}

@Composable
fun ModuleHeaderCard(
    module: Module,
    isExpanded: Boolean,
    onToggle: () -> Unit
) {
    val (icon, accentColor) = getSectionVisuals(module.moduleId)

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
                text = "${lesson.vocabulary.size} Vocab • ${lesson.phrases.size} Frases",
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
        modifier = Modifier.fillMaxWidth(),
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
                        text = "${result.moduleName.uppercase()} • ${result.lessonTitle.uppercase()}",
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

            Text(
                text = result.phrase.en.uppercase(),
                color = NeonTeal,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                lineHeight = 24.sp
            )

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
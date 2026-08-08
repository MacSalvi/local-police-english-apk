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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.R
import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.ui.components.TacticalBackground
import com.example.ui.theme.*
import kotlin.math.sin
import kotlin.random.Random

data class SyllabusSection(
    val title: String,
    val moduleIds: List<Int>,
    val color: Color,
    val gradientColors: List<Color>
)

val operationalSections = listOf(
    SyllabusSection("BLOQUE I · Atención Ciudadana e Identificación", listOf(1, 2, 3, 4, 5, 6), Color(0xFF818CF8), listOf(Color(0xFF818CF8), Color(0xFFA5B4FC))),
    SyllabusSection("BLOQUE II · Tráfico y Transporte", listOf(7, 8, 9, 10, 11, 12), Color(0xFF38BDF8), listOf(Color(0xFF38BDF8), Color(0xFF7DD3FC))),
    SyllabusSection("BLOQUE III · Seguridad Ciudadana", listOf(13, 14, 15, 16, 17, 18), Color(0xFF2DD4BF), listOf(Color(0xFF2DD4BF), Color(0xFF5EEAD4))),
    SyllabusSection("BLOQUE IV · Delitos y Actuaciones Policiales", listOf(19, 20, 21, 22, 23, 24, 25, 26, 27, 28), Color(0xFFC084FC), listOf(Color(0xFFC084FC), Color(0xFFE9D5FF))),
    SyllabusSection("BLOQUE V · Emergencias y Servicios Especiales", listOf(29), Color(0xFFFB923C), listOf(Color(0xFFFB923C), Color(0xFFFDBA74))),
    SyllabusSection("BLOQUE VI · Vocabulario Operativo", listOf(30), Color(0xFFFACC15), listOf(Color(0xFFFACC15), Color(0xFFFEF08A)))
)

@Composable
fun StarryBackground(
    modifier: Modifier = Modifier,
    starCount: Int = 75,
    content: @Composable () -> Unit
) {
    TacticalBackground(
        modifier = modifier,
        content = content
    )
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

    val listState = androidx.compose.foundation.lazy.rememberLazyListState()
    var expandedSectionTitle by remember { mutableStateOf<String?>(null) }

    val moduleMap = remember(modules) { modules.associateBy { it.moduleId } }

    fun findIndexForKey(targetKey: String): Int {
        var index = 0
        operationalSections.forEach { section ->
            val sectionKey = "section_${section.title}"
            if (sectionKey == targetKey) return index
            index++

            if (expandedSectionTitle == section.title) {
                val sectionModules = section.moduleIds.mapNotNull { moduleMap[it] }
                sectionModules.forEach { module ->
                    val moduleKey = "module_${module.moduleId}"
                    if (moduleKey == targetKey) return index
                    index++
                }
            }
        }
        return -1
    }

    LaunchedEffect(expandedSectionTitle) {
        val sectionTitle = expandedSectionTitle
        if (sectionTitle != null) {
            kotlinx.coroutines.delay(100)
            val idx = findIndexForKey("section_$sectionTitle")
            if (idx >= 0) {
                listState.animateScrollToItem(idx)
            }
        }
    }

    LaunchedEffect(expandedModuleId) {
        val modId = expandedModuleId
        if (modId != null) {
            val parentSection = operationalSections.find { it.moduleIds.contains(modId) }
            if (parentSection != null && expandedSectionTitle != parentSection.title) {
                expandedSectionTitle = parentSection.title
                kotlinx.coroutines.delay(100)
            }
            kotlinx.coroutines.delay(120)
            val idx = findIndexForKey("module_$modId")
            if (idx >= 0) {
                listState.animateScrollToItem(idx)
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Soporte táctico multilingüe · V${com.example.BuildConfig.VERSION_NAME}",
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontSize = 15.sp
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "CP214 SCR · Policía Local Marbella",
                            color = crtGreen,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
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
                    containerColor = Slate950.copy(alpha = 0.80f),
                    titleContentColor = Color.White
                )
            )
        },
        containerColor = Color.Transparent
    ) { paddingValues ->
        TacticalBackground(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
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
                        .padding(vertical = 8.dp)
                        .defaultMinSize(minHeight = 52.dp)
                        .testTag("search_bar"),
                    placeholder = { 
                        Text(
                            text = "Buscar módulo, lección, término...", 
                            color = Slate400,
                            fontSize = 13.sp,
                            maxLines = 1,
                            softWrap = false,
                            overflow = TextOverflow.Ellipsis
                        ) 
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Buscar",
                            tint = Slate400,
                            modifier = Modifier.size(20.dp)
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
                    BoxWithConstraints(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        val availableHeight = maxHeight
                        if (expandedSectionTitle == null && availableHeight >= 550.dp) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(bottom = 12.dp)
                            ) {
                                MainHeaderLogoBanner(modifier = Modifier.padding(bottom = 4.dp))
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .weight(1f),
                                    verticalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    operationalSections.forEach { section ->
                                        val sectionModulesCount = section.moduleIds.mapNotNull { moduleMap[it] }.size
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .weight(1f),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            OperationalSectionCard(
                                                section = section,
                                                isSectionExpanded = false,
                                                sectionModulesCount = sectionModulesCount,
                                                onToggleExpand = { expandedSectionTitle = section.title }
                                            )
                                        }
                                    }
                                }
                            }
                        } else {
                            LazyColumn(
                                state = listState,
                                verticalArrangement = Arrangement.spacedBy(10.dp),
                                contentPadding = PaddingValues(bottom = 16.dp),
                                modifier = Modifier.fillMaxSize()
                            ) {
                                item(key = "main_header_logo_banner") {
                                    MainHeaderLogoBanner()
                                }

                                operationalSections.forEach { section ->
                                    val isSectionExpanded = (expandedSectionTitle == section.title)
                                    val sectionModules = section.moduleIds.mapNotNull { moduleMap[it] }

                                    item(key = "section_${section.title}") {
                                        OperationalSectionCard(
                                            section = section,
                                            isSectionExpanded = isSectionExpanded,
                                            sectionModulesCount = sectionModules.size,
                                            onToggleExpand = {
                                                expandedSectionTitle = if (isSectionExpanded) null else section.title
                                            }
                                        )
                                    }

                                    if (isSectionExpanded) {
                                        items(
                                            items = sectionModules,
                                            key = { module -> "module_${module.moduleId}" }
                                        ) { module ->
                                            Box(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(start = 6.dp, top = 3.dp, bottom = 3.dp)
                                            ) {
                                                ModuleHeaderCard(
                                                    module = module,
                                                    accentColor = section.color,
                                                    onClick = {
                                                        module.lessons.firstOrNull()?.let { lesson ->
                                                            onLessonClick(lesson)
                                                        }
                                                    }
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
        in 1..6 -> Icons.Default.SupportAgent to Color(0xFF818CF8)
        in 7..12 -> Icons.Default.DirectionsCar to Color(0xFF38BDF8)
        in 13..18 -> Icons.Default.Shield to Color(0xFF2DD4BF)
        in 19..28 -> Icons.Default.GppGood to Color(0xFFC084FC)
        29 -> Icons.Default.Warning to Color(0xFFFB923C)
        30 -> Icons.Default.MenuBook to Color(0xFFFACC15)
        else -> Icons.Default.MenuBook to Slate400
    }
}

@Composable
fun ModuleHeaderCard(
    module: Module,
    accentColor: Color = NeonTeal,
    onClick: () -> Unit
) {
    val (icon, sectionAccent) = getSectionVisuals(module.moduleId)
    val colorToUse = if (accentColor != NeonTeal) accentColor else sectionAccent
    val totalVocab = module.lessons.sumOf { it.vocabulary.size }
    val totalPhrases = module.lessons.sumOf { it.phrases.size }

    // Brightest near-white shade tinted with parent block color (92% White + 8% Block Color)
    val tintedTitleColor = remember(colorToUse) {
        Color(
            red = Color.White.red * 0.92f + colorToUse.red * 0.08f,
            green = Color.White.green * 0.92f + colorToUse.green * 0.08f,
            blue = Color.White.blue * 0.92f + colorToUse.blue * 0.08f,
            alpha = 1f
        )
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .testTag("module_card_${module.moduleId}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Slate900
        ),
        border = BorderStroke(1.2.dp, colorToUse.copy(alpha = 0.28f))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        listOf(
                            colorToUse.copy(alpha = 0.08f),
                            Color.Transparent
                        )
                    )
                )
                .padding(14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(colorToUse.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = null,
                            tint = colorToUse,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                    Column {
                        Text(
                            text = module.moduleName,
                            color = tintedTitleColor,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "$totalVocab Vocabulario • $totalPhrases Frases",
                            color = Slate200,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Entrar al módulo",
                    tint = colorToUse,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@Composable
fun LessonPathItem(
    lesson: Lesson,
    isLast: Boolean,
    accentColor: Color = NeonTeal,
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
                    .background(accentColor)
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
                text = "${lesson.vocabulary.size} Vocabulario • ${lesson.phrases.size} Frases",
                color = Slate400,
                fontSize = 12.sp
            )
        }
        Icon(
            imageVector = Icons.Default.PlayArrow,
            contentDescription = "Entrar a la lección",
            tint = accentColor,
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

@Composable
private fun MainHeaderLogoBanner(modifier: Modifier = Modifier) {
    Surface(
        color = Slate900.copy(alpha = 0.85f),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Brush.horizontalGradient(listOf(NeonTeal.copy(alpha = 0.5f), Color(0xFFFACC15).copy(alpha = 0.5f)))),
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 4.dp, bottom = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(54.dp)
                    .clip(CircleShape)
                    .background(Slate950)
                    .border(1.5.dp, Color(0xFFFACC15), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_app_icon_1785855600158),
                    contentDescription = "Escudo Policía Local Marbella",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "INGLÉS OPERATIVO POLICIAL",
                    color = Color(0xFFFACC15),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Formación práctica para la función policial",
                    color = Color.White,
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "6 Bloques Operativos · 30 Módulos",
                    color = NeonTeal,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Composable
private fun OperationalSectionCard(
    section: SyllabusSection,
    isSectionExpanded: Boolean,
    sectionModulesCount: Int,
    onToggleExpand: () -> Unit,
    modifier: Modifier = Modifier
) {
    val rotationAngle by animateFloatAsState(
        targetValue = if (isSectionExpanded) 180f else 0f,
        label = "section_chevron"
    )

    val gradientBrush = remember(section.gradientColors) {
        Brush.horizontalGradient(section.gradientColors)
    }

    Surface(
        color = Slate900,
        shape = RoundedCornerShape(14.dp),
        border = BorderStroke(
            width = if (isSectionExpanded) 1.6.dp else 1.2.dp,
            brush = if (isSectionExpanded) gradientBrush else Brush.horizontalGradient(
                section.gradientColors.map { it.copy(alpha = 0.55f) }
            )
        ),
        modifier = modifier
            .fillMaxWidth()
            .clickable { onToggleExpand() }
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        listOf(
                            section.gradientColors[0].copy(alpha = 0.12f),
                            section.gradientColors[1].copy(alpha = 0.03f)
                        )
                    )
                )
                .padding(horizontal = 16.dp, vertical = 14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = section.title,
                        style = TextStyle(
                            brush = gradientBrush,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.5.sp,
                            letterSpacing = 0.6.sp
                        )
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        text = "$sectionModulesCount módulos operativos",
                        color = Slate400,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null,
                    modifier = Modifier.rotate(rotationAngle),
                    tint = section.gradientColors[0]
                )
            }
        }
    }
}
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
import androidx.compose.ui.graphics.luminance
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
import com.example.data.AppSettings
import com.example.data.AppTheme
import com.example.data.RepeatMode
import com.example.data.SpeechSpeed
import com.example.data.VoiceGender
import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.ui.components.SettingsDialog
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
    settings: AppSettings = AppSettings(),
    onSearchQueryChange: (String) -> Unit,
    onModuleToggle: (Int) -> Unit,
    onLessonClick: (Lesson) -> Unit,
    onSpeakClick: (String) -> Unit,
    onEnterInfoMode: () -> Unit = {},
    onVoiceGenderChange: (VoiceGender) -> Unit = {},
    onSpeechSpeedChange: (SpeechSpeed) -> Unit = {},
    onRepeatModeChange: (RepeatMode) -> Unit = {},
    onAppThemeChange: (AppTheme) -> Unit = {}
) {
    var showEmergencySheet by remember { mutableStateOf(false) }
    var showSettingsDialog by remember { mutableStateOf(false) }
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

    if (showSettingsDialog) {
        SettingsDialog(
            settings = settings,
            onDismissRequest = { showSettingsDialog = false },
            onVoiceGenderChange = onVoiceGenderChange,
            onSpeechSpeedChange = onSpeechSpeedChange,
            onRepeatModeChange = onRepeatModeChange,
            onAppThemeChange = onAppThemeChange
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        val onSurfaceColor = MaterialTheme.colorScheme.onSurface
                        val titleAnnotated = remember(onSurfaceColor) {
                            buildAnnotatedString {
                                append("Soporte táctico multilingüe ")
                                withStyle(
                                    SpanStyle(
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = onSurfaceColor.copy(alpha = 0.75f)
                                    )
                                ) {
                                    append("V${com.example.BuildConfig.VERSION_NAME}")
                                }
                            }
                        }
                        Text(
                            text = titleAnnotated,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface,
                                fontSize = 14.sp
                            ),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "CP214 SCR · Policía Local Marbella",
                            color = MaterialTheme.colorScheme.primary,
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
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.secondary.copy(alpha = 0.15f))
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = "Información y Créditos",
                            tint = MaterialTheme.colorScheme.secondary,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    IconButton(
                        onClick = { showSettingsDialog = true },
                        modifier = Modifier
                            .testTag("settings_button")
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.15f))
                    ) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Configuración",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    IconButton(
                        onClick = { showEmergencySheet = true },
                        modifier = Modifier
                            .testTag("emergency_button")
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFEF4444).copy(alpha = 0.15f))
                    ) {
                        Icon(
                            imageVector = Icons.Default.FlashOn,
                            contentDescription = "Comandos de Emergencia",
                            tint = Color(0xFFEF4444),
                            modifier = Modifier.size(20.dp)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.90f),
                    titleContentColor = MaterialTheme.colorScheme.onSurface
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
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
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
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
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
                                    tint = MaterialTheme.colorScheme.primary,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    },
                    singleLine = true,
                    textStyle = MaterialTheme.typography.bodyMedium.copy(fontSize = 13.sp, color = MaterialTheme.colorScheme.onSurface),
                    shape = RoundedCornerShape(24.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = MaterialTheme.colorScheme.onSurface,
                        unfocusedTextColor = MaterialTheme.colorScheme.onSurface,
                        focusedContainerColor = MaterialTheme.colorScheme.surface,
                        unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                        focusedBorderColor = MaterialTheme.colorScheme.primary,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline,
                        cursorColor = MaterialTheme.colorScheme.primary
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

data class EmergencyCategory(
    val title: String,
    val commands: List<PhraseItem>
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmergencyBottomSheet(
    currentlyPlayingText: String?,
    onDismiss: () -> Unit,
    onSpeakClick: (String) -> Unit
) {
    val emergencyCategories = remember {
        listOf(
            EmergencyCategory(
                title = "CONTROL",
                commands = listOf(
                    PhraseItem("¡ALTO!", "STOP!", "stop"),
                    PhraseItem("¡ALTO AHÍ!", "STOP RIGHT THERE!", "stop rait deh"),
                    PhraseItem("¡QUÉDESE DONDE ESTÁ!", "STAY WHERE YOU ARE!", "stei weh yú ar"),
                    PhraseItem("¡QUÉDESE QUIETO!", "STAND STILL!", "stand stil"),
                    PhraseItem("¡SIGA MIS INSTRUCCIONES!", "FOLLOW MY INSTRUCTIONS!", "fólou mai instrákshons"),
                    PhraseItem("¡ESCUCHE!", "LISTEN TO ME!", "lísen tu mi"),
                    PhraseItem("¡MANTENGA LA CALMA!", "STAY CALM!", "stei cam"),
                    PhraseItem("¡MANTÉNGASE QUIETO!", "KEEP STILL!", "kiip stil")
                )
            ),
            EmergencyCategory(
                title = "MANOS Y POSICIONAMIENTO",
                commands = listOf(
                    PhraseItem("¡ENSÉÑEME LAS MANOS!", "SHOW ME YOUR HANDS!", "shou mi yor jands"),
                    PhraseItem("ENSÉÑEME LAS MANOS, POR FAVOR.", "SHOW ME YOUR HANDS, PLEASE.", "shou mi yor jands pliis"),
                    PhraseItem("MANTENGA LAS MANOS DONDE PUEDA VERLAS.", "KEEP YOUR HANDS WHERE I CAN SEE THEM.", "kiip yor jands weh ai can sii dem"),
                    PhraseItem("PONGA LAS MANOS SOBRE LA CABEZA.", "PUT YOUR HANDS ON YOUR HEAD.", "put yor jands on yor jed"),
                    PhraseItem("ENTRELACE LOS DEDOS.", "INTERLINK YOUR FINGERS.", "interlink yor fingers"),
                    PhraseItem("MANTENGA LAS MANOS ARRIBA.", "KEEP YOUR HANDS UP.", "kiip yor jands ap"),
                    PhraseItem("SAQUE LAS MANOS DE LOS BOLSILLOS.", "TAKE YOUR HANDS OUT OF YOUR POCKETS.", "teik yor jands aut ov yor póquets"),
                    PhraseItem("MANTENGA LAS MANOS FUERA DE LOS BOLSILLOS.", "KEEP YOUR HANDS OUT OF YOUR POCKETS.", "kiip yor jands aut ov yor póquets"),
                    PhraseItem("PONGA LAS MANOS DETRÁS DE LA ESPALDA.", "PUT YOUR HANDS BEHIND YOUR BACK.", "put yor jands bijáind yor bak"),
                    PhraseItem("MANTENGA LAS PALMAS HACIA FUERA.", "KEEP YOUR PALMS FACING OUT.", "kiip yor pams féising aut"),
                    PhraseItem("PALMAS HACIA ARRIBA.", "PALMS UP.", "pams ap"),
                    PhraseItem("EXTIENDA LOS BRAZOS HACIA LOS LADOS.", "PUT YOUR ARMS OUT TO THE SIDE.", "put yor arms aut tu de said"),
                    PhraseItem("DESE LA VUELTA.", "TURN AROUND.", "tern araund"),
                    PhraseItem("DESE LA VUELTA Y MIRE EN DIRECCIÓN CONTRARIA A MÍ.", "TURN AROUND AND FACE AWAY FROM ME.", "tern araund and feis awe from mi"),
                    PhraseItem("PÓNGASE DE RODILLAS.", "KNEEL DOWN.", "niil daun"),
                    PhraseItem("¡AL SUELO!", "GET DOWN ON THE GROUND.", "get daun on de graund"),
                    PhraseItem("TÚMBESE EN EL SUELO.", "LIE DOWN ON THE FLOOR.", "lai daun on de flor"),
                    PhraseItem("TÚMBESE BOCA ABAJO.", "LIE DOWN ON YOUR FRONT.", "lai daun on yor front"),
                    PhraseItem("MANTENGA LAS PIERNAS JUNTAS.", "KEEP YOUR LEGS TOGETHER.", "kiip yor legs tugéder"),
                    PhraseItem("CRUCE LOS PIES POR LOS TOBILLOS.", "CROSS YOUR FEET AT THE ANKLES.", "cross yor fiit at di áncols"),
                    PhraseItem("MIRE HACIA OTRO LADO.", "LOOK AWAY.", "luk awe"),
                    PhraseItem("NO SE LEVANTE.", "DO NOT GET UP.", "du not get ap")
                )
            ),
            EmergencyCategory(
                title = "MOVIMIENTO Y DISTANCIA",
                commands = listOf(
                    PhraseItem("RETROCEDA.", "STEP BACK.", "step bak"),
                    PhraseItem("ÉCHESE ATRÁS.", "MOVE BACK.", "muuv bak"),
                    PhraseItem("MANTÉNGASE ATRÁS.", "STAY BACK.", "stei bak"),
                    PhraseItem("MANTENGA LA DISTANCIA.", "KEEP YOUR DISTANCE.", "kiip yor distans"),
                    PhraseItem("ALÉJESE DE MÍ.", "MOVE AWAY FROM ME.", "muuv awe from mi"),
                    PhraseItem("DÉME ESPACIO.", "GIVE ME SOME SPACE.", "guiv mi sam speis"),
                    PhraseItem("ALÉJESE DEL VEHÍCULO.", "MOVE AWAY FROM THE VEHICLE.", "muuv awe from de víicol"),
                    PhraseItem("MANTENGA A TODOS ATRÁS.", "KEEP EVERYONE BACK.", "kiip évriuan bak")
                )
            ),
            EmergencyCategory(
                title = "VEHÍCULOS Y OBJETOS",
                commands = listOf(
                    PhraseItem("APAGUE EL MOTOR.", "TURN OFF THE ENGINE.", "tern of di ényin"),
                    PhraseItem("MANTENGA LAS MANOS EN EL VOLANTE.", "KEEP YOUR HANDS ON THE STEERING WHEEL.", "kiip yor jands on de stíring wiil"),
                    PhraseItem("NO ARRANQUE EL MOTOR.", "DO NOT START THE ENGINE.", "du not start di ényin"),
                    PhraseItem("SALGA DEL VEHÍCULO.", "STEP OUT OF THE VEHICLE.", "step aut ov de víicol"),
                    PhraseItem("SALGA DESPACIO.", "STEP OUT SLOWLY.", "step aut slóuli"),
                    PhraseItem("PERMANEZCA EN EL VEHÍCULO.", "STAY IN THE VEHICLE.", "stei in de víicol"),
                    PhraseItem("DEJE LA PUERTA ABIERTA.", "LEAVE THE DOOR OPEN.", "liiv de dor óupen"),
                    PhraseItem("DEJE EL OBJETO EN EL SUELO.", "PUT THE OBJECT DOWN.", "put di óbject daun"),
                    PhraseItem("SUELTE EL ARMA.", "DROP THE WEAPON.", "drop de wepon"),
                    PhraseItem("ALÉJESE DEL OBJETO.", "STEP AWAY FROM THE OBJECT.", "step awe from di óbject"),
                    PhraseItem("ALÉJESE DEL ARMA.", "MOVE AWAY FROM THE WEAPON.", "muuv awe from de wepon"),
                    PhraseItem("NO META LAS MANOS EN LOS BOLSILLOS.", "DO NOT REACH INTO YOUR POCKETS.", "du not riich intu yor póquets")
                )
            ),
            EmergencyCategory(
                title = "RESISTENCIA Y CUMPLIMIENTO",
                commands = listOf(
                    PhraseItem("DEJE DE OPONER RESISTENCIA.", "STOP RESISTING.", "stop risísting"),
                    PhraseItem("DEJE DE PELEAR.", "STOP FIGHTING.", "stop fáiting"),
                    PhraseItem("COLABORE CONMIGO.", "COOPERATE WITH ME.", "couópereit wid mi"),
                    PhraseItem("NECESITO QUE COLABORE CONMIGO.", "I NEED YOU TO COOPERATE WITH ME.", "ai niid yu tu couópereit wid mi"),
                    PhraseItem("SIGA MIS INSTRUCCIONES.", "FOLLOW MY INSTRUCTIONS.", "fólou mai instrákshons"),
                    PhraseItem("MANTÉNGASE QUIETO.", "KEEP STILL.", "kiip stil")
                )
            ),
            EmergencyCategory(
                title = "DESESCALADA",
                commands = listOf(
                    PhraseItem("QUIERO AYUDARLE.", "I WANT TO HELP YOU.", "ai uont tu jelp yu"),
                    PhraseItem("ESTOY AQUÍ PARA AYUDARLE.", "I AM HERE TO HELP YOU.", "ai am jir tu jelp yu"),
                    PhraseItem("ESCUCHE LO QUE LE ESTOY DICIENDO.", "LISTEN TO WHAT I AM SAYING.", "lísen tu uot ai am séiin"),
                    PhraseItem("RESPIRE Y ESCÚCHEME.", "TAKE A BREATH AND LISTEN TO ME.", "teik a breth and lísen tu mi"),
                    PhraseItem("NECESITO QUE SE CALME.", "I NEED YOU TO CALM DOWN.", "ai niid yu tu cam daun"),
                    PhraseItem("DÍGAME QUÉ ESTÁ PASANDO.", "TELL ME WHAT IS GOING ON.", "tel mi uot is góuin on"),
                    PhraseItem("DÍGAME QUÉ HA OCURRIDO.", "TELL ME WHAT HAS HAPPENED.", "tel mi uot jas jápend"),
                    PhraseItem("LE EXPLICARÉ QUÉ ESTÁ PASANDO.", "I WILL EXPLAIN WHAT IS HAPPENING.", "ai wil eksplein uot is jápening"),
                    PhraseItem("LE DIRÉ QUÉ VA A PASAR AHORA.", "I WILL TELL YOU WHAT HAPPENS NEXT.", "ai wil tel yu uot jápens nekst"),
                    PhraseItem("ESCUCHO LO QUE ME ESTÁ DICIENDO.", "I HEAR WHAT YOU ARE SAYING.", "ai jir uot yu ar séiin"),
                    PhraseItem("LE ENTIENDO, PERO...", "I UNDERSTAND YOU, BUT...", "ai anderstánd yu, bat"),
                    PhraseItem("ENTIENDO LO QUE ME ESTÁ DICIENDO, PERO...", "I APPRECIATE WHAT YOU ARE SAYING, BUT...", "ai apríshieit uot yu ar séiin, bat"),
                    PhraseItem("DÉME ESPACIO Y PODEMOS HABLAR.", "GIVE ME SOME SPACE AND WE CAN TALK.", "guiv mi sam speis and wi can tok")
                )
            )
        )
    }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        containerColor = MaterialTheme.colorScheme.surface,
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
                    Icon(Icons.Default.Close, contentDescription = "Cerrar", tint = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                contentPadding = PaddingValues(bottom = 28.dp)
            ) {
                emergencyCategories.forEach { category ->
                    item(key = "cat_${category.title}") {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp, bottom = 4.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .background(Color(0xFFEF4444).copy(alpha = 0.15f))
                                .border(1.dp, Color(0xFFEF4444).copy(alpha = 0.4f), RoundedCornerShape(6.dp))
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = "• ${category.title}",
                                color = Color(0xFFEF4444),
                                fontWeight = FontWeight.Black,
                                fontSize = 13.sp,
                                letterSpacing = 0.8.sp
                            )
                        }
                    }

                    items(
                        items = category.commands,
                        key = { cmd -> "cmd_${category.title}_${cmd.en}" }
                    ) { command ->
                        val isPlaying = currentlyPlayingText == command.en
                        Surface(
                            color = MaterialTheme.colorScheme.surfaceVariant,
                            shape = RoundedCornerShape(12.dp),
                            border = BorderStroke(1.2.dp, if (isPlaying) MaterialTheme.colorScheme.primary else Color(0xFFEF4444).copy(alpha = 0.3f)),
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
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontWeight = FontWeight.Black,
                                        fontSize = 16.sp
                                    )
                                    if (command.phonetic.isNotEmpty()) {
                                        Text(
                                            text = command.phonetic,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                                            fontSize = 12.sp,
                                            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                                        )
                                    }
                                    Text(
                                        text = command.es,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                                        fontSize = 13.sp
                                    )
                                }
                                IconButton(
                                    onClick = { onSpeakClick(command.en) },
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .background(if (isPlaying) MaterialTheme.colorScheme.primary else Color(0xFFEF4444).copy(alpha = 0.15f))
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.VolumeUp,
                                        contentDescription = "Escuchar",
                                        tint = if (isPlaying) MaterialTheme.colorScheme.onPrimary else Color(0xFFEF4444)
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

    val isLight = MaterialTheme.colorScheme.background.luminance() > 0.5f
    val tintedTitleColor = remember(colorToUse, isLight) {
        if (isLight) {
            Color(
                red = colorToUse.red * 0.45f,
                green = colorToUse.green * 0.45f,
                blue = colorToUse.blue * 0.45f,
                alpha = 1f
            )
        } else {
            Color(
                red = Color.White.red * 0.92f + colorToUse.red * 0.08f,
                green = Color.White.green * 0.92f + colorToUse.green * 0.08f,
                blue = Color.White.blue * 0.92f + colorToUse.blue * 0.08f,
                alpha = 1f
            )
        }
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .testTag("module_card_${module.moduleId}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        border = BorderStroke(1.2.dp, colorToUse.copy(alpha = 0.35f))
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
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
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
                        .background(MaterialTheme.colorScheme.outline.copy(alpha = 0.4f))
                )
            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = lesson.lessonTitle,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )
            Text(
                text = "${lesson.vocabulary.size} Vocabulario • ${lesson.phrases.size} Frases",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
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
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(
            width = 1.dp,
            color = if (isPlaying) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
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
                            .background(if (result.isVocabulary) MaterialTheme.colorScheme.primary.copy(alpha = 0.15f) else MaterialTheme.colorScheme.surfaceVariant)
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = if (result.isVocabulary) "VOCABULARIO" else "FRASE TÁCTICA",
                            color = if (result.isVocabulary) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "${result.moduleName.uppercase()} • ${result.lessonTitle.uppercase()}",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.5.sp
                    )
                }
                if (isPlaying) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(4.dp))
                            .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.2f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = "Reproduciendo...",
                            color = MaterialTheme.colorScheme.primary,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = result.phrase.en.uppercase(),
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                lineHeight = 24.sp
            )

            if (result.phrase.phonetic.isNotEmpty()) {
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = result.phrase.phonetic,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 13.sp,
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                )
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = result.phrase.es,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 14.sp,
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                fontWeight = FontWeight.Normal,
                lineHeight = 18.sp
            )

            Spacer(modifier = Modifier.height(14.dp))

            Button(
                onClick = { onSpeakClick(result.phrase.en) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isPlaying) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                    contentColor = if (isPlaying) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.primary
                ),
                border = BorderStroke(1.2.dp, if (isPlaying) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)),
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
                        tint = if (isPlaying) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.primary,
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
        color = MaterialTheme.colorScheme.surface.copy(alpha = 0.90f),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Brush.horizontalGradient(listOf(MaterialTheme.colorScheme.primary.copy(alpha = 0.5f), Color(0xFFFACC15).copy(alpha = 0.5f)))),
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
                    .background(MaterialTheme.colorScheme.surfaceVariant)
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
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Formación práctica para la función policial",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "6 Bloques Operativos · 30 Módulos",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
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
        color = MaterialTheme.colorScheme.surface,
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
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
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
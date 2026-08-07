package com.example.ui.screens

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.data.model.Lesson
import com.example.data.model.Module
import com.example.data.model.PhraseItem
import com.example.data.model.VocabularyItem
import com.example.ui.components.TacticalBackground
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ManagerScreen(
    modules: List<Module>,
    onBackClick: () -> Unit,
    onAddLesson: (moduleId: Int, title: String, vocabulary: List<VocabularyItem>, phrases: List<PhraseItem>, tips: List<String>) -> Unit,
    onUpdateLesson: (moduleId: Int, lessonId: Int, title: String, vocabulary: List<VocabularyItem>, phrases: List<PhraseItem>, tips: List<String>) -> Unit,
    onDeleteLesson: (moduleId: Int, lessonId: Int) -> Unit,
    onImportJson: (String) -> Boolean,
    onExportJson: () -> String,
    onResetToDefaults: () -> Boolean
) {
    val context = LocalContext.current
    val clipboardManager = LocalClipboardManager.current

    var selectedTab by remember { mutableStateOf(0) } // 0: Lessons, 1: Import/Export

    // Dialog state
    var showEditDialog by remember { mutableStateOf(false) }
    var dialogModuleId by remember { mutableStateOf(0) }
    var dialogLessonId by remember { mutableStateOf<Int?>(null) } // null = Add, non-null = Edit
    var dialogLessonTitle by remember { mutableStateOf("") }
    val dialogVocabulary = remember { mutableStateListOf<VocabularyItem>() }
    val dialogPhrases = remember { mutableStateListOf<PhraseItem>() }
    val dialogTips = remember { mutableStateListOf<String>() }
    var dialogSubTab by remember { mutableStateOf(1) } // Default to Phrases tab (1) for test compatibility

    var importTextState by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "Gestor de Base de Datos",
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        )
                        Text(
                            text = "Administración Local Desacoplada",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = Slate400,
                                fontWeight = FontWeight.Medium
                            )
                        )
                    }
                },
                navigationIcon = {
                    IconButton(
                        onClick = onBackClick,
                        modifier = Modifier.testTag("manager_back_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Volver",
                            tint = NeonTeal
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
                modifier = Modifier.fillMaxSize()
            ) {
            // Tabs
            TabRow(
                selectedTabIndex = selectedTab,
                containerColor = Slate900,
                contentColor = NeonTeal,
                indicator = { tabPositions ->
                    TabRowDefaults.SecondaryIndicator(
                        Modifier.tabIndicatorOffset(tabPositions[selectedTab]),
                        color = NeonTeal
                    )
                }
            ) {
                Tab(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    text = { Text("Estructura", fontWeight = FontWeight.Bold) },
                    modifier = Modifier.testTag("tab_structure")
                )
                Tab(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    text = { Text("Importar / Exportar", fontWeight = FontWeight.Bold) },
                    modifier = Modifier.testTag("tab_json")
                )
            }

            if (selectedTab == 0) {
                // Structure Mode
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp, vertical = 12.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Seleccione módulo para añadir lección:",
                            color = Slate300,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        items(modules) { module ->
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                colors = CardDefaults.cardColors(containerColor = Slate900),
                                border = BorderStroke(1.dp, Slate800)
                            ) {
                                Column(modifier = Modifier.padding(14.dp)) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = module.moduleName,
                                            color = NeonTeal,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 15.sp
                                        )
                                        IconButton(
                                            onClick = {
                                                dialogModuleId = module.moduleId
                                                dialogLessonId = null
                                                dialogLessonTitle = ""
                                                dialogVocabulary.clear()
                                                dialogVocabulary.add(VocabularyItem("", ""))
                                                dialogPhrases.clear()
                                                dialogPhrases.add(PhraseItem("", "")) // Starts with one empty phrase
                                                dialogTips.clear()
                                                dialogTips.add("")
                                                dialogSubTab = 1 // Default to Phrases tab
                                                showEditDialog = true
                                            },
                                            modifier = Modifier
                                                .size(36.dp)
                                                .background(
                                                    RadiantBlue.copy(alpha = 0.15f),
                                                    RoundedCornerShape(8.dp)
                                                )
                                                .testTag("add_lesson_to_module_${module.moduleId}")
                                        ) {
                                            Icon(
                                                imageVector = Icons.Default.Add,
                                                contentDescription = "Añadir Lección",
                                                tint = RadiantBlue,
                                                modifier = Modifier.size(20.dp)
                                            )
                                        }
                                    }

                                    Spacer(modifier = Modifier.height(8.dp))

                                    if (module.lessons.isEmpty()) {
                                        Text(
                                            text = "No hay lecciones. Pulse el botón + para añadir una.",
                                            color = Slate400,
                                            fontSize = 12.sp,
                                            modifier = Modifier.padding(vertical = 8.dp)
                                        )
                                    } else {
                                        module.lessons.forEach { lesson ->
                                            Row(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(vertical = 6.dp)
                                                    .border(1.dp, Slate800, RoundedCornerShape(8.dp))
                                                    .background(Slate950, RoundedCornerShape(8.dp))
                                                    .padding(horizontal = 12.dp, vertical = 8.dp),
                                                verticalAlignment = Alignment.CenterVertically,
                                                horizontalArrangement = Arrangement.SpaceBetween
                                            ) {
                                                Column(modifier = Modifier.weight(1f)) {
                                                    Text(
                                                        text = lesson.lessonTitle,
                                                        color = Color.White,
                                                        fontWeight = FontWeight.SemiBold,
                                                        fontSize = 13.sp
                                                    )
                                                    Text(
                                                        text = "${lesson.vocabulary.size} Vocab • ${lesson.phrases.size} Frases • ${lesson.tips.size} Consejos",
                                                        color = Slate400,
                                                        fontSize = 11.sp
                                                    )
                                                }
                                                Row {
                                                    IconButton(
                                                        onClick = {
                                                            dialogModuleId = module.moduleId
                                                            dialogLessonId = lesson.lessonId
                                                            dialogLessonTitle = lesson.lessonTitle
                                                            
                                                            dialogVocabulary.clear()
                                                            dialogVocabulary.addAll(lesson.vocabulary)
                                                            if (dialogVocabulary.isEmpty()) dialogVocabulary.add(VocabularyItem("", ""))
                                                            
                                                            dialogPhrases.clear()
                                                            dialogPhrases.addAll(lesson.phrases)
                                                            if (dialogPhrases.isEmpty()) dialogPhrases.add(PhraseItem("", ""))
                                                            
                                                            dialogTips.clear()
                                                            dialogTips.addAll(lesson.tips)
                                                            if (dialogTips.isEmpty()) dialogTips.add("")
                                                            
                                                            dialogSubTab = 1 // Default to Phrases tab
                                                            showEditDialog = true
                                                        },
                                                        modifier = Modifier.testTag("edit_lesson_${lesson.lessonId}")
                                                    ) {
                                                        Icon(
                                                            imageVector = Icons.Default.Edit,
                                                            contentDescription = "Editar",
                                                            tint = NeonTeal,
                                                            modifier = Modifier.size(20.dp)
                                                        )
                                                    }
                                                    IconButton(
                                                        onClick = {
                                                            onDeleteLesson(module.moduleId, lesson.lessonId)
                                                            Toast.makeText(context, "Lección eliminada", Toast.LENGTH_SHORT).show()
                                                        },
                                                        modifier = Modifier.testTag("delete_lesson_${lesson.lessonId}")
                                                    ) {
                                                        Icon(
                                                            imageVector = Icons.Default.Delete,
                                                            contentDescription = "Eliminar",
                                                            tint = NeonOrange,
                                                            modifier = Modifier.size(20.dp)
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
            } else {
                // Import/Export Screen
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "Compartición local sin servidores. Puede copiar su base de datos actual para compartirla o pegar un archivo JSON para importarla.",
                        color = Slate400,
                        fontSize = 13.sp,
                        lineHeight = 18.sp
                    )

                    // Export actions
                    Button(
                        onClick = {
                            val json = onExportJson()
                            clipboardManager.setText(AnnotatedString(json))
                            Toast.makeText(context, "Copiado al portapapeles", Toast.LENGTH_SHORT).show()
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = RadiantBlue),
                        shape = RoundedCornerShape(24.dp),
                        modifier = Modifier.fillMaxWidth().height(48.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.ContentCopy, contentDescription = null)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("COPIAR JSON DE BASE DE DATOS", fontWeight = FontWeight.Bold)
                        }
                    }

                    // Import Text field
                    Text(
                        text = "Pegar JSON para importar:",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )

                    OutlinedTextField(
                        value = importTextState,
                        onValueChange = { importTextState = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .testTag("json_import_field"),
                        placeholder = {
                            Text(
                                "Pega aquí el código JSON estructurado de módulos...",
                                color = Slate400,
                                fontSize = 13.sp
                            )
                        },
                        textStyle = LocalTextStyle.current.copy(fontSize = 12.sp, fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedBorderColor = NeonTeal,
                            unfocusedBorderColor = Slate800,
                            focusedContainerColor = Slate900,
                            unfocusedContainerColor = Slate900
                        )
                    )

                    Button(
                        onClick = {
                            if (importTextState.trim().isEmpty()) {
                                Toast.makeText(context, "El campo JSON está vacío", Toast.LENGTH_SHORT).show()
                                return@Button
                            }
                            val success = onImportJson(importTextState)
                            if (success) {
                                Toast.makeText(context, "Base de datos importada correctamente", Toast.LENGTH_SHORT).show()
                                importTextState = ""
                            } else {
                                Toast.makeText(context, "Error al procesar JSON. Formato inválido.", Toast.LENGTH_LONG).show()
                            }
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = CustomGreen),
                        shape = RoundedCornerShape(24.dp),
                        modifier = Modifier.fillMaxWidth().height(48.dp).testTag("import_json_button")
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Upload, contentDescription = null)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("IMPORTAR Y APLICAR JSON", fontWeight = FontWeight.Bold)
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    HorizontalDivider(color = Slate800)

                    // Reset option
                    Text(
                        text = "Restablecer Datos de Fábrica",
                        color = NeonOrange,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )

                    Button(
                        onClick = {
                            val success = onResetToDefaults()
                            if (success) {
                                Toast.makeText(context, "Restaurado con éxito", Toast.LENGTH_SHORT).show()
                            }
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        shape = RoundedCornerShape(24.dp),
                        border = BorderStroke(1.2.dp, NeonOrange),
                        modifier = Modifier.fillMaxWidth().height(48.dp).testTag("reset_defaults_button")
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Refresh, contentDescription = null, tint = NeonOrange)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("RESTAURAR LECCIONES ORIGINALES", color = NeonOrange, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }

    // Full featured Edit/Add Lesson dialog split into tabs
    if (showEditDialog) {
        Dialog(onDismissRequest = { showEditDialog = false }) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.9f)
                    .testTag("lesson_editor_dialog"),
                shape = RoundedCornerShape(16.dp),
                color = Slate900,
                border = BorderStroke(1.dp, Slate800)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Text(
                        text = if (dialogLessonId == null) "Añadir Nueva Lección" else "Editar Lección",
                        color = NeonTeal,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Title field
                    OutlinedTextField(
                        value = dialogLessonTitle,
                        onValueChange = { dialogLessonTitle = it },
                        label = { Text("Título de la Lección") },
                        modifier = Modifier.fillMaxWidth().testTag("lesson_title_field"),
                        singleLine = true,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            focusedBorderColor = NeonTeal,
                            unfocusedBorderColor = Slate800
                        )
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Dialog Sub-Tabs: Vocab, Phrases, Tips
                    TabRow(
                        selectedTabIndex = dialogSubTab,
                        containerColor = Slate950,
                        contentColor = NeonTeal,
                        modifier = Modifier.border(1.dp, Slate800, RoundedCornerShape(8.dp))
                    ) {
                        Tab(
                            selected = dialogSubTab == 0,
                            onClick = { dialogSubTab = 0 },
                            text = { Text("Vocab", fontSize = 11.sp, fontWeight = FontWeight.Bold) },
                            modifier = Modifier.testTag("dialog_tab_vocab")
                        )
                        Tab(
                            selected = dialogSubTab == 1,
                            onClick = { dialogSubTab = 1 },
                            text = { Text("Frases", fontSize = 11.sp, fontWeight = FontWeight.Bold) },
                            modifier = Modifier.testTag("dialog_tab_phrases")
                        )
                        Tab(
                            selected = dialogSubTab == 2,
                            onClick = { dialogSubTab = 2 },
                            text = { Text("Consejos", fontSize = 11.sp, fontWeight = FontWeight.Bold) },
                            modifier = Modifier.testTag("dialog_tab_tips")
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // List content depending on active sub-tab
                    Box(modifier = Modifier.weight(1f)) {
                        when (dialogSubTab) {
                            0 -> {
                                // Vocabulary editing tab
                                Column(modifier = Modifier.fillMaxSize()) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "Vocabulario (${dialogVocabulary.size})",
                                            color = Color.White,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 14.sp
                                        )
                                        IconButton(
                                            onClick = { dialogVocabulary.add(VocabularyItem("", "", "")) },
                                            modifier = Modifier
                                                .size(32.dp)
                                                .background(NeonTeal.copy(alpha = 0.15f), CircleShape)
                                                .testTag("add_vocab_dialog_button")
                                        ) {
                                            Icon(Icons.Default.Add, contentDescription = "Añadir Vocab", tint = NeonTeal, modifier = Modifier.size(18.dp))
                                        }
                                    }

                                    Spacer(modifier = Modifier.height(8.dp))

                                    LazyColumn(
                                        modifier = Modifier.weight(1f),
                                        verticalArrangement = Arrangement.spacedBy(10.dp)
                                    ) {
                                        itemsIndexed(dialogVocabulary) { index, vocab ->
                                            Column(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .border(1.dp, Slate800, RoundedCornerShape(8.dp))
                                                    .background(Slate950)
                                                    .padding(8.dp)
                                            ) {
                                                Row(
                                                    modifier = Modifier.fillMaxWidth(),
                                                    horizontalArrangement = Arrangement.SpaceBetween,
                                                    verticalAlignment = Alignment.CenterVertically
                                                ) {
                                                    Text(
                                                        text = "Vocabulario #${index + 1}",
                                                        color = Slate400,
                                                        fontSize = 11.sp,
                                                        fontWeight = FontWeight.Bold
                                                    )
                                                    IconButton(
                                                        onClick = { dialogVocabulary.removeAt(index) },
                                                        modifier = Modifier.size(24.dp).testTag("delete_vocab_dialog_button_$index")
                                                    ) {
                                                        Icon(Icons.Default.Delete, contentDescription = null, tint = NeonOrange, modifier = Modifier.size(16.dp))
                                                    }
                                                }

                                                Spacer(modifier = Modifier.height(4.dp))

                                                OutlinedTextField(
                                                    value = vocab.es,
                                                    onValueChange = { dialogVocabulary[index] = vocab.copy(es = it) },
                                                    label = { Text("Texto Español") },
                                                    modifier = Modifier.fillMaxWidth().testTag("vocab_es_field_$index"),
                                                    singleLine = true,
                                                    colors = OutlinedTextFieldDefaults.colors(
                                                        focusedTextColor = Color.White,
                                                        unfocusedTextColor = Color.White,
                                                        focusedBorderColor = RadiantBlue,
                                                        unfocusedBorderColor = Slate800
                                                    )
                                                )

                                                Spacer(modifier = Modifier.height(6.dp))

                                                OutlinedTextField(
                                                    value = vocab.en,
                                                    onValueChange = { dialogVocabulary[index] = vocab.copy(en = it) },
                                                    label = { Text("Texto Inglés (UK)") },
                                                    modifier = Modifier.fillMaxWidth().testTag("vocab_en_field_$index"),
                                                    singleLine = true,
                                                    colors = OutlinedTextFieldDefaults.colors(
                                                        focusedTextColor = Color.White,
                                                        unfocusedTextColor = Color.White,
                                                        focusedBorderColor = NeonTeal,
                                                        unfocusedBorderColor = Slate800
                                                    )
                                                )

                                                Spacer(modifier = Modifier.height(6.dp))

                                                OutlinedTextField(
                                                    value = vocab.phonetic,
                                                    onValueChange = { dialogVocabulary[index] = vocab.copy(phonetic = it) },
                                                    label = { Text("Pronunciación Fonética (Opcional)") },
                                                    modifier = Modifier.fillMaxWidth().testTag("vocab_phonetic_field_$index"),
                                                    singleLine = true,
                                                    colors = OutlinedTextFieldDefaults.colors(
                                                        focusedTextColor = Color.White,
                                                        unfocusedTextColor = Color.White,
                                                        focusedBorderColor = NeonTeal,
                                                        unfocusedBorderColor = Slate800
                                                    )
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                            1 -> {
                                // Phrases editing tab
                                Column(modifier = Modifier.fillMaxSize()) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "Frases Tácticas (${dialogPhrases.size})",
                                            color = Color.White,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 14.sp
                                        )
                                        IconButton(
                                            onClick = { dialogPhrases.add(PhraseItem("", "", "")) },
                                            modifier = Modifier
                                                .size(32.dp)
                                                .background(NeonTeal.copy(alpha = 0.15f), CircleShape)
                                                .testTag("add_phrase_dialog_button")
                                        ) {
                                            Icon(Icons.Default.Add, contentDescription = "Añadir Frase", tint = NeonTeal, modifier = Modifier.size(18.dp))
                                        }
                                    }

                                    Spacer(modifier = Modifier.height(8.dp))

                                    LazyColumn(
                                        modifier = Modifier.weight(1f),
                                        verticalArrangement = Arrangement.spacedBy(10.dp)
                                    ) {
                                        itemsIndexed(dialogPhrases) { index, phrase ->
                                            Column(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .border(1.dp, Slate800, RoundedCornerShape(8.dp))
                                                    .background(Slate950)
                                                    .padding(8.dp)
                                            ) {
                                                Row(
                                                    modifier = Modifier.fillMaxWidth(),
                                                    horizontalArrangement = Arrangement.SpaceBetween,
                                                    verticalAlignment = Alignment.CenterVertically
                                                ) {
                                                    Text(
                                                        text = "Frase #${index + 1}",
                                                        color = Slate400,
                                                        fontSize = 11.sp,
                                                        fontWeight = FontWeight.Bold
                                                    )
                                                    IconButton(
                                                        onClick = { dialogPhrases.removeAt(index) },
                                                        modifier = Modifier.size(24.dp).testTag("delete_phrase_dialog_button_$index")
                                                    ) {
                                                        Icon(Icons.Default.Delete, contentDescription = null, tint = NeonOrange, modifier = Modifier.size(16.dp))
                                                    }
                                                }

                                                Spacer(modifier = Modifier.height(4.dp))

                                                OutlinedTextField(
                                                    value = phrase.es,
                                                    onValueChange = { dialogPhrases[index] = phrase.copy(es = it) },
                                                    label = { Text("Texto Español") },
                                                    modifier = Modifier.fillMaxWidth().testTag("phrase_es_field_$index"),
                                                    singleLine = true,
                                                    colors = OutlinedTextFieldDefaults.colors(
                                                        focusedTextColor = Color.White,
                                                        unfocusedTextColor = Color.White,
                                                        focusedBorderColor = RadiantBlue,
                                                        unfocusedBorderColor = Slate800
                                                    )
                                                )

                                                Spacer(modifier = Modifier.height(6.dp))

                                                OutlinedTextField(
                                                    value = phrase.en,
                                                    onValueChange = { dialogPhrases[index] = phrase.copy(en = it) },
                                                    label = { Text("Texto Inglés (UK)") },
                                                    modifier = Modifier.fillMaxWidth().testTag("phrase_en_field_$index"),
                                                    singleLine = true,
                                                    colors = OutlinedTextFieldDefaults.colors(
                                                        focusedTextColor = Color.White,
                                                        unfocusedTextColor = Color.White,
                                                        focusedBorderColor = NeonTeal,
                                                        unfocusedBorderColor = Slate800
                                                    )
                                                )

                                                Spacer(modifier = Modifier.height(6.dp))

                                                OutlinedTextField(
                                                    value = phrase.phonetic,
                                                    onValueChange = { dialogPhrases[index] = phrase.copy(phonetic = it) },
                                                    label = { Text("Pronunciación Fonética (Opcional)") },
                                                    modifier = Modifier.fillMaxWidth().testTag("phrase_phonetic_field_$index"),
                                                    singleLine = true,
                                                    colors = OutlinedTextFieldDefaults.colors(
                                                        focusedTextColor = Color.White,
                                                        unfocusedTextColor = Color.White,
                                                        focusedBorderColor = NeonTeal,
                                                        unfocusedBorderColor = Slate800
                                                    )
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                            2 -> {
                                // Tips editing tab
                                Column(modifier = Modifier.fillMaxSize()) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "Consejos Operativos (${dialogTips.size})",
                                            color = Color.White,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 14.sp
                                        )
                                        IconButton(
                                            onClick = { dialogTips.add("") },
                                            modifier = Modifier
                                                .size(32.dp)
                                                .background(NeonTeal.copy(alpha = 0.15f), CircleShape)
                                                .testTag("add_tip_dialog_button")
                                        ) {
                                            Icon(Icons.Default.Add, contentDescription = "Añadir Consejo", tint = NeonTeal, modifier = Modifier.size(18.dp))
                                        }
                                    }

                                    Spacer(modifier = Modifier.height(8.dp))

                                    LazyColumn(
                                        modifier = Modifier.weight(1f),
                                        verticalArrangement = Arrangement.spacedBy(10.dp)
                                    ) {
                                        itemsIndexed(dialogTips) { index, tip ->
                                            Column(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .border(1.dp, Slate800, RoundedCornerShape(8.dp))
                                                    .background(Slate950)
                                                    .padding(8.dp)
                                            ) {
                                                Row(
                                                    modifier = Modifier.fillMaxWidth(),
                                                    horizontalArrangement = Arrangement.SpaceBetween,
                                                    verticalAlignment = Alignment.CenterVertically
                                                ) {
                                                    Text(
                                                        text = "Consejo #${index + 1}",
                                                        color = Slate400,
                                                        fontSize = 11.sp,
                                                        fontWeight = FontWeight.Bold
                                                    )
                                                    IconButton(
                                                        onClick = { dialogTips.removeAt(index) },
                                                        modifier = Modifier.size(24.dp).testTag("delete_tip_dialog_button_$index")
                                                    ) {
                                                        Icon(Icons.Default.Delete, contentDescription = null, tint = NeonOrange, modifier = Modifier.size(16.dp))
                                                    }
                                                }

                                                Spacer(modifier = Modifier.height(4.dp))

                                                OutlinedTextField(
                                                    value = tip,
                                                    onValueChange = { dialogTips[index] = it },
                                                    label = { Text("Consejo Operativo / Táctico") },
                                                    modifier = Modifier.fillMaxWidth().testTag("tip_field_$index"),
                                                    colors = OutlinedTextFieldDefaults.colors(
                                                        focusedTextColor = Color.White,
                                                        unfocusedTextColor = Color.White,
                                                        focusedBorderColor = NeonTeal,
                                                        unfocusedBorderColor = Slate800
                                                    )
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Action buttons
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        TextButton(onClick = { showEditDialog = false }) {
                            Text("CANCELAR", color = Slate400, fontWeight = FontWeight.Bold)
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Button(
                            onClick = {
                                if (dialogLessonTitle.trim().isEmpty()) {
                                    Toast.makeText(context, "El título es obligatorio", Toast.LENGTH_SHORT).show()
                                    return@Button
                                }
                                
                                val cleanVocab = dialogVocabulary.filter { it.es.trim().isNotEmpty() || it.en.trim().isNotEmpty() }
                                val cleanPhrases = dialogPhrases.filter { it.es.trim().isNotEmpty() || it.en.trim().isNotEmpty() }
                                val cleanTips = dialogTips.filter { it.trim().isNotEmpty() }

                                if (cleanPhrases.isEmpty() && cleanVocab.isEmpty()) {
                                    Toast.makeText(context, "Añada al menos un elemento de vocabulario o frase válido", Toast.LENGTH_SHORT).show()
                                    return@Button
                                }

                                val lessonId = dialogLessonId
                                if (lessonId == null) {
                                    onAddLesson(dialogModuleId, dialogLessonTitle, cleanVocab, cleanPhrases, cleanTips)
                                    Toast.makeText(context, "Lección creada con éxito", Toast.LENGTH_SHORT).show()
                                } else {
                                    onUpdateLesson(dialogModuleId, lessonId, dialogLessonTitle, cleanVocab, cleanPhrases, cleanTips)
                                    Toast.makeText(context, "Lección actualizada", Toast.LENGTH_SHORT).show()
                                }
                                showEditDialog = false
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = NeonTeal),
                            shape = RoundedCornerShape(24.dp),
                            modifier = Modifier.testTag("save_lesson_dialog_button")
                        ) {
                            Text("GUARDAR", color = Slate950, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
}
}
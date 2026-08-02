package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.model.Lesson
import com.example.data.model.PhraseItem
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonScreen(
    lesson: Lesson,
    currentlyPlayingText: String?,
    onBackClick: () -> Unit,
    onSpeakClick: (String) -> Unit
) {
    var selectedTabIndex by remember { mutableStateOf(0) }
    var isFlashcardMode by remember { mutableStateOf(false) }
    val tabs = listOf(
        stringResource(R.string.tab_vocabulary),
        stringResource(R.string.tab_phrases),
        stringResource(R.string.tab_tips)
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = lesson.lessonTitle,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        )
                        Text(
                            text = "Entrenamiento Táctico • 3 Secciones",
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
                        modifier = Modifier.testTag("back_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = stringResource(R.string.back),
                            tint = NeonTeal
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = { isFlashcardMode = !isFlashcardMode },
                        modifier = Modifier.testTag("flashcard_toggle_button")
                    ) {
                        Icon(
                            imageVector = if (isFlashcardMode) Icons.Default.VisibilityOff else Icons.Default.Visibility,
                            contentDescription = "Modo Flashcards",
                            tint = if (isFlashcardMode) NeonTeal else Slate400
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
        ) {
            TabRow(
                selectedTabIndex = selectedTabIndex,
                containerColor = Color(0xFF0F172A),
                contentColor = Color(0xFF0D9488),
                indicator = { tabPositions ->
                    TabRowDefaults.SecondaryIndicator(
                        Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                        color = Color(0xFF0D9488)
                    )
                },
                divider = {
                    HorizontalDivider(color = Slate800, thickness = 0.5.dp)
                }
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        text = {
                            Text(
                                text = title,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (selectedTabIndex == index) Color(0xFF0D9488) else Slate400
                            )
                        },
                        modifier = Modifier.testTag("lesson_tab_$index")
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {
                when (selectedTabIndex) {
                    0 -> VocabularySection(
                        lesson = lesson,
                        currentlyPlayingText = currentlyPlayingText,
                        isFlashcardMode = isFlashcardMode,
                        onSpeakClick = onSpeakClick
                    )
                    1 -> PhrasesSection(
                        lesson = lesson,
                        currentlyPlayingText = currentlyPlayingText,
                        isFlashcardMode = isFlashcardMode,
                        onSpeakClick = onSpeakClick
                    )
                    2 -> TipsSection(
                        lesson = lesson
                    )
                }
            }
        }
    }
}

@Composable
fun VocabularySection(
    lesson: Lesson,
    currentlyPlayingText: String?,
    isFlashcardMode: Boolean,
    onSpeakClick: (String) -> Unit
) {
    if (lesson.vocabulary.isEmpty()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "No hay vocabulario en esta lección.",
                color = Slate400,
                textAlign = TextAlign.Center
            )
        }
    } else {
        val chunks = lesson.vocabulary.chunked(2)
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(top = 16.dp, bottom = 32.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            itemsIndexed(chunks) { chunkIndex, rowItems ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    rowItems.forEachIndexed { itemIndex, vocab ->
                        val overallIndex = chunkIndex * 2 + itemIndex
                        val isPlaying = currentlyPlayingText == vocab.en
                        var isRevealed by remember { mutableStateOf(false) }

                        Card(
                            modifier = Modifier
                                .weight(1f)
                                .clickable {
                                    if (isFlashcardMode) {
                                        isRevealed = !isRevealed
                                    }
                                    onSpeakClick(vocab.en)
                                }
                                .testTag("vocab_card_$overallIndex"),
                            colors = CardDefaults.cardColors(containerColor = Slate900),
                            border = BorderStroke(1.2.dp, if (isPlaying) NeonTeal else Slate800),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(14.dp)
                            ) {
                                Text(
                                    text = vocab.en.uppercase(),
                                    color = NeonTeal,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    lineHeight = 18.sp
                                )

                                if (vocab.phonetic.isNotEmpty()) {
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = vocab.phonetic,
                                        color = Slate400,
                                        fontSize = 11.sp,
                                        fontStyle = FontStyle.Italic
                                    )
                                }

                                Spacer(modifier = Modifier.height(4.dp))

                                val spanishText = if (isFlashcardMode && !isRevealed) "••••••••" else vocab.es
                                Text(
                                    text = spanishText,
                                    color = if (isFlashcardMode && !isRevealed) Slate700 else Slate400,
                                    fontSize = 12.sp,
                                    fontStyle = FontStyle.Italic,
                                    lineHeight = 16.sp
                                )
                            }
                        }
                    }
                    if (rowItems.size < 2) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

@Composable
fun PhrasesSection(
    lesson: Lesson,
    currentlyPlayingText: String?,
    isFlashcardMode: Boolean,
    onSpeakClick: (String) -> Unit
) {
    if (lesson.phrases.isEmpty()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "No hay frases tácticas en esta lección.",
                color = Slate400,
                textAlign = TextAlign.Center
            )
        }
    } else {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(top = 16.dp, bottom = 32.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            itemsIndexed(lesson.phrases) { index, phrase ->
                PhraseCard(
                    phrase = phrase,
                    index = index,
                    totalPhrases = lesson.phrases.size,
                    isPlaying = currentlyPlayingText == phrase.en,
                    isFlashcardMode = isFlashcardMode,
                    onSpeakClick = onSpeakClick
                )
            }
        }
    }
}

@Composable
fun TipsSection(
    lesson: Lesson
) {
    if (lesson.tips.isEmpty()) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "No hay consejos operativos para esta lección.",
                color = Slate400,
                textAlign = TextAlign.Center
            )
        }
    } else {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(top = 16.dp, bottom = 32.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            itemsIndexed(lesson.tips) { index, tip ->
                TipCard(tip = tip, index = index)
            }
        }
    }
}

@Composable
fun PhraseCard(
    phrase: PhraseItem,
    index: Int,
    totalPhrases: Int,
    isPlaying: Boolean,
    isFlashcardMode: Boolean,
    onSpeakClick: (String) -> Unit
) {
    var isRevealed by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = isFlashcardMode) { isRevealed = !isRevealed }
            .testTag("phrase_card_${index}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Slate900
        ),
        border = BorderStroke(
            width = 1.2.dp,
            color = if (isPlaying) NeonTeal else Slate800
        )
    ) {
        Column(
            modifier = Modifier.padding(18.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Bookmark,
                        contentDescription = null,
                        tint = if (isPlaying) NeonTeal else Slate700,
                        modifier = Modifier.size(14.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "FRASE TÁCTICA ${index + 1} DE $totalPhrases",
                        color = if (isPlaying) NeonTeal else Slate400,
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp,
                        letterSpacing = 1.sp
                    )
                }
                
                if (isPlaying) {
                    Box(
                        modifier = Modifier
                            .background(NeonTeal.copy(alpha = 0.15f), RoundedCornerShape(4.dp))
                            .padding(horizontal = 8.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = "Reproduciendo Audio",
                            color = NeonTeal,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = phrase.en.uppercase(),
                color = NeonTeal,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                lineHeight = 24.sp,
                modifier = Modifier.testTag("phrase_text_en_${index}")
            )

            if (phrase.phonetic.isNotEmpty()) {
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = phrase.phonetic,
                    color = Slate400,
                    fontSize = 13.sp,
                    fontStyle = FontStyle.Italic,
                    lineHeight = 16.sp,
                    modifier = Modifier.testTag("phrase_text_phonetic_${index}")
                )
            }

            Spacer(modifier = Modifier.height(6.dp))

            val spanishText = if (isFlashcardMode && !isRevealed) "•••••••••••• (Toca para revelar)" else phrase.es
            Text(
                text = spanishText,
                color = if (isFlashcardMode && !isRevealed) Slate700 else Slate400,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Italic,
                lineHeight = 18.sp,
                modifier = Modifier.testTag("phrase_text_es_${index}")
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { onSpeakClick(phrase.en) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isPlaying) NeonTeal else NeonTeal.copy(alpha = 0.1f),
                    contentColor = if (isPlaying) Slate950 else NeonTeal
                ),
                border = BorderStroke(1.2.dp, if (isPlaying) NeonTeal else NeonTeal.copy(alpha = 0.3f)),
                shape = RoundedCornerShape(24.dp),
                contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp),
                modifier = Modifier
                    .align(Alignment.End)
                    .height(48.dp)
                    .testTag("listen_button_${index}")
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
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = if (isPlaying) stringResource(R.string.playing_audio) else stringResource(R.string.listen_audio),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.5.sp
                    )
                }
            }
        }
    }
}

@Composable
fun TipCard(
    tip: String,
    index: Int
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("tip_card_${index}"),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Slate900
        ),
        border = BorderStroke(1.2.dp, Slate800)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = if (index % 2 == 0) "⚠️" else "ℹ️",
                fontSize = 20.sp,
                modifier = Modifier.padding(end = 12.dp)
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "CONSEJO OPERATIVO / TÁCTICO",
                    color = NeonTeal,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    letterSpacing = 1.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = tip,
                    color = Color.White,
                    fontSize = 14.sp,
                    lineHeight = 20.sp
                )
            }
        }
    }
}
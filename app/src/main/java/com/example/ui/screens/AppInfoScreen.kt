package com.example.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppInfoScreen(
    onBackClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Información del Sistema",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver"
                        )
                    }
                }
            )
        },
        modifier = modifier
    ) { paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                    .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(110.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF0F172A)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_app_icon_1785855600158),
                        contentDescription = "Escudo Marbella Police Local English",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

            // Sección: Sobre la Materia y Estadísticas
            InfoCard(title = "Sobre la Materia y Contenido") {
                InfoRow(label = "Programa", value = "Inglés Técnico para Policía Local")
                InfoRow(label = "Estructura Curricular", value = "30 Módulos formativos (7 Áreas temáticas)")
                InfoRow(label = "Volumen Léxico", value = "3,099 términos de vocabulario")
                InfoRow(label = "Expresiones", value = "798 frases operativas de intervención")
            }

            // Sección: Ámbito Lingüístico y Filológico
            InfoCard(title = "Ámbito Lingüístico y Filológico") {
                InfoRow(
                    label = "Transcripción Fonética",
                    value = "Sistema fonético adaptado y simplificado para hispanohablantes, optimizado para lectura y comprensión oral bajo presión operativa."
                )
                InfoRow(
                    label = "Síntesis de Voz (TTS)",
                    value = "Integración con motor de texto a voz nativo configurado en variante británica (en-GB) para garantizar precisión idiomática."
                )
            }

            // Sección: Ámbito Operativo y Policial
            InfoCard(title = "Ámbito Operativo y Policial") {
                InfoRow(
                    label = "Marco Competencial",
                    value = "Orientado estrictamente a funciones de Policía Local: policía administrativa, seguridad ciudadana, tráfico, atestados, extranjería y mediación."
                )
                InfoRow(
                    label = "Casuística Municipal",
                    value = "Supuestos adaptados a municipios turísticos y de costa (control de aforos, VTC, normativa de playas, vehículos abandonados y grúa)."
                )
            }

            // Sección: Sobre la Aplicación
            InfoCard(title = "Sobre la Aplicación") {
                InfoRow(label = "Plataforma", value = "Android Nativo")
                InfoRow(label = "Stack Tecnológico", value = "Kotlin / Jetpack Compose / MVVM")
                InfoRow(label = "Propósito", value = "Herramienta estática de referencia operativa y asistencia idiomática policial.")
            }

            // Sección: Autoría y Créditos
            InfoCard(title = "Autoría y Créditos") {
                InfoRow(label = "Desarrollador / Autor", value = "S.Caracuel.R")
                InfoRow(label = "Identificación Profesional", value = "CP214 - PL MARBELLA")
                InfoRow(label = "Contacto", value = "macsalvi@gmail.com")
            }
        }
    }
}
}

@Composable
private fun InfoCard(
    title: String,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold
            )
            HorizontalDivider()
            content()
        }
    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Medium
        )
    }
}
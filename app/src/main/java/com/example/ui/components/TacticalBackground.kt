package com.example.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

/**
 * TacticalBackground - "Malla Táctica / Red de Datos" (Cyber-Grid with Active Electric Energy Flow)
 *
 * Custom HUD interface background for Marbella Local Police app.
 * Features:
 * - High-contrast dark tactical navy background (#020617 -> #0B132B).
 * - Vivid cartography cyber-grid with HUD crosshair intersection marks.
 * - Electric energy pulses flowing continuously along grid pathways (cuadrículas).
 * - Bright glowing spark heads and electric trails traversing top, sides, and bottom areas.
 */
@Composable
fun TacticalBackground(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {}
) {
    val infiniteTransition = rememberInfiniteTransition(label = "cyber_grid_energy_transition")

    // Breathing opacity for the cyber grid (0.16f to 0.28f for crisp visibility)
    val gridOpacity by infiniteTransition.animateFloat(
        initialValue = 0.16f,
        targetValue = 0.28f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 3800, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "grid_opacity"
    )

    // Stream 1: Top horizontal grid energy line (35% slower speed)
    val stream1Progress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 4920, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "energy_stream_1"
    )

    // Stream 2: Left vertical grid energy line (35% slower speed)
    val stream2Progress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 6300, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "energy_stream_2"
    )

    // Stream 3: Right vertical grid energy line (35% slower speed)
    val stream3Progress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 7380, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "energy_stream_3"
    )

    // Stream 4: Bottom horizontal grid energy line (35% slower speed)
    val stream4Progress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 8460, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "energy_stream_4"
    )

    // Expanding dispatch radar wave (35% slower speed)
    val dispatchWave by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 10000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "dispatch_wave"
    )

    val pathMeasure = remember { PathMeasure() }
    val animatedPath = remember { Path() }

    Box(modifier = modifier) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height
            val maxDimension = maxOf(width, height)

            // 1. High-Contrast Deep Night Base Fill
            drawRect(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF020617), // Deepest night slate
                        Color(0xFF0B132B), // Tactical Police Navy
                        Color(0xFF030A1C)  // Deep Midnight Blue
                    )
                )
            )

            // 2. Ambient Police Cobalt Glow Backdrop
            val centerOffset = Offset(width * 0.5f, height * 0.35f)
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color(0xFF1E3A8A).copy(alpha = 0.28f), // Vivid Cobalt Blue
                        Color(0xFF0284C7).copy(alpha = 0.10f), // Soft Cyber Cyan
                        Color.Transparent
                    ),
                    center = centerOffset,
                    radius = maxDimension * 0.70f
                ),
                radius = maxDimension * 0.70f,
                center = centerOffset
            )

            // 3. Cyber-Grid (Malla Táctica / Red de Cartografía Policial)
            val gridStep = 44.dp.toPx()
            val cyanLineColor = Color(0xFF38BDF8).copy(alpha = gridOpacity)
            val cobaltAccentColor = Color(0xFF00E5FF).copy(alpha = (gridOpacity * 1.3f).coerceAtMost(0.45f))

            var colIndex = 0
            var x = 0f
            while (x <= width) {
                val isMajorCol = colIndex % 4 == 0
                drawLine(
                    color = if (isMajorCol) cobaltAccentColor else cyanLineColor,
                    start = Offset(x, 0f),
                    end = Offset(x, height),
                    strokeWidth = if (isMajorCol) 2.0.dp.toPx() else 1.2.dp.toPx()
                )
                x += gridStep
                colIndex++
            }

            var rowIndex = 0
            var y = 0f
            while (y <= height) {
                val isMajorRow = rowIndex % 4 == 0
                drawLine(
                    color = if (isMajorRow) cobaltAccentColor else cyanLineColor,
                    start = Offset(0f, y),
                    end = Offset(width, y),
                    strokeWidth = if (isMajorRow) 2.0.dp.toPx() else 1.2.dp.toPx()
                )
                y += gridStep
                rowIndex++
            }

            // HUD Crosshair Ticks at Major Intersections
            val crossSize = 5.dp.toPx()
            val crossColor = Color(0xFF00FFCC).copy(alpha = gridOpacity * 1.5f)
            var cIdx = 0
            var cx = 0f
            while (cx <= width) {
                if (cIdx % 4 == 0) {
                    var rIdx = 0
                    var cy = 0f
                    while (cy <= height) {
                        if (rIdx % 4 == 0) {
                            drawLine(
                                color = crossColor,
                                start = Offset(cx - crossSize, cy),
                                end = Offset(cx + crossSize, cy),
                                strokeWidth = 1.2.dp.toPx()
                            )
                            drawLine(
                                color = crossColor,
                                start = Offset(cx, cy - crossSize),
                                end = Offset(cx, cy + crossSize),
                                strokeWidth = 1.2.dp.toPx()
                            )
                        }
                        cy += gridStep
                        rIdx++
                    }
                }
                cx += gridStep
                cIdx++
            }

            // 4. Electric Energy Lines Flowing Along Grid Quadrants
            fun drawElectricStream(
                gridPoints: List<Pair<Int, Int>>,
                progress: Float,
                activeRatio: Float = 0.72f,
                pulseColor: Color = Color(0xFF00FFCC)
            ) {
                if (gridPoints.size < 2) return

                // Active travel duration vs brief rest pause
                if (progress > activeRatio) return
                val travelProgress = (progress / activeRatio).coerceIn(0f, 1f)

                // Construct full path following grid steps
                val fullPath = Path()
                val startX = gridPoints[0].first * gridStep
                val startY = gridPoints[0].second * gridStep
                fullPath.moveTo(startX, startY)

                for (i in 1 until gridPoints.size) {
                    val px = gridPoints[i].first * gridStep
                    val py = gridPoints[i].second * gridStep
                    fullPath.lineTo(px, py)
                }

                pathMeasure.setPath(fullPath, false)
                val totalLength = pathMeasure.length
                if (totalLength <= 0f) return

                // Tail length along grid path
                val pulseLength = gridStep * 2.8f
                val headDist = totalLength * travelProgress
                val tailDist = (headDist - pulseLength).coerceAtLeast(0f)

                // Smooth fade-in and fade-out
                val alphaFade = when {
                    travelProgress < 0.12f -> travelProgress / 0.12f
                    travelProgress > 0.85f -> (1f - travelProgress) / 0.15f
                    else -> 1f
                }.coerceIn(0f, 1f)

                if (headDist > tailDist) {
                    animatedPath.reset()
                    if (pathMeasure.getSegment(tailDist, headDist, animatedPath, true)) {
                        // Outer electric neon glow
                        drawPath(
                            path = animatedPath,
                            color = pulseColor.copy(alpha = 0.45f * alphaFade),
                            style = Stroke(width = 4.0.dp.toPx())
                        )
                        // Inner bright white/cyan core
                        drawPath(
                            path = animatedPath,
                            color = Color.White.copy(alpha = 0.90f * alphaFade),
                            style = Stroke(width = 1.6.dp.toPx())
                        )
                    }

                    // Leading Electric Spark Head
                    val headPos = pathMeasure.getPosition(headDist)
                    drawCircle(
                        color = Color.White.copy(alpha = 1.0f * alphaFade),
                        radius = 3.5.dp.toPx(),
                        center = headPos
                    )
                    drawCircle(
                        color = pulseColor.copy(alpha = 0.70f * alphaFade),
                        radius = 9.dp.toPx(),
                        center = headPos
                    )
                    drawCircle(
                        color = pulseColor.copy(alpha = 0.30f * alphaFade),
                        radius = 16.dp.toPx(),
                        center = headPos
                    )
                }
            }

            // Stream 1: Top header grid route (Left -> Down -> Right -> Down -> Right)
            drawElectricStream(
                gridPoints = listOf(
                    0 to 2,
                    3 to 2,
                    3 to 4,
                    7 to 4,
                    7 to 6,
                    10 to 6
                ),
                progress = stream1Progress,
                activeRatio = 0.75f,
                pulseColor = Color(0xFF00FFCC) // Electric Cyan/Teal
            )

            // Stream 2: Left margin vertical route (Down -> Right -> Down -> Right)
            drawElectricStream(
                gridPoints = listOf(
                    1 to 1,
                    1 to 6,
                    3 to 6,
                    3 to 12,
                    5 to 12,
                    5 to 17
                ),
                progress = stream2Progress,
                activeRatio = 0.70f,
                pulseColor = Color(0xFF00E5FF) // Bright Cyber Cyan
            )

            // Stream 3: Right margin vertical route (Down -> Left -> Down)
            drawElectricStream(
                gridPoints = listOf(
                    8 to 3,
                    8 to 9,
                    6 to 9,
                    6 to 15,
                    9 to 15
                ),
                progress = stream3Progress,
                activeRatio = 0.72f,
                pulseColor = Color(0xFF3B82F6) // Police Electric Blue
            )

            // Stream 4: Bottom bar horizontal route (Right -> Up -> Right)
            drawElectricStream(
                gridPoints = listOf(
                    1 to 15,
                    5 to 15,
                    5 to 13,
                    9 to 13
                ),
                progress = stream4Progress,
                activeRatio = 0.68f,
                pulseColor = Color(0xFF818CF8) // Electric Indigo
            )

            // 5. Radar Wave (Radio Dispatch Signal Sweep)
            val waveRadius = maxDimension * 0.72f * dispatchWave
            val waveAlpha = (1f - dispatchWave) * 0.18f
            drawCircle(
                color = Color(0xFF00FFCC).copy(alpha = waveAlpha),
                radius = waveRadius,
                center = centerOffset,
                style = Stroke(width = 2.dp.toPx())
            )
        }

        content()
    }
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataLine16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataLine16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(4.30469f, 5.1875f),
                end = Offset(13.335f, 14.1037f)
            )
        ) {
            moveTo(10.39f, 8.312f)
            lineToRelative(2f, -2.5f)
            lineToRelative(-0.78f, -0.625f)
            lineToRelative(-2f, 2.5f)
            lineToRelative(0.78f, 0.625f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(9.28026f, 9.49661f),
                radius = 2.72202f
            )
        ) {
            moveTo(10.39f, 8.312f)
            lineToRelative(2f, -2.5f)
            lineToRelative(-0.78f, -0.625f)
            lineToRelative(-2f, 2.5f)
            lineToRelative(0.78f, 0.625f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(13f, 4f),
                radius = 3.44467f
            )
        ) {
            moveTo(10.39f, 8.312f)
            lineToRelative(2f, -2.5f)
            lineToRelative(-0.78f, -0.625f)
            lineToRelative(-2f, 2.5f)
            lineToRelative(0.78f, 0.625f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(3f, 12f),
                radius = 3.46667f
            )
        ) {
            moveTo(10.39f, 8.312f)
            lineToRelative(2f, -2.5f)
            lineToRelative(-0.78f, -0.625f)
            lineToRelative(-2f, 2.5f)
            lineToRelative(0.78f, 0.625f)
            close()
            moveTo(4.699f, 11.96f)
            lineToRelative(3.5f, -1.5f)
            lineToRelative(-0.394f, -0.92f)
            lineToRelative(-3.5f, 1.5f)
            lineToRelative(0.394f, 0.92f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(9.28026f, 9.49661f),
                radius = 2.72202f
            )
        ) {
            moveTo(4.699f, 11.96f)
            lineToRelative(3.5f, -1.5f)
            lineToRelative(-0.394f, -0.92f)
            lineToRelative(-3.5f, 1.5f)
            lineToRelative(0.394f, 0.92f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(13f, 4f),
                radius = 3.44467f
            )
        ) {
            moveTo(4.699f, 11.96f)
            lineToRelative(3.5f, -1.5f)
            lineToRelative(-0.394f, -0.92f)
            lineToRelative(-3.5f, 1.5f)
            lineToRelative(0.394f, 0.92f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(3f, 12f),
                radius = 3.46667f
            )
        ) {
            moveTo(4.699f, 11.96f)
            lineToRelative(3.5f, -1.5f)
            lineToRelative(-0.394f, -0.92f)
            lineToRelative(-3.5f, 1.5f)
            lineToRelative(0.394f, 0.92f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0078D4)
                ),
                start = Offset(1.5f, 10.1667f),
                end = Offset(5.80251f, 15.2563f)
            )
        ) {
            moveTo(1f, 12f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            moveToRelative(6f, -3f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            moveToRelative(4f, -5f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
        }
    }.build()
}

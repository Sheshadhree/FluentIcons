package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Lightbulb32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Lightbulb32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.376456f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(9.93998f, 11.4484f),
                radius = 18.6545f
            )
        ) {
            moveTo(20.834f, 25.5f)
            lineToRelative(-0.412f, 1.787f)
            curveTo(20.055f, 28.875f, 18.64f, 30f, 17.012f, 30f)
            horizontalLineToRelative(-2.023f)
            curveToRelative(-1.63f, 0f, -3.044f, -1.125f, -3.41f, -2.713f)
            lineTo(11.165f, 25.5f)
            horizontalLineToRelative(9.668f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD34719),
                    1f to Color(0x00D34719)
                ),
                start = Offset(15.9993f, 25.5f),
                end = Offset(15.9996f, 30f)
            )
        ) {
            moveTo(20.834f, 25.5f)
            lineToRelative(-0.412f, 1.787f)
            curveTo(20.055f, 28.875f, 18.64f, 30f, 17.012f, 30f)
            horizontalLineToRelative(-2.023f)
            curveToRelative(-1.63f, 0f, -3.044f, -1.125f, -3.41f, -2.713f)
            lineTo(11.165f, 25.5f)
            horizontalLineToRelative(9.668f)
            close()
            moveTo(16f, 2f)
            curveTo(10.477f, 2f, 6f, 6.477f, 6f, 12f)
            curveToRelative(0f, 2.977f, 1.302f, 5.651f, 3.365f, 7.482f)
            curveToRelative(0.343f, 0.304f, 0.561f, 0.645f, 0.64f, 0.986f)
            lineToRelative(0.93f, 4.032f)
            horizontalLineToRelative(10.13f)
            lineToRelative(0.93f, -4.032f)
            curveToRelative(0.079f, -0.34f, 0.297f, -0.682f, 0.64f, -0.986f)
            curveTo(24.698f, 17.652f, 26f, 14.977f, 26f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC7A3),
                    1f to Color(0xFFFF9C70)
                ),
                start = Offset(15.1805f, 24.7944f),
                end = Offset(16.9679f, 28.4995f)
            )
        ) {
            moveTo(21.18f, 24f)
            horizontalLineTo(10.82f)
            lineToRelative(0.461f, 2f)
            horizontalLineToRelative(9.437f)
            lineToRelative(0.462f, -2f)
            close()
        }
    }.build()
}

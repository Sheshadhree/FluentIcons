package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Document32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Document32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(20.4f, 2f),
                end = Offset(22.7106f, 25.6099f)
            )
        ) {
            moveTo(17f, 2f)
            horizontalLineTo(8f)
            curveTo(6.343f, 2f, 5f, 3.343f, 5f, 5f)
            verticalLineToRelative(22f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(16f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(12f)
            lineToRelative(-7f, -3f)
            lineToRelative(-3f, -7f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.362364f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(27.9167f, 2.875f),
                radius = 17.438f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(17f, 2f)
            horizontalLineTo(8f)
            curveTo(6.343f, 2f, 5f, 3.343f, 5f, 5f)
            verticalLineToRelative(22f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(16f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(12f)
            lineToRelative(-7f, -3f)
            lineToRelative(-3f, -7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(21.9833f, 6.16667f),
                end = Offset(19.4833f, 10.3333f)
            )
        ) {
            moveTo(17f, 10f)
            verticalLineTo(2f)
            lineToRelative(10f, 10f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
        }
    }.build()
}

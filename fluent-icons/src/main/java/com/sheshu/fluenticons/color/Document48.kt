package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Document48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Document48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(30.4f, 4f),
                end = Offset(33.4843f, 36.9112f)
            )
        ) {
            moveTo(11f, 43f)
            horizontalLineToRelative(26f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(18f)
            lineToRelative(-10f, -4f)
            lineToRelative(-4f, -10f)
            horizontalLineTo(11f)
            curveTo(9.343f, 4f, 8f, 5.343f, 8f, 7f)
            verticalLineToRelative(33f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.362364f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(41.3333f, 5.21875f),
                radius = 24.7968f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(11f, 43f)
            horizontalLineToRelative(26f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(18f)
            lineToRelative(-10f, -4f)
            lineToRelative(-4f, -10f)
            horizontalLineTo(11f)
            curveTo(9.343f, 4f, 8f, 5.343f, 8f, 7f)
            verticalLineToRelative(33f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(32.9766f, 9.83333f),
                end = Offset(29.4766f, 15.6667f)
            )
        ) {
            moveTo(26f, 15f)
            verticalLineTo(4f)
            lineToRelative(14f, 14f)
            horizontalLineTo(29f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            close()
        }
    }.build()
}

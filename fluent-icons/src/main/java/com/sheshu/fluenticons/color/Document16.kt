package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Document16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Document16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(9.99409f, 1f),
                end = Offset(11.2635f, 12.7813f)
            )
        ) {
            moveTo(8.004f, 1f)
            lineTo(9.5f, 4.5f)
            lineTo(13f, 6f)
            lineToRelative(-0.008f, 7.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 15f, 3f, 14.328f, 3f, 13.5f)
            verticalLineToRelative(-11f)
            curveTo(3f, 1.672f, 3.672f, 1f, 4.5f, 1f)
            horizontalLineToRelative(3.504f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.362364f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(13.4079f, 1.4375f),
                radius = 8.35524f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(8.004f, 1f)
            lineTo(9.5f, 4.5f)
            lineTo(13f, 6f)
            lineToRelative(-0.008f, 7.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 15f, 3f, 14.328f, 3f, 13.5f)
            verticalLineToRelative(-11f)
            curveTo(3f, 1.672f, 3.672f, 1f, 4.5f, 1f)
            horizontalLineToRelative(3.504f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(10.4917f, 3.08333f),
                end = Offset(9.24166f, 5.16667f)
            )
        ) {
            moveTo(8f, 4.5f)
            verticalLineTo(1f)
            lineToRelative(5f, 5f)
            horizontalLineTo(9.5f)
            curveTo(8.672f, 6f, 8f, 5.328f, 8f, 4.5f)
            close()
        }
    }.build()
}

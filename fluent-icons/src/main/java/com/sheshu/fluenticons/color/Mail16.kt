package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Mail16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Mail16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color(0xFF367AF2))) {
            moveTo(14f, 5f)
            horizontalLineTo(2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.22807f to Color(0x000094F0),
                    0.430619f to Color(0xFF0094F0)
                ),
                start = Offset(9.52344f, 6.56818f),
                end = Offset(13.0259f, 12.8141f)
            )
        ) {
            moveTo(14f, 5f)
            horizontalLineTo(2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.22807f to Color(0x000094F0),
                    0.430619f to Color(0xFF0094F0)
                ),
                start = Offset(6.28571f, 5.84211f),
                end = Offset(2.39441f, 13.1979f)
            )
        ) {
            moveTo(14f, 5f)
            horizontalLineTo(2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x002764E7),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(11.1641f, 9.77273f),
                end = Offset(11.7559f, 13.7264f)
            ),
            fillAlpha = 0.75f
        ) {
            moveTo(14f, 5f)
            horizontalLineTo(2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(9.85714f, 5.98246f),
                end = Offset(10.9375f, 14.0345f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(14f, 5f)
            horizontalLineTo(2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    0.461792f to Color(0xFF29C3FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(5.56496f, 0.506569f),
                end = Offset(12.3165f, 12.7253f)
            )
        ) {
            moveTo(4f, 3f)
            curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
            verticalLineToRelative(0.84f)
            lineToRelative(5.763f, 3.103f)
            curveToRelative(0.148f, 0.08f, 0.326f, 0.08f, 0.474f, 0f)
            lineTo(14f, 5.84f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Send32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Send32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(0.0163757f, 16.0013f),
                radius = 13.9839f
            )
        ) {
            moveTo(4.664f, 20f)
            lineToRelative(1.286f, -3.999f)
            lineToRelative(-1.286f, -3.999f)
            lineToRelative(16.092f, 3.016f)
            curveToRelative(1.087f, 0.204f, 1.087f, 1.762f, 0f, 1.966f)
            lineTo(4.664f, 20f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(2.00195f, -9.37384f),
                end = Offset(25.9825f, 22.4879f)
            )
        ) {
            moveTo(4.176f, 2.164f)
            curveTo(2.988f, 1.57f, 1.67f, 2.7f, 2.077f, 3.964f)
            lineToRelative(2.858f, 8.884f)
            curveToRelative(0.114f, 0.356f, 0.418f, 0.619f, 0.787f, 0.68f)
            lineToRelative(11.869f, 1.979f)
            curveToRelative(0.557f, 0.092f, 0.557f, 0.893f, 0f, 0.986f)
            lineTo(5.723f, 18.471f)
            curveToRelative(-0.37f, 0.061f, -0.673f, 0.324f, -0.788f, 0.68f)
            lineToRelative(-2.858f, 8.886f)
            curveToRelative(-0.406f, 1.265f, 0.91f, 2.395f, 2.099f, 1.8f)
            lineTo(29.17f, 17.343f)
            curveToRelative(1.106f, -0.552f, 1.106f, -2.13f, 0f, -2.683f)
            lineTo(4.176f, 2.164f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125345f to Color(0x00DCF8FF),
                    0.768599f to Color(0xB2FF6CE8)
                ),
                start = Offset(16.0008f, 9.54773f),
                end = Offset(23.283f, 29.2492f)
            )
        ) {
            moveTo(4.176f, 2.164f)
            curveTo(2.988f, 1.57f, 1.67f, 2.7f, 2.077f, 3.964f)
            lineToRelative(2.858f, 8.884f)
            curveToRelative(0.114f, 0.356f, 0.418f, 0.619f, 0.787f, 0.68f)
            lineToRelative(11.869f, 1.979f)
            curveToRelative(0.557f, 0.092f, 0.557f, 0.893f, 0f, 0.986f)
            lineTo(5.723f, 18.471f)
            curveToRelative(-0.37f, 0.061f, -0.673f, 0.324f, -0.788f, 0.68f)
            lineToRelative(-2.858f, 8.886f)
            curveToRelative(-0.406f, 1.265f, 0.91f, 2.395f, 2.099f, 1.8f)
            lineTo(29.17f, 17.343f)
            curveToRelative(1.106f, -0.552f, 1.106f, -2.13f, 0f, -2.683f)
            lineTo(4.176f, 2.164f)
            close()
        }
    }.build()
}

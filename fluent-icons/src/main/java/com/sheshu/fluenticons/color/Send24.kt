package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Send24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Send24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(1.49365f, 12.0001f),
                radius = 8.00635f
            )
        ) {
            moveTo(5.57f, 12f)
            lineTo(4.446f, 9f)
            lineToRelative(9.143f, 2.024f)
            curveToRelative(1.045f, 0.231f, 1.045f, 1.721f, 0f, 1.952f)
            lineTo(4.446f, 15f)
            lineToRelative(1.124f, -3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(2.24609f, -5.67642f),
                end = Offset(18.9519f, 16.5179f)
            )
        ) {
            moveTo(12.815f, 12.197f)
            lineToRelative(-7.532f, 1.256f)
            curveToRelative(-0.176f, 0.029f, -0.323f, 0.15f, -0.386f, 0.318f)
            lineTo(2.3f, 20.728f)
            curveToRelative(-0.248f, 0.64f, 0.421f, 1.25f, 1.035f, 0.943f)
            lineToRelative(18f, -9f)
            curveToRelative(0.553f, -0.276f, 0.553f, -1.065f, 0f, -1.342f)
            lineToRelative(-18f, -9f)
            curveTo(2.72f, 2.022f, 2.05f, 2.632f, 2.299f, 3.272f)
            lineToRelative(2.598f, 6.957f)
            curveToRelative(0.063f, 0.168f, 0.21f, 0.29f, 0.386f, 0.319f)
            lineToRelative(7.532f, 1.255f)
            curveToRelative(0.109f, 0.018f, 0.182f, 0.121f, 0.164f, 0.23f)
            curveToRelative(-0.014f, 0.084f, -0.08f, 0.15f, -0.164f, 0.164f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125345f to Color(0x00DCF8FF),
                    0.768599f to Color(0xB2FF6CE8)
                ),
                start = Offset(11.9972f, 7.50481f),
                end = Offset(17.0705f, 21.2291f)
            )
        ) {
            moveTo(12.815f, 12.197f)
            lineToRelative(-7.532f, 1.256f)
            curveToRelative(-0.176f, 0.029f, -0.323f, 0.15f, -0.386f, 0.318f)
            lineTo(2.3f, 20.728f)
            curveToRelative(-0.248f, 0.64f, 0.421f, 1.25f, 1.035f, 0.943f)
            lineToRelative(18f, -9f)
            curveToRelative(0.553f, -0.276f, 0.553f, -1.065f, 0f, -1.342f)
            lineToRelative(-18f, -9f)
            curveTo(2.72f, 2.022f, 2.05f, 2.632f, 2.299f, 3.272f)
            lineToRelative(2.598f, 6.957f)
            curveToRelative(0.063f, 0.168f, 0.21f, 0.29f, 0.386f, 0.319f)
            lineToRelative(7.532f, 1.255f)
            curveToRelative(0.109f, 0.018f, 0.182f, 0.121f, 0.164f, 0.23f)
            curveToRelative(-0.014f, 0.084f, -0.08f, 0.15f, -0.164f, 0.164f)
            close()
        }
    }.build()
}

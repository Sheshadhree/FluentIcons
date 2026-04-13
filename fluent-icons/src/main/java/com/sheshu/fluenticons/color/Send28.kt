package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Send28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Send28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(0.390221f, 14.002f),
                radius = 9.61002f
            )
        ) {
            moveTo(4.7f, 14.002f)
            lineTo(3.896f, 17f)
            lineToRelative(10.823f, -2.015f)
            curveToRelative(1.09f, -0.203f, 1.09f, -1.763f, 0f, -1.966f)
            lineTo(3.898f, 11.004f)
            lineToRelative(0.801f, 2.998f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(2f, -6.84537f),
                end = Offset(21.4559f, 20.1253f)
            )
        ) {
            moveTo(3.79f, 2.625f)
            curveToRelative(-0.963f, -0.46f, -2.021f, 0.42f, -1.746f, 1.451f)
            lineTo(4.06f, 11.61f)
            curveToRelative(0.103f, 0.387f, 0.428f, 0.675f, 0.824f, 0.732f)
            lineToRelative(9.884f, 1.412f)
            curveToRelative(0.286f, 0.04f, 0.286f, 0.454f, 0f, 0.495f)
            lineTo(4.885f, 15.66f)
            curveToRelative(-0.396f, 0.057f, -0.72f, 0.345f, -0.824f, 0.732f)
            lineToRelative(-2.017f, 7.537f)
            curveToRelative(-0.275f, 1.03f, 0.783f, 1.91f, 1.746f, 1.451f)
            lineToRelative(21.498f, -10.25f)
            curveToRelative(0.949f, -0.452f, 0.949f, -1.804f, 0f, -2.256f)
            lineTo(3.79f, 2.624f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125345f to Color(0x00DCF8FF),
                    0.768599f to Color(0xB2FF6CE8)
                ),
                start = Offset(13.9998f, 8.70029f),
                end = Offset(19.7907f, 25.0466f)
            )
        ) {
            moveTo(3.79f, 2.625f)
            curveToRelative(-0.963f, -0.46f, -2.021f, 0.42f, -1.746f, 1.451f)
            lineTo(4.06f, 11.61f)
            curveToRelative(0.103f, 0.387f, 0.428f, 0.675f, 0.824f, 0.732f)
            lineToRelative(9.884f, 1.412f)
            curveToRelative(0.286f, 0.04f, 0.286f, 0.454f, 0f, 0.495f)
            lineTo(4.885f, 15.66f)
            curveToRelative(-0.396f, 0.057f, -0.72f, 0.345f, -0.824f, 0.732f)
            lineToRelative(-2.017f, 7.537f)
            curveToRelative(-0.275f, 1.03f, 0.783f, 1.91f, 1.746f, 1.451f)
            lineToRelative(21.498f, -10.25f)
            curveToRelative(0.949f, -0.452f, 0.949f, -1.804f, 0f, -2.256f)
            lineTo(3.79f, 2.624f)
            close()
        }
    }.build()
}

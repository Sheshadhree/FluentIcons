package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Lightbulb20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Lightbulb20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.376456f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(5.99969f, 3.57124f),
                radius = 14.2991f
            )
        ) {
            moveTo(12.688f, 16.606f)
            curveToRelative(-0.185f, 0.77f, -0.866f, 1.329f, -1.671f, 1.389f)
            lineTo(10.874f, 18f)
            horizontalLineTo(9.126f)
            curveToRelative(-0.819f, 0f, -1.535f, -0.516f, -1.777f, -1.261f)
            lineToRelative(-0.037f, -0.134f)
            lineTo(6.809f, 14.5f)
            horizontalLineToRelative(6.383f)
            lineToRelative(-0.505f, 2.106f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD34719),
                    1f to Color(0x00D34719)
                ),
                start = Offset(9.99988f, 14.5f),
                end = Offset(10.0002f, 17.9999f)
            )
        ) {
            moveTo(12.688f, 16.606f)
            curveToRelative(-0.185f, 0.77f, -0.866f, 1.329f, -1.671f, 1.389f)
            lineTo(10.874f, 18f)
            horizontalLineTo(9.126f)
            curveToRelative(-0.819f, 0f, -1.535f, -0.516f, -1.777f, -1.261f)
            lineToRelative(-0.037f, -0.134f)
            lineTo(6.809f, 14.5f)
            horizontalLineToRelative(6.383f)
            lineToRelative(-0.505f, 2.106f)
            close()
            moveTo(6.81f, 14.5f)
            horizontalLineToRelative(6.382f)
            lineToRelative(0.46f, -1.927f)
            curveToRelative(0.01f, -0.038f, 0.03f, -0.073f, 0.06f, -0.1f)
            curveTo(15.226f, 11.075f, 16f, 9.51f, 16f, 7.801f)
            curveTo(16f, 4.597f, 13.314f, 2f, 10f, 2f)
            curveTo(6.687f, 2f, 4f, 4.596f, 4f, 7.8f)
            curveToRelative(0f, 1.709f, 0.775f, 3.274f, 2.29f, 4.672f)
            curveToRelative(0.03f, 0.027f, 0.05f, 0.062f, 0.06f, 0.1f)
            lineTo(6.81f, 14.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC7A3),
                    1f to Color(0xFFFF9C70)
                ),
                start = Offset(9.47695f, 14.3972f),
                end = Offset(10.2314f, 16.3962f)
            )
        ) {
            moveTo(6.929f, 15f)
            horizontalLineToRelative(6.143f)
            lineToRelative(0.24f, -1f)
            horizontalLineTo(6.69f)
            lineToRelative(0.239f, 1f)
            close()
        }
    }.build()
}

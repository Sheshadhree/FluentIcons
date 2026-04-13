package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Wrench16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Wrench16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2BDABE),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(6.9843f, 1.84371f),
                end = Offset(9.39361f, 14.9858f)
            )
        ) {
            moveTo(11f, 1f)
            curveTo(8.79f, 1f, 7f, 2.79f, 7f, 5f)
            curveToRelative(0f, 0.313f, 0.036f, 0.618f, 0.104f, 0.91f)
            lineToRelative(-5.05f, 5.235f)
            curveToRelative(-0.813f, 0.842f, -0.725f, 2.2f, 0.189f, 2.93f)
            curveToRelative(0.794f, 0.635f, 1.939f, 0.568f, 2.653f, -0.156f)
            lineToRelative(5.006f, -5.072f)
            curveTo(10.252f, 8.947f, 10.62f, 9f, 11f, 9f)
            curveToRelative(2.209f, 0f, 4f, -1.79f, 4f, -4f)
            curveToRelative(0f, -0.181f, -0.012f, -0.36f, -0.036f, -0.535f)
            curveToRelative(-0.025f, -0.189f, -0.155f, -0.346f, -0.335f, -0.407f)
            curveToRelative(-0.18f, -0.061f, -0.38f, -0.015f, -0.514f, 0.12f)
            lineTo(12f, 6.293f)
            lineTo(9.707f, 4f)
            lineToRelative(2.115f, -2.115f)
            curveToRelative(0.135f, -0.135f, 0.181f, -0.334f, 0.12f, -0.514f)
            curveToRelative(-0.06f, -0.18f, -0.218f, -0.31f, -0.407f, -0.335f)
            curveTo(11.36f, 1.012f, 11.181f, 1f, 11f, 1f)
            close()
        }
    }.build()
}

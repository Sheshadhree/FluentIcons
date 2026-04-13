package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Edit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Edit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(13.1371f, 8.46776f),
                end = Offset(15.4437f, 14.7087f)
            )
        ) {
            moveTo(3.587f, 15.353f)
            lineToRelative(11.059f, -11.06f)
            lineToRelative(5.06f, 5.061f)
            lineToRelative(-11.058f, 11.06f)
            lineToRelative(-3.944f, -1.116f)
            lineToRelative(-1.117f, -3.945f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.255f to Color(0xFFFFD394),
                    1f to Color(0xFFFF921F)
                ),
                start = Offset(0.996654f, 16.9503f),
                end = Offset(6.04366f, 21.967f)
            )
        ) {
            moveTo(3.941f, 15f)
            curveToRelative(-0.406f, 0.406f, -0.692f, 0.917f, -0.825f, 1.476f)
            lineTo(2.02f, 21.078f)
            curveToRelative(-0.06f, 0.253f, 0.015f, 0.52f, 0.2f, 0.704f)
            curveToRelative(0.184f, 0.184f, 0.45f, 0.26f, 0.704f, 0.199f)
            lineToRelative(4.601f, -1.096f)
            curveToRelative(0.56f, -0.133f, 1.07f, -0.419f, 1.477f, -0.825f)
            curveToRelative(0f, 0f, -1.824f, -0.41f, -3.238f, -1.823f)
            curveTo(4.35f, 16.822f, 3.941f, 15f, 3.941f, 15f)
            close()
            moveTo(20.952f, 3.048f)
            curveToRelative(-1.398f, -1.397f, -3.664f, -1.397f, -5.061f, 0f)
            lineToRelative(-2.306f, 2.306f)
            lineToRelative(5.06f, 5.06f)
            lineToRelative(2.307f, -2.305f)
            curveToRelative(1.397f, -1.398f, 1.397f, -3.663f, 0f, -5.06f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFFFE994)
                ),
                start = Offset(16.4946f, 8.95435f),
                end = Offset(11.4203f, 6.73569f)
            )
        ) {
            moveTo(12.78f, 6.16f)
            lineToRelative(2.12f, -2.12f)
            reflectiveCurveToRelative(0.41f, 1.823f, 1.824f, 3.237f)
            curveTo(18.138f, 8.691f, 19.961f, 9.1f, 19.961f, 9.1f)
            lineToRelative(-2.12f, 2.122f)
            reflectiveCurveToRelative(-1.824f, -0.41f, -3.238f, -1.823f)
            curveToRelative(-1.415f, -1.415f, -1.823f, -3.237f, -1.823f, -3.237f)
            close()
        }
    }.build()
}

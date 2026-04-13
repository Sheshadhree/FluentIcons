package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Edit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Edit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(10.8905f, 7.02175f),
                end = Offset(12.7893f, 12.2448f)
            )
        ) {
            moveTo(12.251f, 3.542f)
            lineTo(4f, 11.794f)
            lineToRelative(1.05f, 3.156f)
            lineToRelative(3.173f, 1.034f)
            lineToRelative(8.235f, -8.235f)
            lineToRelative(-4.207f, -4.207f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.255f to Color(0xFFFFD394),
                    1f to Color(0xFFFF921F)
                ),
                start = Offset(1.09346f, 13.4366f),
                end = Offset(5.65404f, 17.9693f)
            )
        ) {
            moveTo(4.12f, 11.674f)
            lineToRelative(-0.575f, 0.574f)
            curveTo(3.218f, 12.575f, 2.99f, 12.99f, 2.89f, 13.442f)
            lineToRelative(-0.878f, 3.95f)
            curveToRelative(-0.037f, 0.167f, 0.014f, 0.341f, 0.135f, 0.462f)
            curveToRelative(0.12f, 0.121f, 0.295f, 0.172f, 0.462f, 0.135f)
            lineToRelative(3.926f, -0.873f)
            curveToRelative(0.467f, -0.104f, 0.896f, -0.34f, 1.234f, -0.678f)
            lineToRelative(0.557f, -0.557f)
            reflectiveCurveTo(6.72f, 15.4f, 5.66f, 14.34f)
            curveToRelative(-1.06f, -1.061f, -1.54f, -2.667f, -1.54f, -2.667f)
            close()
            moveToRelative(8.8f, -8.801f)
            curveToRelative(1.183f, -1.182f, 3.107f, -1.158f, 4.26f, 0.054f)
            curveToRelative(1.111f, 1.17f, 1.088f, 3.012f, -0.053f, 4.153f)
            lineToRelative(-2.083f, 2.083f)
            lineToRelative(-4.207f, -4.207f)
            lineToRelative(2.083f, -2.083f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFFFE994)
                ),
                start = Offset(13.2846f, 7.88261f),
                end = Offset(9.16107f, 6.07426f)
            )
        ) {
            moveTo(10.263f, 5.53f)
            lineToRelative(1.635f, -1.634f)
            reflectiveCurveToRelative(0.477f, 1.609f, 1.537f, 2.67f)
            curveToRelative(1.06f, 1.06f, 2.67f, 1.537f, 2.67f, 1.537f)
            lineTo(14.487f, 9.72f)
            reflectiveCurveToRelative(-1.617f, -0.47f, -2.678f, -1.53f)
            curveToRelative(-1.06f, -1.06f, -1.546f, -2.66f, -1.546f, -2.66f)
            close()
        }
    }.build()
}

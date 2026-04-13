package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Database24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Database24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(7.77723f, 2.39557f),
                end = Offset(16.4348f, 20.5766f)
            )
        ) {
            moveTo(18.328f, 7.117f)
            curveTo(18.916f, 6.823f, 19.498f, 6.45f, 20f, 6f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.21f, -3.582f, 4f, -8f, 4f)
            reflectiveCurveToRelative(-8f, -1.79f, -8f, -4f)
            verticalLineTo(6f)
            curveToRelative(0.502f, 0.45f, 1.084f, 0.823f, 1.672f, 1.117f)
            curveTo(7.37f, 7.965f, 9.608f, 8.447f, 12f, 8.447f)
            curveToRelative(2.392f, 0f, 4.63f, -0.482f, 6.328f, -1.33f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(14.4762f, 7.96494f),
                end = Offset(17.6471f, 23.7208f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(18.328f, 7.117f)
            curveTo(18.916f, 6.823f, 19.498f, 6.45f, 20f, 6f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.21f, -3.582f, 4f, -8f, 4f)
            reflectiveCurveToRelative(-8f, -1.79f, -8f, -4f)
            verticalLineTo(6f)
            curveToRelative(0.502f, 0.45f, 1.084f, 0.823f, 1.672f, 1.117f)
            curveTo(7.37f, 7.965f, 9.608f, 8.447f, 12f, 8.447f)
            curveToRelative(2.392f, 0f, 4.63f, -0.482f, 6.328f, -1.33f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF58AAFE),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(26f, 14f),
                end = Offset(16.7545f, -2.82827f)
            )
        ) {
            moveTo(12f, 10f)
            curveToRelative(4.418f, 0f, 8f, -1.79f, 8f, -4f)
            reflectiveCurveToRelative(-3.582f, -4f, -8f, -4f)
            reflectiveCurveToRelative(-8f, 1.79f, -8f, 4f)
            reflectiveCurveToRelative(3.582f, 4f, 8f, 4f)
            close()
        }
    }.build()
}

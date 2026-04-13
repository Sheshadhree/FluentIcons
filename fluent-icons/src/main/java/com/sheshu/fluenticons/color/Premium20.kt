package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Premium20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Premium20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF102784)
                ),
                start = Offset(13.5f, 3f),
                end = Offset(17.5f, 12f)
            )
        ) {
            moveTo(11.5f, 3f)
            curveToRelative(-0.166f, 0f, -0.321f, 0.082f, -0.414f, 0.22f)
            curveToRelative(-0.093f, 0.137f, -0.112f, 0.312f, -0.05f, 0.466f)
            lineToRelative(2f, 5f)
            curveTo(13.112f, 8.876f, 13.296f, 9f, 13.5f, 9f)
            horizontalLineToRelative(4f)
            curveToRelative(0.18f, 0f, 0.346f, -0.097f, 0.435f, -0.254f)
            curveToRelative(0.089f, -0.156f, 0.086f, -0.349f, -0.006f, -0.503f)
            lineToRelative(-3f, -5f)
            curveTo(14.839f, 3.093f, 14.676f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(-6f, 0f)
            curveTo(5.324f, 3f, 5.162f, 3.092f, 5.071f, 3.243f)
            lineToRelative(-3f, 5f)
            curveTo(1.98f, 8.397f, 1.976f, 8.59f, 2.065f, 8.746f)
            curveTo(2.154f, 8.903f, 2.32f, 9f, 2.5f, 9f)
            horizontalLineToRelative(4f)
            curveToRelative(0.205f, 0f, 0.388f, -0.124f, 0.464f, -0.314f)
            lineToRelative(2f, -5f)
            curveToRelative(0.062f, -0.154f, 0.043f, -0.329f, -0.05f, -0.466f)
            curveTo(8.821f, 3.082f, 8.666f, 3f, 8.5f, 3f)
            horizontalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(10f, 3f),
                end = Offset(10f, 10.5f)
            )
        ) {
            moveTo(8.5f, 3f)
            curveTo(8.296f, 3f, 8.112f, 3.124f, 8.036f, 3.314f)
            lineToRelative(-2f, 5f)
            curveTo(5.974f, 8.468f, 5.993f, 8.643f, 6.086f, 8.78f)
            curveTo(6.179f, 8.918f, 6.334f, 9f, 6.5f, 9f)
            horizontalLineToRelative(7f)
            curveToRelative(0.166f, 0f, 0.321f, -0.082f, 0.414f, -0.22f)
            curveToRelative(0.093f, -0.137f, 0.112f, -0.312f, 0.05f, -0.466f)
            lineToRelative(-2f, -5f)
            curveTo(11.888f, 3.124f, 11.704f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1B44B1),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(20f, 3f),
                end = Offset(11f, 17f)
            )
        ) {
            moveTo(13.5f, 8f)
            curveToRelative(-0.206f, 0f, -0.391f, 0.127f, -0.466f, 0.319f)
            lineToRelative(-3.5f, 9f)
            curveToRelative(-0.089f, 0.228f, 0.001f, 0.487f, 0.212f, 0.612f)
            curveToRelative(0.211f, 0.124f, 0.481f, 0.077f, 0.638f, -0.11f)
            lineToRelative(7.5f, -9f)
            curveToRelative(0.124f, -0.15f, 0.151f, -0.357f, 0.069f, -0.533f)
            curveTo(17.87f, 8.112f, 17.694f, 8f, 17.5f, 8f)
            horizontalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(3.5f, 6f),
                end = Offset(9.5f, 18f)
            )
        ) {
            moveTo(2.5f, 8f)
            curveTo(2.306f, 8f, 2.13f, 8.112f, 2.047f, 8.288f)
            curveTo(1.965f, 8.464f, 1.992f, 8.67f, 2.116f, 8.82f)
            lineToRelative(7.5f, 9f)
            curveToRelative(0.157f, 0.188f, 0.427f, 0.235f, 0.638f, 0.11f)
            curveToRelative(0.211f, -0.124f, 0.3f, -0.383f, 0.212f, -0.611f)
            lineToRelative(-3.5f, -9f)
            curveTo(6.891f, 8.127f, 6.706f, 8f, 6.5f, 8f)
            horizontalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2052CB),
                    1f to Color(0xFF0FAFFF)
                ),
                start = Offset(10f, 4.5f),
                end = Offset(10f, 18f)
            )
        ) {
            moveTo(6.16f, 8f)
            reflectiveCurveTo(5.938f, 8.387f, 6.034f, 8.681f)
            lineToRelative(3.5f, 9f)
            curveTo(9.609f, 17.873f, 9.794f, 18f, 10f, 18f)
            curveToRelative(0.206f, 0f, 0.391f, -0.127f, 0.466f, -0.319f)
            lineToRelative(3.5f, -9f)
            curveTo(14.091f, 8.36f, 13.84f, 8f, 13.84f, 8f)
            horizontalLineTo(6.16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(0.375f, -11.125f),
                end = Offset(13.3678f, 19.1256f)
            ),
            fillAlpha = 0.7f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.071f, 3.243f)
            curveTo(5.161f, 3.093f, 5.324f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            curveToRelative(0.176f, 0f, 0.338f, 0.092f, 0.429f, 0.243f)
            lineToRelative(2.996f, 4.993f)
            curveToRelative(0.01f, 0.016f, 0.02f, 0.034f, 0.028f, 0.052f)
            curveToRelative(0.082f, 0.176f, 0.055f, 0.383f, -0.069f, 0.532f)
            lineToRelative(-7.497f, 8.997f)
            lineToRelative(-0.034f, 0.037f)
            lineToRelative(-0.009f, 0.009f)
            curveTo(10.25f, 17.953f, 10.126f, 18f, 10f, 18f)
            curveToRelative(-0.06f, 0f, -0.119f, -0.01f, -0.176f, -0.032f)
            curveToRelative(-0.063f, -0.024f, -0.122f, -0.06f, -0.173f, -0.11f)
            lineToRelative(-0.038f, -0.041f)
            lineToRelative(-7.494f, -8.994f)
            curveTo(2.107f, 8.81f, 2.097f, 8.796f, 2.087f, 8.782f)
            lineTo(2.082f, 8.774f)
            curveToRelative(-0.02f, -0.03f, -0.036f, -0.061f, -0.048f, -0.094f)
            curveTo(1.996f, 8.582f, 1.99f, 8.475f, 2.016f, 8.374f)
            curveToRelative(0.01f, -0.04f, 0.027f, -0.081f, 0.048f, -0.12f)
            lineToRelative(0.008f, -0.013f)
            lineToRelative(3f, -4.998f)
            close()
        }
    }.build()
}

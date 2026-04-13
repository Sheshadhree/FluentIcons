package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Food32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Food32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(16.4615f, 3.75002f),
                end = Offset(40.6939f, 11.9807f)
            )
        ) {
            moveTo(25.5f, 2f)
            curveTo(21.358f, 2f, 18f, 5.358f, 18f, 9.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(0.389f)
            curveToRelative(-0.107f, 1.023f, -0.272f, 2.627f, -0.431f, 4.262f)
            curveTo(20.228f, 22.632f, 20f, 25.162f, 20f, 26f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            curveToRelative(0f, -0.985f, -0.317f, -4.034f, -0.586f, -6.631f)
            lineTo(27.4f, 19.247f)
            curveToRelative(-0.108f, -1.038f, -0.209f, -2.012f, -0.283f, -2.781f)
            curveTo(27.04f, 15.668f, 27f, 15.158f, 27f, 15f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-0.5f)
            close()
            moveTo(14.974f, 2.773f)
            curveToRelative(-0.023f, -0.097f, -0.087f, -0.308f, -0.284f, -0.496f)
            curveToRelative(-0.217f, -0.207f, -0.463f, -0.261f, -0.608f, -0.274f)
            curveTo(14.017f, 1.998f, 13.965f, 2f, 13.939f, 2.002f)
            curveToRelative(-0.53f, 0.03f, -0.949f, 0.467f, -0.949f, 1.004f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.549f, -0.446f, 0.994f, -0.995f, 0.994f)
            curveToRelative(-0.54f, 0f, -0.979f, -0.43f, -0.995f, -0.965f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(9f, 2.448f, 9f, 3f)
            verticalLineToRelative(6.065f)
            curveTo(8.97f, 9.586f, 8.536f, 10f, 8.007f, 10f)
            curveToRelative(-0.55f, 0f, -0.995f, -0.445f, -0.995f, -0.995f)
            verticalLineTo(3.007f)
            curveTo(7.012f, 2.463f, 6.58f, 2.02f, 6.042f, 2f)
            horizontalLineTo(5.997f)
            curveTo(5.965f, 2f, 5.91f, 2.001f, 5.842f, 2.012f)
            curveToRelative(-0.15f, 0.024f, -0.368f, 0.096f, -0.557f, 0.289f)
            curveToRelative(-0.173f, 0.177f, -0.235f, 0.37f, -0.259f, 0.472f)
            curveTo(5.004f, 2.866f, 4f, 7.14f, 4f, 10f)
            curveToRelative(0f, 1.905f, 0.888f, 3.602f, 2.27f, 4.7f)
            curveTo(6.765f, 15.094f, 7f, 15.523f, 7f, 15.882f)
            curveToRelative(0f, 0.04f, -0.002f, 0.077f, -0.007f, 0.114f)
            curveToRelative(-0.06f, 0.504f, -0.307f, 2.594f, -0.539f, 4.753f)
            curveTo(6.226f, 22.872f, 6f, 25.16f, 6f, 26f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            curveToRelative(0f, -0.839f, -0.226f, -3.128f, -0.454f, -5.251f)
            curveToRelative(-0.232f, -2.159f, -0.48f, -4.25f, -0.54f, -4.753f)
            curveTo(13.003f, 15.96f, 13f, 15.923f, 13f, 15.882f)
            curveToRelative(0f, -0.359f, 0.234f, -0.788f, 0.73f, -1.182f)
            curveTo(15.113f, 13.601f, 16f, 11.905f, 16f, 10f)
            curveToRelative(0f, -2.862f, -1.007f, -7.144f, -1.026f, -7.227f)
            close()
            moveToRelative(-1.08f, -0.768f)
            lineToRelative(0.02f, -0.002f)
            lineToRelative(-0.008f, 0.001f)
            lineToRelative(-0.008f, 0.001f)
            horizontalLineToRelative(-0.003f)
            close()
        }
    }.build()
}

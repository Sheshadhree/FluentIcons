package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Food20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Food20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(10.1538f, 3f),
                end = Offset(23.5838f, 7.39058f)
            )
        ) {
            moveTo(15.5f, 2f)
            curveTo(13.015f, 2f, 11f, 4.015f, 11f, 6.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.454f)
            lineToRelative(-0.03f, 0.356f)
            curveToRelative(-0.047f, 0.545f, -0.11f, 1.28f, -0.172f, 2.042f)
            curveTo(12.628f, 13.905f, 12.5f, 15.56f, 12.5f, 16f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            curveToRelative(0f, -0.44f, -0.128f, -2.095f, -0.252f, -3.602f)
            curveToRelative(-0.062f, -0.761f, -0.125f, -1.497f, -0.172f, -2.042f)
            lineTo(16.02f, 9.702f)
            lineTo(16f, 9.478f)
            verticalLineTo(2.5f)
            curveTo(16f, 2.224f, 15.776f, 2f, 15.5f, 2f)
            close()
            moveTo(4.492f, 2f)
            horizontalLineToRelative(0.013f)
            curveToRelative(0.28f, 0f, 0.507f, 0.227f, 0.507f, 0.506f)
            verticalLineToRelative(3.999f)
            curveTo(5.012f, 6.778f, 5.233f, 7f, 5.507f, 7f)
            curveTo(5.77f, 7f, 5.987f, 6.793f, 6f, 6.532f)
            verticalLineTo(2.5f)
            curveTo(6f, 2.224f, 6.224f, 2f, 6.5f, 2f)
            reflectiveCurveTo(7f, 2.224f, 7f, 2.5f)
            verticalLineToRelative(4.026f)
            curveTo(7.011f, 6.79f, 7.23f, 7f, 7.495f, 7f)
            curveTo(7.768f, 7f, 7.99f, 6.778f, 7.99f, 6.505f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.277f, 0.223f, -0.502f, 0.5f, -0.505f)
            curveToRelative(-0.005f, 0f, -0.004f, 0f, 0f, 0f)
            horizontalLineToRelative(0.019f)
            curveToRelative(0.014f, 0f, 0.066f, 0.002f, 0.13f, 0.02f)
            curveToRelative(0.075f, 0.022f, 0.17f, 0.07f, 0.248f, 0.164f)
            curveToRelative(0.072f, 0.089f, 0.098f, 0.181f, 0.107f, 0.24f)
            curveTo(9.007f, 2.5f, 9.5f, 5.591f, 9.5f, 7f)
            curveToRelative(0f, 0.95f, -0.442f, 1.797f, -1.13f, 2.345f)
            curveTo(8.12f, 9.546f, 8f, 9.764f, 8f, 9.947f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.018f, 0f, 0.036f, 0.003f, 0.054f)
            curveToRelative(0.027f, 0.26f, 0.151f, 1.429f, 0.268f, 2.631f)
            curveTo(8.386f, 14.316f, 8.5f, 15.581f, 8.5f, 16f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            curveToRelative(0f, -0.42f, 0.114f, -1.684f, 0.229f, -2.869f)
            curveToRelative(0.117f, -1.202f, 0.24f, -2.372f, 0.268f, -2.63f)
            lineTo(5f, 10.446f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.183f, -0.12f, -0.4f, -0.37f, -0.601f)
            curveTo(3.941f, 8.795f, 3.5f, 7.95f, 3.5f, 7f)
            curveToRelative(0f, -1.405f, 0.49f, -4.482f, 0.506f, -4.576f)
            curveTo(4.016f, 2.364f, 4.04f, 2.281f, 4.1f, 2.2f)
            curveToRelative(0.064f, -0.084f, 0.144f, -0.135f, 0.215f, -0.164f)
            curveTo(4.38f, 2.01f, 4.435f, 2.004f, 4.46f, 2.002f)
            lineTo(4.492f, 2f)
            close()
        }
    }.build()
}

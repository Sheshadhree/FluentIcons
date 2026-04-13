package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.SearchSparkle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.SearchSparkle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(11.25f, 4.83333f),
                end = Offset(3f, 14f)
            )
        ) {
            moveTo(14f, 8.5f)
            curveToRelative(0f, 3.038f, -2.463f, 5.5f, -5.5f, 5.5f)
            curveTo(5.462f, 14f, 3f, 11.538f, 3f, 8.5f)
            reflectiveCurveTo(5.462f, 3f, 8.5f, 3f)
            curveTo(11.537f, 3f, 14f, 5.462f, 14f, 8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF29C3FF)
                ),
                start = Offset(2.80263f, 15.6447f),
                end = Offset(15.6447f, 5.2106f)
            )
        ) {
            moveTo(12.535f, 13.596f)
            curveTo(11.427f, 14.476f, 10.025f, 15f, 8.5f, 15f)
            curveTo(4.91f, 15f, 2f, 12.09f, 2f, 8.5f)
            reflectiveCurveTo(4.91f, 2f, 8.5f, 2f)
            reflectiveCurveTo(15f, 4.91f, 15f, 8.5f)
            curveToRelative(0f, 1.525f, -0.525f, 2.927f, -1.404f, 4.035f)
            lineToRelative(3.434f, 3.435f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(15.97f, 17.03f)
            lineToRelative(-3.435f, -3.434f)
            close()
            moveTo(13.5f, 8.5f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.718021f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(4.375f, -12.8125f),
                radius = 28.6137f
            )
        ) {
            moveTo(17.783f, 8.213f)
            lineToRelative(-0.766f, -0.248f)
            curveToRelative(-0.232f, -0.078f, -0.444f, -0.208f, -0.617f, -0.381f)
            curveToRelative(-0.173f, -0.174f, -0.304f, -0.385f, -0.381f, -0.617f)
            lineToRelative(-0.25f, -0.765f)
            curveToRelative(-0.02f, -0.06f, -0.059f, -0.11f, -0.11f, -0.146f)
            curveTo(15.61f, 6.019f, 15.547f, 6f, 15.485f, 6f)
            curveToRelative(-0.063f, 0f, -0.124f, 0.02f, -0.175f, 0.056f)
            curveToRelative(-0.051f, 0.036f, -0.09f, 0.087f, -0.11f, 0.146f)
            lineToRelative(-0.25f, 0.764f)
            curveToRelative(-0.075f, 0.231f, -0.203f, 0.442f, -0.374f, 0.615f)
            curveToRelative(-0.17f, 0.173f, -0.379f, 0.304f, -0.609f, 0.384f)
            lineToRelative(-0.765f, 0.248f)
            curveToRelative(-0.06f, 0.021f, -0.11f, 0.06f, -0.146f, 0.11f)
            curveTo(13.018f, 8.376f, 13f, 8.437f, 13f, 8.499f)
            curveToRelative(0f, 0.063f, 0.02f, 0.124f, 0.056f, 0.175f)
            curveToRelative(0.036f, 0.05f, 0.087f, 0.09f, 0.146f, 0.11f)
            lineToRelative(0.765f, 0.249f)
            curveToRelative(0.233f, 0.077f, 0.445f, 0.208f, 0.618f, 0.382f)
            curveToRelative(0.174f, 0.174f, 0.304f, 0.386f, 0.381f, 0.62f)
            lineToRelative(0.249f, 0.764f)
            curveToRelative(0.02f, 0.06f, 0.06f, 0.11f, 0.11f, 0.146f)
            curveTo(15.376f, 10.982f, 15.437f, 11f, 15.5f, 11f)
            curveToRelative(0.063f, 0f, 0.124f, -0.02f, 0.175f, -0.056f)
            curveToRelative(0.05f, -0.036f, 0.09f, -0.087f, 0.11f, -0.146f)
            lineToRelative(0.249f, -0.764f)
            curveTo(16.11f, 9.8f, 16.242f, 9.59f, 16.415f, 9.415f)
            curveToRelative(0.174f, -0.173f, 0.385f, -0.303f, 0.618f, -0.38f)
            lineToRelative(0.765f, -0.25f)
            curveToRelative(0.06f, -0.02f, 0.11f, -0.059f, 0.147f, -0.11f)
            curveTo(17.98f, 8.626f, 18f, 8.564f, 18f, 8.502f)
            curveToRelative(0f, -0.063f, -0.02f, -0.124f, -0.055f, -0.175f)
            curveToRelative(-0.037f, -0.05f, -0.088f, -0.09f, -0.147f, -0.11f)
            lineToRelative(-0.015f, -0.004f)
            close()
            moveToRelative(-4.905f, -7.931f)
            lineToRelative(0.348f, 1.071f)
            curveToRelative(0.108f, 0.326f, 0.291f, 0.621f, 0.534f, 0.864f)
            curveToRelative(0.243f, 0.243f, 0.539f, 0.425f, 0.864f, 0.533f)
            lineToRelative(1.072f, 0.348f)
            lineToRelative(0.021f, 0.006f)
            curveToRelative(0.083f, 0.029f, 0.155f, 0.083f, 0.205f, 0.154f)
            curveTo(15.972f, 3.33f, 16f, 3.415f, 16f, 3.503f)
            curveToRelative(0f, 0.087f, -0.027f, 0.173f, -0.078f, 0.244f)
            curveToRelative(-0.05f, 0.071f, -0.122f, 0.125f, -0.205f, 0.155f)
            lineTo(14.646f, 4.25f)
            curveToRelative(-0.326f, 0.108f, -0.622f, 0.29f, -0.865f, 0.533f)
            curveToRelative(-0.242f, 0.243f, -0.425f, 0.538f, -0.534f, 0.864f)
            lineTo(12.9f, 6.717f)
            curveToRelative(-0.03f, 0.083f, -0.084f, 0.156f, -0.155f, 0.206f)
            curveTo(12.673f, 6.972f, 12.588f, 7f, 12.5f, 7f)
            reflectiveCurveToRelative(-0.173f, -0.027f, -0.245f, -0.078f)
            lineToRelative(-0.02f, -0.015f)
            curveToRelative(-0.061f, -0.05f, -0.108f, -0.115f, -0.134f, -0.19f)
            lineToRelative(-0.349f, -1.07f)
            curveToRelative(-0.018f, -0.057f, -0.04f, -0.113f, -0.062f, -0.168f)
            curveToRelative(-0.11f, -0.26f, -0.27f, -0.498f, -0.47f, -0.699f)
            curveToRelative(-0.039f, -0.038f, -0.078f, -0.075f, -0.119f, -0.11f)
            curveToRelative(-0.218f, -0.19f, -0.472f, -0.334f, -0.747f, -0.426f)
            lineTo(9.283f, 3.896f)
            curveTo(9.2f, 3.867f, 9.128f, 3.813f, 9.078f, 3.742f)
            curveTo(9.028f, 3.67f, 9f, 3.585f, 9f, 3.497f)
            curveTo(9f, 3.41f, 9.027f, 3.325f, 9.078f, 3.253f)
            curveTo(9.128f, 3.182f, 9.2f, 3.128f, 9.283f, 3.098f)
            lineToRelative(1.071f, -0.348f)
            curveToRelative(0.322f, -0.11f, 0.614f, -0.295f, 0.853f, -0.537f)
            curveToRelative(0.238f, -0.242f, 0.418f, -0.537f, 0.524f, -0.86f)
            lineToRelative(0.348f, -1.07f)
            curveToRelative(0.03f, -0.083f, 0.084f, -0.155f, 0.155f, -0.205f)
            curveTo(12.306f, 0.028f, 12.391f, 0f, 12.48f, 0f)
            curveToRelative(0.087f, 0f, 0.173f, 0.027f, 0.244f, 0.078f)
            curveToRelative(0.072f, 0.05f, 0.126f, 0.122f, 0.155f, 0.204f)
            close()
        }
    }.build()
}

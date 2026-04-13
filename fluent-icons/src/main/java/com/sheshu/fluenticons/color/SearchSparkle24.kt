package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.SearchSparkle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.SearchSparkle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(13.5f, 5.33333f),
                end = Offset(3f, 17f)
            )
        ) {
            moveTo(17f, 10f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF29C3FF)
                ),
                start = Offset(3f, 19f),
                end = Offset(19f, 6f)
            )
        ) {
            moveTo(14.843f, 16.368f)
            curveTo(13.5f, 17.392f, 11.82f, 18f, 10f, 18f)
            curveToRelative(-4.418f, 0f, -8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            curveToRelative(0f, 1.877f, -0.646f, 3.603f, -1.729f, 4.967f)
            lineToRelative(4.427f, 4.317f)
            curveToRelative(0.396f, 0.386f, 0.404f, 1.019f, 0.018f, 1.414f)
            curveToRelative(-0.386f, 0.396f, -1.019f, 0.404f, -1.414f, 0.018f)
            lineToRelative(-4.459f, -4.348f)
            close()
            moveTo(16f, 10f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.718021f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(7.375f, -10.8125f),
                radius = 28.6137f
            )
        ) {
            moveTo(20.783f, 10.213f)
            lineToRelative(-0.766f, -0.248f)
            curveToRelative(-0.232f, -0.078f, -0.444f, -0.208f, -0.617f, -0.381f)
            curveToRelative(-0.173f, -0.174f, -0.304f, -0.385f, -0.381f, -0.617f)
            lineToRelative(-0.25f, -0.765f)
            curveToRelative(-0.02f, -0.06f, -0.059f, -0.11f, -0.11f, -0.146f)
            curveTo(18.61f, 8.018f, 18.547f, 8f, 18.485f, 8f)
            curveToRelative(-0.063f, 0f, -0.124f, 0.02f, -0.175f, 0.056f)
            curveToRelative(-0.051f, 0.036f, -0.09f, 0.087f, -0.11f, 0.146f)
            lineToRelative(-0.25f, 0.764f)
            curveToRelative(-0.075f, 0.231f, -0.203f, 0.442f, -0.374f, 0.615f)
            curveToRelative(-0.17f, 0.173f, -0.379f, 0.304f, -0.609f, 0.384f)
            lineToRelative(-0.765f, 0.248f)
            curveToRelative(-0.06f, 0.021f, -0.11f, 0.06f, -0.147f, 0.11f)
            curveTo(16.02f, 10.376f, 16f, 10.437f, 16f, 10.499f)
            curveToRelative(0f, 0.063f, 0.02f, 0.124f, 0.055f, 0.175f)
            curveToRelative(0.037f, 0.05f, 0.088f, 0.09f, 0.147f, 0.11f)
            lineToRelative(0.765f, 0.249f)
            curveToRelative(0.233f, 0.077f, 0.445f, 0.208f, 0.619f, 0.382f)
            curveToRelative(0.173f, 0.174f, 0.303f, 0.386f, 0.38f, 0.62f)
            lineToRelative(0.249f, 0.764f)
            curveToRelative(0.02f, 0.06f, 0.06f, 0.11f, 0.11f, 0.146f)
            curveTo(18.376f, 12.982f, 18.437f, 13f, 18.5f, 13f)
            curveToRelative(0.063f, 0f, 0.124f, -0.02f, 0.175f, -0.056f)
            curveToRelative(0.05f, -0.036f, 0.09f, -0.087f, 0.11f, -0.146f)
            lineToRelative(0.249f, -0.764f)
            curveToRelative(0.077f, -0.233f, 0.208f, -0.444f, 0.381f, -0.618f)
            curveToRelative(0.174f, -0.173f, 0.385f, -0.303f, 0.618f, -0.38f)
            lineToRelative(0.765f, -0.25f)
            curveToRelative(0.06f, -0.02f, 0.11f, -0.059f, 0.147f, -0.11f)
            curveTo(20.98f, 10.626f, 21f, 10.564f, 21f, 10.502f)
            curveToRelative(0f, -0.063f, -0.02f, -0.124f, -0.055f, -0.175f)
            curveToRelative(-0.037f, -0.05f, -0.088f, -0.09f, -0.147f, -0.11f)
            lineToRelative(-0.015f, -0.004f)
            close()
            moveToRelative(-7.695f, -3.801f)
            curveToRelative(-0.072f, -0.093f, -0.15f, -0.182f, -0.234f, -0.266f)
            curveToRelative(-0.312f, -0.313f, -0.693f, -0.55f, -1.113f, -0.69f)
            lineTo(10.363f, 5.01f)
            curveToRelative(-0.106f, -0.037f, -0.198f, -0.107f, -0.263f, -0.198f)
            curveTo(10.035f, 4.719f, 10f, 4.609f, 10f, 4.497f)
            curveToRelative(0f, -0.113f, 0.035f, -0.223f, 0.1f, -0.315f)
            curveToRelative(0.065f, -0.091f, 0.157f, -0.16f, 0.263f, -0.198f)
            lineToRelative(1.378f, -0.448f)
            curveToRelative(0.414f, -0.143f, 0.789f, -0.379f, 1.096f, -0.69f)
            curveToRelative(0.299f, -0.304f, 0.525f, -0.67f, 0.663f, -1.072f)
            lineToRelative(0.011f, -0.034f)
            lineToRelative(0.448f, -1.377f)
            curveToRelative(0.038f, -0.106f, 0.107f, -0.198f, 0.2f, -0.263f)
            curveToRelative(0.091f, -0.065f, 0.2f, -0.1f, 0.313f, -0.1f)
            curveToRelative(0.113f, 0f, 0.223f, 0.035f, 0.315f, 0.1f)
            reflectiveCurveToRelative(0.161f, 0.157f, 0.199f, 0.263f)
            lineToRelative(0.447f, 1.377f)
            curveToRelative(0.14f, 0.418f, 0.375f, 0.798f, 0.687f, 1.11f)
            curveToRelative(0.312f, 0.312f, 0.693f, 0.547f, 1.111f, 0.686f)
            lineToRelative(1.378f, 0.448f)
            lineToRelative(0.028f, 0.007f)
            curveToRelative(0.106f, 0.037f, 0.198f, 0.107f, 0.263f, 0.198f)
            curveToRelative(0.065f, 0.092f, 0.1f, 0.202f, 0.1f, 0.314f)
            curveToRelative(0f, 0.113f, -0.035f, 0.223f, -0.1f, 0.315f)
            curveToRelative(-0.065f, 0.091f, -0.157f, 0.16f, -0.263f, 0.198f)
            lineToRelative(-1.378f, 0.448f)
            curveToRelative(-0.419f, 0.139f, -0.8f, 0.374f, -1.112f, 0.686f)
            curveToRelative(-0.312f, 0.311f, -0.547f, 0.692f, -0.686f, 1.11f)
            lineToRelative(-0.448f, 1.377f)
            lineTo(15f, 8.671f)
            curveToRelative(-0.04f, 0.092f, -0.104f, 0.171f, -0.186f, 0.23f)
            curveTo(14.722f, 8.964f, 14.613f, 9f, 14.5f, 9f)
            curveToRelative(-0.113f, 0f, -0.222f, -0.035f, -0.314f, -0.1f)
            reflectiveCurveToRelative(-0.162f, -0.157f, -0.2f, -0.263f)
            lineTo(13.54f, 7.26f)
            curveToRelative(-0.101f, -0.307f, -0.254f, -0.593f, -0.45f, -0.848f)
            close()
        }
    }.build()
}

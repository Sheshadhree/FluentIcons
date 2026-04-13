package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.SearchSparkle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.SearchSparkle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(18.75f, 6.5f),
                end = Offset(3f, 24f)
            )
        ) {
            moveTo(24f, 13.5f)
            curveTo(24f, 19.299f, 19.299f, 24f, 13.5f, 24f)
            reflectiveCurveTo(3f, 19.299f, 3f, 13.5f)
            reflectiveCurveTo(7.7f, 3f, 13.5f, 3f)
            reflectiveCurveTo(24f, 7.701f, 24f, 13.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF29C3FF)
                ),
                start = Offset(3.42111f, 26.1578f),
                end = Offset(26.1581f, 7.68323f)
            )
        ) {
            moveTo(20.7f, 22.467f)
            curveTo(18.73f, 24.052f, 16.227f, 25f, 13.5f, 25f)
            curveTo(7.149f, 25f, 2f, 19.851f, 2f, 13.5f)
            reflectiveCurveTo(7.149f, 2f, 13.5f, 2f)
            reflectiveCurveTo(25f, 7.149f, 25f, 13.5f)
            curveToRelative(0f, 2.725f, -0.948f, 5.229f, -2.532f, 7.2f)
            lineToRelative(6.167f, 6.166f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-6.166f, -6.167f)
            close()
            moveToRelative(1.8f, -8.967f)
            curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
            reflectiveCurveToRelative(-9f, 4.03f, -9f, 9f)
            reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.718021f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(12.65f, -12.575f),
                radius = 34.3364f
            )
        ) {
            moveTo(28.74f, 12.656f)
            lineToRelative(-0.919f, -0.299f)
            curveToRelative(-0.28f, -0.092f, -0.533f, -0.249f, -0.741f, -0.457f)
            curveToRelative(-0.208f, -0.208f, -0.365f, -0.461f, -0.458f, -0.74f)
            lineToRelative(-0.298f, -0.918f)
            curveToRelative(-0.025f, -0.07f, -0.072f, -0.132f, -0.133f, -0.175f)
            curveTo(26.13f, 10.023f, 26.057f, 10f, 25.981f, 10f)
            curveToRelative(-0.074f, 0f, -0.148f, 0.023f, -0.209f, 0.067f)
            curveToRelative(-0.061f, 0.043f, -0.107f, 0.104f, -0.132f, 0.175f)
            lineToRelative(-0.3f, 0.918f)
            curveToRelative(-0.091f, 0.277f, -0.245f, 0.53f, -0.45f, 0.737f)
            curveToRelative(-0.204f, 0.208f, -0.454f, 0.365f, -0.73f, 0.46f)
            lineToRelative(-0.919f, 0.299f)
            curveToRelative(-0.07f, 0.025f, -0.132f, 0.071f, -0.175f, 0.132f)
            curveTo(23.023f, 12.85f, 23f, 12.923f, 23f, 12.998f)
            curveToRelative(0f, 0.075f, 0.023f, 0.148f, 0.067f, 0.21f)
            curveToRelative(0.043f, 0.06f, 0.104f, 0.107f, 0.175f, 0.132f)
            lineToRelative(0.919f, 0.298f)
            curveToRelative(0.28f, 0.093f, 0.534f, 0.25f, 0.742f, 0.46f)
            curveToRelative(0.208f, 0.208f, 0.364f, 0.462f, 0.456f, 0.742f)
            lineToRelative(0.299f, 0.918f)
            curveToRelative(0.025f, 0.07f, 0.071f, 0.132f, 0.132f, 0.175f)
            curveTo(25.852f, 15.977f, 25.925f, 16f, 26f, 16f)
            curveToRelative(0.075f, 0f, 0.148f, -0.023f, 0.21f, -0.067f)
            curveToRelative(0.06f, -0.043f, 0.107f, -0.104f, 0.132f, -0.175f)
            lineToRelative(0.299f, -0.918f)
            curveToRelative(0.093f, -0.279f, 0.25f, -0.532f, 0.457f, -0.74f)
            curveToRelative(0.208f, -0.208f, 0.462f, -0.365f, 0.741f, -0.457f)
            lineToRelative(0.919f, -0.299f)
            curveToRelative(0.07f, -0.025f, 0.132f, -0.071f, 0.175f, -0.132f)
            curveTo(28.977f, 13.15f, 29f, 13.077f, 29f, 13.002f)
            curveToRelative(0f, -0.075f, -0.023f, -0.148f, -0.067f, -0.21f)
            curveToRelative(-0.043f, -0.06f, -0.104f, -0.107f, -0.175f, -0.132f)
            lineToRelative(-0.018f, -0.004f)
            close()
            moveToRelative(-9.965f, -4.819f)
            curveToRelative(-0.089f, -0.114f, -0.184f, -0.223f, -0.287f, -0.326f)
            curveToRelative(-0.381f, -0.382f, -0.847f, -0.67f, -1.36f, -0.841f)
            lineToRelative(-1.684f, -0.547f)
            curveToRelative(-0.13f, -0.046f, -0.242f, -0.131f, -0.322f, -0.243f)
            curveTo(15.042f, 5.768f, 15f, 5.633f, 15f, 5.496f)
            curveToRelative(0f, -0.138f, 0.043f, -0.272f, 0.122f, -0.384f)
            curveToRelative(0.08f, -0.112f, 0.192f, -0.197f, 0.322f, -0.243f)
            lineToRelative(1.684f, -0.547f)
            curveToRelative(0.506f, -0.174f, 0.964f, -0.463f, 1.34f, -0.844f)
            curveToRelative(0.365f, -0.37f, 0.641f, -0.819f, 0.81f, -1.31f)
            lineToRelative(0.014f, -0.042f)
            lineToRelative(0.547f, -1.682f)
            curveToRelative(0.046f, -0.13f, 0.13f, -0.242f, 0.243f, -0.322f)
            curveTo(20.194f, 0.042f, 20.33f, 0f, 20.466f, 0f)
            curveToRelative(0.138f, 0f, 0.272f, 0.043f, 0.384f, 0.122f)
            curveToRelative(0.113f, 0.08f, 0.198f, 0.192f, 0.244f, 0.322f)
            lineToRelative(0.547f, 1.682f)
            curveToRelative(0.17f, 0.512f, 0.457f, 0.977f, 0.839f, 1.358f)
            curveToRelative(0.381f, 0.381f, 0.846f, 0.668f, 1.358f, 0.838f)
            lineToRelative(1.684f, 0.547f)
            lineToRelative(0.034f, 0.008f)
            curveToRelative(0.13f, 0.046f, 0.242f, 0.131f, 0.322f, 0.243f)
            curveTo(25.958f, 5.232f, 26f, 5.367f, 26f, 5.504f)
            curveToRelative(0f, 0.138f, -0.043f, 0.272f, -0.122f, 0.384f)
            curveToRelative(-0.08f, 0.112f, -0.192f, 0.197f, -0.322f, 0.243f)
            lineToRelative(-1.684f, 0.547f)
            curveToRelative(-0.512f, 0.17f, -0.977f, 0.457f, -1.358f, 0.838f)
            curveToRelative(-0.382f, 0.381f, -0.67f, 0.846f, -0.84f, 1.358f)
            lineToRelative(-0.547f, 1.682f)
            lineToRelative(-0.016f, 0.042f)
            curveToRelative(-0.048f, 0.112f, -0.127f, 0.209f, -0.227f, 0.28f)
            curveTo(20.772f, 10.958f, 20.638f, 11f, 20.5f, 11f)
            reflectiveCurveToRelative(-0.272f, -0.043f, -0.384f, -0.122f)
            curveToRelative(-0.113f, -0.08f, -0.197f, -0.192f, -0.243f, -0.322f)
            lineToRelative(-0.548f, -1.682f)
            curveToRelative(-0.123f, -0.376f, -0.31f, -0.726f, -0.55f, -1.037f)
            close()
        }
    }.build()
}

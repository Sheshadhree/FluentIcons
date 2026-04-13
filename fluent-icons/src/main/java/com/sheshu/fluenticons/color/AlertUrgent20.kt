package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AlertUrgent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AlertUrgent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(9.5f, 15.5f),
                end = Offset(10.6719f, 18f)
            )
        ) {
            moveTo(12f, 16f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(14.5f, 14.5f),
                end = Offset(3.42008f, 6.9977f)
            )
        ) {
            moveTo(2.466f, 12.248f)
            curveToRelative(-1.16f, -2.602f, 0.011f, -5.651f, 2.614f, -6.81f)
            curveToRelative(2.602f, -1.158f, 5.65f, 0.012f, 6.81f, 2.615f)
            lineToRelative(1.224f, 2.748f)
            lineToRelative(1.664f, 1.619f)
            curveToRelative(0.38f, 0.37f, 0.267f, 1.007f, -0.218f, 1.223f)
            lineToRelative(-9.727f, 4.33f)
            curveToRelative(-0.485f, 0.216f, -1.034f, -0.125f, -1.054f, -0.656f)
            lineToRelative(-0.09f, -2.32f)
            lineToRelative(-1.224f, -2.749f)
            close()
            moveTo(13.447f, 1.505f)
            curveToRelative(-0.369f, -0.188f, -0.82f, -0.042f, -1.009f, 0.327f)
            curveToRelative(-0.188f, 0.37f, -0.041f, 0.821f, 0.328f, 1.01f)
            curveTo(15.28f, 4.123f, 17f, 6.736f, 17f, 9.75f)
            curveToRelative(0f, 0.108f, -0.002f, 0.215f, -0.007f, 0.321f)
            curveToRelative(-0.016f, 0.414f, 0.305f, 0.763f, 0.72f, 0.78f)
            curveToRelative(0.413f, 0.017f, 0.762f, -0.305f, 0.78f, -0.719f)
            curveToRelative(0.004f, -0.127f, 0.007f, -0.254f, 0.007f, -0.382f)
            curveToRelative(0f, -3.599f, -2.055f, -6.716f, -5.053f, -8.245f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF5B2AB5)
                ),
                start = Offset(13.362f, 2.67636f),
                end = Offset(17.5777f, 11.5883f)
            )
        ) {
            moveTo(12.917f, 4.082f)
            curveToRelative(-0.348f, -0.225f, -0.812f, -0.126f, -1.037f, 0.222f)
            curveToRelative(-0.226f, 0.346f, -0.127f, 0.812f, 0.22f, 1.036f)
            curveToRelative(1.425f, 0.924f, 2.372f, 2.516f, 2.398f, 4.331f)
            curveToRelative(0.006f, 0.415f, 0.347f, 0.746f, 0.761f, 0.74f)
            curveToRelative(0.414f, -0.006f, 0.745f, -0.347f, 0.74f, -0.761f)
            curveToRelative(-0.034f, -2.336f, -1.255f, -4.384f, -3.083f, -5.569f)
            close()
        }
    }.build()
}

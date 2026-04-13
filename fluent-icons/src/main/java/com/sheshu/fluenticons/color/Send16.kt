package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Send16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Send16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(0.499878f, 8f),
                radius = 7.43807f
            )
        ) {
            moveTo(8.805f, 8.958f)
            lineTo(1.994f, 11f)
            lineTo(2.89f, 8f)
            lineTo(1.994f, 5f)
            lineToRelative(6.81f, 2.042f)
            curveToRelative(0.951f, 0.285f, 0.951f, 1.63f, 0f, 1.916f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(1f, -4.6875f),
                end = Offset(12.9902f, 11.2444f)
            )
        ) {
            moveTo(1.724f, 1.053f)
            curveToRelative(-0.171f, -0.086f, -0.376f, -0.066f, -0.528f, 0.05f)
            curveTo(1.045f, 1.219f, 0.972f, 1.41f, 1.01f, 1.598f)
            lineToRelative(1.403f, 4.85f)
            curveTo(2.466f, 6.632f, 2.62f, 6.77f, 2.81f, 6.802f)
            lineTo(8.5f, 7.755f)
            curveToRelative(0.268f, 0.053f, 0.268f, 0.437f, 0f, 0.49f)
            lineTo(2.81f, 9.198f)
            curveTo(2.62f, 9.23f, 2.466f, 9.368f, 2.413f, 9.552f)
            lineToRelative(-1.403f, 4.85f)
            curveToRelative(-0.038f, 0.187f, 0.035f, 0.38f, 0.186f, 0.495f)
            curveToRelative(0.152f, 0.116f, 0.357f, 0.136f, 0.528f, 0.05f)
            lineToRelative(13f, -6.5f)
            curveTo(14.893f, 8.363f, 15f, 8.19f, 15f, 8f)
            reflectiveCurveToRelative(-0.107f, -0.362f, -0.276f, -0.447f)
            lineToRelative(-13f, -6.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125345f to Color(0x00DCF8FF),
                    0.768599f to Color(0xB2FF6CE8)
                ),
                start = Offset(7.99999f, 4.77344f),
                end = Offset(11.6409f, 14.6245f)
            )
        ) {
            moveTo(1.724f, 1.053f)
            curveToRelative(-0.171f, -0.086f, -0.376f, -0.066f, -0.528f, 0.05f)
            curveTo(1.045f, 1.219f, 0.972f, 1.41f, 1.01f, 1.598f)
            lineToRelative(1.403f, 4.85f)
            curveTo(2.466f, 6.632f, 2.62f, 6.77f, 2.81f, 6.802f)
            lineTo(8.5f, 7.755f)
            curveToRelative(0.268f, 0.053f, 0.268f, 0.437f, 0f, 0.49f)
            lineTo(2.81f, 9.198f)
            curveTo(2.62f, 9.23f, 2.466f, 9.368f, 2.413f, 9.552f)
            lineToRelative(-1.403f, 4.85f)
            curveToRelative(-0.038f, 0.187f, 0.035f, 0.38f, 0.186f, 0.495f)
            curveToRelative(0.152f, 0.116f, 0.357f, 0.136f, 0.528f, 0.05f)
            lineToRelative(13f, -6.5f)
            curveTo(14.893f, 8.363f, 15f, 8.19f, 15f, 8f)
            reflectiveCurveToRelative(-0.107f, -0.362f, -0.276f, -0.447f)
            lineToRelative(-13f, -6.5f)
            close()
        }
    }.build()
}

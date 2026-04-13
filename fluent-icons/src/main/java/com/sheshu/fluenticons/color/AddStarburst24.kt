package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AddStarburst24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AddStarburst24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC470),
                    0.251092f to Color(0xFFFF835C),
                    0.550473f to Color(0xFFF24A9D),
                    0.813923f to Color(0xFFB339F0)
                ),
                center = Offset(26.2447f, 26.2115f),
                radius = 48.6467f
            )
        ) {
            moveTo(12.793f, 1.383f)
            curveToRelative(-0.4f, -0.515f, -1.179f, -0.515f, -1.579f, 0f)
            lineTo(9.801f, 3.2f)
            curveTo(9.733f, 3.288f, 9.614f, 3.32f, 9.51f, 3.277f)
            lineTo(7.378f, 2.41f)
            curveTo(6.774f, 2.165f, 6.101f, 2.554f, 6.011f, 3.2f)
            lineTo(5.696f, 5.48f)
            curveTo(5.68f, 5.59f, 5.593f, 5.678f, 5.483f, 5.693f)
            lineToRelative(-2.28f, 0.315f)
            curveToRelative(-0.646f, 0.09f, -1.035f, 0.763f, -0.79f, 1.367f)
            lineToRelative(0.868f, 2.132f)
            curveTo(3.322f, 9.611f, 3.29f, 9.73f, 3.201f, 9.799f)
            lineTo(1.386f, 11.21f)
            curveToRelative(-0.515f, 0.4f, -0.515f, 1.178f, 0f, 1.579f)
            lineToRelative(1.816f, 1.413f)
            curveToRelative(0.089f, 0.068f, 0.12f, 0.187f, 0.079f, 0.291f)
            lineToRelative(-0.867f, 2.132f)
            curveToRelative(-0.246f, 0.604f, 0.143f, 1.277f, 0.79f, 1.367f)
            lineToRelative(2.278f, 0.315f)
            curveToRelative(0.111f, 0.015f, 0.199f, 0.102f, 0.214f, 0.213f)
            lineToRelative(0.315f, 2.28f)
            curveToRelative(0.09f, 0.646f, 0.763f, 1.035f, 1.367f, 0.79f)
            lineToRelative(2.132f, -0.868f)
            curveToRelative(0.104f, -0.042f, 0.223f, -0.01f, 0.291f, 0.079f)
            lineToRelative(1.413f, 1.816f)
            curveToRelative(0.4f, 0.515f, 1.178f, 0.515f, 1.579f, 0f)
            lineToRelative(1.413f, -1.816f)
            curveToRelative(0.068f, -0.089f, 0.187f, -0.12f, 0.291f, -0.079f)
            lineToRelative(2.131f, 0.867f)
            curveToRelative(0.605f, 0.246f, 1.278f, -0.143f, 1.368f, -0.79f)
            lineToRelative(0.315f, -2.279f)
            curveToRelative(0.015f, -0.11f, 0.102f, -0.198f, 0.213f, -0.213f)
            lineToRelative(2.28f, -0.315f)
            curveToRelative(0.646f, -0.09f, 1.035f, -0.763f, 0.789f, -1.367f)
            lineToRelative(-0.867f, -2.132f)
            curveToRelative(-0.042f, -0.104f, -0.01f, -0.223f, 0.079f, -0.291f)
            lineToRelative(1.816f, -1.413f)
            curveToRelative(0.515f, -0.4f, 0.515f, -1.178f, 0f, -1.579f)
            lineTo(20.805f, 9.8f)
            curveToRelative(-0.089f, -0.07f, -0.12f, -0.188f, -0.079f, -0.292f)
            lineToRelative(0.867f, -2.132f)
            curveToRelative(0.246f, -0.604f, -0.143f, -1.277f, -0.79f, -1.367f)
            lineToRelative(-2.279f, -0.315f)
            curveToRelative(-0.11f, -0.015f, -0.198f, -0.103f, -0.213f, -0.213f)
            lineTo(17.996f, 3.2f)
            curveToRelative(-0.09f, -0.646f, -0.763f, -1.035f, -1.367f, -0.79f)
            lineToRelative(-2.132f, 0.868f)
            curveToRelative(-0.104f, 0.042f, -0.223f, 0.01f, -0.291f, -0.079f)
            lineToRelative(-1.413f, -1.816f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0238693f to Color(0xFFFFC8D7),
                    0.807402f to Color.White
                ),
                start = Offset(16.3055f, 19.8232f),
                end = Offset(5.81275f, 13.0265f)
            ),
            fillAlpha = 0.95f
        ) {
            moveTo(12f, 7f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(-3.5f)
            curveTo(7.336f, 12.75f, 7f, 12.414f, 7f, 12f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(-3.5f)
            curveTo(11.25f, 7.336f, 11.586f, 7f, 12f, 7f)
            close()
        }
    }.build()
}

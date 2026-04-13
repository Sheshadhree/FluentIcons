package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AddStarburst32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AddStarburst32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC470),
                    0.251092f to Color(0xFFFF835C),
                    0.550473f to Color(0xFFF24A9D),
                    0.813923f to Color(0xFFB339F0)
                ),
                center = Offset(35.4138f, 35.3726f),
                radius = 66.3157f
            )
        ) {
            moveTo(16.01f, 30.98f)
            curveToRelative(-0.39f, 0f, -0.75f, -0.18f, -0.99f, -0.48f)
            lineToRelative(-2.162f, -2.78f)
            lineToRelative(-3.262f, 1.33f)
            curveToRelative(-0.36f, 0.15f, -0.76f, 0.12f, -1.101f, -0.08f)
            curveToRelative(-0.33f, -0.19f, -0.56f, -0.53f, -0.61f, -0.91f)
            lineToRelative(-0.48f, -3.49f)
            lineToRelative(-3.483f, -0.48f)
            curveToRelative(-0.39f, -0.05f, -0.72f, -0.28f, -0.91f, -0.61f)
            curveToRelative(-0.19f, -0.34f, -0.22f, -0.74f, -0.07f, -1.1f)
            lineToRelative(1.32f, -3.261f)
            lineToRelative(-2.782f, -2.16f)
            curveToRelative(-0.31f, -0.24f, -0.48f, -0.6f, -0.48f, -0.99f)
            reflectiveCurveToRelative(0.18f, -0.75f, 0.48f, -0.99f)
            lineToRelative(2.782f, -2.16f)
            lineToRelative(-1.32f, -3.26f)
            curveToRelative(-0.15f, -0.36f, -0.12f, -0.76f, 0.07f, -1.09f)
            curveToRelative(0.19f, -0.33f, 0.53f, -0.56f, 0.91f, -0.61f)
            lineToRelative(3.482f, -0.481f)
            lineToRelative(0.48f, -3.48f)
            curveToRelative(0.05f, -0.39f, 0.28f, -0.72f, 0.611f, -0.91f)
            curveToRelative(0.34f, -0.19f, 0.74f, -0.22f, 1.1f, -0.07f)
            lineToRelative(3.263f, 1.32f)
            lineToRelative(2.161f, -2.78f)
            curveToRelative(0.48f, -0.61f, 1.501f, -0.61f, 1.972f, 0f)
            lineToRelative(2.161f, 2.78f)
            lineToRelative(3.262f, -1.32f)
            curveToRelative(0.36f, -0.15f, 0.76f, -0.12f, 1.091f, 0.07f)
            curveToRelative(0.34f, 0.19f, 0.56f, 0.53f, 0.61f, 0.91f)
            lineToRelative(0.48f, 3.49f)
            lineToRelative(3.483f, 0.48f)
            curveToRelative(0.39f, 0.05f, 0.72f, 0.28f, 0.91f, 0.61f)
            curveToRelative(0.19f, 0.34f, 0.22f, 0.74f, 0.07f, 1.1f)
            lineToRelative(-1.32f, 3.26f)
            lineToRelative(2.782f, 2.16f)
            curveToRelative(0.31f, 0.24f, 0.48f, 0.6f, 0.48f, 0.99f)
            reflectiveCurveToRelative(-0.18f, 0.75f, -0.48f, 0.99f)
            lineToRelative(-2.782f, 2.161f)
            lineToRelative(1.33f, 3.26f)
            curveToRelative(0.15f, 0.36f, 0.12f, 0.76f, -0.08f, 1.09f)
            curveToRelative(-0.19f, 0.34f, -0.53f, 0.56f, -0.91f, 0.62f)
            lineToRelative(-3.492f, 0.48f)
            lineToRelative(-0.48f, 3.49f)
            curveToRelative(-0.05f, 0.38f, -0.28f, 0.72f, -0.611f, 0.91f)
            curveToRelative(-0.34f, 0.19f, -0.74f, 0.22f, -1.09f, 0.08f)
            lineToRelative(-3.263f, -1.33f)
            lineToRelative(-2.161f, 2.781f)
            curveTo(16.74f, 30.83f, 16.38f, 31f, 15.99f, 31f)
            lineToRelative(0.02f, -0.02f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0238693f to Color(0xFFFFC8D7),
                    0.807402f to Color.White
                ),
                start = Offset(22.0277f, 26.9524f),
                end = Offset(7.33785f, 17.4371f)
            ),
            fillAlpha = 0.95f
        ) {
            moveTo(15f, 10f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}

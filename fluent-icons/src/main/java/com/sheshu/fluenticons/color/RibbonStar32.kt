package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.RibbonStar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.RibbonStar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF)
                ),
                center = Offset(16f, 17.6457f),
                radius = 16.8444f
            )
        ) {
            moveTo(10f, 19.313f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.36f, 0.194f, 0.693f, 0.507f, 0.87f)
            curveToRelative(0.314f, 0.178f, 0.699f, 0.173f, 1.008f, -0.012f)
            lineTo(16f, 27.166f)
            lineToRelative(4.485f, 2.692f)
            curveToRelative(0.31f, 0.185f, 0.694f, 0.19f, 1.008f, 0.012f)
            curveTo(21.806f, 29.693f, 22f, 29.36f, 22f, 29f)
            verticalLineToRelative(-9.687f)
            curveTo(20.253f, 20.383f, 18.199f, 21f, 16f, 21f)
            reflectiveCurveToRelative(-4.253f, -0.617f, -6f, -1.687f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-37.2143f, -68f),
                radius = 111.635f
            )
        ) {
            moveTo(22f, 20f)
            curveToRelative(-1.671f, 1.256f, -3.749f, 2f, -6f, 2f)
            reflectiveCurveToRelative(-4.329f, -0.744f, -6f, -2f)
            curveToRelative(-0.123f, -0.091f, -0.243f, -0.186f, -0.36f, -0.284f)
            curveTo(7.416f, 17.883f, 6f, 15.107f, 6f, 12f)
            curveTo(6f, 6.477f, 10.477f, 2f, 16f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            curveToRelative(0f, 3.272f, -1.571f, 6.176f, -4f, 8f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB03111),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(18.5f, 16.5473f),
                radius = 17.4399f
            )
        ) {
            moveTo(16.336f, 7.21f)
            lineToRelative(1.34f, 2.72f)
            lineToRelative(3.003f, 0.434f)
            curveToRelative(0.307f, 0.044f, 0.43f, 0.422f, 0.207f, 0.64f)
            lineToRelative(-2.171f, 2.115f)
            lineToRelative(0.513f, 2.99f)
            curveToRelative(0.052f, 0.306f, -0.27f, 0.539f, -0.544f, 0.394f)
            lineTo(16f, 15.09f)
            lineToRelative(-2.684f, 1.413f)
            curveToRelative(-0.275f, 0.145f, -0.596f, -0.088f, -0.544f, -0.395f)
            lineToRelative(0.516f, -2.99f)
            lineToRelative(-2.174f, -2.115f)
            curveToRelative(-0.223f, -0.216f, -0.1f, -0.595f, 0.207f, -0.639f)
            lineToRelative(3.003f, -0.434f)
            lineToRelative(1.34f, -2.72f)
            curveToRelative(0.137f, -0.28f, 0.535f, -0.28f, 0.672f, 0f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RibbonStar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RibbonStar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 29f)
            verticalLineToRelative(-7.187f)
            curveToRelative(1.747f, 1.07f, 3.801f, 1.687f, 6f, 1.687f)
            reflectiveCurveToRelative(4.253f, -0.617f, 6f, -1.687f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.36f, -0.194f, 0.693f, -0.507f, 0.87f)
            curveToRelative(-0.314f, 0.178f, -0.699f, 0.173f, -1.008f, -0.012f)
            lineTo(16f, 27.166f)
            lineToRelative(-4.486f, 2.692f)
            curveToRelative(-0.308f, 0.185f, -0.693f, 0.19f, -1.007f, 0.012f)
            curveTo(10.194f, 29.693f, 10f, 29.36f, 10f, 29f)
            close()
            moveToRelative(6f, -7f)
            curveToRelative(2.251f, 0f, 4.329f, -0.744f, 6f, -2f)
            curveToRelative(2.429f, -1.824f, 4f, -4.728f, 4f, -8f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(6f, 6.477f, 6f, 12f)
            curveToRelative(0f, 3.107f, 1.417f, 5.882f, 3.64f, 7.716f)
            curveToRelative(0.117f, 0.098f, 0.237f, 0.193f, 0.36f, 0.285f)
            curveTo(11.671f, 21.256f, 13.749f, 22f, 16f, 22f)
            close()
            moveToRelative(1.676f, -12.07f)
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
            lineToRelative(1.34f, 2.72f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.HeartCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HeartCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.696f, 16.856f)
            lineTo(7.59f, 12.064f)
            curveTo(6.815f, 11.159f, 6.8f, 9.828f, 7.554f, 8.905f)
            curveToRelative(0.912f, -1.116f, 2.584f, -1.212f, 3.619f, -0.208f)
            lineTo(12f, 9.5f)
            lineToRelative(0.827f, -0.803f)
            curveToRelative(1.034f, -1.004f, 2.707f, -0.908f, 3.62f, 0.209f)
            curveToRelative(0.754f, 0.922f, 0.738f, 2.253f, -0.037f, 3.159f)
            lineToRelative(-4.106f, 4.79f)
            curveToRelative(-0.16f, 0.187f, -0.448f, 0.187f, -0.608f, 0f)
            close()
            moveTo(22f, 12f)
            curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            close()
            moveToRelative(-1.5f, 0f)
            curveToRelative(0f, -4.694f, -3.806f, -8.5f, -8.5f, -8.5f)
            reflectiveCurveTo(3.5f, 7.306f, 3.5f, 12f)
            reflectiveCurveToRelative(3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            close()
        }
    }.build()
}

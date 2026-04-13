package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CompassTrueNorth16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CompassTrueNorth16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveToRelative(0f, 1f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
            moveTo(7.871f, 3.509f)
            curveToRelative(0.417f, -0.054f, 0.864f, 0.148f, 1.055f, 0.606f)
            lineToRelative(0.962f, 2.306f)
            lineToRelative(0.003f, 0.008f)
            lineToRelative(0.092f, 0.222f)
            curveToRelative(0.36f, 0.863f, 0.36f, 1.834f, 0f, 2.697f)
            lineToRelative(-1.058f, 2.537f)
            curveToRelative(-0.342f, 0.82f, -1.504f, 0.82f, -1.846f, 0f)
            lineTo(6.02f, 9.348f)
            curveToRelative(-0.36f, -0.863f, -0.36f, -1.834f, 0f, -2.697f)
            lineToRelative(1.06f, -2.536f)
            curveTo(7.23f, 3.753f, 7.541f, 3.551f, 7.871f, 3.51f)
            close()
            moveTo(6.85f, 8.695f)
            curveToRelative(0.026f, 0.09f, 0.056f, 0.18f, 0.092f, 0.268f)
            lineToRelative(1.06f, 2.536f)
            lineTo(9.06f, 8.963f)
            curveToRelative(0.037f, -0.087f, 0.066f, -0.177f, 0.092f, -0.267f)
            curveToRelative(-0.137f, 0.085f, -0.287f, 0.155f, -0.45f, 0.202f)
            curveToRelative(-0.457f, 0.133f, -0.942f, 0.133f, -1.398f, 0f)
            curveTo(7.139f, 8.851f, 6.988f, 8.781f, 6.85f, 8.695f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DismissCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DismissCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveTo(7.81f, 7.114f)
            lineToRelative(0.069f, 0.058f)
            lineTo(10f, 9.292f)
            lineToRelative(2.121f, -2.12f)
            curveToRelative(0.174f, -0.174f, 0.443f, -0.193f, 0.638f, -0.058f)
            lineToRelative(0.07f, 0.058f)
            curveToRelative(0.173f, 0.173f, 0.192f, 0.443f, 0.057f, 0.637f)
            lineToRelative(-0.058f, 0.07f)
            lineTo(10.708f, 10f)
            lineToRelative(2.12f, 2.121f)
            curveToRelative(0.174f, 0.174f, 0.193f, 0.443f, 0.058f, 0.638f)
            lineToRelative(-0.058f, 0.07f)
            curveToRelative(-0.173f, 0.173f, -0.443f, 0.192f, -0.637f, 0.057f)
            lineToRelative(-0.07f, -0.058f)
            lineTo(10f, 10.708f)
            lineToRelative(-2.121f, 2.12f)
            curveToRelative(-0.174f, 0.174f, -0.443f, 0.193f, -0.638f, 0.058f)
            lineToRelative(-0.07f, -0.058f)
            curveToRelative(-0.173f, -0.173f, -0.192f, -0.443f, -0.057f, -0.637f)
            lineToRelative(0.058f, -0.07f)
            lineTo(9.292f, 10f)
            lineToRelative(-2.12f, -2.121f)
            curveTo(6.998f, 7.705f, 6.979f, 7.436f, 7.114f, 7.24f)
            lineToRelative(0.058f, -0.07f)
            curveToRelative(0.173f, -0.171f, 0.443f, -0.19f, 0.637f, -0.055f)
            close()
        }
    }.build()
}

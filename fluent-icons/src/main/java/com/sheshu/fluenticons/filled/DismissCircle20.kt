package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DismissCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DismissCircle20",
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
            moveTo(7.81f, 7.114f)
            curveTo(7.614f, 6.979f, 7.344f, 6.998f, 7.171f, 7.172f)
            lineTo(7.114f, 7.24f)
            curveTo(6.979f, 7.436f, 6.998f, 7.705f, 7.172f, 7.879f)
            lineTo(9.292f, 10f)
            lineToRelative(-2.12f, 2.121f)
            lineToRelative(-0.058f, 0.07f)
            curveToRelative(-0.135f, 0.194f, -0.116f, 0.464f, 0.058f, 0.637f)
            lineToRelative(0.069f, 0.058f)
            curveToRelative(0.195f, 0.135f, 0.464f, 0.116f, 0.638f, -0.058f)
            lineTo(10f, 10.708f)
            lineToRelative(2.121f, 2.12f)
            lineToRelative(0.07f, 0.058f)
            curveToRelative(0.194f, 0.135f, 0.464f, 0.116f, 0.637f, -0.058f)
            lineToRelative(0.058f, -0.069f)
            curveToRelative(0.135f, -0.195f, 0.116f, -0.464f, -0.058f, -0.638f)
            lineTo(10.708f, 10f)
            lineToRelative(2.12f, -2.121f)
            lineToRelative(0.058f, -0.07f)
            curveToRelative(0.135f, -0.194f, 0.116f, -0.464f, -0.058f, -0.637f)
            lineTo(12.76f, 7.114f)
            curveToRelative(-0.195f, -0.135f, -0.464f, -0.116f, -0.638f, 0.058f)
            lineTo(10f, 9.292f)
            lineToRelative(-2.121f, -2.12f)
            lineToRelative(-0.07f, -0.058f)
            close()
        }
    }.build()
}

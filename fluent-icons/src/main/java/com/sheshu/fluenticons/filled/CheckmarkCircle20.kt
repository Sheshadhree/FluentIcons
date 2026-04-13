package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CheckmarkCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckmarkCircle20",
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
            moveToRelative(3.358f, 5.646f)
            curveToRelative(-0.173f, -0.173f, -0.443f, -0.192f, -0.637f, -0.057f)
            lineToRelative(-0.07f, 0.057f)
            lineTo(9f, 11.299f)
            lineTo(7.354f, 9.651f)
            lineToRelative(-0.07f, -0.057f)
            curveTo(7.09f, 9.459f, 6.82f, 9.478f, 6.646f, 9.65f)
            curveToRelative(-0.173f, 0.175f, -0.192f, 0.444f, -0.056f, 0.64f)
            lineToRelative(0.057f, 0.07f)
            lineToRelative(2f, 2f)
            lineToRelative(0.07f, 0.057f)
            curveToRelative(0.17f, 0.118f, 0.398f, 0.118f, 0.568f, 0f)
            lineToRelative(0.07f, -0.058f)
            lineToRelative(4.004f, -4.005f)
            lineToRelative(0.058f, -0.069f)
            curveToRelative(0.135f, -0.195f, 0.116f, -0.464f, -0.058f, -0.638f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CompassNorthwest20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CompassNorthwest20",
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
            moveTo(7.316f, 6.323f)
            curveTo(6.684f, 6.032f, 6.03f, 6.686f, 6.321f, 7.318f)
            lineToRelative(1.502f, 3.264f)
            curveToRelative(0.324f, 0.704f, 0.89f, 1.269f, 1.593f, 1.593f)
            lineToRelative(3.265f, 1.502f)
            curveToRelative(0.632f, 0.29f, 1.286f, -0.363f, 0.995f, -0.995f)
            lineToRelative(-1.503f, -3.263f)
            curveToRelative(-0.324f, -0.704f, -0.89f, -1.269f, -1.593f, -1.593f)
            lineTo(7.316f, 6.323f)
            close()
        }
    }.build()
}

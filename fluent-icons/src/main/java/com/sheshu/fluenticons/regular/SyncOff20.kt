package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SyncOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SyncOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(8f, -7f)
            curveTo(6.473f, 3f, 3.556f, 5.608f, 3.07f, 9f)
            horizontalLineToRelative(5.196f)
            lineToRelative(0.753f, -2.638f)
            curveTo(9.095f, 6.097f, 9.372f, 5.943f, 9.637f, 6.02f)
            curveToRelative(0.266f, 0.076f, 0.42f, 0.353f, 0.344f, 0.618f)
            lineToRelative(-2f, 7f)
            curveToRelative(-0.076f, 0.266f, -0.353f, 0.42f, -0.618f, 0.343f)
            curveToRelative(-0.266f, -0.075f, -0.42f, -0.352f, -0.344f, -0.618f)
            lineTo(7.98f, 10f)
            horizontalLineTo(3f)
            curveToRelative(0f, 3.866f, 3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            horizontalLineToRelative(-4.98f)
            lineToRelative(-1.04f, 3.637f)
            curveToRelative(-0.075f, 0.266f, -0.352f, 0.42f, -0.617f, 0.343f)
            curveToRelative(-0.266f, -0.075f, -0.42f, -0.352f, -0.344f, -0.618f)
            lineToRelative(2f, -7f)
            curveToRelative(0.076f, -0.265f, 0.353f, -0.419f, 0.618f, -0.343f)
            curveToRelative(0.266f, 0.076f, 0.42f, 0.353f, 0.344f, 0.618f)
            lineTo(12.306f, 9f)
            horizontalLineToRelative(4.623f)
            curveTo(16.444f, 5.608f, 13.527f, 3f, 10f, 3f)
            close()
        }
    }.build()
}

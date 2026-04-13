package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DismissCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DismissCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            reflectiveCurveToRelative(3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveToRelative(-3.806f, -8.5f, -8.5f, -8.5f)
            close()
            moveToRelative(3.446f, 4.897f)
            lineTo(15.53f, 8.47f)
            curveToRelative(0.267f, 0.266f, 0.29f, 0.683f, 0.073f, 0.976f)
            lineTo(15.53f, 9.53f)
            lineTo(13.061f, 12f)
            lineToRelative(2.47f, 2.47f)
            curveToRelative(0.266f, 0.266f, 0.29f, 0.683f, 0.072f, 0.976f)
            lineTo(15.53f, 15.53f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(14.47f, 15.53f)
            lineTo(12f, 13.061f)
            lineToRelative(-2.47f, 2.47f)
            curveToRelative(-0.266f, 0.266f, -0.683f, 0.29f, -0.976f, 0.072f)
            lineTo(8.47f, 15.53f)
            curveToRelative(-0.267f, -0.266f, -0.29f, -0.683f, -0.073f, -0.976f)
            lineTo(8.47f, 14.47f)
            lineTo(10.939f, 12f)
            lineToRelative(-2.47f, -2.47f)
            curveTo(8.204f, 9.264f, 8.18f, 8.847f, 8.398f, 8.554f)
            lineTo(8.47f, 8.47f)
            curveToRelative(0.266f, -0.267f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineTo(9.53f, 8.47f)
            lineTo(12f, 10.939f)
            lineToRelative(2.47f, -2.47f)
            curveToRelative(0.266f, -0.266f, 0.683f, -0.29f, 0.976f, -0.072f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.HeartCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HeartCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.6f, 7.614f)
            lineTo(9.99f, 8f)
            lineToRelative(0.4f, -0.393f)
            curveToRelative(1.032f, -1.016f, 2.757f, -0.72f, 3.392f, 0.583f)
            curveToRelative(0.384f, 0.79f, 0.242f, 1.734f, -0.357f, 2.376f)
            lineToRelative(-3.06f, 3.273f)
            curveToRelative(-0.197f, 0.212f, -0.533f, 0.212f, -0.73f, 0f)
            lineTo(6.57f, 10.561f)
            curveTo(5.974f, 9.922f, 5.831f, 8.982f, 6.213f, 8.196f)
            curveToRelative(0.631f, -1.303f, 2.356f, -1.6f, 3.386f, -0.582f)
            close()
            moveTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(8f, -7f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
        }
    }.build()
}

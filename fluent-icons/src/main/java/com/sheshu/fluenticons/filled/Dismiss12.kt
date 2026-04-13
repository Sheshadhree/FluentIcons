package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Dismiss12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dismiss12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.897f, 2.054f)
            lineTo(1.97f, 1.97f)
            curveToRelative(0.266f, -0.267f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineTo(3.03f, 1.97f)
            lineTo(6f, 4.939f)
            lineToRelative(2.97f, -2.97f)
            curveToRelative(0.293f, -0.292f, 0.767f, -0.292f, 1.06f, 0f)
            curveToRelative(0.293f, 0.294f, 0.293f, 0.768f, 0f, 1.061f)
            lineTo(7.061f, 6f)
            lineToRelative(2.97f, 2.97f)
            curveToRelative(0.266f, 0.266f, 0.29f, 0.683f, 0.072f, 0.976f)
            lineTo(10.03f, 10.03f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(8.97f, 10.03f)
            lineTo(6f, 7.061f)
            lineToRelative(-2.97f, 2.97f)
            curveToRelative(-0.293f, 0.292f, -0.767f, 0.292f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.294f, -0.293f, -0.768f, 0f, -1.061f)
            lineTo(4.939f, 6f)
            lineToRelative(-2.97f, -2.97f)
            curveTo(1.704f, 2.764f, 1.68f, 2.347f, 1.898f, 2.054f)
            lineTo(1.97f, 1.97f)
            lineTo(1.897f, 2.054f)
            close()
        }
    }.build()
}

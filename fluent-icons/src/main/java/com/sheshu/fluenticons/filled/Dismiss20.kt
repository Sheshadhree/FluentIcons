package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Dismiss20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dismiss20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.897f, 4.054f)
            lineTo(3.97f, 3.97f)
            curveToRelative(0.266f, -0.267f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineTo(5.03f, 3.97f)
            lineTo(10f, 8.939f)
            lineToRelative(4.97f, -4.97f)
            curveToRelative(0.266f, -0.266f, 0.683f, -0.29f, 0.976f, -0.072f)
            lineTo(16.03f, 3.97f)
            curveToRelative(0.267f, 0.266f, 0.29f, 0.683f, 0.073f, 0.976f)
            lineTo(16.03f, 5.03f)
            lineTo(11.061f, 10f)
            lineToRelative(4.97f, 4.97f)
            curveToRelative(0.266f, 0.266f, 0.29f, 0.683f, 0.072f, 0.976f)
            lineTo(16.03f, 16.03f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(14.97f, 16.03f)
            lineTo(10f, 11.061f)
            lineToRelative(-4.97f, 4.97f)
            curveToRelative(-0.266f, 0.266f, -0.683f, 0.29f, -0.976f, 0.072f)
            lineTo(3.97f, 16.03f)
            curveToRelative(-0.267f, -0.266f, -0.29f, -0.683f, -0.073f, -0.976f)
            lineTo(3.97f, 14.97f)
            lineTo(8.939f, 10f)
            lineToRelative(-4.97f, -4.97f)
            curveTo(3.704f, 4.764f, 3.68f, 4.347f, 3.898f, 4.054f)
            lineTo(3.97f, 3.97f)
            lineTo(3.897f, 4.054f)
            close()
        }
    }.build()
}

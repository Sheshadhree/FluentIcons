package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HeartCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, 4.418f, 3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            close()
            moveToRelative(7.6f, -2.385f)
            lineTo(9.99f, 8f)
            lineToRelative(0.4f, -0.393f)
            curveToRelative(1.032f, -1.016f, 2.757f, -0.72f, 3.392f, 0.583f)
            curveToRelative(0.384f, 0.79f, 0.242f, 1.734f, -0.357f, 2.375f)
            lineToRelative(-3.06f, 3.274f)
            curveToRelative(-0.197f, 0.212f, -0.533f, 0.212f, -0.73f, 0f)
            lineTo(6.57f, 10.561f)
            curveTo(5.974f, 9.923f, 5.832f, 8.983f, 6.213f, 8.196f)
            curveTo(6.844f, 6.894f, 8.569f, 6.597f, 9.6f, 7.615f)
            close()
        }
    }.build()
}

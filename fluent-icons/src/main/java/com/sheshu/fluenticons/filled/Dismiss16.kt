package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Dismiss16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dismiss16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.397f, 2.554f)
            lineTo(2.47f, 2.47f)
            curveToRelative(0.266f, -0.267f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineTo(3.53f, 2.47f)
            lineTo(8f, 6.939f)
            lineToRelative(4.47f, -4.47f)
            curveToRelative(0.293f, -0.292f, 0.767f, -0.292f, 1.06f, 0f)
            curveToRelative(0.293f, 0.294f, 0.293f, 0.768f, 0f, 1.061f)
            lineTo(9.061f, 8f)
            lineToRelative(4.47f, 4.47f)
            curveToRelative(0.266f, 0.266f, 0.29f, 0.683f, 0.072f, 0.976f)
            lineTo(13.53f, 13.53f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(12.47f, 13.53f)
            lineTo(8f, 9.061f)
            lineToRelative(-4.47f, 4.47f)
            curveToRelative(-0.293f, 0.292f, -0.767f, 0.292f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.294f, -0.293f, -0.768f, 0f, -1.061f)
            lineTo(6.939f, 8f)
            lineToRelative(-4.47f, -4.47f)
            curveTo(2.204f, 3.264f, 2.18f, 2.847f, 2.398f, 2.554f)
            lineTo(2.47f, 2.47f)
            lineTo(2.397f, 2.554f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Dismiss24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Dismiss24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.397f, 4.554f)
            lineTo(4.47f, 4.47f)
            curveToRelative(0.266f, -0.267f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineTo(5.53f, 4.47f)
            lineTo(12f, 10.939f)
            lineToRelative(6.47f, -6.47f)
            curveToRelative(0.293f, -0.292f, 0.767f, -0.292f, 1.06f, 0f)
            curveToRelative(0.293f, 0.294f, 0.293f, 0.768f, 0f, 1.061f)
            lineTo(13.061f, 12f)
            lineToRelative(6.47f, 6.47f)
            curveToRelative(0.266f, 0.266f, 0.29f, 0.683f, 0.072f, 0.976f)
            lineTo(19.53f, 19.53f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(18.47f, 19.53f)
            lineTo(12f, 13.061f)
            lineToRelative(-6.47f, 6.47f)
            curveToRelative(-0.293f, 0.292f, -0.767f, 0.292f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.294f, -0.293f, -0.768f, 0f, -1.061f)
            lineTo(10.939f, 12f)
            lineToRelative(-6.47f, -6.47f)
            curveTo(4.204f, 5.264f, 4.18f, 4.847f, 4.398f, 4.554f)
            lineTo(4.47f, 4.47f)
            lineTo(4.397f, 4.554f)
            close()
        }
    }.build()
}

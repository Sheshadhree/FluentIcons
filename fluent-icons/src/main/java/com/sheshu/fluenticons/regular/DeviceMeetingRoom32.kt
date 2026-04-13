package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DeviceMeetingRoom32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DeviceMeetingRoom32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.47f, 4f)
            curveTo(7.56f, 4f, 5.885f, 5.273f, 5.374f, 7.112f)
            lineToRelative(-3.22f, 11.59f)
            curveTo(1.416f, 21.364f, 3.419f, 24f, 6.184f, 24f)
            horizontalLineToRelative(19.634f)
            curveToRelative(2.765f, 0f, 4.768f, -2.635f, 4.028f, -5.299f)
            lineToRelative(-3.22f, -11.588f)
            curveTo(26.116f, 5.273f, 24.44f, 4f, 22.53f, 4f)
            horizontalLineTo(9.47f)
            close()
            moveTo(7.3f, 7.648f)
            curveTo(7.572f, 6.674f, 8.46f, 6f, 9.47f, 6f)
            horizontalLineToRelative(13.06f)
            curveToRelative(1.011f, 0f, 1.898f, 0.674f, 2.168f, 1.648f)
            lineToRelative(3.22f, 11.588f)
            curveToRelative(0.386f, 1.39f, -0.659f, 2.764f, -2.1f, 2.764f)
            horizontalLineTo(6.182f)
            curveToRelative(-1.442f, 0f, -2.487f, -1.374f, -2.1f, -2.764f)
            lineTo(7.3f, 7.649f)
            close()
            moveTo(8f, 26f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(16.002f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(7.999f)
            close()
        }
    }.build()
}

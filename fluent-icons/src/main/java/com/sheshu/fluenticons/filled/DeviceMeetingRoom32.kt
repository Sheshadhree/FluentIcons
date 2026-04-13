package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeviceMeetingRoom32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceMeetingRoom32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.374f, 7.112f)
            curveTo(5.885f, 5.274f, 7.56f, 4f, 9.47f, 4f)
            horizontalLineToRelative(13.06f)
            curveToRelative(1.91f, 0f, 3.585f, 1.273f, 4.096f, 3.112f)
            lineToRelative(3.22f, 11.59f)
            curveTo(30.584f, 21.364f, 28.581f, 24f, 25.816f, 24f)
            horizontalLineTo(6.183f)
            curveToRelative(-2.765f, 0f, -4.768f, -2.635f, -4.028f, -5.299f)
            lineToRelative(3.22f, -11.588f)
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

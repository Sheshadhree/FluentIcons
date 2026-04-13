package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeviceMeetingRoom16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceMeetingRoom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.739f, 3.458f)
            curveTo(2.982f, 2.596f, 3.769f, 2f, 4.665f, 2f)
            horizontalLineToRelative(6.67f)
            curveToRelative(0.896f, 0f, 1.683f, 0.596f, 1.926f, 1.458f)
            lineToRelative(1.66f, 5.899f)
            curveTo(15.294f, 10.684f, 14.297f, 12f, 12.917f, 12f)
            horizontalLineTo(3.083f)
            curveToRelative(-1.38f, 0f, -2.377f, -1.316f, -2.004f, -2.643f)
            lineToRelative(1.66f, -5.898f)
            close()
            moveTo(4.497f, 13f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(7.005f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(4.497f)
            close()
        }
    }.build()
}

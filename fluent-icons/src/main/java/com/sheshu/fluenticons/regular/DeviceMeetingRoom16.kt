package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DeviceMeetingRoom16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DeviceMeetingRoom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.665f, 2f)
            curveTo(3.77f, 2f, 2.982f, 2.596f, 2.74f, 3.458f)
            lineTo(1.08f, 9.357f)
            curveTo(0.706f, 10.684f, 1.703f, 12f, 3.083f, 12f)
            horizontalLineToRelative(9.834f)
            curveToRelative(1.38f, 0f, 2.377f, -1.316f, 2.004f, -2.643f)
            lineToRelative(-1.66f, -5.898f)
            curveTo(13.018f, 2.595f, 12.231f, 2f, 11.335f, 2f)
            horizontalLineToRelative(-6.67f)
            close()
            moveTo(3.702f, 3.73f)
            curveTo(3.824f, 3.297f, 4.217f, 3f, 4.665f, 3f)
            horizontalLineToRelative(6.67f)
            curveToRelative(0.448f, 0f, 0.841f, 0.298f, 0.963f, 0.73f)
            lineToRelative(1.66f, 5.898f)
            curveTo(14.152f, 10.316f, 13.634f, 11f, 12.918f, 11f)
            horizontalLineTo(3.082f)
            curveToRelative(-0.717f, 0f, -1.235f, -0.684f, -1.04f, -1.372f)
            lineToRelative(1.66f, -5.899f)
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

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TemperatureDegreeCelsius16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TemperatureDegreeCelsius16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(1f, -2f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(7f, 1f)
            curveTo(8.602f, 4f, 7f, 5.493f, 7f, 8f)
            curveToRelative(0f, 2.507f, 1.602f, 4f, 3.5f, 4f)
            curveToRelative(1.213f, 0f, 2.305f, -0.609f, 2.935f, -1.704f)
            curveTo(13.537f, 10.12f, 13.72f, 10f, 13.923f, 10f)
            curveToRelative(0.362f, 0f, 0.613f, 0.36f, 0.441f, 0.68f)
            curveTo(13.584f, 12.127f, 12.16f, 13f, 10.5f, 13f)
            curveTo(7.98f, 13f, 6f, 10.985f, 6f, 8f)
            reflectiveCurveToRelative(1.98f, -5f, 4.5f, -5f)
            curveToRelative(1.66f, 0f, 3.085f, 0.872f, 3.864f, 2.32f)
            curveTo(14.536f, 5.64f, 14.284f, 6f, 13.923f, 6f)
            curveToRelative(-0.204f, 0f, -0.386f, -0.12f, -0.488f, -0.296f)
            curveTo(12.805f, 4.609f, 11.713f, 4f, 10.5f, 4f)
            close()
        }
    }.build()
}

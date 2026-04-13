package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LocationArrow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationArrow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.93f, 3.362f)
            curveToRelative(0.31f, -0.81f, -0.484f, -1.604f, -1.293f, -1.293f)
            lineTo(2.64f, 5.915f)
            curveToRelative(-0.906f, 0.348f, -0.834f, 1.653f, 0.105f, 1.9f)
            lineToRelative(4.024f, 1.06f)
            curveTo(6.943f, 8.92f, 7.078f, 9.055f, 7.125f, 9.23f)
            lineToRelative(1.059f, 4.024f)
            curveToRelative(0.247f, 0.94f, 1.552f, 1.01f, 1.9f, 0.105f)
            lineToRelative(3.846f, -9.998f)
            close()
            moveToRelative(-0.934f, -0.36f)
            lineToRelative(-3.845f, 9.999f)
            lineToRelative(-1.06f, -4.025f)
            curveTo(7.955f, 8.453f, 7.547f, 8.045f, 7.024f, 7.907f)
            lineTo(2.998f, 6.848f)
            lineToRelative(9.998f, -3.845f)
            close()
        }
    }.build()
}

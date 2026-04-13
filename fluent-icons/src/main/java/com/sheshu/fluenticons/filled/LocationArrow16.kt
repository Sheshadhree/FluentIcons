package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.637f, 2.07f)
            curveToRelative(0.81f, -0.312f, 1.604f, 0.483f, 1.293f, 1.292f)
            lineToRelative(-3.846f, 9.998f)
            curveToRelative(-0.348f, 0.906f, -1.653f, 0.834f, -1.9f, -0.105f)
            lineToRelative(-1.06f, -4.024f)
            curveTo(7.08f, 9.056f, 6.944f, 8.92f, 6.769f, 8.874f)
            lineTo(2.744f, 7.815f)
            curveToRelative(-0.94f, -0.247f, -1.01f, -1.552f, -0.105f, -1.9f)
            lineToRelative(9.998f, -3.846f)
            close()
        }
    }.build()
}

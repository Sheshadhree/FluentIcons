package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LocationArrow12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationArrow12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.932f, 2.361f)
            curveToRelative(0.31f, -0.809f, -0.484f, -1.603f, -1.293f, -1.292f)
            lineTo(1.642f, 4.145f)
            curveToRelative(-0.906f, 0.348f, -0.834f, 1.653f, 0.105f, 1.9f)
            lineToRelative(3.05f, 0.803f)
            curveTo(4.97f, 6.894f, 5.106f, 7.03f, 5.152f, 7.204f)
            lineToRelative(0.802f, 3.05f)
            curveToRelative(0.247f, 0.939f, 1.552f, 1.01f, 1.9f, 0.104f)
            lineToRelative(3.077f, -7.997f)
            close()
            moveTo(9.998f, 2.002f)
            lineTo(6.922f, 10f)
            lineTo(6.12f, 6.95f)
            curveTo(5.982f, 6.428f, 5.574f, 6.02f, 5.05f, 5.882f)
            lineTo(2.002f, 5.078f)
            lineToRelative(7.997f, -3.076f)
            close()
        }
    }.build()
}

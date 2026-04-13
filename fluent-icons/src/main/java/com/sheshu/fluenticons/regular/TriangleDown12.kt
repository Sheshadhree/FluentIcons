package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleDown12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleDown12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.786f, 10.541f)
            curveToRelative(-0.349f, 0.612f, -1.223f, 0.612f, -1.572f, 0f)
            lineTo(1.122f, 3.372f)
            curveTo(0.774f, 2.762f, 1.211f, 2f, 1.91f, 2f)
            horizontalLineToRelative(8.182f)
            curveToRelative(0.698f, 0f, 1.135f, 0.762f, 0.787f, 1.372f)
            lineToRelative(-4.092f, 7.17f)
            close()
            moveTo(6f, 9.881f)
            lineToRelative(3.917f, -6.864f)
            horizontalLineTo(2.083f)
            lineTo(6f, 9.881f)
            close()
        }
    }.build()
}

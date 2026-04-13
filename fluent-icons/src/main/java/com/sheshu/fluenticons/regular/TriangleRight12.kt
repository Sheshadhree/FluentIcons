package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleRight12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.541f, 5.214f)
            curveToRelative(0.612f, 0.349f, 0.612f, 1.223f, 0f, 1.572f)
            lineToRelative(-7.169f, 4.092f)
            curveTo(2.762f, 11.226f, 2f, 10.789f, 2f, 10.09f)
            verticalLineTo(1.91f)
            curveToRelative(0f, -0.7f, 0.762f, -1.136f, 1.372f, -0.788f)
            lineToRelative(7.17f, 4.092f)
            close()
            moveTo(9.881f, 6f)
            lineTo(3.017f, 2.083f)
            verticalLineToRelative(7.834f)
            lineTo(9.881f, 6f)
            close()
        }
    }.build()
}

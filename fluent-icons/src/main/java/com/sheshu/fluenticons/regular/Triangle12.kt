package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Triangle12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Triangle12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.214f, 1.459f)
            curveToRelative(0.349f, -0.612f, 1.223f, -0.612f, 1.572f, 0f)
            lineToRelative(4.092f, 7.169f)
            curveTo(11.226f, 9.238f, 10.789f, 10f, 10.09f, 10f)
            horizontalLineTo(1.91f)
            curveToRelative(-0.7f, 0f, -1.136f, -0.762f, -0.788f, -1.372f)
            lineToRelative(4.092f, -7.17f)
            close()
            moveTo(6f, 2.119f)
            lineTo(2.083f, 8.983f)
            horizontalLineToRelative(7.834f)
            lineTo(6f, 2.119f)
            close()
        }
    }.build()
}

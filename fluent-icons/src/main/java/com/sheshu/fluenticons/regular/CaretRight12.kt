package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretRight12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.994f)
            curveTo(4f, 3.107f, 5.07f, 2.66f, 5.702f, 3.282f)
            lineToRelative(2.037f, 2.006f)
            curveToRelative(0.398f, 0.391f, 0.398f, 1.033f, 0f, 1.425f)
            lineTo(5.702f, 8.719f)
            curveTo(5.069f, 9.34f, 4f, 8.893f, 4f, 8.006f)
            verticalLineTo(3.994f)
            close()
            moveTo(7.037f, 6f)
            lineTo(5f, 3.994f)
            verticalLineToRelative(4.012f)
            lineTo(7.037f, 6f)
            close()
        }
    }.build()
}

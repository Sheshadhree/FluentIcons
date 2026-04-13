package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretRight12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.702f, 3.282f)
            curveTo(5.069f, 2.659f, 4f, 3.107f, 4f, 3.994f)
            verticalLineToRelative(4.012f)
            curveTo(4f, 8.893f, 5.07f, 9.341f, 5.702f, 8.72f)
            lineToRelative(2.037f, -2.006f)
            curveToRelative(0.398f, -0.392f, 0.398f, -1.034f, 0f, -1.425f)
            lineTo(5.702f, 3.282f)
            close()
        }
    }.build()
}

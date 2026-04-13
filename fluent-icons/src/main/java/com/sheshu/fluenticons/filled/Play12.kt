package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Play12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Play12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.496f, 1.994f)
            curveTo(3.83f, 1.613f, 3f, 2.094f, 3f, 2.862f)
            verticalLineToRelative(6.277f)
            curveToRelative(0f, 0.768f, 0.83f, 1.249f, 1.496f, 0.868f)
            lineToRelative(5.492f, -3.138f)
            curveToRelative(0.672f, -0.384f, 0.672f, -1.353f, 0f, -1.737f)
            lineTo(4.496f, 1.994f)
            close()
        }
    }.build()
}

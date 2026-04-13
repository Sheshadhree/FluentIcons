package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Play12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Play12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.862f)
            curveToRelative(0f, -0.768f, 0.83f, -1.25f, 1.496f, -0.868f)
            lineToRelative(5.492f, 3.138f)
            curveToRelative(0.672f, 0.384f, 0.672f, 1.353f, 0f, 1.737f)
            lineToRelative(-5.492f, 3.138f)
            curveTo(3.83f, 10.387f, 3f, 9.907f, 3f, 9.139f)
            verticalLineTo(2.862f)
            close()
            moveTo(9.492f, 6f)
            lineTo(4f, 2.862f)
            verticalLineToRelative(6.277f)
            lineTo(9.492f, 6f)
            close()
        }
    }.build()
}

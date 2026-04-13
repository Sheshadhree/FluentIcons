package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Mail12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mail12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            verticalLineToRelative(3f)
            curveTo(2f, 8.328f, 2.672f, 9f, 3.5f, 9f)
            horizontalLineToRelative(5f)
            curveTo(9.328f, 9f, 10f, 8.328f, 10f, 7.5f)
            verticalLineToRelative(-3f)
            curveTo(10f, 3.672f, 9.328f, 3f, 8.5f, 3f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(3f, 4.5f)
            curveTo(3f, 4.224f, 3.224f, 4f, 3.5f, 4f)
            horizontalLineToRelative(5f)
            curveTo(8.776f, 4f, 9f, 4.224f, 9f, 4.5f)
            verticalLineToRelative(0.17f)
            lineTo(6f, 5.955f)
            lineTo(3f, 4.67f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(0f, 1.258f)
            lineToRelative(2.803f, 1.201f)
            curveToRelative(0.126f, 0.054f, 0.268f, 0.054f, 0.394f, 0f)
            lineTo(9f, 5.758f)
            verticalLineTo(7.5f)
            curveTo(9f, 7.776f, 8.776f, 8f, 8.5f, 8f)
            horizontalLineToRelative(-5f)
            curveTo(3.224f, 8f, 3f, 7.776f, 3f, 7.5f)
            verticalLineTo(5.758f)
            close()
        }
    }.build()
}

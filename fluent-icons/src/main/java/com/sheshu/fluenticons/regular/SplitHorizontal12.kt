package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SplitHorizontal12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SplitHorizontal12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 5.5f)
            curveTo(11f, 5.224f, 10.776f, 5f, 10.5f, 5f)
            horizontalLineToRelative(-9f)
            curveTo(1.224f, 5f, 1f, 5.224f, 1f, 5.5f)
            reflectiveCurveTo(1.224f, 6f, 1.5f, 6f)
            horizontalLineToRelative(9f)
            curveTo(10.776f, 6f, 11f, 5.776f, 11f, 5.5f)
            close()
            moveToRelative(-1f, -3f)
            verticalLineTo(4f)
            horizontalLineTo(9f)
            verticalLineTo(2.5f)
            curveTo(9f, 2.224f, 8.776f, 2f, 8.5f, 2f)
            horizontalLineToRelative(-5f)
            curveTo(3.224f, 2f, 3f, 2.224f, 3f, 2.5f)
            verticalLineTo(4f)
            horizontalLineTo(2f)
            verticalLineTo(2.5f)
            curveTo(2f, 1.672f, 2.672f, 1f, 3.5f, 1f)
            horizontalLineToRelative(5f)
            curveTo(9.328f, 1f, 10f, 1.672f, 10f, 2.5f)
            close()
            moveToRelative(-7f, 6f)
            verticalLineTo(7f)
            horizontalLineTo(2f)
            verticalLineToRelative(1.5f)
            curveTo(2f, 9.328f, 2.672f, 10f, 3.5f, 10f)
            horizontalLineToRelative(5f)
            curveTo(9.328f, 10f, 10f, 9.328f, 10f, 8.5f)
            verticalLineTo(7f)
            horizontalLineTo(9f)
            verticalLineToRelative(1.5f)
            curveTo(9f, 8.776f, 8.776f, 9f, 8.5f, 9f)
            horizontalLineToRelative(-5f)
            curveTo(3.224f, 9f, 3f, 8.776f, 3f, 8.5f)
            close()
        }
    }.build()
}

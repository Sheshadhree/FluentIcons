package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SplitVertical12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SplitVertical12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 1f)
            curveTo(5.224f, 1f, 5f, 1.224f, 5f, 1.5f)
            verticalLineToRelative(9f)
            curveTo(5f, 10.776f, 5.224f, 11f, 5.5f, 11f)
            reflectiveCurveTo(6f, 10.776f, 6f, 10.5f)
            verticalLineToRelative(-9f)
            curveTo(6f, 1.224f, 5.776f, 1f, 5.5f, 1f)
            close()
            moveToRelative(-3f, 1f)
            horizontalLineTo(4f)
            verticalLineToRelative(1f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 3f, 2f, 3.224f, 2f, 3.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 8.776f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineTo(4f)
            verticalLineToRelative(1f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 10f, 1f, 9.328f, 1f, 8.5f)
            verticalLineToRelative(-5f)
            curveTo(1f, 2.672f, 1.672f, 2f, 2.5f, 2f)
            close()
            moveToRelative(6f, 7f)
            horizontalLineTo(7f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            curveTo(9.328f, 10f, 10f, 9.328f, 10f, 8.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 2.672f, 9.328f, 2f, 8.5f, 2f)
            horizontalLineTo(7f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            curveTo(8.776f, 3f, 9f, 3.224f, 9f, 3.5f)
            verticalLineToRelative(5f)
            curveTo(9f, 8.776f, 8.776f, 9f, 8.5f, 9f)
            close()
        }
    }.build()
}

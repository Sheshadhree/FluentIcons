package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookOpen16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookOpen16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2f)
            curveTo(1.672f, 2f, 1f, 2.672f, 1f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(1f, 13.328f, 1.672f, 14f, 2.5f, 14f)
            horizontalLineTo(6f)
            curveToRelative(0.818f, 0f, 1.544f, -0.393f, 2f, -1f)
            curveToRelative(0.456f, 0.607f, 1.182f, 1f, 2f, 1f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(15f, 2.672f, 14.328f, 2f, 13.5f, 2f)
            horizontalLineTo(10f)
            curveTo(9.182f, 2f, 8.456f, 2.393f, 8f, 3f)
            curveTo(7.544f, 2.393f, 6.818f, 2f, 6f, 2f)
            horizontalLineTo(2.5f)
            close()
            moveToRelative(5f, 2.5f)
            verticalLineToRelative(7f)
            curveTo(7.5f, 12.328f, 6.828f, 13f, 6f, 13f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 13f, 2f, 12.776f, 2f, 12.5f)
            verticalLineToRelative(-9f)
            curveTo(2f, 3.224f, 2.224f, 3f, 2.5f, 3f)
            horizontalLineTo(6f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveToRelative(1f, 7f)
            verticalLineToRelative(-7f)
            curveTo(8.5f, 3.672f, 9.172f, 3f, 10f, 3f)
            horizontalLineToRelative(3.5f)
            curveTo(13.776f, 3f, 14f, 3.224f, 14f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(10f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            close()
        }
    }.build()
}

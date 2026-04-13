package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookOpen20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookOpen20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 16f)
            curveToRelative(-0.456f, 0.607f, -1.182f, 1f, -2f, 1f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 17f, 2f, 16.328f, 2f, 15.5f)
            verticalLineToRelative(-11f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineTo(8f)
            curveToRelative(0.818f, 0f, 1.544f, 0.393f, 2f, 1f)
            curveToRelative(0.456f, -0.607f, 1.182f, -1f, 2f, -1f)
            horizontalLineToRelative(4.5f)
            curveTo(17.328f, 3f, 18f, 3.672f, 18f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(12f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            close()
            moveTo(3f, 4.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 15.776f, 3.224f, 16f, 3.5f, 16f)
            horizontalLineTo(8f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(9.5f, 4.672f, 8.828f, 4f, 8f, 4f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 4f, 3f, 4.224f, 3f, 4.5f)
            close()
            moveToRelative(7.5f, 10f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-11f)
            curveTo(17f, 4.224f, 16.776f, 4f, 16.5f, 4f)
            horizontalLineTo(12f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(9f)
            close()
        }
    }.build()
}

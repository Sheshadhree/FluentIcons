package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LinkSquare20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LinkSquare20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(6f)
            curveTo(3f, 11.328f, 3.672f, 12f, 4.5f, 12f)
            horizontalLineTo(6f)
            verticalLineToRelative(1f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 13f, 2f, 11.88f, 2f, 10.5f)
            verticalLineToRelative(-6f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(6f)
            curveTo(11.88f, 2f, 13f, 3.12f, 13f, 4.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(9f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveTo(12f, 3.672f, 11.328f, 3f, 10.5f, 3f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(5f, 4f)
            horizontalLineTo(11f)
            verticalLineToRelative(1f)
            horizontalLineTo(9.5f)
            curveTo(8.672f, 8f, 8f, 8.672f, 8f, 9.5f)
            verticalLineToRelative(6f)
            curveTo(8f, 16.328f, 8.672f, 17f, 9.5f, 17f)
            horizontalLineToRelative(6f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveTo(17f, 8.672f, 16.328f, 8f, 15.5f, 8f)
            horizontalLineTo(14f)
            verticalLineTo(7f)
            horizontalLineToRelative(1.5f)
            curveTo(16.88f, 7f, 18f, 8.12f, 18f, 9.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-6f)
            curveTo(8.12f, 18f, 7f, 16.88f, 7f, 15.5f)
            verticalLineToRelative(-6f)
            curveTo(7f, 8.12f, 8.12f, 7f, 9.5f, 7f)
            close()
        }
    }.build()
}

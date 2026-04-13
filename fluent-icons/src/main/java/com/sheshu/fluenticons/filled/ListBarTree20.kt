package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ListBarTree20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ListBarTree20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 7f)
            horizontalLineToRelative(7.5f)
            curveTo(16.328f, 7f, 17f, 6.328f, 17f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(17f, 3.672f, 16.328f, 3f, 15.5f, 3f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            close()
            moveTo(7f, 3f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 6.328f, 3.672f, 7f, 4.5f, 7f)
            horizontalLineTo(7f)
            verticalLineTo(3f)
            close()
            moveToRelative(3f, 9f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveTo(17f, 8.672f, 16.328f, 8f, 15.5f, 8f)
            horizontalLineTo(10f)
            verticalLineToRelative(4f)
            close()
            moveTo(9f, 8f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 8f, 5f, 8.672f, 5f, 9.5f)
            verticalLineToRelative(1f)
            curveTo(5f, 11.328f, 5.672f, 12f, 6.5f, 12f)
            horizontalLineTo(9f)
            verticalLineTo(8f)
            close()
            moveToRelative(6.5f, 9f)
            horizontalLineTo(10f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            close()
            moveToRelative(-9f, -4f)
            horizontalLineTo(9f)
            verticalLineToRelative(4f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 17f, 5f, 16.328f, 5f, 15.5f)
            verticalLineToRelative(-1f)
            curveTo(5f, 13.672f, 5.672f, 13f, 6.5f, 13f)
            close()
        }
    }.build()
}

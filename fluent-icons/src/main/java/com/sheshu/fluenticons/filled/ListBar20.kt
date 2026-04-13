package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ListBar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ListBar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 17f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(0f, -5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveTo(17f, 8.672f, 16.328f, 8f, 15.5f, 8f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            close()
            moveTo(7f, 8f)
            verticalLineToRelative(4f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 12f, 3f, 11.328f, 3f, 10.5f)
            verticalLineToRelative(-1f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            horizontalLineTo(7f)
            close()
            moveToRelative(1f, -1f)
            horizontalLineToRelative(7.5f)
            curveTo(16.328f, 7f, 17f, 6.328f, 17f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(17f, 3.672f, 16.328f, 3f, 15.5f, 3f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            close()
            moveTo(7f, 3f)
            verticalLineToRelative(4f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 7f, 3f, 6.328f, 3f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, 10f)
            verticalLineToRelative(4f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 17f, 3f, 16.328f, 3f, 15.5f)
            verticalLineToRelative(-1f)
            curveTo(3f, 13.672f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

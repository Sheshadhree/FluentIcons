package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShapeIntersect20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShapeIntersect20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(6f)
            curveTo(11.88f, 2f, 13f, 3.12f, 13f, 4.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(2.5f)
            curveTo(16.88f, 7f, 18f, 8.12f, 18f, 9.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-6f)
            curveTo(8.12f, 18f, 7f, 16.88f, 7f, 15.5f)
            verticalLineTo(13f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 13f, 2f, 11.88f, 2f, 10.5f)
            verticalLineToRelative(-6f)
            close()
            moveTo(7f, 12f)
            verticalLineTo(9.5f)
            curveTo(7f, 8.12f, 8.12f, 7f, 9.5f, 7f)
            horizontalLineTo(12f)
            verticalLineTo(4.5f)
            curveTo(12f, 3.672f, 11.328f, 3f, 10.5f, 3f)
            horizontalLineToRelative(-6f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(6f)
            curveTo(3f, 11.328f, 3.672f, 12f, 4.5f, 12f)
            horizontalLineTo(7f)
            close()
            moveToRelative(1f, 1f)
            verticalLineToRelative(2.5f)
            curveTo(8f, 16.328f, 8.672f, 17f, 9.5f, 17f)
            horizontalLineToRelative(6f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveTo(17f, 8.672f, 16.328f, 8f, 15.5f, 8f)
            horizontalLineTo(13f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableOffset20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableOffset20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(16f, 12f)
            horizontalLineTo(8f)
            verticalLineTo(8f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(-3f, 1f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(13f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(-1f, 0f)
            verticalLineToRelative(3f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 16f, 4f, 15.328f, 4f, 14.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(-8f, -1f)
            verticalLineTo(8f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4f)
            horizontalLineTo(4f)
            close()
            moveToRelative(0f, -5f)
            verticalLineTo(5.5f)
            curveTo(4f, 4.672f, 4.672f, 4f, 5.5f, 4f)
            horizontalLineTo(12f)
            verticalLineToRelative(3f)
            horizontalLineTo(4f)
            close()
            moveToRelative(12f, -1.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(-3f)
            verticalLineTo(4f)
            horizontalLineToRelative(1.5f)
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            close()
        }
    }.build()
}

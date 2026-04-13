package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableFreezeRow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableFreezeRow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            close()
            moveTo(3f, 6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(2f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            close()
            moveToRelative(10f, -1f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(10f)
            close()
            moveTo(6f, 6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(6f)
            horizontalLineTo(6f)
            close()
            moveToRelative(5f, 0f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(2f)
            verticalLineTo(6f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(-1f, 7f)
            verticalLineToRelative(-2f)
            horizontalLineTo(6f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-5f, 0f)
            verticalLineToRelative(-2f)
            horizontalLineTo(3f)
            verticalLineToRelative(0.5f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineTo(5f)
            close()
            moveToRelative(6f, 0f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2f)
            close()
        }
    }.build()
}

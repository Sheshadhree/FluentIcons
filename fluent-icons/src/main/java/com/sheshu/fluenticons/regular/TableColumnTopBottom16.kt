package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableColumnTopBottom16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableColumnTopBottom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(3f, 11f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineTo(11f)
            close()
            moveToRelative(7f, -1f)
            horizontalLineTo(6f)
            verticalLineTo(6f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            close()
            moveTo(3f, 6f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            verticalLineTo(6f)
            close()
            moveToRelative(1.5f, -3f)
            horizontalLineTo(5f)
            verticalLineToRelative(2f)
            horizontalLineTo(3f)
            verticalLineTo(4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            close()
            moveTo(11f, 6f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-2f)
            verticalLineTo(6f)
            close()
            moveToRelative(0f, 5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(11f)
            verticalLineToRelative(-2f)
            close()
            moveToRelative(2f, -6.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(-2f)
            verticalLineTo(3f)
            horizontalLineToRelative(0.5f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            close()
        }
    }.build()
}

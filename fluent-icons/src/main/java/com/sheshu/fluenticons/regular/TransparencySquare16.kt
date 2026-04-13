package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TransparencySquare16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TransparencySquare16",
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
            moveToRelative(-7f, 1f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(13f)
            horizontalLineTo(8f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-2.5f)
            verticalLineTo(8f)
            horizontalLineTo(13f)
            verticalLineTo(5.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineTo(3f)
            horizontalLineTo(8f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(5.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(8f, 10.5f)
            horizontalLineTo(5.5f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            verticalLineToRelative(2.5f)
            close()
            moveTo(10.5f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(5.5f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}

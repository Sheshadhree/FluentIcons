package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PuzzleCube20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PuzzleCube20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 14.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(4f)
            verticalLineTo(3f)
            horizontalLineToRelative(7.5f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            close()
            moveTo(8f, 4f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            verticalLineTo(4f)
            horizontalLineTo(8f)
            close()
            moveToRelative(5f, 0f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineTo(5.5f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            horizontalLineTo(13f)
            close()
            moveToRelative(3f, 4f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            verticalLineTo(8f)
            close()
            moveToRelative(0f, 5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(13f)
            close()
            moveToRelative(-4f, 3f)
            verticalLineToRelative(-3f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-5f, 0f)
            verticalLineToRelative(-3f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 15.328f, 4.672f, 16f, 5.5f, 16f)
            horizontalLineTo(7f)
            close()
            moveToRelative(-3f, -4f)
            horizontalLineToRelative(3f)
            verticalLineTo(8f)
            horizontalLineTo(4f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(8f, -4f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}

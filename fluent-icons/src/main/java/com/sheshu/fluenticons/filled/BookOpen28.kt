package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookOpen28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookOpen28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 4f)
            curveToRelative(0.98f, 0f, 1.865f, 0.402f, 2.5f, 1.05f)
            curveTo(14.635f, 4.403f, 15.52f, 4f, 16.5f, 4f)
            horizontalLineTo(24f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-0.98f, 0f, -1.865f, -0.402f, -2.5f, -1.05f)
            curveToRelative(-0.635f, 0.648f, -1.52f, 1.05f, -2.5f, 1.05f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(7.5f)
            close()
            moveTo(13f, 20.5f)
            verticalLineToRelative(-13f)
            curveTo(13f, 6.672f, 12.328f, 6f, 11.5f, 6f)
            horizontalLineTo(4f)
            verticalLineToRelative(16f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            close()
            moveToRelative(2f, -13f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineTo(24f)
            verticalLineTo(6f)
            horizontalLineToRelative(-7.5f)
            curveTo(15.672f, 6f, 15f, 6.672f, 15f, 7.5f)
            close()
        }
    }.build()
}

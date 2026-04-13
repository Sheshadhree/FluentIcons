package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BoardSplit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BoardSplit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(1f, 4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-6f)
            horizontalLineTo(4f)
            close()
            moveToRelative(7f, -1f)
            verticalLineTo(4f)
            horizontalLineTo(6f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(1f, 7f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(4f, -9f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}

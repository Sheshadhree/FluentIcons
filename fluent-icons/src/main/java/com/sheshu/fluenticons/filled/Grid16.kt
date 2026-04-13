package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Grid16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Grid16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(2f)
            curveTo(2f, 6.328f, 2.672f, 7f, 3.5f, 7f)
            horizontalLineToRelative(2f)
            curveTo(6.328f, 7f, 7f, 6.328f, 7f, 5.5f)
            verticalLineToRelative(-2f)
            curveTo(7f, 2.672f, 6.328f, 2f, 5.5f, 2f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(7f, 0f)
            curveTo(9.672f, 2f, 9f, 2.672f, 9f, 3.5f)
            verticalLineToRelative(2f)
            curveTo(9f, 6.328f, 9.672f, 7f, 10.5f, 7f)
            horizontalLineToRelative(2f)
            curveTo(13.328f, 7f, 14f, 6.328f, 14f, 5.5f)
            verticalLineToRelative(-2f)
            curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(-7f, 7f)
            curveTo(2.672f, 9f, 2f, 9.672f, 2f, 10.5f)
            verticalLineToRelative(2f)
            curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
            horizontalLineToRelative(2f)
            curveTo(6.328f, 14f, 7f, 13.328f, 7f, 12.5f)
            verticalLineToRelative(-2f)
            curveTo(7f, 9.672f, 6.328f, 9f, 5.5f, 9f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(7f, 0f)
            curveTo(9.672f, 9f, 9f, 9.672f, 9f, 10.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveTo(14f, 9.672f, 13.328f, 9f, 12.5f, 9f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}

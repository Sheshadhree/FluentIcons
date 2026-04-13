package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Grid20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Grid20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 11f)
            curveTo(8.328f, 11f, 9f, 11.672f, 9f, 12.5f)
            verticalLineToRelative(4f)
            curveTo(9f, 17.328f, 8.328f, 18f, 7.5f, 18f)
            horizontalLineToRelative(-4f)
            curveTo(2.672f, 18f, 2f, 17.328f, 2f, 16.5f)
            verticalLineToRelative(-4f)
            curveTo(2f, 11.672f, 2.672f, 11f, 3.5f, 11f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(9f, 0f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-9f, -9f)
            curveTo(8.328f, 2f, 9f, 2.672f, 9f, 3.5f)
            verticalLineToRelative(4f)
            curveTo(9f, 8.328f, 8.328f, 9f, 7.5f, 9f)
            horizontalLineToRelative(-4f)
            curveTo(2.672f, 9f, 2f, 8.328f, 2f, 7.5f)
            verticalLineToRelative(-4f)
            curveTo(2f, 2.672f, 2.672f, 2f, 3.5f, 2f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(9f, 0f)
            curveTo(17.328f, 2f, 18f, 2.672f, 18f, 3.5f)
            verticalLineToRelative(4f)
            curveTo(18f, 8.328f, 17.328f, 9f, 16.5f, 9f)
            horizontalLineToRelative(-4f)
            curveTo(11.672f, 9f, 11f, 8.328f, 11f, 7.5f)
            verticalLineToRelative(-4f)
            curveTo(11f, 2.672f, 11.672f, 2f, 12.5f, 2f)
            horizontalLineToRelative(4f)
            close()
        }
    }.build()
}

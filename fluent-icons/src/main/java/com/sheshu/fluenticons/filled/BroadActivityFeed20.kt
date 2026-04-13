package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BroadActivityFeed20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BroadActivityFeed20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            verticalLineToRelative(4f)
            curveTo(2f, 9.328f, 2.672f, 10f, 3.5f, 10f)
            horizontalLineToRelative(13f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveTo(18f, 3.672f, 17.328f, 3f, 16.5f, 3f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(0f, 9f)
            curveTo(2.672f, 12f, 2f, 12.672f, 2f, 13.5f)
            verticalLineToRelative(2f)
            curveTo(2f, 16.328f, 2.672f, 17f, 3.5f, 17f)
            horizontalLineToRelative(4f)
            curveTo(8.328f, 17f, 9f, 16.328f, 9f, 15.5f)
            verticalLineToRelative(-2f)
            curveTo(9f, 12.672f, 8.328f, 12f, 7.5f, 12f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(9f, 0f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}

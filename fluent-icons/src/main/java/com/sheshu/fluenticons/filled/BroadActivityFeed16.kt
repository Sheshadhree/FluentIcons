package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BroadActivityFeed16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BroadActivityFeed16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2f)
            curveTo(1.672f, 2f, 1f, 2.672f, 1f, 3.5f)
            verticalLineToRelative(3f)
            curveTo(1f, 7.328f, 1.672f, 8f, 2.5f, 8f)
            horizontalLineToRelative(11f)
            curveTo(14.328f, 8f, 15f, 7.328f, 15f, 6.5f)
            verticalLineToRelative(-3f)
            curveTo(15f, 2.672f, 14.328f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(0f, 8f)
            curveTo(1.672f, 10f, 1f, 10.67f, 1f, 11.5f)
            verticalLineToRelative(1f)
            curveTo(1f, 13.328f, 1.672f, 14f, 2.5f, 14f)
            horizontalLineToRelative(3f)
            curveTo(6.328f, 14f, 7f, 13.328f, 7f, 12.5f)
            verticalLineToRelative(-1f)
            curveTo(7f, 10.67f, 6.328f, 10f, 5.5f, 10f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(8f, 0f)
            curveTo(9.672f, 10f, 9f, 10.67f, 9f, 11.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}

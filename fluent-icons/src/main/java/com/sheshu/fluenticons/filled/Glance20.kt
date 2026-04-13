package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Glance20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Glance20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 14.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 16.328f, 3.672f, 17f, 4.5f, 17f)
            horizontalLineToRelative(3f)
            curveTo(8.328f, 17f, 9f, 16.328f, 9f, 15.5f)
            verticalLineToRelative(-1f)
            curveTo(9f, 13.672f, 8.328f, 13f, 7.5f, 13f)
            horizontalLineToRelative(-3f)
            curveTo(3.672f, 13f, 3f, 13.672f, 3f, 14.5f)
            close()
            moveToRelative(0f, -10f)
            verticalLineToRelative(5f)
            curveTo(3f, 10.328f, 3.672f, 11f, 4.5f, 11f)
            horizontalLineToRelative(3f)
            curveTo(8.328f, 11f, 9f, 10.328f, 9f, 9.5f)
            verticalLineToRelative(-5f)
            curveTo(9f, 3.672f, 8.328f, 3f, 7.5f, 3f)
            horizontalLineToRelative(-3f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            close()
            moveToRelative(8f, 0f)
            verticalLineToRelative(1f)
            curveTo(11f, 6.328f, 11.672f, 7f, 12.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(16.328f, 7f, 17f, 6.328f, 17f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(17f, 3.672f, 16.328f, 3f, 15.5f, 3f)
            horizontalLineToRelative(-3f)
            curveTo(11.672f, 3f, 11f, 3.672f, 11f, 4.5f)
            close()
            moveTo(12.5f, 9f)
            curveTo(11.672f, 9f, 11f, 9.672f, 11f, 10.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(17f, 9.672f, 16.328f, 9f, 15.5f, 9f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}

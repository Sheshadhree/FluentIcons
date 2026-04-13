package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.GlanceHorizontal20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GlanceHorizontal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 3f)
            horizontalLineToRelative(1f)
            curveTo(16.328f, 3f, 17f, 3.672f, 17f, 4.5f)
            verticalLineToRelative(3f)
            curveTo(17f, 8.328f, 16.328f, 9f, 15.5f, 9f)
            horizontalLineToRelative(-1f)
            curveTo(13.672f, 9f, 13f, 8.328f, 13f, 7.5f)
            verticalLineToRelative(-3f)
            curveTo(13f, 3.672f, 13.672f, 3f, 14.5f, 3f)
            close()
            moveToRelative(-10f, 0f)
            horizontalLineToRelative(5f)
            curveTo(10.328f, 3f, 11f, 3.672f, 11f, 4.5f)
            verticalLineToRelative(3f)
            curveTo(11f, 8.328f, 10.328f, 9f, 9.5f, 9f)
            horizontalLineToRelative(-5f)
            curveTo(3.672f, 9f, 3f, 8.328f, 3f, 7.5f)
            verticalLineToRelative(-3f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            close()
            moveToRelative(0f, 8f)
            horizontalLineToRelative(1f)
            curveTo(6.328f, 11f, 7f, 11.672f, 7f, 12.5f)
            verticalLineToRelative(3f)
            curveTo(7f, 16.328f, 6.328f, 17f, 5.5f, 17f)
            horizontalLineToRelative(-1f)
            curveTo(3.672f, 17f, 3f, 16.328f, 3f, 15.5f)
            verticalLineToRelative(-3f)
            curveTo(3f, 11.672f, 3.672f, 11f, 4.5f, 11f)
            close()
            moveTo(9f, 12.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(9.672f, 17f, 9f, 16.328f, 9f, 15.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}

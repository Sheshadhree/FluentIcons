package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Glance12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Glance12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 9.5f)
            curveTo(6f, 10.328f, 6.672f, 11f, 7.5f, 11f)
            horizontalLineToRelative(2f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(11f, 5.672f, 10.328f, 5f, 9.5f, 5f)
            horizontalLineToRelative(-2f)
            curveTo(6.672f, 5f, 6f, 5.672f, 6f, 6.5f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(-5f, -4f)
            curveTo(1f, 6.328f, 1.672f, 7f, 2.5f, 7f)
            horizontalLineToRelative(1f)
            curveTo(4.328f, 7f, 5f, 6.328f, 5f, 5.5f)
            verticalLineToRelative(-3f)
            curveTo(5f, 1.672f, 4.328f, 1f, 3.5f, 1f)
            horizontalLineToRelative(-1f)
            curveTo(1.672f, 1f, 1f, 1.672f, 1f, 2.5f)
            verticalLineToRelative(3f)
            close()
            moveTo(7.5f, 4f)
            curveTo(6.672f, 4f, 6f, 3.328f, 6f, 2.5f)
            reflectiveCurveTo(6.672f, 1f, 7.5f, 1f)
            horizontalLineToRelative(2f)
            curveTo(10.328f, 1f, 11f, 1.672f, 11f, 2.5f)
            reflectiveCurveTo(10.328f, 4f, 9.5f, 4f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(1f, 9.5f)
            curveTo(1f, 10.328f, 1.672f, 11f, 2.5f, 11f)
            horizontalLineToRelative(1f)
            curveTo(4.328f, 11f, 5f, 10.328f, 5f, 9.5f)
            reflectiveCurveTo(4.328f, 8f, 3.5f, 8f)
            horizontalLineToRelative(-1f)
            curveTo(1.672f, 8f, 1f, 8.672f, 1f, 9.5f)
            close()
        }
    }.build()
}

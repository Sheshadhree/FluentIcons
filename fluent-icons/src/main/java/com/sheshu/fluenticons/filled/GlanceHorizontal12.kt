package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.GlanceHorizontal12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GlanceHorizontal12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 6f)
            curveTo(1.672f, 6f, 1f, 5.328f, 1f, 4.5f)
            verticalLineToRelative(-2f)
            curveTo(1f, 1.672f, 1.672f, 1f, 2.5f, 1f)
            horizontalLineToRelative(3f)
            curveTo(6.328f, 1f, 7f, 1.672f, 7f, 2.5f)
            verticalLineToRelative(2f)
            curveTo(7f, 5.328f, 6.328f, 6f, 5.5f, 6f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(4f, 5f)
            curveTo(5.672f, 11f, 5f, 10.328f, 5f, 9.5f)
            verticalLineToRelative(-1f)
            curveTo(5f, 7.672f, 5.672f, 7f, 6.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(10.328f, 7f, 11f, 7.672f, 11f, 8.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(8f, 4.5f)
            curveTo(8f, 5.328f, 8.672f, 6f, 9.5f, 6f)
            reflectiveCurveTo(11f, 5.328f, 11f, 4.5f)
            verticalLineToRelative(-2f)
            curveTo(11f, 1.672f, 10.328f, 1f, 9.5f, 1f)
            reflectiveCurveTo(8f, 1.672f, 8f, 2.5f)
            verticalLineToRelative(2f)
            close()
            moveTo(2.5f, 11f)
            curveTo(1.672f, 11f, 1f, 10.328f, 1f, 9.5f)
            verticalLineToRelative(-1f)
            curveTo(1f, 7.672f, 1.672f, 7f, 2.5f, 7f)
            reflectiveCurveTo(4f, 7.672f, 4f, 8.5f)
            verticalLineToRelative(1f)
            curveTo(4f, 10.328f, 3.328f, 11f, 2.5f, 11f)
            close()
        }
    }.build()
}

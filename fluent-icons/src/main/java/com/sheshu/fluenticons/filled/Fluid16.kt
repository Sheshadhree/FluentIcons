package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Fluid16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Fluid16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 2.5f)
            curveTo(1f, 1.672f, 1.672f, 1f, 2.5f, 1f)
            horizontalLineToRelative(2f)
            curveTo(5.328f, 1f, 6f, 1.672f, 6f, 2.5f)
            verticalLineToRelative(2f)
            curveTo(6f, 5.328f, 5.328f, 6f, 4.5f, 6f)
            horizontalLineToRelative(-2f)
            curveTo(1.672f, 6f, 1f, 5.328f, 1f, 4.5f)
            verticalLineToRelative(-2f)
            close()
            moveToRelative(7f, 7f)
            curveTo(8f, 8.67f, 8.673f, 8f, 9.5f, 8f)
            horizontalLineToRelative(4f)
            curveTo(14.33f, 8f, 15f, 8.67f, 15f, 9.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveTo(8.673f, 15f, 8f, 14.328f, 8f, 13.5f)
            verticalLineToRelative(-4f)
            close()
            moveToRelative(-5f, 1f)
            verticalLineTo(7f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(3.5f)
            curveTo(4f, 10.776f, 4.224f, 11f, 4.5f, 11f)
            horizontalLineTo(7f)
            verticalLineToRelative(1f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 12f, 3f, 11.328f, 3f, 10.5f)
            close()
            moveTo(7f, 3f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(3.5f)
            curveTo(10.777f, 4f, 11f, 4.224f, 11f, 4.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(1f)
            verticalLineTo(4.5f)
            curveTo(12f, 3.672f, 11.33f, 3f, 10.5f, 3f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

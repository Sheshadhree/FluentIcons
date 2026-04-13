package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Print16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Print16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.5f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineToRelative(5f)
            curveTo(11.328f, 2f, 12f, 2.672f, 12f, 3.5f)
            verticalLineTo(4f)
            horizontalLineToRelative(1f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(4.672f, 14f, 4f, 13.328f, 4f, 12.5f)
            verticalLineTo(12f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 12f, 1f, 11.328f, 1f, 10.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1f)
            verticalLineTo(3.5f)
            close()
            moveToRelative(7f, 0f)
            curveTo(11f, 3.224f, 10.776f, 3f, 10.5f, 3f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 3f, 5f, 3.224f, 5f, 3.5f)
            verticalLineTo(4f)
            horizontalLineToRelative(6f)
            verticalLineTo(3.5f)
            close()
            moveToRelative(-6f, 7f)
            verticalLineToRelative(2f)
            curveTo(5f, 12.776f, 5.224f, 13f, 5.5f, 13f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 10f, 5f, 10.224f, 5f, 10.5f)
            close()
        }
    }.build()
}

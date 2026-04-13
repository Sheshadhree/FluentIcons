package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Album20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Album20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            verticalLineToRelative(12f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
            moveToRelative(7f, 2.5f)
            curveTo(9f, 8.224f, 9.224f, 8f, 9.5f, 8f)
            horizontalLineToRelative(4f)
            curveTo(13.776f, 8f, 14f, 8.224f, 14f, 8.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-4f)
            curveTo(9.224f, 10f, 9f, 9.776f, 9f, 9.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(5f, 16f)
            verticalLineTo(4f)
            horizontalLineToRelative(11f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            close()
            moveToRelative(4.5f, -9f)
            curveTo(8.672f, 7f, 8f, 7.672f, 8f, 8.5f)
            verticalLineToRelative(1f)
            curveTo(8f, 10.328f, 8.672f, 11f, 9.5f, 11f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveTo(15f, 7.672f, 14.328f, 7f, 13.5f, 7f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Album20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Album20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 8.5f)
            curveTo(8f, 7.672f, 8.672f, 7f, 9.5f, 7f)
            horizontalLineToRelative(4f)
            curveTo(14.328f, 7f, 15f, 7.672f, 15f, 8.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveTo(8.672f, 11f, 8f, 10.328f, 8f, 9.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(9.5f, 8f)
            curveTo(9.224f, 8f, 9f, 8.224f, 9f, 8.5f)
            verticalLineToRelative(1f)
            curveTo(9f, 9.776f, 9.224f, 10f, 9.5f, 10f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1f)
            curveTo(14f, 8.224f, 13.776f, 8f, 13.5f, 8f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(2f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
            moveToRelative(4f, 9f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
            verticalLineToRelative(10f)
            close()
            moveTo(5f, 5f)
            horizontalLineTo(4f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}

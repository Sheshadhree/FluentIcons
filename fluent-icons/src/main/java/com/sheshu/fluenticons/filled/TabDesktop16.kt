package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabDesktop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2f)
            horizontalLineTo(4f)
            curveTo(2.895f, 2f, 2f, 2.895f, 2f, 4f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            horizontalLineTo(8.5f)
            curveTo(7.672f, 5f, 7f, 4.328f, 7f, 3.5f)
            verticalLineTo(2f)
            close()
            moveToRelative(7f, 2f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(8f)
            verticalLineToRelative(1.5f)
            curveTo(8f, 3.776f, 8.224f, 4f, 8.5f, 4f)
            horizontalLineTo(14f)
            close()
        }
    }.build()
}

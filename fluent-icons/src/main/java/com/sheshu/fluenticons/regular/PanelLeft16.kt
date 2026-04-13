package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PanelLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.5f)
            curveTo(2f, 4.12f, 3.12f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 3f, 14f, 4.12f, 14f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 13f, 2f, 11.88f, 2f, 10.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(7f, 4f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(13f, 4.672f, 12.328f, 4f, 11.5f, 4f)
            horizontalLineTo(7f)
            close()
            moveTo(6f, 4f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 4f, 3f, 4.672f, 3f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(3f, 11.328f, 3.672f, 12f, 4.5f, 12f)
            horizontalLineTo(6f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}

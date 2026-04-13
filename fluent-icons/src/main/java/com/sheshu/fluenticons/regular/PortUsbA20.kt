package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PortUsbA20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PortUsbA20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 7f)
            curveTo(3.672f, 7f, 3f, 7.672f, 3f, 8.5f)
            verticalLineToRelative(3f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(17f, 7.672f, 16.328f, 7f, 15.5f, 7f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(4f, 8.5f)
            curveTo(4f, 8.224f, 4.224f, 8f, 4.5f, 8f)
            horizontalLineToRelative(11f)
            curveTo(15.776f, 8f, 16f, 8.224f, 16f, 8.5f)
            verticalLineTo(10f)
            horizontalLineTo(4f)
            verticalLineTo(8.5f)
            close()
        }
    }.build()
}

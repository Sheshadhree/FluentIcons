package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.UsbStick20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.UsbStick20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 2f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 2f, 13f, 2.224f, 13f, 2.5f)
            verticalLineTo(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            verticalLineTo(2.5f)
            curveTo(7f, 2.224f, 7.224f, 2f, 7.5f, 2f)
            close()
            moveTo(12f, 6f)
            verticalLineTo(3f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            close()
            moveTo(7f, 7f)
            curveTo(6.448f, 7f, 6f, 7.448f, 6f, 8f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

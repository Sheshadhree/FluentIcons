package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.UsbStick20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.UsbStick20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2.5f)
            curveTo(7f, 2.224f, 7.224f, 2f, 7.5f, 2f)
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
            close()
            moveTo(8f, 6f)
            horizontalLineToRelative(4f)
            verticalLineTo(3f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}

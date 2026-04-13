package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PortMicroUsb20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PortMicroUsb20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.433f, 8.3f)
            curveTo(6.693f, 8.105f, 7.01f, 8f, 7.333f, 8f)
            horizontalLineToRelative(5.334f)
            curveToRelative(0.324f, 0f, 0.64f, 0.105f, 0.9f, 0.3f)
            lineToRelative(1.333f, 1f)
            curveToRelative(0.378f, 0.283f, 0.6f, 0.728f, 0.6f, 1.2f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(6f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            curveToRelative(0f, -0.472f, 0.222f, -0.917f, 0.6f, -1.2f)
            lineToRelative(1.333f, -1f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PortUsbA24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PortUsbA24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 8f)
            horizontalLineTo(6f)
            curveTo(5.47f, 8.002f, 4.962f, 8.213f, 4.588f, 8.588f)
            curveTo(4.213f, 8.962f, 4.002f, 9.47f, 4f, 10f)
            verticalLineToRelative(4f)
            curveToRelative(0.002f, 0.53f, 0.213f, 1.038f, 0.588f, 1.412f)
            curveTo(4.962f, 15.787f, 5.47f, 15.998f, 6f, 16f)
            horizontalLineToRelative(12f)
            curveToRelative(0.53f, -0.002f, 1.038f, -0.213f, 1.413f, -0.588f)
            curveTo(19.787f, 15.038f, 19.998f, 14.53f, 20f, 14f)
            verticalLineToRelative(-4f)
            curveToRelative(-0.002f, -0.53f, -0.213f, -1.038f, -0.587f, -1.412f)
            curveTo(19.038f, 8.213f, 18.53f, 8.002f, 18f, 8f)
            close()
            moveTo(6f, 10f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(2f)
            horizontalLineTo(6f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}

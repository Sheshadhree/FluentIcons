package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PortUsbC24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PortUsbC24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 12f)
            curveToRelative(0f, 0.394f, -0.077f, 0.784f, -0.227f, 1.149f)
            curveToRelative(-0.15f, 0.364f, -0.372f, 0.695f, -0.65f, 0.974f)
            curveToRelative(-0.28f, 0.278f, -0.61f, 0.5f, -0.974f, 0.65f)
            curveTo(16.785f, 14.923f, 16.394f, 15f, 16f, 15f)
            horizontalLineTo(8f)
            curveToRelative(-0.796f, 0f, -1.559f, -0.316f, -2.121f, -0.879f)
            curveTo(5.316f, 13.56f, 5f, 12.796f, 5f, 12f)
            reflectiveCurveToRelative(0.316f, -1.559f, 0.879f, -2.121f)
            curveTo(6.44f, 9.316f, 7.204f, 9f, 8f, 9f)
            horizontalLineToRelative(8f)
            curveToRelative(0.394f, 0f, 0.785f, 0.077f, 1.149f, 0.227f)
            curveToRelative(0.364f, 0.15f, 0.695f, 0.372f, 0.973f, 0.65f)
            curveToRelative(0.28f, 0.28f, 0.5f, 0.61f, 0.65f, 0.974f)
            curveToRelative(0.152f, 0.364f, 0.23f, 0.755f, 0.228f, 1.149f)
            close()
        }
    }.build()
}

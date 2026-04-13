package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pulse32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pulse32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.52f, 5f)
            curveToRelative(0.443f, 0.009f, 0.827f, 0.308f, 0.944f, 0.735f)
            lineToRelative(4.578f, 16.646f)
            lineToRelative(3.5f, -11.668f)
            curveToRelative(0.122f, -0.405f, 0.484f, -0.69f, 0.906f, -0.712f)
            curveToRelative(0.422f, -0.021f, 0.813f, 0.224f, 0.975f, 0.614f)
            lineTo(24.667f, 16f)
            horizontalLineTo(28f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.404f, 0f, -0.768f, -0.243f, -0.923f, -0.615f)
            lineToRelative(-1.424f, -3.417f)
            lineToRelative(-3.695f, 12.32f)
            curveToRelative(-0.128f, 0.426f, -0.524f, 0.717f, -0.97f, 0.712f)
            curveToRelative(-0.445f, -0.005f, -0.834f, -0.305f, -0.952f, -0.735f)
            lineTo(11.43f, 9.517f)
            lineToRelative(-2.477f, 7.786f)
            curveTo(8.82f, 17.718f, 8.435f, 18f, 8f, 18f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.269f)
            lineToRelative(3.278f, -10.303f)
            curveTo(10.681f, 5.275f, 11.077f, 4.99f, 11.52f, 5f)
            close()
        }
    }.build()
}

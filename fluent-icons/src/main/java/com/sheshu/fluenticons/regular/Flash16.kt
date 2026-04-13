package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flash16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flash16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.915f, 1.714f)
            curveTo(5.04f, 1.291f, 5.43f, 1f, 5.873f, 1f)
            horizontalLineToRelative(4.406f)
            curveToRelative(0.698f, 0f, 1.181f, 0.697f, 0.936f, 1.351f)
            lineTo(10.222f, 5f)
            horizontalLineToRelative(2.03f)
            curveToRelative(0.627f, 0f, 0.977f, 0.726f, 0.586f, 1.217f)
            lineToRelative(-6.607f, 8.3f)
            curveToRelative(-0.854f, 1.073f, -2.562f, 0.188f, -2.178f, -1.128f)
            lineTo(5.333f, 9f)
            horizontalLineTo(3.75f)
            curveTo(3.248f, 9f, 2.887f, 8.517f, 3.031f, 8.036f)
            lineToRelative(1.884f, -6.322f)
            close()
            moveTo(10.279f, 2f)
            horizontalLineTo(5.873f)
            lineTo(4.085f, 8f)
            horizontalLineTo(6f)
            curveToRelative(0.157f, 0f, 0.306f, 0.074f, 0.4f, 0.2f)
            curveToRelative(0.095f, 0.126f, 0.124f, 0.289f, 0.08f, 0.44f)
            lineToRelative(-1.467f, 5.029f)
            curveToRelative(-0.024f, 0.08f, -0.012f, 0.136f, 0.006f, 0.174f)
            curveToRelative(0.022f, 0.045f, 0.062f, 0.088f, 0.119f, 0.118f)
            curveToRelative(0.057f, 0.03f, 0.115f, 0.037f, 0.164f, 0.029f)
            curveToRelative(0.043f, -0.007f, 0.094f, -0.03f, 0.147f, -0.095f)
            lineTo(11.733f, 6f)
            horizontalLineTo(9.5f)
            curveTo(9.336f, 6f, 9.182f, 5.92f, 9.09f, 5.785f)
            curveTo(8.995f, 5.65f, 8.973f, 5.478f, 9.031f, 5.325f)
            lineTo(10.279f, 2f)
            close()
        }
    }.build()
}

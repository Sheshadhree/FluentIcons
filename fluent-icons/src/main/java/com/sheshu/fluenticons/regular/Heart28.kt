package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Heart28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Heart28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.604f, 6.193f)
            curveToRelative(2.601f, -2.932f, 7.184f, -2.922f, 9.772f, 0.02f)
            curveToRelative(2.263f, 2.574f, 2.148f, 6.459f, -0.263f, 8.893f)
            lineToRelative(-9.58f, 9.672f)
            curveTo(14.392f, 24.92f, 14.2f, 25f, 14f, 25f)
            reflectiveCurveToRelative(-0.392f, -0.08f, -0.533f, -0.222f)
            lineToRelative(-9.58f, -9.672f)
            curveToRelative(-2.41f, -2.434f, -2.526f, -6.32f, -0.263f, -8.892f)
            curveToRelative(2.588f, -2.943f, 7.17f, -2.953f, 9.772f, -0.021f)
            lineTo(14f, 6.873f)
            lineToRelative(0.604f, -0.68f)
            close()
            moveToRelative(8.646f, 1.011f)
            curveToRelative(-1.993f, -2.266f, -5.521f, -2.274f, -7.524f, -0.016f)
            lineTo(14.56f, 8.501f)
            curveTo(14.419f, 8.66f, 14.214f, 8.753f, 14f, 8.753f)
            curveToRelative(-0.215f, 0f, -0.419f, -0.092f, -0.561f, -0.252f)
            lineToRelative(-1.165f, -1.313f)
            curveToRelative(-2.003f, -2.257f, -5.53f, -2.25f, -7.524f, 0.016f)
            curveToRelative(-1.742f, 1.981f, -1.653f, 4.973f, 0.203f, 6.847f)
            lineTo(14f, 23.184f)
            lineToRelative(9.047f, -9.133f)
            curveToRelative(1.856f, -1.874f, 1.945f, -4.866f, 0.203f, -6.847f)
            close()
        }
    }.build()
}

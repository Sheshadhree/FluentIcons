package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.405f, 1.353f)
            curveTo(8.31f, 1.239f, 8.17f, 1.173f, 8.021f, 1.173f)
            curveToRelative(-0.148f, 0f, -0.289f, 0.066f, -0.384f, 0.18f)
            curveToRelative(-1.041f, 1.25f, -3.102f, 2.737f, -4.288f, 3.4f)
            curveTo(3.212f, 4.829f, 3.12f, 4.966f, 3.098f, 5.12f)
            lineTo(2.15f, 12f)
            horizontalLineTo(1.486f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(1.21f, 13f, 1.486f, 13f)
            horizontalLineTo(14.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 12f, 14.5f, 12f)
            horizontalLineToRelative(-0.607f)
            lineToRelative(-0.948f, -6.879f)
            curveToRelative(-0.022f, -0.155f, -0.115f, -0.292f, -0.252f, -0.368f)
            curveToRelative(-1.185f, -0.663f, -3.246f, -2.15f, -4.288f, -3.4f)
            close()
            moveTo(5.944f, 12f)
            curveToRelative(0.696f, -1.027f, 1.41f, -2.338f, 2.059f, -4.342f)
            curveToRelative(0.59f, 1.815f, 1.246f, 3.108f, 2.06f, 4.342f)
            horizontalLineToRelative(-4.12f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BowlChopsticks24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BowlChopsticks24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.376f, 2.1f)
            curveTo(5.735f, 1.893f, 6.193f, 2.017f, 6.4f, 2.376f)
            lineTo(11.365f, 11f)
            horizontalLineToRelative(2.27f)
            lineTo(9.1f, 3.124f)
            curveTo(8.893f, 2.765f, 9.017f, 2.307f, 9.376f, 2.1f)
            curveToRelative(0.359f, -0.207f, 0.817f, -0.083f, 1.024f, 0.276f)
            lineTo(15.365f, 11f)
            horizontalLineToRelative(5.933f)
            curveTo(21.686f, 11f, 22f, 11.315f, 22f, 11.702f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.045f, -0.16f, 2.053f, -0.458f, 3f)
            horizontalLineTo(2.458f)
            curveTo(2.16f, 14.053f, 2f, 13.045f, 2f, 12f)
            verticalLineToRelative(-0.298f)
            curveTo(2f, 11.315f, 2.314f, 11f, 2.702f, 11f)
            horizontalLineToRelative(6.933f)
            lineTo(5.1f, 3.124f)
            curveTo(4.893f, 2.765f, 5.017f, 2.307f, 5.376f, 2.1f)
            close()
            moveTo(3.067f, 16.5f)
            curveTo(4.714f, 19.763f, 8.096f, 22f, 12f, 22f)
            reflectiveCurveToRelative(7.286f, -2.237f, 8.933f, -5.5f)
            horizontalLineTo(3.067f)
            close()
        }
    }.build()
}

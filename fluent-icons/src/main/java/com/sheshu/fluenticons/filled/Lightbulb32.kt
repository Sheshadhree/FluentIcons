package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Lightbulb32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Lightbulb32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            curveTo(10.477f, 2f, 6f, 6.477f, 6f, 12f)
            curveToRelative(0f, 2.977f, 1.302f, 5.651f, 3.365f, 7.482f)
            curveToRelative(0.343f, 0.304f, 0.561f, 0.645f, 0.64f, 0.986f)
            lineTo(10.82f, 24f)
            horizontalLineToRelative(10.36f)
            lineToRelative(0.815f, -3.532f)
            curveToRelative(0.079f, -0.34f, 0.297f, -0.682f, 0.64f, -0.986f)
            curveTo(24.698f, 17.652f, 26f, 14.977f, 26f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            close()
            moveToRelative(4.719f, 24f)
            horizontalLineTo(11.28f)
            lineToRelative(0.297f, 1.287f)
            curveTo(11.945f, 28.875f, 13.36f, 30f, 14.988f, 30f)
            horizontalLineToRelative(2.023f)
            curveToRelative(1.63f, 0f, 3.044f, -1.125f, 3.41f, -2.713f)
            lineTo(20.72f, 26f)
            close()
        }
    }.build()
}

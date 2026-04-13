package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BowlChopsticks20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BowlChopsticks20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.238f, 2.074f)
            curveTo(4.473f, 1.93f, 4.78f, 2.003f, 4.926f, 2.238f)
            lineTo(9.087f, 9f)
            horizontalLineToRelative(1.826f)
            lineTo(7.074f, 2.762f)
            curveTo(6.93f, 2.527f, 7.003f, 2.22f, 7.238f, 2.074f)
            curveTo(7.473f, 1.93f, 7.78f, 2.003f, 7.926f, 2.238f)
            lineTo(12.087f, 9f)
            horizontalLineTo(17.5f)
            curveTo(17.776f, 9f, 18f, 9.224f, 18f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 0.69f, -0.087f, 1.36f, -0.252f, 2f)
            horizontalLineTo(2.252f)
            curveTo(2.088f, 11.36f, 2f, 10.69f, 2f, 10f)
            verticalLineTo(9.5f)
            curveTo(2f, 9.224f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineToRelative(5.413f)
            lineTo(4.074f, 2.762f)
            curveTo(3.93f, 2.527f, 4.003f, 2.22f, 4.238f, 2.074f)
            close()
            moveTo(10f, 18f)
            curveToRelative(-3.357f, 0f, -6.232f, -2.068f, -7.418f, -5f)
            horizontalLineToRelative(14.837f)
            curveToRelative(-1.187f, 2.932f, -4.062f, 5f, -7.419f, 5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BowlChopsticks16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BowlChopsticks16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.732f, 1.078f)
            curveToRelative(0.232f, -0.148f, 0.542f, -0.08f, 0.69f, 0.154f)
            lineTo(7.092f, 7f)
            horizontalLineToRelative(1.815f)
            lineTo(5.578f, 1.768f)
            curveToRelative(-0.148f, -0.232f, -0.08f, -0.542f, 0.154f, -0.69f)
            curveToRelative(0.232f, -0.148f, 0.542f, -0.08f, 0.69f, 0.154f)
            lineTo(10.092f, 7f)
            horizontalLineToRelative(4.437f)
            curveTo(14.79f, 7f, 15f, 7.21f, 15f, 7.47f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.695f, -0.101f, 1.366f, -0.29f, 2f)
            horizontalLineTo(1.29f)
            curveTo(1.1f, 9.366f, 1f, 8.695f, 1f, 8f)
            verticalLineTo(7.47f)
            curveTo(1f, 7.21f, 1.21f, 7f, 1.47f, 7f)
            horizontalLineToRelative(4.437f)
            lineTo(2.578f, 1.768f)
            curveToRelative(-0.148f, -0.232f, -0.08f, -0.542f, 0.154f, -0.69f)
            close()
            moveTo(8f, 15f)
            curveToRelative(-2.792f, 0f, -5.203f, -1.635f, -6.326f, -4f)
            horizontalLineToRelative(12.652f)
            curveToRelative(-1.123f, 2.365f, -3.534f, 4f, -6.326f, 4f)
            close()
        }
    }.build()
}

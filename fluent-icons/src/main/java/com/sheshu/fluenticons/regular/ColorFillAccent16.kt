package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColorFillAccent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorFillAccent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.768f, 11.354f)
            curveToRelative(-0.977f, 0.977f, -2.56f, 0.977f, -3.536f, 0f)
            lineTo(3.473f, 9.596f)
            curveTo(2.905f, 9.809f, 2.5f, 10.357f, 2.5f, 11f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(8f)
            curveToRelative(0.602f, 0f, 1.121f, -0.355f, 1.36f, -0.866f)
            curveToRelative(-0.268f, 0.098f, -0.558f, 0.151f, -0.86f, 0.151f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.119f, -2.5f, -2.5f)
            curveToRelative(0f, -0.058f, 0.003f, -0.115f, 0.008f, -0.172f)
            lineToRelative(-1.24f, 1.24f)
            close()
        }
    }.build()
}

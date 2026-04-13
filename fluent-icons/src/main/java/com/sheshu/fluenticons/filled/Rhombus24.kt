package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rhombus24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rhombus24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.807f, 5.408f)
            curveTo(6.151f, 4.558f, 6.977f, 4f, 7.894f, 4f)
            horizontalLineToRelative(12.858f)
            curveToRelative(1.595f, 0f, 2.683f, 1.613f, 2.087f, 3.092f)
            lineToRelative(-4.642f, 11.5f)
            curveTo(17.854f, 19.442f, 17.028f, 20f, 16.111f, 20f)
            horizontalLineTo(3.252f)
            curveToRelative(-1.594f, 0f, -2.683f, -1.613f, -2.086f, -3.092f)
            lineToRelative(4.641f, -11.5f)
            close()
        }
    }.build()
}

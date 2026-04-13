package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOneQuarter28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOneQuarter28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 7.356f)
            lineTo(10.01f, 9.36f)
            lineToRelative(-6.017f, 0.874f)
            curveTo(3.221f, 10.347f, 2.75f, 11.003f, 2.75f, 11.68f)
            curveToRelative(0f, 0.365f, 0.138f, 0.735f, 0.44f, 1.03f)
            lineToRelative(4.354f, 4.244f)
            lineToRelative(-1.028f, 5.992f)
            curveToRelative(-0.108f, 0.631f, 0.193f, 1.182f, 0.66f, 1.475f)
            curveToRelative(0.41f, 0.257f, 0.946f, 0.316f, 1.444f, 0.054f)
            lineTo(11f, 23.223f)
            verticalLineTo(7.356f)
            close()
        }
    }.build()
}

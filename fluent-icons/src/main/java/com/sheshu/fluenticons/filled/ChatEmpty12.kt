package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatEmpty12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatEmpty12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveTo(3.239f, 1f, 1f, 3.239f, 1f, 6f)
            curveToRelative(0f, 0.87f, 0.223f, 1.69f, 0.614f, 2.403f)
            lineTo(1.022f, 10.35f)
            curveToRelative(-0.054f, 0.177f, -0.006f, 0.369f, 0.125f, 0.5f)
            curveToRelative(0.13f, 0.13f, 0.322f, 0.178f, 0.499f, 0.124f)
            lineToRelative(1.945f, -0.592f)
            curveTo(4.306f, 10.776f, 5.127f, 11f, 6f, 11f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveTo(8.761f, 1f, 6f, 1f)
            close()
        }
    }.build()
}

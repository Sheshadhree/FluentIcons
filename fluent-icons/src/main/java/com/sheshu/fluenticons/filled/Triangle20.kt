package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Triangle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Triangle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.176f, 15.8f)
            curveTo(0.648f, 16.799f, 1.372f, 18f, 2.502f, 18f)
            horizontalLineToRelative(14.995f)
            curveToRelative(1.137f, 0f, 1.86f, -1.216f, 1.318f, -2.215f)
            lineToRelative(-7.6f, -14f)
            curveTo(10.643f, 0.731f, 9.13f, 0.74f, 8.57f, 1.8f)
            lineToRelative(-7.394f, 14f)
            close()
        }
    }.build()
}

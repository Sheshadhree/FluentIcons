package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Heart16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Heart16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.541f, 3.948f)
            curveTo(6.27f, 2.676f, 4.212f, 2.67f, 2.946f, 3.936f)
            curveTo(1.68f, 5.202f, 1.686f, 7.26f, 2.958f, 8.531f)
            lineToRelative(4.707f, 4.708f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineToRelative(4.683f, -4.68f)
            curveToRelative(1.263f, -1.27f, 1.26f, -3.322f, -0.012f, -4.594f)
            curveToRelative(-1.274f, -1.274f, -3.333f, -1.28f, -4.601f, -0.012f)
            lineTo(7.995f, 4.401f)
            lineTo(7.54f, 3.948f)
            close()
        }
    }.build()
}

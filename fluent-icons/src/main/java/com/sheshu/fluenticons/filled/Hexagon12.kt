package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Hexagon12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Hexagon12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.415f, 2f)
            curveToRelative(-0.447f, 0f, -0.86f, 0.239f, -1.083f, 0.626f)
            lineToRelative(-1.586f, 2.75f)
            curveToRelative(-0.223f, 0.386f, -0.223f, 0.862f, 0f, 1.248f)
            lineToRelative(1.586f, 2.75f)
            curveTo(3.555f, 9.761f, 3.968f, 10f, 4.415f, 10f)
            horizontalLineToRelative(3.17f)
            curveToRelative(0.447f, 0f, 0.86f, -0.239f, 1.083f, -0.626f)
            lineToRelative(1.585f, -2.75f)
            curveToRelative(0.223f, -0.386f, 0.223f, -0.862f, 0f, -1.248f)
            lineToRelative(-1.585f, -2.75f)
            curveTo(8.445f, 2.239f, 8.032f, 2f, 7.585f, 2f)
            horizontalLineToRelative(-3.17f)
            close()
        }
    }.build()
}

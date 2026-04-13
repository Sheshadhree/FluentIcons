package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Hexagon12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hexagon12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.332f, 2.626f)
            curveTo(3.555f, 2.239f, 3.968f, 2f, 4.415f, 2f)
            horizontalLineToRelative(3.17f)
            curveToRelative(0.447f, 0f, 0.86f, 0.239f, 1.083f, 0.626f)
            lineToRelative(1.585f, 2.75f)
            curveToRelative(0.223f, 0.386f, 0.223f, 0.862f, 0f, 1.248f)
            lineToRelative(-1.585f, 2.75f)
            curveTo(8.445f, 9.761f, 8.032f, 10f, 7.585f, 10f)
            horizontalLineToRelative(-3.17f)
            curveToRelative(-0.447f, 0f, -0.86f, -0.239f, -1.083f, -0.626f)
            lineToRelative(-1.586f, -2.75f)
            curveToRelative(-0.223f, -0.386f, -0.223f, -0.862f, 0f, -1.248f)
            lineToRelative(1.586f, -2.75f)
            close()
            moveTo(4.415f, 3f)
            curveToRelative(-0.09f, 0f, -0.172f, 0.048f, -0.217f, 0.125f)
            lineToRelative(-1.586f, 2.75f)
            curveToRelative(-0.044f, 0.077f, -0.044f, 0.173f, 0f, 0.25f)
            lineToRelative(1.586f, 2.75f)
            curveTo(4.243f, 8.952f, 4.325f, 9f, 4.415f, 9f)
            horizontalLineToRelative(3.17f)
            curveTo(7.675f, 9f, 7.757f, 8.952f, 7.8f, 8.875f)
            lineToRelative(1.586f, -2.75f)
            curveToRelative(0.045f, -0.077f, 0.045f, -0.173f, 0f, -0.25f)
            lineTo(7.8f, 3.125f)
            curveTo(7.757f, 3.048f, 7.674f, 3f, 7.585f, 3f)
            horizontalLineToRelative(-3.17f)
            close()
        }
    }.build()
}

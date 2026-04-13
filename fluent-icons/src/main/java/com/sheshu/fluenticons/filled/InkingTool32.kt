package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.InkingTool32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.InkingTool32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.018f, 2f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(0.812f)
            curveTo(2.006f, 4.873f, 2f, 4.936f, 2f, 5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(0.504f)
            lineToRelative(0.003f, 0.005f)
            horizontalLineToRelative(20.986f)
            lineTo(26.496f, 10f)
            horizontalLineTo(27f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4.018f)
            close()
            moveToRelative(9f, 24f)
            curveToRelative(0.021f, 0.82f, 0.216f, 1.716f, 0.622f, 2.454f)
            curveToRelative(0.429f, 0.78f, 1.195f, 1.535f, 2.344f, 1.55f)
            horizontalLineToRelative(0.032f)
            curveToRelative(1.148f, -0.015f, 1.915f, -0.77f, 2.344f, -1.55f)
            curveToRelative(0.406f, -0.738f, 0.6f, -1.634f, 0.622f, -2.454f)
            horizontalLineToRelative(-5.964f)
            close()
            moveToRelative(6.942f, -3.096f)
            lineToRelative(5.52f, -10.899f)
            horizontalLineTo(6.52f)
            lineToRelative(5.514f, 10.898f)
            curveTo(12.374f, 23.576f, 13.063f, 24f, 13.819f, 24f)
            horizontalLineToRelative(4.358f)
            curveToRelative(0.754f, 0f, 1.443f, -0.424f, 1.784f, -1.096f)
            close()
        }
    }.build()
}

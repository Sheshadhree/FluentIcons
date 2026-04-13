package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Hexagon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hexagon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.4f, 3f)
            curveTo(5.22f, 3f, 5.055f, 3.095f, 4.965f, 3.25f)
            lineToRelative(-2.6f, 4.5f)
            curveToRelative(-0.089f, 0.155f, -0.089f, 0.345f, 0f, 0.5f)
            lineToRelative(2.6f, 4.5f)
            curveTo(5.056f, 12.905f, 5.221f, 13f, 5.4f, 13f)
            horizontalLineToRelative(5.2f)
            curveToRelative(0.179f, 0f, 0.344f, -0.095f, 0.433f, -0.25f)
            lineToRelative(2.6f, -4.5f)
            curveToRelative(0.09f, -0.155f, 0.09f, -0.345f, 0f, -0.5f)
            lineToRelative(-2.6f, -4.5f)
            curveTo(10.943f, 3.095f, 10.778f, 3f, 10.6f, 3f)
            horizontalLineTo(5.4f)
            close()
            moveTo(4.1f, 2.75f)
            curveTo(4.37f, 2.286f, 4.865f, 2f, 5.4f, 2f)
            horizontalLineToRelative(5.2f)
            curveToRelative(0.535f, 0f, 1.03f, 0.286f, 1.298f, 0.75f)
            lineToRelative(2.6f, 4.5f)
            curveToRelative(0.268f, 0.464f, 0.268f, 1.036f, 0f, 1.5f)
            lineToRelative(-2.6f, 4.5f)
            curveTo(11.63f, 13.714f, 11.135f, 14f, 10.6f, 14f)
            horizontalLineTo(5.4f)
            curveToRelative(-0.535f, 0f, -1.03f, -0.286f, -1.298f, -0.75f)
            lineToRelative(-2.6f, -4.5f)
            curveToRelative(-0.268f, -0.464f, -0.268f, -1.036f, 0f, -1.5f)
            lineToRelative(2.6f, -4.5f)
            close()
        }
    }.build()
}

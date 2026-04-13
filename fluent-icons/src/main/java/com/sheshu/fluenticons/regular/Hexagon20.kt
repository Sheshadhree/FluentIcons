package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Hexagon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hexagon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.826f, 4f)
            curveTo(6.647f, 4f, 6.482f, 4.095f, 6.393f, 4.25f)
            lineToRelative(-3.176f, 5.5f)
            curveToRelative(-0.089f, 0.155f, -0.089f, 0.346f, 0f, 0.5f)
            lineToRelative(3.176f, 5.5f)
            curveTo(6.482f, 15.906f, 6.647f, 16f, 6.826f, 16f)
            horizontalLineToRelative(6.35f)
            curveToRelative(0.179f, 0f, 0.344f, -0.095f, 0.433f, -0.25f)
            lineToRelative(3.176f, -5.5f)
            curveToRelative(0.089f, -0.154f, 0.089f, -0.345f, 0f, -0.5f)
            lineToRelative(-3.176f, -5.5f)
            curveTo(13.52f, 4.095f, 13.355f, 4f, 13.176f, 4f)
            horizontalLineToRelative(-6.35f)
            close()
            moveToRelative(-1.3f, -0.25f)
            curveTo(5.796f, 3.286f, 6.29f, 3f, 6.827f, 3f)
            horizontalLineToRelative(6.35f)
            curveToRelative(0.536f, 0f, 1.031f, 0.286f, 1.3f, 0.75f)
            lineToRelative(3.175f, 5.5f)
            curveToRelative(0.268f, 0.464f, 0.268f, 1.036f, 0f, 1.5f)
            lineToRelative(-3.176f, 5.5f)
            curveToRelative(-0.269f, 0.466f, -0.764f, 0.75f, -1.3f, 0.75f)
            horizontalLineToRelative(-6.35f)
            curveToRelative(-0.536f, 0f, -1.031f, -0.285f, -1.3f, -0.75f)
            lineToRelative(-3.175f, -5.5f)
            curveToRelative(-0.268f, -0.464f, -0.268f, -1.036f, 0f, -1.5f)
            lineToRelative(3.176f, -5.5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Hexagon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Hexagon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.826f, 3f)
            curveToRelative(-0.536f, 0f, -1.031f, 0.286f, -1.3f, 0.75f)
            lineToRelative(-3.175f, 5.5f)
            curveToRelative(-0.268f, 0.464f, -0.268f, 1.036f, 0f, 1.5f)
            lineToRelative(3.176f, 5.5f)
            curveTo(5.795f, 16.716f, 6.29f, 17f, 6.826f, 17f)
            horizontalLineToRelative(6.35f)
            curveToRelative(0.536f, 0f, 1.031f, -0.285f, 1.3f, -0.75f)
            lineToRelative(3.175f, -5.5f)
            curveToRelative(0.268f, -0.464f, 0.268f, -1.036f, 0f, -1.5f)
            lineToRelative(-3.176f, -5.5f)
            curveTo(14.207f, 3.286f, 13.712f, 3f, 13.176f, 3f)
            horizontalLineToRelative(-6.35f)
            close()
        }
    }.build()
}

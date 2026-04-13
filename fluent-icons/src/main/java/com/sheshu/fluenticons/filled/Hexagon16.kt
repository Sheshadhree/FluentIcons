package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Hexagon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Hexagon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.4f, 2f)
            curveTo(4.863f, 2f, 4.367f, 2.286f, 4.1f, 2.75f)
            lineToRelative(-2.6f, 4.5f)
            curveToRelative(-0.267f, 0.464f, -0.267f, 1.036f, 0f, 1.5f)
            lineToRelative(2.6f, 4.5f)
            curveTo(4.37f, 13.714f, 4.865f, 14f, 5.4f, 14f)
            horizontalLineToRelative(5.2f)
            curveToRelative(0.535f, 0f, 1.03f, -0.286f, 1.298f, -0.75f)
            lineToRelative(2.6f, -4.5f)
            curveToRelative(0.268f, -0.464f, 0.268f, -1.036f, 0f, -1.5f)
            lineToRelative(-2.6f, -4.5f)
            curveTo(11.63f, 2.286f, 11.135f, 2f, 10.6f, 2f)
            horizontalLineTo(5.4f)
            close()
        }
    }.build()
}

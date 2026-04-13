package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Speaker020: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Speaker020",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3.006f)
            curveToRelative(0f, -0.873f, -1.04f, -1.327f, -1.68f, -0.733f)
            lineTo(6.448f, 5.866f)
            curveTo(6.355f, 5.952f, 6.234f, 6f, 6.108f, 6f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 6f, 2f, 6.67f, 2f, 7.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
            horizontalLineToRelative(2.607f)
            curveToRelative(0.127f, 0f, 0.248f, 0.047f, 0.34f, 0.133f)
            lineToRelative(3.873f, 3.594f)
            curveToRelative(0.64f, 0.593f, 1.68f, 0.14f, 1.68f, -0.733f)
            verticalLineTo(3.006f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.74f, 3.2f)
            curveTo(5.436f, 3.482f, 5.419f, 3.957f, 5.7f, 4.26f)
            lineTo(9.226f, 8f)
            lineTo(5.7f, 11.74f)
            curveToRelative(-0.281f, 0.303f, -0.264f, 0.778f, 0.04f, 1.06f)
            curveToRelative(0.303f, 0.281f, 0.778f, 0.264f, 1.06f, -0.04f)
            lineToRelative(4f, -4.25f)
            curveToRelative(0.267f, -0.287f, 0.267f, -0.733f, 0f, -1.02f)
            lineToRelative(-4f, -4.25f)
            curveTo(6.518f, 2.936f, 6.043f, 2.919f, 5.74f, 3.2f)
            close()
        }
    }.build()
}

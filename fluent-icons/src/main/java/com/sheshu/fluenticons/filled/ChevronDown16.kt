package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.2f, 5.74f)
            curveTo(3.482f, 5.436f, 3.957f, 5.419f, 4.26f, 5.7f)
            lineTo(8f, 9.226f)
            lineTo(11.74f, 5.7f)
            curveToRelative(0.303f, -0.281f, 0.778f, -0.264f, 1.06f, 0.04f)
            curveToRelative(0.281f, 0.303f, 0.264f, 0.778f, -0.04f, 1.06f)
            lineToRelative(-4.25f, 4f)
            curveToRelative(-0.287f, 0.267f, -0.733f, 0.267f, -1.02f, 0f)
            lineToRelative(-4.25f, -4f)
            curveTo(2.936f, 6.518f, 2.919f, 6.043f, 3.2f, 5.74f)
            close()
        }
    }.build()
}

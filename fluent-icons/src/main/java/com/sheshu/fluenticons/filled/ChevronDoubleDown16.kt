package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronDoubleDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronDoubleDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.74f, 7.7f)
            curveToRelative(0.303f, -0.281f, 0.778f, -0.264f, 1.06f, 0.04f)
            curveToRelative(0.281f, 0.303f, 0.264f, 0.778f, -0.04f, 1.06f)
            lineToRelative(-4.25f, 4f)
            curveToRelative(-0.287f, 0.267f, -0.733f, 0.267f, -1.02f, 0f)
            lineToRelative(-4.25f, -4f)
            curveTo(2.936f, 8.518f, 2.919f, 8.043f, 3.2f, 7.74f)
            curveTo(3.482f, 7.436f, 3.957f, 7.419f, 4.26f, 7.7f)
            lineTo(8f, 11.226f)
            lineTo(11.74f, 7.7f)
            close()
            moveToRelative(0f, -4f)
            curveToRelative(0.303f, -0.281f, 0.778f, -0.264f, 1.06f, 0.04f)
            curveToRelative(0.281f, 0.303f, 0.264f, 0.778f, -0.04f, 1.06f)
            lineToRelative(-4.25f, 4f)
            curveToRelative(-0.287f, 0.267f, -0.733f, 0.267f, -1.02f, 0f)
            lineToRelative(-4.25f, -4f)
            curveTo(2.936f, 4.518f, 2.919f, 4.043f, 3.2f, 3.74f)
            curveTo(3.482f, 3.436f, 3.957f, 3.419f, 4.26f, 3.7f)
            lineTo(8f, 7.226f)
            lineTo(11.74f, 3.7f)
            close()
        }
    }.build()
}

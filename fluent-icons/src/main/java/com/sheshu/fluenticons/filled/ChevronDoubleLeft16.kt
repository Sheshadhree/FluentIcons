package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronDoubleLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronDoubleLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.3f, 11.74f)
            curveToRelative(0.281f, 0.303f, 0.264f, 0.778f, -0.04f, 1.06f)
            curveToRelative(-0.303f, 0.281f, -0.778f, 0.264f, -1.06f, -0.04f)
            lineToRelative(-4f, -4.25f)
            curveToRelative(-0.267f, -0.287f, -0.267f, -0.733f, 0f, -1.02f)
            lineToRelative(4f, -4.25f)
            curveTo(7.482f, 2.936f, 7.957f, 2.919f, 8.26f, 3.2f)
            curveTo(8.564f, 3.482f, 8.582f, 3.957f, 8.3f, 4.26f)
            lineTo(4.773f, 8f)
            lineTo(8.3f, 11.74f)
            close()
            moveToRelative(4f, 0f)
            curveToRelative(0.281f, 0.303f, 0.264f, 0.778f, -0.04f, 1.06f)
            curveToRelative(-0.303f, 0.281f, -0.778f, 0.264f, -1.06f, -0.04f)
            lineToRelative(-4f, -4.25f)
            curveToRelative(-0.267f, -0.287f, -0.267f, -0.733f, 0f, -1.02f)
            lineToRelative(4f, -4.25f)
            curveToRelative(0.282f, -0.304f, 0.757f, -0.321f, 1.06f, -0.04f)
            curveToRelative(0.304f, 0.282f, 0.321f, 0.757f, 0.04f, 1.06f)
            lineTo(8.773f, 8f)
            lineToRelative(3.527f, 3.74f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.26f, 3.2f)
            curveToRelative(0.304f, 0.282f, 0.321f, 0.757f, 0.04f, 1.06f)
            lineTo(6.773f, 8f)
            lineToRelative(3.527f, 3.74f)
            curveToRelative(0.281f, 0.303f, 0.264f, 0.778f, -0.04f, 1.06f)
            curveToRelative(-0.303f, 0.281f, -0.778f, 0.264f, -1.06f, -0.04f)
            lineToRelative(-4f, -4.25f)
            curveToRelative(-0.267f, -0.287f, -0.267f, -0.733f, 0f, -1.02f)
            lineToRelative(4f, -4.25f)
            curveToRelative(0.282f, -0.304f, 0.757f, -0.321f, 1.06f, -0.04f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronDoubleUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronDoubleUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.26f, 8.3f)
            curveTo(3.957f, 8.58f, 3.482f, 8.564f, 3.2f, 8.26f)
            curveTo(2.92f, 7.957f, 2.936f, 7.482f, 3.24f, 7.2f)
            lineToRelative(4.25f, -4f)
            curveToRelative(0.287f, -0.267f, 0.733f, -0.267f, 1.02f, 0f)
            lineToRelative(4.25f, 4f)
            curveToRelative(0.304f, 0.282f, 0.321f, 0.757f, 0.04f, 1.06f)
            curveToRelative(-0.282f, 0.304f, -0.757f, 0.321f, -1.06f, 0.04f)
            lineTo(8f, 4.773f)
            lineTo(4.26f, 8.3f)
            close()
            moveToRelative(0f, 4f)
            curveToRelative(-0.303f, 0.281f, -0.778f, 0.264f, -1.06f, -0.04f)
            curveToRelative(-0.281f, -0.303f, -0.264f, -0.778f, 0.04f, -1.06f)
            lineToRelative(4.25f, -4f)
            curveToRelative(0.287f, -0.267f, 0.733f, -0.267f, 1.02f, 0f)
            lineToRelative(4.25f, 4f)
            curveToRelative(0.304f, 0.282f, 0.321f, 0.757f, 0.04f, 1.06f)
            curveToRelative(-0.282f, 0.304f, -0.757f, 0.321f, -1.06f, 0.04f)
            lineTo(8f, 8.773f)
            lineTo(4.26f, 12.3f)
            close()
        }
    }.build()
}

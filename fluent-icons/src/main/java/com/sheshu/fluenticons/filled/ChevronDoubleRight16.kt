package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronDoubleRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronDoubleRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.7f, 4.26f)
            curveTo(7.42f, 3.957f, 7.436f, 3.482f, 7.74f, 3.2f)
            curveTo(8.043f, 2.92f, 8.518f, 2.936f, 8.8f, 3.24f)
            lineToRelative(4f, 4.25f)
            curveToRelative(0.267f, 0.287f, 0.267f, 0.733f, 0f, 1.02f)
            lineToRelative(-4f, 4.25f)
            curveToRelative(-0.282f, 0.304f, -0.757f, 0.321f, -1.06f, 0.04f)
            curveToRelative(-0.304f, -0.282f, -0.321f, -0.757f, -0.04f, -1.06f)
            lineTo(11.226f, 8f)
            lineTo(7.7f, 4.26f)
            close()
            moveToRelative(-4f, 0f)
            curveTo(3.42f, 3.957f, 3.436f, 3.482f, 3.74f, 3.2f)
            curveTo(4.043f, 2.92f, 4.518f, 2.936f, 4.8f, 3.24f)
            lineToRelative(4f, 4.25f)
            curveToRelative(0.267f, 0.287f, 0.267f, 0.733f, 0f, 1.02f)
            lineToRelative(-4f, 4.25f)
            curveToRelative(-0.282f, 0.304f, -0.757f, 0.321f, -1.06f, 0.04f)
            curveToRelative(-0.304f, -0.282f, -0.321f, -0.757f, -0.04f, -1.06f)
            lineTo(7.226f, 8f)
            lineTo(3.7f, 4.26f)
            close()
        }
    }.build()
}

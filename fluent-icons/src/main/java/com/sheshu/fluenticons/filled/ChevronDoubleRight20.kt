package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronDoubleRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronDoubleRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.733f, 4.207f)
            curveToRelative(0.3f, -0.286f, 0.774f, -0.274f, 1.06f, 0.026f)
            lineToRelative(5.001f, 5.25f)
            curveToRelative(0.276f, 0.29f, 0.276f, 0.745f, 0f, 1.035f)
            lineToRelative(-5f, 5.25f)
            curveToRelative(-0.287f, 0.3f, -0.761f, 0.312f, -1.061f, 0.026f)
            curveToRelative(-0.3f, -0.286f, -0.312f, -0.76f, -0.026f, -1.06f)
            lineTo(13.215f, 10f)
            lineTo(8.707f, 5.267f)
            curveToRelative(-0.286f, -0.3f, -0.274f, -0.774f, 0.026f, -1.06f)
            close()
            moveToRelative(-4f, 0f)
            curveToRelative(0.3f, -0.286f, 0.774f, -0.274f, 1.06f, 0.026f)
            lineToRelative(5.001f, 5.25f)
            curveToRelative(0.276f, 0.29f, 0.276f, 0.745f, 0f, 1.035f)
            lineToRelative(-5f, 5.25f)
            curveToRelative(-0.287f, 0.3f, -0.761f, 0.312f, -1.061f, 0.026f)
            curveToRelative(-0.3f, -0.286f, -0.312f, -0.76f, -0.026f, -1.06f)
            lineTo(9.216f, 10f)
            lineToRelative(-4.51f, -4.734f)
            curveToRelative(-0.285f, -0.3f, -0.273f, -0.774f, 0.027f, -1.06f)
            close()
        }
    }.build()
}

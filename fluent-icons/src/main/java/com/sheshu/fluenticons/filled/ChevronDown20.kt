package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.794f, 7.733f)
            curveToRelative(0.286f, 0.3f, 0.274f, 0.774f, -0.026f, 1.06f)
            lineToRelative(-5.25f, 5.001f)
            curveToRelative(-0.29f, 0.276f, -0.745f, 0.276f, -1.035f, 0f)
            lineToRelative(-5.25f, -5f)
            curveToRelative(-0.3f, -0.287f, -0.312f, -0.761f, -0.026f, -1.061f)
            curveToRelative(0.286f, -0.3f, 0.76f, -0.312f, 1.06f, -0.026f)
            lineToRelative(4.734f, 4.509f)
            lineToRelative(4.733f, -4.51f)
            curveToRelative(0.3f, -0.285f, 0.774f, -0.273f, 1.06f, 0.027f)
            close()
        }
    }.build()
}

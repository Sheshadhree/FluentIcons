package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Dismiss16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Dismiss16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.589f, 2.716f)
            lineToRelative(0.058f, -0.07f)
            curveTo(2.82f, 2.474f, 3.089f, 2.454f, 3.284f, 2.59f)
            lineToRelative(0.07f, 0.058f)
            lineTo(8f, 7.293f)
            lineToRelative(4.646f, -4.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineTo(8.707f, 8f)
            lineToRelative(4.647f, 4.646f)
            curveToRelative(0.173f, 0.174f, 0.192f, 0.443f, 0.057f, 0.638f)
            lineToRelative(-0.057f, 0.07f)
            curveToRelative(-0.174f, 0.173f, -0.443f, 0.192f, -0.638f, 0.057f)
            lineToRelative(-0.07f, -0.057f)
            lineTo(8f, 8.707f)
            lineToRelative(-4.646f, 4.647f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(7.293f, 8f)
            lineTo(2.646f, 3.354f)
            curveTo(2.473f, 3.18f, 2.454f, 2.91f, 2.59f, 2.716f)
            lineToRelative(0.058f, -0.07f)
            lineToRelative(-0.058f, 0.07f)
            close()
        }
    }.build()
}

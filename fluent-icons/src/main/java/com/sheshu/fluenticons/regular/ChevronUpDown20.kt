package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronUpDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronUpDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.911f, 7.216f)
            curveToRelative(0.135f, 0.195f, 0.116f, 0.464f, -0.057f, 0.638f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(10f, 3.707f)
            lineTo(5.854f, 7.854f)
            lineTo(5.784f, 7.91f)
            curveTo(5.59f, 8.046f, 5.32f, 8.027f, 5.146f, 7.854f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(4.5f, -4.5f)
            lineToRelative(0.07f, -0.057f)
            curveToRelative(0.195f, -0.135f, 0.464f, -0.116f, 0.638f, 0.058f)
            lineToRelative(4.5f, 4.5f)
            lineToRelative(0.057f, 0.069f)
            close()
            moveTo(5.09f, 12.784f)
            curveToRelative(-0.135f, -0.195f, -0.116f, -0.464f, 0.057f, -0.638f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(10f, 16.293f)
            lineToRelative(4.146f, -4.147f)
            lineToRelative(0.07f, -0.057f)
            curveToRelative(0.195f, -0.135f, 0.464f, -0.116f, 0.638f, 0.057f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-4.5f, 4.5f)
            lineToRelative(-0.07f, 0.057f)
            curveToRelative(-0.195f, 0.135f, -0.464f, 0.116f, -0.638f, -0.057f)
            lineToRelative(-4.5f, -4.5f)
            lineToRelative(-0.057f, -0.07f)
            close()
        }
    }.build()
}

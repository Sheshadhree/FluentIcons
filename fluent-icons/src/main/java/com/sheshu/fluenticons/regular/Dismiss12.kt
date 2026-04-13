package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Dismiss12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Dismiss12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.089f, 2.216f)
            lineToRelative(0.058f, -0.07f)
            curveTo(2.32f, 1.974f, 2.589f, 1.955f, 2.784f, 2.09f)
            lineToRelative(0.07f, 0.058f)
            lineTo(6f, 5.293f)
            lineToRelative(3.146f, -3.147f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.708f)
            lineTo(6.708f, 6f)
            lineToRelative(3.147f, 3.146f)
            curveTo(10.027f, 9.32f, 10.046f, 9.59f, 9.91f, 9.784f)
            lineToRelative(-0.057f, 0.07f)
            curveTo(9.68f, 10.027f, 9.41f, 10.046f, 9.216f, 9.91f)
            lineToRelative(-0.07f, -0.057f)
            lineTo(6f, 6.707f)
            lineTo(2.853f, 9.854f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(5.293f, 6f)
            lineTo(2.146f, 2.853f)
            curveTo(1.974f, 2.68f, 1.955f, 2.411f, 2.09f, 2.216f)
            lineToRelative(0.058f, -0.07f)
            lineToRelative(-0.058f, 0.07f)
            close()
        }
    }.build()
}

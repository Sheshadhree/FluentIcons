package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherMoonOff48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherMoonOff48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.384f, 4.616f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(16.22f, 16.22f)
            curveToRelative(-0.054f, 0.11f, -0.11f, 0.219f, -0.167f, 0.328f)
            curveToRelative(-2.108f, 4.022f, -5.739f, 6.835f, -12.52f, 9.261f)
            curveTo(7.316f, 32.492f, 6.99f, 33.5f, 7.494f, 34.23f)
            curveToRelative(1.503f, 2.183f, 3.477f, 4.014f, 5.821f, 5.367f)
            curveToRelative(7.198f, 4.156f, 16.073f, 2.776f, 21.695f, -2.82f)
            lineToRelative(6.607f, 6.607f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-37f, -37f)
            close()
            moveToRelative(24.93f, 3.805f)
            curveToRelative(8.523f, 4.92f, 11.5f, 15.757f, 6.737f, 24.327f)
            lineToRelative(-15.49f, -15.49f)
            curveToRelative(0.432f, -2.78f, 0.245f, -5.882f, -0.652f, -9.558f)
            curveToRelative(-0.215f, -0.88f, 0.48f, -1.716f, 1.383f, -1.668f)
            curveToRelative(2.802f, 0.15f, 5.54f, 0.955f, 8.022f, 2.389f)
            close()
        }
    }.build()
}

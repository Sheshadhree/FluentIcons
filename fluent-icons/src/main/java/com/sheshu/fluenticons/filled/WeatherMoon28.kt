package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherMoon28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherMoon28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.668f, 2.97f)
            curveToRelative(-0.059f, -0.235f, -0.001f, -0.483f, 0.155f, -0.668f)
            curveToRelative(0.156f, -0.184f, 0.392f, -0.282f, 0.633f, -0.263f)
            curveTo(20.627f, 2.536f, 25.48f, 7.701f, 25.48f, 14f)
            curveToRelative(0f, 6.628f, -5.372f, 12f, -12f, 12f)
            curveToRelative(-4.431f, 0f, -8.3f, -2.402f, -10.378f, -5.972f)
            curveToRelative(-0.12f, -0.205f, -0.135f, -0.453f, -0.042f, -0.67f)
            curveToRelative(0.092f, -0.218f, 0.281f, -0.38f, 0.51f, -0.436f)
            curveToRelative(1.6f, -0.393f, 3.55f, -1.024f, 5.32f, -2.004f)
            curveToRelative(1.774f, -0.983f, 3.311f, -2.287f, 4.17f, -4.003f)
            curveToRelative(1.713f, -3.427f, 1.26f, -7.345f, 0.608f, -9.945f)
            close()
        }
    }.build()
}

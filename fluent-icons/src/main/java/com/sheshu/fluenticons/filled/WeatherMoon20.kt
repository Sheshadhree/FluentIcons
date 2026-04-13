package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherMoon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherMoon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.36f, 13.997f)
            curveToRelative(-2.205f, 3.817f, -7.086f, 5.125f, -10.903f, 2.921f)
            curveToRelative(-1.04f, -0.6f, -1.915f, -1.412f, -2.582f, -2.38f)
            curveToRelative(-0.223f, -0.324f, -0.078f, -0.77f, 0.292f, -0.903f)
            curveToRelative(3.006f, -1.076f, 4.616f, -2.323f, 5.55f, -4.107f)
            curveToRelative(0.984f, -1.877f, 1.239f, -3.934f, 0.55f, -6.753f)
            curveToRelative(-0.095f, -0.39f, 0.213f, -0.761f, 0.614f, -0.74f)
            curveToRelative(1.242f, 0.067f, 2.456f, 0.424f, 3.557f, 1.06f)
            curveToRelative(3.817f, 2.203f, 5.125f, 7.084f, 2.921f, 10.902f)
            close()
        }
    }.build()
}

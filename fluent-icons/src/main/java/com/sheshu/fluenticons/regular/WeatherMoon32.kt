package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.WeatherMoon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.WeatherMoon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.17f, 4.195f)
            curveTo(22.762f, 5.215f, 27f, 10.114f, 27f, 16f)
            curveToRelative(0f, 6.628f, -5.372f, 12f, -12f, 12f)
            curveToRelative(-4.036f, 0f, -7.608f, -1.993f, -9.784f, -5.052f)
            curveTo(12.38f, 22.334f, 18.003f, 16.324f, 18.003f, 9f)
            curveToRelative(0f, -1.665f, -0.29f, -3.264f, -0.825f, -4.748f)
            curveToRelative(-0.008f, -0.02f, -0.01f, -0.039f, -0.008f, -0.057f)
            close()
            moveTo(4.003f, 21f)
            curveToRelative(-0.94f, 0f, -1.688f, 1.027f, -1.15f, 1.965f)
            curveTo(5.268f, 27.166f, 9.803f, 30f, 15.002f, 30f)
            curveToRelative(7.732f, 0f, 14f, -6.268f, 14f, -14f)
            curveToRelative(0f, -6.903f, -4.995f, -12.637f, -11.568f, -13.79f)
            curveToRelative(-0.805f, -0.14f, -1.494f, 0.235f, -1.883f, 0.787f)
            curveToRelative(-0.377f, 0.534f, -0.498f, 1.257f, -0.254f, 1.933f)
            curveToRelative(0.458f, 1.27f, 0.707f, 2.64f, 0.707f, 4.07f)
            curveToRelative(0f, 6.627f, -5.372f, 12f, -12f, 12f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherMoon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherMoon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 22.965f)
            curveTo(2.316f, 22.027f, 3.063f, 21f, 4.003f, 21f)
            curveToRelative(6.628f, 0f, 12f, -5.373f, 12f, -12f)
            curveToRelative(0f, -1.43f, -0.25f, -2.8f, -0.707f, -4.07f)
            curveToRelative(-0.244f, -0.676f, -0.123f, -1.399f, 0.254f, -1.933f)
            curveToRelative(0.389f, -0.552f, 1.078f, -0.927f, 1.883f, -0.786f)
            curveTo(24.006f, 3.363f, 29.001f, 9.097f, 29.001f, 16f)
            curveToRelative(0f, 7.732f, -6.268f, 14f, -14f, 14f)
            curveToRelative(-5.198f, 0f, -9.733f, -2.834f, -12.147f, -7.035f)
            close()
        }
    }.build()
}

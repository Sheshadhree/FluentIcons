package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherRain24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherRain24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 4.001f)
            curveToRelative(3.168f, 0f, 4.966f, 2.097f, 5.227f, 4.63f)
            horizontalLineToRelative(0.08f)
            curveToRelative(2.04f, 0f, 3.692f, 1.649f, 3.692f, 3.683f)
            curveToRelative(0f, 2.033f, -1.653f, 3.682f, -3.692f, 3.682f)
            horizontalLineToRelative(-0.582f)
            lineToRelative(-1.583f, 2.637f)
            curveToRelative(-0.207f, 0.358f, -0.666f, 0.481f, -1.024f, 0.274f)
            curveToRelative(-0.33f, -0.19f, -0.46f, -0.59f, -0.32f, -0.933f)
            lineToRelative(0.045f, -0.091f)
            lineToRelative(1.15f, -1.887f)
            horizontalLineToRelative(-2.136f)
            lineToRelative(-1.583f, 2.637f)
            curveToRelative(-0.207f, 0.358f, -0.666f, 0.481f, -1.025f, 0.274f)
            curveToRelative(-0.328f, -0.19f, -0.46f, -0.59f, -0.319f, -0.933f)
            lineToRelative(0.045f, -0.091f)
            lineToRelative(1.15f, -1.887f)
            horizontalLineTo(8.987f)
            lineToRelative(-1.582f, 2.637f)
            curveTo(7.199f, 18.99f, 6.74f, 19.114f, 6.38f, 18.907f)
            curveToRelative(-0.329f, -0.19f, -0.46f, -0.59f, -0.32f, -0.933f)
            lineToRelative(0.046f, -0.091f)
            lineToRelative(1.148f, -1.887f)
            horizontalLineTo(6.693f)
            curveTo(4.653f, 15.996f, 3f, 14.347f, 3f, 12.314f)
            curveTo(3f, 10.28f, 4.654f, 8.63f, 6.693f, 8.63f)
            horizontalLineToRelative(0.08f)
            curveTo(7.035f, 6.081f, 8.83f, 4.001f, 12f, 4.001f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherCloudy48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherCloudy48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.003f, 14.018f)
            curveToRelative(6.337f, 0f, 9.932f, 4.194f, 10.455f, 9.26f)
            horizontalLineToRelative(0.16f)
            curveToRelative(4.078f, 0f, 7.384f, 3.298f, 7.384f, 7.365f)
            curveToRelative(0f, 4.068f, -3.306f, 7.365f, -7.384f, 7.365f)
            horizontalLineToRelative(-21.23f)
            curveToRelative(-4.078f, 0f, -7.383f, -3.297f, -7.383f, -7.365f)
            curveToRelative(0f, -4.067f, 3.305f, -7.365f, 7.384f, -7.365f)
            horizontalLineToRelative(0.16f)
            curveToRelative(0.526f, -5.099f, 4.117f, -9.26f, 10.454f, -9.26f)
            close()
            moveTo(20f, 8f)
            curveToRelative(3.234f, 0f, 6.099f, 1.63f, 7.8f, 4.125f)
            curveToRelative(-0.582f, -0.071f, -1.182f, -0.107f, -1.8f, -0.107f)
            curveToRelative(-6.078f, 0f, -10.476f, 3.438f, -11.96f, 8.614f)
            lineToRelative(-0.08f, 0.29f)
            lineToRelative(-0.115f, 0.475f)
            lineToRelative(-0.414f, 0.077f)
            curveToRelative(-3.216f, 0.674f, -5.831f, 3.001f, -6.905f, 6.06f)
            curveTo(4.99f, 26.334f, 4f, 24.462f, 4f, 22.359f)
            curveToRelative(0f, -3.625f, 2.939f, -6.564f, 6.564f, -6.564f)
            horizontalLineToRelative(0.142f)
            curveTo(11.485f, 11.352f, 15.363f, 8f, 20f, 8f)
            close()
        }
    }.build()
}

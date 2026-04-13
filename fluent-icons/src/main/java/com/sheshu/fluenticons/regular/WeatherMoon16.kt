package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.WeatherMoon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.WeatherMoon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.85f, 3.015f)
            curveTo(10.428f, 3.216f, 12.456f, 5.371f, 12.456f, 8f)
            curveToRelative(0f, 2.761f, -2.238f, 5f, -5f, 5f)
            curveToRelative(-1.754f, 0f, -3.299f, -0.904f, -4.191f, -2.273f)
            curveToRelative(1.403f, -0.38f, 3.316f, -1.302f, 4.16f, -3.551f)
            curveToRelative(0.552f, -1.474f, 0.584f, -2.938f, 0.425f, -4.16f)
            close()
            moveTo(13.456f, 8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            curveToRelative(-0.07f, 0f, -0.14f, 0.001f, -0.21f, 0.004f)
            curveTo(7.1f, 2.009f, 6.964f, 2.077f, 6.872f, 2.19f)
            curveToRelative(-0.09f, 0.114f, -0.127f, 0.262f, -0.1f, 0.405f)
            curveTo(7f, 3.81f, 7.05f, 5.324f, 6.487f, 6.824f)
            curveToRelative(-0.8f, 2.134f, -2.802f, 2.84f, -4.077f, 3.071f)
            curveToRelative(-0.154f, 0.028f, -0.286f, 0.126f, -0.357f, 0.266f)
            curveToRelative(-0.07f, 0.139f, -0.072f, 0.303f, -0.004f, 0.444f)
            curveTo(3.019f, 12.613f, 5.075f, 14f, 7.456f, 14f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            close()
        }
    }.build()
}

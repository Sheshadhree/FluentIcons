package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherCloudy24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherCloudy24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.002f, 7.009f)
            curveToRelative(3.168f, 0f, 4.966f, 2.097f, 5.227f, 4.63f)
            horizontalLineToRelative(0.08f)
            curveToRelative(2.04f, 0f, 3.692f, 1.649f, 3.692f, 3.683f)
            curveToRelative(0f, 2.033f, -1.653f, 3.682f, -3.692f, 3.682f)
            horizontalLineTo(7.694f)
            curveToRelative(-2.039f, 0f, -3.692f, -1.649f, -3.692f, -3.682f)
            curveToRelative(0f, -2.034f, 1.653f, -3.683f, 3.692f, -3.683f)
            horizontalLineToRelative(0.08f)
            curveToRelative(0.263f, -2.55f, 2.06f, -4.63f, 5.228f, -4.63f)
            close()
            moveTo(10f, 4f)
            curveToRelative(1.617f, 0f, 3.05f, 0.815f, 3.9f, 2.062f)
            curveToRelative(-0.29f, -0.035f, -0.59f, -0.053f, -0.898f, -0.053f)
            curveToRelative(-2.994f, 0f, -5.171f, 1.677f, -5.937f, 4.213f)
            lineToRelative(-0.068f, 0.24f)
            lineTo(6.939f, 10.7f)
            lineToRelative(-0.206f, 0.04f)
            curveToRelative(-1.609f, 0.338f, -2.917f, 1.508f, -3.449f, 3.045f)
            curveTo(2.504f, 13.184f, 2f, 12.24f, 2f, 11.18f)
            curveTo(2f, 9.43f, 3.37f, 8f, 5.096f, 7.903f)
            lineToRelative(0.257f, -0.006f)
            curveTo(5.743f, 5.677f, 7.682f, 4f, 10f, 4f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.WeatherMoon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.WeatherMoon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.493f, 13.497f)
            curveToRelative(-1.928f, 3.339f, -6.197f, 4.483f, -9.536f, 2.555f)
            curveToRelative(-0.757f, -0.437f, -1.412f, -1f, -1.946f, -1.663f)
            curveToRelative(2.83f, -1.087f, 4.557f, -2.42f, 5.592f, -4.396f)
            curveToRelative(1.048f, -2f, 1.337f, -4.161f, 0.76f, -6.91f)
            curveToRelative(0.898f, 0.118f, 1.77f, 0.412f, 2.575f, 0.877f)
            curveToRelative(3.339f, 1.928f, 4.483f, 6.198f, 2.555f, 9.537f)
            close()
            moveTo(5.457f, 16.918f)
            curveToRelative(3.817f, 2.204f, 8.698f, 0.896f, 10.902f, -2.921f)
            curveToRelative(2.204f, -3.818f, 0.896f, -8.699f, -2.921f, -10.903f)
            curveToRelative(-1.1f, -0.635f, -2.315f, -0.992f, -3.557f, -1.059f)
            curveToRelative(-0.4f, -0.021f, -0.709f, 0.35f, -0.614f, 0.74f)
            curveToRelative(0.689f, 2.819f, 0.434f, 4.876f, -0.55f, 6.753f)
            curveToRelative(-0.934f, 1.784f, -2.544f, 3.031f, -5.55f, 4.107f)
            curveToRelative(-0.37f, 0.132f, -0.514f, 0.58f, -0.292f, 0.903f)
            curveToRelative(0.667f, 0.968f, 1.542f, 1.78f, 2.582f, 2.38f)
            close()
        }
    }.build()
}

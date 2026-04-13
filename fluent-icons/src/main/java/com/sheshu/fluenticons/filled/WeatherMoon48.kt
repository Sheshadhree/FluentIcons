package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherMoon48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherMoon48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(37.903f, 33.01f)
            curveToRelative(-4.971f, 8.608f, -15.98f, 11.558f, -24.589f, 6.588f)
            curveToRelative(-2.344f, -1.354f, -4.318f, -3.185f, -5.821f, -5.368f)
            curveToRelative(-0.503f, -0.73f, -0.178f, -1.738f, 0.656f, -2.036f)
            curveToRelative(6.78f, -2.427f, 10.412f, -5.24f, 12.52f, -9.262f)
            curveToRelative(2.218f, -4.235f, 2.791f, -8.873f, 1.24f, -15.232f)
            curveToRelative(-0.215f, -0.879f, 0.48f, -1.716f, 1.383f, -1.668f)
            curveToRelative(2.802f, 0.15f, 5.54f, 0.955f, 8.022f, 2.389f)
            curveToRelative(8.61f, 4.97f, 11.56f, 15.979f, 6.589f, 24.588f)
            close()
        }
    }.build()
}

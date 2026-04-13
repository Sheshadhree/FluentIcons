package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.WeatherMoon48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.WeatherMoon48",
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
            moveToRelative(-15.02f, -8.918f)
            curveTo(20.58f, 28.49f, 16.771f, 31.523f, 10.457f, 34f)
            curveToRelative(1.15f, 1.366f, 2.534f, 2.526f, 4.107f, 3.434f)
            curveToRelative(7.414f, 4.28f, 16.893f, 1.74f, 21.173f, -5.674f)
            curveToRelative(4.28f, -7.413f, 1.74f, -16.893f, -5.673f, -21.173f)
            curveToRelative(-1.537f, -0.888f, -3.192f, -1.499f, -4.907f, -1.818f)
            lineToRelative(-0.468f, -0.08f)
            curveToRelative(1.193f, 5.967f, 0.591f, 10.829f, -1.806f, 15.404f)
            close()
        }
    }.build()
}

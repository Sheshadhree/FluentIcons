package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherCloudy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherCloudy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 7f)
            curveToRelative(2.465f, 0f, 3.863f, 1.574f, 4.066f, 3.474f)
            horizontalLineToRelative(0.062f)
            curveToRelative(1.586f, 0f, 2.872f, 1.237f, 2.872f, 2.763f)
            curveTo(18f, 14.763f, 16.714f, 16f, 15.128f, 16f)
            horizontalLineTo(6.872f)
            curveTo(5.286f, 16f, 4f, 14.763f, 4f, 13.237f)
            curveToRelative(0f, -1.526f, 1.286f, -2.763f, 2.872f, -2.763f)
            horizontalLineToRelative(0.062f)
            curveTo(7.138f, 8.561f, 8.535f, 7f, 11f, 7f)
            close()
            moveTo(8.392f, 4f)
            curveToRelative(1.456f, 0f, 2.726f, 0.828f, 3.353f, 2.045f)
            curveTo(11.505f, 6.015f, 11.255f, 6f, 11f, 6f)
            curveTo(8.61f, 6f, 6.868f, 7.307f, 6.247f, 9.286f)
            lineTo(6.184f, 9.5f)
            lineTo(6.138f, 9.687f)
            lineToRelative(-0.165f, 0.03f)
            curveToRelative(-1.242f, 0.256f, -2.26f, 1.117f, -2.716f, 2.258f)
            curveTo(2.503f, 11.515f, 2f, 10.685f, 2f, 9.736f)
            curveTo(2f, 8.344f, 3.086f, 7.205f, 4.457f, 7.12f)
            lineToRelative(0.222f, -0.005f)
            curveTo(4.99f, 5.339f, 6.54f, 4f, 8.392f, 4f)
            close()
        }
    }.build()
}

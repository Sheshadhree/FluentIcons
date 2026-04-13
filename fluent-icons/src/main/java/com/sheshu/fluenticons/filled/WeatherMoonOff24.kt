package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherMoonOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherMoonOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(8.192f, 8.193f)
            curveToRelative(-1.176f, 2.197f, -3.19f, 3.741f, -6.918f, 5.075f)
            curveToRelative(-0.463f, 0.166f, -0.644f, 0.726f, -0.365f, 1.132f)
            curveToRelative(0.836f, 1.212f, 1.932f, 2.23f, 3.235f, 2.982f)
            curveToRelative(3.917f, 2.262f, 8.728f, 1.572f, 11.859f, -1.378f)
            lineToRelative(2.496f, 2.497f)
            curveToRelative(0.293f, 0.292f, 0.768f, 0.292f, 1.061f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.061f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(13.085f, 1.119f)
            curveToRelative(4.75f, 2.743f, 6.4f, 8.794f, 3.718f, 13.562f)
            lineToRelative(-8.59f, -8.59f)
            curveToRelative(0.251f, -1.561f, 0.151f, -3.303f, -0.354f, -5.373f)
            curveToRelative(-0.119f, -0.488f, 0.267f, -0.953f, 0.769f, -0.926f)
            curveToRelative(1.557f, 0.083f, 3.078f, 0.53f, 4.457f, 1.327f)
            close()
        }
    }.build()
}

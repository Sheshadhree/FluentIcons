package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherMoonOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherMoonOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.616f, 12.323f)
            lineToRelative(2.53f, 2.53f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(6.38f, 7.086f)
            curveToRelative(-0.86f, 1.93f, -2.748f, 2.586f, -3.97f, 2.808f)
            curveToRelative(-0.153f, 0.028f, -0.285f, 0.126f, -0.356f, 0.266f)
            curveToRelative(-0.07f, 0.139f, -0.072f, 0.303f, -0.004f, 0.444f)
            curveTo(3.019f, 12.613f, 5.075f, 14f, 7.456f, 14f)
            curveToRelative(1.616f, 0f, 3.082f, -0.638f, 4.16f, -1.677f)
            close()
            moveTo(13.456f, 8f)
            curveToRelative(0f, 0.97f, -0.23f, 1.886f, -0.638f, 2.696f)
            lineTo(6.916f, 4.795f)
            curveToRelative(0.052f, -0.788f, -0.02f, -1.538f, -0.145f, -2.2f)
            curveToRelative(-0.026f, -0.142f, 0.01f, -0.29f, 0.101f, -0.404f)
            curveTo(6.964f, 2.077f, 7.1f, 2.009f, 7.246f, 2.004f)
            curveTo(7.316f, 2f, 7.386f, 2f, 7.456f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            close()
        }
    }.build()
}

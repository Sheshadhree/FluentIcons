package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherMoonOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherMoonOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(8.754f, 9.46f)
            lineTo(8.716f, 9.529f)
            curveToRelative(-0.935f, 1.783f, -2.545f, 3.03f, -5.551f, 4.106f)
            curveToRelative(-0.37f, 0.133f, -0.514f, 0.58f, -0.292f, 0.903f)
            curveToRelative(0.667f, 0.968f, 1.542f, 1.78f, 2.582f, 2.38f)
            curveToRelative(3.167f, 1.829f, 7.066f, 1.24f, 9.561f, -1.194f)
            lineToRelative(2.13f, 2.13f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-2.165f, -2.165f)
            lineToRelative(-6.507f, -6.506f)
            lineToRelative(-6.329f, -6.329f)
            close()
            moveToRelative(13.505f, 11.85f)
            lineToRelative(-0.089f, 0.15f)
            lineToRelative(-6.777f, -6.776f)
            curveTo(9.76f, 6.046f, 9.703f, 4.564f, 9.266f, 2.775f)
            curveTo(9.171f, 2.385f, 9.48f, 2.014f, 9.88f, 2.035f)
            curveToRelative(1.242f, 0.067f, 2.456f, 0.424f, 3.557f, 1.06f)
            curveToRelative(3.817f, 2.203f, 5.125f, 7.085f, 2.921f, 10.902f)
            close()
        }
    }.build()
}

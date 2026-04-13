package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonLightning20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonLightning20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveTo(7.79f, 2f, 6f, 3.79f, 6f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(-4.991f, 9f)
            curveTo(3.903f, 11f, 3f, 11.887f, 3f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(6.417f, 17.614f, 8.145f, 18f, 10f, 18f)
            curveToRelative(0.6f, 0f, 1.188f, -0.04f, 1.752f, -0.123f)
            lineTo(11.97f, 17f)
            horizontalLineTo(11.5f)
            curveToRelative(-1.07f, 0f, -1.796f, -1.089f, -1.384f, -2.077f)
            lineTo(11.752f, 11f)
            horizontalLineTo(5.009f)
            close()
            moveToRelative(7.603f, 5f)
            curveToRelative(0.325f, 0f, 0.564f, 0.306f, 0.485f, 0.621f)
            lineToRelative(-0.434f, 1.738f)
            curveToRelative(-0.121f, 0.483f, 0.462f, 0.827f, 0.826f, 0.487f)
            lineToRelative(4.872f, -4.548f)
            curveTo(18.86f, 13.834f, 18.531f, 13f, 17.85f, 13f)
            horizontalLineToRelative(-0.404f)
            curveToRelative(-0.341f, 0f, -0.582f, -0.334f, -0.474f, -0.658f)
            lineToRelative(0.561f, -1.684f)
            curveTo(17.641f, 10.334f, 17.4f, 10f, 17.06f, 10f)
            horizontalLineToRelative(-3.473f)
            curveToRelative(-0.202f, 0f, -0.384f, 0.121f, -0.462f, 0.308f)
            lineToRelative(-2.083f, 5f)
            curveTo(10.904f, 15.637f, 11.146f, 16f, 11.502f, 16f)
            horizontalLineToRelative(1.11f)
            close()
        }
    }.build()
}

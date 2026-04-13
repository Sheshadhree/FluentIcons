package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CompassNorthwest24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CompassNorthwest24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            reflectiveCurveToRelative(3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveToRelative(-3.806f, -8.5f, -8.5f, -8.5f)
            close()
            moveTo(7.083f, 8.708f)
            curveToRelative(-0.406f, -1.02f, 0.605f, -2.03f, 1.624f, -1.624f)
            lineToRelative(0.206f, 0.082f)
            lineToRelative(3.746f, 1.425f)
            curveToRelative(1.269f, 0.482f, 2.271f, 1.484f, 2.753f, 2.753f)
            lineToRelative(0.162f, 0.428f)
            lineToRelative(1.623f, 3.784f)
            curveToRelative(0.445f, 1.037f, -0.604f, 2.086f, -1.641f, 1.641f)
            lineToRelative(-3.757f, -1.61f)
            lineToRelative(-0.456f, -0.173f)
            curveToRelative(-1.269f, -0.482f, -2.271f, -1.484f, -2.753f, -2.753f)
            lineTo(7.209f, 9.025f)
            lineTo(7.083f, 8.708f)
            close()
            moveToRelative(2.999f, 3.473f)
            curveToRelative(0.32f, 0.802f, 0.946f, 1.444f, 1.74f, 1.784f)
            lineToRelative(0.52f, 0.223f)
            lineToRelative(2.976f, 1.132f)
            lineToRelative(-1.141f, -3.003f)
            lineToRelative(-0.212f, -0.496f)
            curveToRelative(-0.34f, -0.793f, -0.982f, -1.42f, -1.784f, -1.739f)
            lineToRelative(-3.489f, -1.39f)
            lineToRelative(1.39f, 3.489f)
            close()
        }
    }.build()
}

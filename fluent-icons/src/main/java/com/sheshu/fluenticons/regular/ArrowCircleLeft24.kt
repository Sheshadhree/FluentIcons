package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.28f, 16.53f)
            lineToRelative(0.073f, -0.083f)
            curveToRelative(0.218f, -0.294f, 0.193f, -0.71f, -0.073f, -0.977f)
            lineToRelative(-2.72f, -2.72f)
            horizontalLineToRelative(6.69f)
            lineToRelative(0.102f, -0.007f)
            curveTo(16.718f, 12.693f, 17f, 12.38f, 17f, 12f)
            lineToRelative(-0.006f, -0.1f)
            curveToRelative(-0.05f, -0.366f, -0.364f, -0.649f, -0.744f, -0.649f)
            horizontalLineTo(9.56f)
            lineToRelative(2.722f, -2.72f)
            lineToRelative(0.072f, -0.084f)
            curveToRelative(0.218f, -0.294f, 0.194f, -0.71f, -0.072f, -0.977f)
            curveToRelative(-0.293f, -0.293f, -0.768f, -0.293f, -1.06f, 0f)
            lineToRelative(-4.002f, 4f)
            lineToRelative(-0.073f, 0.084f)
            curveToRelative(-0.218f, 0.294f, -0.194f, 0.71f, 0.073f, 0.977f)
            lineToRelative(4f, 4f)
            lineToRelative(0.085f, 0.073f)
            curveToRelative(0.293f, 0.218f, 0.71f, 0.194f, 0.976f, -0.072f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            close()
            moveToRelative(0f, 18.5f)
            curveToRelative(-4.694f, 0f, -8.5f, -3.806f, -8.5f, -8.5f)
            reflectiveCurveTo(7.306f, 3.5f, 12f, 3.5f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            close()
        }
    }.build()
}

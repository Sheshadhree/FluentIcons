package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.47f, 12.28f)
            lineToRelative(0.084f, 0.073f)
            curveToRelative(0.294f, 0.218f, 0.71f, 0.193f, 0.977f, -0.073f)
            lineToRelative(2.72f, -2.72f)
            verticalLineToRelative(6.69f)
            lineToRelative(0.007f, 0.102f)
            curveTo(11.308f, 16.718f, 11.62f, 17f, 12f, 17f)
            lineToRelative(0.101f, -0.006f)
            curveToRelative(0.367f, -0.05f, 0.649f, -0.364f, 0.649f, -0.744f)
            verticalLineTo(9.56f)
            lineToRelative(2.72f, 2.722f)
            lineToRelative(0.084f, 0.072f)
            curveToRelative(0.294f, 0.218f, 0.71f, 0.194f, 0.977f, -0.072f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.06f)
            lineToRelative(-4f, -4.002f)
            lineToRelative(-0.084f, -0.073f)
            curveToRelative(-0.294f, -0.218f, -0.71f, -0.194f, -0.977f, 0.073f)
            lineToRelative(-4f, 4f)
            lineToRelative(-0.073f, 0.085f)
            curveToRelative(-0.218f, 0.293f, -0.194f, 0.71f, 0.072f, 0.976f)
            close()
            moveTo(22.001f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveToRelative(-10f, 4.477f, -10f, 10f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            close()
            moveToRelative(-18.5f, 0f)
            curveToRelative(0f, -4.694f, 3.806f, -8.5f, 8.5f, -8.5f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            close()
        }
    }.build()
}

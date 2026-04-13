package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.001f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
            reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
            close()
            moveToRelative(0.78f, 5.469f)
            lineToRelative(-0.084f, -0.073f)
            curveToRelative(-0.26f, -0.193f, -0.619f, -0.196f, -0.882f, -0.007f)
            lineTo(11.72f, 7.47f)
            lineToRelative(-0.073f, 0.084f)
            curveToRelative(-0.194f, 0.261f, -0.196f, 0.62f, -0.007f, 0.883f)
            lineToRelative(0.08f, 0.094f)
            lineToRelative(2.72f, 2.72f)
            horizontalLineTo(7.75f)
            lineToRelative(-0.103f, 0.006f)
            curveToRelative(-0.332f, 0.045f, -0.596f, 0.309f, -0.64f, 0.642f)
            lineTo(7f, 11.999f)
            lineToRelative(0.007f, 0.102f)
            curveToRelative(0.045f, 0.333f, 0.309f, 0.596f, 0.642f, 0.641f)
            lineTo(7.75f, 12.75f)
            horizontalLineToRelative(6.69f)
            lineToRelative(-2.72f, 2.72f)
            lineToRelative(-0.073f, 0.085f)
            curveToRelative(-0.217f, 0.293f, -0.193f, 0.71f, 0.073f, 0.976f)
            curveToRelative(0.266f, 0.267f, 0.683f, 0.29f, 0.976f, 0.073f)
            lineToRelative(0.085f, -0.072f)
            lineToRelative(4.001f, -4f)
            lineToRelative(0.073f, -0.085f)
            curveToRelative(0.193f, -0.26f, 0.196f, -0.619f, 0.007f, -0.882f)
            lineToRelative(-0.08f, -0.094f)
            lineToRelative(-4f, -4.001f)
            lineToRelative(-0.085f, -0.073f)
            lineToRelative(0.084f, 0.073f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.001f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveToRelative(-10f, 4.477f, -10f, 10f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            close()
            moveToRelative(-14.53f, 0.28f)
            curveToRelative(-0.267f, -0.266f, -0.291f, -0.683f, -0.073f, -0.976f)
            lineToRelative(0.072f, -0.085f)
            lineToRelative(4.001f, -4f)
            curveToRelative(0.266f, -0.267f, 0.683f, -0.29f, 0.977f, -0.073f)
            lineToRelative(0.084f, 0.073f)
            lineToRelative(4f, 4.001f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(-0.267f, 0.267f, -0.683f, 0.291f, -0.977f, 0.073f)
            lineToRelative(-0.084f, -0.072f)
            lineToRelative(-2.72f, -2.722f)
            verticalLineToRelative(6.691f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.649f, 0.744f)
            lineTo(12.001f, 17f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(11.25f, 16.25f)
            verticalLineTo(9.56f)
            lineToRelative(-2.72f, 2.72f)
            curveToRelative(-0.266f, 0.266f, -0.683f, 0.29f, -0.977f, 0.073f)
            lineTo(7.47f, 12.28f)
            close()
        }
    }.build()
}

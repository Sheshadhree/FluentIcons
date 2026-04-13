package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            close()
            moveToRelative(0.28f, 14.53f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.291f, -0.976f, 0.073f)
            lineToRelative(-0.085f, -0.072f)
            lineToRelative(-4f, -4.001f)
            curveToRelative(-0.267f, -0.266f, -0.29f, -0.683f, -0.073f, -0.977f)
            lineTo(7.22f, 11.47f)
            lineToRelative(4.001f, -4f)
            curveToRelative(0.293f, -0.293f, 0.768f, -0.293f, 1.06f, 0f)
            curveToRelative(0.267f, 0.267f, 0.291f, 0.683f, 0.073f, 0.977f)
            lineTo(12.281f, 8.53f)
            lineToRelative(-2.722f, 2.72f)
            horizontalLineToRelative(6.691f)
            curveToRelative(0.38f, 0f, 0.694f, 0.283f, 0.744f, 0.649f)
            lineTo(17f, 12f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(16.25f, 12.75f)
            horizontalLineTo(9.56f)
            lineToRelative(2.72f, 2.72f)
            curveToRelative(0.266f, 0.266f, 0.29f, 0.683f, 0.073f, 0.977f)
            lineTo(12.28f, 16.53f)
            close()
        }
    }.build()
}

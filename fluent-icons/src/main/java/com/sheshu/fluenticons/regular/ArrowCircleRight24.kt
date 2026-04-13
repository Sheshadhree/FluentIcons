package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleRight24",
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
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            reflectiveCurveToRelative(3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveToRelative(-3.806f, -8.5f, -8.5f, -8.5f)
            close()
            moveToRelative(-0.353f, 4.053f)
            lineToRelative(0.073f, -0.084f)
            curveToRelative(0.266f, -0.266f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineToRelative(0.084f, 0.073f)
            lineToRelative(4.001f, 4f)
            curveToRelative(0.266f, 0.267f, 0.29f, 0.684f, 0.073f, 0.977f)
            lineToRelative(-0.073f, 0.085f)
            lineToRelative(-4.002f, 4f)
            curveToRelative(-0.292f, 0.292f, -0.767f, 0.292f, -1.06f, 0f)
            curveToRelative(-0.266f, -0.267f, -0.29f, -0.684f, -0.073f, -0.977f)
            lineToRelative(0.073f, -0.084f)
            lineToRelative(2.722f, -2.721f)
            horizontalLineTo(7.75f)
            curveToRelative(-0.38f, 0f, -0.693f, -0.282f, -0.743f, -0.648f)
            lineTo(7f, 12f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.649f, -0.743f)
            lineTo(7.75f, 11.25f)
            horizontalLineToRelative(6.69f)
            lineToRelative(-2.72f, -2.72f)
            curveToRelative(-0.266f, -0.266f, -0.29f, -0.682f, -0.072f, -0.976f)
            lineToRelative(0.073f, -0.084f)
            lineToRelative(-0.073f, 0.084f)
            close()
        }
    }.build()
}

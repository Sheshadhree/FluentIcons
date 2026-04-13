package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SendClock32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SendClock32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.078f, 3.965f)
            curveTo(1.672f, 2.7f, 2.988f, 1.57f, 4.177f, 2.165f)
            lineTo(29.171f, 14.66f)
            curveToRelative(0.905f, 0.452f, 1.07f, 1.59f, 0.494f, 2.292f)
            curveToRelative(-1.564f, -1.722f, -3.786f, -2.836f, -6.268f, -2.943f)
            lineTo(4.346f, 4.485f)
            lineToRelative(3.382f, 10.516f)
            horizontalLineTo(18.87f)
            curveToRelative(-0.979f, 0.506f, -1.852f, 1.187f, -2.58f, 2f)
            horizontalLineTo(7.729f)
            lineTo(4.346f, 27.517f)
            lineToRelative(9.66f, -4.828f)
            curveTo(14.001f, 22.792f, 14f, 22.896f, 14f, 23f)
            curveToRelative(0f, 0.628f, 0.065f, 1.242f, 0.187f, 1.834f)
            lineToRelative(-10.01f, 5.004f)
            curveToRelative(-1.188f, 0.594f, -2.505f, -0.536f, -2.099f, -1.8f)
            lineTo(5.95f, 16f)
            lineTo(2.078f, 3.965f)
            close()
            moveTo(23f, 30.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            close()
            moveTo(22.75f, 18f)
            curveTo(22.336f, 18f, 22f, 18.336f, 22f, 18.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.335f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(23.5f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.414f, -0.335f, -0.75f, -0.75f, -0.75f)
            close()
        }
    }.build()
}

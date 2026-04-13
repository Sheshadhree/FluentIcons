package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareArrowForward48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareArrowForward48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 11.25f)
            curveTo(6f, 8.35f, 8.35f, 6f, 11.25f, 6f)
            horizontalLineToRelative(25.5f)
            curveTo(39.65f, 6f, 42f, 8.35f, 42f, 11.25f)
            verticalLineToRelative(12.794f)
            curveToRelative(-0.78f, -0.5f, -1.618f, -0.919f, -2.5f, -1.244f)
            verticalLineTo(11.25f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            horizontalLineToRelative(-25.5f)
            curveToRelative(-1.519f, 0f, -2.75f, 1.231f, -2.75f, 2.75f)
            verticalLineToRelative(25.5f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineTo(22.8f)
            curveToRelative(0.325f, 0.882f, 0.744f, 1.72f, 1.244f, 2.5f)
            horizontalLineTo(11.25f)
            curveTo(8.35f, 42f, 6f, 39.65f, 6f, 36.75f)
            verticalLineToRelative(-25.5f)
            close()
            moveTo(24f, 35f)
            curveToRelative(0f, 6.075f, 4.925f, 11f, 11f, 11f)
            reflectiveCurveToRelative(11f, -4.925f, 11f, -11f)
            reflectiveCurveToRelative(-4.925f, -11f, -11f, -11f)
            reflectiveCurveToRelative(-11f, 4.925f, -11f, 11f)
            close()
            moveToRelative(14.293f, -3.293f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(3f, 3f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineTo(39.586f, 35f)
            horizontalLineTo(34f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            horizontalLineToRelative(5.586f)
            lineToRelative(-1.293f, -1.293f)
            close()
        }
    }.build()
}

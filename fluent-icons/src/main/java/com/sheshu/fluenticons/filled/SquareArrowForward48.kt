package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareArrowForward48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareArrowForward48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.25f, 6f)
            curveTo(8.35f, 6f, 6f, 8.35f, 6f, 11.25f)
            verticalLineToRelative(25.5f)
            curveTo(6f, 39.65f, 8.35f, 42f, 11.25f, 42f)
            horizontalLineToRelative(12.794f)
            curveTo(22.75f, 39.98f, 22f, 37.577f, 22f, 35f)
            curveToRelative(0f, -7.18f, 5.82f, -13f, 13f, -13f)
            curveToRelative(2.577f, 0f, 4.98f, 0.75f, 7f, 2.044f)
            verticalLineTo(11.25f)
            curveTo(42f, 8.35f, 39.65f, 6f, 36.75f, 6f)
            horizontalLineToRelative(-25.5f)
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

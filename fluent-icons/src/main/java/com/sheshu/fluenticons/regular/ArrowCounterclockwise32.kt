package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCounterclockwise32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCounterclockwise32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27f, 16f)
            curveToRelative(0f, -6.075f, -4.925f, -11f, -11f, -11f)
            curveToRelative(-2.923f, 0f, -5.58f, 1.14f, -7.55f, 3f)
            horizontalLineTo(11f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2.62f)
            curveTo(9.335f, 4.378f, 12.507f, 3f, 16f, 3f)
            curveToRelative(7.18f, 0f, 13f, 5.82f, 13f, 13f)
            reflectiveCurveToRelative(-5.82f, 13f, -13f, 13f)
            reflectiveCurveTo(3f, 23.18f, 3f, 16f)
            curveToRelative(0f, -0.364f, 0.015f, -0.725f, 0.045f, -1.082f)
            curveToRelative(0.045f, -0.55f, 0.528f, -0.96f, 1.078f, -0.915f)
            curveToRelative(0.55f, 0.046f, 0.96f, 0.529f, 0.915f, 1.08f)
            curveTo(5.013f, 15.384f, 5f, 15.69f, 5f, 16f)
            curveToRelative(0f, 6.075f, 4.925f, 11f, 11f, 11f)
            reflectiveCurveToRelative(11f, -4.925f, 11f, -11f)
            close()
        }
    }.build()
}

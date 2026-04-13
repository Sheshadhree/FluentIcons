package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCounterclockwise28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCounterclockwise28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.342f, 7f)
            curveTo(9.89f, 5.748f, 11.857f, 5f, 14f, 5f)
            curveToRelative(4.97f, 0f, 9f, 4.03f, 9f, 9f)
            reflectiveCurveToRelative(-4.03f, 9f, -9f, 9f)
            reflectiveCurveToRelative(-9f, -4.03f, -9f, -9f)
            curveToRelative(0f, -0.305f, 0.015f, -0.605f, 0.045f, -0.901f)
            curveToRelative(0.054f, -0.55f, -0.347f, -1.04f, -0.897f, -1.094f)
            curveToRelative(-0.55f, -0.055f, -1.04f, 0.347f, -1.094f, 0.896f)
            curveTo(3.018f, 13.263f, 3f, 13.63f, 3f, 14f)
            curveToRelative(0f, 6.075f, 4.925f, 11f, 11f, 11f)
            reflectiveCurveToRelative(11f, -4.925f, 11f, -11f)
            reflectiveCurveTo(20.075f, 3f, 14f, 3f)
            curveToRelative(-2.66f, 0f, -5.099f, 0.944f, -7f, 2.514f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(5f, 3.448f, 5f, 4f)
            verticalLineToRelative(4.029f)
            curveTo(5.016f, 8.568f, 5.457f, 9f, 6f, 9f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(8.342f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowClockwise28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowClockwise28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.657f, 7f)
            curveTo(18.111f, 5.748f, 16.143f, 5f, 14f, 5f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            curveToRelative(0f, -0.305f, -0.015f, -0.605f, -0.044f, -0.901f)
            curveToRelative(-0.055f, -0.55f, 0.346f, -1.04f, 0.896f, -1.094f)
            curveToRelative(0.55f, -0.055f, 1.04f, 0.347f, 1.094f, 0.896f)
            curveTo(24.982f, 13.263f, 25f, 13.63f, 25f, 14f)
            curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
            reflectiveCurveTo(3f, 20.075f, 3f, 14f)
            reflectiveCurveTo(7.925f, 3f, 14f, 3f)
            curveToRelative(2.66f, 0f, 5.099f, 0.944f, 7f, 2.514f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4.029f)
            curveTo(22.984f, 8.568f, 22.543f, 9f, 22f, 9f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1.657f)
            close()
        }
    }.build()
}

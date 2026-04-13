package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleRight12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.098f, 3.647f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.707f)
            lineTo(7.244f, 5.5f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 5.5f, 3f, 5.724f, 3f, 6f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3.744f)
            lineTo(6.098f, 7.646f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(2f, -2f)
            curveTo(9f, 6.158f, 9f, 5.841f, 8.805f, 5.646f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            close()
            moveTo(11f, 6f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveTo(1f, 3.239f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            close()
            moveTo(6f, 2f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
        }
    }.build()
}

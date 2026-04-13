package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CheckmarkUnderlineCircle16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CheckmarkUnderlineCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 13f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            close()
            moveToRelative(2.856f, -8.85f)
            curveToRelative(0.192f, 0.198f, 0.192f, 0.52f, 0f, 0.719f)
            lineTo(7.972f, 8.85f)
            curveTo(7.88f, 8.946f, 7.755f, 9f, 7.624f, 9f)
            curveTo(7.494f, 9f, 7.37f, 8.946f, 7.276f, 8.85f)
            lineTo(6.144f, 7.68f)
            curveToRelative(-0.192f, -0.199f, -0.192f, -0.52f, 0f, -0.72f)
            curveToRelative(0.192f, -0.198f, 0.504f, -0.198f, 0.696f, 0f)
            lineToRelative(0.784f, 0.811f)
            lineTo(10.16f, 5.15f)
            curveToRelative(0.192f, -0.199f, 0.504f, -0.199f, 0.696f, 0f)
            close()
            moveTo(6f, 10.5f)
            curveTo(6f, 10.224f, 6.224f, 10f, 6.5f, 10f)
            horizontalLineToRelative(2.998f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.774f, 11f, 9.498f, 11f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 11f, 6f, 10.776f, 6f, 10.5f)
            close()
        }
    }.build()
}

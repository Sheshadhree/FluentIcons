package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CompassTrueNorth16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CompassTrueNorth16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveToRelative(0f, 1f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
            moveTo(7.08f, 4.115f)
            curveToRelative(0.342f, -0.82f, 1.504f, -0.82f, 1.846f, 0f)
            lineToRelative(1.058f, 2.536f)
            curveToRelative(0.36f, 0.863f, 0.36f, 1.834f, 0f, 2.697f)
            lineToRelative(-1.058f, 2.537f)
            curveToRelative(-0.342f, 0.819f, -1.503f, 0.819f, -1.846f, 0f)
            lineTo(6.02f, 9.348f)
            curveToRelative(-0.36f, -0.863f, -0.36f, -1.834f, 0f, -2.697f)
            lineToRelative(1.06f, -2.536f)
            close()
            moveToRelative(2.073f, 4.58f)
            curveTo(9.015f, 8.78f, 8.865f, 8.851f, 8.701f, 8.898f)
            curveToRelative(-0.456f, 0.133f, -0.94f, 0.133f, -1.397f, 0f)
            curveTo(7.139f, 8.851f, 6.989f, 8.78f, 6.85f, 8.695f)
            curveToRelative(0.026f, 0.09f, 0.056f, 0.18f, 0.092f, 0.268f)
            lineToRelative(1.06f, 2.536f)
            lineToRelative(1.059f, -2.536f)
            curveToRelative(0.036f, -0.088f, 0.065f, -0.177f, 0.091f, -0.268f)
            close()
            moveTo(7.04f, 6.805f)
            curveTo(6.847f, 7.27f, 7.1f, 7.799f, 7.582f, 7.939f)
            curveToRelative(0.275f, 0.08f, 0.566f, 0.079f, 0.84f, 0f)
            curveToRelative(0.483f, -0.14f, 0.736f, -0.669f, 0.543f, -1.132f)
            lineTo(8.003f, 4.5f)
            lineTo(7.04f, 6.806f)
            close()
        }
    }.build()
}

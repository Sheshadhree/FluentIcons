package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Person28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Person28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 16f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(0.715f)
            curveTo(24f, 23.292f, 19.79f, 26f, 14f, 26f)
            reflectiveCurveTo(4f, 23.433f, 4f, 19.715f)
            verticalLineTo(19f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(14f)
            close()
            moveToRelative(0f, 1.5f)
            horizontalLineTo(7f)
            curveToRelative(-0.78f, 0f, -1.42f, 0.595f, -1.493f, 1.355f)
            lineTo(5.5f, 19f)
            verticalLineToRelative(0.715f)
            curveToRelative(0f, 2.674f, 3.389f, 4.785f, 8.5f, 4.785f)
            curveToRelative(4.926f, 0f, 8.355f, -2.105f, 8.495f, -4.624f)
            lineToRelative(0.005f, -0.161f)
            verticalLineTo(19f)
            curveToRelative(0f, -0.78f, -0.595f, -1.42f, -1.355f, -1.493f)
            lineTo(21f, 17.5f)
            close()
            moveTo(14f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.015f, -4.5f, -4.5f, -4.5f)
            close()
        }
    }.build()
}

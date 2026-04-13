package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Headphones24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Headphones24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 12f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.598f, -1.249f, 2.904f, -2.824f, 2.995f)
            lineTo(19f, 22f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.513f, 0f, -0.935f, -0.386f, -0.993f, -0.883f)
            lineTo(15f, 21f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.513f, 0.386f, -0.935f, 0.883f, -0.993f)
            lineTo(16f, 14f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -4.694f, -3.806f, -8.5f, -8.5f, -8.5f)
            reflectiveCurveTo(3.5f, 7.306f, 3.5f, 12f)
            verticalLineToRelative(2f)
            horizontalLineTo(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-7f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            verticalLineToRelative(7f)
            verticalLineToRelative(-7f)
            close()
            moveTo(7.5f, 15.5f)
            horizontalLineToRelative(-4f)
            verticalLineTo(19f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(13f, 0f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(5f)
            horizontalLineTo(19f)
            curveToRelative(0.78f, 0f, 1.42f, -0.595f, 1.493f, -1.355f)
            lineTo(20.5f, 19f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}

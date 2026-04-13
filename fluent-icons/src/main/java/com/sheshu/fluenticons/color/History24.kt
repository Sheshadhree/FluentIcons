package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.History24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.History24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF6D37CD)
                ),
                start = Offset(10.1563f, 18.4502f),
                end = Offset(22.0941f, 13.4139f)
            )
        ) {
            moveTo(12f, 7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(3f, 4.05882f),
                end = Offset(7.83131f, 24.2883f)
            )
        ) {
            moveTo(12f, 5f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            curveToRelative(0f, -0.297f, 0.019f, -0.59f, 0.054f, -0.876f)
            curveToRelative(0.069f, -0.548f, -0.32f, -1.048f, -0.868f, -1.116f)
            curveToRelative(-0.548f, -0.069f, -1.048f, 0.32f, -1.116f, 0.868f)
            curveTo(3.024f, 11.245f, 3f, 11.62f, 3f, 12f)
            curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
            curveToRelative(-1.85f, 0f, -3.57f, 0.559f, -5f, 1.516f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(5f, 3.448f, 5f, 4f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(9.552f, 6f, 9f, 6f)
            horizontalLineTo(8.392f)
            curveTo(9.446f, 5.365f, 10.68f, 5f, 12f, 5f)
            close()
        }
    }.build()
}

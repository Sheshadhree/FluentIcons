package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Mic28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Mic28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCAD2D9),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(6f, 7.02976f),
                end = Offset(15.0905f, 27.8339f)
            )
        ) {
            moveTo(7.023f, 13f)
            curveTo(6.458f, 13f, 6f, 13.459f, 6f, 14.024f)
            verticalLineToRelative(0.772f)
            curveToRelative(0f, 4.348f, 3.265f, 7.934f, 7.477f, 8.44f)
            verticalLineToRelative(2.74f)
            curveToRelative(0f, 0.566f, 0.458f, 1.024f, 1.023f, 1.024f)
            reflectiveCurveToRelative(1.023f, -0.458f, 1.023f, -1.023f)
            verticalLineToRelative(-2.742f)
            curveTo(19.735f, 22.73f, 23f, 19.145f, 23f, 14.796f)
            verticalLineToRelative(-0.772f)
            curveTo(23f, 13.457f, 22.542f, 13f, 21.977f, 13f)
            curveToRelative(-0.566f, 0f, -1.024f, 0.459f, -1.024f, 1.024f)
            verticalLineToRelative(0.772f)
            curveToRelative(0f, 3.564f, -2.889f, 6.453f, -6.453f, 6.453f)
            curveToRelative(-3.564f, 0f, -6.453f, -2.89f, -6.453f, -6.453f)
            verticalLineToRelative(-0.773f)
            curveTo(8.047f, 13.458f, 7.589f, 13f, 7.023f, 13f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(7.75f, -1.86364f),
                end = Offset(17.2532f, 28.1132f)
            )
        ) {
            moveTo(14.5f, 2f)
            curveTo(12.015f, 2f, 10f, 4.015f, 10f, 6.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-8f)
            curveTo(19f, 4.015f, 16.985f, 2f, 14.5f, 2f)
            close()
        }
    }.build()
}

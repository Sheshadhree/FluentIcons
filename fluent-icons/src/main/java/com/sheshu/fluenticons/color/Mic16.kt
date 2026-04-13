package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Mic16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Mic16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.Black,
                    1f to Color(0xFF666666)
                ),
                start = Offset(8f, 7.3125f),
                end = Offset(8f, 15f)
            )
        ) {
            moveTo(3.733f, 7.313f)
            curveTo(3.328f, 7.313f, 3f, 7.64f, 3f, 8.046f)
            curveToRelative(0f, 2.512f, 1.853f, 4.591f, 4.267f, 4.946f)
            verticalLineToRelative(1.275f)
            curveTo(7.267f, 14.672f, 7.595f, 15f, 8f, 15f)
            curveToRelative(0.405f, 0f, 0.733f, -0.328f, 0.733f, -0.733f)
            verticalLineToRelative(-1.275f)
            curveTo(11.147f, 12.637f, 13f, 10.558f, 13f, 8.046f)
            curveToRelative(0f, -0.405f, -0.328f, -0.733f, -0.733f, -0.733f)
            curveToRelative(-0.405f, 0f, -0.734f, 0.328f, -0.734f, 0.733f)
            curveToRelative(0f, 1.951f, -1.582f, 3.533f, -3.533f, 3.533f)
            curveToRelative(-1.951f, 0f, -3.533f, -1.582f, -3.533f, -3.533f)
            curveToRelative(0f, -0.405f, -0.329f, -0.733f, -0.734f, -0.733f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCAD2D9),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(3f, 4.07566f),
                end = Offset(7.75683f, 15.5058f)
            )
        ) {
            moveTo(3.733f, 7.313f)
            curveTo(3.328f, 7.313f, 3f, 7.64f, 3f, 8.046f)
            curveToRelative(0f, 2.512f, 1.853f, 4.591f, 4.267f, 4.946f)
            verticalLineToRelative(1.275f)
            curveTo(7.267f, 14.672f, 7.595f, 15f, 8f, 15f)
            curveToRelative(0.405f, 0f, 0.733f, -0.328f, 0.733f, -0.733f)
            verticalLineToRelative(-1.275f)
            curveTo(11.147f, 12.637f, 13f, 10.558f, 13f, 8.046f)
            curveToRelative(0f, -0.405f, -0.328f, -0.733f, -0.733f, -0.733f)
            curveToRelative(-0.405f, 0f, -0.734f, 0.328f, -0.734f, 0.733f)
            curveToRelative(0f, 1.951f, -1.582f, 3.533f, -3.533f, 3.533f)
            curveToRelative(-1.951f, 0f, -3.533f, -1.582f, -3.533f, -3.533f)
            curveToRelative(0f, -0.405f, -0.329f, -0.733f, -0.734f, -0.733f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(4.25f, 0.0681817f),
                end = Offset(8.60193f, 15.3213f)
            )
        ) {
            moveTo(8f, 2f)
            curveTo(6.62f, 2f, 5.5f, 3.12f, 5.5f, 4.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(4.5f)
            curveTo(10.5f, 3.12f, 9.38f, 2f, 8f, 2f)
            close()
        }
    }.build()
}

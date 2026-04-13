package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CalendarDataBar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CalendarDataBar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(8f, 6f),
                end = Offset(11.5f, 17f)
            )
        ) {
            moveTo(17f, 6f)
            horizontalLineTo(3f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8)
                ),
                start = Offset(11.5f, 10.5f),
                end = Offset(13.5f, 19.5f)
            )
        ) {
            moveTo(17f, 6f)
            horizontalLineTo(3f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.535f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(12f, 18f),
                radius = 4f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(17f, 6f)
            horizontalLineTo(3f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.535f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(15f, 15.5f),
                radius = 6.5f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(17f, 6f)
            horizontalLineTo(3f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.535f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(18f, 15.5f),
                radius = 5.5f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(17f, 6f)
            horizontalLineTo(3f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.5625f, 3f),
                end = Offset(4.90356f, 9.81561f)
            )
        ) {
            moveTo(17f, 5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(14f)
            verticalLineTo(5.5f)
            close()
            moveToRelative(0f, 7.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(-2f, -3f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-3f, 4f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}

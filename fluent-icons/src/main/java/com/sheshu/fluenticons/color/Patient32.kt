package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Patient32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Patient32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(12.8571f, 2f),
                end = Offset(19.3774f, 20.6432f)
            )
        ) {
            moveTo(8.5f, 2f)
            curveTo(6.567f, 2f, 5f, 3.567f, 5f, 5.5f)
            verticalLineTo(21f)
            horizontalLineToRelative(22f)
            verticalLineTo(5.5f)
            curveTo(27f, 3.567f, 25.433f, 2f, 23.5f, 2f)
            horizontalLineToRelative(-15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(12.8536f, 15.7976f),
                end = Offset(14.7921f, 21.9883f)
            )
        ) {
            moveTo(10f, 21f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            horizontalLineTo(10f)
            close()
            moveToRelative(10f, -11f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-0.499999f, 0.0195114f),
                end = Offset(27.7733f, 29.1844f)
            )
        ) {
            moveTo(23.5f, 30f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(20f)
            horizontalLineTo(5f)
            verticalLineToRelative(6.5f)
            curveTo(5f, 28.433f, 6.567f, 30f, 8.5f, 30f)
            horizontalLineToRelative(15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.618682f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(16f, 10.8333f),
                end = Offset(18.2674f, 34.7342f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(23.5f, 30f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(20f)
            horizontalLineTo(5f)
            verticalLineToRelative(6.5f)
            curveTo(5f, 28.433f, 6.567f, 30f, 8.5f, 30f)
            horizontalLineToRelative(15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(11.6923f, 24.1538f),
                end = Offset(11.9371f, 28.3061f)
            )
        ) {
            moveTo(10f, 24f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(10f)
            close()
        }
    }.build()
}

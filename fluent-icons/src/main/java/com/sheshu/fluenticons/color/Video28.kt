package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Video28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Video28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.0810009f to Color(0xFFF08AF4),
                    0.393858f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(20.0909f, 3.93421f),
                radius = 21.518f
            )
        ) {
            moveTo(13.5f, 14f)
            lineToRelative(9.844f, -6.694f)
            curveTo(24.473f, 6.539f, 26f, 7.347f, 26f, 8.712f)
            verticalLineToRelative(10.576f)
            curveToRelative(0f, 1.365f, -1.527f, 2.173f, -2.656f, 1.406f)
            lineTo(13.5f, 14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                start = Offset(16.6111f, 14f),
                end = Offset(25.991f, 13.7087f)
            ),
            fillAlpha = 0.75f
        ) {
            moveTo(13.5f, 14f)
            lineToRelative(9.844f, -6.694f)
            curveTo(24.473f, 6.539f, 26f, 7.347f, 26f, 8.712f)
            verticalLineToRelative(10.576f)
            curveToRelative(0f, 1.365f, -1.527f, 2.173f, -2.656f, 1.406f)
            lineTo(13.5f, 14f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.341244f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(-0.908657f, 6.66657f),
                radius = 25.0124f
            )
        ) {
            moveTo(2f, 9.75f)
            curveTo(2f, 7.679f, 3.679f, 6f, 5.75f, 6f)
            horizontalLineToRelative(8.5f)
            curveTo(16.321f, 6f, 18f, 7.679f, 18f, 9.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(3.679f, 22f, 2f, 20.321f, 2f, 18.25f)
            verticalLineToRelative(-8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3B148A),
                    1f to Color(0xFF4B20A0)
                ),
                start = Offset(4.77278f, 16f),
                end = Offset(6.00968f, 21.4065f)
            ),
            fillAlpha = 0.5f,
            strokeAlpha = 0.5f
        ) {
            moveTo(5f, 18f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
        }
        path(fill = SolidColor(Color(0xFFBABAFF))) {
            moveTo(7f, 17f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(7f)
            close()
            moveToRelative(6f, 2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}

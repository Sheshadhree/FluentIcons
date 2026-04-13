package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Video20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Video20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.0810009f to Color(0xFFF08AF4),
                    0.341244f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(13.9998f, 4f),
                radius = 12.3693f
            )
        ) {
            moveTo(16.04f, 14.777f)
            lineToRelative(-2.038f, -1.406f)
            lineTo(9.2f, 9.8f)
            lineTo(13.4f, 7f)
            lineToRelative(2.64f, -1.776f)
            curveTo(16.868f, 4.65f, 18f, 5.244f, 18f, 6.252f)
            verticalLineToRelative(7.497f)
            curveToRelative(0f, 1.007f, -1.131f, 1.601f, -1.96f, 1.028f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                start = Offset(11.6444f, 10.0005f),
                end = Offset(17.9909f, 9.76178f)
            ),
            fillAlpha = 0.75f
        ) {
            moveTo(16.04f, 14.777f)
            lineToRelative(-2.038f, -1.406f)
            lineTo(9.2f, 9.8f)
            lineTo(13.4f, 7f)
            lineToRelative(2.64f, -1.776f)
            curveTo(16.868f, 4.65f, 18f, 5.244f, 18f, 6.252f)
            verticalLineToRelative(7.497f)
            curveToRelative(0f, 1.007f, -1.131f, 1.601f, -1.96f, 1.028f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.341244f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(7.30063E-7f, 4.5f),
                radius = 17.9321f
            )
        ) {
            moveTo(2f, 7f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(5.001f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(6.001f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.658f, 0f, -3.001f, -1.343f, -3.001f, -3f)
            verticalLineToRelative(-6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3B148A),
                    1f to Color(0xFF4B20A0)
                ),
                start = Offset(2.7955f, 9.99995f),
                end = Offset(4.15398f, 15.3441f)
            ),
            fillAlpha = 0.5f,
            strokeAlpha = 0.5f
        ) {
            moveTo(3f, 12f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
        }
        path(fill = SolidColor(Color(0xFFBABAFF))) {
            moveTo(5f, 11f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            close()
            moveToRelative(5f, 2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}

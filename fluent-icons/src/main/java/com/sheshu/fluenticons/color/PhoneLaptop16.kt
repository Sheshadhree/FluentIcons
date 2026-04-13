package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PhoneLaptop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PhoneLaptop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.265311f to Color(0xFF9C6CFE),
                    0.452566f to Color(0xFF4E44DB)
                ),
                center = Offset(0.75f, 7.5f),
                radius = 29.931f
            )
        ) {
            moveTo(5.5f, 10f)
            lineTo(9f, 9.5f)
            lineToRelative(3.5f, 0.5f)
            horizontalLineToRelative(0.264f)
            curveToRelative(0.155f, 0f, 0.308f, 0.036f, 0.447f, 0.106f)
            lineToRelative(1.342f, 0.67f)
            curveTo(14.827f, 10.913f, 15f, 11.194f, 15f, 11.5f)
            horizontalLineTo(3f)
            curveToRelative(0f, -0.306f, 0.173f, -0.587f, 0.447f, -0.724f)
            lineToRelative(1.342f, -0.67f)
            curveTo(4.928f, 10.036f, 5.08f, 10f, 5.236f, 10f)
            horizontalLineTo(5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(15f, 11.9762f),
                end = Offset(13.9513f, 7.25686f)
            )
        ) {
            moveTo(5.5f, 10f)
            lineTo(9f, 9.5f)
            lineToRelative(3.5f, 0.5f)
            horizontalLineToRelative(0.264f)
            curveToRelative(0.155f, 0f, 0.308f, 0.036f, 0.447f, 0.106f)
            lineToRelative(1.342f, 0.67f)
            curveTo(14.827f, 10.913f, 15f, 11.194f, 15f, 11.5f)
            horizontalLineTo(3f)
            curveToRelative(0f, -0.306f, 0.173f, -0.587f, 0.447f, -0.724f)
            lineToRelative(1.342f, -0.67f)
            curveTo(4.928f, 10.036f, 5.08f, 10f, 5.236f, 10f)
            horizontalLineTo(5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFFAAB3BD)
                ),
                start = Offset(15f, 11.9286f),
                end = Offset(14.8463f, 10.0842f)
            )
        ) {
            moveTo(3.5f, 11f)
            curveTo(3.224f, 11f, 3f, 11.224f, 3f, 11.5f)
            reflectiveCurveTo(3.224f, 12f, 3.5f, 12f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 11f, 14.5f, 11f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(4f, 4.5f)
            curveTo(4f, 3.672f, 4.672f, 3f, 5.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(13.328f, 3f, 14f, 3.672f, 14f, 4.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(4.672f, 10f, 4f, 9.328f, 4f, 8.5f)
            verticalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.148148f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(6f, 9.5f),
                radius = 2.5f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(5.5f, 3f)
            curveTo(4.672f, 3f, 4f, 3.672f, 4f, 4.5f)
            verticalLineToRelative(4f)
            curveTo(4f, 9.328f, 4.672f, 10f, 5.5f, 10f)
            horizontalLineTo(5.236f)
            curveToRelative(-0.155f, 0f, -0.308f, 0.036f, -0.447f, 0.106f)
            lineToRelative(-1.342f, 0.67f)
            curveTo(3.173f, 10.913f, 3f, 11.194f, 3f, 11.5f)
            curveTo(3f, 11.776f, 3.224f, 12f, 3.5f, 12f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -0.306f, -0.173f, -0.587f, -0.447f, -0.724f)
            lineToRelative(-1.342f, -0.67f)
            curveTo(13.072f, 10.036f, 12.92f, 10f, 12.764f, 10f)
            horizontalLineTo(12.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveTo(14f, 3.672f, 13.328f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535356f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(-0.5f, 1.90625f),
                radius = 14.9101f
            )
        ) {
            moveTo(2.5f, 5f)
            curveTo(1.672f, 5f, 1f, 5.672f, 1f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(1f, 13.328f, 1.672f, 14f, 2.5f, 14f)
            horizontalLineToRelative(3f)
            curveTo(6.328f, 14f, 7f, 13.328f, 7f, 12.5f)
            verticalLineToRelative(-6f)
            curveTo(7f, 5.672f, 6.328f, 5f, 5.5f, 5f)
            horizontalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFDECBFF),
                    1f to Color(0xFFD6CFFF)
                ),
                center = Offset(3.34375f, 11.5667f),
                radius = 2.59661f
            )
        ) {
            moveTo(4f, 12.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            close()
        }
    }.build()
}

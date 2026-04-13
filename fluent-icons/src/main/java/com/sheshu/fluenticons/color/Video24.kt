package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Video24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Video24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.0810009f to Color(0xFFF08AF4),
                    0.393858f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(17f, 2.99989f),
                radius = 19.1638f
            )
        ) {
            moveTo(11f, 12f)
            lineToRelative(8.255f, -5.704f)
            curveTo(20.416f, 5.494f, 22f, 6.326f, 22f, 7.736f)
            verticalLineToRelative(8.528f)
            curveToRelative(0f, 1.41f, -1.584f, 2.242f, -2.745f, 1.44f)
            lineTo(11f, 12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                start = Offset(14.0556f, 11.9999f),
                end = Offset(21.9931f, 11.7666f)
            ),
            fillAlpha = 0.75f
        ) {
            moveTo(11f, 12f)
            lineToRelative(8.255f, -5.704f)
            curveTo(20.416f, 5.494f, 22f, 6.326f, 22f, 7.736f)
            verticalLineToRelative(8.528f)
            curveToRelative(0f, 1.41f, -1.584f, 2.242f, -2.745f, 1.44f)
            lineTo(11f, 12f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.341244f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(-0.363284f, 5.58325f),
                radius = 21.0535f
            )
        ) {
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineToRelative(6.5f)
            curveTo(13.545f, 5f, 15f, 6.455f, 15f, 8.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-6.5f)
            curveTo(3.455f, 19f, 2f, 17.545f, 2f, 15.75f)
            verticalLineToRelative(-7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3B148A),
                    1f to Color(0xFF4B20A0)
                ),
                start = Offset(3.7955f, 13f),
                end = Offset(5.15398f, 18.3441f)
            ),
            fillAlpha = 0.5f,
            strokeAlpha = 0.5f
        ) {
            moveTo(4f, 15f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
        }
        path(fill = SolidColor(Color(0xFFBABAFF))) {
            moveTo(6f, 14f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
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

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Database32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Database32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(10.1937f, 1.81855f),
                end = Offset(22.9849f, 27.5123f)
            )
        ) {
            moveTo(16f, 10.123f)
            curveToRelative(3.256f, 0f, 6.3f, -0.595f, 8.606f, -1.643f)
            curveTo(25.429f, 8.106f, 26.274f, 7.615f, 27f, 7f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 2.761f, -4.925f, 5f, -11f, 5f)
            reflectiveCurveTo(5f, 27.761f, 5f, 25f)
            verticalLineTo(7f)
            curveToRelative(0.726f, 0.615f, 1.571f, 1.106f, 2.394f, 1.48f)
            curveTo(9.7f, 9.528f, 12.744f, 10.123f, 16f, 10.123f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(19.4048f, 9.82454f),
                end = Offset(24.153f, 32.392f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(16f, 10.123f)
            curveToRelative(3.256f, 0f, 6.3f, -0.595f, 8.606f, -1.643f)
            curveTo(25.429f, 8.106f, 26.274f, 7.615f, 27f, 7f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 2.761f, -4.925f, 5f, -11f, 5f)
            reflectiveCurveTo(5f, 27.761f, 5f, 25f)
            verticalLineTo(7f)
            curveToRelative(0.726f, 0.615f, 1.571f, 1.106f, 2.394f, 1.48f)
            curveTo(9.7f, 9.528f, 12.744f, 10.123f, 16f, 10.123f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF58AAFE),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(35.25f, 17f),
                end = Offset(24.3033f, -4.91728f)
            )
        ) {
            moveTo(5f, 7f)
            curveToRelative(0f, -2.761f, 4.925f, -5f, 11f, -5f)
            reflectiveCurveToRelative(11f, 2.239f, 11f, 5f)
            reflectiveCurveToRelative(-4.925f, 5f, -11f, 5f)
            reflectiveCurveTo(5f, 9.761f, 5f, 7f)
            close()
        }
    }.build()
}

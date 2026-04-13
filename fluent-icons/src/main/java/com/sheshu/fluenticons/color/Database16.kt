package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Database16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Database16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(5.36077f, 0.909217f),
                end = Offset(12.1143f, 13.2418f)
            )
        ) {
            moveTo(3f, 12.5f)
            verticalLineToRelative(-9f)
            curveToRelative(1.057f, 0.926f, 2.864f, 1.513f, 5f, 1.513f)
            reflectiveCurveToRelative(3.943f, -0.587f, 5f, -1.513f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.425f, -2.149f, 2.5f, -5f, 2.5f)
            reflectiveCurveToRelative(-5f, -1.075f, -5f, -2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(9.54762f, 4.91223f),
                end = Offset(12.1361f, 16.0964f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(3f, 12.5f)
            verticalLineToRelative(-9f)
            curveToRelative(1.057f, 0.926f, 2.864f, 1.513f, 5f, 1.513f)
            reflectiveCurveToRelative(3.943f, -0.587f, 5f, -1.513f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.425f, -2.149f, 2.5f, -5f, 2.5f)
            reflectiveCurveToRelative(-5f, -1.075f, -5f, -2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF58AAFE),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(16.75f, 8.5f),
                end = Offset(10.9716f, -2.01767f)
            )
        ) {
            moveTo(13f, 3.5f)
            curveTo(13f, 4.88f, 10.761f, 6f, 8f, 6f)
            reflectiveCurveTo(3f, 4.88f, 3f, 3.5f)
            reflectiveCurveTo(5.239f, 1f, 8f, 1f)
            reflectiveCurveToRelative(5f, 1.12f, 5f, 2.5f)
            close()
        }
    }.build()
}

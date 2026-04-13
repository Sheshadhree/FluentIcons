package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Database20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Database20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(6.83292f, 2.21884f),
                end = Offset(14.1086f, 16.4543f)
            )
        ) {
            moveTo(14.69f, 6.016f)
            curveTo(15.16f, 5.78f, 15.617f, 5.482f, 16f, 5.12f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.657f, -2.686f, 3f, -6f, 3f)
            reflectiveCurveToRelative(-6f, -1.343f, -6f, -3f)
            verticalLineTo(5.12f)
            curveToRelative(0.383f, 0.362f, 0.84f, 0.661f, 1.31f, 0.896f)
            curveTo(6.562f, 6.642f, 8.222f, 7f, 10f, 7f)
            curveToRelative(1.778f, 0f, 3.438f, -0.358f, 4.69f, -0.984f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(11.8571f, 6.70208f),
                end = Offset(14.5807f, 19.3107f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(14.69f, 6.016f)
            curveTo(15.16f, 5.78f, 15.617f, 5.482f, 16f, 5.12f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.657f, -2.686f, 3f, -6f, 3f)
            reflectiveCurveToRelative(-6f, -1.343f, -6f, -3f)
            verticalLineTo(5.12f)
            curveToRelative(0.383f, 0.362f, 0.84f, 0.661f, 1.31f, 0.896f)
            curveTo(6.562f, 6.642f, 8.222f, 7f, 10f, 7f)
            curveToRelative(1.778f, 0f, 3.438f, -0.358f, 4.69f, -0.984f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF58AAFE),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(20.5f, 11f),
                end = Offset(13.5659f, -1.6212f)
            )
        ) {
            moveTo(10f, 8f)
            curveToRelative(3.314f, 0f, 6f, -1.343f, 6f, -3f)
            reflectiveCurveToRelative(-2.686f, -3f, -6f, -3f)
            reflectiveCurveToRelative(-6f, 1.343f, -6f, 3f)
            reflectiveCurveToRelative(2.686f, 3f, 6f, 3f)
            close()
        }
    }.build()
}

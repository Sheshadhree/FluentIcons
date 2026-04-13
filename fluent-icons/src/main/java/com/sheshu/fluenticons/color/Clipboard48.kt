package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Clipboard48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Clipboard48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(8f, 10.7f),
                end = Offset(37.2435f, 46.2664f)
            )
        ) {
            moveTo(8f, 11.5f)
            curveTo(8f, 9.015f, 10.015f, 7f, 12.5f, 7f)
            horizontalLineToRelative(23f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(28f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-23f)
            curveTo(10.015f, 44f, 8f, 41.985f, 8f, 39.5f)
            verticalLineToRelative(-28f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    0.970427f to Color(0x000A1852)
                ),
                center = Offset(24f, 4.94444f),
                radius = 12.6806f
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(8f, 11.5f)
            curveTo(8f, 9.015f, 10.015f, 7f, 12.5f, 7f)
            horizontalLineToRelative(23f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(28f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-23f)
            curveTo(10.015f, 44f, 8f, 41.985f, 8f, 39.5f)
            verticalLineToRelative(-28f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(24f, 8.8125f),
                radius = 5.6875f
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(8f, 11.5f)
            curveTo(8f, 9.015f, 10.015f, 7f, 12.5f, 7f)
            horizontalLineToRelative(23f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(28f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-23f)
            curveTo(10.015f, 44f, 8f, 41.985f, 8f, 39.5f)
            verticalLineToRelative(-28f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    1f to Color(0xFFFAB500)
                ),
                start = Offset(24f, 4f),
                end = Offset(24f, 12.5f)
            )
        ) {
            moveTo(16f, 8.25f)
            curveTo(16f, 5.903f, 17.903f, 4f, 20.25f, 4f)
            horizontalLineToRelative(7.5f)
            curveTo(30.097f, 4f, 32f, 5.903f, 32f, 8.25f)
            reflectiveCurveToRelative(-1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-2.347f, 0f, -4.25f, -1.903f, -4.25f, -4.25f)
            close()
        }
    }.build()
}

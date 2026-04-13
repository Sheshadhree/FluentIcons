package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Clipboard32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Clipboard32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(5f, 6.6f),
                end = Offset(25.6318f, 31.1498f)
            )
        ) {
            moveTo(5f, 7.5f)
            curveTo(5f, 5.567f, 6.567f, 4f, 8.5f, 4f)
            horizontalLineToRelative(15f)
            curveTo(25.433f, 4f, 27f, 5.567f, 27f, 7.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 30f, 5f, 28.433f, 5f, 26.5f)
            verticalLineToRelative(-19f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    0.970427f to Color(0x000A1852)
                ),
                center = Offset(16f, 2.55556f),
                radius = 8.91066f
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(5f, 7.5f)
            curveTo(5f, 5.567f, 6.567f, 4f, 8.5f, 4f)
            horizontalLineToRelative(15f)
            curveTo(25.433f, 4f, 27f, 5.567f, 27f, 7.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 30f, 5f, 28.433f, 5f, 26.5f)
            verticalLineToRelative(-19f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(16f, 5.27365f),
                radius = 3.99662f
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(5f, 7.5f)
            curveTo(5f, 5.567f, 6.567f, 4f, 8.5f, 4f)
            horizontalLineToRelative(15f)
            curveTo(25.433f, 4f, 27f, 5.567f, 27f, 7.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 30f, 5f, 28.433f, 5f, 26.5f)
            verticalLineToRelative(-19f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    1f to Color(0xFFFAB500)
                ),
                start = Offset(16f, 2f),
                end = Offset(16f, 8f)
            )
        ) {
            moveTo(10f, 5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            close()
        }
    }.build()
}

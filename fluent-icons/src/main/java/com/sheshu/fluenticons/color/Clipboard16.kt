package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Clipboard16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Clipboard16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(3f, 3.3f),
                end = Offset(13.44f, 14.5933f)
            )
        ) {
            moveTo(3f, 3.5f)
            curveTo(3f, 2.672f, 3.672f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 2f, 13f, 2.672f, 13f, 3.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 15f, 3f, 14.328f, 3f, 13.5f)
            verticalLineToRelative(-10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(8f, 1.27778f),
                radius = 4.16204f
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(3f, 3.5f)
            curveTo(3f, 2.672f, 3.672f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 2f, 13f, 2.672f, 13f, 3.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 15f, 3f, 14.328f, 3f, 13.5f)
            verticalLineToRelative(-10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(8f, 2.69048f),
                radius = 2.02381f
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(3f, 3.5f)
            curveTo(3f, 2.672f, 3.672f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 2f, 13f, 2.672f, 13f, 3.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 15f, 3f, 14.328f, 3f, 13.5f)
            verticalLineToRelative(-10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    1f to Color(0xFFFAB500)
                ),
                start = Offset(8f, 1f),
                end = Offset(8f, 4f)
            )
        ) {
            moveTo(5f, 2.5f)
            curveTo(5f, 3.328f, 5.672f, 4f, 6.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(10.328f, 4f, 11f, 3.328f, 11f, 2.5f)
            reflectiveCurveTo(10.328f, 1f, 9.5f, 1f)
            horizontalLineToRelative(-3f)
            curveTo(5.672f, 1f, 5f, 1.672f, 5f, 2.5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Clipboard24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Clipboard24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(4f, 5.8f),
                end = Offset(18.1463f, 23.4829f)
            )
        ) {
            moveTo(4f, 6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            horizontalLineToRelative(11.5f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    0.9f to Color(0x000A1852)
                ),
                center = Offset(12f, 3f),
                radius = 6.16892f
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(4f, 6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            horizontalLineToRelative(11.5f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(12f, 4.61779f),
                radius = 2.79325f
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(4f, 6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            horizontalLineToRelative(11.5f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    1f to Color(0xFFFAB500)
                ),
                start = Offset(12f, 2f),
                end = Offset(12f, 6.5f)
            )
        ) {
            moveTo(8f, 4.25f)
            curveTo(8f, 5.493f, 9.007f, 6.5f, 10.25f, 6.5f)
            horizontalLineToRelative(3.5f)
            curveTo(14.993f, 6.5f, 16f, 5.493f, 16f, 4.25f)
            reflectiveCurveTo(14.993f, 2f, 13.75f, 2f)
            horizontalLineToRelative(-3.5f)
            curveTo(9.007f, 2f, 8f, 3.007f, 8f, 4.25f)
            close()
        }
    }.build()
}

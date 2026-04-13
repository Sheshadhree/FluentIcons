package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Clipboard28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Clipboard28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(5f, 6.2f),
                end = Offset(22.5493f, 26.3917f)
            )
        ) {
            moveTo(5f, 6.75f)
            curveTo(5f, 5.231f, 6.231f, 4f, 7.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(21.769f, 4f, 23f, 5.231f, 23f, 6.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(7.75f)
            curveTo(6.231f, 26f, 5f, 24.769f, 5f, 23.25f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    0.970427f to Color(0x000A1852)
                ),
                center = Offset(14f, 2.77778f),
                radius = 7.53979f
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(5f, 6.75f)
            curveTo(5f, 5.231f, 6.231f, 4f, 7.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(21.769f, 4f, 23f, 5.231f, 23f, 6.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(7.75f)
            curveTo(6.231f, 26f, 5f, 24.769f, 5f, 23.25f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(14f, 5.0777f),
                radius = 3.38176f
            ),
            fillAlpha = 0.4f
        ) {
            moveTo(5f, 6.75f)
            curveTo(5f, 5.231f, 6.231f, 4f, 7.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(21.769f, 4f, 23f, 5.231f, 23f, 6.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(7.75f)
            curveTo(6.231f, 26f, 5f, 24.769f, 5f, 23.25f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    1f to Color(0xFFFAB500)
                ),
                start = Offset(14f, 2f),
                end = Offset(14f, 7f)
            )
        ) {
            moveTo(9.5f, 4.5f)
            curveTo(9.5f, 3.12f, 10.62f, 2f, 12f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(17.38f, 7f, 16f, 7f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
        }
    }.build()
}

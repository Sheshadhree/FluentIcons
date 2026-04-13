package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BookOpen28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BookOpen28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(6.48535f, 7.74211f),
                end = Offset(10.2342f, 29.0627f)
            )
        ) {
            moveTo(14f, 5.5f)
            curveTo(13.365f, 4.852f, 12.48f, 4f, 11.5f, 4f)
            horizontalLineTo(4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.98f, 0f, 1.865f, -0.402f, 2.5f, -1.05f)
            lineTo(15f, 14f)
            lineToRelative(-1f, -8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(21.5146f, 7.74211f),
                end = Offset(17.7658f, 29.0627f)
            )
        ) {
            moveTo(14f, 5.5f)
            curveTo(14.635f, 4.852f, 15.52f, 4f, 16.5f, 4f)
            horizontalLineTo(24f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-0.98f, 0f, -1.865f, -0.402f, -2.5f, -1.05f)
            lineTo(13f, 14f)
            lineToRelative(1f, -8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB6EFFF),
                    0.851323f to Color(0xFF58AAFE)
                ),
                start = Offset(2f, 3.28846f),
                end = Offset(33.6938f, 17.5238f)
            )
        ) {
            moveTo(3.5f, 4.5f)
            curveTo(3.5f, 4.224f, 3.724f, 4f, 4f, 4f)
            horizontalLineToRelative(8.5f)
            curveTo(13.328f, 4f, 14f, 4.672f, 14f, 5.5f)
            lineToRelative(0.5f, 4.5f)
            lineTo(14f, 20.5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.12337f to Color(0xFF9DEAFF),
                    0.61551f to Color(0xFF4894FE)
                ),
                start = Offset(23.8438f, 5.15625f),
                end = Offset(-0.602969f, 10.1575f)
            )
        ) {
            moveTo(24.5f, 4.5f)
            curveTo(24.5f, 4.224f, 24.276f, 4f, 24f, 4f)
            horizontalLineToRelative(-8.5f)
            curveTo(14.672f, 4f, 14f, 4.672f, 14f, 5.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(4.5f)
            close()
        }
    }.build()
}

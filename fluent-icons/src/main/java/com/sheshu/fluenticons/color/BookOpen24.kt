package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BookOpen24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BookOpen24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    0.908213f to Color(0xFF2052CB)
                ),
                start = Offset(3.875f, 4.57143f),
                end = Offset(7.28894f, 24.1569f)
            )
        ) {
            moveTo(2f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(0.768f, 0f, 2f, 1f, 2f, 2f)
            lineToRelative(1f, 6.5f)
            lineToRelative(-1f, 6.736f)
            curveTo(11.47f, 19.711f, 10.768f, 20f, 10f, 20f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    0.908213f to Color(0xFF2052CB)
                ),
                start = Offset(20.125f, 4.57143f),
                end = Offset(16.7111f, 24.1569f)
            )
        ) {
            moveTo(22f, 6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.768f, 0f, -2f, 1f, -2f, 2f)
            lineToRelative(-1f, 6.5f)
            lineToRelative(1f, 6.736f)
            curveTo(12.53f, 19.711f, 13.232f, 20f, 14f, 20f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB6EFFF),
                    0.851323f to Color(0xFF58AAFE)
                ),
                start = Offset(2.28571f, 3.44231f),
                end = Offset(27.6583f, 15.2127f)
            )
        ) {
            moveTo(3.5f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveTo(11.328f, 4f, 12f, 4.672f, 12f, 5.5f)
            lineToRelative(0.555f, 5.5f)
            lineTo(12f, 16.5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.12337f to Color(0xFF9DEAFF),
                    0.61551f to Color(0xFF4894FE)
                ),
                start = Offset(19.9688f, 4.90625f),
                end = Offset(0.23148f, 9.07664f)
            )
        ) {
            moveTo(20.5f, 5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-6f)
            curveTo(12.672f, 4f, 12f, 4.672f, 12f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}

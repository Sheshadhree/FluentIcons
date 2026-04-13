package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ListBar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ListBar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(4.925f, 1f),
                end = Offset(16.9529f, 16.2067f)
            )
        ) {
            moveTo(15.5f, 7f)
            horizontalLineTo(7f)
            lineTo(6.5f, 5f)
            lineTo(7f, 3f)
            horizontalLineToRelative(8.5f)
            curveTo(16.328f, 3f, 17f, 3.672f, 17f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(17f, 6.328f, 16.328f, 7f, 15.5f, 7f)
            close()
            moveTo(7f, 12f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveTo(17f, 8.672f, 16.328f, 8f, 15.5f, 8f)
            horizontalLineTo(7f)
            lineToRelative(-0.5f, 2f)
            lineTo(7f, 12f)
            close()
            moveToRelative(0f, 5f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(7f)
            lineToRelative(-0.5f, 2f)
            lineTo(7f, 17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(3.95122f, 4.8611f),
                end = Offset(9.94077f, 7.59366f)
            )
        ) {
            moveTo(7f, 7f)
            verticalLineTo(3f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 6.328f, 3.672f, 7f, 4.5f, 7f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, 1f)
            verticalLineToRelative(4f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 12f, 3f, 11.328f, 3f, 10.5f)
            verticalLineToRelative(-1f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, 5f)
            verticalLineToRelative(4f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 17f, 3f, 16.328f, 3f, 15.5f)
            verticalLineToRelative(-1f)
            curveTo(3f, 13.672f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

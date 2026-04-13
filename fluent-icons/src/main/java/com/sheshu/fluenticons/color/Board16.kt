package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Board16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Board16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF52D17C)
                ),
                start = Offset(4.66667f, 7.18182f),
                end = Offset(8.32709f, 15.7771f)
            )
        ) {
            moveTo(14f, 10f)
            lineToRelative(-3f, -1f)
            lineToRelative(-3f, 1f)
            lineToRelative(-1f, 2f)
            lineToRelative(1f, 2f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF309C61)
                ),
                start = Offset(8.4f, 2.88889f),
                end = Offset(13.0773f, 9.10313f)
            )
        ) {
            moveTo(8f, 2f)
            lineTo(7f, 6f)
            lineToRelative(1f, 4f)
            horizontalLineToRelative(6f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineTo(8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(2.85714f, 6.42105f),
                end = Offset(8.01026f, 11.1738f)
            )
        ) {
            moveTo(8f, 14f)
            verticalLineTo(6f)
            lineTo(5f, 5f)
            lineTo(2f, 6f)
            verticalLineToRelative(5.5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineTo(8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF64DE89)
                ),
                start = Offset(2.85714f, 2.8f),
                end = Offset(4.43324f, 6.88096f)
            )
        ) {
            moveTo(8f, 2f)
            verticalLineToRelative(4f)
            horizontalLineTo(2f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}

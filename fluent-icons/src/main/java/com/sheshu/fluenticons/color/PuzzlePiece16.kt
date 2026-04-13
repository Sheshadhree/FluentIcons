package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PuzzlePiece16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PuzzlePiece16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4.00001f, 0.222222f),
                end = Offset(11.6985f, 14.8861f)
            )
        ) {
            moveTo(9f, 1f)
            curveTo(7.894f, 1f, 7f, 1.895f, 7f, 3f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 3f, 4f, 3.672f, 4f, 4.5f)
            verticalLineTo(6f)
            curveTo(2.896f, 6f, 2f, 6.896f, 2f, 8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 12.33f, 4.672f, 13f, 5.5f, 13f)
            horizontalLineTo(7f)
            curveToRelative(0f, 1.105f, 0.896f, 2f, 2f, 2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.829f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.552f, 0f, -1f, -0.447f, -1f, -1f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.672f, 13.328f, 3f, 12.5f, 3f)
            horizontalLineTo(11f)
            curveToRelative(0f, -1.104f, -0.896f, -2f, -2f, -2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(9.85719f, 2.7193f),
                end = Offset(13.0493f, 16.3146f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(9f, 1f)
            curveTo(7.894f, 1f, 7f, 1.895f, 7f, 3f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 3f, 4f, 3.672f, 4f, 4.5f)
            verticalLineTo(6f)
            curveTo(2.896f, 6f, 2f, 6.896f, 2f, 8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 12.33f, 4.672f, 13f, 5.5f, 13f)
            horizontalLineTo(7f)
            curveToRelative(0f, 1.105f, 0.896f, 2f, 2f, 2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.829f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.552f, 0f, -1f, -0.447f, -1f, -1f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.672f, 13.328f, 3f, 12.5f, 3f)
            horizontalLineTo(11f)
            curveToRelative(0f, -1.104f, -0.896f, -2f, -2f, -2f)
            close()
        }
    }.build()
}

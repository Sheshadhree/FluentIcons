package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Table16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Table16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF98F0B0)
                ),
                start = Offset(2.85714f, 2.85714f),
                end = Offset(13.1429f, 13.1429f)
            )
        ) {
            moveTo(5f, 2f)
            horizontalLineToRelative(6f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
            verticalLineToRelative(6f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
            horizontalLineTo(5f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
            verticalLineTo(5f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(2f, 2f),
                end = Offset(14f, 14f)
            )
        ) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(3f)
            verticalLineTo(2f)
            horizontalLineTo(4.5f)
            close()
            moveTo(6f, 2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            close()
            moveTo(5f, 6f)
            horizontalLineTo(2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            verticalLineTo(6f)
            close()
            moveToRelative(1f, 4f)
            verticalLineTo(6f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(6f)
            close()
            moveToRelative(-1f, 1f)
            horizontalLineTo(2f)
            verticalLineToRelative(0.5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineTo(5f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(1f, 3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(5f, 0f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(11f)
            close()
            moveToRelative(3f, -8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-3f)
            verticalLineTo(6f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(0f, -1f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineTo(11f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}

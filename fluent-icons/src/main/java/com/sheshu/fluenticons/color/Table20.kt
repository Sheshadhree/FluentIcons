package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Table20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Table20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF98F0B0)
                ),
                start = Offset(4f, 4f),
                end = Offset(16f, 16f)
            )
        ) {
            moveTo(6.5f, 3f)
            horizontalLineToRelative(7f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 6.5f)
            verticalLineToRelative(7f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, 3.5f)
            horizontalLineToRelative(-7f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13.5f)
            verticalLineToRelative(-7f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(3f, 3f),
                end = Offset(17f, 17f)
            )
        ) {
            moveTo(13f, 17f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(0f, -5f)
            verticalLineTo(8f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(-1f, 0f)
            horizontalLineTo(8f)
            verticalLineTo(8f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(-4f, 1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineToRelative(-4f)
            close()
            moveToRelative(-1f, -1f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-4f, 1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineTo(13f)
            close()
            moveToRelative(10f, -6f)
            horizontalLineToRelative(4f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineTo(13f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(-1f, -4f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineTo(3f)
            horizontalLineToRelative(4f)
            close()
            moveTo(7f, 3f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

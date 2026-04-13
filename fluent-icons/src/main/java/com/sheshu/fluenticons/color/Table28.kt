package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Table28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Table28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF98F0B0)
                ),
                start = Offset(4.57143f, 4.57143f),
                end = Offset(23.4286f, 23.4286f)
            )
        ) {
            moveTo(8f, 3f)
            horizontalLineToRelative(12f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
            verticalLineToRelative(12f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
            horizontalLineTo(8f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
            verticalLineTo(8f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(3f, 3f),
                end = Offset(25f, 25f)
            )
        ) {
            moveTo(3f, 6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(6.5f)
            horizontalLineTo(3f)
            verticalLineTo(6.75f)
            close()
            moveTo(3f, 11f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(-6f)
            horizontalLineTo(3f)
            close()
            moveToRelative(0f, 7.5f)
            verticalLineToRelative(2.75f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(3f)
            close()
            moveToRelative(8f, 6.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(-6f)
            verticalLineTo(25f)
            close()
            moveToRelative(7.5f, 0f)
            horizontalLineToRelative(2.75f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(18.5f)
            horizontalLineToRelative(-6.5f)
            verticalLineTo(25f)
            close()
            moveToRelative(6.5f, -8f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-6.5f)
            verticalLineToRelative(6f)
            horizontalLineTo(25f)
            close()
            moveToRelative(0f, -7.5f)
            verticalLineTo(6.75f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineTo(18.5f)
            verticalLineToRelative(6.5f)
            horizontalLineTo(25f)
            close()
            moveTo(17f, 3f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(6.5f)
            horizontalLineToRelative(6f)
            verticalLineTo(3f)
            close()
            moveToRelative(0f, 8f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(6f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Table48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Table48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF98F0B0)
                ),
                start = Offset(8.57143f, 8.57143f),
                end = Offset(39.4286f, 39.4286f)
            )
        ) {
            moveTo(14.5f, 6f)
            horizontalLineToRelative(19f)
            arcToRelative(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 8.5f)
            verticalLineToRelative(19f)
            arcToRelative(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.5f, 8.5f)
            horizontalLineToRelative(-19f)
            arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 33.5f)
            verticalLineToRelative(-19f)
            arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(6f, 6f),
                end = Offset(42f, 42f)
            )
        ) {
            moveTo(12.25f, 6f)
            curveTo(8.798f, 6f, 6f, 8.798f, 6f, 12.25f)
            verticalLineToRelative(4.25f)
            horizontalLineToRelative(10.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(-4.25f)
            close()
            moveTo(19f, 6f)
            verticalLineToRelative(10.5f)
            horizontalLineToRelative(10f)
            verticalLineTo(6f)
            horizontalLineTo(19f)
            close()
            moveToRelative(-2.5f, 13f)
            horizontalLineTo(6f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(10.5f)
            verticalLineTo(19f)
            close()
            moveTo(19f, 29f)
            verticalLineTo(19f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(10f)
            horizontalLineTo(19f)
            close()
            moveToRelative(-2.5f, 2.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(4.25f)
            curveTo(6f, 39.202f, 8.798f, 42f, 12.25f, 42f)
            horizontalLineToRelative(4.25f)
            verticalLineTo(31.5f)
            close()
            moveTo(19f, 42f)
            horizontalLineToRelative(10f)
            verticalLineTo(31.5f)
            horizontalLineTo(19f)
            verticalLineTo(42f)
            close()
            moveToRelative(12.5f, 0f)
            verticalLineTo(31.5f)
            horizontalLineTo(42f)
            verticalLineToRelative(4.25f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineTo(31.5f)
            close()
            moveTo(42f, 19f)
            verticalLineToRelative(10f)
            horizontalLineTo(31.5f)
            verticalLineTo(19f)
            horizontalLineTo(42f)
            close()
            moveToRelative(0f, -2.5f)
            verticalLineToRelative(-4.25f)
            curveTo(42f, 8.798f, 39.202f, 6f, 35.75f, 6f)
            horizontalLineTo(31.5f)
            verticalLineToRelative(10.5f)
            horizontalLineTo(42f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AppsList20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AppsList20",
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
                start = Offset(6.5f, 1f),
                end = Offset(17f, 17f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(9f)
            curveTo(8.448f, 5f, 8f, 4.552f, 8f, 4f)
            close()
            moveToRelative(0f, 6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(9f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(0f, 6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(9f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(2.95122f, 4.12697f),
                end = Offset(4.98976f, 17.1474f)
            )
        ) {
            moveTo(2f, 15.5f)
            curveTo(2f, 14.672f, 2.672f, 14f, 3.5f, 14f)
            horizontalLineToRelative(1f)
            curveTo(5.328f, 14f, 6f, 14.672f, 6f, 15.5f)
            verticalLineToRelative(1f)
            curveTo(6f, 17.328f, 5.328f, 18f, 4.5f, 18f)
            horizontalLineToRelative(-1f)
            curveTo(2.672f, 18f, 2f, 17.328f, 2f, 16.5f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(0f, -6f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(1f)
            curveTo(5.328f, 8f, 6f, 8.672f, 6f, 9.5f)
            verticalLineToRelative(1f)
            curveTo(6f, 11.328f, 5.328f, 12f, 4.5f, 12f)
            horizontalLineToRelative(-1f)
            curveTo(2.672f, 12f, 2f, 11.328f, 2f, 10.5f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(0f, -6f)
            curveTo(2f, 2.672f, 2.672f, 2f, 3.5f, 2f)
            horizontalLineToRelative(1f)
            curveTo(5.328f, 2f, 6f, 2.672f, 6f, 3.5f)
            verticalLineToRelative(1f)
            curveTo(6f, 5.328f, 5.328f, 6f, 4.5f, 6f)
            horizontalLineToRelative(-1f)
            curveTo(2.672f, 6f, 2f, 5.328f, 2f, 4.5f)
            verticalLineToRelative(-1f)
            close()
        }
    }.build()
}

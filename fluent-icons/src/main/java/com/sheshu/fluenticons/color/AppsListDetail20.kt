package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AppsListDetail20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AppsListDetail20",
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
                start = Offset(7.65f, 2.28571f),
                end = Offset(17.1f, 16f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-7f)
            curveTo(9.448f, 6f, 9f, 5.552f, 9f, 5f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-5f)
            curveTo(9.448f, 9f, 9f, 8.552f, 9f, 8f)
            close()
            moveToRelative(0f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(3.18902f, 5.59523f),
                end = Offset(5.73721f, 15.3605f)
            )
        ) {
            moveTo(3.5f, 4f)
            curveTo(2.672f, 4f, 2f, 4.672f, 2f, 5.5f)
            verticalLineToRelative(2f)
            curveTo(2f, 8.328f, 2.672f, 9f, 3.5f, 9f)
            horizontalLineToRelative(2f)
            curveTo(6.328f, 9f, 7f, 8.328f, 7f, 7.5f)
            verticalLineToRelative(-2f)
            curveTo(7f, 4.672f, 6.328f, 4f, 5.5f, 4f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(0f, 7f)
            curveTo(2.672f, 11f, 2f, 11.672f, 2f, 12.5f)
            verticalLineToRelative(2f)
            curveTo(2f, 15.328f, 2.672f, 16f, 3.5f, 16f)
            horizontalLineToRelative(2f)
            curveTo(6.328f, 16f, 7f, 15.328f, 7f, 14.5f)
            verticalLineToRelative(-2f)
            curveTo(7f, 11.672f, 6.328f, 11f, 5.5f, 11f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}

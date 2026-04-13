package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headset28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headset28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9CA5AD),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(10.25f, 22.8333f),
                end = Offset(8.3772f, 16.7716f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 20f)
            verticalLineToRelative(-1f)
            lineToRelative(1f, -1f)
            lineToRelative(1f, 1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(2f)
            horizontalLineTo(9f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF383B3D),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(16.25f, 25.25f),
                end = Offset(11.1675f, 22.2809f)
            )
        ) {
            moveTo(17f, 23f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(-1.42857f, 2f),
                end = Offset(1.07292f, 11.9217f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14f, 4f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            verticalLineToRelative(1.5f)
            lineToRelative(-1f, 1f)
            lineToRelative(-1f, -1f)
            verticalLineTo(11f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.03f, 9f, 9f)
            verticalLineToRelative(1.5f)
            lineToRelative(-1f, 1f)
            lineToRelative(-1f, -1f)
            verticalLineTo(11f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(20.375f, 11f),
                end = Offset(20.375f, 19f)
            )
        ) {
            moveTo(10.5f, 12f)
            horizontalLineTo(5f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            close()
            moveToRelative(7f, 0f)
            horizontalLineTo(23f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(21.5f, 12f),
                end = Offset(20.6177f, 18.887f)
            )
        ) {
            moveTo(7f, 12f)
            verticalLineToRelative(7f)
            horizontalLineTo(5f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(14f, 0f)
            verticalLineToRelative(6.95f)
            curveToRelative(1.141f, -0.232f, 2f, -1.24f, 2f, -2.45f)
            verticalLineTo(12f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}

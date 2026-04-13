package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headset16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headset16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9CA5AD),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(6.375f, 13f),
                end = Offset(5.67075f, 10.3407f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3f, 11f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-2f)
            curveTo(4.455f, 14.25f, 3f, 12.795f, 3f, 11f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF383B3D),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(9.125f, 14.625f),
                end = Offset(6.58376f, 13.1405f)
            )
        ) {
            moveTo(9.5f, 13.5f)
            curveTo(9.5f, 14.328f, 8.828f, 15f, 8f, 15f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveTo(7.172f, 12f, 8f, 12f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(1.09375f, 2.56486f),
                end = Offset(3.82032f, 8.39291f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8f, 2.5f)
            curveTo(6.067f, 2.5f, 4.5f, 4.067f, 4.5f, 6f)
            verticalLineToRelative(2f)
            horizontalLineTo(3f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-1.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(12.1667f, 7f),
                end = Offset(12.1667f, 11f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3f, 11f)
            verticalLineTo(7f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            close()
            moveToRelative(8.5f, -4f)
            horizontalLineTo(13f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(11.1875f, 7f),
                end = Offset(11.1875f, 11f)
            )
        ) {
            moveTo(6.25f, 11f)
            curveTo(6.664f, 11f, 7f, 10.664f, 7f, 10.25f)
            verticalLineToRelative(-2.5f)
            curveTo(7f, 7.336f, 6.664f, 7f, 6.25f, 7f)
            horizontalLineTo(4.5f)
            lineToRelative(-1f, 2f)
            lineToRelative(1f, 2f)
            horizontalLineToRelative(1.75f)
            close()
            moveToRelative(3.5f, -4f)
            curveTo(9.336f, 7f, 9f, 7.336f, 9f, 7.75f)
            verticalLineToRelative(2.5f)
            curveTo(9f, 10.664f, 9.336f, 11f, 9.75f, 11f)
            horizontalLineToRelative(1.75f)
            lineToRelative(1f, -2f)
            lineToRelative(-1f, -2f)
            horizontalLineTo(9.75f)
            close()
        }
    }.build()
}

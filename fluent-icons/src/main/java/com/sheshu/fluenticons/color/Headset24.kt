package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headset24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headset24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9CA5AD),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(8.91667f, 18.3333f),
                end = Offset(7.82145f, 14.8869f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 16f)
            lineToRelative(1f, -1f)
            lineToRelative(1f, 1f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
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
                start = Offset(13.6875f, 20.9375f),
                end = Offset(9.87565f, 18.7107f)
            )
        ) {
            moveTo(14.25f, 19.25f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            reflectiveCurveToRelative(-2.25f, -1.007f, -2.25f, -2.25f)
            reflectiveCurveTo(10.757f, 17f, 12f, 17f)
            reflectiveCurveToRelative(2.25f, 1.007f, 2.25f, 2.25f)
            close()
            moveTo(17f, 9f)
            verticalLineToRelative(1f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            reflectiveCurveTo(5f, 5.134f, 5f, 9f)
            verticalLineToRelative(1f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(16.25f, 10f),
                end = Offset(16.25f, 16f)
            )
        ) {
            moveTo(9f, 10f)
            horizontalLineTo(7f)
            lineToRelative(-1f, 3f)
            lineToRelative(1f, 3f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(6f, 6f)
            horizontalLineToRelative(2f)
            lineToRelative(1f, -3f)
            lineToRelative(-1f, -3f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(17.8333f, 10f),
                end = Offset(17.0028f, 15.8828f)
            )
        ) {
            moveTo(7f, 10f)
            horizontalLineTo(5f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-6f)
            close()
            moveToRelative(12f, 0f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}

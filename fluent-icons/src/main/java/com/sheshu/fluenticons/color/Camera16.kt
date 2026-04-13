package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Camera16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Camera16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535356f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(0.125f, 2.73333f),
                radius = 17.648f
            )
        ) {
            moveTo(5.276f, 2.83f)
            curveTo(5.531f, 2.32f, 6.05f, 2f, 6.618f, 2f)
            horizontalLineToRelative(2.764f)
            curveToRelative(0.568f, 0f, 1.088f, 0.321f, 1.342f, 0.83f)
            lineTo(11.309f, 4f)
            horizontalLineTo(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(0.691f)
            lineToRelative(0.585f, -1.17f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                center = Offset(9.5f, 9f),
                radius = 4.03113f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(5.276f, 2.83f)
            curveTo(5.531f, 2.32f, 6.05f, 2f, 6.618f, 2f)
            horizontalLineToRelative(2.764f)
            curveToRelative(0.568f, 0f, 1.088f, 0.321f, 1.342f, 0.83f)
            lineTo(11.309f, 4f)
            horizontalLineTo(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(0.691f)
            lineToRelative(0.585f, -1.17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFDECBFF)
                ),
                start = Offset(6.12866f, 5f),
                end = Offset(9.12866f, 12.125f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8f, 11f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveTo(9.657f, 5f, 8f, 5f)
            reflectiveCurveTo(5f, 6.343f, 5f, 8f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.242576f to Color(0xFF3BD5FF),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(5.33333f, 5f),
                radius = 5.67646f
            )
        ) {
            moveTo(10f, 8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveTo(6f, 9.105f, 6f, 8f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(2f, -1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}

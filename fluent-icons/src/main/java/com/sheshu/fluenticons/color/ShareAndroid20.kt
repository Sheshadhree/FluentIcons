package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ShareAndroid20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ShareAndroid20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(3.82324f, 5.3291f),
                end = Offset(7.04929f, 15.6435f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.165f, 5.33f)
            lineToRelative(0.67f, 1.34f)
            lineTo(7.178f, 10f)
            lineToRelative(7.659f, 3.83f)
            lineToRelative(-0.671f, 1.34f)
            lineTo(3.823f, 10f)
            lineToRelative(9.342f, -4.67f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(13.0002f, 14.1784f),
                radius = 3.08155f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.165f, 5.33f)
            lineToRelative(0.67f, 1.34f)
            lineTo(7.178f, 10f)
            lineToRelative(7.659f, 3.83f)
            lineToRelative(-0.671f, 1.34f)
            lineTo(3.823f, 10f)
            lineToRelative(9.342f, -4.67f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(5.54611f, 9.98801f),
                radius = 3.72703f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.165f, 5.33f)
            lineToRelative(0.67f, 1.34f)
            lineTo(7.178f, 10f)
            lineToRelative(7.659f, 3.83f)
            lineToRelative(-0.671f, 1.34f)
            lineTo(3.823f, 10f)
            lineToRelative(9.342f, -4.67f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(14.065f, 5.27379f),
                radius = 3.82039f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.165f, 5.33f)
            lineToRelative(0.67f, 1.34f)
            lineTo(7.178f, 10f)
            lineToRelative(7.659f, 3.83f)
            lineToRelative(-0.671f, 1.34f)
            lineTo(3.823f, 10f)
            lineToRelative(9.342f, -4.67f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.528807f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0078D4)
                ),
                center = Offset(8.97917f, 6.42708f),
                radius = 13.5213f
            )
        ) {
            moveTo(12f, 14.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            moveTo(8f, 10f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(3f, 11.38f, 3f, 10f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveTo(8f, 8.62f, 8f, 10f)
            close()
            moveToRelative(4f, -4.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
        }
    }.build()
}

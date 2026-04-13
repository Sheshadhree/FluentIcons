package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Camera24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Camera24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535356f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(-1.125f, 3.26667f),
                radius = 29.8616f
            )
        ) {
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineTo(7f)
            lineToRelative(1.332f, -1.998f)
            curveTo(8.75f, 2.376f, 9.452f, 2f, 10.204f, 2f)
            horizontalLineToRelative(3.592f)
            curveToRelative(0.752f, 0f, 1.455f, 0.376f, 1.872f, 1.002f)
            lineTo(17f, 5f)
            horizontalLineToRelative(1.75f)
            curveTo(20.545f, 5f, 22f, 6.455f, 22f, 8.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineToRelative(-9.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                center = Offset(14.5f, 14.0909f),
                radius = 6.92716f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(2f, 8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineTo(7f)
            lineToRelative(1.332f, -1.998f)
            curveTo(8.75f, 2.376f, 9.452f, 2f, 10.204f, 2f)
            horizontalLineToRelative(3.592f)
            curveToRelative(0.752f, 0f, 1.455f, 0.376f, 1.872f, 1.002f)
            lineTo(17f, 5f)
            horizontalLineToRelative(1.75f)
            curveTo(20.545f, 5f, 22f, 6.455f, 22f, 8.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineToRelative(-9.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFDECBFF)
                ),
                start = Offset(9.19299f, 8f),
                end = Offset(13.693f, 18.6875f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12f, 17f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(14.485f, 8f, 12f, 8f)
            reflectiveCurveToRelative(-4.5f, 2.015f, -4.5f, 4.5f)
            reflectiveCurveTo(9.515f, 17f, 12f, 17f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.242576f to Color(0xFF3BD5FF),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(8f, 8f),
                radius = 8.51469f
            )
        ) {
            moveTo(15f, 12.5f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(3.5f, -2.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(19.328f, 7f, 18.5f, 7f)
            reflectiveCurveTo(17f, 7.672f, 17f, 8.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.build()
}

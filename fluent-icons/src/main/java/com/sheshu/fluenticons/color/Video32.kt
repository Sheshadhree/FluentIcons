package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Video32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Video32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.0810009f to Color(0xFFF08AF4),
                    0.393858f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(22.6988f, 5.23446f),
                radius = 23.3026f
            )
        ) {
            moveTo(14.75f, 16f)
            lineToRelative(11.724f, -8.072f)
            curveTo(27.967f, 6.9f, 30f, 7.968f, 30f, 9.78f)
            verticalLineToRelative(12.438f)
            curveToRelative(0f, 1.812f, -2.033f, 2.881f, -3.526f, 1.853f)
            lineTo(14.75f, 16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                start = Offset(18.3991f, 16f),
                end = Offset(29.9851f, 15.5843f)
            ),
            fillAlpha = 0.75f
        ) {
            moveTo(14.75f, 16f)
            lineToRelative(11.724f, -8.072f)
            curveTo(27.967f, 6.9f, 30f, 7.968f, 30f, 9.78f)
            verticalLineToRelative(12.438f)
            curveToRelative(0f, 1.812f, -2.033f, 2.881f, -3.526f, 1.853f)
            lineTo(14.75f, 16f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.341244f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(-1.45403f, 6.83321f),
                radius = 30.4287f
            )
        ) {
            moveTo(2f, 10.5f)
            curveTo(2f, 8.015f, 4.015f, 6f, 6.5f, 6f)
            horizontalLineToRelative(10f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-10f)
            curveTo(4.015f, 26f, 2f, 23.985f, 2f, 21.5f)
            verticalLineToRelative(-11f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3B148A),
                    1f to Color(0xFF4B20A0)
                ),
                start = Offset(3.65917f, 16.9999f),
                end = Offset(6.13995f, 26.2944f)
            ),
            fillAlpha = 0.5f,
            strokeAlpha = 0.5f
        ) {
            moveTo(4f, 20.5f)
            curveTo(4f, 18.567f, 5.567f, 17f, 7.5f, 17f)
            horizontalLineToRelative(8f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveTo(17.433f, 24f, 15.5f, 24f)
            horizontalLineToRelative(-8f)
            curveTo(5.567f, 24f, 4f, 22.433f, 4f, 20.5f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFBABAFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.5f, 19f)
            curveTo(6.672f, 19f, 6f, 19.672f, 6f, 20.5f)
            reflectiveCurveTo(6.672f, 22f, 7.5f, 22f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(12.328f, 19f, 11.5f, 19f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(8f, 0f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.build()
}

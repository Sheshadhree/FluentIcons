package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LockShield20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LockShield20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC205),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(8f, 0.5f),
                end = Offset(14.0391f, 9.669f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10f, 3f)
            curveTo(8.895f, 3f, 8f, 3.895f, 8f, 5f)
            verticalLineToRelative(1.734f)
            horizontalLineTo(6.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(1.734f)
            horizontalLineTo(12f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(18f, 18.75f),
                end = Offset(5.46928f, 6.83752f)
            )
        ) {
            moveTo(6f, 6f)
            curveTo(4.343f, 6f, 3f, 7.343f, 3f, 9f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                center = Offset(10.5f, 13f),
                radius = 3.64005f
            )
        ) {
            moveTo(10f, 13f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    0.989901f to Color(0x00EB4824)
                ),
                center = Offset(14.5f, 15.5f),
                radius = 6.5f
            )
        ) {
            moveTo(6f, 6f)
            curveTo(4.343f, 6f, 3f, 7.343f, 3f, 9f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF62BE55),
                    1f to Color(0xFF1E794A)
                ),
                start = Offset(12.5f, 9f),
                end = Offset(20.018f, 17.7005f)
            )
        ) {
            moveTo(14f, 18.524f)
            curveToRelative(-1.175f, -0.603f, -2.97f, -1.945f, -3f, -4.524f)
            verticalLineToRelative(-2.563f)
            curveToRelative(0f, -0.276f, 0.225f, -0.496f, 0.499f, -0.535f)
            curveToRelative(1.37f, -0.193f, 2.485f, -1.134f, 3.066f, -1.725f)
            curveTo(14.68f, 9.059f, 14.84f, 9f, 15f, 9f)
            curveToRelative(0.16f, 0f, 0.32f, 0.059f, 0.435f, 0.177f)
            curveToRelative(0.58f, 0.591f, 1.696f, 1.532f, 3.066f, 1.725f)
            curveToRelative(0.274f, 0.039f, 0.499f, 0.26f, 0.499f, 0.536f)
            verticalLineTo(14f)
            curveToRelative(-0.03f, 2.579f, -1.825f, 3.921f, -3f, 4.524f)
            curveToRelative(-0.384f, 0.197f, -0.701f, 0.316f, -0.87f, 0.372f)
            curveToRelative(-0.043f, 0.015f, -0.086f, 0.022f, -0.13f, 0.022f)
            curveToRelative(-0.044f, 0f, -0.087f, -0.007f, -0.13f, -0.021f)
            curveToRelative(-0.17f, -0.057f, -0.486f, -0.177f, -0.87f, -0.374f)
            close()
        }
    }.build()
}

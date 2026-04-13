package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Video48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Video48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.0810009f to Color(0xFFF08AF4),
                    0.393858f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(33.6369f, 8.62064f),
                radius = 33.2683f
            )
        ) {
            moveTo(22.5f, 24f)
            lineToRelative(16.233f, -11.325f)
            curveToRelative(2.221f, -1.55f, 5.267f, 0.04f, 5.267f, 2.747f)
            verticalLineToRelative(17.156f)
            curveToRelative(0f, 2.708f, -3.046f, 4.297f, -5.267f, 2.747f)
            lineTo(22.5f, 24f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                start = Offset(27.5342f, 24f),
                end = Offset(43.9791f, 23.4137f)
            ),
            fillAlpha = 0.75f
        ) {
            moveTo(22.5f, 24f)
            lineToRelative(16.233f, -11.325f)
            curveToRelative(2.221f, -1.55f, 5.267f, 0.04f, 5.267f, 2.747f)
            verticalLineToRelative(17.156f)
            curveToRelative(0f, 2.708f, -3.046f, 4.297f, -5.267f, 2.747f)
            lineTo(22.5f, 24f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.341244f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(-0.908359f, 11.1665f),
                radius = 42.932f
            )
        ) {
            moveTo(4f, 16.25f)
            curveTo(4f, 12.798f, 6.798f, 10f, 10.25f, 10f)
            horizontalLineToRelative(14.5f)
            curveToRelative(3.452f, 0f, 6.25f, 2.798f, 6.25f, 6.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-14.5f)
            curveTo(6.798f, 38f, 4f, 35.202f, 4f, 31.75f)
            verticalLineToRelative(-15.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3B148A),
                    1f to Color(0xFF4B20A0)
                ),
                start = Offset(7.59101f, 25.9999f),
                end = Offset(10.308f, 36.6882f)
            ),
            fillAlpha = 0.5f,
            strokeAlpha = 0.5f
        ) {
            moveTo(8f, 30f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(10f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            horizontalLineTo(12f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            close()
        }
        path(fill = SolidColor(Color(0xFFBABAFF))) {
            moveTo(12.026f, 28f)
            curveTo(10.907f, 28f, 10f, 28.922f, 10f, 30.059f)
            reflectiveCurveToRelative(0.907f, 2.059f, 2.026f, 2.059f)
            horizontalLineToRelative(4.051f)
            curveToRelative(1.119f, 0f, 2.026f, -0.922f, 2.026f, -2.06f)
            curveToRelative(0f, -1.136f, -0.907f, -2.058f, -2.026f, -2.058f)
            horizontalLineToRelative(-4.051f)
            close()
            moveToRelative(9.948f, 4.118f)
            curveToRelative(1.12f, 0f, 2.026f, -0.922f, 2.026f, -2.06f)
            curveTo(24f, 28.923f, 23.093f, 28f, 21.974f, 28f)
            curveToRelative(-1.119f, 0f, -2.025f, 0.922f, -2.025f, 2.059f)
            reflectiveCurveToRelative(0.906f, 2.059f, 2.025f, 2.059f)
            close()
        }
    }.build()
}

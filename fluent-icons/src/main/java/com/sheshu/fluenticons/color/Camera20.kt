package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Camera20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Camera20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535356f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(-0.5f, 3f),
                radius = 23.7539f
            )
        ) {
            moveTo(6.779f, 2.826f)
            curveTo(7.034f, 2.32f, 7.552f, 2f, 8.119f, 2f)
            horizontalLineToRelative(3.764f)
            curveToRelative(0.569f, 0f, 1.088f, 0.321f, 1.342f, 0.83f)
            lineTo(13.81f, 4f)
            horizontalLineToRelative(1.69f)
            curveTo(16.88f, 4f, 18f, 5.118f, 18f, 6.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 17f, 2f, 15.88f, 2f, 14.5f)
            verticalLineToRelative(-8f)
            curveTo(2f, 5.118f, 3.12f, 4f, 4.5f, 4f)
            horizontalLineToRelative(1.69f)
            lineToRelative(0.589f, -1.174f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF312A9A),
                    1f to Color(0x00312A9A)
                ),
                center = Offset(12f, 11.2308f),
                radius = 5.79086f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(6.779f, 2.826f)
            curveTo(7.034f, 2.32f, 7.552f, 2f, 8.119f, 2f)
            horizontalLineToRelative(3.764f)
            curveToRelative(0.569f, 0f, 1.088f, 0.321f, 1.342f, 0.83f)
            lineTo(13.81f, 4f)
            horizontalLineToRelative(1.69f)
            curveTo(16.88f, 4f, 18f, 5.118f, 18f, 6.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 17f, 2f, 15.88f, 2f, 14.5f)
            verticalLineToRelative(-8f)
            curveTo(2f, 5.118f, 3.12f, 4f, 4.5f, 4f)
            horizontalLineToRelative(1.69f)
            lineToRelative(0.589f, -1.174f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFDECBFF)
                ),
                start = Offset(7.50024f, 6f),
                end = Offset(11.5002f, 15.5f)
            )
        ) {
            moveTo(13.995f, 10f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            curveToRelative(-2.209f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.791f, -4f, 4f, -4f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.242576f to Color(0xFF3BD5FF),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(6f, 5.5f),
                radius = 8.51469f
            )
        ) {
            moveTo(13f, 10f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(2f, -2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}

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

public val FluentIcons.Color.Pin48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Pin48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.449f to Color(0xFF7B7BFF),
                    1f to Color(0xFF102784)
                ),
                start = Offset(9.22097f, 38.7779f),
                end = Offset(19.5534f, 30.8764f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(18.884f, 30.884f)
            lineToRelative(-10.75f, 10.75f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(10.75f, -10.75f)
            lineToRelative(1.768f, 1.768f)
            close()
        }
        path(fill = SolidColor(Color(0xFFD9D9D9))) {
            moveTo(31.818f, 5.55f)
            lineTo(42.45f, 16.182f)
            curveToRelative(2.293f, 2.293f, 1.666f, 6.158f, -1.234f, 7.608f)
            lineToRelative(-10.545f, 5.272f)
            curveToRelative(-0.292f, 0.146f, -0.515f, 0.4f, -0.622f, 0.71f)
            lineToRelative(-2.684f, 7.77f)
            curveToRelative(-0.663f, 1.92f, -3.108f, 2.483f, -4.544f, 1.046f)
            lineTo(9.412f, 25.18f)
            curveToRelative(-1.436f, -1.436f, -0.873f, -3.88f, 1.047f, -4.543f)
            lineToRelative(7.77f, -2.685f)
            curveToRelative(0.308f, -0.106f, 0.563f, -0.33f, 0.71f, -0.622f)
            lineTo(24.21f, 6.784f)
            curveToRelative(1.45f, -2.9f, 5.314f, -3.527f, 7.607f, -1.234f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF1384B1)
                ),
                start = Offset(9.86394f, 10.7647f),
                end = Offset(34.1818f, 36.03f)
            )
        ) {
            moveTo(31.818f, 5.55f)
            lineTo(42.45f, 16.182f)
            curveToRelative(2.293f, 2.293f, 1.666f, 6.158f, -1.234f, 7.608f)
            lineToRelative(-10.545f, 5.272f)
            curveToRelative(-0.292f, 0.146f, -0.515f, 0.4f, -0.622f, 0.71f)
            lineToRelative(-2.684f, 7.77f)
            curveToRelative(-0.663f, 1.92f, -3.108f, 2.483f, -4.544f, 1.046f)
            lineTo(9.412f, 25.18f)
            curveToRelative(-1.436f, -1.436f, -0.873f, -3.88f, 1.047f, -4.543f)
            lineToRelative(7.77f, -2.685f)
            curveToRelative(0.308f, -0.106f, 0.563f, -0.33f, 0.71f, -0.622f)
            lineTo(24.21f, 6.784f)
            curveToRelative(1.45f, -2.9f, 5.314f, -3.527f, 7.607f, -1.234f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE362F8),
                    1f to Color(0x009966FF)
                ),
                center = Offset(35.8165f, 32.4362f),
                radius = 15.6635f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(31.818f, 5.55f)
            lineTo(42.45f, 16.182f)
            curveToRelative(2.293f, 2.293f, 1.666f, 6.158f, -1.234f, 7.608f)
            lineToRelative(-10.545f, 5.272f)
            curveToRelative(-0.292f, 0.146f, -0.515f, 0.4f, -0.622f, 0.71f)
            lineToRelative(-2.684f, 7.77f)
            curveToRelative(-0.663f, 1.92f, -3.108f, 2.483f, -4.544f, 1.046f)
            lineTo(9.412f, 25.18f)
            curveToRelative(-1.436f, -1.436f, -0.873f, -3.88f, 1.047f, -4.543f)
            lineToRelative(7.77f, -2.685f)
            curveToRelative(0.308f, -0.106f, 0.563f, -0.33f, 0.71f, -0.622f)
            lineTo(24.21f, 6.784f)
            curveToRelative(1.45f, -2.9f, 5.314f, -3.527f, 7.607f, -1.234f)
            close()
        }
    }.build()
}

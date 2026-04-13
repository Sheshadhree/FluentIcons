package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DocumentAdd48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DocumentAdd48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(30.4f, 4f),
                end = Offset(33.4843f, 36.9112f)
            )
        ) {
            moveTo(11f, 43f)
            horizontalLineToRelative(26f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(18f)
            lineToRelative(-10f, -4f)
            lineToRelative(-4f, -10f)
            horizontalLineTo(11f)
            curveTo(9.343f, 4f, 8f, 5.343f, 8f, 7f)
            verticalLineToRelative(33f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.362364f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(41.3333f, 5.21875f),
                radius = 24.7968f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(11f, 43f)
            horizontalLineToRelative(26f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(18f)
            lineToRelative(-10f, -4f)
            lineToRelative(-4f, -10f)
            horizontalLineTo(11f)
            curveTo(9.343f, 4f, 8f, 5.343f, 8f, 7f)
            verticalLineToRelative(33f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.535f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(12.8f, 40.5625f),
                radius = 17.8929f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(11f, 43f)
            horizontalLineToRelative(26f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(18f)
            lineToRelative(-10f, -4f)
            lineToRelative(-4f, -10f)
            horizontalLineTo(11f)
            curveTo(9.343f, 4f, 8f, 5.343f, 8f, 7f)
            verticalLineToRelative(33f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(32.9766f, 9.83333f),
                end = Offset(29.4766f, 15.6667f)
            )
        ) {
            moveTo(26f, 15f)
            verticalLineTo(4f)
            lineToRelative(14f, 14f)
            horizontalLineTo(29f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(-13f, 9f)
            curveToRelative(6.075f, 0f, 11f, 4.925f, 11f, 11f)
            reflectiveCurveToRelative(-4.925f, 11f, -11f, 11f)
            reflectiveCurveTo(2f, 41.075f, 2f, 35f)
            reflectiveCurveToRelative(4.925f, -11f, 11f, -11f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(8f, 28.6321f),
                end = Offset(12.9093f, 45.9625f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13f, 27f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-6f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}

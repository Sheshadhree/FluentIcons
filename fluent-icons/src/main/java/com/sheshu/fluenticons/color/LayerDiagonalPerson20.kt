package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LayerDiagonalPerson20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LayerDiagonalPerson20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF1B44B1)
                ),
                start = Offset(2.33929f, 4.23828f),
                end = Offset(10.4846f, 10.9241f)
            )
        ) {
            moveTo(11.5f, 3.485f)
            curveToRelative(0f, -1.064f, -1.078f, -1.79f, -2.064f, -1.39f)
            lineTo(3.56f, 4.48f)
            curveTo(2.617f, 4.863f, 2f, 5.78f, 2f, 6.797f)
            verticalLineToRelative(5.71f)
            curveToRelative(0f, 1.068f, 1.084f, 1.793f, 2.071f, 1.387f)
            lineToRelative(6.5f, -2.677f)
            curveToRelative(0.562f, -0.231f, 0.929f, -0.779f, 0.929f, -1.387f)
            verticalLineTo(3.485f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(5.33929f, 6.23828f),
                end = Offset(13.4846f, 12.9241f)
            )
        ) {
            moveTo(14.5f, 5.485f)
            curveToRelative(0f, -1.064f, -1.078f, -1.79f, -2.064f, -1.39f)
            lineTo(6.248f, 6.607f)
            curveTo(5.493f, 6.913f, 5f, 7.646f, 5f, 8.46f)
            verticalLineToRelative(6.047f)
            curveToRelative(0f, 1.068f, 1.084f, 1.793f, 2.071f, 1.387f)
            lineToRelative(6.5f, -2.677f)
            curveToRelative(0.562f, -0.231f, 0.929f, -0.779f, 0.929f, -1.387f)
            verticalLineTo(5.485f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF58AAFE)
                ),
                start = Offset(9.32143f, 8.24009f),
                end = Offset(17.3736f, 14.498f)
            )
        ) {
            moveTo(18f, 7.486f)
            curveToRelative(0f, -1.065f, -1.078f, -1.79f, -2.065f, -1.39f)
            lineToRelative(-6f, 2.437f)
            curveTo(9.37f, 8.763f, 9f, 9.313f, 9f, 9.923f)
            verticalLineToRelative(6.591f)
            curveToRelative(0f, 1.065f, 1.078f, 1.79f, 2.065f, 1.39f)
            lineToRelative(6f, -2.437f)
            curveToRelative(0.565f, -0.23f, 0.935f, -0.78f, 0.935f, -1.39f)
            verticalLineTo(7.486f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(13.6646f, 15.5317f),
                end = Offset(15.1023f, 19.549f)
            )
        ) {
            moveTo(19f, 16.5f)
            curveToRelative(0f, 1.245f, -1f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(12f, 17.75f, 12f, 16.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveTo(17.5f, 12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}

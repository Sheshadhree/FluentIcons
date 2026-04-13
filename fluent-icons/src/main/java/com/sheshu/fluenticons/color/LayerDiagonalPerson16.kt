package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LayerDiagonalPerson16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LayerDiagonalPerson16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF1B44B1)
                ),
                start = Offset(0.285714f, 1.8843f),
                end = Offset(7.05895f, 7.53085f)
            )
        ) {
            moveTo(8f, 1.516f)
            curveTo(8f, 0.44f, 6.899f, -0.286f, 5.91f, 0.139f)
            lineTo(1.514f, 2.02f)
            curveTo(0.596f, 2.415f, 0f, 3.319f, 0f, 4.319f)
            verticalLineToRelative(4.164f)
            curveToRelative(0f, 1.077f, 1.101f, 1.803f, 2.09f, 1.38f)
            lineToRelative(5f, -2.144f)
            curveTo(7.643f, 7.483f, 8f, 6.941f, 8f, 6.341f)
            verticalLineTo(1.516f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.28571f, 3.8843f),
                end = Offset(10.0589f, 9.53085f)
            )
        ) {
            moveTo(11f, 3.517f)
            curveToRelative(0f, -1.077f, -1.101f, -1.803f, -2.09f, -1.38f)
            lineTo(4.514f, 4.022f)
            curveTo(3.596f, 4.415f, 3f, 5.319f, 3f, 6.319f)
            verticalLineToRelative(4.164f)
            curveToRelative(0f, 1.077f, 1.101f, 1.803f, 2.09f, 1.38f)
            lineToRelative(5f, -2.144f)
            curveTo(10.643f, 9.483f, 11f, 8.941f, 11f, 8.341f)
            verticalLineTo(3.517f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF58AAFE)
                ),
                start = Offset(6.28571f, 5.8843f),
                end = Offset(13.0589f, 11.5308f)
            )
        ) {
            moveTo(14f, 5.516f)
            curveToRelative(0f, -1.076f, -1.101f, -1.802f, -2.09f, -1.378f)
            lineTo(7.514f, 6.02f)
            curveTo(6.596f, 6.415f, 6f, 7.319f, 6f, 8.319f)
            verticalLineToRelative(4.164f)
            curveToRelative(0f, 1.077f, 1.101f, 1.803f, 2.09f, 1.38f)
            lineToRelative(5f, -2.144f)
            curveToRelative(0.552f, -0.236f, 0.91f, -0.778f, 0.91f, -1.378f)
            verticalLineTo(5.517f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(10.6646f, 12.5317f),
                end = Offset(12.1023f, 16.549f)
            )
        ) {
            moveTo(16f, 13.5f)
            curveToRelative(0f, 1.245f, -1f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(9f, 14.75f, 9f, 13.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveTo(14.5f, 9f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}

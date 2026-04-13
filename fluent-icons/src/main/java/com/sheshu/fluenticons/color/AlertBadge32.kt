package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AlertBadge32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AlertBadge32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(16f, 22.8571f),
                end = Offset(16.0259f, 27.9992f)
            )
        ) {
            moveTo(20f, 24f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(24.243f, 20.8886f),
                end = Offset(8.48023f, 5.76923f)
            )
        ) {
            moveTo(7f, 13f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.03f, 9f, 9f)
            verticalLineToRelative(3.807f)
            lineToRelative(1.928f, 4.822f)
            curveToRelative(0.124f, 0.308f, 0.086f, 0.657f, -0.1f, 0.932f)
            curveTo(26.642f, 22.835f, 26.332f, 23f, 26f, 23f)
            horizontalLineTo(6f)
            curveToRelative(-0.332f, 0f, -0.642f, -0.165f, -0.828f, -0.44f)
            curveToRelative(-0.186f, -0.274f, -0.224f, -0.623f, -0.1f, -0.931f)
            lineTo(7f, 16.807f)
            verticalLineTo(13f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.253378f to Color(0xFFFFE994),
                    0.647973f to Color(0x00FFE994)
                ),
                center = Offset(23.9424f, 9.33991f),
                radius = 8.09417f
            ),
            fillAlpha = 0.2f
        ) {
            moveTo(7f, 13f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.03f, 9f, 9f)
            verticalLineToRelative(3.807f)
            lineToRelative(1.928f, 4.822f)
            curveToRelative(0.124f, 0.308f, 0.086f, 0.657f, -0.1f, 0.932f)
            curveTo(26.642f, 22.835f, 26.332f, 23f, 26f, 23f)
            horizontalLineTo(6f)
            curveToRelative(-0.332f, 0f, -0.642f, -0.165f, -0.828f, -0.44f)
            curveToRelative(-0.186f, -0.274f, -0.224f, -0.623f, -0.1f, -0.931f)
            lineTo(7f, 16.807f)
            verticalLineTo(13f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(27f, 9f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF83F54),
                    1f to Color(0xFFB91D6B)
                ),
                start = Offset(21.2143f, 7.125f),
                end = Offset(25.9286f, 10.875f)
            )
        ) {
            moveTo(27f, 9f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Cloud32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Cloud32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(3f, 9.5625f),
                end = Offset(15.0151f, 27.9589f)
            )
        ) {
            moveTo(2f, 19f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            horizontalLineToRelative(16f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            horizontalLineToRelative(-0.062f)
            curveTo(23.446f, 9.054f, 20.08f, 6f, 16f, 6f)
            reflectiveCurveToRelative(-7.446f, 3.054f, -7.938f, 7f)
            horizontalLineTo(8f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(2f, 15.0556f),
                end = Offset(10.0896f, 22.2154f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(14f, 19f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(10.8247f, 6.9f),
                end = Offset(12.9424f, 17.9307f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(16f, 22f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            curveToRelative(-4.08f, 0f, -7.446f, 3.054f, -7.938f, 7f)
            curveTo(11.347f, 13.034f, 14f, 15.707f, 14f, 19f)
            curveToRelative(0f, 0.922f, -0.208f, 1.795f, -0.58f, 2.575f)
            curveTo(14.23f, 21.851f, 15.099f, 22f, 16f, 22f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.412409f to Color(0xFF2C87F5),
                    1f to Color(0x002C87F5)
                ),
                center = Offset(8.68578f, 19.1f),
                radius = 9.7542f
            )
        ) {
            moveTo(16f, 22f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            curveToRelative(-4.08f, 0f, -7.446f, 3.054f, -7.938f, 7f)
            curveTo(11.347f, 13.034f, 14f, 15.707f, 14f, 19f)
            curveToRelative(0f, 0.922f, -0.208f, 1.795f, -0.58f, 2.575f)
            curveTo(14.23f, 21.851f, 15.099f, 22f, 16f, 22f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(14.8333f, 4.8125f),
                radius = 23.6561f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(2f, 19f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            horizontalLineToRelative(16f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            horizontalLineToRelative(-0.062f)
            curveTo(23.446f, 9.054f, 20.08f, 6f, 16f, 6f)
            reflectiveCurveToRelative(-7.446f, 3.054f, -7.938f, 7f)
            horizontalLineTo(8f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Cloud20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Cloud20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(2.57143f, 6.0625f),
                end = Offset(9.5637f, 16.6293f)
            )
        ) {
            moveTo(10f, 4f)
            curveToRelative(2.817f, 0f, 4.415f, 1.923f, 4.647f, 4.246f)
            horizontalLineToRelative(0.07f)
            curveToRelative(1.814f, 0f, 3.283f, 1.512f, 3.283f, 3.377f)
            curveTo(18f, 13.488f, 16.53f, 15f, 14.718f, 15f)
            horizontalLineTo(5.282f)
            curveTo(3.47f, 15f, 2f, 13.488f, 2f, 11.623f)
            curveToRelative(0f, -1.865f, 1.47f, -3.377f, 3.282f, -3.377f)
            horizontalLineToRelative(0.071f)
            curveTo(5.587f, 5.908f, 7.183f, 4f, 10f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(2f, 9.40625f),
                end = Offset(6.56754f, 13.5986f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(9f, 11.5f)
            curveTo(9f, 13.433f, 7.433f, 15f, 5.5f, 15f)
            reflectiveCurveTo(2f, 13.433f, 2f, 11.5f)
            reflectiveCurveToRelative(1.567f, -3.25f, 3.5f, -3.25f)
            reflectiveCurveTo(9f, 9.567f, 9f, 11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(6.96485f, 4.5625f),
                end = Offset(8.36723f, 11.4242f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(10f, 14f)
            curveToRelative(2.761f, 0f, 4.7f, -2.239f, 4.7f, -5f)
            reflectiveCurveTo(13f, 4f, 10f, 4f)
            curveTo(7.276f, 4f, 5.623f, 5.846f, 5.343f, 8.253f)
            curveTo(5.395f, 8.25f, 5.447f, 8.25f, 5.5f, 8.25f)
            curveTo(7.433f, 8.25f, 9f, 9.567f, 9f, 11.5f)
            curveToRelative(0f, 0.82f, -0.281f, 1.573f, -0.753f, 2.169f)
            curveTo(8.78f, 13.883f, 9.368f, 14f, 10f, 14f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.412409f to Color(0xFF2C87F5),
                    1f to Color(0x002C87F5)
                ),
                center = Offset(5.70909f, 12.1875f),
                radius = 5.78427f
            )
        ) {
            moveTo(10f, 14f)
            curveToRelative(2.761f, 0f, 4.7f, -2.239f, 4.7f, -5f)
            reflectiveCurveTo(13f, 4f, 10f, 4f)
            curveTo(7.276f, 4f, 5.623f, 5.846f, 5.343f, 8.253f)
            curveTo(5.395f, 8.25f, 5.447f, 8.25f, 5.5f, 8.25f)
            curveTo(7.433f, 8.25f, 9f, 9.567f, 9f, 11.5f)
            curveToRelative(0f, 0.82f, -0.281f, 1.573f, -0.753f, 2.169f)
            curveTo(8.78f, 13.883f, 9.368f, 14f, 10f, 14f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(9.33334f, 3.3125f),
                radius = 13.6588f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(10f, 4f)
            curveToRelative(2.817f, 0f, 4.415f, 1.923f, 4.647f, 4.246f)
            horizontalLineToRelative(0.07f)
            curveToRelative(1.814f, 0f, 3.283f, 1.512f, 3.283f, 3.377f)
            curveTo(18f, 13.488f, 16.53f, 15f, 14.718f, 15f)
            horizontalLineTo(5.282f)
            curveTo(3.47f, 15f, 2f, 13.488f, 2f, 11.623f)
            curveToRelative(0f, -1.865f, 1.47f, -3.377f, 3.282f, -3.377f)
            horizontalLineToRelative(0.071f)
            curveTo(5.587f, 5.908f, 7.183f, 4f, 10f, 4f)
            close()
        }
    }.build()
}

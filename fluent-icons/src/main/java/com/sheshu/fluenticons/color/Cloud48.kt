package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Cloud48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Cloud48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(4.5f, 14.25f),
                end = Offset(22.0787f, 41.6453f)
            )
        ) {
            moveTo(24f, 9f)
            curveToRelative(-6.29f, 0f, -11.45f, 4.84f, -11.959f, 11f)
            horizontalLineTo(11.5f)
            curveTo(6.806f, 20f, 3f, 23.806f, 3f, 28.5f)
            reflectiveCurveTo(6.806f, 37f, 11.5f, 37f)
            horizontalLineToRelative(25f)
            curveToRelative(4.694f, 0f, 8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveTo(41.194f, 20f, 36.5f, 20f)
            horizontalLineToRelative(-0.541f)
            curveTo(35.45f, 13.84f, 30.29f, 9f, 24f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(3f, 22.912f),
                end = Offset(14.4602f, 33.0552f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(20f, 28.5f)
            curveToRelative(0f, 4.694f, -3.806f, 8.5f, -8.5f, 8.5f)
            reflectiveCurveTo(3f, 33.194f, 3f, 28.5f)
            reflectiveCurveTo(6.806f, 20f, 11.5f, 20f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(16.1932f, 10.35f),
                end = Offset(19.3632f, 26.8986f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(24f, 33f)
            curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(30.627f, 9f, 24f, 9f)
            curveToRelative(-6.296f, 0f, -11.46f, 4.85f, -11.96f, 11.017f)
            curveTo(16.483f, 20.295f, 20f, 23.987f, 20f, 28.5f)
            curveToRelative(0f, 1.255f, -0.272f, 2.447f, -0.76f, 3.519f)
            curveTo(20.7f, 32.65f, 22.309f, 33f, 24f, 33f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.412409f to Color(0xFF2C87F5),
                    1f to Color(0x002C87F5)
                ),
                center = Offset(12.9777f, 28.65f),
                radius = 14.6589f
            )
        ) {
            moveTo(24f, 33f)
            curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(30.627f, 9f, 24f, 9f)
            curveToRelative(-6.296f, 0f, -11.46f, 4.85f, -11.96f, 11.017f)
            curveTo(16.483f, 20.295f, 20f, 23.987f, 20f, 28.5f)
            curveToRelative(0f, 1.255f, -0.272f, 2.447f, -0.76f, 3.519f)
            curveTo(20.7f, 32.65f, 22.309f, 33f, 24f, 33f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(22.25f, 7.25f),
                radius = 34.9921f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(24f, 9f)
            curveToRelative(-6.29f, 0f, -11.45f, 4.84f, -11.959f, 11f)
            horizontalLineTo(11.5f)
            curveTo(6.806f, 20f, 3f, 23.806f, 3f, 28.5f)
            reflectiveCurveTo(6.806f, 37f, 11.5f, 37f)
            horizontalLineToRelative(25f)
            curveToRelative(4.694f, 0f, 8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveTo(41.194f, 20f, 36.5f, 20f)
            horizontalLineToRelative(-0.541f)
            curveTo(35.45f, 13.84f, 30.29f, 9f, 24f, 9f)
            close()
        }
    }.build()
}

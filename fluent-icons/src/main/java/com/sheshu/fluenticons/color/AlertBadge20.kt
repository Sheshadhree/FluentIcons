package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AlertBadge20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AlertBadge20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(10.01f, 14.5f),
                end = Offset(10.01f, 18.0001f)
            )
        ) {
            moveTo(12.99f, 15f)
            curveToRelative(0f, 1.657f, -1.342f, 3f, -3f, 3f)
            curveToRelative(-1.656f, 0f, -3f, -1.343f, -3f, -3f)
            curveToRelative(0f, -1.656f, 1.344f, -3f, 3f, -3f)
            curveToRelative(1.658f, 0f, 3f, 1.344f, 3f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(17.01f, 15f),
                end = Offset(4.51001f, 4f)
            )
        ) {
            moveTo(9.988f, 2f)
            curveToRelative(3.15f, 0f, 5.744f, 2.335f, 5.985f, 5.356f)
            lineToRelative(0.013f, 0.222f)
            lineToRelative(0.005f, 0.224f)
            lineToRelative(-0.001f, 3.606f)
            lineToRelative(0.954f, 2.588f)
            lineToRelative(0.025f, 0.084f)
            lineToRelative(0.016f, 0.087f)
            lineToRelative(0.005f, 0.088f)
            curveToRelative(0f, 0.315f, -0.196f, 0.59f, -0.522f, 0.707f)
            lineToRelative(-0.113f, 0.033f)
            lineToRelative(-0.115f, 0.01f)
            horizontalLineTo(3.742f)
            curveToRelative(-0.089f, 0f, -0.176f, -0.016f, -0.26f, -0.046f)
            curveTo(3.196f, 14.853f, 3.007f, 14.587f, 3f, 14.243f)
            lineToRelative(0.005f, -0.118f)
            lineToRelative(0.033f, -0.13f)
            lineToRelative(0.952f, -2.584f)
            verticalLineTo(7.793f)
            lineToRelative(0.005f, -0.225f)
            curveTo(4.117f, 4.451f, 6.762f, 2f, 9.988f, 2f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.253378f to Color(0xFFFFE994),
                    0.647973f to Color(0x00FFE994)
                ),
                center = Offset(15f, 5f),
                radius = 6.80074f
            ),
            fillAlpha = 0.2f
        ) {
            moveTo(9.988f, 2f)
            curveToRelative(3.15f, 0f, 5.744f, 2.335f, 5.985f, 5.356f)
            lineToRelative(0.013f, 0.222f)
            lineToRelative(0.005f, 0.224f)
            lineToRelative(-0.001f, 3.606f)
            lineToRelative(0.954f, 2.588f)
            lineToRelative(0.025f, 0.084f)
            lineToRelative(0.016f, 0.087f)
            lineToRelative(0.005f, 0.088f)
            curveToRelative(0f, 0.315f, -0.196f, 0.59f, -0.522f, 0.707f)
            lineToRelative(-0.113f, 0.033f)
            lineToRelative(-0.115f, 0.01f)
            horizontalLineTo(3.742f)
            curveToRelative(-0.089f, 0f, -0.176f, -0.016f, -0.26f, -0.046f)
            curveTo(3.196f, 14.853f, 3.007f, 14.587f, 3f, 14.243f)
            lineToRelative(0.005f, -0.118f)
            lineToRelative(0.033f, -0.13f)
            lineToRelative(0.952f, -2.584f)
            verticalLineTo(7.793f)
            lineToRelative(0.005f, -0.225f)
            curveTo(4.117f, 4.451f, 6.762f, 2f, 9.988f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF83F54),
                    1f to Color(0xFFB91D6B)
                ),
                start = Offset(13.1429f, 3.75f),
                end = Offset(16.2857f, 6.25f)
            )
        ) {
            moveTo(15f, 7f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}

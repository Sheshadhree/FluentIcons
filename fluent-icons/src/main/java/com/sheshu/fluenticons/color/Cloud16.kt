package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Cloud16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Cloud16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF367AF2)
                ),
                start = Offset(1.5f, 3.875f),
                end = Offset(7.94828f, 13.2543f)
            )
        ) {
            moveTo(4.03f, 5.507f)
            curveTo(4.273f, 3.531f, 5.958f, 2f, 8f, 2f)
            curveToRelative(2.042f, 0f, 3.727f, 1.53f, 3.97f, 3.507f)
            curveTo(13.662f, 5.62f, 15f, 7.03f, 15f, 8.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(2.455f, 12f, 1f, 10.545f, 1f, 8.75f)
            curveToRelative(0f, -1.721f, 1.338f, -3.13f, 3.03f, -3.243f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(1.00012f, 6.61343f),
                end = Offset(5.38197f, 10.4917f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(7.5f, 8.75f)
            curveTo(7.5f, 10.545f, 6.045f, 12f, 4.25f, 12f)
            reflectiveCurveTo(1f, 10.545f, 1f, 8.75f)
            reflectiveCurveTo(2.455f, 5.5f, 4.25f, 5.5f)
            reflectiveCurveTo(7.5f, 6.955f, 7.5f, 8.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0x00FCFCFC)
                ),
                start = Offset(5.41163f, 2.45f),
                end = Offset(6.47037f, 7.96538f)
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(8f, 10f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            curveTo(5.958f, 2f, 4.273f, 3.53f, 4.03f, 5.507f)
            curveTo(4.103f, 5.503f, 4.176f, 5.5f, 4.25f, 5.5f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            curveToRelative(0f, 0.418f, -0.079f, 0.818f, -0.223f, 1.185f)
            curveTo(7.512f, 9.978f, 7.753f, 10f, 8f, 10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.412409f to Color(0xFF2C87F5),
                    1f to Color(0x002C87F5)
                ),
                center = Offset(4.34204f, 8.55f),
                radius = 4.87756f
            )
        ) {
            moveTo(8f, 10f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            curveTo(5.958f, 2f, 4.273f, 3.53f, 4.03f, 5.507f)
            curveTo(4.103f, 5.503f, 4.176f, 5.5f, 4.25f, 5.5f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            curveToRelative(0f, 0.418f, -0.079f, 0.818f, -0.223f, 1.185f)
            curveTo(7.512f, 9.978f, 7.753f, 10f, 8f, 10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(7.41667f, 1.375f),
                radius = 12.3236f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(4.03f, 5.507f)
            curveTo(4.273f, 3.531f, 5.958f, 2f, 8f, 2f)
            curveToRelative(2.042f, 0f, 3.727f, 1.53f, 3.97f, 3.507f)
            curveTo(13.662f, 5.62f, 15f, 7.03f, 15f, 8.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-7.5f)
            curveTo(2.455f, 12f, 1f, 10.545f, 1f, 8.75f)
            curveToRelative(0f, -1.721f, 1.338f, -3.13f, 3.03f, -3.243f)
            close()
        }
    }.build()
}

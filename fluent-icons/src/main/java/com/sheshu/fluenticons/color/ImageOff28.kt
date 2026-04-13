package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ImageOff28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ImageOff28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFFA9A9A9),
                    0.694598f to Color(0xFF898989)
                ),
                center = Offset(-5.64286f, -9.375f),
                radius = 60.8336f
            )
        ) {
            moveTo(3f, 6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineToRelative(14.5f)
            curveTo(23.321f, 3f, 25f, 4.679f, 25f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE7DEDE),
                    1f to Color(0xFFD3D3D3)
                ),
                start = Offset(11.0377f, 13.9978f),
                end = Offset(13.5261f, 25.5792f)
            )
        ) {
            moveTo(24.368f, 23.334f)
            lineToRelative(-8.97f, -8.767f)
            curveToRelative(-0.777f, -0.76f, -2.019f, -0.76f, -2.796f, 0f)
            lineToRelative(-8.97f, 8.767f)
            curveTo(4.305f, 24.339f, 5.45f, 25f, 6.75f, 25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.3f, 0f, 2.445f, -0.661f, 3.118f, -1.666f)
            close()
            moveTo(19f, 12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.464286f to Color.Transparent.copy(alpha = 0f),
                    0.484375f to Color.Black,
                    0.580256f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(25f, 3f),
                end = Offset(3f, 25f)
            )
        ) {
            moveTo(3f, 6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineToRelative(14.5f)
            curveTo(23.321f, 3f, 25f, 4.679f, 25f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE82C41),
                    1f to Color(0xFFAA1D2D)
                ),
                start = Offset(2f, -2.5f),
                end = Offset(21.5f, 26.75f)
            )
        ) {
            moveTo(2.293f, 2.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(22f, 22f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-22f, -22f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            close()
        }
    }.build()
}

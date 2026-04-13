package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ImageOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ImageOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFFA9A9A9),
                    0.694598f to Color(0xFF898989)
                ),
                center = Offset(-4.07143f, -7.125f),
                radius = 49.7729f
            )
        ) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE7DEDE),
                    1f to Color(0xFFD3D3D3)
                ),
                start = Offset(9.56733f, 12.0032f),
                end = Offset(11.5942f, 21.4772f)
            )
        ) {
            moveTo(20.515f, 19.46f)
            curveTo(19.942f, 20.383f, 18.918f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.168f, 0f, -2.192f, -0.616f, -2.765f, -1.54f)
            lineToRelative(6.939f, -6.813f)
            lineToRelative(0.135f, -0.122f)
            curveToRelative(0.835f, -0.698f, 2.056f, -0.696f, 2.889f, 0.006f)
            lineToRelative(0.128f, 0.117f)
            lineToRelative(6.939f, 6.811f)
            close()
            moveTo(16f, 6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.464286f to Color.Transparent.copy(alpha = 0f),
                    0.490451f to Color.Black,
                    0.581597f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(21f, 3f),
                end = Offset(3f, 21f)
            )
        ) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE82C41),
                    1f to Color(0xFFAA1D2D)
                ),
                start = Offset(2f, -1.75f),
                end = Offset(18.25f, 22.625f)
            )
        ) {
            moveTo(2.293f, 2.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(18f, 18f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-18f, -18f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            close()
        }
    }.build()
}

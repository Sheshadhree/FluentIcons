package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ImageOff48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ImageOff48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFFA9A9A9),
                    0.694598f to Color(0xFF898989)
                ),
                center = Offset(-8.14286f, -14.25f),
                radius = 99.5459f
            )
        ) {
            moveTo(6f, 12.25f)
            curveTo(6f, 8.798f, 8.798f, 6f, 12.25f, 6f)
            horizontalLineToRelative(23.5f)
            curveTo(39.202f, 6f, 42f, 8.798f, 42f, 12.25f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 42f, 6f, 39.202f, 6f, 35.75f)
            verticalLineToRelative(-23.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE7DEDE),
                    1f to Color(0xFFD3D3D3)
                ),
                start = Offset(19.1899f, 24f),
                end = Offset(23.2892f, 42.9348f)
            )
        ) {
            moveTo(40.835f, 39.385f)
            lineToRelative(-14.36f, -14.36f)
            curveToRelative(-1.367f, -1.367f, -3.583f, -1.367f, -4.95f, 0f)
            lineToRelative(-14.36f, 14.36f)
            curveTo(8.299f, 40.968f, 10.154f, 42f, 12.25f, 42f)
            horizontalLineToRelative(23.5f)
            curveToRelative(2.096f, 0f, 3.95f, -1.032f, 5.085f, -2.615f)
            close()
            moveTo(27f, 17f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.47092f to Color.Transparent.copy(alpha = 0f),
                    0.485243f to Color.Black,
                    0.568576f to Color.Black.copy(alpha = 0.019607844f),
                    0.618304f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(42f, 6f),
                end = Offset(6f, 42f)
            )
        ) {
            moveTo(6f, 12.25f)
            curveTo(6f, 8.798f, 8.798f, 6f, 12.25f, 6f)
            horizontalLineToRelative(23.5f)
            curveTo(39.202f, 6f, 42f, 8.798f, 42f, 12.25f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 42f, 6f, 39.202f, 6f, 35.75f)
            verticalLineToRelative(-23.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE82C41),
                    1f to Color(0xFFAA1D2D)
                ),
                start = Offset(4f, -3.5f),
                end = Offset(36.5f, 45.25f)
            )
        ) {
            moveTo(4.44f, 4.44f)
            curveToRelative(0.585f, -0.587f, 1.535f, -0.587f, 2.12f, 0f)
            lineToRelative(37f, 37f)
            curveToRelative(0.586f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            curveToRelative(-0.585f, 0.586f, -1.535f, 0.586f, -2.12f, 0f)
            lineToRelative(-37f, -37f)
            curveToRelative(-0.587f, -0.585f, -0.587f, -1.535f, 0f, -2.12f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ImageOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ImageOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFFA9A9A9),
                    0.694598f to Color(0xFF898989)
                ),
                center = Offset(-7.21429f, -11.625f),
                radius = 71.8942f
            )
        ) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE7DEDE),
                    1f to Color(0xFFD3D3D3)
                ),
                start = Offset(12.4694f, 15.5f),
                end = Offset(15.6048f, 29.6731f)
            )
        ) {
            moveTo(28.356f, 26.82f)
            curveTo(27.568f, 28.128f, 26.136f, 29f, 24.5f, 29f)
            horizontalLineToRelative(-17f)
            curveToRelative(-1.636f, 0f, -3.069f, -0.873f, -3.857f, -2.18f)
            lineToRelative(10.59f, -10.588f)
            curveToRelative(0.975f, -0.976f, 2.558f, -0.976f, 3.535f, 0f)
            lineToRelative(10.588f, 10.589f)
            close()
            moveTo(19f, 11f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.464286f to Color.Transparent.copy(alpha = 0f),
                    0.484375f to Color.Black,
                    0.572716f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(29f, 3f),
                end = Offset(3f, 29f)
            )
        ) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE82C41),
                    1f to Color(0xFFAA1D2D)
                ),
                start = Offset(2f, -3.25f),
                end = Offset(24.75f, 30.875f)
            )
        ) {
            moveTo(2.366f, 2.366f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(25.5f, 25.5f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-25.5f, -25.5f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            close()
        }
    }.build()
}

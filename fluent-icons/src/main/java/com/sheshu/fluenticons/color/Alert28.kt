package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Alert28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Alert28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(14f, 20.5f),
                end = Offset(14.0227f, 24.9993f)
            )
        ) {
            moveTo(17.5f, 21.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(12.067f, 18f, 14f, 18f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(21.4937f, 19f),
                end = Offset(6.59852f, 5.29035f)
            )
        ) {
            moveTo(14.002f, 3f)
            curveToRelative(4.608f, 0f, 8.36f, 3.669f, 8.494f, 8.246f)
            verticalLineToRelative(0.255f)
            horizontalLineTo(22.5f)
            verticalLineToRelative(4.112f)
            lineToRelative(1.413f, 3.644f)
            curveToRelative(0.038f, 0.099f, 0.064f, 0.201f, 0.077f, 0.306f)
            lineTo(24f, 19.72f)
            curveToRelative(0f, 0.663f, -0.503f, 1.208f, -1.149f, 1.274f)
            lineTo(22.721f, 21f)
            horizontalLineTo(5.28f)
            curveToRelative(-0.159f, 0f, -0.316f, -0.03f, -0.464f, -0.087f)
            curveToRelative(-0.617f, -0.24f, -0.943f, -0.907f, -0.77f, -1.532f)
            lineToRelative(0.041f, -0.125f)
            lineToRelative(1.416f, -3.644f)
            verticalLineToRelative(-4.11f)
            curveTo(5.504f, 6.805f, 9.31f, 3f, 14.003f, 3f)
            close()
        }
    }.build()
}

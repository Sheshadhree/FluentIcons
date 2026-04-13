package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LockShield32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LockShield32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC205),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(12.5714f, 0.567164f),
                end = Offset(20.5295f, 15.0231f)
            )
        ) {
            moveTo(22f, 8f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-2f)
            verticalLineTo(8f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-2f)
            verticalLineTo(8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(29.7143f, 31.3125f),
                end = Offset(7.81301f, 10.9167f)
            )
        ) {
            moveTo(28f, 13.5f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.015f, 9f, 4f, 11.015f, 4f, 13.5f)
            verticalLineToRelative(12f)
            curveTo(4f, 27.985f, 6.015f, 30f, 8.5f, 30f)
            horizontalLineToRelative(15f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-12f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                center = Offset(17f, 22f),
                radius = 7.28011f
            )
        ) {
            moveTo(18f, 20f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    0.989901f to Color(0x00EB4824)
                ),
                center = Offset(23.7143f, 25.625f),
                radius = 8.42026f
            )
        ) {
            moveTo(28f, 13.5f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.015f, 9f, 4f, 11.015f, 4f, 13.5f)
            verticalLineToRelative(12f)
            curveTo(4f, 27.985f, 6.015f, 30f, 8.5f, 30f)
            horizontalLineToRelative(15f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF62BE55),
                    1f to Color(0xFF1E794A)
                ),
                start = Offset(20.4375f, 16f),
                end = Offset(31.6614f, 29.9567f)
            )
        ) {
            moveTo(25.207f, 16.265f)
            curveToRelative(0.943f, 0.888f, 2.755f, 2.3f, 4.983f, 2.589f)
            curveToRelative(0.444f, 0.058f, 0.81f, 0.389f, 0.81f, 0.803f)
            verticalLineToRelative(3.87f)
            curveToRelative(0f, 5.204f, -5.17f, 7.093f, -6.288f, 7.44f)
            curveToRelative(-0.14f, 0.044f, -0.283f, 0.044f, -0.423f, 0f)
            curveTo(23.171f, 30.62f, 18f, 28.731f, 18f, 23.527f)
            verticalLineToRelative(-3.87f)
            curveToRelative(0f, -0.414f, 0.366f, -0.745f, 0.81f, -0.803f)
            curveToRelative(2.228f, -0.29f, 4.04f, -1.701f, 4.983f, -2.589f)
            curveToRelative(0.375f, -0.353f, 1.038f, -0.353f, 1.414f, 0f)
            close()
        }
    }.build()
}

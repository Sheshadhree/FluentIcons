package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PersonHeart24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PersonHeart24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(5.80816f, 15.0636f),
                end = Offset(8.39355f, 23.3188f)
            )
        ) {
            moveTo(15.754f, 14f)
            curveToRelative(1.242f, 0f, 2.249f, 1.007f, 2.249f, 2.249f)
            verticalLineToRelative(0.918f)
            curveToRelative(0f, 0.574f, -0.18f, 1.133f, -0.513f, 1.6f)
            curveTo(15.945f, 20.93f, 13.42f, 22f, 10f, 22f)
            curveToRelative(-3.421f, 0f, -5.944f, -1.072f, -7.486f, -3.236f)
            curveToRelative(-0.332f, -0.466f, -0.51f, -1.024f, -0.51f, -1.596f)
            verticalLineToRelative(-0.92f)
            curveTo(2.003f, 15.007f, 3.01f, 14f, 4.251f, 14f)
            horizontalLineToRelative(11.502f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(10.0032f, 13.0475f),
                end = Offset(13.6233f, 26.5729f)
            )
        ) {
            moveTo(15.754f, 14f)
            curveToRelative(1.242f, 0f, 2.249f, 1.007f, 2.249f, 2.249f)
            verticalLineToRelative(0.918f)
            curveToRelative(0f, 0.574f, -0.18f, 1.133f, -0.513f, 1.6f)
            curveTo(15.945f, 20.93f, 13.42f, 22f, 10f, 22f)
            curveToRelative(-3.421f, 0f, -5.944f, -1.072f, -7.486f, -3.236f)
            curveToRelative(-0.332f, -0.466f, -0.51f, -1.024f, -0.51f, -1.596f)
            verticalLineToRelative(-0.92f)
            curveTo(2.003f, 15.007f, 3.01f, 14f, 4.251f, 14f)
            horizontalLineToRelative(11.502f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.436086f to Color(0xFF30116E),
                    0.715498f to Color(0xCE30116E),
                    1f to Color(0x0030116E)
                ),
                center = Offset(16.5f, 19f),
                radius = 8.43922f
            ),
            fillAlpha = 0.25f
        ) {
            moveTo(15.754f, 14f)
            curveToRelative(1.242f, 0f, 2.249f, 1.007f, 2.249f, 2.249f)
            verticalLineToRelative(0.918f)
            curveToRelative(0f, 0.574f, -0.18f, 1.133f, -0.513f, 1.6f)
            curveTo(15.945f, 20.93f, 13.42f, 22f, 10f, 22f)
            curveToRelative(-3.421f, 0f, -5.944f, -1.072f, -7.486f, -3.236f)
            curveToRelative(-0.332f, -0.466f, -0.51f, -1.024f, -0.51f, -1.596f)
            verticalLineToRelative(-0.92f)
            curveTo(2.003f, 15.007f, 3.01f, 14f, 4.251f, 14f)
            horizontalLineToRelative(11.502f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(7.37853f, 3.33424f),
                end = Offset(12.4749f, 11.472f)
            )
        ) {
            moveTo(10f, 2.005f)
            curveToRelative(2.762f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.238f, 5f, -5f, 5f)
            curveToRelative(-2.76f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
            close()
            moveToRelative(7.044f, 20.991f)
            curveToRelative(-0.192f, 0f, -0.384f, -0.073f, -0.53f, -0.22f)
            lineToRelative(-4.409f, -4.408f)
            curveToRelative(-1.354f, -1.354f, -1.354f, -3.549f, 0f, -4.903f)
            curveToRelative(1.354f, -1.353f, 3.55f, -1.353f, 4.903f, 0f)
            lineToRelative(0.036f, 0.036f)
            lineToRelative(0.036f, -0.036f)
            curveToRelative(1.354f, -1.353f, 3.549f, -1.353f, 4.903f, 0f)
            curveToRelative(1.353f, 1.354f, 1.353f, 3.55f, 0f, 4.903f)
            lineToRelative(-4.409f, 4.408f)
            curveToRelative(-0.146f, 0.147f, -0.338f, 0.22f, -0.53f, 0.22f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Person24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Person24",
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
                start = Offset(7.80816f, 15.0636f),
                end = Offset(10.3936f, 23.3188f)
            )
        ) {
            moveTo(17.754f, 14f)
            curveToRelative(1.242f, 0f, 2.249f, 1.007f, 2.249f, 2.249f)
            verticalLineToRelative(0.918f)
            curveToRelative(0f, 0.574f, -0.18f, 1.133f, -0.513f, 1.6f)
            curveTo(17.945f, 20.93f, 15.42f, 22f, 12f, 22f)
            curveToRelative(-3.421f, 0f, -5.944f, -1.072f, -7.486f, -3.236f)
            curveToRelative(-0.332f, -0.466f, -0.51f, -1.024f, -0.51f, -1.596f)
            verticalLineToRelative(-0.92f)
            curveTo(4.003f, 15.007f, 5.01f, 14f, 6.251f, 14f)
            horizontalLineToRelative(11.502f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(12.0032f, 13.0475f),
                end = Offset(15.6233f, 26.5729f)
            )
        ) {
            moveTo(17.754f, 14f)
            curveToRelative(1.242f, 0f, 2.249f, 1.007f, 2.249f, 2.249f)
            verticalLineToRelative(0.918f)
            curveToRelative(0f, 0.574f, -0.18f, 1.133f, -0.513f, 1.6f)
            curveTo(17.945f, 20.93f, 15.42f, 22f, 12f, 22f)
            curveToRelative(-3.421f, 0f, -5.944f, -1.072f, -7.486f, -3.236f)
            curveToRelative(-0.332f, -0.466f, -0.51f, -1.024f, -0.51f, -1.596f)
            verticalLineToRelative(-0.92f)
            curveTo(4.003f, 15.007f, 5.01f, 14f, 6.251f, 14f)
            horizontalLineToRelative(11.502f)
            close()
            moveTo(12f, 2.005f)
            curveToRelative(2.762f, 0f, 5f, 2.238f, 5f, 5f)
            curveToRelative(0f, 2.761f, -2.238f, 5f, -5f, 5f)
            curveToRelative(-2.76f, 0f, -5f, -2.239f, -5f, -5f)
            curveToRelative(0f, -2.762f, 2.24f, -5f, 5f, -5f)
            close()
        }
    }.build()
}

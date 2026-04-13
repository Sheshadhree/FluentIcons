package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PersonFeedback16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PersonFeedback16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(2.90243f, 9.66468f),
                end = Offset(4.82512f, 14.5768f)
            )
        ) {
            moveTo(7.5f, 9f)
            horizontalLineToRelative(-5f)
            curveTo(1.672f, 9f, 1f, 9.672f, 1f, 10.5f)
            curveToRelative(0f, 1.116f, 0.459f, 2.01f, 1.212f, 2.615f)
            curveTo(2.953f, 13.71f, 3.947f, 14f, 5f, 14f)
            curveToRelative(1.053f, 0f, 2.047f, -0.29f, 2.788f, -0.885f)
            curveTo(8.54f, 12.51f, 9f, 11.616f, 9f, 10.5f)
            curveTo(9f, 9.672f, 8.328f, 9f, 7.5f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(5f, 8.40476f),
                end = Offset(7.72496f, 16.5509f)
            )
        ) {
            moveTo(7.5f, 9f)
            horizontalLineToRelative(-5f)
            curveTo(1.672f, 9f, 1f, 9.672f, 1f, 10.5f)
            curveToRelative(0f, 1.116f, 0.459f, 2.01f, 1.212f, 2.615f)
            curveTo(2.953f, 13.71f, 3.947f, 14f, 5f, 14f)
            curveToRelative(1.053f, 0f, 2.047f, -0.29f, 2.788f, -0.885f)
            curveTo(8.54f, 12.51f, 9f, 11.616f, 9f, 10.5f)
            curveTo(9f, 9.672f, 8.328f, 9f, 7.5f, 9f)
            close()
            moveTo(5f, 4f)
            curveTo(3.895f, 4f, 3f, 4.895f, 3f, 6f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(4.5f, -3f)
            curveTo(8.672f, 1f, 8f, 1.672f, 8f, 2.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.653f, 0.417f, 1.208f, 1f, 1.415f)
            verticalLineTo(7f)
            curveToRelative(0f, 0.194f, 0.112f, 0.37f, 0.287f, 0.453f)
            curveToRelative(0.176f, 0.082f, 0.384f, 0.055f, 0.533f, -0.069f)
            lineTo(11.48f, 6f)
            horizontalLineToRelative(2.02f)
            curveTo(14.328f, 6f, 15f, 5.328f, 15f, 4.5f)
            verticalLineToRelative(-2f)
            curveTo(15f, 1.672f, 14.328f, 1f, 13.5f, 1f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}

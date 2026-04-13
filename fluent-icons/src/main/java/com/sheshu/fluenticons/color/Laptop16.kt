package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Laptop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Laptop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(14f, 12.9762f),
                end = Offset(12.9513f, 8.25686f)
            )
        ) {
            moveTo(4.5f, 11f)
            lineTo(8f, 10.5f)
            lineToRelative(3.5f, 0.5f)
            horizontalLineToRelative(0.264f)
            curveToRelative(0.155f, 0f, 0.308f, 0.036f, 0.447f, 0.106f)
            lineToRelative(1.342f, 0.67f)
            curveTo(13.827f, 11.913f, 14f, 12.194f, 14f, 12.5f)
            horizontalLineTo(2f)
            curveToRelative(0f, -0.306f, 0.173f, -0.587f, 0.447f, -0.724f)
            lineToRelative(1.342f, -0.67f)
            curveTo(3.928f, 11.036f, 4.08f, 11f, 4.236f, 11f)
            horizontalLineTo(4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFFAAB3BD)
                ),
                start = Offset(14f, 12.9286f),
                end = Offset(13.8463f, 11.0842f)
            )
        ) {
            moveTo(2.5f, 12f)
            curveTo(2.224f, 12f, 2f, 12.224f, 2f, 12.5f)
            reflectiveCurveTo(2.224f, 13f, 2.5f, 13f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 12f, 13.5f, 12f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(3f, 5.5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 4f, 13f, 4.672f, 13f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 11f, 3f, 10.328f, 3f, 9.5f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}

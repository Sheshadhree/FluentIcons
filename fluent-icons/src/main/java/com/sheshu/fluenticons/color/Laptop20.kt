package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Laptop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Laptop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(18f, 15.9762f),
                end = Offset(17.1969f, 11.1577f)
            )
        ) {
            moveTo(4.5f, 14f)
            lineToRelative(5f, -0.5f)
            lineToRelative(6f, 0.5f)
            horizontalLineToRelative(0.264f)
            curveToRelative(0.155f, 0f, 0.308f, 0.036f, 0.447f, 0.106f)
            lineToRelative(1.342f, 0.67f)
            curveTo(17.827f, 14.913f, 18f, 15.194f, 18f, 15.5f)
            horizontalLineTo(2f)
            curveToRelative(0f, -0.306f, 0.173f, -0.587f, 0.447f, -0.724f)
            lineToRelative(1.342f, -0.67f)
            curveTo(3.928f, 14.036f, 4.08f, 14f, 4.236f, 14f)
            horizontalLineTo(4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFFAAB3BD)
                ),
                start = Offset(18f, 15.9286f),
                end = Offset(17.8844f, 14.0787f)
            )
        ) {
            moveTo(2.5f, 15f)
            curveTo(2.224f, 15f, 2f, 15.224f, 2f, 15.5f)
            reflectiveCurveTo(2.224f, 16f, 2.5f, 16f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 15f, 17.5f, 15f)
            horizontalLineToRelative(-15f)
            close()
            moveToRelative(2f, -10f)
            curveTo(3.672f, 5f, 3f, 5.672f, 3f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(3f, 13.328f, 3.672f, 14f, 4.5f, 14f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveTo(17f, 5.672f, 16.328f, 5f, 15.5f, 5f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}

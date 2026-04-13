package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Home16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Home16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                start = Offset(8f, 9f),
                end = Offset(4.7958f, 14.6982f)
            )
        ) {
            moveTo(6f, 9f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(5f)
            horizontalLineTo(6f)
            verticalLineTo(9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD394),
                    1f to Color(0xFFFFB357)
                ),
                start = Offset(3.14532f, 1.41259f),
                end = Offset(14.9295f, 10.9813f)
            )
        ) {
            moveTo(8.687f, 2.273f)
            curveToRelative(-0.385f, -0.364f, -0.988f, -0.364f, -1.374f, 0f)
            lineTo(2.47f, 6.853f)
            curveTo(2.17f, 7.136f, 2f, 7.53f, 2f, 7.943f)
            verticalLineToRelative(4.569f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4.57f)
            curveToRelative(0f, -0.412f, -0.17f, -0.806f, -0.47f, -1.09f)
            lineTo(8.688f, 2.274f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(10.2622f, -0.695553f),
                end = Offset(6.94492f, 7.89525f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.004f, 2.636f)
            lineToRelative(5.731f, 5.41f)
            curveToRelative(0.301f, 0.284f, 0.776f, 0.27f, 1.06f, -0.03f)
            curveToRelative(0.285f, -0.302f, 0.271f, -0.777f, -0.03f, -1.061f)
            lineTo(8.86f, 1.382f)
            curveTo(8.376f, 0.924f, 7.618f, 0.927f, 7.137f, 1.389f)
            lineToRelative(-5.906f, 5.67f)
            curveToRelative(-0.3f, 0.287f, -0.309f, 0.762f, -0.022f, 1.06f)
            curveToRelative(0.287f, 0.3f, 0.762f, 0.31f, 1.06f, 0.022f)
            lineToRelative(5.735f, -5.505f)
            close()
        }
    }.build()
}

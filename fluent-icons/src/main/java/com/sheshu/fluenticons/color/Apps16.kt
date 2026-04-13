package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Apps16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Apps16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF889096)
                ),
                start = Offset(2f, 2.99951f),
                end = Offset(8f, 8.99951f)
            )
        ) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.67f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineToRelative(3f)
            curveTo(7.328f, 3f, 8f, 3.67f, 8f, 4.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            curveTo(2.448f, 9f, 2f, 8.551f, 2f, 8f)
            verticalLineTo(4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(13f, 13.5709f),
                end = Offset(7.42857f, 7.99951f)
            )
        ) {
            moveTo(11.5f, 8f)
            curveTo(12.328f, 8f, 13f, 8.67f, 13f, 9.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(8f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.553f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55595E),
                    1f to Color(0xFF383B3D)
                ),
                start = Offset(2f, 7.99951f),
                end = Offset(8f, 11.8567f)
            )
        ) {
            moveTo(8f, 13f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 14f, 2f, 13.327f, 2f, 12.5f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.553f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, 0.447f, 1f, 1f)
            verticalLineToRelative(4f)
            close()
            moveTo(9.69f, 2.442f)
            curveToRelative(0.587f, -0.586f, 1.536f, -0.586f, 2.122f, 0f)
            lineToRelative(1.752f, 1.752f)
            curveToRelative(0.585f, 0.586f, 0.585f, 1.535f, 0f, 2.121f)
            lineToRelative(-1.75f, 1.75f)
            curveToRelative(-0.585f, 0.585f, -1.535f, 0.585f, -2.12f, 0f)
            lineTo(7.942f, 6.311f)
            curveToRelative(-0.586f, -0.585f, -0.586f, -1.535f, 0f, -2.121f)
            lineTo(9.69f, 2.44f)
            close()
        }
    }.build()
}

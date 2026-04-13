package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Apps20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Apps20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF889096)
                ),
                start = Offset(3f, 3f),
                end = Offset(9.98337f, 10.4822f)
            )
        ) {
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(9f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineTo(9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(17f, 16.4643f),
                end = Offset(10.0523f, 9.97973f)
            )
        ) {
            moveTo(15.5f, 9.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(11f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55595E),
                    1f to Color(0xFF383B3D)
                ),
                start = Offset(3f, 9.5f),
                end = Offset(10.5f, 14.3214f)
            )
        ) {
            moveTo(10.5f, 16f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-5f)
            curveTo(3.672f, 17f, 3f, 16.328f, 3f, 15.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineTo(16f)
            close()
            moveToRelative(2.438f, -13.56f)
            curveToRelative(0.586f, -0.587f, 1.536f, -0.587f, 2.121f, 0f)
            lineToRelative(2.5f, 2.498f)
            curveToRelative(0.585f, 0.586f, 0.585f, 1.536f, 0f, 2.122f)
            lineToRelative(-2.5f, 2.498f)
            curveToRelative(-0.585f, 0.586f, -1.535f, 0.586f, -2.12f, 0f)
            lineToRelative(-2.5f, -2.498f)
            curveToRelative(-0.585f, -0.586f, -0.585f, -1.536f, 0f, -2.122f)
            lineToRelative(2.5f, -2.499f)
            close()
        }
    }.build()
}

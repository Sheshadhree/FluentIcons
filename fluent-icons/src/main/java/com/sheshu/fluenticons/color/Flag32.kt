package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Flag32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Flag32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFF63686E)
                ),
                start = Offset(7f, 32.2143f),
                end = Offset(6.23504f, 19.363f)
            )
        ) {
            moveTo(6f, 29f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-9f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(-0.250001f, -2.14286f),
                end = Offset(9.68828f, 22.1778f)
            )
        ) {
            moveTo(5f, 4.5f)
            curveTo(5f, 3.672f, 5.672f, 3f, 6.5f, 3f)
            horizontalLineTo(28f)
            curveToRelative(0.379f, 0f, 0.725f, 0.214f, 0.894f, 0.553f)
            curveToRelative(0.17f, 0.339f, 0.133f, 0.744f, -0.094f, 1.047f)
            lineTo(23.25f, 12f)
            lineToRelative(5.55f, 7.4f)
            curveToRelative(0.227f, 0.303f, 0.264f, 0.708f, 0.094f, 1.047f)
            curveTo(28.725f, 20.786f, 28.38f, 21f, 28f, 21f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 21f, 5f, 20.328f, 5f, 19.5f)
            verticalLineToRelative(-15f)
            close()
        }
    }.build()
}

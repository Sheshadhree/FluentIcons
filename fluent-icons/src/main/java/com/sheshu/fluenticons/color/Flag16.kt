package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Flag16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Flag16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFF63686E)
                ),
                start = Offset(4f, 15.4464f),
                end = Offset(3.68998f, 9.65947f)
            )
        ) {
            moveTo(3.5f, 14f)
            curveTo(3.224f, 14f, 3f, 13.776f, 3f, 13.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(4f)
            curveTo(4f, 13.776f, 3.776f, 14f, 3.5f, 14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(0.702932f, -0.285714f),
                end = Offset(5.16934f, 10.4745f)
            )
        ) {
            moveTo(13f, 10f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 10f, 3f, 9.776f, 3f, 9.5f)
            verticalLineToRelative(-7f)
            curveTo(3f, 2.224f, 3.224f, 2f, 3.5f, 2f)
            horizontalLineTo(13f)
            curveToRelative(0.407f, 0f, 0.643f, 0.46f, 0.407f, 0.79f)
            lineTo(11.114f, 6f)
            lineToRelative(2.293f, 3.21f)
            curveTo(13.643f, 9.54f, 13.407f, 10f, 13f, 10f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Flag28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Flag28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFF63686E)
                ),
                start = Offset(5.5f, 27.7321f),
                end = Offset(4.76383f, 16.8195f)
            )
        ) {
            moveTo(4.75f, 25f)
            curveTo(4.336f, 25f, 4f, 24.664f, 4f, 24.25f)
            verticalLineTo(16.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(7.75f)
            curveTo(5.5f, 24.664f, 5.164f, 25f, 4.75f, 25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(-0.375264f, -1.28571f),
                end = Offset(7.90628f, 18.9819f)
            )
        ) {
            moveTo(23.25f, 18f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 18f, 4f, 17.776f, 4f, 17.5f)
            verticalLineTo(3.75f)
            curveTo(4f, 3.336f, 4.336f, 3f, 4.75f, 3f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.59f, 0f, 0.95f, 0.65f, 0.635f, 1.15f)
            lineToRelative(-3.999f, 6.35f)
            lineToRelative(3.999f, 6.35f)
            curveTo(24.199f, 17.35f, 23.84f, 18f, 23.25f, 18f)
            close()
        }
    }.build()
}

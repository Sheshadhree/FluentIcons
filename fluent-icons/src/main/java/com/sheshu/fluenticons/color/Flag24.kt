package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Flag24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Flag24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFF63686E)
                ),
                start = Offset(4.5f, 24.0891f),
                end = Offset(4.06872f, 15.7287f)
            )
        ) {
            moveTo(4.5f, 21.25f)
            verticalLineTo(15.5f)
            horizontalLineTo(3.007f)
            lineTo(3f, 21.25f)
            lineToRelative(0.007f, 0.102f)
            curveTo(3.057f, 21.718f, 3.37f, 22f, 3.75f, 22f)
            lineToRelative(0.102f, -0.007f)
            curveTo(4.218f, 21.943f, 4.5f, 21.63f, 4.5f, 21.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(-0.938696f, -0.859795f),
                end = Offset(6.51571f, 17.3847f)
            )
        ) {
            moveTo(3.75f, 2.998f)
            curveTo(3.336f, 2.998f, 3f, 3.334f, 3f, 3.748f)
            verticalLineTo(16f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(16.754f)
            curveToRelative(0.618f, 0f, 0.971f, -0.705f, 0.6f, -1.2f)
            lineTo(16.69f, 9.75f)
            lineToRelative(4.164f, -5.552f)
            curveToRelative(0.371f, -0.494f, 0.018f, -1.2f, -0.6f, -1.2f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}

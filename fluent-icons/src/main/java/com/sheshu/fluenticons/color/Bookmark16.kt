package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Bookmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Bookmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(3.00171f, 3.01901f),
                end = Offset(9.30169f, 11.9137f)
            )
        ) {
            moveTo(3.78f, 13.919f)
            curveToRelative(-0.333f, 0.221f, -0.778f, -0.017f, -0.778f, -0.416f)
            verticalLineTo(4.012f)
            curveToRelative(0f, -1.103f, 0.893f, -1.998f, 1.996f, -2f)
            lineToRelative(6f, -0.011f)
            curveTo(12.103f, 1.999f, 13f, 2.893f, 13.002f, 3.997f)
            verticalLineToRelative(9.506f)
            curveToRelative(0f, 0.4f, -0.446f, 0.637f, -0.778f, 0.416f)
            lineToRelative(-4.222f, -2.82f)
            lineToRelative(-4.223f, 2.82f)
            close()
        }
    }.build()
}

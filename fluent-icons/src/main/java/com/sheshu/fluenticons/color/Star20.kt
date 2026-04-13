package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Star20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Star20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(18f, 17.9998f),
                end = Offset(1.54967f, 2.47706f)
            )
        ) {
            moveTo(9.104f, 2.899f)
            curveToRelative(0.367f, -0.744f, 1.427f, -0.744f, 1.794f, 0f)
            lineToRelative(1.93f, 3.911f)
            lineToRelative(4.317f, 0.628f)
            curveToRelative(0.82f, 0.119f, 1.148f, 1.127f, 0.554f, 1.705f)
            lineToRelative(-3.124f, 3.045f)
            lineToRelative(0.738f, 4.299f)
            curveToRelative(0.14f, 0.817f, -0.717f, 1.44f, -1.451f, 1.054f)
            lineToRelative(-3.86f, -2.03f)
            lineToRelative(-3.862f, 2.03f)
            curveToRelative(-0.733f, 0.386f, -1.59f, -0.237f, -1.45f, -1.054f)
            lineToRelative(0.737f, -4.3f)
            lineToRelative(-3.124f, -3.044f)
            curveTo(1.71f, 8.565f, 2.037f, 7.557f, 2.857f, 7.437f)
            lineTo(7.174f, 6.81f)
            lineToRelative(1.93f, -3.91f)
            close()
        }
    }.build()
}

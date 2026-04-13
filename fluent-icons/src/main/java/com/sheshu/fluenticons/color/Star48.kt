package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Star48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Star48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(43.9946f, 43.8562f),
                end = Offset(2.87925f, 5.05428f)
            )
        ) {
            moveTo(21.803f, 6.086f)
            curveToRelative(0.899f, -1.821f, 3.495f, -1.821f, 4.394f, 0f)
            lineToRelative(4.852f, 9.832f)
            lineToRelative(10.85f, 1.576f)
            curveToRelative(2.01f, 0.293f, 2.813f, 2.762f, 1.358f, 4.18f)
            lineToRelative(-7.85f, 7.653f)
            lineToRelative(1.853f, 10.806f)
            curveToRelative(0.343f, 2.001f, -1.758f, 3.528f, -3.555f, 2.583f)
            lineTo(24f, 37.614f)
            lineToRelative(-9.705f, 5.102f)
            curveToRelative(-1.797f, 0.945f, -3.898f, -0.582f, -3.555f, -2.583f)
            lineToRelative(1.854f, -10.806f)
            lineToRelative(-7.851f, -7.654f)
            curveTo(3.287f, 20.256f, 4.09f, 17.788f, 6.1f, 17.495f)
            lineToRelative(10.85f, -1.577f)
            lineToRelative(4.853f, -9.832f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Heart48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Heart48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(-4.7522f, -1.7126f),
                end = Offset(15.6899f, 42.4296f)
            )
        ) {
            moveTo(21.262f, 10.178f)
            curveTo(17.57f, 7.388f, 12.508f, 7.27f, 8.688f, 9.882f)
            curveToRelative(-5.65f, 3.866f, -6.308f, 11.953f, -1.357f, 16.681f)
            lineToRelative(15.806f, 15.092f)
            curveToRelative(0.483f, 0.461f, 1.243f, 0.461f, 1.726f, 0f)
            lineToRelative(15.803f, -15.091f)
            curveToRelative(4.952f, -4.729f, 4.293f, -12.816f, -1.358f, -16.681f)
            curveToRelative(-3.82f, -2.614f, -8.884f, -2.494f, -12.577f, 0.298f)
            lineTo(24f, 12.246f)
            lineToRelative(-2.738f, -2.068f)
            close()
        }
    }.build()
}

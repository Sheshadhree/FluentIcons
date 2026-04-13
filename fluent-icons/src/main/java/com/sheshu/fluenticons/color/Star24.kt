package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Star24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Star24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(21.9942f, 21.9276f),
                end = Offset(1.4273f, 2.53037f)
            )
        ) {
            moveTo(10.788f, 3.103f)
            curveToRelative(0.495f, -1.004f, 1.926f, -1.004f, 2.421f, 0f)
            lineToRelative(2.358f, 4.777f)
            lineToRelative(5.273f, 0.766f)
            curveToRelative(1.107f, 0.161f, 1.549f, 1.522f, 0.748f, 2.303f)
            lineToRelative(-3.816f, 3.72f)
            lineToRelative(0.901f, 5.25f)
            curveToRelative(0.19f, 1.103f, -0.968f, 1.944f, -1.959f, 1.424f)
            lineToRelative(-4.716f, -2.48f)
            lineToRelative(-4.715f, 2.48f)
            curveToRelative(-0.99f, 0.52f, -2.148f, -0.32f, -1.96f, -1.424f)
            lineToRelative(0.901f, -5.25f)
            lineToRelative(-3.815f, -3.72f)
            curveTo(1.608f, 10.17f, 2.05f, 8.807f, 3.157f, 8.646f)
            lineTo(8.43f, 7.88f)
            lineToRelative(2.358f, -4.777f)
            close()
        }
    }.build()
}

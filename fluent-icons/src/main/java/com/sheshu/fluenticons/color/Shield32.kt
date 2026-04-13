package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Shield32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Shield32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFF0FAFFF),
                    0.529425f to Color(0xFF367AF2),
                    0.682436f to Color(0xFF5750E2),
                    0.860903f to Color(0xFFCC23D1)
                ),
                center = Offset(-7.21429f, -13.7486f),
                radius = 67.3559f
            )
        ) {
            moveTo(16.555f, 2.168f)
            curveToRelative(-0.336f, -0.224f, -0.774f, -0.224f, -1.11f, 0f)
            curveToRelative(-2.916f, 1.944f, -6.76f, 3.859f, -11.544f, 4.337f)
            curveTo(3.389f, 6.556f, 3f, 6.986f, 3f, 7.5f)
            verticalLineTo(16f)
            curveToRelative(0f, 3.88f, 2.124f, 7.17f, 4.701f, 9.546f)
            curveToRelative(2.572f, 2.372f, 5.737f, 3.971f, 8.115f, 4.417f)
            lineTo(16f, 29.997f)
            lineToRelative(0.184f, -0.034f)
            curveToRelative(2.378f, -0.446f, 5.543f, -2.045f, 8.115f, -4.417f)
            curveTo(26.876f, 23.17f, 29f, 19.88f, 29f, 16f)
            verticalLineTo(7.5f)
            curveToRelative(0f, -0.514f, -0.39f, -0.944f, -0.9f, -0.995f)
            curveToRelative(-4.785f, -0.478f, -8.63f, -2.393f, -11.545f, -4.337f)
            close()
        }
    }.build()
}

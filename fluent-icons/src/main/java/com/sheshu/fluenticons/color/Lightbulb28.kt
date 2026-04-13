package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Lightbulb28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Lightbulb28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.376456f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(8.45726f, 7.44946f),
                radius = 18.4961f
            )
        ) {
            moveTo(18.421f, 21.5f)
            lineToRelative(-0.482f, 2.008f)
            curveTo(17.59f, 24.97f, 16.282f, 26f, 14.78f, 26f)
            horizontalLineToRelative(-1.56f)
            curveToRelative(-1.503f, 0f, -2.81f, -1.03f, -3.16f, -2.492f)
            lineTo(9.579f, 21.5f)
            horizontalLineToRelative(8.842f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD34719),
                    1f to Color(0x00D34719)
                ),
                start = Offset(13.9992f, 21.5f),
                end = Offset(13.9996f, 25.9997f)
            )
        ) {
            moveTo(18.421f, 21.5f)
            lineToRelative(-0.482f, 2.008f)
            curveTo(17.59f, 24.97f, 16.282f, 26f, 14.78f, 26f)
            horizontalLineToRelative(-1.56f)
            curveToRelative(-1.503f, 0f, -2.81f, -1.03f, -3.16f, -2.492f)
            lineTo(9.579f, 21.5f)
            horizontalLineToRelative(8.842f)
            close()
            moveTo(14f, 2f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            curveToRelative(0f, 2.765f, 1.248f, 5.24f, 3.21f, 6.89f)
            curveToRelative(0.402f, 0.339f, 0.679f, 0.736f, 0.78f, 1.158f)
            lineTo(9.46f, 21f)
            horizontalLineToRelative(9.082f)
            lineToRelative(0.469f, -1.952f)
            curveToRelative(0.101f, -0.422f, 0.378f, -0.819f, 0.78f, -1.158f)
            curveTo(21.753f, 16.24f, 23f, 13.765f, 23f, 11f)
            curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC7A3),
                    1f to Color(0xFFFF9C70)
                ),
                start = Offset(13.2627f, 21.0958f),
                end = Offset(14.4484f, 24.0446f)
            )
        ) {
            moveTo(18.661f, 20.5f)
            horizontalLineTo(9.34f)
            lineTo(9.7f, 22f)
            horizontalLineToRelative(8.6f)
            lineToRelative(0.36f, -1.5f)
            close()
        }
    }.build()
}

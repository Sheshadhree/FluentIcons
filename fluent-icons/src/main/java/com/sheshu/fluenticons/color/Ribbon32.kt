package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Ribbon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Ribbon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF)
                ),
                center = Offset(16f, 17.6455f),
                radius = 16.8444f
            )
        ) {
            moveTo(10f, 19.313f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.36f, 0.194f, 0.693f, 0.507f, 0.87f)
            curveToRelative(0.314f, 0.178f, 0.699f, 0.173f, 1.008f, -0.012f)
            lineTo(16f, 27.166f)
            lineToRelative(4.485f, 2.692f)
            curveToRelative(0.31f, 0.185f, 0.694f, 0.19f, 1.008f, 0.012f)
            curveTo(21.806f, 29.693f, 22f, 29.36f, 22f, 29f)
            verticalLineToRelative(-9.687f)
            curveTo(20.253f, 20.383f, 18.199f, 21f, 16f, 21f)
            reflectiveCurveToRelative(-4.253f, -0.617f, -6f, -1.687f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-37.2143f, -68f),
                radius = 111.635f
            )
        ) {
            moveTo(22f, 20f)
            curveToRelative(-1.671f, 1.256f, -3.749f, 2f, -6f, 2f)
            reflectiveCurveToRelative(-4.329f, -0.744f, -6f, -2f)
            curveToRelative(-0.123f, -0.091f, -0.243f, -0.186f, -0.36f, -0.284f)
            curveTo(7.416f, 17.883f, 6f, 15.107f, 6f, 12f)
            curveTo(6f, 6.477f, 10.477f, 2f, 16f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            curveToRelative(0f, 3.272f, -1.571f, 6.176f, -4f, 8f)
            close()
        }
    }.build()
}

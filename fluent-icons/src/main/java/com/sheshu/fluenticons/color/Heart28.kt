package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Heart28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Heart28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(-3.25f, -2f),
                end = Offset(9.61249f, 24.98f)
            )
        ) {
            moveTo(14.604f, 6.193f)
            curveToRelative(2.601f, -2.932f, 7.184f, -2.922f, 9.772f, 0.02f)
            curveToRelative(2.263f, 2.574f, 2.148f, 6.459f, -0.263f, 8.893f)
            lineToRelative(-9.58f, 9.672f)
            curveTo(14.392f, 24.92f, 14.2f, 25f, 14f, 25f)
            reflectiveCurveToRelative(-0.392f, -0.08f, -0.533f, -0.222f)
            lineToRelative(-9.58f, -9.672f)
            curveToRelative(-2.41f, -2.434f, -2.526f, -6.32f, -0.263f, -8.892f)
            curveToRelative(2.588f, -2.943f, 7.17f, -2.953f, 9.772f, -0.021f)
            lineTo(14f, 6.873f)
            lineToRelative(0.604f, -0.68f)
            close()
        }
    }.build()
}

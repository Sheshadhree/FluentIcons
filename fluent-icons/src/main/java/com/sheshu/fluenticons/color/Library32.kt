package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Library32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Library32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-17.9998f, 3f),
                end = Offset(-16.2863f, 38.0669f)
            )
        ) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(8.88f, 3f, 10f, 4.12f, 10f, 5.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-2f)
            curveTo(4.12f, 29f, 3f, 27.88f, 3f, 26.5f)
            verticalLineToRelative(-21f)
            close()
            moveToRelative(9f, 0f)
            curveTo(12f, 4.12f, 13.12f, 3f, 14.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(17.88f, 3f, 19f, 4.12f, 19f, 5.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-21f)
            close()
            moveToRelative(9.8f, 2.105f)
            curveToRelative(-1.295f, 0.358f, -2.064f, 1.733f, -1.717f, 3.07f)
            lineToRelative(4.27f, 16.466f)
            curveToRelative(0.348f, 1.338f, 1.678f, 2.131f, 2.973f, 1.773f)
            lineToRelative(1.875f, -0.52f)
            curveToRelative(1.294f, -0.357f, 2.063f, -1.732f, 1.716f, -3.07f)
            lineTo(26.647f, 8.86f)
            curveToRelative(-0.348f, -1.338f, -1.678f, -2.131f, -2.973f, -1.773f)
            lineTo(21.8f, 7.606f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(12f, 2.2666f),
                end = Offset(20.4933f, 5.25305f)
            )
        ) {
            moveTo(3f, 8f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(3f)
            horizontalLineTo(3f)
            verticalLineTo(8f)
            close()
            moveToRelative(24.296f, 3.365f)
            lineTo(20.72f, 13.13f)
            lineToRelative(0.753f, 2.904f)
            lineToRelative(6.576f, -1.764f)
            lineToRelative(-0.753f, -2.904f)
            close()
            moveTo(19f, 8f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(7f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}

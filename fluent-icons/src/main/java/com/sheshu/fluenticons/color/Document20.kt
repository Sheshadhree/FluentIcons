package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Document20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Document20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF4894FE)
                ),
                start = Offset(12.4f, 2f),
                end = Offset(13.782f, 15.4789f)
            )
        ) {
            moveTo(10f, 2f)
            lineToRelative(2f, 4f)
            lineToRelative(4f, 2f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 18f, 4f, 17.328f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.362364f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(16.5f, 2.5f),
                radius = 9.75567f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(10f, 2f)
            lineToRelative(2f, 4f)
            lineToRelative(4f, 2f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 18f, 4f, 17.328f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(13f, 4.5f),
                end = Offset(11.5f, 7f)
            )
        ) {
            moveTo(10.01f, 6.5f)
            verticalLineTo(2f)
            lineToRelative(6f, 6f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            close()
        }
    }.build()
}

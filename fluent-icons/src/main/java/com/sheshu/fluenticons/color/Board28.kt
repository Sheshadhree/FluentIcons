package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Board28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Board28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF52D17C)
                ),
                start = Offset(9f, 14.0909f),
                end = Offset(14.5766f, 28.121f)
            )
        ) {
            moveTo(25f, 18f)
            lineToRelative(-5.5f, -1f)
            lineToRelative(-5.5f, 1f)
            lineToRelative(-1f, 3.5f)
            lineToRelative(1f, 3.5f)
            horizontalLineToRelative(7.25f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(18f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF309C61)
                ),
                start = Offset(15.4f, 4.66667f),
                end = Offset(24.3563f, 15.5461f)
            )
        ) {
            moveTo(14f, 3f)
            lineToRelative(-1f, 7.5f)
            lineToRelative(1f, 7.5f)
            horizontalLineToRelative(11f)
            verticalLineTo(6.75f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineTo(14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(4.57143f, 12.3684f),
                end = Offset(13.1872f, 21.1094f)
            )
        ) {
            moveTo(14f, 25f)
            verticalLineTo(11f)
            lineToRelative(-5.5f, -1f)
            lineTo(3f, 11f)
            verticalLineToRelative(10.25f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineTo(14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF64DE89)
                ),
                start = Offset(4.57143f, 4.6f),
                end = Offset(7.92738f, 12.5654f)
            )
        ) {
            moveTo(14f, 3f)
            verticalLineToRelative(8f)
            horizontalLineTo(3f)
            verticalLineTo(6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineTo(14f)
            close()
        }
    }.build()
}

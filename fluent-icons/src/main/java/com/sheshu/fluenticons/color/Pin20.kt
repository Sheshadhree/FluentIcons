package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Pin20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Pin20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.113865f to Color(0xFF7B7BFF),
                    0.559383f to Color(0xFF102784)
                ),
                start = Offset(4.3125f, 15.687f),
                end = Offset(11.096f, 10.2794f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.03f, 11.97f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-3.75f, 3.75f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.75f, -3.75f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF1384B1)
                ),
                start = Offset(3.91031f, 4.76524f),
                end = Offset(13.9713f, 15.2183f)
            )
        ) {
            moveTo(13.325f, 2.618f)
            curveToRelative(-0.965f, -0.965f, -2.592f, -0.701f, -3.203f, 0.52f)
            lineTo(8.393f, 6.596f)
            curveTo(8.23f, 6.925f, 7.95f, 7.182f, 7.608f, 7.318f)
            lineToRelative(-3.59f, 1.436f)
            curveTo(3.353f, 9.021f, 3.176f, 9.882f, 3.684f, 10.39f)
            lineToRelative(5.928f, 5.927f)
            curveToRelative(0.507f, 0.508f, 1.368f, 0.331f, 1.635f, -0.335f)
            lineToRelative(1.436f, -3.59f)
            curveToRelative(0.136f, -0.342f, 0.393f, -0.62f, 0.722f, -0.785f)
            lineToRelative(3.458f, -1.73f)
            curveToRelative(1.221f, -0.61f, 1.486f, -2.237f, 0.52f, -3.202f)
            lineToRelative(-4.057f, -4.057f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE362F8),
                    1f to Color(0x009966FF)
                ),
                center = Offset(14.6477f, 13.7314f),
                radius = 6.48046f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(13.325f, 2.618f)
            curveToRelative(-0.965f, -0.965f, -2.592f, -0.701f, -3.203f, 0.52f)
            lineTo(8.393f, 6.596f)
            curveTo(8.23f, 6.925f, 7.95f, 7.182f, 7.608f, 7.318f)
            lineToRelative(-3.59f, 1.436f)
            curveTo(3.353f, 9.021f, 3.176f, 9.882f, 3.684f, 10.39f)
            lineToRelative(5.928f, 5.927f)
            curveToRelative(0.507f, 0.508f, 1.368f, 0.331f, 1.635f, -0.335f)
            lineToRelative(1.436f, -3.59f)
            curveToRelative(0.136f, -0.342f, 0.393f, -0.62f, 0.722f, -0.785f)
            lineToRelative(3.458f, -1.73f)
            curveToRelative(1.221f, -0.61f, 1.486f, -2.237f, 0.52f, -3.202f)
            lineToRelative(-4.057f, -4.057f)
            close()
        }
    }.build()
}

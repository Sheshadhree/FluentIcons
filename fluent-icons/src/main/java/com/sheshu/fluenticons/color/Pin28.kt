package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Pin28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Pin28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.449f to Color(0xFF7B7BFF),
                    1f to Color(0xFF102784)
                ),
                start = Offset(4.88258f, 23.1168f),
                end = Offset(11.6945f, 17.9075f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.53f, 18.53f)
            lineToRelative(-6.25f, 6.25f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(6.25f, -6.25f)
            lineToRelative(1.06f, 1.06f)
            close()
        }
        path(fill = SolidColor(Color(0xFFD9D9D9))) {
            moveTo(19.039f, 3.478f)
            curveToRelative(-1.59f, -1.59f, -4.274f, -1.124f, -5.236f, 0.907f)
            lineToRelative(-2.553f, 5.39f)
            curveToRelative(-0.192f, 0.406f, -0.534f, 0.723f, -0.953f, 0.884f)
            lineToRelative(-4.13f, 1.588f)
            curveToRelative(-1.182f, 0.455f, -1.505f, 1.976f, -0.61f, 2.871f)
            lineToRelative(7.324f, 7.324f)
            curveToRelative(0.896f, 0.895f, 2.417f, 0.573f, 2.871f, -0.61f)
            lineToRelative(1.589f, -4.13f)
            curveToRelative(0.161f, -0.419f, 0.478f, -0.76f, 0.884f, -0.953f)
            lineToRelative(5.39f, -2.553f)
            curveToRelative(2.031f, -0.962f, 2.496f, -3.646f, 0.907f, -5.235f)
            lineToRelative(-5.483f, -5.483f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF1384B1)
                ),
                start = Offset(5.77407f, 6.35598f),
                end = Offset(19.8731f, 21.0043f)
            )
        ) {
            moveTo(19.039f, 3.478f)
            curveToRelative(-1.59f, -1.59f, -4.274f, -1.124f, -5.236f, 0.907f)
            lineToRelative(-2.553f, 5.39f)
            curveToRelative(-0.192f, 0.406f, -0.534f, 0.723f, -0.953f, 0.884f)
            lineToRelative(-4.13f, 1.588f)
            curveToRelative(-1.182f, 0.455f, -1.505f, 1.976f, -0.61f, 2.871f)
            lineToRelative(7.324f, 7.324f)
            curveToRelative(0.896f, 0.895f, 2.417f, 0.573f, 2.871f, -0.61f)
            lineToRelative(1.589f, -4.13f)
            curveToRelative(0.161f, -0.419f, 0.478f, -0.76f, 0.884f, -0.953f)
            lineToRelative(5.39f, -2.553f)
            curveToRelative(2.031f, -0.962f, 2.496f, -3.646f, 0.907f, -5.235f)
            lineToRelative(-5.483f, -5.483f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE362F8),
                    1f to Color(0x009966FF)
                ),
                center = Offset(20.8209f, 18.9207f),
                radius = 9.0814f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(19.039f, 3.478f)
            curveToRelative(-1.59f, -1.59f, -4.274f, -1.124f, -5.236f, 0.907f)
            lineToRelative(-2.553f, 5.39f)
            curveToRelative(-0.192f, 0.406f, -0.534f, 0.723f, -0.953f, 0.884f)
            lineToRelative(-4.13f, 1.588f)
            curveToRelative(-1.182f, 0.455f, -1.505f, 1.976f, -0.61f, 2.871f)
            lineToRelative(7.324f, 7.324f)
            curveToRelative(0.896f, 0.895f, 2.417f, 0.573f, 2.871f, -0.61f)
            lineToRelative(1.589f, -4.13f)
            curveToRelative(0.161f, -0.419f, 0.478f, -0.76f, 0.884f, -0.953f)
            lineToRelative(5.39f, -2.553f)
            curveToRelative(2.031f, -0.962f, 2.496f, -3.646f, 0.907f, -5.235f)
            lineToRelative(-5.483f, -5.483f)
            close()
        }
    }.build()
}

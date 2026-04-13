package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ArrowSync20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ArrowSync20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF22918B),
                    1f to Color(0xFF20AC9D)
                ),
                start = Offset(14f, 16.5f),
                end = Offset(6f, -2.25147E-7f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.293f, 0.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(0.701f, -0.701f)
            curveTo(6.437f, 5.065f, 4.5f, 7.306f, 4.5f, 10f)
            curveToRelative(0f, 1.7f, 0.77f, 3.22f, 1.986f, 4.231f)
            curveToRelative(0.425f, 0.353f, 0.482f, 0.984f, 0.13f, 1.408f)
            curveToRelative(-0.354f, 0.425f, -0.984f, 0.483f, -1.409f, 0.13f)
            curveTo(3.555f, 14.395f, 2.5f, 12.32f, 2.5f, 10f)
            curveToRelative(0f, -3.85f, 2.9f, -7.022f, 6.635f, -7.45f)
            lineTo(8.293f, 1.706f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            close()
            moveToRelative(5.12f, 4.085f)
            curveToRelative(0.355f, -0.423f, 0.986f, -0.478f, 1.409f, -0.123f)
            curveTo(16.458f, 5.63f, 17.5f, 7.694f, 17.5f, 10f)
            curveToRelative(0f, 3.85f, -2.9f, 7.022f, -6.635f, 7.45f)
            lineToRelative(0.842f, 0.843f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-0.701f, 0.701f)
            curveTo(13.563f, 14.935f, 15.5f, 12.694f, 15.5f, 10f)
            curveToRelative(0f, -1.69f, -0.762f, -3.203f, -1.965f, -4.213f)
            curveToRelative(-0.422f, -0.356f, -0.477f, -0.986f, -0.122f, -1.41f)
            close()
        }
    }.build()
}

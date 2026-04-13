package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Pin24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Pin24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.449f to Color(0xFF7B7BFF),
                    1f to Color(0xFF102784)
                ),
                start = Offset(4.63258f, 19.3669f),
                end = Offset(9.49575f, 15.6484f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.53f, 15.53f)
            lineToRelative(-5.25f, 5.25f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(5.25f, -5.25f)
            lineToRelative(1.06f, 1.06f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF1384B1)
                ),
                start = Offset(4.60776f, 5.48333f),
                end = Offset(16.965f, 18.322f)
            )
        ) {
            moveTo(21.068f, 7.758f)
            lineToRelative(-4.826f, -4.826f)
            curveToRelative(-1.327f, -1.327f, -3.564f, -0.964f, -4.404f, 0.715f)
            lineToRelative(-2.435f, 4.87f)
            curveToRelative(-0.088f, 0.176f, -0.24f, 0.31f, -0.426f, 0.374f)
            lineToRelative(-4.166f, 1.44f)
            curveToRelative(-0.873f, 0.3f, -1.129f, 1.412f, -0.476f, 2.065f)
            lineToRelative(7.27f, 7.27f)
            curveToRelative(0.652f, 0.652f, 1.763f, 0.396f, 2.065f, -0.477f)
            lineToRelative(1.44f, -4.166f)
            curveToRelative(0.063f, -0.185f, 0.197f, -0.338f, 0.373f, -0.426f)
            lineToRelative(4.87f, -2.435f)
            curveToRelative(1.68f, -0.84f, 2.042f, -3.077f, 0.715f, -4.404f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE362F8),
                    1f to Color(0x009966FF)
                ),
                center = Offset(17.7957f, 16.4958f),
                radius = 7.95948f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(21.068f, 7.758f)
            lineToRelative(-4.826f, -4.826f)
            curveToRelative(-1.327f, -1.327f, -3.564f, -0.964f, -4.404f, 0.715f)
            lineToRelative(-2.435f, 4.87f)
            curveToRelative(-0.088f, 0.176f, -0.24f, 0.31f, -0.426f, 0.374f)
            lineToRelative(-4.166f, 1.44f)
            curveToRelative(-0.873f, 0.3f, -1.129f, 1.412f, -0.476f, 2.065f)
            lineToRelative(7.27f, 7.27f)
            curveToRelative(0.652f, 0.652f, 1.763f, 0.396f, 2.065f, -0.477f)
            lineToRelative(1.44f, -4.166f)
            curveToRelative(0.063f, -0.185f, 0.197f, -0.338f, 0.373f, -0.426f)
            lineToRelative(4.87f, -2.435f)
            curveToRelative(1.68f, -0.84f, 2.042f, -3.077f, 0.715f, -4.404f)
            close()
        }
    }.build()
}

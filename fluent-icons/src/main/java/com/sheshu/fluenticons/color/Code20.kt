package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Code20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Code20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFC76EFB),
                    1f to Color(0xFF8B52F4)
                ),
                start = Offset(2f, 1.5f),
                end = Offset(19f, 18f)
            )
        ) {
            moveTo(12.859f, 2.567f)
            curveToRelative(0.515f, 0.198f, 0.773f, 0.776f, 0.574f, 1.292f)
            lineToRelative(-5f, 13f)
            curveToRelative(-0.198f, 0.515f, -0.776f, 0.773f, -1.292f, 0.574f)
            curveToRelative(-0.516f, -0.198f, -0.773f, -0.776f, -0.574f, -1.292f)
            lineToRelative(5f, -13f)
            curveToRelative(0.198f, -0.515f, 0.777f, -0.773f, 1.292f, -0.574f)
            close()
            moveTo(6.15f, 5.74f)
            curveTo(6.57f, 6.1f, 6.62f, 6.732f, 6.26f, 7.15f)
            lineTo(3.816f, 10f)
            lineToRelative(2.442f, 2.85f)
            curveToRelative(0.36f, 0.419f, 0.311f, 1.05f, -0.108f, 1.41f)
            curveToRelative(-0.42f, 0.359f, -1.05f, 0.31f, -1.41f, -0.11f)
            lineToRelative(-3f, -3.5f)
            curveToRelative(-0.321f, -0.374f, -0.321f, -0.926f, 0f, -1.3f)
            lineToRelative(3f, -3.5f)
            curveTo(5.1f, 5.43f, 5.73f, 5.38f, 6.15f, 5.74f)
            close()
            moveToRelative(7.59f, 1.41f)
            curveToRelative(-0.359f, -0.419f, -0.31f, -1.05f, 0.11f, -1.41f)
            curveToRelative(0.418f, -0.359f, 1.05f, -0.31f, 1.41f, 0.11f)
            lineToRelative(3f, 3.5f)
            curveToRelative(0.32f, 0.374f, 0.32f, 0.926f, 0f, 1.3f)
            lineToRelative(-3f, 3.5f)
            curveToRelative(-0.36f, 0.42f, -0.992f, 0.469f, -1.41f, 0.11f)
            curveToRelative(-0.42f, -0.36f, -0.469f, -0.991f, -0.11f, -1.41f)
            lineTo(16.184f, 10f)
            lineTo(13.74f, 7.15f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Star48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Star48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.803f, 6.085f)
            curveToRelative(0.899f, -1.82f, 3.495f, -1.82f, 4.394f, 0f)
            lineToRelative(4.852f, 9.832f)
            lineToRelative(10.85f, 1.577f)
            curveToRelative(2.01f, 0.292f, 2.813f, 2.762f, 1.358f, 4.179f)
            lineToRelative(-7.85f, 7.653f)
            lineToRelative(1.853f, 10.806f)
            curveToRelative(0.343f, 2.002f, -1.758f, 3.528f, -3.555f, 2.583f)
            lineTo(24f, 37.613f)
            lineToRelative(-9.705f, 5.102f)
            curveToRelative(-1.797f, 0.945f, -3.898f, -0.581f, -3.555f, -2.583f)
            lineToRelative(1.854f, -10.806f)
            lineToRelative(-7.851f, -7.653f)
            curveTo(3.287f, 20.256f, 4.09f, 17.786f, 6.1f, 17.494f)
            lineToRelative(10.85f, -1.577f)
            lineToRelative(4.853f, -9.832f)
            close()
            moveTo(24f, 7.283f)
            lineToRelative(-4.82f, 9.764f)
            curveToRelative(-0.356f, 0.723f, -1.046f, 1.225f, -1.844f, 1.34f)
            lineTo(6.56f, 19.954f)
            lineToRelative(7.798f, 7.601f)
            curveToRelative(0.577f, 0.563f, 0.84f, 1.374f, 0.704f, 2.169f)
            lineToRelative(-1.84f, 10.732f)
            lineToRelative(9.638f, -5.067f)
            curveToRelative(0.714f, -0.375f, 1.566f, -0.375f, 2.28f, 0f)
            lineToRelative(9.638f, 5.067f)
            lineToRelative(-1.84f, -10.732f)
            curveToRelative(-0.137f, -0.795f, 0.127f, -1.606f, 0.704f, -2.169f)
            lineToRelative(7.798f, -7.6f)
            lineToRelative(-10.776f, -1.566f)
            curveToRelative(-0.798f, -0.116f, -1.488f, -0.618f, -1.845f, -1.34f)
            lineTo(24f, 7.282f)
            close()
        }
    }.build()
}

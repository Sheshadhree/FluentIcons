package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Star48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Star48",
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
        }
    }.build()
}

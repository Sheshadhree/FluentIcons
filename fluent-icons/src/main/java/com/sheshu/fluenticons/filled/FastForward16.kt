package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FastForward16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FastForward16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 4.465f)
            curveTo(8f, 3.654f, 8.914f, 3.18f, 9.576f, 3.648f)
            lineToRelative(5.012f, 3.535f)
            curveToRelative(0.565f, 0.398f, 0.565f, 1.236f, 0f, 1.634f)
            lineToRelative(-5.012f, 3.536f)
            curveTo(8.914f, 12.82f, 8f, 12.346f, 8f, 11.536f)
            verticalLineTo(9.232f)
            lineToRelative(-4.424f, 3.12f)
            curveTo(2.914f, 12.82f, 2f, 12.347f, 2f, 11.537f)
            verticalLineTo(4.465f)
            curveTo(2f, 3.654f, 2.914f, 3.18f, 3.576f, 3.648f)
            lineTo(8f, 6.768f)
            verticalLineTo(4.465f)
            close()
        }
    }.build()
}

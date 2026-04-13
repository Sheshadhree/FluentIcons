package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rewind16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rewind16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 4.465f)
            curveTo(8f, 3.654f, 7.086f, 3.18f, 6.424f, 3.648f)
            lineTo(1.412f, 7.183f)
            curveToRelative(-0.565f, 0.398f, -0.565f, 1.236f, 0f, 1.634f)
            lineToRelative(5.012f, 3.536f)
            curveTo(7.086f, 12.82f, 8f, 12.346f, 8f, 11.536f)
            verticalLineTo(9.232f)
            lineToRelative(4.424f, 3.12f)
            curveTo(13.086f, 12.82f, 14f, 12.347f, 14f, 11.537f)
            verticalLineTo(4.465f)
            curveToRelative(0f, -0.811f, -0.914f, -1.285f, -1.576f, -0.817f)
            lineTo(8f, 6.768f)
            verticalLineTo(4.465f)
            close()
        }
    }.build()
}

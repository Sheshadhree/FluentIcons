package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Play48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Play48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.75f, 8.412f)
            lineToRelative(24.417f, 12.705f)
            curveToRelative(1.593f, 0.828f, 2.212f, 2.79f, 1.383f, 4.383f)
            curveToRelative(-0.308f, 0.592f, -0.79f, 1.075f, -1.383f, 1.383f)
            lineTo(16.75f, 39.588f)
            curveToRelative(-1.592f, 0.828f, -3.555f, 0.209f, -4.383f, -1.383f)
            curveTo(12.126f, 37.74f, 12f, 37.227f, 12f, 36.705f)
            verticalLineToRelative(-25.41f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            curveToRelative(0.448f, 0f, 0.89f, 0.092f, 1.299f, 0.27f)
            lineToRelative(0.201f, 0.097f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Play48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Play48",
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
            moveToRelative(-1.154f, 2.218f)
            lineToRelative(-0.11f, -0.047f)
            curveToRelative(-0.076f, -0.025f, -0.156f, -0.038f, -0.236f, -0.038f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(25.41f)
            curveToRelative(0f, 0.12f, 0.029f, 0.239f, 0.085f, 0.346f)
            curveToRelative(0.19f, 0.367f, 0.644f, 0.51f, 1.011f, 0.319f)
            lineToRelative(24.417f, -12.705f)
            curveToRelative(0.137f, -0.071f, 0.248f, -0.182f, 0.32f, -0.32f)
            curveToRelative(0.19f, -0.366f, 0.048f, -0.82f, -0.32f, -1.01f)
            lineTo(15.596f, 10.63f)
            close()
        }
    }.build()
}

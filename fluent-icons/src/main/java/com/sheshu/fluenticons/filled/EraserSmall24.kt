package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EraserSmall24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EraserSmall24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.651f, 2.638f)
            curveToRelative(0.886f, -0.878f, 2.317f, -0.867f, 3.19f, 0.023f)
            lineToRelative(4.91f, 5.008f)
            curveToRelative(0.861f, 0.878f, 0.858f, 2.285f, -0.007f, 3.158f)
            lineToRelative(-2.257f, 2.281f)
            curveTo(18.169f, 13.037f, 17.839f, 13f, 17.5f, 13f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            curveToRelative(0f, 0.356f, 0.041f, 0.701f, 0.119f, 1.033f)
            lineToRelative(-1.784f, 1.803f)
            curveToRelative(-0.872f, 0.88f, -2.292f, 0.891f, -3.176f, 0.023f)
            lineToRelative(-5.1f, -5.008f)
            curveToRelative(-0.895f, -0.879f, -0.898f, -2.32f, -0.006f, -3.204f)
            lineToRelative(9.598f, -9.508f)
            close()
            moveTo(4.108f, 13.212f)
            curveToRelative(-0.297f, 0.294f, -0.296f, 0.775f, 0.003f, 1.068f)
            lineToRelative(5.099f, 5.008f)
            curveToRelative(0.294f, 0.289f, 0.768f, 0.285f, 1.058f, -0.008f)
            lineToRelative(1.468f, -1.483f)
            lineToRelative(-6.099f, -6.1f)
            lineToRelative(-1.529f, 1.515f)
            close()
            moveTo(17.5f, 21f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -1.934f, -1.567f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveTo(14f, 15.566f, 14f, 17.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            close()
        }
    }.build()
}

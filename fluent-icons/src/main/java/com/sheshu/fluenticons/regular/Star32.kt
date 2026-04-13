package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Star32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Star32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.257f, 12.34f)
            lineToRelative(6.174f, 0.903f)
            lineToRelative(-4.476f, 4.39f)
            curveToRelative(-0.468f, 0.459f, -0.681f, 1.118f, -0.57f, 1.764f)
            lineToRelative(1.053f, 6.183f)
            lineToRelative(-5.502f, -2.91f)
            curveToRelative(-0.585f, -0.31f, -1.285f, -0.31f, -1.87f, 0f)
            lineToRelative(-5.502f, 2.91f)
            lineToRelative(1.054f, -6.183f)
            curveToRelative(0.11f, -0.646f, -0.103f, -1.305f, -0.57f, -1.764f)
            lineToRelative(-4.477f, -4.39f)
            lineToRelative(6.174f, -0.903f)
            curveToRelative(0.653f, -0.095f, 1.216f, -0.506f, 1.507f, -1.098f)
            lineToRelative(2.75f, -5.607f)
            lineToRelative(2.749f, 5.607f)
            curveToRelative(0.29f, 0.592f, 0.854f, 1.002f, 1.506f, 1.098f)
            close()
            moveToRelative(-2.909f, -8.5f)
            curveToRelative(-0.549f, -1.12f, -2.144f, -1.12f, -2.693f, 0f)
            lineToRelative(-3.2f, 6.52f)
            lineToRelative(-7.17f, 1.05f)
            curveToRelative(-1.228f, 0.179f, -1.72f, 1.686f, -0.834f, 2.555f)
            lineToRelative(5.196f, 5.096f)
            lineToRelative(-1.225f, 7.183f)
            curveToRelative(-0.209f, 1.227f, 1.08f, 2.16f, 2.18f, 1.578f)
            lineToRelative(6.4f, -3.385f)
            lineToRelative(6.398f, 3.385f)
            curveToRelative(1.1f, 0.582f, 2.39f, -0.351f, 2.18f, -1.578f)
            lineToRelative(-1.224f, -7.183f)
            lineToRelative(5.195f, -5.096f)
            curveToRelative(0.886f, -0.87f, 0.394f, -2.376f, -0.833f, -2.556f)
            lineToRelative(-7.171f, -1.048f)
            lineToRelative(-3.199f, -6.522f)
            close()
        }
    }.build()
}

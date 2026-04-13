package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HeartCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 22f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            close()
            moveToRelative(-0.304f, -5.144f)
            lineTo(7.59f, 12.064f)
            curveTo(6.815f, 11.159f, 6.8f, 9.828f, 7.553f, 8.905f)
            curveToRelative(0.913f, -1.116f, 2.585f, -1.212f, 3.62f, -0.208f)
            lineTo(12f, 9.5f)
            lineToRelative(0.827f, -0.803f)
            curveToRelative(1.034f, -1.004f, 2.707f, -0.908f, 3.62f, 0.208f)
            curveToRelative(0.754f, 0.923f, 0.738f, 2.254f, -0.037f, 3.16f)
            lineToRelative(-4.107f, 4.79f)
            curveToRelative(-0.16f, 0.187f, -0.447f, 0.187f, -0.607f, 0f)
            close()
        }
    }.build()
}

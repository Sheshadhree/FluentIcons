package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUp48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUp48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 44.25f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineTo(10.915f)
            lineTo(10.32f, 23.302f)
            curveToRelative(-0.581f, 0.59f, -1.531f, 0.598f, -2.122f, 0.018f)
            curveToRelative(-0.59f, -0.581f, -0.598f, -1.531f, -0.018f, -2.122f)
            lineTo(22.928f, 6.201f)
            lineToRelative(0.009f, -0.009f)
            lineToRelative(0.011f, -0.011f)
            curveToRelative(0.514f, -0.506f, 1.3f, -0.566f, 1.879f, -0.183f)
            curveToRelative(0.055f, 0.036f, 0.108f, 0.077f, 0.158f, 0.121f)
            curveToRelative(0.023f, 0.02f, 0.045f, 0.04f, 0.067f, 0.062f)
            lineToRelative(0.005f, 0.005f)
            lineToRelative(0.037f, 0.037f)
            lineToRelative(14.725f, 14.975f)
            curveToRelative(0.581f, 0.591f, 0.573f, 1.54f, -0.017f, 2.122f)
            curveToRelative(-0.591f, 0.58f, -1.54f, 0.572f, -2.121f, -0.018f)
            lineTo(25.5f, 10.915f)
            verticalLineTo(42.75f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDown32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDown32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 3f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(20.537f)
            lineToRelative(7.628f, -7.432f)
            curveToRelative(0.494f, -0.482f, 1.285f, -0.472f, 1.767f, 0.023f)
            curveToRelative(0.482f, 0.494f, 0.472f, 1.285f, -0.023f, 1.767f)
            lineToRelative(-9.747f, 9.498f)
            curveToRelative(-0.085f, 0.083f, -0.179f, 0.152f, -0.279f, 0.206f)
            curveToRelative(-0.035f, 0.019f, -0.07f, 0.036f, -0.107f, 0.052f)
            lineToRelative(-0.017f, 0.007f)
            curveToRelative(-0.136f, 0.055f, -0.284f, 0.088f, -0.44f, 0.092f)
            horizontalLineToRelative(-0.077f)
            curveToRelative(-0.15f, -0.006f, -0.294f, -0.038f, -0.426f, -0.092f)
            lineToRelative(-0.026f, -0.01f)
            curveToRelative(-0.036f, -0.016f, -0.07f, -0.033f, -0.105f, -0.052f)
            curveToRelative(-0.098f, -0.054f, -0.19f, -0.122f, -0.273f, -0.204f)
            lineToRelative(-9.747f, -9.497f)
            curveToRelative(-0.495f, -0.482f, -0.505f, -1.273f, -0.023f, -1.767f)
            curveToRelative(0.481f, -0.495f, 1.273f, -0.505f, 1.767f, -0.023f)
            lineToRelative(7.628f, 7.432f)
            verticalLineTo(4.25f)
            curveTo(14.75f, 3.56f, 15.31f, 3f, 16f, 3f)
            close()
        }
    }.build()
}

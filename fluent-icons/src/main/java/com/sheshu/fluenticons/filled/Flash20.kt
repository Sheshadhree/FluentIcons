package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flash20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flash20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.212f, 2f)
            curveToRelative(-0.474f, 0f, -0.89f, 0.314f, -1.021f, 0.77f)
            lineToRelative(-2.25f, 7.874f)
            curveToRelative(-0.194f, 0.679f, 0.316f, 1.354f, 1.022f, 1.354f)
            horizontalLineTo(6.23f)
            lineToRelative(-1.17f, 4.68f)
            curveToRelative(-0.264f, 1.055f, 1.041f, 1.777f, 1.796f, 0.995f)
            lineToRelative(8.676f, -8.858f)
            lineToRelative(0.004f, -0.004f)
            curveTo(16.176f, 8.144f, 15.716f, 7f, 14.769f, 7f)
            horizontalLineToRelative(-2.564f)
            lineToRelative(1.262f, -3.594f)
            lineToRelative(0.002f, -0.008f)
            curveTo(13.7f, 2.71f, 13.187f, 2f, 12.461f, 2f)
            horizontalLineTo(7.212f)
            close()
        }
    }.build()
}

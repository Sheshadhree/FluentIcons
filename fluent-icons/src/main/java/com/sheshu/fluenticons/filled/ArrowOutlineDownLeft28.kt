package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineDownLeft28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineDownLeft28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.544f, 2.659f)
            curveToRelative(-0.879f, -0.879f, -2.303f, -0.879f, -3.182f, 0f)
            lineTo(8.76f, 9.262f)
            lineToRelative(-1.6f, -1.6f)
            curveTo(5.81f, 6.313f, 3.5f, 7.149f, 3.328f, 9.049f)
            lineTo(2.01f, 23.546f)
            curveToRelative(-0.128f, 1.4f, 1.045f, 2.572f, 2.444f, 2.445f)
            lineToRelative(14.5f, -1.318f)
            curveToRelative(1.9f, -0.173f, 2.736f, -2.483f, 1.387f, -3.832f)
            lineToRelative(-1.602f, -1.601f)
            lineToRelative(6.602f, -6.602f)
            curveToRelative(0.879f, -0.879f, 0.879f, -2.303f, 0f, -3.182f)
            lineTo(18.544f, 2.66f)
            close()
        }
    }.build()
}

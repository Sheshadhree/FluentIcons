package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineDownLeft20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineDownLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.666f, 17.99f)
            curveToRelative(-0.955f, 0.106f, -1.763f, -0.701f, -1.657f, -1.657f)
            lineTo(3.088f, 6.63f)
            curveTo(3.227f, 5.38f, 4.75f, 4.846f, 5.639f, 5.735f)
            lineToRelative(1.067f, 1.067f)
            lineTo(11.07f, 2.44f)
            curveToRelative(0.586f, -0.585f, 1.536f, -0.585f, 2.122f, 0f)
            lineToRelative(4.37f, 4.37f)
            curveToRelative(0.585f, 0.586f, 0.585f, 1.535f, 0f, 2.121f)
            lineToRelative(-4.364f, 4.363f)
            lineToRelative(1.068f, 1.067f)
            curveToRelative(0.889f, 0.89f, 0.354f, 2.413f, -0.896f, 2.552f)
            lineTo(3.666f, 17.99f)
            close()
        }
    }.build()
}

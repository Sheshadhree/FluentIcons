package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineUpRight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.334f, 2.01f)
            curveToRelative(0.955f, -0.107f, 1.763f, 0.7f, 1.656f, 1.656f)
            lineToRelative(-1.078f, 9.703f)
            curveToRelative(-0.139f, 1.25f, -1.662f, 1.784f, -2.551f, 0.895f)
            lineToRelative(-1.068f, -1.067f)
            lineTo(8.93f, 17.56f)
            curveToRelative(-0.585f, 0.586f, -1.535f, 0.586f, -2.12f, 0f)
            lineToRelative(-4.37f, -4.37f)
            curveToRelative(-0.587f, -0.585f, -0.587f, -1.535f, 0f, -2.121f)
            lineToRelative(4.362f, -4.363f)
            lineToRelative(-1.067f, -1.067f)
            curveTo(4.846f, 4.749f, 5.38f, 3.226f, 6.63f, 3.087f)
            lineToRelative(9.704f, -1.078f)
            close()
        }
    }.build()
}

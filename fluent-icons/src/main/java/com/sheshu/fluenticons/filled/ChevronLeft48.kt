package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(32.06f, 8.19f)
            curveToRelative(0.586f, 0.585f, 0.586f, 1.535f, 0f, 2.12f)
            lineTo(18.622f, 23.75f)
            lineToRelative(13.44f, 13.44f)
            curveToRelative(0.585f, 0.585f, 0.585f, 1.535f, 0f, 2.12f)
            curveToRelative(-0.586f, 0.586f, -1.536f, 0.586f, -2.122f, 0f)
            lineToRelative(-14.5f, -14.5f)
            curveToRelative(-0.585f, -0.585f, -0.585f, -1.535f, 0f, -2.12f)
            lineToRelative(14.5f, -14.5f)
            curveToRelative(0.586f, -0.586f, 1.536f, -0.586f, 2.122f, 0f)
            close()
        }
    }.build()
}

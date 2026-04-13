package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Wifi424: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Wifi424",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.94f, 18.561f)
            curveToRelative(0.585f, 0.586f, 1.535f, 0.586f, 2.121f, 0f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            curveToRelative(-0.586f, -0.585f, -1.536f, -0.585f, -2.122f, 0f)
            curveToRelative(-0.585f, 0.586f, -0.585f, 1.536f, 0f, 2.122f)
            close()
        }
    }.build()
}

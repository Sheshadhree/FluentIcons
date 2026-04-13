package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Wifi424: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wifi424",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.96f, 18.567f)
            curveToRelative(0.585f, 0.587f, 1.536f, 0.587f, 2.122f, 0f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            curveToRelative(-0.586f, -0.587f, -1.537f, -0.587f, -2.123f, 0f)
            curveToRelative(-0.586f, 0.586f, -0.586f, 1.536f, 0f, 2.122f)
            close()
        }
    }.build()
}

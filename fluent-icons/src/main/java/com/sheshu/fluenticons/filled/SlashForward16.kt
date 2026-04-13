package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlashForward16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlashForward16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.267f, 2.05f)
            curveToRelative(0.387f, 0.147f, 0.582f, 0.58f, 0.434f, 0.967f)
            lineToRelative(-4f, 10.5f)
            curveToRelative(-0.147f, 0.387f, -0.58f, 0.581f, -0.968f, 0.434f)
            curveToRelative(-0.387f, -0.148f, -0.581f, -0.58f, -0.434f, -0.968f)
            lineToRelative(4f, -10.5f)
            curveToRelative(0.148f, -0.387f, 0.581f, -0.581f, 0.968f, -0.434f)
            close()
        }
    }.build()
}

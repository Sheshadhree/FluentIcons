package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlashForward16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlashForward16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.44f, 2.037f)
            curveToRelative(0.255f, 0.105f, 0.378f, 0.397f, 0.273f, 0.652f)
            lineToRelative(-4.5f, 11f)
            curveToRelative(-0.105f, 0.256f, -0.397f, 0.378f, -0.652f, 0.274f)
            curveToRelative(-0.256f, -0.105f, -0.378f, -0.397f, -0.274f, -0.652f)
            lineToRelative(4.5f, -11f)
            curveToRelative(0.105f, -0.256f, 0.397f, -0.378f, 0.652f, -0.274f)
            close()
        }
    }.build()
}

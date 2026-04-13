package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlashForward20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlashForward20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.016f, 2.049f)
            curveToRelative(0.387f, 0.147f, 0.582f, 0.58f, 0.435f, 0.967f)
            lineToRelative(-5.5f, 14.5f)
            curveToRelative(-0.146f, 0.387f, -0.58f, 0.582f, -0.967f, 0.435f)
            curveToRelative(-0.387f, -0.147f, -0.582f, -0.58f, -0.435f, -0.967f)
            lineToRelative(5.5f, -14.5f)
            curveToRelative(0.147f, -0.387f, 0.58f, -0.582f, 0.967f, -0.435f)
            close()
        }
    }.build()
}

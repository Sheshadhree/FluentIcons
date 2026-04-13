package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlashForward12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlashForward12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.658f, 1.026f)
            curveToRelative(0.262f, 0.087f, 0.404f, 0.37f, 0.316f, 0.632f)
            lineToRelative(-3f, 9f)
            curveToRelative(-0.087f, 0.262f, -0.37f, 0.404f, -0.632f, 0.316f)
            curveToRelative(-0.262f, -0.087f, -0.403f, -0.37f, -0.316f, -0.632f)
            lineToRelative(3f, -9f)
            curveToRelative(0.087f, -0.262f, 0.37f, -0.404f, 0.632f, -0.316f)
            close()
        }
    }.build()
}

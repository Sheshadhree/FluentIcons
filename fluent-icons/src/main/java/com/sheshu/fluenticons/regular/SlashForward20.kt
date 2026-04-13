package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlashForward20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlashForward20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.658f, 2.026f)
            curveToRelative(0.262f, 0.087f, 0.404f, 0.37f, 0.317f, 0.632f)
            lineToRelative(-5f, 15f)
            curveToRelative(-0.088f, 0.262f, -0.371f, 0.404f, -0.633f, 0.316f)
            curveToRelative(-0.262f, -0.087f, -0.403f, -0.37f, -0.316f, -0.632f)
            lineToRelative(5f, -15f)
            curveToRelative(0.087f, -0.262f, 0.37f, -0.404f, 0.632f, -0.316f)
            close()
        }
    }.build()
}

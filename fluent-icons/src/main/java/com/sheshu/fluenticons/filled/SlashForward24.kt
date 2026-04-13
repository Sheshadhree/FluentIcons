package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlashForward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlashForward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.316f, 2.051f)
            curveToRelative(0.524f, 0.175f, 0.808f, 0.741f, 0.633f, 1.265f)
            lineToRelative(-6f, 18f)
            curveToRelative(-0.175f, 0.524f, -0.741f, 0.807f, -1.265f, 0.633f)
            curveToRelative(-0.524f, -0.175f, -0.807f, -0.741f, -0.632f, -1.265f)
            lineToRelative(6f, -18f)
            curveToRelative(0.174f, -0.524f, 0.74f, -0.807f, 1.264f, -0.633f)
            close()
        }
    }.build()
}

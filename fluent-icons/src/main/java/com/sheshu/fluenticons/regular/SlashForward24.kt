package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlashForward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlashForward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.499f, 2.042f)
            curveTo(15.889f, 2.18f, 16.095f, 2.608f, 15.958f, 3f)
            lineToRelative(-6.5f, 18.5f)
            curveToRelative(-0.138f, 0.39f, -0.566f, 0.596f, -0.956f, 0.459f)
            curveTo(8.11f, 21.82f, 7.905f, 21.392f, 8.042f, 21f)
            lineToRelative(6.5f, -18.5f)
            curveToRelative(0.138f, -0.39f, 0.566f, -0.596f, 0.957f, -0.459f)
            close()
        }
    }.build()
}

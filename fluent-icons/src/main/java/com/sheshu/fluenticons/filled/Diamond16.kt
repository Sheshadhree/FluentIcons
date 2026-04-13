package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Diamond16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Diamond16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.732f, 6.233f)
            curveToRelative(-0.976f, 0.977f, -0.976f, 2.56f, 0f, 3.536f)
            lineToRelative(4.501f, 4.5f)
            curveToRelative(0.977f, 0.977f, 2.56f, 0.977f, 3.536f, 0f)
            lineToRelative(4.5f, -4.5f)
            curveToRelative(0.977f, -0.977f, 0.977f, -2.56f, 0f, -3.536f)
            lineToRelative(-4.5f, -4.5f)
            curveToRelative(-0.977f, -0.977f, -2.56f, -0.977f, -3.536f, 0f)
            lineToRelative(-4.5f, 4.5f)
            close()
        }
    }.build()
}

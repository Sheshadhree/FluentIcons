package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Diamond16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Diamond16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.732f, 9.769f)
            curveToRelative(-0.976f, -0.977f, -0.976f, -2.56f, 0f, -3.536f)
            lineToRelative(4.501f, -4.5f)
            curveToRelative(0.977f, -0.977f, 2.56f, -0.977f, 3.536f, 0f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.977f, 0.977f, 0.977f, 2.56f, 0f, 3.536f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.977f, 0.977f, -2.56f, 0.977f, -3.536f, 0f)
            lineToRelative(-4.5f, -4.5f)
            close()
            moveTo(2.44f, 6.94f)
            curveToRelative(-0.586f, 0.586f, -0.586f, 1.536f, 0f, 2.122f)
            lineToRelative(4.501f, 4.5f)
            curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.122f, 0f)
            lineToRelative(4.5f, -4.5f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            lineToRelative(-4.5f, -4.5f)
            curveToRelative(-0.586f, -0.586f, -1.536f, -0.586f, -2.122f, 0f)
            lineToRelative(-4.5f, 4.5f)
            close()
        }
    }.build()
}

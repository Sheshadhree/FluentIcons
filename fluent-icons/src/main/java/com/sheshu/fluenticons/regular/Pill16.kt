package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.354f, 10.354f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(1.5f, -1.5f)
            close()
            moveTo(12.95f, 3.05f)
            curveToRelative(-1.367f, -1.367f, -3.583f, -1.367f, -4.95f, 0f)
            lineTo(3.05f, 8f)
            curveToRelative(-1.366f, 1.366f, -1.366f, 3.582f, 0f, 4.949f)
            curveToRelative(1.367f, 1.367f, 3.583f, 1.367f, 4.95f, 0f)
            lineTo(12.95f, 8f)
            curveToRelative(1.367f, -1.367f, 1.367f, -3.583f, 0f, -4.95f)
            close()
            moveTo(5.879f, 6.585f)
            lineToRelative(3.536f, 3.536f)
            lineToRelative(-2.122f, 2.12f)
            curveToRelative(-0.976f, 0.977f, -2.56f, 0.977f, -3.535f, 0f)
            curveToRelative(-0.977f, -0.975f, -0.977f, -2.558f, 0f, -3.535f)
            lineToRelative(2.121f, -2.12f)
            close()
            moveToRelative(6.364f, 0.707f)
            lineToRelative(-2.121f, 2.122f)
            lineToRelative(-3.536f, -3.536f)
            lineToRelative(2.121f, -2.121f)
            curveToRelative(0.977f, -0.977f, 2.56f, -0.977f, 3.536f, 0f)
            curveToRelative(0.976f, 0.976f, 0.976f, 2.559f, 0f, 3.535f)
            close()
        }
    }.build()
}

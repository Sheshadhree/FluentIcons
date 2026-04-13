package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3.05f)
            curveToRelative(1.367f, -1.366f, 3.583f, -1.366f, 4.95f, 0f)
            curveToRelative(1.367f, 1.367f, 1.367f, 3.583f, 0f, 4.95f)
            lineTo(8f, 12.95f)
            curveToRelative(-1.367f, 1.367f, -3.583f, 1.367f, -4.95f, 0f)
            curveToRelative(-1.366f, -1.367f, -1.366f, -3.583f, 0f, -4.95f)
            lineTo(8f, 3.05f)
            close()
            moveToRelative(2.122f, 6.365f)
            lineToRelative(2.12f, -2.122f)
            curveToRelative(0.977f, -0.976f, 0.977f, -2.56f, 0f, -3.535f)
            curveToRelative(-0.975f, -0.977f, -2.558f, -0.977f, -3.535f, 0f)
            lineToRelative(-2.12f, 2.12f)
            lineToRelative(3.535f, 3.537f)
            close()
            moveToRelative(-2.268f, 1.439f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(1.5f, -1.5f)
            close()
        }
    }.build()
}

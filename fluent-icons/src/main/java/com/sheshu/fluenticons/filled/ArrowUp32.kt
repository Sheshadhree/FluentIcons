package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUp32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUp32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 29f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(7.213f)
            lineToRelative(-7.628f, 7.432f)
            curveToRelative(-0.494f, 0.482f, -1.285f, 0.472f, -1.767f, -0.023f)
            curveToRelative(-0.482f, -0.494f, -0.472f, -1.286f, 0.023f, -1.767f)
            lineToRelative(9.747f, -9.497f)
            curveTo(15.367f, 3.12f, 15.683f, 3f, 16f, 3f)
            curveToRelative(0.317f, 0f, 0.633f, 0.12f, 0.875f, 0.358f)
            lineToRelative(9.747f, 9.497f)
            curveToRelative(0.495f, 0.481f, 0.505f, 1.273f, 0.023f, 1.767f)
            curveToRelative(-0.482f, 0.495f, -1.273f, 0.505f, -1.767f, 0.023f)
            lineTo(17.25f, 7.213f)
            verticalLineTo(27.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            close()
        }
    }.build()
}

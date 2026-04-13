package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUp48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUp48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 44f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(10.304f)
            lineTo(10.14f, 23.126f)
            curveToRelative(-0.484f, 0.493f, -1.275f, 0.5f, -1.767f, 0.015f)
            curveToRelative(-0.493f, -0.484f, -0.5f, -1.275f, -0.015f, -1.767f)
            lineTo(23.097f, 6.386f)
            lineToRelative(0.026f, -0.027f)
            curveToRelative(0.216f, -0.212f, 0.488f, -0.33f, 0.768f, -0.354f)
            curveToRelative(0.08f, -0.007f, 0.16f, -0.006f, 0.241f, 0.002f)
            curveToRelative(0.271f, 0.029f, 0.535f, 0.146f, 0.744f, 0.352f)
            lineToRelative(0.041f, 0.04f)
            lineToRelative(14.724f, 14.975f)
            curveToRelative(0.484f, 0.492f, 0.478f, 1.283f, -0.015f, 1.767f)
            curveToRelative(-0.492f, 0.484f, -1.283f, 0.478f, -1.767f, -0.015f)
            lineToRelative(-12.61f, -12.822f)
            verticalLineTo(42.75f)
            curveTo(25.25f, 43.44f, 24.69f, 44f, 24f, 44f)
            close()
        }
    }.build()
}

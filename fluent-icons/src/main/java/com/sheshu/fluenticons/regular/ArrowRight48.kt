package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 24f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(32.446f)
            lineTo(24.874f, 10.14f)
            curveToRelative(-0.493f, -0.484f, -0.5f, -1.275f, -0.015f, -1.767f)
            curveToRelative(0.484f, -0.493f, 1.275f, -0.5f, 1.767f, -0.015f)
            lineToRelative(14.988f, 14.738f)
            lineToRelative(0.027f, 0.026f)
            curveToRelative(0.212f, 0.216f, 0.33f, 0.488f, 0.354f, 0.768f)
            curveToRelative(0.007f, 0.08f, 0.007f, 0.16f, -0.002f, 0.241f)
            curveToRelative(-0.029f, 0.271f, -0.146f, 0.535f, -0.352f, 0.744f)
            lineToRelative(-0.04f, 0.041f)
            lineTo(26.626f, 39.64f)
            curveToRelative(-0.492f, 0.484f, -1.283f, 0.478f, -1.767f, -0.015f)
            curveToRelative(-0.484f, -0.492f, -0.478f, -1.283f, 0.015f, -1.767f)
            lineToRelative(12.822f, -12.61f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 25.25f, 4f, 24.69f, 4f, 24f)
            close()
        }
    }.build()
}

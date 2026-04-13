package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(44f, 24f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(10.304f)
            lineToRelative(12.822f, 12.609f)
            curveToRelative(0.493f, 0.484f, 0.5f, 1.275f, 0.015f, 1.767f)
            curveToRelative(-0.484f, 0.492f, -1.275f, 0.5f, -1.767f, 0.015f)
            lineTo(6.386f, 24.903f)
            lineToRelative(-0.027f, -0.027f)
            curveToRelative(-0.212f, -0.215f, -0.33f, -0.488f, -0.354f, -0.767f)
            curveToRelative(-0.007f, -0.08f, -0.006f, -0.16f, 0.002f, -0.241f)
            curveToRelative(0.029f, -0.271f, 0.146f, -0.535f, 0.352f, -0.745f)
            lineToRelative(0.04f, -0.04f)
            lineTo(21.375f, 8.359f)
            curveToRelative(0.492f, -0.484f, 1.283f, -0.478f, 1.767f, 0.015f)
            curveToRelative(0.484f, 0.492f, 0.478f, 1.283f, -0.015f, 1.767f)
            lineTo(10.304f, 22.75f)
            horizontalLineTo(42.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            close()
        }
    }.build()
}

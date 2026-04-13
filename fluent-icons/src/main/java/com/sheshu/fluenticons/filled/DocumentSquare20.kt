package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentSquare20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentSquare20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 7.5f)
            curveTo(11f, 8.328f, 11.672f, 9f, 12.5f, 9f)
            horizontalLineTo(17f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(4.5f)
            close()
            moveToRelative(1f, -4.4f)
            curveToRelative(0.296f, 0.097f, 0.569f, 0.262f, 0.793f, 0.486f)
            lineToRelative(3.621f, 3.621f)
            curveTo(16.638f, 7.431f, 16.802f, 7.704f, 16.9f, 8f)
            horizontalLineToRelative(-4.4f)
            curveTo(12.224f, 8f, 12f, 7.776f, 12f, 7.5f)
            verticalLineTo(3.1f)
            close()
        }
    }.build()
}

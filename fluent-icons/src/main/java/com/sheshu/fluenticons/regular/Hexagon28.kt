package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Hexagon28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hexagon28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.39f, 4.5f)
            curveToRelative(-0.441f, 0f, -0.85f, 0.233f, -1.075f, 0.613f)
            lineToRelative(-4.886f, 8.25f)
            curveToRelative(-0.232f, 0.393f, -0.232f, 0.881f, 0f, 1.274f)
            lineToRelative(4.886f, 8.25f)
            curveTo(8.54f, 23.267f, 8.949f, 23.5f, 9.39f, 23.5f)
            horizontalLineToRelative(9.22f)
            curveToRelative(0.442f, 0f, 0.85f, -0.233f, 1.076f, -0.613f)
            lineToRelative(4.887f, -8.25f)
            curveToRelative(0.233f, -0.393f, 0.233f, -0.881f, 0f, -1.274f)
            lineToRelative(-4.887f, -8.25f)
            curveTo(19.46f, 4.733f, 19.052f, 4.5f, 18.61f, 4.5f)
            horizontalLineTo(9.39f)
            close()
            moveTo(7.024f, 4.349f)
            curveTo(7.519f, 3.513f, 8.419f, 3f, 9.39f, 3f)
            horizontalLineToRelative(9.22f)
            curveToRelative(0.972f, 0f, 1.871f, 0.513f, 2.366f, 1.348f)
            lineToRelative(4.887f, 8.25f)
            curveToRelative(0.512f, 0.865f, 0.512f, 1.94f, 0f, 2.804f)
            lineToRelative(-4.887f, 8.25f)
            curveTo(20.481f, 24.487f, 19.582f, 25f, 18.61f, 25f)
            horizontalLineTo(9.39f)
            curveToRelative(-0.971f, 0f, -1.87f, -0.513f, -2.366f, -1.349f)
            lineToRelative(-4.885f, -8.25f)
            curveToRelative(-0.512f, -0.864f, -0.512f, -1.938f, 0f, -2.802f)
            lineToRelative(4.885f, -8.25f)
            close()
        }
    }.build()
}

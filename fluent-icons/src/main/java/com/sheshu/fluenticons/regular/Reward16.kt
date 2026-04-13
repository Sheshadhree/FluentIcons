package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Reward16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Reward16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(1.192f)
            curveToRelative(0f, 0.52f, 0.27f, 1.003f, 0.711f, 1.276f)
            lineToRelative(3.866f, 2.39f)
            curveTo(5.638f, 8.865f, 5f, 9.858f, 5f, 11f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            curveToRelative(0f, -1.142f, -0.638f, -2.135f, -1.577f, -2.642f)
            lineToRelative(3.866f, -2.39f)
            curveTo(13.73f, 5.695f, 14f, 5.212f, 14f, 4.692f)
            verticalLineTo(3.5f)
            curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(3f, 3.5f)
            curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
            horizontalLineTo(5f)
            verticalLineToRelative(3.208f)
            lineToRelative(-1.763f, -1.09f)
            curveTo(3.09f, 5.027f, 3f, 4.866f, 3f, 4.692f)
            verticalLineTo(3.5f)
            close()
            moveToRelative(3f, 3.326f)
            verticalLineTo(3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3.826f)
            lineTo(8.263f, 7.9f)
            curveTo(8.102f, 8f, 7.898f, 8f, 7.737f, 7.9f)
            lineTo(6f, 6.826f)
            close()
            moveToRelative(5f, -0.618f)
            verticalLineTo(3f)
            horizontalLineToRelative(1.5f)
            curveTo(12.776f, 3f, 13f, 3.224f, 13f, 3.5f)
            verticalLineToRelative(1.192f)
            curveToRelative(0f, 0.174f, -0.09f, 0.335f, -0.237f, 0.426f)
            lineTo(11f, 6.208f)
            close()
            moveTo(6f, 11f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            close()
        }
    }.build()
}

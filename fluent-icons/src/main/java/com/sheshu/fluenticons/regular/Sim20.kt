package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Sim20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Sim20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 9f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveTo(7.672f, 15f, 7f, 14.328f, 7f, 13.5f)
            verticalLineToRelative(-3f)
            curveTo(7f, 9.672f, 7.672f, 9f, 8.5f, 9f)
            close()
            moveTo(8f, 10.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-1f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 10f, 8f, 10.224f, 8f, 10.5f)
            close()
            moveTo(8f, 12f)
            verticalLineToRelative(1.5f)
            curveTo(8f, 13.776f, 8.224f, 14f, 8.5f, 14f)
            horizontalLineTo(10f)
            verticalLineToRelative(-2f)
            horizontalLineTo(8f)
            close()
            moveToRelative(3.5f, 2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(11f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(0.5f)
            close()
            moveTo(7f, 2f)
            curveTo(5.343f, 2f, 4f, 3.343f, 4f, 5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(7.535f)
            curveToRelative(0f, -0.795f, -0.316f, -1.558f, -0.879f, -2.12f)
            lineToRelative(-2.535f, -2.536f)
            curveTo(12.023f, 2.316f, 11.26f, 2f, 10.464f, 2f)
            horizontalLineTo(7f)
            close()
            moveTo(5f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3.464f)
            curveToRelative(0.53f, 0f, 1.04f, 0.21f, 1.415f, 0.586f)
            lineToRelative(2.535f, 2.535f)
            curveTo(14.79f, 6.496f, 15f, 7.005f, 15f, 7.535f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}

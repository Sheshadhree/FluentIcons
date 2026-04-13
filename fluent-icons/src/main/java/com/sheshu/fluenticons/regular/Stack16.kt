package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Stack16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Stack16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.5f)
            curveTo(1f, 2.672f, 1.672f, 2f, 2.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(10.328f, 2f, 11f, 2.672f, 11f, 3.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(1.672f, 10f, 1f, 9.328f, 1f, 8.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(2.5f, 3f)
            curveTo(2.224f, 3f, 2f, 3.224f, 2f, 3.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 8.776f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineToRelative(7f)
            curveTo(9.776f, 9f, 10f, 8.776f, 10f, 8.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 3.224f, 9.776f, 3f, 9.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(2.585f, 10f)
            curveToRelative(0.206f, 0.583f, 0.761f, 1f, 1.415f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(3.037f, 0f, 5.5f, -2.463f, 5.5f, -5.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.653f, -0.418f, -1.209f, -1f, -1.415f)
            verticalLineTo(8.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(5.085f)
            close()
            moveTo(4.5f, 12f)
            curveToRelative(-0.654f, 0f, -1.21f, -0.417f, -1.415f, -1f)
            horizontalLineTo(9.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(4.085f)
            curveToRelative(0.582f, 0.206f, 1f, 0.762f, 1f, 1.415f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}

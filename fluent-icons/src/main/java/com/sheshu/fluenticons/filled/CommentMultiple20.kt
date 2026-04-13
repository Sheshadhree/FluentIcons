package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 7.5f)
            curveToRelative(0f, -1.626f, -1.108f, -2.992f, -2.61f, -3.386f)
            curveToRelative(-0.173f, -0.045f, -0.35f, -0.077f, -0.532f, -0.096f)
            curveTo(13.74f, 4.006f, 13.62f, 4f, 13.5f, 4f)
            horizontalLineToRelative(-9f)
            curveToRelative(0.456f, -0.607f, 1.182f, -1f, 2f, -1f)
            horizontalLineToRelative(7f)
            curveTo(15.985f, 3f, 18f, 5.015f, 18f, 7.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.818f, -0.393f, 1.544f, -1f, 2f)
            verticalLineToRelative(-6f)
            close()
            moveToRelative(-15f, 0f)
            curveTo(2f, 6.12f, 3.12f, 5f, 4.5f, 5f)
            horizontalLineToRelative(9f)
            curveTo(14.88f, 5f, 16f, 6.12f, 16f, 7.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(9.057f)
            lineTo(6.59f, 17.803f)
            curveTo(5.93f, 18.286f, 5f, 17.813f, 5f, 16.995f)
            verticalLineTo(16f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            verticalLineToRelative(-6f)
            close()
        }
    }.build()
}

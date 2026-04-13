package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Shapes16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Shapes16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 2f)
            curveTo(3.567f, 2f, 2f, 3.567f, 2f, 5.5f)
            curveToRelative(0f, 1.763f, 1.304f, 3.222f, 3f, 3.465f)
            verticalLineToRelative(1.008f)
            curveTo(2.75f, 9.723f, 1f, 7.816f, 1f, 5.5f)
            curveTo(1f, 3.015f, 3.015f, 1f, 5.5f, 1f)
            curveToRelative(2.316f, 0f, 4.224f, 1.75f, 4.473f, 4f)
            horizontalLineTo(8.965f)
            curveTo(8.722f, 3.304f, 7.263f, 2f, 5.5f, 2f)
            close()
            moveToRelative(3f, 4f)
            curveTo(7.12f, 6f, 6f, 7.12f, 6f, 8.5f)
            verticalLineToRelative(4f)
            curveTo(6f, 13.88f, 7.12f, 15f, 8.5f, 15f)
            horizontalLineToRelative(4f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4f)
            curveTo(15f, 7.12f, 13.88f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(7f, 8.5f)
            curveTo(7f, 7.672f, 7.672f, 7f, 8.5f, 7f)
            horizontalLineToRelative(4f)
            curveTo(13.328f, 7f, 14f, 7.672f, 14f, 8.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveTo(7.672f, 14f, 7f, 13.328f, 7f, 12.5f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}

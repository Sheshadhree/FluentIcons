package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PictureInPicture16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PictureInPicture16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 4.5f)
            curveTo(1f, 3.12f, 2.12f, 2f, 3.5f, 2f)
            horizontalLineToRelative(8f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(-1f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-8f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 10.328f, 2.672f, 11f, 3.5f, 11f)
            horizontalLineTo(7f)
            verticalLineToRelative(1f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 12f, 1f, 10.88f, 1f, 9.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(9f, 9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}

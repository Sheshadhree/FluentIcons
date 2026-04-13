package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Folder16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Folder16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(3.586f)
            curveToRelative(0.132f, 0f, 0.26f, -0.053f, 0.353f, -0.146f)
            lineTo(7.293f, 4.5f)
            lineTo(5.939f, 3.147f)
            curveTo(5.846f, 3.053f, 5.72f, 3f, 5.586f, 3f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            close()
            moveToRelative(-1f, 0f)
            curveTo(1f, 3.12f, 2.12f, 2f, 3.5f, 2f)
            horizontalLineToRelative(2.086f)
            curveToRelative(0.398f, 0f, 0.78f, 0.158f, 1.06f, 0.44f)
            lineTo(8.207f, 4f)
            horizontalLineTo(12.5f)
            curveTo(13.88f, 4f, 15f, 5.12f, 15f, 6.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 14f, 1f, 12.88f, 1f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(2f, 7f)
            verticalLineToRelative(4.5f)
            curveTo(2f, 12.328f, 2.672f, 13f, 3.5f, 13f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(14f, 5.672f, 13.328f, 5f, 12.5f, 5f)
            horizontalLineTo(8.207f)
            lineToRelative(-1.56f, 1.56f)
            curveTo(6.364f, 6.843f, 5.983f, 7f, 5.585f, 7f)
            horizontalLineTo(2f)
            close()
        }
    }.build()
}

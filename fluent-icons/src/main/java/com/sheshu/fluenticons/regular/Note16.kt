package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Note16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Note16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(3.672f)
            curveToRelative(0.663f, 0f, 1.298f, -0.263f, 1.767f, -0.732f)
            lineToRelative(3.329f, -3.329f)
            curveTo(13.737f, 9.47f, 14f, 8.835f, 14f, 8.172f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(-2.5f)
            curveTo(9.12f, 8f, 8f, 9.12f, 8f, 10.5f)
            verticalLineTo(13f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(6f, 8.25f)
            verticalLineTo(10.5f)
            curveTo(9f, 9.672f, 9.672f, 9f, 10.5f, 9f)
            horizontalLineToRelative(2.25f)
            curveToRelative(-0.055f, 0.083f, -0.118f, 0.16f, -0.19f, 0.232f)
            lineToRelative(-3.328f, 3.329f)
            curveTo(9.161f, 12.632f, 9.082f, 12.695f, 9f, 12.75f)
            close()
        }
    }.build()
}

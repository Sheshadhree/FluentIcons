package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookmarkMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookmarkMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.654f, 2f)
            curveTo(4.95f, 1.407f, 5.561f, 1f, 6.267f, 1f)
            horizontalLineTo(10.9f)
            curveTo(12.613f, 1f, 14f, 2.388f, 14f, 4.1f)
            verticalLineToRelative(7.367f)
            curveToRelative(0f, 0.706f, -0.407f, 1.318f, -1f, 1.613f)
            verticalLineTo(4.1f)
            curveTo(13f, 2.94f, 12.06f, 2f, 10.9f, 2f)
            horizontalLineTo(4.654f)
            close()
            moveTo(4.8f, 3f)
            curveTo(3.806f, 3f, 3f, 3.806f, 3f, 4.8f)
            verticalLineToRelative(9.7f)
            curveToRelative(0f, 0.172f, 0.09f, 0.333f, 0.237f, 0.424f)
            curveToRelative(0.147f, 0.091f, 0.331f, 0.1f, 0.486f, 0.022f)
            lineTo(7.5f, 13.06f)
            lineToRelative(3.777f, 1.887f)
            curveToRelative(0.155f, 0.078f, 0.339f, 0.07f, 0.486f, -0.022f)
            curveTo(11.91f, 14.834f, 12f, 14.672f, 12f, 14.5f)
            verticalLineTo(4.8f)
            curveTo(12f, 3.806f, 11.194f, 3f, 10.2f, 3f)
            horizontalLineTo(4.8f)
            close()
            moveTo(4f, 4.8f)
            curveTo(4f, 4.358f, 4.358f, 4f, 4.8f, 4f)
            horizontalLineToRelative(5.4f)
            curveTo(10.642f, 4f, 11f, 4.358f, 11f, 4.8f)
            verticalLineToRelative(8.89f)
            lineToRelative(-3.277f, -1.637f)
            curveToRelative(-0.14f, -0.07f, -0.306f, -0.07f, -0.446f, 0f)
            lineTo(4f, 13.69f)
            verticalLineTo(4.8f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookmarkMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookmarkMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.309f, 4f)
            horizontalLineTo(19.5f)
            curveTo(22.538f, 4f, 25f, 6.462f, 25f, 9.5f)
            verticalLineToRelative(16.66f)
            curveToRelative(1.185f, -0.59f, 2f, -1.813f, 2f, -3.227f)
            verticalLineTo(9.5f)
            curveTo(27f, 5.358f, 23.643f, 2f, 19.5f, 2f)
            horizontalLineToRelative(-6.967f)
            curveTo(11.121f, 2f, 9.898f, 2.815f, 9.31f, 4f)
            close()
            moveTo(8.75f, 6f)
            curveTo(6.679f, 6f, 5f, 7.679f, 5f, 9.75f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.377f, 0.212f, 0.722f, 0.548f, 0.892f)
            curveToRelative(0.336f, 0.17f, 0.74f, 0.137f, 1.043f, -0.086f)
            lineToRelative(6.945f, -5.092f)
            lineToRelative(7.92f, 5.126f)
            curveToRelative(0.308f, 0.199f, 0.7f, 0.213f, 1.022f, 0.038f)
            curveTo(22.8f, 29.703f, 23f, 29.366f, 23f, 29f)
            verticalLineTo(9.75f)
            curveTo(23f, 7.679f, 21.321f, 6f, 19.25f, 6f)
            horizontalLineTo(8.75f)
            close()
        }
    }.build()
}

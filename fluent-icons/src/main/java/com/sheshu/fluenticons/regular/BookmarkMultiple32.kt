package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookmarkMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookmarkMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.308f, 4f)
            curveToRelative(0.589f, -1.185f, 1.812f, -2f, 3.225f, -2f)
            horizontalLineTo(19.5f)
            curveTo(23.642f, 2f, 27f, 5.358f, 27f, 9.5f)
            verticalLineToRelative(13.433f)
            curveToRelative(0f, 1.414f, -0.815f, 2.637f, -2f, 3.226f)
            verticalLineTo(9.5f)
            curveTo(25f, 6.462f, 22.537f, 4f, 19.5f, 4f)
            horizontalLineTo(9.308f)
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
            moveTo(7f, 9.75f)
            curveTo(7f, 8.783f, 7.784f, 8f, 8.75f, 8f)
            horizontalLineToRelative(10.5f)
            curveTo(20.216f, 8f, 21f, 8.783f, 21f, 9.75f)
            verticalLineToRelative(17.412f)
            lineToRelative(-6.957f, -4.502f)
            curveToRelative(-0.348f, -0.225f, -0.8f, -0.212f, -1.134f, 0.034f)
            lineTo(7f, 27.026f)
            verticalLineTo(9.75f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BoardSplit28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoardSplit28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            curveTo(4.679f, 3f, 3f, 4.679f, 3f, 6.75f)
            verticalLineTo(13f)
            horizontalLineToRelative(13f)
            verticalLineTo(3f)
            horizontalLineTo(6.75f)
            close()
            moveTo(16f, 14.5f)
            horizontalLineTo(3f)
            verticalLineToRelative(6.75f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineTo(16f)
            verticalLineTo(14.5f)
            close()
            moveTo(21.25f, 25f)
            horizontalLineTo(17.5f)
            verticalLineToRelative(-7f)
            horizontalLineTo(25f)
            verticalLineToRelative(3.25f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            close()
            moveTo(25f, 16.5f)
            horizontalLineToRelative(-7.5f)
            verticalLineToRelative(-5f)
            horizontalLineTo(25f)
            verticalLineToRelative(5f)
            close()
            moveTo(17.5f, 3f)
            verticalLineToRelative(7f)
            horizontalLineTo(25f)
            verticalLineTo(6.75f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineTo(17.5f)
            close()
        }
    }.build()
}

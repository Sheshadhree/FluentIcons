package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BoardSplit48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoardSplit48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.25f, 6f)
            curveTo(8.35f, 6f, 6f, 8.35f, 6f, 11.25f)
            verticalLineTo(23f)
            horizontalLineToRelative(21f)
            verticalLineTo(6f)
            horizontalLineTo(11.25f)
            close()
            moveTo(27f, 25.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(11.25f)
            curveTo(6f, 39.65f, 8.35f, 42f, 11.25f, 42f)
            horizontalLineTo(27f)
            verticalLineTo(25.5f)
            close()
            moveTo(36.75f, 42f)
            horizontalLineTo(29.5f)
            verticalLineTo(31.5f)
            horizontalLineTo(42f)
            verticalLineToRelative(5.25f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            close()
            moveTo(42f, 19.5f)
            verticalLineTo(29f)
            horizontalLineTo(29.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineTo(42f)
            close()
            moveToRelative(0f, -2.5f)
            horizontalLineTo(29.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(7.25f)
            curveTo(39.65f, 6f, 42f, 8.35f, 42f, 11.25f)
            verticalLineTo(17f)
            close()
        }
    }.build()
}

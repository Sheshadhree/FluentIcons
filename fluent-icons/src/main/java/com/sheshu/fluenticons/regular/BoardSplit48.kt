package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BoardSplit48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BoardSplit48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 11.25f)
            curveTo(6f, 8.35f, 8.35f, 6f, 11.25f, 6f)
            horizontalLineToRelative(25.5f)
            curveTo(39.65f, 6f, 42f, 8.35f, 42f, 11.25f)
            verticalLineToRelative(25.5f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-25.5f)
            curveTo(8.35f, 42f, 6f, 39.65f, 6f, 36.75f)
            verticalLineToRelative(-25.5f)
            close()
            moveTo(39.5f, 29f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(-10f)
            verticalLineTo(29f)
            horizontalLineToRelative(10f)
            close()
            moveToRelative(-10f, 2.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(7.25f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(31.5f)
            horizontalLineToRelative(-10f)
            close()
            moveToRelative(-2.5f, -6f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(11.25f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineTo(27f)
            verticalLineToRelative(-14f)
            close()
            moveToRelative(0f, -2.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(11.25f)
            curveToRelative(-1.519f, 0f, -2.75f, 1.231f, -2.75f, 2.75f)
            verticalLineTo(23f)
            horizontalLineTo(27f)
            close()
            moveToRelative(12.5f, -6f)
            verticalLineToRelative(-5.75f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            horizontalLineTo(29.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(10f)
            close()
        }
    }.build()
}

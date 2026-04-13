package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SplitVertical12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitVertical12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1.5f)
            curveTo(6f, 1.224f, 5.776f, 1f, 5.5f, 1f)
            reflectiveCurveTo(5f, 1.224f, 5f, 1.5f)
            verticalLineToRelative(9f)
            curveTo(5f, 10.776f, 5.224f, 11f, 5.5f, 11f)
            reflectiveCurveTo(6f, 10.776f, 6f, 10.5f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(-5f, 2f)
            curveTo(1f, 2.672f, 1.672f, 2f, 2.5f, 2f)
            horizontalLineTo(4f)
            verticalLineToRelative(8f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 10f, 1f, 9.328f, 1f, 8.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(7f, 10f)
            horizontalLineToRelative(1.5f)
            curveTo(9.328f, 10f, 10f, 9.328f, 10f, 8.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 2.672f, 9.328f, 2f, 8.5f, 2f)
            horizontalLineTo(7f)
            verticalLineToRelative(8f)
            close()
        }
    }.build()
}

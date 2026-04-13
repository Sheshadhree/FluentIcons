package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SplitHorizontal12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitHorizontal12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 1f)
            curveTo(9.328f, 1f, 10f, 1.672f, 10f, 2.5f)
            verticalLineTo(4f)
            horizontalLineTo(2f)
            verticalLineTo(2.5f)
            curveTo(2f, 1.672f, 2.672f, 1f, 3.5f, 1f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(2f, 4f)
            curveTo(10.776f, 5f, 11f, 5.224f, 11f, 5.5f)
            reflectiveCurveTo(10.776f, 6f, 10.5f, 6f)
            horizontalLineToRelative(-9f)
            curveTo(1.224f, 6f, 1f, 5.776f, 1f, 5.5f)
            reflectiveCurveTo(1.224f, 5f, 1.5f, 5f)
            horizontalLineToRelative(9f)
            close()
            moveTo(2f, 7f)
            verticalLineToRelative(1.5f)
            curveTo(2f, 9.328f, 2.672f, 10f, 3.5f, 10f)
            horizontalLineToRelative(5f)
            curveTo(9.328f, 10f, 10f, 9.328f, 10f, 8.5f)
            verticalLineTo(7f)
            horizontalLineTo(2f)
            close()
        }
    }.build()
}

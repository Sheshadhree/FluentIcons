package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Phone12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Phone12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.5f)
            curveTo(3f, 1.672f, 3.672f, 1f, 4.5f, 1f)
            horizontalLineToRelative(3f)
            curveTo(8.328f, 1f, 9f, 1.672f, 9f, 2.5f)
            verticalLineToRelative(7f)
            curveTo(9f, 10.328f, 8.328f, 11f, 7.5f, 11f)
            horizontalLineToRelative(-3f)
            curveTo(3.672f, 11f, 3f, 10.328f, 3f, 9.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(5.5f, 8f)
            curveTo(5.224f, 8f, 5f, 8.224f, 5f, 8.5f)
            reflectiveCurveTo(5.224f, 9f, 5.5f, 9f)
            horizontalLineToRelative(1f)
            curveTo(6.776f, 9f, 7f, 8.776f, 7f, 8.5f)
            reflectiveCurveTo(6.776f, 8f, 6.5f, 8f)
            horizontalLineToRelative(-1f)
            close()
        }
    }.build()
}

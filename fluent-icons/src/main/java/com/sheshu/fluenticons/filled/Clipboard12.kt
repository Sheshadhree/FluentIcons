package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clipboard12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clipboard12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.915f, 2f)
            horizontalLineTo(8.5f)
            curveTo(9.328f, 2f, 10f, 2.672f, 10f, 3.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(2.672f, 11f, 2f, 10.328f, 2f, 9.5f)
            verticalLineToRelative(-6f)
            curveTo(2f, 2.672f, 2.672f, 2f, 3.5f, 2f)
            horizontalLineToRelative(0.585f)
            curveTo(4.291f, 1.417f, 4.847f, 1f, 5.5f, 1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.653f, 0f, 1.209f, 0.417f, 1.415f, 1f)
            close()
            moveTo(5f, 2.5f)
            curveTo(5f, 2.776f, 5.224f, 3f, 5.5f, 3f)
            horizontalLineToRelative(1f)
            curveTo(6.776f, 3f, 7f, 2.776f, 7f, 2.5f)
            reflectiveCurveTo(6.776f, 2f, 6.5f, 2f)
            horizontalLineToRelative(-1f)
            curveTo(5.224f, 2f, 5f, 2.224f, 5f, 2.5f)
            close()
        }
    }.build()
}

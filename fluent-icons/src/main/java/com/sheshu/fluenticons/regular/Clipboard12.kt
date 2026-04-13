package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Clipboard12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Clipboard12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.085f, 3f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            verticalLineToRelative(6f)
            curveTo(3f, 9.776f, 3.224f, 10f, 3.5f, 10f)
            horizontalLineToRelative(5f)
            curveTo(8.776f, 10f, 9f, 9.776f, 9f, 9.5f)
            verticalLineToRelative(-6f)
            curveTo(9f, 3.224f, 8.776f, 3f, 8.5f, 3f)
            horizontalLineTo(7.915f)
            curveTo(7.709f, 3.583f, 7.153f, 4f, 6.5f, 4f)
            horizontalLineToRelative(-1f)
            curveTo(4.847f, 4f, 4.291f, 3.583f, 4.085f, 3f)
            close()
            moveToRelative(3.83f, -1f)
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

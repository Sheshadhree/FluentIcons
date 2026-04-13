package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Clipboard16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Clipboard16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.085f, 2f)
            curveTo(5.291f, 1.417f, 5.847f, 1f, 6.5f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.653f, 0f, 1.209f, 0.417f, 1.415f, 1f)
            horizontalLineTo(11.5f)
            curveTo(12.328f, 2f, 13f, 2.672f, 13f, 3.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 15f, 3f, 14.328f, 3f, 13.5f)
            verticalLineToRelative(-10f)
            curveTo(3f, 2.672f, 3.672f, 2f, 4.5f, 2f)
            horizontalLineToRelative(0.585f)
            close()
            moveTo(6.5f, 2f)
            curveTo(6.224f, 2f, 6f, 2.224f, 6f, 2.5f)
            reflectiveCurveTo(6.224f, 3f, 6.5f, 3f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 3f, 10f, 2.776f, 10f, 2.5f)
            reflectiveCurveTo(9.776f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(5.085f, 3f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 3f, 4f, 3.224f, 4f, 3.5f)
            verticalLineToRelative(10f)
            curveTo(4f, 13.776f, 4.224f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-10f)
            curveTo(12f, 3.224f, 11.776f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-0.585f)
            curveTo(10.709f, 3.583f, 10.153f, 4f, 9.5f, 4f)
            horizontalLineToRelative(-3f)
            curveTo(5.847f, 4f, 5.291f, 3.583f, 5.085f, 3f)
            close()
        }
    }.build()
}

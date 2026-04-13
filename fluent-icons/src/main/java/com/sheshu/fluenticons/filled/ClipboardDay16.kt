package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ClipboardDay16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardDay16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 9f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2f)
            horizontalLineTo(6f)
            verticalLineTo(9f)
            close()
            moveTo(5.085f, 2f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 2f, 3f, 2.672f, 3f, 3.5f)
            verticalLineToRelative(10f)
            curveTo(3f, 14.328f, 3.672f, 15f, 4.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-10f)
            curveTo(13f, 2.672f, 12.328f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-0.585f)
            curveTo(10.709f, 1.417f, 10.153f, 1f, 9.5f, 1f)
            horizontalLineToRelative(-3f)
            curveTo(5.847f, 1f, 5.291f, 1.417f, 5.085f, 2f)
            close()
            moveTo(6.5f, 2f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 2f, 10f, 2.224f, 10f, 2.5f)
            reflectiveCurveTo(9.776f, 3f, 9.5f, 3f)
            horizontalLineToRelative(-3f)
            curveTo(6.224f, 3f, 6f, 2.776f, 6f, 2.5f)
            reflectiveCurveTo(6.224f, 2f, 6.5f, 2f)
            close()
            moveTo(5f, 6.5f)
            curveTo(5f, 6.224f, 5.224f, 6f, 5.5f, 6f)
            horizontalLineToRelative(5f)
            curveTo(10.776f, 6f, 11f, 6.224f, 11f, 6.5f)
            reflectiveCurveTo(10.776f, 7f, 10.5f, 7f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 7f, 5f, 6.776f, 5f, 6.5f)
            close()
            moveTo(5f, 9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}

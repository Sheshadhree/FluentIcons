package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Document16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Document16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 1f)
            curveTo(3.895f, 1f, 3f, 1.895f, 3f, 3f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5.414f)
            curveToRelative(0f, -0.398f, -0.158f, -0.78f, -0.44f, -1.06f)
            lineTo(9.647f, 1.439f)
            curveTo(9.367f, 1.158f, 8.984f, 1f, 8.586f, 1f)
            horizontalLineTo(5f)
            close()
            moveTo(4f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2.5f)
            curveTo(8f, 5.328f, 8.672f, 6f, 9.5f, 6f)
            horizontalLineTo(12f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(3f)
            close()
            moveToRelative(7.793f, 2f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 5f, 9f, 4.776f, 9f, 4.5f)
            verticalLineTo(2.207f)
            lineTo(11.793f, 5f)
            close()
        }
    }.build()
}

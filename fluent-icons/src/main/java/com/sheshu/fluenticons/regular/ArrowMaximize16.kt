package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowMaximize16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowMaximize16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.4f, 3f)
            curveTo(12.732f, 3f, 13f, 3.268f, 13f, 3.6f)
            verticalLineToRelative(4.9f)
            curveTo(13f, 8.776f, 12.776f, 9f, 12.5f, 9f)
            reflectiveCurveTo(12f, 8.776f, 12f, 8.5f)
            verticalLineTo(4.707f)
            lineTo(4.707f, 12f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 12f, 9f, 12.224f, 9f, 12.5f)
            reflectiveCurveTo(8.776f, 13f, 8.5f, 13f)
            horizontalLineTo(3.6f)
            curveTo(3.268f, 13f, 3f, 12.732f, 3f, 12.4f)
            verticalLineTo(7.5f)
            curveTo(3f, 7.224f, 3.224f, 7f, 3.5f, 7f)
            reflectiveCurveTo(4f, 7.224f, 4f, 7.5f)
            verticalLineToRelative(3.793f)
            lineTo(11.293f, 4f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 4f, 7f, 3.776f, 7f, 3.5f)
            reflectiveCurveTo(7.224f, 3f, 7.5f, 3f)
            horizontalLineToRelative(4.9f)
            close()
        }
    }.build()
}

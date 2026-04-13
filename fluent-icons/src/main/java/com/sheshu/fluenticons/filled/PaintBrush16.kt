package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaintBrush16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBrush16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 4.5f)
            verticalLineTo(1f)
            horizontalLineTo(9f)
            verticalLineToRelative(2.5f)
            curveTo(9f, 3.776f, 8.776f, 4f, 8.5f, 4f)
            reflectiveCurveTo(8f, 3.776f, 8f, 3.5f)
            verticalLineTo(1f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 1f, 3f, 1.224f, 3f, 1.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(10f)
            verticalLineTo(1.5f)
            curveTo(13f, 1.224f, 12.776f, 1f, 12.5f, 1f)
            horizontalLineTo(11f)
            verticalLineToRelative(3.5f)
            curveTo(11f, 4.776f, 10.776f, 5f, 10.5f, 5f)
            reflectiveCurveTo(10f, 4.776f, 10f, 4.5f)
            close()
            moveTo(13f, 8f)
            horizontalLineTo(3f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2.5f)
            curveTo(6.5f, 14.328f, 7.172f, 15f, 8f, 15f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(11f)
            horizontalLineTo(11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}

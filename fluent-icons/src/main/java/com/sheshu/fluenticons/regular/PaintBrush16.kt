package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PaintBrush16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PaintBrush16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 1f)
            curveTo(3.224f, 1f, 3f, 1.224f, 3f, 1.5f)
            verticalLineTo(9f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(1f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(1.5f)
            curveTo(13f, 1.224f, 12.776f, 1f, 12.5f, 1f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(4f, 7f)
            verticalLineTo(2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            curveTo(8f, 3.776f, 8.224f, 4f, 8.5f, 4f)
            reflectiveCurveTo(9f, 3.776f, 9f, 3.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2.5f)
            curveTo(10f, 4.776f, 10.224f, 5f, 10.5f, 5f)
            reflectiveCurveTo(11f, 4.776f, 11f, 4.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(5f)
            horizontalLineTo(4f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 10f, 9f, 10.224f, 9f, 10.5f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-2.5f)
            curveTo(7f, 10.224f, 6.776f, 10f, 6.5f, 10f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}

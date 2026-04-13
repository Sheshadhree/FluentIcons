package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PaintBrush12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PaintBrush12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 1f)
            horizontalLineToRelative(-6f)
            curveTo(2.224f, 1f, 2f, 1.224f, 2f, 1.5f)
            verticalLineTo(7f)
            curveToRelative(0f, 0.552f, 0.449f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 10.327f, 4.673f, 11f, 5.5f, 11f)
            reflectiveCurveTo(7f, 10.327f, 7f, 9.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(1f)
            curveToRelative(0.551f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(1.5f)
            curveTo(9f, 1.224f, 8.776f, 1f, 8.5f, 1f)
            close()
            moveTo(4f, 2f)
            verticalLineToRelative(0.5f)
            curveTo(4f, 2.776f, 4.224f, 3f, 4.5f, 3f)
            reflectiveCurveTo(5f, 2.776f, 5f, 2.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(7f, 3.276f, 7f, 3f)
            verticalLineTo(2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(3f)
            horizontalLineTo(3f)
            verticalLineTo(2f)
            horizontalLineToRelative(1f)
            close()
            moveToRelative(2.5f, 5f)
            curveTo(6.224f, 7f, 6f, 7.224f, 6f, 7.5f)
            verticalLineToRelative(2f)
            curveTo(6f, 9.775f, 5.776f, 10f, 5.5f, 10f)
            reflectiveCurveTo(5f, 9.775f, 5f, 9.5f)
            verticalLineToRelative(-2f)
            curveTo(5f, 7.224f, 4.776f, 7f, 4.5f, 7f)
            horizontalLineTo(3f)
            verticalLineTo(6f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(1f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}

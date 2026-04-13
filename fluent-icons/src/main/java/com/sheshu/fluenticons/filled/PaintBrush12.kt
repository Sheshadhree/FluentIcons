package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaintBrush12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBrush12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 10.327f, 4.673f, 11f, 5.5f, 11f)
            reflectiveCurveTo(7f, 10.327f, 7f, 9.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            horizontalLineTo(2f)
            verticalLineToRelative(1f)
            close()
            moveToRelative(6.5f, -6f)
            horizontalLineTo(8f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(7f, 3.276f, 7f, 3f)
            verticalLineTo(1f)
            horizontalLineTo(6f)
            verticalLineToRelative(1.5f)
            curveTo(6f, 2.776f, 5.776f, 3f, 5.5f, 3f)
            reflectiveCurveTo(5f, 2.776f, 5f, 2.5f)
            verticalLineTo(1f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 1f, 2f, 1.224f, 2f, 1.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(7f)
            verticalLineTo(1.5f)
            curveTo(9f, 1.224f, 8.776f, 1f, 8.5f, 1f)
            close()
        }
    }.build()
}

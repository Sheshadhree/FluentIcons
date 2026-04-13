package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Doctor12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Doctor12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            curveTo(2.448f, 8f, 2f, 7.552f, 2f, 7f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1f)
            verticalLineTo(3f)
            close()
            moveToRelative(3f, 0f)
            horizontalLineTo(5f)
            verticalLineToRelative(1.5f)
            curveTo(5f, 4.776f, 4.776f, 5f, 4.5f, 5f)
            horizontalLineTo(3f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1.5f)
            curveTo(4.776f, 7f, 5f, 7.224f, 5f, 7.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(2f)
            verticalLineTo(7.5f)
            curveTo(7f, 7.224f, 7.224f, 7f, 7.5f, 7f)
            horizontalLineTo(9f)
            verticalLineTo(5f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 5f, 7f, 4.776f, 7f, 4.5f)
            verticalLineTo(3f)
            close()
        }
    }.build()
}

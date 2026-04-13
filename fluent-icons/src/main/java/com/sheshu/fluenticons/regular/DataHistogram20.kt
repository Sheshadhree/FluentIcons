package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataHistogram20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataHistogram20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 5f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(4f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(9f)
            curveTo(8.448f, 4f, 8f, 4.448f, 8f, 5f)
            close()
            moveTo(7f, 9f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 17f, 3f, 16.776f, 3f, 16.5f)
            verticalLineTo(11f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(0f, 7f)
            verticalLineToRelative(-6f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(6f, 0f)
            horizontalLineToRelative(3f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(9f)
            close()
        }
    }.build()
}

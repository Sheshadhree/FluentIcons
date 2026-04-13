package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataHistogram16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataHistogram16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 4f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(3f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
            moveToRelative(-1f, 3f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineTo(12f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 14f, 2f, 13.776f, 2f, 13.5f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1.5f)
            close()
            moveToRelative(0f, 6f)
            verticalLineTo(8f)
            horizontalLineTo(4f)
            curveTo(3.448f, 8f, 3f, 8.448f, 3f, 9f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(2.5f)
            close()
            moveToRelative(5f, 0f)
            horizontalLineTo(13f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(7f)
            close()
        }
    }.build()
}

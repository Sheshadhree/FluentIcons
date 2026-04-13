package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Notebook20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Notebook20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2f)
            curveTo(3.895f, 2f, 3f, 2.895f, 3f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            close()
            moveToRelative(0f, 3.5f)
            curveTo(5f, 5.224f, 5.224f, 5f, 5.5f, 5f)
            horizontalLineToRelative(7f)
            curveTo(12.776f, 5f, 13f, 5.224f, 13f, 5.5f)
            verticalLineToRelative(1f)
            curveTo(13f, 6.776f, 12.776f, 7f, 12.5f, 7f)
            horizontalLineToRelative(-7f)
            curveTo(5.224f, 7f, 5f, 6.776f, 5f, 6.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(16f, 6f)
            horizontalLineToRelative(0.5f)
            curveTo(16.776f, 6f, 17f, 6.224f, 17f, 6.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(16f)
            verticalLineTo(6f)
            close()
            moveToRelative(0f, 3.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(16f)
            verticalLineTo(9.5f)
            close()
            moveToRelative(0f, 3.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(15f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(16f)
            verticalLineTo(13f)
            close()
        }
    }.build()
}

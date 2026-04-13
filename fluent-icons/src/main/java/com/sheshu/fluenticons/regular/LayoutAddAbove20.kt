package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LayoutAddAbove20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LayoutAddAbove20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 8f)
            curveTo(16.776f, 8f, 17f, 8.224f, 17f, 8.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(8.5f)
            curveTo(3f, 8.224f, 3.224f, 8f, 3.5f, 8f)
            horizontalLineToRelative(13f)
            close()
            moveTo(4f, 14f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(9f)
            horizontalLineTo(4f)
            verticalLineToRelative(5f)
            close()
            moveTo(16.5f, 3f)
            curveTo(16.776f, 3f, 17f, 3.224f, 17f, 3.5f)
            reflectiveCurveTo(16.776f, 4f, 16.5f, 4f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 4f, 3f, 3.776f, 3f, 3.5f)
            reflectiveCurveTo(3.224f, 3f, 3.5f, 3f)
            horizontalLineToRelative(13f)
            close()
        }
    }.build()
}

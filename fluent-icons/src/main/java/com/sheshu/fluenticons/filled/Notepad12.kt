package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Notepad12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Notepad12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 1.5f)
            curveTo(4f, 1.224f, 4.224f, 1f, 4.5f, 1f)
            reflectiveCurveTo(5f, 1.224f, 5f, 1.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(2f)
            verticalLineTo(1.5f)
            curveTo(7f, 1.224f, 7.224f, 1f, 7.5f, 1f)
            reflectiveCurveTo(8f, 1.224f, 8f, 1.5f)
            verticalLineTo(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(3f)
            horizontalLineTo(7.5f)
            curveTo(6.672f, 7f, 6f, 7.672f, 6f, 8.5f)
            verticalLineTo(11f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            verticalLineTo(1.5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(4f, 4.776f, 4.224f, 5f, 4.5f, 5f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 5f, 8f, 4.776f, 8f, 4.5f)
            reflectiveCurveTo(7.776f, 4f, 7.5f, 4f)
            horizontalLineToRelative(-3f)
            curveTo(4.224f, 4f, 4f, 4.224f, 4f, 4.5f)
            close()
            moveToRelative(0f, 2f)
            curveTo(4f, 6.776f, 4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(1f)
            curveTo(5.776f, 7f, 6f, 6.776f, 6f, 6.5f)
            reflectiveCurveTo(5.776f, 6f, 5.5f, 6f)
            horizontalLineToRelative(-1f)
            curveTo(4.224f, 6f, 4f, 6.224f, 4f, 6.5f)
            close()
            moveTo(4.5f, 9f)
            curveTo(4.776f, 9f, 5f, 8.776f, 5f, 8.5f)
            reflectiveCurveTo(4.776f, 8f, 4.5f, 8f)
            reflectiveCurveTo(4f, 8.224f, 4f, 8.5f)
            reflectiveCurveTo(4.224f, 9f, 4.5f, 9f)
            close()
            moveTo(7f, 8.5f)
            curveTo(7f, 8.224f, 7.224f, 8f, 7.5f, 8f)
            horizontalLineTo(10f)
            lineToRelative(-3f, 3f)
            verticalLineTo(8.5f)
            close()
        }
    }.build()
}

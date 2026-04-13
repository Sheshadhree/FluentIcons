package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SplitVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SplitVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1.5f)
            curveTo(8f, 1.224f, 7.776f, 1f, 7.5f, 1f)
            reflectiveCurveTo(7f, 1.224f, 7f, 1.5f)
            verticalLineToRelative(13f)
            curveTo(7f, 14.776f, 7.224f, 15f, 7.5f, 15f)
            reflectiveCurveTo(8f, 14.776f, 8f, 14.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(6f, 13f)
            verticalLineToRelative(-1f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            verticalLineTo(3f)
            horizontalLineTo(3f)
            curveTo(1.895f, 3f, 1f, 3.895f, 1f, 5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(6f, 0f)
            horizontalLineTo(9f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(9f)
            verticalLineTo(3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            close()
        }
    }.build()
}

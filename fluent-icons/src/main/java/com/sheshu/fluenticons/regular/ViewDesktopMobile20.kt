package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ViewDesktopMobile20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ViewDesktopMobile20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 4f)
            curveTo(7.224f, 4f, 7f, 4.224f, 7f, 4.5f)
            verticalLineToRelative(2f)
            curveTo(7f, 6.776f, 7.224f, 7f, 7.5f, 7f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 7f, 13f, 6.776f, 13f, 6.5f)
            verticalLineToRelative(-2f)
            curveTo(13f, 4.224f, 12.776f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(7f, 8.5f)
            curveTo(7f, 8.224f, 7.224f, 8f, 7.5f, 8f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 8f, 13f, 8.224f, 13f, 8.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 14f, 7f, 13.776f, 7f, 13.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(9.5f, 15f)
            curveTo(9.224f, 15f, 9f, 15.224f, 9f, 15.5f)
            reflectiveCurveTo(9.224f, 16f, 9.5f, 16f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 15f, 10.5f, 15f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(7f, 2f)
            curveTo(5.895f, 2f, 5f, 2.895f, 5f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(7f)
            close()
            moveTo(6f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}

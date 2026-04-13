package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ViewDesktopMobile20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ViewDesktopMobile20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(7f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            close()
            moveToRelative(2.5f, 0f)
            curveTo(7.224f, 4f, 7f, 4.224f, 7f, 4.5f)
            verticalLineToRelative(2f)
            curveTo(7f, 6.776f, 7.224f, 7f, 7.5f, 7f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 7f, 13f, 6.776f, 13f, 6.5f)
            verticalLineToRelative(-2f)
            curveTo(13f, 4.224f, 12.776f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(0f, 4f)
            curveTo(7.224f, 8f, 7f, 8.224f, 7f, 8.5f)
            verticalLineToRelative(5f)
            curveTo(7f, 13.776f, 7.224f, 14f, 7.5f, 14f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(13f, 8.224f, 12.776f, 8f, 12.5f, 8f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(9f, 15.5f)
            curveTo(9f, 15.776f, 9.224f, 16f, 9.5f, 16f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 15f, 10.5f, 15f)
            horizontalLineToRelative(-1f)
            curveTo(9.224f, 15f, 9f, 15.224f, 9f, 15.5f)
            close()
        }
    }.build()
}

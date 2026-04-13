package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PhoneDesktop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneDesktop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            horizontalLineToRelative(7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 12f, 11.5f, 12f)
            horizontalLineTo(11f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 1f, 4f, 1.895f, 4f, 3f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveTo(3.5f, 12f)
            curveTo(3.224f, 12f, 3f, 12.224f, 3f, 12.5f)
            reflectiveCurveTo(3.224f, 13f, 3.5f, 13f)
            horizontalLineToRelative(1f)
            curveTo(4.776f, 13f, 5f, 12.776f, 5f, 12.5f)
            reflectiveCurveTo(4.776f, 12f, 4.5f, 12f)
            horizontalLineToRelative(-1f)
            close()
            moveToRelative(-1f, -6f)
            curveTo(1.672f, 6f, 1f, 6.672f, 1f, 7.5f)
            verticalLineToRelative(6f)
            curveTo(1f, 14.328f, 1.672f, 15f, 2.5f, 15f)
            horizontalLineToRelative(3f)
            curveTo(6.328f, 15f, 7f, 14.328f, 7f, 13.5f)
            verticalLineToRelative(-6f)
            curveTo(7f, 6.672f, 6.328f, 6f, 5.5f, 6f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(3f)
            curveTo(5.776f, 7f, 6f, 7.224f, 6f, 7.5f)
            verticalLineToRelative(6f)
            curveTo(6f, 13.776f, 5.776f, 14f, 5.5f, 14f)
            horizontalLineToRelative(-3f)
            curveTo(2.224f, 14f, 2f, 13.776f, 2f, 13.5f)
            verticalLineToRelative(-6f)
            curveTo(2f, 7.224f, 2.224f, 7f, 2.5f, 7f)
            close()
        }
    }.build()
}

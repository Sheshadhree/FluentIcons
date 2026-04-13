package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PhoneDesktop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneDesktop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(9f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            horizontalLineTo(9f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 15f, 14.5f, 15f)
            horizontalLineTo(13f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveTo(4.5f, 15f)
            curveTo(4.224f, 15f, 4f, 15.224f, 4f, 15.5f)
            reflectiveCurveTo(4.224f, 16f, 4.5f, 16f)
            horizontalLineToRelative(1f)
            curveTo(5.776f, 16f, 6f, 15.776f, 6f, 15.5f)
            reflectiveCurveTo(5.776f, 15f, 5.5f, 15f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(2f, 9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(3f)
            curveTo(7.328f, 8f, 8f, 8.672f, 8f, 9.5f)
            verticalLineToRelative(7f)
            curveTo(8f, 17.328f, 7.328f, 18f, 6.5f, 18f)
            horizontalLineToRelative(-3f)
            curveTo(2.672f, 18f, 2f, 17.328f, 2f, 16.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(3.5f, 9f)
            curveTo(3.224f, 9f, 3f, 9.224f, 3f, 9.5f)
            verticalLineToRelative(7f)
            curveTo(3f, 16.776f, 3.224f, 17f, 3.5f, 17f)
            horizontalLineToRelative(3f)
            curveTo(6.776f, 17f, 7f, 16.776f, 7f, 16.5f)
            verticalLineToRelative(-7f)
            curveTo(7f, 9.224f, 6.776f, 9f, 6.5f, 9f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}

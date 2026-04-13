package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneDesktop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneDesktop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveTo(4.895f, 1f, 4f, 1.895f, 4f, 3f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1.5f)
            curveTo(6.88f, 5f, 8f, 6.12f, 8f, 7.5f)
            verticalLineTo(11f)
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
            close()
            moveTo(2.5f, 6f)
            curveTo(1.672f, 6f, 1f, 6.672f, 1f, 7.5f)
            verticalLineToRelative(6f)
            curveTo(1f, 14.328f, 1.672f, 15f, 2.5f, 15f)
            horizontalLineToRelative(3f)
            curveTo(6.328f, 15f, 7f, 14.328f, 7f, 13.5f)
            verticalLineToRelative(-6f)
            curveTo(7f, 6.672f, 6.328f, 6f, 5.5f, 6f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(3f, 12.5f)
            curveTo(3f, 12.224f, 3.224f, 12f, 3.5f, 12f)
            horizontalLineToRelative(1f)
            curveTo(4.776f, 12f, 5f, 12.224f, 5f, 12.5f)
            reflectiveCurveTo(4.776f, 13f, 4.5f, 13f)
            horizontalLineToRelative(-1f)
            curveTo(3.224f, 13f, 3f, 12.776f, 3f, 12.5f)
            close()
        }
    }.build()
}

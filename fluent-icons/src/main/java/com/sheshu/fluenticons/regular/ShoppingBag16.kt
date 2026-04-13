package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShoppingBag16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShoppingBag16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 5f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            curveToRelative(0.364f, 0f, 0.706f, 0.097f, 1f, 0.268f)
            curveTo(8.294f, 1.098f, 8.636f, 1f, 9f, 1f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(0.5f)
            curveTo(12.328f, 5f, 13f, 5.672f, 13f, 6.5f)
            verticalLineTo(13f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6.5f)
            curveTo(3f, 5.672f, 3.672f, 5f, 4.5f, 5f)
            horizontalLineTo(5f)
            close()
            moveToRelative(1f, -2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(6f, 2.448f, 6f, 3f)
            close()
            moveToRelative(5f, 11f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6.5f)
            curveTo(12f, 6.224f, 11.776f, 6f, 11.5f, 6f)
            horizontalLineTo(10f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            close()
            moveTo(9f, 6f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 6f, 4f, 6.224f, 4f, 6.5f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4.268f)
            curveTo(9.098f, 13.706f, 9f, 13.364f, 9f, 13f)
            verticalLineTo(6f)
            close()
            moveToRelative(0f, -3f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            curveToRelative(-0.086f, 0f, -0.17f, 0.01f, -0.25f, 0.031f)
            curveTo(8.91f, 2.318f, 9f, 2.65f, 9f, 3f)
            close()
        }
    }.build()
}

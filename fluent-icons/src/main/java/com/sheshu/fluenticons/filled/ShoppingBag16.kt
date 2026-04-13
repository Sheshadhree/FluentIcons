package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShoppingBag16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShoppingBag16",
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
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(10f, 14.328f, 10f, 13.5f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            curveToRelative(-0.086f, 0f, -0.17f, 0.01f, -0.25f, 0.031f)
            curveTo(8.91f, 2.318f, 9f, 2.65f, 9f, 3f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.563f, 0.186f, 1.082f, 0.5f, 1.5f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6.5f)
            curveTo(3f, 5.672f, 3.672f, 5f, 4.5f, 5f)
            horizontalLineTo(5f)
            close()
            moveToRelative(2f, -3f)
            curveTo(6.448f, 2f, 6f, 2.448f, 6f, 3f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}

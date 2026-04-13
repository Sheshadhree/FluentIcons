package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShoppingBag20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShoppingBag20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2.5f)
            curveTo(9.582f, 2.186f, 9.063f, 2f, 8.5f, 2f)
            curveTo(7.12f, 2f, 6f, 3.12f, 6f, 4.5f)
            verticalLineTo(6f)
            horizontalLineTo(5f)
            curveTo(4.448f, 6f, 4f, 6.448f, 4f, 7f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-1f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            curveToRelative(-0.563f, 0f, -1.082f, 0.186f, -1.5f, 0.5f)
            close()
            moveToRelative(-3f, 2f)
            curveTo(7f, 3.672f, 7.672f, 3f, 8.5f, 3f)
            reflectiveCurveTo(10f, 3.672f, 10f, 4.5f)
            verticalLineTo(6f)
            horizontalLineTo(7f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(3.667f, -1.248f)
            curveTo(10.905f, 3.093f, 11.192f, 3f, 11.5f, 3f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(-2f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.454f, -0.121f, -0.88f, -0.333f, -1.248f)
            close()
            moveTo(7f, 17f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(7f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.563f, 0.186f, 1.082f, 0.5f, 1.5f)
            horizontalLineTo(7f)
            close()
            moveToRelative(8f, -1.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(12f, 16.328f, 12f, 15.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(8.5f)
            close()
        }
    }.build()
}

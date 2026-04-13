package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlideLayout20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideLayout20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 14f)
            curveTo(4.672f, 14f, 4f, 13.328f, 4f, 12.5f)
            verticalLineToRelative(-5f)
            curveTo(4f, 6.672f, 4.672f, 6f, 5.5f, 6f)
            horizontalLineToRelative(9f)
            curveTo(15.328f, 6f, 16f, 6.672f, 16f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(0f, -7f)
            curveTo(5.224f, 7f, 5f, 7.224f, 5f, 7.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(10f)
            verticalLineTo(7.5f)
            curveTo(15f, 7.224f, 14.776f, 7f, 14.5f, 7f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(7f, 10f)
            horizontalLineTo(5f)
            verticalLineToRelative(2.5f)
            curveTo(5f, 12.776f, 5.224f, 13f, 5.5f, 13f)
            horizontalLineTo(7f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(1f, 3f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(10f)
            horizontalLineTo(8f)
            verticalLineToRelative(3f)
            close()
            moveTo(2f, 6.5f)
            curveTo(2f, 5.12f, 3.12f, 4f, 4.5f, 4f)
            horizontalLineToRelative(11f)
            curveTo(16.88f, 4f, 18f, 5.12f, 18f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(4.5f, 5f)
            curveTo(3.672f, 5f, 3f, 5.672f, 3f, 6.5f)
            verticalLineToRelative(7f)
            curveTo(3f, 14.328f, 3.672f, 15f, 4.5f, 15f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(17f, 5.672f, 16.328f, 5f, 15.5f, 5f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}

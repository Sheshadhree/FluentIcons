package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideLayout20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideLayout20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 7f)
            horizontalLineToRelative(9f)
            curveTo(14.776f, 7f, 15f, 7.224f, 15f, 7.5f)
            verticalLineTo(9f)
            horizontalLineTo(5f)
            verticalLineTo(7.5f)
            curveTo(5f, 7.224f, 5.224f, 7f, 5.5f, 7f)
            close()
            moveTo(7f, 10f)
            verticalLineToRelative(3f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 13f, 5f, 12.776f, 5f, 12.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(7.5f, 3f)
            horizontalLineTo(8f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            close()
            moveToRelative(-10f, -9f)
            curveTo(3.12f, 4f, 2f, 5.12f, 2f, 6.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 14.88f, 3.12f, 16f, 4.5f, 16f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(18f, 5.12f, 16.88f, 4f, 15.5f, 4f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(10f, 10f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 14f, 4f, 13.328f, 4f, 12.5f)
            verticalLineToRelative(-5f)
            curveTo(4f, 6.672f, 4.672f, 6f, 5.5f, 6f)
            horizontalLineToRelative(9f)
            curveTo(15.328f, 6f, 16f, 6.672f, 16f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareShadow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareShadow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 1f)
            curveTo(9.88f, 1f, 11f, 2.12f, 11f, 3.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(1.5f)
            curveTo(13.88f, 5f, 15f, 6.12f, 15f, 7.5f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(7.5f)
            curveTo(6.12f, 15f, 5f, 13.88f, 5f, 12.5f)
            verticalLineTo(11f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 11f, 1f, 9.88f, 1f, 8.5f)
            verticalLineToRelative(-5f)
            curveTo(1f, 2.12f, 2.12f, 1f, 3.5f, 1f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(-5f, 1f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 9.328f, 2.672f, 10f, 3.5f, 10f)
            horizontalLineToRelative(5f)
            curveTo(9.328f, 10f, 10f, 9.328f, 10f, 8.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 2.672f, 9.328f, 2f, 8.5f, 2f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}

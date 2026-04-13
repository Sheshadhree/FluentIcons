package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarPattern20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarPattern20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            close()
            moveTo(4f, 5.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(12f)
            verticalLineTo(5.5f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            close()
            moveTo(14.707f, 8f)
            lineToRelative(-4f, 4f)
            horizontalLineToRelative(2.586f)
            lineTo(16f, 9.293f)
            verticalLineTo(8f)
            horizontalLineToRelative(-1.293f)
            close()
            moveToRelative(-1.414f, 0f)
            horizontalLineToRelative(-2.586f)
            lineToRelative(-4f, 4f)
            horizontalLineToRelative(2.586f)
            lineToRelative(4f, -4f)
            close()
            moveToRelative(-8f, 4f)
            lineToRelative(4f, -4f)
            horizontalLineTo(6.707f)
            lineTo(4f, 10.707f)
            verticalLineTo(12f)
            horizontalLineToRelative(1.293f)
            close()
            moveTo(4f, 9.293f)
            lineTo(5.293f, 8f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.293f)
            close()
            moveTo(14.707f, 12f)
            horizontalLineTo(16f)
            verticalLineToRelative(-1.293f)
            lineTo(14.707f, 12f)
            close()
        }
    }.build()
}

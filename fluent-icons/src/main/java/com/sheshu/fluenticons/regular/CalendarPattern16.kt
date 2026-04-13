package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarPattern16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarPattern16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineTo(4.5f)
            close()
            moveTo(11.707f, 7f)
            horizontalLineTo(13f)
            verticalLineToRelative(0.293f)
            lineTo(10.293f, 10f)
            horizontalLineTo(8.707f)
            lineToRelative(3f, -3f)
            close()
            moveToRelative(-1.414f, 0f)
            lineToRelative(-3f, 3f)
            horizontalLineTo(5.707f)
            lineToRelative(3f, -3f)
            horizontalLineToRelative(1.586f)
            close()
            moveToRelative(-6f, 3f)
            horizontalLineTo(3f)
            verticalLineTo(9.707f)
            lineTo(5.707f, 7f)
            horizontalLineToRelative(1.586f)
            lineToRelative(-3f, 3f)
            close()
            moveTo(3f, 8.293f)
            verticalLineTo(7f)
            horizontalLineToRelative(1.293f)
            lineTo(3f, 8.293f)
            close()
            moveTo(11.707f, 10f)
            lineTo(13f, 8.707f)
            verticalLineTo(10f)
            horizontalLineToRelative(-1.293f)
            close()
        }
    }.build()
}

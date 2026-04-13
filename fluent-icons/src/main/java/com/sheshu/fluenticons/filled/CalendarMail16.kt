package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarMail16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarMail16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.05f, 3f)
            horizontalLineToRelative(9.9f)
            curveTo(10.718f, 1.859f, 9.71f, 1f, 8.5f, 1f)
            horizontalLineToRelative(-5f)
            curveTo(2.29f, 1f, 1.282f, 1.859f, 1.05f, 3f)
            close()
            moveTo(11f, 4f)
            horizontalLineTo(1f)
            verticalLineToRelative(4.5f)
            curveTo(1f, 9.88f, 2.12f, 11f, 3.5f, 11f)
            horizontalLineTo(4f)
            verticalLineTo(8.5f)
            curveTo(4f, 7.12f, 5.12f, 6f, 6.5f, 6f)
            horizontalLineTo(11f)
            verticalLineTo(4f)
            close()
            moveToRelative(-1.224f, 7.947f)
            lineTo(5f, 9.56f)
            verticalLineToRelative(3.94f)
            curveTo(5f, 14.328f, 5.672f, 15f, 6.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(9.559f)
            lineToRelative(-4.776f, 2.388f)
            curveToRelative(-0.141f, 0.07f, -0.307f, 0.07f, -0.448f, 0f)
            close()
            moveTo(6.5f, 7f)
            curveTo(5.691f, 7f, 5.032f, 7.64f, 5.001f, 8.441f)
            lineToRelative(4.999f, 2.5f)
            lineToRelative(4.999f, -2.5f)
            curveTo(14.969f, 7.641f, 14.309f, 7f, 13.5f, 7f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}

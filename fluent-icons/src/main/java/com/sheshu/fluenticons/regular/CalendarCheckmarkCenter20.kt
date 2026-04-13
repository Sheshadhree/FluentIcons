package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarCheckmarkCenter20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarCheckmarkCenter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 3f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveTo(4f, 14.5f)
            curveTo(4f, 15.328f, 4.672f, 16f, 5.5f, 16f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(7f)
            horizontalLineTo(4f)
            verticalLineToRelative(7.5f)
            close()
            moveToRelative(8.646f, -5.354f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.707f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.195f, 0.196f, -0.511f, 0.196f, -0.707f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(0.171f, -0.17f, 0.435f, -0.192f, 0.63f, -0.064f)
            lineToRelative(0.078f, 0.064f)
            lineTo(9f, 12.793f)
            lineToRelative(3.646f, -3.646f)
            close()
            moveTo(5.5f, 4f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(12f)
            verticalLineTo(5.5f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarVideo20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarVideo20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineTo(5f)
            horizontalLineTo(2f)
            verticalLineTo(4.5f)
            close()
            moveTo(2f, 6f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(2f)
            horizontalLineTo(8.5f)
            curveTo(6.567f, 8f, 5f, 9.567f, 5f, 11.5f)
            verticalLineTo(14f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineTo(6f)
            close()
            moveToRelative(4f, 5.5f)
            curveTo(6f, 10.12f, 7.12f, 9f, 8.5f, 9f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(0.129f)
            lineToRelative(2.035f, -1.405f)
            curveToRelative(0.83f, -0.573f, 1.96f, 0.02f, 1.96f, 1.028f)
            verticalLineToRelative(5.498f)
            curveToRelative(0f, 1.007f, -1.13f, 1.6f, -1.96f, 1.028f)
            lineTo(16f, 16.373f)
            verticalLineTo(16.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveTo(7.12f, 19f, 6f, 17.88f, 6f, 16.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}

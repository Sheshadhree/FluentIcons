package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 10.88f, 3.12f, 12f, 4.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(12f, 3.12f, 10.88f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(3.085f, 4f)
            curveTo(3.291f, 3.417f, 3.847f, 3f, 4.5f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(0.653f, 0f, 1.209f, 0.417f, 1.415f, 1f)
            horizontalLineToRelative(-7.83f)
            close()
            moveTo(3f, 5f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(3.672f, 11f, 3f, 10.328f, 3f, 9.5f)
            verticalLineTo(5f)
            close()
            moveToRelative(3.5f, 9f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineToRelative(5.25f)
            curveTo(11.545f, 13f, 13f, 11.545f, 13f, 9.75f)
            verticalLineTo(4.5f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineToRelative(3.25f)
            curveTo(14f, 12.097f, 12.097f, 14f, 9.75f, 14f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}

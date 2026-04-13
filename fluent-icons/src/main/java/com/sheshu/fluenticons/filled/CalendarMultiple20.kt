package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 13.5f)
            verticalLineTo(6f)
            horizontalLineTo(2f)
            verticalLineToRelative(7.5f)
            curveTo(2f, 14.88f, 3.12f, 16f, 4.5f, 16f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveToRelative(0f, -9f)
            curveTo(16f, 3.12f, 14.88f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-9f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(14f)
            verticalLineTo(4.5f)
            close()
            moveTo(5f, 17f)
            curveToRelative(0.456f, 0.607f, 1.182f, 1f, 2f, 1f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.818f, -0.393f, -1.544f, -1f, -2f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}

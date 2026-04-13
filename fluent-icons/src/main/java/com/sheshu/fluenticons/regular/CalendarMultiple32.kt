package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.5f)
            curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
            horizontalLineToRelative(15f)
            curveTo(23.985f, 2f, 26f, 4.015f, 26f, 6.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-15f)
            curveTo(4.015f, 26f, 2f, 23.985f, 2f, 21.5f)
            verticalLineToRelative(-15f)
            close()
            moveTo(6.5f, 4f)
            curveTo(5.12f, 4f, 4f, 5.12f, 4f, 6.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(20f)
            verticalLineTo(6.5f)
            curveTo(24f, 5.12f, 22.88f, 4f, 21.5f, 4f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(4f, 21.5f)
            curveTo(4f, 22.88f, 5.12f, 24f, 6.5f, 24f)
            horizontalLineToRelative(15f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(9f)
            horizontalLineTo(4f)
            verticalLineToRelative(12.5f)
            close()
            moveToRelative(24f, -12f)
            verticalLineTo(5.757f)
            curveToRelative(1.206f, 0.808f, 2f, 2.183f, 2f, 3.743f)
            verticalLineTo(22f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            horizontalLineTo(9.5f)
            curveToRelative(-1.56f, 0f, -2.934f, -0.794f, -3.742f, -2f)
            horizontalLineTo(22f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            verticalLineTo(9.5f)
            close()
        }
    }.build()
}

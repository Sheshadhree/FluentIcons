package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            curveTo(4.015f, 2f, 2f, 4.015f, 2f, 6.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(24f)
            verticalLineTo(6.5f)
            curveTo(26f, 4.015f, 23.985f, 2f, 21.5f, 2f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(2f, 21.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(24f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-15f)
            curveTo(4.015f, 26f, 2f, 23.985f, 2f, 21.5f)
            close()
            moveToRelative(26f, -12f)
            verticalLineTo(5.757f)
            curveToRelative(1.206f, 0.808f, 2f, 2.183f, 2f, 3.743f)
            verticalLineTo(22f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            horizontalLineTo(9.5f)
            curveToRelative(-1.56f, 0f, -2.935f, -0.794f, -3.742f, -2f)
            horizontalLineTo(22f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            verticalLineTo(9.5f)
            close()
        }
    }.build()
}

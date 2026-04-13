package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarMail20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarMail20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(12f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(14f, 6f)
            horizontalLineTo(2f)
            verticalLineToRelative(5.5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineTo(5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(6f)
            verticalLineTo(6f)
            close()
            moveToRelative(-7.93f, 4.475f)
            curveTo(6.3f, 9.625f, 7.076f, 9f, 8f, 9f)
            horizontalLineToRelative(8f)
            curveToRelative(0.923f, 0f, 1.7f, 0.625f, 1.93f, 1.475f)
            lineTo(12f, 13.961f)
            lineToRelative(-5.93f, -3.486f)
            close()
            moveToRelative(6.31f, 4.423f)
            lineTo(18f, 11.594f)
            verticalLineTo(16f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-4.405f)
            lineToRelative(5.62f, 3.303f)
            curveToRelative(0.235f, 0.138f, 0.526f, 0.138f, 0.76f, 0f)
            close()
        }
    }.build()
}

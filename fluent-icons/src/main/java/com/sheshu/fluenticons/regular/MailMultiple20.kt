package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 5.5f)
            curveTo(16f, 4.12f, 14.88f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(9.254f, 9.931f)
            lineTo(15f, 6.961f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(3.672f, 14f, 3f, 13.328f, 3f, 12.5f)
            verticalLineTo(6.963f)
            lineToRelative(5.746f, 2.968f)
            lineToRelative(0.082f, 0.038f)
            curveToRelative(0.139f, 0.052f, 0.295f, 0.039f, 0.426f, -0.038f)
            close()
            moveTo(4.5f, 4f)
            horizontalLineToRelative(9f)
            curveTo(14.328f, 4f, 15f, 4.672f, 15f, 5.5f)
            verticalLineToRelative(0.301f)
            lineTo(9f, 8.92f)
            lineTo(3f, 5.802f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            close()
            moveToRelative(2f, 13f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineToRelative(9f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}

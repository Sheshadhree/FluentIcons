package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailCopy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailCopy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5.5f)
            curveTo(4f, 4.12f, 5.12f, 3f, 6.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(16.88f, 3f, 18f, 4.12f, 18f, 5.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(5.12f, 15f, 4f, 13.88f, 4f, 12.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(6.746f, 4.431f)
            lineTo(5f, 6.961f)
            verticalLineTo(12.5f)
            curveTo(5f, 13.328f, 5.672f, 14f, 6.5f, 14f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(6.963f)
            lineToRelative(-5.746f, 2.968f)
            lineToRelative(-0.082f, 0.038f)
            curveToRelative(-0.139f, 0.052f, -0.295f, 0.039f, -0.426f, -0.038f)
            close()
            moveTo(15.5f, 4f)
            horizontalLineToRelative(-9f)
            curveTo(5.672f, 4f, 5f, 4.672f, 5f, 5.5f)
            verticalLineToRelative(0.301f)
            lineToRelative(6f, 3.119f)
            lineToRelative(6f, -3.118f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.672f, 16.328f, 4f, 15.5f, 4f)
            close()
            moveToRelative(-2f, 13f)
            curveToRelative(0.818f, 0f, 1.544f, -0.393f, 2f, -1f)
            horizontalLineToRelative(-9f)
            curveTo(4.567f, 16f, 3f, 14.433f, 3f, 12.5f)
            verticalLineToRelative(-7f)
            curveToRelative(-0.607f, 0.456f, -1f, 1.182f, -1f, 2f)
            verticalLineToRelative(5f)
            curveTo(2f, 14.985f, 4.015f, 17f, 6.5f, 17f)
            horizontalLineToRelative(7f)
            close()
        }
    }.build()
}

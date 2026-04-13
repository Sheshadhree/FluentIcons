package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailCopy32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailCopy32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 9.5f)
            curveTo(6f, 7.015f, 8.015f, 5f, 10.5f, 5f)
            horizontalLineToRelative(15f)
            curveTo(27.985f, 5f, 30f, 7.015f, 30f, 9.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-15f)
            curveTo(8.015f, 24f, 6f, 21.985f, 6f, 19.5f)
            verticalLineToRelative(-10f)
            close()
            moveToRelative(2f, -0.054f)
            lineToRelative(10f, 5.417f)
            lineToRelative(10f, -5.417f)
            curveTo(27.97f, 8.09f, 26.862f, 7f, 25.5f, 7f)
            horizontalLineToRelative(-15f)
            curveTo(9.137f, 7f, 8.03f, 8.09f, 8f, 9.446f)
            close()
            moveToRelative(20f, 2.274f)
            lineToRelative(-9.524f, 5.16f)
            curveToRelative(-0.297f, 0.16f, -0.656f, 0.16f, -0.953f, 0f)
            lineTo(8f, 11.72f)
            verticalLineToRelative(7.78f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(15f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7.78f)
            close()
            moveTo(2f, 13.5f)
            curveToRelative(0f, -1.56f, 0.794f, -2.935f, 2f, -3.742f)
            verticalLineTo(19.5f)
            curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(14.742f)
            curveToRelative(-0.807f, 1.206f, -2.182f, 2f, -3.742f, 2f)
            horizontalLineToRelative(-11f)
            curveTo(5.806f, 28f, 2f, 24.195f, 2f, 19.5f)
            verticalLineToRelative(-6f)
            close()
        }
    }.build()
}

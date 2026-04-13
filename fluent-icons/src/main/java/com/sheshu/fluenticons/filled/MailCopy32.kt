package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailCopy32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailCopy32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 5f)
            curveTo(8.383f, 5f, 6.607f, 6.462f, 6.128f, 8.432f)
            lineToRelative(11.871f, 6.43f)
            lineToRelative(11.873f, -6.43f)
            curveTo(29.392f, 6.462f, 27.617f, 5f, 25.5f, 5f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(6f, 19.5f)
            verticalLineToRelative(-8.863f)
            lineToRelative(11.523f, 6.242f)
            curveToRelative(0.297f, 0.161f, 0.655f, 0.161f, 0.953f, 0f)
            lineTo(30f, 10.637f)
            verticalLineTo(19.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-15f)
            curveTo(8.015f, 24f, 6f, 21.985f, 6f, 19.5f)
            close()
            moveTo(4f, 9.758f)
            curveTo(2.794f, 10.565f, 2f, 11.94f, 2f, 13.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 4.695f, 3.806f, 8.5f, 8.5f, 8.5f)
            horizontalLineToRelative(11f)
            curveToRelative(1.56f, 0f, 2.935f, -0.794f, 3.742f, -2f)
            horizontalLineTo(10.5f)
            curveTo(6.91f, 26f, 4f, 23.09f, 4f, 19.5f)
            verticalLineTo(9.758f)
            close()
        }
    }.build()
}

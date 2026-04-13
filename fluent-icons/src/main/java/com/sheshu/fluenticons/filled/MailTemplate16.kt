package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailTemplate16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailTemplate16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(6f)
            curveTo(2f, 11.88f, 3.12f, 13f, 4.5f, 13f)
            horizontalLineTo(5f)
            verticalLineTo(9.5f)
            curveTo(5f, 8.12f, 6.12f, 7f, 7.5f, 7f)
            horizontalLineTo(13f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.12f, 11.88f, 2f, 10.5f, 2f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(0f, 2.5f)
            curveTo(4.5f, 4.224f, 4.724f, 4f, 5f, 4f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.276f, 5f, 10f, 5f)
            horizontalLineTo(5f)
            curveTo(4.724f, 5f, 4.5f, 4.776f, 4.5f, 4.5f)
            close()
            moveToRelative(1.502f, 4.929f)
            curveTo(6.039f, 8.633f, 6.695f, 8f, 7.5f, 8f)
            horizontalLineToRelative(6f)
            curveToRelative(0.805f, 0f, 1.461f, 0.633f, 1.498f, 1.429f)
            lineTo(10.5f, 11.928f)
            lineToRelative(-4.498f, -2.5f)
            close()
            moveToRelative(4.74f, 3.508f)
            lineTo(15f, 10.572f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveTo(6.672f, 15f, 6f, 14.328f, 6f, 13.5f)
            verticalLineToRelative(-2.928f)
            lineToRelative(4.257f, 2.365f)
            curveToRelative(0.151f, 0.084f, 0.335f, 0.084f, 0.486f, 0f)
            close()
        }
    }.build()
}

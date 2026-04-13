package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailInbox20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailInbox20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(1f, 4f)
            horizontalLineToRelative(3.5f)
            curveTo(7.776f, 10f, 8f, 10.223f, 8f, 10.5f)
            verticalLineToRelative(0.011f)
            lineToRelative(0.004f, 0.06f)
            curveToRelative(0.004f, 0.056f, 0.012f, 0.138f, 0.028f, 0.237f)
            curveToRelative(0.034f, 0.202f, 0.1f, 0.463f, 0.228f, 0.718f)
            curveToRelative(0.126f, 0.254f, 0.308f, 0.492f, 0.572f, 0.667f)
            curveTo(9.092f, 12.367f, 9.462f, 12.5f, 10f, 12.5f)
            curveToRelative(0.537f, 0f, 0.907f, -0.133f, 1.168f, -0.307f)
            curveToRelative(0.264f, -0.175f, 0.446f, -0.413f, 0.572f, -0.667f)
            curveToRelative(0.128f, -0.255f, 0.194f, -0.516f, 0.228f, -0.718f)
            curveToRelative(0.016f, -0.1f, 0.024f, -0.181f, 0.028f, -0.236f)
            lineTo(12f, 10.512f)
            verticalLineToRelative(-0.015f)
            curveTo(12.001f, 10.223f, 12.225f, 10f, 12.5f, 10f)
            horizontalLineTo(16f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(4f, 0.5f)
            verticalLineToRelative(-0.002f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailUnread20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailUnread20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 6f)
            curveTo(18.88f, 6f, 20f, 4.88f, 20f, 3.5f)
            reflectiveCurveTo(18.88f, 1f, 17.5f, 1f)
            curveToRelative(-1.21f, 0f, -2.218f, 0.859f, -2.45f, 2f)
            lineToRelative(-0.011f, 0.058f)
            curveTo(15.013f, 3.2f, 15f, 3.349f, 15f, 3.5f)
            curveToRelative(0f, 1.146f, 0.77f, 2.112f, 1.822f, 2.407f)
            curveTo(17.038f, 5.967f, 17.265f, 6f, 17.5f, 6f)
            close()
            moveToRelative(-13f, -3f)
            horizontalLineToRelative(9.535f)
            curveTo(14.012f, 3.163f, 14f, 3.33f, 14f, 3.5f)
            curveToRelative(0f, 1.298f, 0.706f, 2.43f, 1.755f, 3.035f)
            lineTo(10f, 9.92f)
            lineTo(2.015f, 5.223f)
            curveTo(2.153f, 3.973f, 3.213f, 3f, 4.5f, 3f)
            close()
            moveToRelative(5.754f, 7.931f)
            lineToRelative(6.742f, -3.967f)
            curveTo(17.16f, 6.988f, 17.329f, 7f, 17.5f, 7f)
            curveToRelative(0.17f, 0f, 0.337f, -0.012f, 0.5f, -0.035f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 16f, 2f, 14.88f, 2f, 13.5f)
            verticalLineTo(6.373f)
            lineToRelative(7.747f, 4.558f)
            curveToRelative(0.156f, 0.092f, 0.35f, 0.092f, 0.507f, 0f)
            close()
        }
    }.build()
}

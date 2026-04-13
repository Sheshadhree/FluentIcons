package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Prohibited48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Prohibited48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(35.46f, 10.773f)
            curveToRelative(-6.876f, -5.969f, -17.297f, -5.684f, -23.834f, 0.853f)
            curveToRelative(-6.537f, 6.537f, -6.822f, 16.959f, -0.853f, 23.833f)
            lineToRelative(24.686f, -24.686f)
            close()
            moveToRelative(1.767f, 1.768f)
            lineTo(12.541f, 37.227f)
            curveToRelative(6.875f, 5.969f, 17.296f, 5.684f, 23.833f, -0.853f)
            curveToRelative(6.537f, -6.537f, 6.822f, -16.959f, 0.853f, -23.833f)
            close()
            moveTo(9.857f, 9.858f)
            curveToRelative(7.811f, -7.81f, 20.475f, -7.81f, 28.285f, 0f)
            curveToRelative(7.81f, 7.81f, 7.81f, 20.474f, 0f, 28.284f)
            curveToRelative(-7.81f, 7.81f, -20.474f, 7.81f, -28.284f, 0f)
            curveToRelative(-7.81f, -7.81f, -7.81f, -20.474f, 0f, -28.284f)
            close()
        }
    }.build()
}

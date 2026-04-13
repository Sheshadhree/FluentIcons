package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceBlocked16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceBlocked16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 8f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            close()
            moveToRelative(-2f, 0f)
            curveToRelative(0f, -1.296f, -0.41f, -2.496f, -1.11f, -3.477f)
            lineToRelative(-8.367f, 8.368f)
            curveTo(5.504f, 13.589f, 6.704f, 14f, 8f, 14f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            close()
            moveToRelative(-2.524f, -4.89f)
            curveTo(10.496f, 2.41f, 9.296f, 2f, 8f, 2f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            curveToRelative(0f, 1.296f, 0.41f, 2.496f, 1.11f, 3.476f)
            lineToRelative(8.367f, -8.367f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceBlocked12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceBlocked12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 6f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveTo(0f, 9.314f, 0f, 6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
            moveToRelative(-1.5f, 0f)
            curveToRelative(0f, -0.972f, -0.308f, -1.872f, -0.832f, -2.607f)
            lineTo(3.393f, 9.668f)
            curveTo(4.128f, 10.192f, 5.028f, 10.5f, 6f, 10.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            close()
            moveTo(8.607f, 2.332f)
            curveTo(7.872f, 1.808f, 6.972f, 1.5f, 6f, 1.5f)
            curveTo(3.515f, 1.5f, 1.5f, 3.515f, 1.5f, 6f)
            curveToRelative(0f, 0.972f, 0.308f, 1.872f, 0.832f, 2.607f)
            lineToRelative(6.275f, -6.275f)
            close()
        }
    }.build()
}

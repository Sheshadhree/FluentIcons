package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceBlocked24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceBlocked24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12f)
            curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.627f, 0f, 12f)
            reflectiveCurveTo(5.373f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            close()
            moveToRelative(-3f, 0f)
            curveToRelative(0f, -1.944f, -0.616f, -3.744f, -1.664f, -5.215f)
            lineTo(6.786f, 19.336f)
            curveTo(8.255f, 20.384f, 10.055f, 21f, 12f, 21f)
            curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
            close()
            moveToRelative(-3.785f, -7.336f)
            curveTo(15.743f, 3.616f, 13.944f, 3f, 12f, 3f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            curveToRelative(0f, 1.944f, 0.616f, 3.743f, 1.664f, 5.215f)
            lineToRelative(12.55f, -12.551f)
            close()
        }
    }.build()
}

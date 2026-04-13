package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceAway12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceAway12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 5.655f)
            verticalLineTo(3.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(5f, 2.836f, 5f, 3.25f)
            verticalLineTo(6f)
            curveToRelative(0f, 0.219f, 0.096f, 0.427f, 0.262f, 0.57f)
            lineToRelative(1.75f, 1.5f)
            curveTo(7.326f, 8.338f, 7.8f, 8.302f, 8.069f, 7.987f)
            curveTo(8.34f, 7.674f, 8.303f, 7.2f, 7.99f, 6.931f)
            lineTo(6.5f, 5.655f)
            close()
            moveTo(12f, 6f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveTo(0f, 9.314f, 0f, 6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
            moveToRelative(-1.5f, 0f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveTo(1.5f, 3.515f, 1.5f, 6f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            close()
        }
    }.build()
}

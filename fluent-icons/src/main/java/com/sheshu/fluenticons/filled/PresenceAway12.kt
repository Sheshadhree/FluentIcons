package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceAway12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceAway12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 12f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveTo(9.314f, 0f, 6f, 0f)
            reflectiveCurveTo(0f, 2.686f, 0f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            close()
            moveToRelative(0.5f, -8.75f)
            verticalLineToRelative(2.405f)
            lineToRelative(1.488f, 1.276f)
            curveTo(8.303f, 7.2f, 8.34f, 7.674f, 8.07f, 7.988f)
            curveTo(7.8f, 8.303f, 7.326f, 8.34f, 7.012f, 8.07f)
            lineToRelative(-1.75f, -1.5f)
            curveTo(5.096f, 6.427f, 5f, 6.22f, 5f, 6f)
            verticalLineTo(3.25f)
            curveTo(5f, 2.836f, 5.336f, 2.5f, 5.75f, 2.5f)
            reflectiveCurveTo(6.5f, 2.836f, 6.5f, 3.25f)
            close()
        }
    }.build()
}

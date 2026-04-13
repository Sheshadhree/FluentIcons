package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceBlocked20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceBlocked20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 10f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(0f, 4.477f, 0f, 10f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            close()
            moveToRelative(-2f, 0f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            curveToRelative(-1.849f, 0f, -3.551f, -0.627f, -4.906f, -1.68f)
            lineTo(16.32f, 5.094f)
            curveTo(17.373f, 6.45f, 18f, 8.151f, 18f, 10f)
            close()
            moveToRelative(-3.094f, -6.32f)
            lineTo(3.68f, 14.906f)
            curveTo(2.627f, 13.55f, 2f, 11.849f, 2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            curveToRelative(1.849f, 0f, 3.55f, 0.627f, 4.906f, 1.68f)
            close()
        }
    }.build()
}

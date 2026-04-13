package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PresenceBlocked10: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceBlocked10",
        defaultWidth = 10.dp,
        defaultHeight = 10.dp,
        viewportWidth = 10f,
        viewportHeight = 10f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 5f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveTo(0f, 2.239f, 0f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            close()
            moveTo(9f, 5f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            curveToRelative(-0.924f, 0f, -1.776f, -0.313f, -2.453f, -0.84f)
            lineTo(8.16f, 2.547f)
            curveTo(8.687f, 3.224f, 9f, 4.076f, 9f, 5f)
            close()
            moveTo(7.453f, 1.84f)
            lineTo(1.84f, 7.453f)
            curveTo(1.313f, 6.775f, 1f, 5.924f, 1f, 5f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            curveToRelative(0.924f, 0f, 1.776f, 0.313f, 2.453f, 0.84f)
            close()
        }
    }.build()
}

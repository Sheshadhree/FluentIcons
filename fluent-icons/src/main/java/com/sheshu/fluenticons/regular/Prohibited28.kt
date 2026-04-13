package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Prohibited28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Prohibited28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            reflectiveCurveTo(7.373f, 2f, 14f, 2f)
            close()
            moveToRelative(7.936f, 5.124f)
            lineTo(7.124f, 21.936f)
            curveTo(8.966f, 23.533f, 11.37f, 24.5f, 14f, 24.5f)
            curveToRelative(5.799f, 0f, 10.5f, -4.701f, 10.5f, -10.5f)
            curveToRelative(0f, -2.63f, -0.967f, -5.034f, -2.564f, -6.876f)
            close()
            moveTo(14f, 3.5f)
            curveTo(8.201f, 3.5f, 3.5f, 8.201f, 3.5f, 14f)
            curveToRelative(0f, 2.63f, 0.967f, 5.034f, 2.564f, 6.876f)
            lineTo(20.876f, 6.064f)
            curveTo(19.034f, 4.467f, 16.63f, 3.5f, 14f, 3.5f)
            close()
        }
    }.build()
}

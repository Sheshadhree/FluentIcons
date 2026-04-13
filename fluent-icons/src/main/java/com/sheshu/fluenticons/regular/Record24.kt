package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Record24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Record24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 18f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            close()
            moveToRelative(0f, -16f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            close()
            moveTo(3.5f, 12f)
            curveToRelative(0f, -4.694f, 3.806f, -8.5f, 8.5f, -8.5f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Prohibited24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Prohibited24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(6.517f, 4.543f)
            lineTo(6.543f, 18.517f)
            curveTo(8.02f, 19.755f, 9.923f, 20.5f, 12f, 20.5f)
            curveToRelative(4.694f, 0f, 8.5f, -3.806f, 8.5f, -8.5f)
            curveToRelative(0f, -2.077f, -0.745f, -3.98f, -1.983f, -5.457f)
            close()
            moveTo(12f, 3.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            curveToRelative(0f, 2.077f, 0.745f, 3.98f, 1.983f, 5.457f)
            lineTo(17.457f, 5.483f)
            curveTo(15.98f, 4.245f, 14.077f, 3.5f, 12f, 3.5f)
            close()
        }
    }.build()
}

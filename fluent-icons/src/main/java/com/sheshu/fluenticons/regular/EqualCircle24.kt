package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EqualCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EqualCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.258f, 10.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(16.672f, 9f, 16.258f, 9f)
            horizontalLineTo(7.77f)
            curveTo(7.356f, 9f, 7.02f, 9.336f, 7.02f, 9.75f)
            reflectiveCurveToRelative(0.335f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(8.487f)
            close()
            moveToRelative(0f, 4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(7.77f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(7.356f, 15f, 7.77f, 15f)
            horizontalLineToRelative(8.487f)
            close()
            moveTo(22f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            close()
            moveTo(12f, 3.5f)
            curveToRelative(4.694f, 0f, 8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            reflectiveCurveTo(7.306f, 3.5f, 12f, 3.5f)
            close()
        }
    }.build()
}

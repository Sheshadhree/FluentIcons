package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Person48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Person48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveToRelative(-5.523f, 0f, -10f, 4.477f, -10f, 10f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(29.523f, 4f, 24f, 4f)
            close()
            moveTo(12.25f, 28f)
            curveTo(9.903f, 28f, 8f, 29.901f, 8f, 32.249f)
            verticalLineTo(33f)
            curveToRelative(0f, 3.755f, 1.942f, 6.567f, 4.92f, 8.38f)
            curveTo(15.85f, 43.163f, 19.786f, 44f, 24f, 44f)
            reflectiveCurveToRelative(8.15f, -0.837f, 11.08f, -2.62f)
            curveTo(38.058f, 39.567f, 40f, 36.755f, 40f, 33f)
            verticalLineToRelative(-0.751f)
            curveTo(40f, 29.9f, 38.097f, 28f, 35.75f, 28f)
            horizontalLineToRelative(-23.5f)
            close()
        }
    }.build()
}

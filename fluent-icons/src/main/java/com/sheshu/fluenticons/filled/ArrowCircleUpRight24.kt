package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleUpRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleUpRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            close()
            moveTo(8.75f, 9.5f)
            horizontalLineToRelative(4.74f)
            lineToRelative(-5.268f, 5.217f)
            curveToRelative(-0.294f, 0.292f, -0.296f, 0.766f, -0.005f, 1.06f)
            curveToRelative(0.292f, 0.295f, 0.766f, 0.297f, 1.06f, 0.006f)
            lineTo(14.5f, 10.61f)
            verticalLineToRelative(4.639f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(16f, 15.664f, 16f, 15.25f)
            verticalLineToRelative(-6.5f)
            curveTo(16f, 8.336f, 15.664f, 8f, 15.25f, 8f)
            horizontalLineToRelative(-6.5f)
            curveTo(8.336f, 8f, 8f, 8.336f, 8f, 8.75f)
            reflectiveCurveTo(8.336f, 9.5f, 8.75f, 9.5f)
            close()
        }
    }.build()
}

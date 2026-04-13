package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleUpLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleUpLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 22f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            close()
            moveToRelative(3.25f, -12.5f)
            horizontalLineToRelative(-4.74f)
            lineToRelative(5.268f, 5.217f)
            curveToRelative(0.294f, 0.292f, 0.296f, 0.766f, 0.005f, 1.06f)
            curveToRelative(-0.292f, 0.295f, -0.766f, 0.297f, -1.06f, 0.006f)
            lineTo(9.5f, 10.61f)
            verticalLineToRelative(4.639f)
            curveTo(9.5f, 15.664f, 9.164f, 16f, 8.75f, 16f)
            reflectiveCurveTo(8f, 15.664f, 8f, 15.25f)
            verticalLineToRelative(-6.5f)
            curveTo(8f, 8.336f, 8.336f, 8f, 8.75f, 8f)
            horizontalLineToRelative(6.5f)
            curveTo(15.664f, 8f, 16f, 8.336f, 16f, 8.75f)
            reflectiveCurveTo(15.664f, 9.5f, 15.25f, 9.5f)
            close()
        }
    }.build()
}

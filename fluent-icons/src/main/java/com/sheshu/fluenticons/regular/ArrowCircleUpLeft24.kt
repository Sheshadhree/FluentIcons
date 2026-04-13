package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleUpLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleUpLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.51f, 9.5f)
            horizontalLineToRelative(4.74f)
            curveTo(15.664f, 9.5f, 16f, 9.164f, 16f, 8.75f)
            reflectiveCurveTo(15.664f, 8f, 15.25f, 8f)
            horizontalLineToRelative(-6.5f)
            curveTo(8.336f, 8f, 8f, 8.336f, 8f, 8.75f)
            verticalLineToRelative(6.5f)
            curveTo(8f, 15.664f, 8.336f, 16f, 8.75f, 16f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-4.639f)
            lineToRelative(5.222f, 5.172f)
            curveToRelative(0.295f, 0.291f, 0.77f, 0.29f, 1.06f, -0.005f)
            curveToRelative(0.292f, -0.295f, 0.29f, -0.77f, -0.004f, -1.06f)
            lineTo(10.509f, 9.5f)
            close()
            moveTo(22f, 12f)
            curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            close()
            moveToRelative(-10f, 8.5f)
            curveToRelative(4.694f, 0f, 8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveTo(16.694f, 3.5f, 12f, 3.5f)
            reflectiveCurveTo(3.5f, 7.306f, 3.5f, 12f)
            reflectiveCurveToRelative(3.806f, 8.5f, 8.5f, 8.5f)
            close()
        }
    }.build()
}

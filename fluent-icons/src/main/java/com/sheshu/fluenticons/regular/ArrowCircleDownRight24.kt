package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleDownRight24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleDownRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.49f, 14.5f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 14.5f, 8f, 14.836f, 8f, 15.25f)
            reflectiveCurveTo(8.336f, 16f, 8.75f, 16f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-6.5f)
            curveTo(16f, 8.336f, 15.664f, 8f, 15.25f, 8f)
            reflectiveCurveTo(14.5f, 8.336f, 14.5f, 8.75f)
            verticalLineToRelative(4.639f)
            lineTo(9.278f, 8.217f)
            curveToRelative(-0.295f, -0.291f, -0.77f, -0.29f, -1.06f, 0.005f)
            curveToRelative(-0.292f, 0.295f, -0.29f, 0.77f, 0.004f, 1.06f)
            lineToRelative(5.269f, 5.218f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            close()
            moveToRelative(10f, -8.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            reflectiveCurveToRelative(3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveToRelative(-3.806f, -8.5f, -8.5f, -8.5f)
            close()
        }
    }.build()
}

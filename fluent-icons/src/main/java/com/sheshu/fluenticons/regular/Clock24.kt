package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Clock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Clock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 12f)
            curveToRelative(0f, -4.694f, 3.806f, -8.5f, 8.5f, -8.5f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            close()
            moveToRelative(-0.007f, 4.648f)
            curveTo(11.943f, 6.282f, 11.63f, 6f, 11.25f, 6f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(6f)
            lineToRelative(0.007f, 0.102f)
            curveToRelative(0.05f, 0.366f, 0.364f, 0.648f, 0.743f, 0.648f)
            horizontalLineToRelative(4f)
            lineToRelative(0.102f, -0.007f)
            curveTo(15.718f, 13.443f, 16f, 13.13f, 16f, 12.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(12f)
            verticalLineTo(6.75f)
            lineToRelative(-0.007f, -0.102f)
            close()
        }
    }.build()
}

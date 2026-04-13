package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SubtractCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SubtractCircle24",
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
            moveToRelative(-4.25f, 9.25f)
            curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
            curveToRelative(0f, 0.38f, 0.282f, 0.694f, 0.648f, 0.743f)
            lineTo(7.75f, 12.75f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.38f, -0.282f, -0.694f, -0.648f, -0.743f)
            lineTo(16.25f, 11.25f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}

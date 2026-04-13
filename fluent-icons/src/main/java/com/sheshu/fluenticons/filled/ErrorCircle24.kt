package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ErrorCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ErrorCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.478f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.522f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(0.002f, 13.004f)
            curveToRelative(-0.552f, 0f, -0.999f, 0.447f, -0.999f, 0.998f)
            curveToRelative(0f, 0.552f, 0.447f, 0.999f, 0.999f, 0.999f)
            curveToRelative(0.551f, 0f, 0.998f, -0.447f, 0.998f, -0.999f)
            curveToRelative(0f, -0.551f, -0.447f, -0.998f, -0.998f, -0.998f)
            close()
            moveTo(12f, 7f)
            curveToRelative(-0.513f, 0f, -0.936f, 0.386f, -0.993f, 0.884f)
            lineTo(11f, 8f)
            lineToRelative(0.002f, 5.001f)
            lineToRelative(0.007f, 0.117f)
            curveTo(11.066f, 13.615f, 11.489f, 14f, 12.002f, 14f)
            reflectiveCurveToRelative(0.935f, -0.386f, 0.993f, -0.884f)
            lineTo(13.002f, 13f)
            lineTo(13f, 8f)
            lineToRelative(-0.007f, -0.117f)
            curveTo(12.935f, 7.386f, 12.513f, 7f, 12f, 7f)
            close()
        }
    }.build()
}

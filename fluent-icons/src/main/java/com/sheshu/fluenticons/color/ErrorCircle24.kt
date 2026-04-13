package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ErrorCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ErrorCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401)
                ),
                start = Offset(5.125f, -1.125f),
                end = Offset(18.25f, 23.875f)
            )
        ) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.478f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.522f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF212121)
                ),
                start = Offset(9.33183f, 7f),
                end = Offset(14.1337f, 17.2522f)
            )
        ) {
            moveTo(12.002f, 15.004f)
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

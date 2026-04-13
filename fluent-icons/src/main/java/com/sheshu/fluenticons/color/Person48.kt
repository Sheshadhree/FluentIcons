package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Person48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Person48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(15.6097f, 30.127f),
                end = Offset(20.779f, 46.6354f)
            )
        ) {
            moveTo(12.25f, 28f)
            curveTo(9.903f, 28f, 8f, 29.901f, 8f, 32.249f)
            verticalLineTo(33f)
            curveToRelative(0f, 3.756f, 1.942f, 6.567f, 4.92f, 8.38f)
            curveTo(15.85f, 43.163f, 19.786f, 44f, 24f, 44f)
            reflectiveCurveToRelative(8.15f, -0.837f, 11.08f, -2.62f)
            curveTo(38.058f, 39.567f, 40f, 36.756f, 40f, 33f)
            verticalLineToRelative(-0.751f)
            curveTo(40f, 29.9f, 38.097f, 28f, 35.75f, 28f)
            horizontalLineToRelative(-23.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(24f, 26.0952f),
                end = Offset(31.2381f, 53.1429f)
            )
        ) {
            moveTo(12.25f, 28f)
            curveTo(9.903f, 28f, 8f, 29.901f, 8f, 32.249f)
            verticalLineTo(33f)
            curveToRelative(0f, 3.756f, 1.942f, 6.567f, 4.92f, 8.38f)
            curveTo(15.85f, 43.163f, 19.786f, 44f, 24f, 44f)
            reflectiveCurveToRelative(8.15f, -0.837f, 11.08f, -2.62f)
            curveTo(38.058f, 39.567f, 40f, 36.756f, 40f, 33f)
            verticalLineToRelative(-0.751f)
            curveTo(40f, 29.9f, 38.097f, 28f, 35.75f, 28f)
            horizontalLineToRelative(-23.5f)
            close()
            moveTo(24f, 4f)
            curveToRelative(-5.523f, 0f, -10f, 4.477f, -10f, 10f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(29.523f, 4f, 24f, 4f)
            close()
        }
    }.build()
}

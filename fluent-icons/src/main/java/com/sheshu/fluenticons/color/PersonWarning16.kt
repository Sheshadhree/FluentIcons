package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PersonWarning16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PersonWarning16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(4.37804f, 8.79761f),
                end = Offset(6.61628f, 14.7542f)
            )
        ) {
            moveTo(10.5f, 8f)
            curveTo(11.328f, 8f, 12f, 8.672f, 12f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.971f, -1.86f, 4f, -5f, 4f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(7f, 7.28571f),
                end = Offset(10.1641f, 17.1388f)
            )
        ) {
            moveTo(10.5f, 8f)
            curveTo(11.328f, 8f, 12f, 8.672f, 12f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.971f, -1.86f, 4f, -5f, 4f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(7f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xBF0A1852),
                    1f to Color(0x000A1852)
                ),
                center = Offset(9.85714f, 14.8571f),
                radius = 9.03507f
            ),
            fillAlpha = 0.75f
        ) {
            moveTo(10.5f, 8f)
            curveTo(11.328f, 8f, 12f, 8.672f, 12f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.971f, -1.86f, 4f, -5f, 4f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(5.55792f, 2.23115f),
                end = Offset(8.36093f, 6.70691f)
            )
        ) {
            moveTo(7f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(8.519f, 7f, 7f, 7f)
            reflectiveCurveTo(4.25f, 5.769f, 4.25f, 4.25f)
            reflectiveCurveTo(5.481f, 1.5f, 7f, 1.5f)
            close()
            moveToRelative(3.603f, 6.054f)
            lineToRelative(-3.496f, 6.998f)
            curveTo(6.774f, 15.217f, 7.258f, 16f, 8.002f, 16f)
            horizontalLineToRelative(6.996f)
            curveToRelative(0.744f, 0f, 1.228f, -0.783f, 0.895f, -1.448f)
            lineToRelative(-3.5f, -6.999f)
            curveToRelative(-0.368f, -0.738f, -1.421f, -0.737f, -1.79f, 0f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF212121)
                ),
                start = Offset(10.1635f, 8.99471f),
                end = Offset(13.3706f, 14.6967f)
            )
        ) {
            moveTo(11.998f, 9.495f)
            verticalLineToRelative(3.002f)
            curveToRelative(0f, 0.277f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.223f, -0.5f, -0.5f)
            verticalLineTo(9.495f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            close()
            moveTo(11.498f, 15f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            close()
        }
    }.build()
}

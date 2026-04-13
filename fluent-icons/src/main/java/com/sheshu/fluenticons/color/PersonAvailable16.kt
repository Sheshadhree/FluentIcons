package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PersonAvailable16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PersonAvailable16",
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
                    0.54836f to Color(0xFF30116E),
                    1f to Color(0x0030116E)
                ),
                center = Offset(10.2143f, 11.8571f),
                radius = 5.64693f
            ),
            fillAlpha = 0.5f
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
                start = Offset(5.18902f, 2.66468f),
                end = Offset(7.7372f, 6.73356f)
            )
        ) {
            moveTo(6.5f, 2f)
            curveTo(7.88f, 2f, 9f, 3.12f, 9f, 4.5f)
            reflectiveCurveTo(7.88f, 7f, 6.5f, 7f)
            reflectiveCurveTo(4f, 5.88f, 4f, 4.5f)
            reflectiveCurveTo(5.12f, 2f, 6.5f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(6.32143f, 7.6875f),
                end = Offset(12.5325f, 14.1406f)
            )
        ) {
            moveTo(15f, 10.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(8.9375f, 8.90803f),
                end = Offset(9.94633f, 13.3597f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.854f, 8.646f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.707f, 0f)
            lineToRelative(-1f, -1f)
            curveToRelative(-0.196f, -0.195f, -0.196f, -0.511f, 0f, -0.707f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineTo(9.5f, 11.293f)
            lineToRelative(2.646f, -2.646f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            close()
        }
    }.build()
}

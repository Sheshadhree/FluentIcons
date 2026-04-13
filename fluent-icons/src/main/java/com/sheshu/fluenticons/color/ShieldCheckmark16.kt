package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ShieldCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ShieldCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFF0FAFFF),
                    0.529425f to Color(0xFF367AF2),
                    0.682436f to Color(0xFF5750E2),
                    0.860903f to Color(0xFFCC23D1)
                ),
                center = Offset(-0.928573f, -4.75f),
                radius = 27.864f
            )
        ) {
            moveTo(7.647f, 2.146f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveTo(9.595f, 3.39f, 10.969f, 4f, 12.5f, 4f)
            curveTo(12.776f, 4f, 13f, 4.224f, 13f, 4.5f)
            verticalLineToRelative(3.001f)
            curveToRelative(0f, 3.219f, -1.641f, 5.407f, -4.842f, 6.473f)
            curveToRelative(-0.102f, 0.035f, -0.213f, 0.035f, -0.316f, 0f)
            curveTo(4.642f, 12.908f, 3f, 10.72f, 3f, 7.501f)
            verticalLineTo(4.5f)
            curveTo(3f, 4.224f, 3.224f, 4f, 3.5f, 4f)
            curveToRelative(1.53f, 0f, 2.904f, -0.611f, 4.147f, -1.854f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0xFF1E1868),
                    1f to Color(0x001E1868)
                ),
                center = Offset(10f, 12f),
                radius = 6f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(7.647f, 2.146f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveTo(9.595f, 3.39f, 10.969f, 4f, 12.5f, 4f)
            curveTo(12.776f, 4f, 13f, 4.224f, 13f, 4.5f)
            verticalLineToRelative(3.001f)
            curveToRelative(0f, 3.219f, -1.641f, 5.407f, -4.842f, 6.473f)
            curveToRelative(-0.102f, 0.035f, -0.213f, 0.035f, -0.316f, 0f)
            curveTo(4.642f, 12.908f, 3f, 10.72f, 3f, 7.501f)
            verticalLineTo(4.5f)
            curveTo(3f, 4.224f, 3.224f, 4f, 3.5f, 4f)
            curveToRelative(1.53f, 0f, 2.904f, -0.611f, 4.147f, -1.854f)
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

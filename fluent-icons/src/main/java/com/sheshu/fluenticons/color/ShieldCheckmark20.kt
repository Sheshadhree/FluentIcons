package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ShieldCheckmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ShieldCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFF0FAFFF),
                    0.529425f to Color(0xFF367AF2),
                    0.682436f to Color(0xFF5750E2),
                    0.860903f to Color(0xFFCC23D1)
                ),
                center = Offset(-2.5f, -7f),
                radius = 37.726f
            )
        ) {
            moveTo(9.723f, 2.084f)
            curveToRelative(0.168f, -0.112f, 0.386f, -0.112f, 0.554f, 0f)
            curveToRelative(1.939f, 1.292f, 4.035f, 2.098f, 6.294f, 2.421f)
            curveTo(16.817f, 4.54f, 17f, 4.751f, 17f, 5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 3.891f, -2.307f, 6.73f, -6.82f, 8.467f)
            curveToRelative(-0.116f, 0.044f, -0.244f, 0.044f, -0.36f, 0f)
            curveTo(5.307f, 16.23f, 3f, 13.39f, 3f, 9.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.249f, 0.183f, -0.46f, 0.43f, -0.495f)
            curveToRelative(2.258f, -0.323f, 4.354f, -1.129f, 6.293f, -2.421f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0xFF1E1868),
                    1f to Color(0x001E1868)
                ),
                center = Offset(14.5f, 15.5f),
                radius = 6.5f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(9.723f, 2.084f)
            curveToRelative(0.168f, -0.112f, 0.386f, -0.112f, 0.554f, 0f)
            curveToRelative(1.939f, 1.292f, 4.035f, 2.098f, 6.294f, 2.421f)
            curveTo(16.817f, 4.54f, 17f, 4.751f, 17f, 5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 3.891f, -2.307f, 6.73f, -6.82f, 8.467f)
            curveToRelative(-0.116f, 0.044f, -0.244f, 0.044f, -0.36f, 0f)
            curveTo(5.307f, 16.23f, 3f, 13.39f, 3f, 9.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.249f, 0.183f, -0.46f, 0.43f, -0.495f)
            curveToRelative(2.258f, -0.323f, 4.354f, -1.129f, 6.293f, -2.421f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(10.3214f, 11.6875f),
                end = Offset(16.5325f, 18.1406f)
            )
        ) {
            moveTo(19f, 14.5f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveTo(10f, 12.015f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(12.9375f, 12.908f),
                end = Offset(13.9463f, 17.3597f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.854f, 12.646f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1f, -1f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(0.646f, 0.647f)
            lineToRelative(2.646f, -2.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Sport16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Sport16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    0.977705f to Color(0xFFFF921F)
                ),
                center = Offset(10.981f, 17.7292f),
                radius = 19.2202f
            )
        ) {
            moveTo(4f, 6.5f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, 0f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5875f to Color(0xFFAA1D2D),
                    0.93125f to Color(0x19EB4824)
                ),
                center = Offset(5.375f, 10.625f),
                radius = 6.48181f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(4f, 6.5f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, 0f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11f, 0f)
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.712577f to Color(0xFF8E250B),
                    0.90252f to Color(0x008E250B)
                ),
                start = Offset(13.6597f, 2.50995f),
                end = Offset(7.76147f, 8.40823f)
            ),
            fillAlpha = 0.6f,
            strokeAlpha = 0.6f
        ) {
            moveTo(6.239f, 2.07f)
            lineTo(9.73f, 5.564f)
            lineToRelative(0.825f, -0.825f)
            curveTo(10.205f, 4.248f, 10f, 3.648f, 10f, 3f)
            curveToRelative(0f, -0.71f, 0.247f, -1.363f, 0.66f, -1.877f)
            curveToRelative(0.367f, 0.078f, 0.721f, 0.194f, 1.057f, 0.342f)
            curveTo(11.28f, 1.832f, 11f, 2.384f, 11f, 3f)
            curveToRelative(0f, 0.37f, 0.1f, 0.718f, 0.277f, 1.016f)
            lineToRelative(1.743f, -1.743f)
            curveToRelative(0.256f, 0.214f, 0.493f, 0.451f, 0.707f, 0.708f)
            lineToRelative(-1.743f, 1.742f)
            curveTo(12.282f, 4.9f, 12.629f, 5f, 13f, 5f)
            curveToRelative(0.617f, 0f, 1.168f, -0.279f, 1.535f, -0.717f)
            curveToRelative(0.148f, 0.336f, 0.264f, 0.69f, 0.342f, 1.057f)
            curveTo(14.364f, 5.753f, 13.711f, 6f, 13f, 6f)
            curveToRelative(-0.648f, 0f, -1.248f, -0.205f, -1.738f, -0.555f)
            lineTo(10.438f, 6.27f)
            lineToRelative(3.491f, 3.491f)
            curveToRelative(-0.199f, 0.27f, -0.421f, 0.52f, -0.665f, 0.75f)
            lineTo(9.73f, 6.976f)
            lineTo(6.853f, 9.854f)
            lineTo(6.147f, 9.147f)
            lineTo(9.023f, 6.27f)
            lineTo(5.49f, 2.736f)
            curveToRelative(0.228f, -0.244f, 0.48f, -0.467f, 0.749f, -0.665f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.240266f to Color(0xFFAE5606),
                    1f to Color(0xFF944600)
                ),
                center = Offset(1.81818f, 6.40909f),
                radius = 11.7003f
            )
        ) {
            moveTo(2.5f, 6f)
            curveTo(1.672f, 6f, 1f, 6.672f, 1f, 7.5f)
            verticalLineToRelative(1f)
            curveTo(1f, 12.09f, 3.91f, 15f, 7.5f, 15f)
            horizontalLineToRelative(1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveTo(10f, 8.91f, 7.09f, 6f, 3.5f, 6f)
            horizontalLineToRelative(-1f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.625628f to Color(0x00FFA43D),
                    0.926787f to Color(0xFFFFA43D)
                ),
                center = Offset(4.28738f, 17.3819f),
                radius = 13.3182f
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(2.5f, 6f)
            curveTo(1.672f, 6f, 1f, 6.672f, 1f, 7.5f)
            verticalLineToRelative(1f)
            curveTo(1f, 12.09f, 3.91f, 15f, 7.5f, 15f)
            horizontalLineToRelative(1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveTo(10f, 8.91f, 7.09f, 6f, 3.5f, 6f)
            horizontalLineToRelative(-1f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFC470))) {
            moveTo(5.104f, 9.396f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-1.5f, -1.5f)
            close()
        }
    }.build()
}

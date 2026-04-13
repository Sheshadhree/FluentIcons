package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Sport20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Sport20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    0.977705f to Color(0xFFFF921F)
                ),
                center = Offset(13.6157f, 20.25f),
                radius = 20.9675f
            )
        ) {
            moveTo(6f, 8f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
            arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 8f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5875f to Color(0xFFAA1D2D),
                    0.93125f to Color(0x19EB4824)
                ),
                center = Offset(7.5f, 12.5f),
                radius = 7.07107f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(6f, 8f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
            arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 8f)
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.712577f to Color(0xFF8E250B),
                    0.90252f to Color(0x008E250B)
                ),
                start = Offset(16.442f, 3.74525f),
                end = Offset(9.92744f, 10.2598f)
            ),
            fillAlpha = 0.6f,
            strokeAlpha = 0.6f
        ) {
            moveTo(14.587f, 2.585f)
            curveTo(14.224f, 2.947f, 14f, 3.447f, 14f, 4f)
            curveToRelative(0f, 0.37f, 0.101f, 0.718f, 0.277f, 1.016f)
            lineToRelative(1.597f, -1.598f)
            curveToRelative(0.255f, 0.216f, 0.492f, 0.453f, 0.707f, 0.708f)
            lineToRelative(-1.597f, 1.597f)
            curveTo(15.282f, 5.899f, 15.63f, 6f, 16f, 6f)
            curveToRelative(0.553f, 0f, 1.053f, -0.224f, 1.415f, -0.587f)
            curveToRelative(0.152f, 0.318f, 0.277f, 0.651f, 0.372f, 0.997f)
            curveTo(17.287f, 6.78f, 16.67f, 7f, 16f, 7f)
            curveToRelative(-0.648f, 0f, -1.248f, -0.206f, -1.738f, -0.555f)
            lineTo(12.707f, 8f)
            lineToRelative(3.874f, 3.874f)
            curveToRelative(-0.215f, 0.255f, -0.452f, 0.492f, -0.707f, 0.707f)
            lineTo(12f, 8.707f)
            lineToRelative(-3.874f, 3.874f)
            curveToRelative(-0.255f, -0.215f, -0.492f, -0.452f, -0.707f, -0.707f)
            lineTo(11.293f, 8f)
            lineTo(7.419f, 4.125f)
            curveToRelative(0.215f, -0.254f, 0.452f, -0.49f, 0.707f, -0.707f)
            lineTo(12f, 7.293f)
            lineToRelative(1.555f, -1.555f)
            curveTo(13.205f, 5.248f, 13f, 4.648f, 13f, 4f)
            curveToRelative(0f, -0.67f, 0.22f, -1.288f, 0.59f, -1.787f)
            curveToRelative(0.346f, 0.095f, 0.679f, 0.22f, 0.997f, 0.372f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.240266f to Color(0xFFAE5606),
                    1f to Color(0xFF944600)
                ),
                center = Offset(3f, 7.5f),
                radius = 14.3003f
            )
        ) {
            moveTo(2f, 8.5f)
            curveTo(2f, 7.672f, 2.672f, 7f, 3.5f, 7f)
            horizontalLineTo(5f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(10f)
            curveToRelative(-4.418f, 0f, -8f, -3.582f, -8f, -8f)
            verticalLineTo(8.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.625628f to Color(0x00FFA43D),
                    0.926787f to Color(0xFFFFA43D)
                ),
                center = Offset(6.0179f, 20.9113f),
                radius = 16.2778f
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(2f, 8.5f)
            curveTo(2f, 7.672f, 2.672f, 7f, 3.5f, 7f)
            horizontalLineTo(5f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(10f)
            curveToRelative(-4.418f, 0f, -8f, -3.582f, -8f, -8f)
            verticalLineTo(8.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFC470))) {
            moveTo(6.146f, 11.146f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}

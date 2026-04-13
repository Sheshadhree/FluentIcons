package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Certificate16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Certificate16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(1.5f, 3.875f),
                end = Offset(7.94828f, 13.2543f)
            )
        ) {
            moveTo(3f, 2f)
            curveTo(1.895f, 2f, 1f, 2.895f, 1f, 4f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0f, 0.818f, 0.393f, 1.544f, 1f, 2f)
            verticalLineToRelative(1f)
            horizontalLineTo(13f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(15.6f, 14.2f),
                end = Offset(11.2225f, 1.00407f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(8.5f, 8f)
            curveTo(8.224f, 8f, 8f, 8.224f, 8f, 8.5f)
            reflectiveCurveTo(8.224f, 9f, 8.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 9f, 12f, 8.776f, 12f, 8.5f)
            reflectiveCurveTo(11.776f, 8f, 11.5f, 8f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(-4f, -3f)
            curveTo(4.224f, 5f, 4f, 5.224f, 4f, 5.5f)
            reflectiveCurveTo(4.224f, 6f, 4.5f, 6f)
            horizontalLineToRelative(7f)
            curveTo(11.776f, 6f, 12f, 5.776f, 12f, 5.5f)
            reflectiveCurveTo(11.776f, 5f, 11.5f, 5f)
            horizontalLineToRelative(-7f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF)
                ),
                center = Offset(4f, 10.3114f),
                radius = 6.39258f
            )
        ) {
            moveTo(2f, 10.944f)
            verticalLineTo(14.5f)
            curveToRelative(0f, 0.091f, 0.024f, 0.179f, 0.071f, 0.257f)
            curveToRelative(0.047f, 0.078f, 0.113f, 0.141f, 0.193f, 0.184f)
            curveTo(2.337f, 14.98f, 2.418f, 15f, 2.5f, 15f)
            curveToRelative(0.099f, 0f, 0.195f, -0.03f, 0.277f, -0.085f)
            lineTo(4f, 14.1f)
            lineToRelative(1.223f, 0.816f)
            curveToRelative(0.075f, 0.05f, 0.163f, 0.079f, 0.253f, 0.083f)
            curveToRelative(0.09f, 0.004f, 0.18f, -0.016f, 0.26f, -0.059f)
            curveToRelative(0.08f, -0.043f, 0.146f, -0.106f, 0.193f, -0.184f)
            curveTo(5.975f, 14.678f, 6f, 14.59f, 6f, 14.499f)
            verticalLineToRelative(-3.555f)
            curveTo(5.409f, 11.288f, 4.732f, 11.5f, 4f, 11.5f)
            reflectiveCurveToRelative(-1.409f, -0.212f, -2f, -0.556f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-11.9643f, -15f),
                radius = 33.4905f
            )
        ) {
            moveTo(7f, 9f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
    }.build()
}

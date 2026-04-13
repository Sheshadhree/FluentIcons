package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.People24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.People24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(14.3781f, 14.7266f),
                end = Offset(16.3f, 20.3011f)
            )
        ) {
            moveTo(17f, 19.5f)
            curveToRelative(-0.732f, 0f, -1.357f, -0.07f, -1.89f, -0.192f)
            curveTo(12f, 18.605f, 12f, 16.2f, 12f, 16.2f)
            curveToRelative(0f, -1.215f, 0.985f, -2.2f, 2.2f, -2.2f)
            curveToRelative(1.872f, 0f, 3.743f, -0.012f, 5.614f, 0f)
            curveTo(21.023f, 14.008f, 22f, 14.99f, 22f, 16.2f)
            curveToRelative(0f, 0f, 0f, 2.875f, -4.065f, 3.258f)
            curveTo(17.645f, 19.485f, 17.334f, 19.5f, 17f, 19.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.392122f to Color(0xFF3B148A),
                    1f to Color(0x003B148A)
                ),
                center = Offset(10.7315f, 16.7474f),
                radius = 6.62994f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(17f, 19.5f)
            curveToRelative(-0.732f, 0f, -1.357f, -0.07f, -1.89f, -0.192f)
            curveTo(12f, 18.605f, 12f, 16.2f, 12f, 16.2f)
            curveToRelative(0f, -1.215f, 0.985f, -2.2f, 2.2f, -2.2f)
            curveToRelative(1.872f, 0f, 3.743f, -0.012f, 5.614f, 0f)
            curveTo(21.023f, 14.008f, 22f, 14.99f, 22f, 16.2f)
            curveToRelative(0f, 0f, 0f, 2.875f, -4.065f, 3.258f)
            curveTo(17.645f, 19.485f, 17.334f, 19.5f, 17f, 19.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(4.85365f, 14.9305f),
                end = Offset(7.40972f, 21.9274f)
            )
        ) {
            moveTo(4.25f, 14f)
            curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
            verticalLineToRelative(0.25f)
            reflectiveCurveTo(2f, 21f, 8f, 21f)
            reflectiveCurveToRelative(6f, -4.5f, 6f, -4.5f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(8f, 13.1667f),
                end = Offset(11.6074f, 24.7212f)
            )
        ) {
            moveTo(4.25f, 14f)
            curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
            verticalLineToRelative(0.25f)
            reflectiveCurveTo(2f, 21f, 8f, 21f)
            reflectiveCurveToRelative(6f, -4.5f, 6f, -4.5f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-7.5f)
            close()
            moveTo(17f, 12f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
            moveToRelative(-9f, 0f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
        }
    }.build()
}

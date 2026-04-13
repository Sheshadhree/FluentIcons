package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Patient24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Patient24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(9.71429f, 2f),
                end = Offset(14.263f, 15.3125f)
            )
        ) {
            moveTo(20f, 4.25f)
            curveTo(20f, 3.007f, 18.993f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.926f, 2.085f, 4f, 3.06f, 4f, 4.25f)
            verticalLineTo(15.5f)
            horizontalLineToRelative(16f)
            verticalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(9.90243f, 11.5944f),
                end = Offset(11.5029f, 16.1333f)
            )
        ) {
            moveTo(8f, 15.5f)
            verticalLineToRelative(-3.254f)
            curveToRelative(0f, -0.648f, 0.492f, -1.18f, 1.122f, -1.244f)
            lineToRelative(0.128f, -0.006f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.647f, 0f, 1.18f, 0.492f, 1.243f, 1.122f)
            lineTo(16f, 12.246f)
            verticalLineTo(15.5f)
            horizontalLineTo(8f)
            close()
            moveToRelative(4f, -10.504f)
            curveToRelative(1.38f, 0f, 2.5f, 1.119f, 2.5f, 2.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            curveToRelative(0f, -1.381f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4.65793E-7f, 1.00448f),
                end = Offset(19.7673f, 22.1757f)
            )
        ) {
            moveTo(20f, 15f)
            verticalLineToRelative(4.755f)
            curveToRelative(0f, 1.242f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.008f, -2.25f, -2.25f)
            verticalLineTo(15f)
            horizontalLineToRelative(16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.618682f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(12f, 8.57913f),
                end = Offset(13.5306f, 25.3315f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(20f, 15f)
            verticalLineToRelative(4.755f)
            curveToRelative(0f, 1.242f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.008f, -2.25f, -2.25f)
            verticalLineTo(15f)
            horizontalLineToRelative(16f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(8.92429f, 17.6154f),
                end = Offset(9.11705f, 20.7285f)
            )
        ) {
            moveTo(7.752f, 17.5f)
            horizontalLineToRelative(8.498f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(16.25f, 19f)
            horizontalLineTo(7.752f)
            curveToRelative(-0.415f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineToRelative(0.1f, -0.007f)
            horizontalLineToRelative(8.5f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}

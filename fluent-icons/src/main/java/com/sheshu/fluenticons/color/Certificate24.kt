package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Certificate24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Certificate24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2.71429f, 5.8125f),
                end = Offset(12.5469f, 19.4334f)
            )
        ) {
            moveTo(4.75f, 3f)
            curveTo(3.231f, 3f, 2f, 4.231f, 2f, 5.75f)
            verticalLineTo(14f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0f, 0.954f, 0.381f, 1.818f, 1f, 2.45f)
            verticalLineTo(18f)
            horizontalLineToRelative(15.75f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-9.5f)
            curveTo(22f, 4.231f, 20.769f, 3f, 19.25f, 3f)
            horizontalLineTo(4.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(23.4f, 21.95f),
                end = Offset(15.8241f, 0.869433f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(6.75f, 7f)
            curveTo(6.336f, 7f, 6f, 7.336f, 6f, 7.75f)
            reflectiveCurveTo(6.336f, 8.5f, 6.75f, 8.5f)
            horizontalLineToRelative(10.5f)
            curveTo(17.664f, 8.5f, 18f, 8.164f, 18f, 7.75f)
            reflectiveCurveTo(17.664f, 7f, 17.25f, 7f)
            horizontalLineTo(6.75f)
            close()
            moveToRelative(6f, 5f)
            curveTo(12.336f, 12f, 12f, 12.336f, 12f, 12.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.664f, 12f, 17.25f, 12f)
            horizontalLineToRelative(-4.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF)
                ),
                center = Offset(6.00045f, 15.0639f),
                radius = 9.45684f
            )
        ) {
            moveTo(9f, 16f)
            curveToRelative(-0.835f, 0.628f, -1.874f, 1f, -3f, 1f)
            curveToRelative(-1.125f, 0f, -2.164f, -0.372f, -3f, -0.999f)
            verticalLineToRelative(5.248f)
            curveToRelative(0f, 0.57f, 0.605f, 0.92f, 1.09f, 0.669f)
            lineToRelative(0.09f, -0.055f)
            lineTo(6f, 20.591f)
            lineToRelative(1.82f, 1.272f)
            curveToRelative(0.468f, 0.327f, 1.1f, 0.032f, 1.172f, -0.51f)
            lineTo(9f, 21.249f)
            lineToRelative(0.002f, -5.25f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-15.2895f, -18.0045f),
                radius = 44.6612f
            )
        ) {
            moveTo(6f, 10f)
            curveToRelative(-2.21f, 0f, -4.001f, 1.791f, -4.001f, 4f)
            curveToRelative(0f, 2.21f, 1.791f, 4.001f, 4f, 4.001f)
            curveToRelative(2.21f, 0f, 4.001f, -1.79f, 4.001f, -4f)
            reflectiveCurveTo(8.21f, 10f, 6f, 10f)
            close()
        }
    }.build()
}

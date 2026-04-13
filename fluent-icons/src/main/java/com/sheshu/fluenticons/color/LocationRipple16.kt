package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LocationRipple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LocationRipple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF7B7BFF),
                    0.501667f to Color(0xFFA3A3FF),
                    1f to Color(0xFFCEB0FF)
                ),
                center = Offset(7.57143f, 11.6667f),
                radius = 9.57474f
            )
        ) {
            moveTo(14f, 12.5f)
            curveTo(14f, 14f, 11.314f, 15f, 8f, 15f)
            reflectiveCurveToRelative(-6f, -1f, -6f, -2.5f)
            reflectiveCurveTo(4.686f, 10f, 8f, 10f)
            reflectiveCurveToRelative(6f, 1f, 6f, 2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(0.8125f, -2.28518f),
                end = Offset(8.96915f, 10.7348f)
            )
        ) {
            moveTo(8f, 1f)
            curveTo(5.239f, 1f, 3f, 3.239f, 3f, 6f)
            curveToRelative(0f, 1.144f, 0.65f, 2.35f, 1.393f, 3.373f)
            curveToRelative(0.757f, 1.042f, 1.677f, 1.985f, 2.346f, 2.619f)
            curveToRelative(0.713f, 0.675f, 1.809f, 0.675f, 2.522f, 0f)
            curveToRelative(0.669f, -0.634f, 1.589f, -1.577f, 2.346f, -2.62f)
            curveTo(12.349f, 8.35f, 13f, 7.145f, 13f, 6f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFFECBE6)
                ),
                start = Offset(6.67418f, 6.13258f),
                end = Offset(8.23628f, 7.75693f)
            )
        ) {
            moveTo(9.5f, 6f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(6.5f, 6.828f, 6.5f, 6f)
            reflectiveCurveTo(7.172f, 4.5f, 8f, 4.5f)
            reflectiveCurveTo(9.5f, 5.172f, 9.5f, 6f)
            close()
        }
    }.build()
}

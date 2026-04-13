package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LocationRipple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LocationRipple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF7B7BFF),
                    0.501667f to Color(0xFFA3A3FF),
                    1f to Color(0xFFCEB0FF)
                ),
                center = Offset(11.3571f, 17.6667f),
                radius = 14.3921f
            )
        ) {
            moveTo(21f, 19f)
            curveToRelative(0f, 2.5f, -4.03f, 4f, -9f, 4f)
            reflectiveCurveToRelative(-9f, -1.5f, -9f, -4f)
            curveToRelative(0f, -2.406f, 4.03f, -4f, 9f, -4f)
            reflectiveCurveToRelative(9f, 1.5f, 9f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(1.21875f, -2.85737f),
                end = Offset(13.2024f, 16.5487f)
            )
        ) {
            moveTo(12f, 2f)
            curveTo(7.858f, 2f, 4.5f, 5.358f, 4.5f, 9.5f)
            curveToRelative(0f, 1.932f, 1.064f, 3.8f, 2.268f, 5.316f)
            curveToRelative(1.22f, 1.537f, 2.678f, 2.829f, 3.655f, 3.622f)
            curveToRelative(0.926f, 0.75f, 2.228f, 0.75f, 3.154f, 0f)
            curveToRelative(0.977f, -0.793f, 2.435f, -2.085f, 3.655f, -3.622f)
            curveTo(18.436f, 13.301f, 19.5f, 11.432f, 19.5f, 9.5f)
            curveTo(19.5f, 5.358f, 16.142f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFFECBE6)
                ),
                start = Offset(9.79029f, 9.72097f),
                end = Offset(12.3938f, 12.4282f)
            )
        ) {
            moveTo(14.5f, 9.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveTo(10.62f, 7f, 12f, 7f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.build()
}

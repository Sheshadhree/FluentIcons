package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LocationRipple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LocationRipple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF7B7BFF),
                    0.501667f to Color(0xFFA3A3FF),
                    1f to Color(0xFFCEB0FF)
                ),
                center = Offset(9.5f, 15f),
                radius = 11.1803f
            )
        ) {
            moveTo(17f, 16f)
            curveToRelative(0f, 2f, -3.5f, 3f, -7f, 3f)
            reflectiveCurveToRelative(-7f, -1f, -7f, -3f)
            reflectiveCurveToRelative(3.5f, -3f, 7f, -3f)
            reflectiveCurveToRelative(7f, 1f, 7f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(1.375f, -2.00096f),
                end = Offset(11.3722f, 13.7227f)
            )
        ) {
            moveTo(10f, 2f)
            curveTo(6.686f, 2f, 4f, 4.686f, 4f, 8f)
            curveToRelative(0f, 1.468f, 0.843f, 3.007f, 1.807f, 4.306f)
            curveToRelative(0.98f, 1.319f, 2.152f, 2.48f, 2.945f, 3.207f)
            curveToRelative(0.711f, 0.654f, 1.785f, 0.654f, 2.496f, 0f)
            curveToRelative(0.793f, -0.727f, 1.966f, -1.888f, 2.945f, -3.207f)
            curveTo(15.157f, 11.007f, 16f, 9.468f, 16f, 8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFFECBE6)
                ),
                start = Offset(8.23223f, 8.17678f),
                end = Offset(10.315f, 10.3426f)
            )
        ) {
            moveTo(12f, 8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveTo(8f, 9.105f, 8f, 8f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}

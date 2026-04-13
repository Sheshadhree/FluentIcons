package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.People28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.People28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(16.8493f, 16.7976f),
                end = Offset(18.7871f, 22.9887f)
            )
        ) {
            moveTo(20f, 22f)
            curveToRelative(6f, 0f, 6f, -3.75f, 6f, -3.75f)
            curveToRelative(0f, -1.243f, -1.008f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-7.506f)
            curveToRelative(-1.242f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            curveToRelative(0f, 0f, 0f, 3.75f, 6f, 3.75f)
            horizontalLineTo(20f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.392122f to Color(0xFF3B148A),
                    1f to Color(0x003B148A)
                ),
                center = Offset(12.4715f, 19f),
                radius = 7.9489f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(20f, 22f)
            curveToRelative(6f, 0f, 6f, -3.75f, 6f, -3.75f)
            curveToRelative(0f, -1.243f, -1.008f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-7.506f)
            curveToRelative(-1.242f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            curveToRelative(0f, 0f, 0f, 3.75f, 6f, 3.75f)
            horizontalLineTo(20f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(5.56706f, 17.0635f),
                end = Offset(8.29051f, 25.2174f)
            )
        ) {
            moveTo(2f, 18.25f)
            curveTo(2f, 17.007f, 3.007f, 16f, 4.25f, 16f)
            horizontalLineToRelative(10.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(0.5f)
            reflectiveCurveTo(17f, 24f, 9.5f, 24f)
            reflectiveCurveTo(2f, 18.75f, 2f, 18.75f)
            verticalLineToRelative(-0.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(9.5f, 15.0476f),
                end = Offset(13.3251f, 28.448f)
            )
        ) {
            moveTo(2f, 18.25f)
            curveTo(2f, 17.007f, 3.007f, 16f, 4.25f, 16f)
            horizontalLineToRelative(10.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(0.5f)
            reflectiveCurveTo(17f, 24f, 9.5f, 24f)
            reflectiveCurveTo(2f, 18.75f, 2f, 18.75f)
            verticalLineToRelative(-0.5f)
            close()
            moveToRelative(21.5f, -7.75f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(18.067f, 7f, 20f, 7f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
            moveTo(9.5f, 14f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(11.985f, 5f, 9.5f, 5f)
            reflectiveCurveTo(5f, 7.015f, 5f, 9.5f)
            reflectiveCurveTo(7.015f, 14f, 9.5f, 14f)
            close()
        }
    }.build()
}

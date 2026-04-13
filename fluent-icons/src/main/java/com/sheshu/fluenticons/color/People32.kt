package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.People32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.People32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(19.3308f, 18.9305f),
                end = Offset(21.5927f, 26.1527f)
            )
        ) {
            moveTo(27.593f, 18f)
            curveTo(28.922f, 18f, 30f, 19.077f, 30f, 20.406f)
            curveToRelative(0f, 0f, 0f, 4.594f, -7f, 4.594f)
            horizontalLineToRelative(0.002f)
            curveToRelative(-7f, 0f, -7f, -4.594f, -7f, -4.594f)
            curveToRelative(0f, -1.329f, 1.078f, -2.406f, 2.406f, -2.406f)
            horizontalLineToRelative(9.185f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.392122f to Color(0xFF3B148A),
                    1f to Color(0x003B148A)
                ),
                center = Offset(14.2266f, 21.5f),
                radius = 9.26794f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(27.593f, 18f)
            curveTo(28.922f, 18f, 30f, 19.077f, 30f, 20.406f)
            curveToRelative(0f, 0f, 0f, 4.594f, -7f, 4.594f)
            horizontalLineToRelative(0.002f)
            curveToRelative(-7f, 0f, -7f, -4.594f, -7f, -4.594f)
            curveToRelative(0f, -1.329f, 1.078f, -2.406f, 2.406f, -2.406f)
            horizontalLineToRelative(9.185f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(6.04267f, 19.1964f),
                end = Offset(9.0885f, 28.3831f)
            )
        ) {
            moveTo(5f, 18f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(0.15f)
            reflectiveCurveTo(2f, 27f, 10.5f, 27f)
            reflectiveCurveToRelative(8.5f, -5.85f, 8.5f, -5.85f)
            verticalLineTo(21f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(10.5f, 16.9286f),
                end = Offset(14.7763f, 32.0207f)
            )
        ) {
            moveTo(5f, 18f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(0.15f)
            reflectiveCurveTo(2f, 27f, 10.5f, 27f)
            reflectiveCurveToRelative(8.5f, -5.85f, 8.5f, -5.85f)
            verticalLineTo(21f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            close()
            moveToRelative(18f, -2f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveToRelative(-12.5f, 0f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(13.538f, 5f, 10.5f, 5f)
            reflectiveCurveTo(5f, 7.462f, 5f, 10.5f)
            reflectiveCurveTo(7.462f, 16f, 10.5f, 16f)
            close()
        }
    }.build()
}

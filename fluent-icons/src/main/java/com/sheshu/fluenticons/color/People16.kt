package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.People16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.People16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(9.92632f, 9.46527f),
                end = Offset(11.2047f, 12.9634f)
            )
        ) {
            moveTo(10.038f, 12.264f)
            curveTo(10.422f, 12.41f, 10.901f, 12.5f, 11.5f, 12.5f)
            curveToRelative(0.598f, 0f, 1.077f, -0.09f, 1.46f, -0.235f)
            curveToRelative(1.538f, -0.582f, 1.538f, -2.04f, 1.538f, -2.04f)
            curveTo(14.498f, 9.549f, 13.949f, 9f, 13.273f, 9f)
            horizontalLineTo(9.725f)
            curveTo(9.049f, 9f, 8.5f, 9.549f, 8.5f, 10.225f)
            curveToRelative(0f, 0f, 0f, 1.457f, 1.538f, 2.04f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.392122f to Color(0xFF3B148A),
                    1f to Color(0x003B148A)
                ),
                center = Offset(7.73916f, 10.75f),
                radius = 3.98007f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(10.038f, 12.264f)
            curveTo(10.422f, 12.41f, 10.901f, 12.5f, 11.5f, 12.5f)
            curveToRelative(0.598f, 0f, 1.077f, -0.09f, 1.46f, -0.235f)
            curveToRelative(1.538f, -0.582f, 1.538f, -2.04f, 1.538f, -2.04f)
            curveTo(14.498f, 9.549f, 13.949f, 9f, 13.273f, 9f)
            horizontalLineTo(9.725f)
            curveTo(9.049f, 9f, 8.5f, 9.549f, 8.5f, 10.225f)
            curveToRelative(0f, 0f, 0f, 1.457f, 1.538f, 2.04f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(3.40243f, 9.59821f),
                end = Offset(5.00013f, 14.1336f)
            )
        ) {
            moveTo(9.5f, 10.5f)
            curveTo(9.5f, 9.672f, 8.828f, 9f, 8f, 9f)
            horizontalLineTo(3f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(0.075f)
            reflectiveCurveToRelative(0f, 2.925f, 4f, 2.925f)
            curveToRelative(3.812f, 0f, 3.991f, -2.656f, 4f, -2.906f)
            verticalLineTo(10.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(5.5f, 8.46429f),
                end = Offset(7.75023f, 15.9387f)
            )
        ) {
            moveTo(9.5f, 10.5f)
            curveTo(9.5f, 9.672f, 8.828f, 9f, 8f, 9f)
            horizontalLineTo(3f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(0.075f)
            reflectiveCurveToRelative(0f, 2.925f, 4f, 2.925f)
            curveToRelative(3.812f, 0f, 3.991f, -2.656f, 4f, -2.906f)
            verticalLineTo(10.5f)
            close()
            moveToRelative(2f, -2.5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveTo(8f, 5.5f)
            curveTo(8f, 6.88f, 6.88f, 8f, 5.5f, 8f)
            reflectiveCurveTo(3f, 6.88f, 3f, 5.5f)
            reflectiveCurveTo(4.12f, 3f, 5.5f, 3f)
            reflectiveCurveTo(8f, 4.12f, 8f, 5.5f)
            close()
        }
    }.build()
}

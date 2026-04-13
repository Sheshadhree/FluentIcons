package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.People20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.People20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(12.4024f, 11.5982f),
                end = Offset(14.0001f, 16.1336f)
            )
        ) {
            moveTo(10.5f, 12.5f)
            curveToRelative(0f, -0.828f, 0.682f, -1.5f, 1.524f, -1.5f)
            horizontalLineToRelative(4.952f)
            curveToRelative(0.842f, 0f, 1.524f, 0.672f, 1.524f, 1.5f)
            curveToRelative(0f, 0f, 0f, 3f, -4f, 3f)
            reflectiveCurveToRelative(-4f, -3f, -4f, -3f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.392122f to Color(0xFF3B148A),
                    1f to Color(0x003B148A)
                ),
                center = Offset(9.48519f, 13.25f),
                radius = 5.30556f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(10.5f, 12.5f)
            curveToRelative(0f, -0.828f, 0.682f, -1.5f, 1.524f, -1.5f)
            horizontalLineToRelative(4.952f)
            curveToRelative(0.842f, 0f, 1.524f, 0.672f, 1.524f, 1.5f)
            curveToRelative(0f, 0f, 0f, 3f, -4f, 3f)
            reflectiveCurveToRelative(-4f, -3f, -4f, -3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(3.99694f, 11.7976f),
                end = Offset(6.15341f, 17.8235f)
            )
        ) {
            moveTo(1.5f, 13f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineTo(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0f, 0f, 4f, -5.25f, 4f)
            reflectiveCurveTo(1.5f, 13f, 1.5f, 13f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(6.75f, 10.2857f),
                end = Offset(9.78985f, 20.2252f)
            )
        ) {
            moveTo(1.5f, 13f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineTo(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0f, 0f, 4f, -5.25f, 4f)
            reflectiveCurveTo(1.5f, 13f, 1.5f, 13f)
            close()
            moveToRelative(13f, -3f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(15.88f, 5f, 14.5f, 5f)
            reflectiveCurveTo(12f, 6.12f, 12f, 7.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveToRelative(-7.75f, 0f)
            curveTo(8.545f, 10f, 10f, 8.545f, 10f, 6.75f)
            reflectiveCurveTo(8.545f, 3.5f, 6.75f, 3.5f)
            reflectiveCurveTo(3.5f, 4.955f, 3.5f, 6.75f)
            reflectiveCurveTo(4.955f, 10f, 6.75f, 10f)
            close()
        }
    }.build()
}

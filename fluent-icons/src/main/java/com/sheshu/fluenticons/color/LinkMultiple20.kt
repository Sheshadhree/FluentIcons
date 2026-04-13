package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LinkMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LinkMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.429447f to Color(0xFF367AF2),
                    0.942067f to Color(0xFF5750E2),
                    1f to Color(0xFF6F47DF)
                ),
                center = Offset(1.63636f, 4f),
                radius = 14.3329f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            horizontalLineTo(5f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
            moveToRelative(6f, 2f)
            horizontalLineTo(5f)
            curveTo(3.895f, 6f, 3f, 6.895f, 3f, 8f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.229167f to Color(0x00261D82),
                    0.395833f to Color(0xFF261D82),
                    0.578125f to Color(0xFF261D82),
                    0.78125f to Color(0x00261D82)
                ),
                center = Offset(9f, 12f),
                radius = 6f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            horizontalLineTo(5f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
            moveToRelative(6f, 2f)
            horizontalLineTo(5f)
            curveTo(3.895f, 6f, 3f, 6.895f, 3f, 8f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x005157E4),
                    0.066311f to Color(0xFF5157E4),
                    0.272866f to Color(0xFF5157E4),
                    0.6f to Color(0x005157E4)
                ),
                start = Offset(13.5f, 13f),
                end = Offset(8f, 4.5f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            horizontalLineTo(5f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
            moveToRelative(6f, 2f)
            horizontalLineTo(5f)
            curveTo(3.895f, 6f, 3f, 6.895f, 3f, 8f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(0.499999f, 4.5f),
                end = Offset(7.53833f, 23.0203f)
            )
        ) {
            moveTo(13f, 8f)
            horizontalLineTo(9f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            curveToRelative(0f, 0.729f, -0.195f, 1.412f, -0.535f, 2f)
            horizontalLineTo(15f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            horizontalLineTo(9f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.229167f to Color(0x002764E7),
                    0.395833f to Color(0xFF2764E7),
                    0.578125f to Color(0xFF2764E7),
                    0.78125f to Color(0x002764E7)
                ),
                center = Offset(11f, 8f),
                radius = 6f
            )
        ) {
            moveTo(13f, 8f)
            horizontalLineTo(9f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            curveToRelative(0f, 0.729f, -0.195f, 1.412f, -0.535f, 2f)
            horizontalLineTo(15f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            horizontalLineTo(9f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x3D31B3EE),
                    0.207974f to Color(0xFF31B3EE),
                    0.568966f to Color(0xFF31B3EE),
                    0.877534f to Color(0x0031B3EE)
                ),
                start = Offset(9.5f, 5f),
                end = Offset(13f, 11f)
            )
        ) {
            moveTo(13f, 8f)
            horizontalLineTo(9f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            curveToRelative(0f, 0.729f, -0.195f, 1.412f, -0.535f, 2f)
            horizontalLineTo(15f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            horizontalLineTo(9f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            close()
        }
    }.build()
}

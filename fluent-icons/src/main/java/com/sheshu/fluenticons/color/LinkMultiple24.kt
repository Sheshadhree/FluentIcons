package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LinkMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LinkMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.429447f to Color(0xFF367AF2),
                    0.942067f to Color(0xFF5750E2),
                    1f to Color(0xFF6F47DF)
                ),
                center = Offset(1.77273f, 5f),
                radius = 17.5909f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1f, 10f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            horizontalLineTo(6f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            close()
            moveToRelative(5f, -3f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(7f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.238839f to Color(0x00261D82),
                    0.42402f to Color(0xFF261D82),
                    0.567708f to Color(0xFF261D82),
                    0.754464f to Color(0x00261D82)
                ),
                center = Offset(10.5f, 14.5f),
                radius = 7f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1f, 10f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            horizontalLineTo(6f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            close()
            moveToRelative(5f, -3f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(7f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x005157E4),
                    0.066311f to Color(0xFF5157E4),
                    0.318505f to Color(0xFF5157E4),
                    0.6f to Color(0x005157E4)
                ),
                start = Offset(17f, 15.5f),
                end = Offset(8.38224f, 5.66713f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1f, 10f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            horizontalLineTo(6f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            close()
            moveToRelative(5f, -3f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(7f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(0.535714f, 4.1875f),
                end = Offset(11.1174f, 28.7772f)
            )
        ) {
            moveTo(15.83f, 9f)
            horizontalLineTo(11f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            horizontalLineToRelative(-0.1f)
            curveToRelative(0.066f, 0.323f, 0.1f, 0.658f, 0.1f, 1f)
            curveToRelative(0f, 0.342f, -0.034f, 0.677f, -0.1f, 1f)
            horizontalLineTo(18f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(4.83f)
            curveToRelative(0.11f, -0.313f, 0.17f, -0.65f, 0.17f, -1f)
            reflectiveCurveToRelative(-0.06f, -0.687f, -0.17f, -1f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.245536f to Color(0x002764E7),
                    0.395833f to Color(0xFF2764E7),
                    0.578125f to Color(0xFF2764E7),
                    0.747768f to Color(0x002764E7)
                ),
                center = Offset(13.5f, 9.5f),
                radius = 7f
            )
        ) {
            moveTo(15.83f, 9f)
            horizontalLineTo(11f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            horizontalLineToRelative(-0.1f)
            curveToRelative(0.066f, 0.323f, 0.1f, 0.658f, 0.1f, 1f)
            curveToRelative(0f, 0.342f, -0.034f, 0.677f, -0.1f, 1f)
            horizontalLineTo(18f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(4.83f)
            curveToRelative(0.11f, -0.313f, 0.17f, -0.65f, 0.17f, -1f)
            reflectiveCurveToRelative(-0.06f, -0.687f, -0.17f, -1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x3D31B3EE),
                    0.207974f to Color(0xFF31B3EE),
                    0.568966f to Color(0xFF31B3EE),
                    0.762994f to Color(0x0031B3EE)
                ),
                start = Offset(8.5f, 5f),
                end = Offset(16.7705f, 12.1029f)
            )
        ) {
            moveTo(15.83f, 9f)
            horizontalLineTo(11f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            horizontalLineToRelative(-0.1f)
            curveToRelative(0.066f, 0.323f, 0.1f, 0.658f, 0.1f, 1f)
            curveToRelative(0f, 0.342f, -0.034f, 0.677f, -0.1f, 1f)
            horizontalLineTo(18f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(4.83f)
            curveToRelative(0.11f, -0.313f, 0.17f, -0.65f, 0.17f, -1f)
            reflectiveCurveToRelative(-0.06f, -0.687f, -0.17f, -1f)
            close()
        }
    }.build()
}

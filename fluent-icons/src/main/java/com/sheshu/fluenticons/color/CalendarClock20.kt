package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CalendarClock20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CalendarClock20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(8f, 6f),
                end = Offset(11.5f, 17f)
            )
        ) {
            moveTo(17f, 6f)
            horizontalLineTo(3f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8)
                ),
                start = Offset(11.5f, 10.5f),
                end = Offset(13.5f, 19.5f)
            )
        ) {
            moveTo(17f, 6f)
            horizontalLineTo(3f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.535f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(14.5f, 15.5f),
                radius = 6.5f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(17f, 6f)
            horizontalLineTo(3f)
            verticalLineToRelative(8.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.5625f, 3f),
                end = Offset(4.90356f, 9.81561f)
            )
        ) {
            moveTo(17f, 5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(14f)
            verticalLineTo(5.5f)
            close()
            moveToRelative(2f, 9f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveTo(10f, 12.015f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(14.2188f, 12.4592f),
                end = Offset(13.5089f, 14.892f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.5f, 12f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(16.276f, 15f, 16f, 15f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}

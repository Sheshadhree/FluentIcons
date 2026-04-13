package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Guest28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Guest28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    0.217751f to Color(0xFF35DAF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-1f, -3.24808f),
                end = Offset(23.0281f, 17.7982f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(20.25f, 2f)
            curveTo(21.769f, 2f, 23f, 3.231f, 23f, 4.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(7.75f)
            curveTo(6.231f, 26f, 5f, 24.769f, 5f, 23.25f)
            verticalLineTo(4.75f)
            curveTo(5f, 3.231f, 6.231f, 2f, 7.75f, 2f)
            horizontalLineToRelative(12.5f)
            close()
            moveToRelative(-7.5f, 3f)
            curveTo(12.336f, 5f, 12f, 5.336f, 12f, 5.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveTo(15.664f, 6.5f, 16f, 6.164f, 16f, 5.75f)
            reflectiveCurveTo(15.664f, 5f, 15.25f, 5f)
            horizontalLineToRelative(-2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.549232f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(16.7857f, 4.94737f),
                end = Offset(24.3487f, 29.1295f)
            ),
            fillAlpha = 0.7f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(20.25f, 2f)
            curveTo(21.769f, 2f, 23f, 3.231f, 23f, 4.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(7.75f)
            curveTo(6.231f, 26f, 5f, 24.769f, 5f, 23.25f)
            verticalLineTo(4.75f)
            curveTo(5f, 3.231f, 6.231f, 2f, 7.75f, 2f)
            horizontalLineToRelative(12.5f)
            close()
            moveToRelative(-7.5f, 3f)
            curveTo(12.336f, 5f, 12f, 5.336f, 12f, 5.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveTo(15.664f, 6.5f, 16f, 6.164f, 16f, 5.75f)
            reflectiveCurveTo(15.664f, 5f, 15.25f, 5f)
            horizontalLineToRelative(-2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(22.2549f, 28.0714f),
                end = Offset(15.0965f, 5.85502f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(10.84f, 16f)
            curveToRelative(-1.292f, 0f, -2.34f, 1.048f, -2.34f, 2.34f)
            curveToRelative(0f, 1.4f, 0.644f, 2.48f, 1.69f, 3.18f)
            curveToRelative(1.013f, 0.68f, 2.363f, 0.98f, 3.81f, 0.98f)
            reflectiveCurveToRelative(2.797f, -0.3f, 3.81f, -0.98f)
            curveToRelative(1.046f, -0.7f, 1.69f, -1.78f, 1.69f, -3.18f)
            curveToRelative(0f, -1.292f, -1.048f, -2.34f, -2.34f, -2.34f)
            horizontalLineToRelative(-6.32f)
            close()
            moveToRelative(-0.09f, -4.25f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            reflectiveCurveToRelative(3.25f, 1.455f, 3.25f, 3.25f)
            reflectiveCurveTo(15.795f, 15f, 14f, 15f)
            reflectiveCurveToRelative(-3.25f, -1.455f, -3.25f, -3.25f)
            close()
        }
    }.build()
}

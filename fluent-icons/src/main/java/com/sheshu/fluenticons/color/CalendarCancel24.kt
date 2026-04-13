package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CalendarCancel24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CalendarCancel24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(9.42857f, 6.5f),
                end = Offset(14.1366f, 20.9321f)
            )
        ) {
            moveTo(21f, 7.5f)
            verticalLineToRelative(10.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineToRelative(9f, -1f)
            lineToRelative(9f, 1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8)
                ),
                start = Offset(13.9286f, 12.4318f),
                end = Offset(16.625f, 24.267f)
            )
        ) {
            moveTo(21f, 7.5f)
            verticalLineToRelative(10.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineToRelative(9f, -1f)
            lineToRelative(9f, 1f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.535f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(17.7857f, 19.0227f),
                radius = 8.56818f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(21f, 7.5f)
            verticalLineToRelative(10.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(7.5f)
            lineToRelative(9f, -1f)
            lineToRelative(9f, 1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.72321f, 3f),
                end = Offset(5.35631f, 11.5369f)
            )
        ) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
            moveToRelative(-0.25f, 9f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveTo(20.538f, 23f, 17.5f, 23f)
            reflectiveCurveTo(12f, 20.538f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFFECBE6)
                ),
                start = Offset(15.5033f, 17.7005f),
                end = Offset(17.8565f, 20.1487f)
            )
        ) {
            moveTo(15.024f, 15.024f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1.77f, 1.77f)
            lineToRelative(-1.768f, 1.766f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(1.766f, -1.767f)
            lineToRelative(1.77f, 1.77f)
            curveToRelative(0.195f, 0.194f, 0.511f, 0.194f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.513f, 0f, -0.708f)
            lineToRelative(-1.769f, -1.769f)
            lineToRelative(1.771f, -1.77f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.195f, -0.195f, -0.511f, -0.195f, -0.707f, 0f)
            lineToRelative(-1.77f, 1.77f)
            lineToRelative(-1.771f, -1.77f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            close()
        }
    }.build()
}

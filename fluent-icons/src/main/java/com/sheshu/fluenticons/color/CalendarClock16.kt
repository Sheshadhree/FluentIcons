package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CalendarClock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CalendarClock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(6.28571f, 4.5f),
                end = Offset(9.32709f, 13.9867f)
            )
        ) {
            moveTo(14f, 11.5f)
            verticalLineToRelative(-6f)
            lineToRelative(-6f, -1f)
            lineToRelative(-6f, 1f)
            verticalLineToRelative(6f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8)
                ),
                start = Offset(9.28571f, 8.38636f),
                end = Offset(11.0248f, 16.1535f)
            )
        ) {
            moveTo(14f, 11.5f)
            verticalLineToRelative(-6f)
            lineToRelative(-6f, -1f)
            lineToRelative(-6f, 1f)
            verticalLineToRelative(6f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.497076f to Color(0xFF4A43CB),
                    1f to Color(0x004A43CB)
                ),
                center = Offset(11.8571f, 12.7045f),
                radius = 6.79696f
            ),
            fillAlpha = 0.3f
        ) {
            moveTo(14f, 11.5f)
            verticalLineToRelative(-6f)
            lineToRelative(-6f, -1f)
            lineToRelative(-6f, 1f)
            verticalLineToRelative(6f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2.48214f, 2f),
                end = Offset(4.02593f, 8.72509f)
            )
        ) {
            moveTo(14f, 4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(12f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(2f, 7f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(11.2188f, 9.45918f),
                end = Offset(10.5089f, 11.892f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.5f, 9f)
            curveTo(11.776f, 9f, 12f, 9.224f, 12f, 9.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.276f, 12f, 13f, 12f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveTo(11f, 9.224f, 11.224f, 9f, 11.5f, 9f)
            close()
        }
    }.build()
}

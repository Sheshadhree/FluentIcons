package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Guest20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Guest20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    0.217751f to Color(0xFF35DAF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-4.34276E-9f, -1.5f),
                end = Offset(16.0238f, 12.5302f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.5f, 2f)
            curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
            verticalLineToRelative(13.006f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(3.5f)
            curveTo(16f, 2.672f, 15.328f, 2f, 14.5f, 2f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(3f, 2f)
            curveTo(8.224f, 4f, 8f, 4.224f, 8f, 4.5f)
            reflectiveCurveTo(8.224f, 5f, 8.5f, 5f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 5f, 12f, 4.776f, 12f, 4.5f)
            reflectiveCurveTo(11.776f, 4f, 11.5f, 4f)
            horizontalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.549232f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(11.8571f, 3.96563f),
                end = Offset(16.9025f, 20.0919f)
            ),
            fillAlpha = 0.7f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.5f, 2f)
            curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
            verticalLineToRelative(13.006f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(3.5f)
            curveTo(16f, 2.672f, 15.328f, 2f, 14.5f, 2f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(3f, 2f)
            curveTo(8.224f, 4f, 8f, 4.224f, 8f, 4.5f)
            reflectiveCurveTo(8.224f, 5f, 8.5f, 5f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 5f, 12f, 4.776f, 12f, 4.5f)
            reflectiveCurveTo(11.776f, 4f, 11.5f, 4f)
            horizontalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(15.2531f, 19.4286f),
                end = Offset(10.967f, 5.67304f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(8.295f, 15.73f)
            curveTo(8.743f, 15.897f, 9.302f, 16f, 10.001f, 16f)
            curveToRelative(0.698f, 0f, 1.257f, -0.103f, 1.704f, -0.269f)
            curveTo(13.5f, 15.066f, 13.5f, 13.4f, 13.5f, 13.4f)
            curveToRelative(0f, -0.773f, -0.64f, -1.4f, -1.43f, -1.4f)
            horizontalLineTo(7.93f)
            curveToRelative(-0.79f, 0f, -1.43f, 0.627f, -1.43f, 1.4f)
            curveToRelative(0f, 0f, 0f, 1.666f, 1.795f, 2.33f)
            close()
            moveTo(10f, 11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}

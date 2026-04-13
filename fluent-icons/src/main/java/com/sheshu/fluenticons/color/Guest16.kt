package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Guest16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Guest16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    0.217751f to Color(0xFF35DAF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-0.333333f, -2.06138f),
                end = Offset(13.5771f, 9.54259f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13f, 2.5f)
            curveTo(13f, 1.672f, 12.328f, 1f, 11.5f, 1f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 1f, 3f, 1.672f, 3f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 14.328f, 3.672f, 15f, 4.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-11f)
            close()
            moveTo(7f, 3f)
            curveTo(6.724f, 3f, 6.5f, 3.224f, 6.5f, 3.5f)
            reflectiveCurveTo(6.724f, 4f, 7f, 4f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.276f, 3f, 9f, 3f)
            horizontalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.549232f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(9.54762f, 2.7193f),
                end = Offset(14.138f, 16.6979f)
            ),
            fillAlpha = 0.7f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13f, 2.5f)
            curveTo(13f, 1.672f, 12.328f, 1f, 11.5f, 1f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 1f, 3f, 1.672f, 3f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 14.328f, 3.672f, 15f, 4.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-11f)
            close()
            moveTo(7f, 3f)
            curveTo(6.724f, 3f, 6.5f, 3.224f, 6.5f, 3.5f)
            reflectiveCurveTo(6.724f, 4f, 7f, 4f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.276f, 3f, 9f, 3f)
            horizontalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(12.5494f, 15.5714f),
                end = Offset(9.70264f, 5.02132f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(5.695f, 10f)
            curveToRelative(-0.331f, 0f, -0.69f, 0.238f, -0.72f, 0.657f)
            curveToRelative(-0.023f, 0.315f, 0.005f, 0.922f, 0.46f, 1.453f)
            curveTo(5.895f, 12.65f, 6.703f, 13f, 8f, 13f)
            reflectiveCurveToRelative(2.104f, -0.35f, 2.566f, -0.89f)
            curveToRelative(0.454f, -0.531f, 0.482f, -1.138f, 0.46f, -1.453f)
            curveToRelative(-0.03f, -0.42f, -0.39f, -0.657f, -0.721f, -0.657f)
            horizontalLineToRelative(-4.61f)
            close()
            moveTo(6f, 7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            close()
        }
    }.build()
}

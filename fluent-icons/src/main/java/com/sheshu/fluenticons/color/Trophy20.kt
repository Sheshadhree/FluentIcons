package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Trophy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Trophy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.174107f to Color(0xFFEB4824),
                    0.5625f to Color(0xFBFF921F),
                    0.852679f to Color(0xFFEB4824)
                ),
                start = Offset(9f, 12.5f),
                end = Offset(13f, 18f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.5f, 15.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.183934f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFF6F47)
                ),
                start = Offset(31f, 27f),
                end = Offset(26.9076f, 10.0677f)
            )
        ) {
            moveTo(7.5f, 15f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(0.5f)
            curveTo(5.5f, 17.776f, 5.724f, 18f, 6f, 18f)
            horizontalLineToRelative(8f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(17f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(7.5f, 6.5f),
                end = Offset(1.5f, 6.5f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(8.328f, 4f, 9f, 4.672f, 9f, 5.5f)
            verticalLineTo(7f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveTo(3f, 8.657f, 3f, 7f)
            verticalLineTo(5.5f)
            close()
            moveTo(4.5f, 5f)
            curveTo(4.224f, 5f, 4f, 5.224f, 4f, 5.5f)
            verticalLineTo(7f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            verticalLineTo(5.5f)
            curveTo(8f, 5.224f, 7.776f, 5f, 7.5f, 5f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(11f, 5.5f)
            curveTo(11f, 4.672f, 11.672f, 4f, 12.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(16.328f, 4f, 17f, 4.672f, 17f, 5.5f)
            verticalLineTo(7f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            verticalLineTo(5.5f)
            close()
            moveTo(12.5f, 5f)
            curveTo(12.224f, 5f, 12f, 5.224f, 12f, 5.5f)
            verticalLineTo(7f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            verticalLineTo(5.5f)
            curveTo(16f, 5.224f, 15.776f, 5f, 15.5f, 5f)
            horizontalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                center = Offset(14.5f, 13f),
                radius = 13.1244f
            )
        ) {
            moveTo(7.5f, 2f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}

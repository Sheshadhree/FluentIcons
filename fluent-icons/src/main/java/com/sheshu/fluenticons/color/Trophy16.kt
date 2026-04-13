package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Trophy16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Trophy16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color(0xFFC55D5D))) {
            moveTo(7.5f, 13f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.174107f to Color(0xFFEB4824),
                    0.5625f to Color(0xFBFF921F),
                    0.852679f to Color(0xFFEB4824)
                ),
                start = Offset(7f, 9.4f),
                end = Offset(11.9991f, 15.1281f)
            )
        ) {
            moveTo(7.5f, 13f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-1f)
            close()
        }
        path(fill = SolidColor(Color(0xFFD9D9D9))) {
            moveTo(4f, 14f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(0.504f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.183934f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFF6F47)
                ),
                start = Offset(26.6667f, 24.0139f),
                end = Offset(22.1194f, 7.30953f)
            )
        ) {
            moveTo(4f, 14f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(0.504f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(14f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFD96A6A)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(6.328f, 3f, 7f, 3.672f, 7f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(7f, 6.88f, 5.88f, 8f, 4.5f, 8f)
            reflectiveCurveTo(2f, 6.88f, 2f, 5.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(3.5f, 4f)
            curveTo(3.224f, 4f, 3f, 4.224f, 3f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 6.328f, 3.672f, 7f, 4.5f, 7f)
            reflectiveCurveTo(6f, 6.328f, 6f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(6f, 4.224f, 5.776f, 4f, 5.5f, 4f)
            horizontalLineToRelative(-2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(5.75f, 5.08333f),
                end = Offset(0.75f, 5.08333f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(6.328f, 3f, 7f, 3.672f, 7f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(7f, 6.88f, 5.88f, 8f, 4.5f, 8f)
            reflectiveCurveTo(2f, 6.88f, 2f, 5.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(3.5f, 4f)
            curveTo(3.224f, 4f, 3f, 4.224f, 3f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 6.328f, 3.672f, 7f, 4.5f, 7f)
            reflectiveCurveTo(6f, 6.328f, 6f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(6f, 4.224f, 5.776f, 4f, 5.5f, 4f)
            horizontalLineToRelative(-2f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFD96A6A)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9f, 4.5f)
            curveTo(9f, 3.672f, 9.672f, 3f, 10.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(13.328f, 3f, 14f, 3.672f, 14f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(14f, 6.88f, 12.88f, 8f, 11.5f, 8f)
            reflectiveCurveTo(9f, 6.88f, 9f, 5.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(10.5f, 4f)
            curveTo(10.224f, 4f, 10f, 4.224f, 10f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(10f, 6.328f, 10.672f, 7f, 11.5f, 7f)
            reflectiveCurveTo(13f, 6.328f, 13f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(13f, 4.224f, 12.776f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(10.6667f, 5.08333f),
                end = Offset(15.25f, 5.08333f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9f, 4.5f)
            curveTo(9f, 3.672f, 9.672f, 3f, 10.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(13.328f, 3f, 14f, 3.672f, 14f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(14f, 6.88f, 12.88f, 8f, 11.5f, 8f)
            reflectiveCurveTo(9f, 6.88f, 9f, 5.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(10.5f, 4f)
            curveTo(10.224f, 4f, 10f, 4.224f, 10f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(10f, 6.328f, 10.672f, 7f, 11.5f, 7f)
            reflectiveCurveTo(13f, 6.328f, 13f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(13f, 4.224f, 12.776f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-2f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveTo(4.895f, 1f, 4f, 1.895f, 4f, 3f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                center = Offset(12f, 10.5652f),
                radius = 11.5196f
            )
        ) {
            moveTo(6f, 1f)
            curveTo(4.895f, 1f, 4f, 1.895f, 4f, 3f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}

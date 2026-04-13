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

public val FluentIcons.Color.GiftCard16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.GiftCard16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color(0xFFCECECE))) {
            moveTo(1f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFBB45EA),
                    0.468144f to Color(0xFF8B57ED),
                    1f to Color(0xFF5B2AB5)
                ),
                start = Offset(1f, -0.125f),
                end = Offset(9.02657f, 16.8889f)
            )
        ) {
            moveTo(1f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.99f, 7f)
            lineTo(5f, 2.999f)
            lineTo(6f, 3f)
            lineTo(5.99f, 7f)
            horizontalLineTo(15f)
            verticalLineToRelative(1f)
            horizontalLineTo(5.988f)
            lineToRelative(-0.011f, 5.001f)
            lineToRelative(-1f, -0.002f)
            lineTo(4.988f, 8f)
            horizontalLineTo(1f)
            verticalLineTo(7f)
            horizontalLineToRelative(3.99f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    0.378049f to Color(0xFFFFCD0F)
                ),
                center = Offset(6.25f, 8f),
                radius = 17.9375f
            )
        ) {
            moveTo(4.99f, 7f)
            lineTo(5f, 2.999f)
            lineTo(6f, 3f)
            lineTo(5.99f, 7f)
            horizontalLineTo(15f)
            verticalLineToRelative(1f)
            horizontalLineTo(5.988f)
            lineToRelative(-0.011f, 5.001f)
            lineToRelative(-1f, -0.002f)
            lineTo(4.988f, 8f)
            horizontalLineTo(1f)
            verticalLineTo(7f)
            horizontalLineToRelative(3.99f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF515151)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.305f, 7.987f)
            curveTo(3.57f, 7.893f, 3f, 7.263f, 3f, 6.5f)
            curveTo(3f, 5.672f, 3.672f, 5f, 4.5f, 5f)
            curveToRelative(0.384f, 0f, 0.735f, 0.144f, 1f, 0.382f)
            curveTo(5.765f, 5.144f, 6.116f, 5f, 6.5f, 5f)
            curveTo(7.328f, 5f, 8f, 5.672f, 8f, 6.5f)
            curveToRelative(0f, 0.763f, -0.569f, 1.392f, -1.305f, 1.487f)
            lineToRelative(1.159f, 1.16f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(5.5f, 8.207f)
            lineTo(3.853f, 9.853f)
            curveToRelative(-0.195f, 0.196f, -0.511f, 0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(1.16f, -1.159f)
            close()
            moveTo(4.5f, 6f)
            curveTo(4.224f, 6f, 4f, 6.224f, 4f, 6.5f)
            reflectiveCurveTo(4.224f, 7f, 4.5f, 7f)
            horizontalLineTo(5f)
            verticalLineTo(6.5f)
            curveTo(5f, 6.224f, 4.776f, 6f, 4.5f, 6f)
            close()
            moveToRelative(2f, 1f)
            horizontalLineTo(6f)
            verticalLineTo(6.5f)
            curveTo(6f, 6.224f, 6.224f, 6f, 6.5f, 6f)
            reflectiveCurveTo(7f, 6.224f, 7f, 6.5f)
            reflectiveCurveTo(6.776f, 7f, 6.5f, 7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    0.80352f to Color(0xFFFFCD0F)
                ),
                start = Offset(5.66667f, -9.64282f),
                end = Offset(5.28403f, 15.3564f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.305f, 7.987f)
            curveTo(3.57f, 7.893f, 3f, 7.263f, 3f, 6.5f)
            curveTo(3f, 5.672f, 3.672f, 5f, 4.5f, 5f)
            curveToRelative(0.384f, 0f, 0.735f, 0.144f, 1f, 0.382f)
            curveTo(5.765f, 5.144f, 6.116f, 5f, 6.5f, 5f)
            curveTo(7.328f, 5f, 8f, 5.672f, 8f, 6.5f)
            curveToRelative(0f, 0.763f, -0.569f, 1.392f, -1.305f, 1.487f)
            lineToRelative(1.159f, 1.16f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(5.5f, 8.207f)
            lineTo(3.853f, 9.853f)
            curveToRelative(-0.195f, 0.196f, -0.511f, 0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(1.16f, -1.159f)
            close()
            moveTo(4.5f, 6f)
            curveTo(4.224f, 6f, 4f, 6.224f, 4f, 6.5f)
            reflectiveCurveTo(4.224f, 7f, 4.5f, 7f)
            horizontalLineTo(5f)
            verticalLineTo(6.5f)
            curveTo(5f, 6.224f, 4.776f, 6f, 4.5f, 6f)
            close()
            moveToRelative(2f, 1f)
            horizontalLineTo(6f)
            verticalLineTo(6.5f)
            curveTo(6f, 6.224f, 6.224f, 6f, 6.5f, 6f)
            reflectiveCurveTo(7f, 6.224f, 7f, 6.5f)
            reflectiveCurveTo(6.776f, 7f, 6.5f, 7f)
            close()
        }
    }.build()
}

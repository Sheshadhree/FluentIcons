package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Briefcase16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Briefcase16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(2.42857f, 8.3125f),
                end = Offset(6.71751f, 20.8482f)
            )
        ) {
            moveTo(2f, 7f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.336754f to Color(0xFF194694),
                    0.74691f to Color(0x00367AF2)
                ),
                center = Offset(8f, 7f),
                radius = 7f
            )
        ) {
            moveTo(2f, 7f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF163697)
                ),
                start = Offset(2.19787f, 2.35f),
                end = Offset(2.78604f, 6.38584f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.5f, 2f)
            curveTo(10.328f, 2f, 11f, 2.672f, 11f, 3.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.506f, 0f, 0.967f, 0.19f, 1.32f, 0.5f)
            horizontalLineTo(2.68f)
            curveTo(3.034f, 5.19f, 3.495f, 5f, 4f, 5f)
            horizontalLineToRelative(1f)
            verticalLineTo(3.5f)
            curveTo(5f, 2.672f, 5.672f, 2f, 6.5f, 2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(-3f, 1f)
            curveTo(6.224f, 3f, 6f, 3.224f, 6f, 3.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(4f)
            verticalLineTo(3.5f)
            curveTo(10f, 3.224f, 9.776f, 3f, 9.5f, 3f)
            horizontalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF80F1E6),
                    0.551691f to Color(0xFF40C4F5),
                    1f to Color(0xFF00A2FA)
                ),
                start = Offset(3.2f, 5.20756f),
                end = Offset(8.65754f, 11.8338f)
            )
        ) {
            moveTo(2f, 7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.672f, 10f, 2f, 9.328f, 2f, 8.5f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB8F5FF),
                    0.843749f to Color(0xFF7CECFF)
                ),
                start = Offset(8f, 7.5f),
                end = Offset(8f, 9.5f)
            )
        ) {
            moveTo(8.5f, 7.5f)
            horizontalLineToRelative(-1f)
            curveTo(7.224f, 7.5f, 7f, 7.724f, 7f, 8f)
            verticalLineToRelative(2.01f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}

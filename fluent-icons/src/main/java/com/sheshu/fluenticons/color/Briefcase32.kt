package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Briefcase32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Briefcase32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF163697)
                ),
                start = Offset(9.22069f, 3.75f),
                end = Offset(11.4095f, 12.0013f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(19f, 3f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(0.314f)
            lineTo(16f, 10.5f)
            lineTo(9.79f, 8f)
            horizontalLineTo(10f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(-6f, 2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(8f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(3.92857f, 16.625f),
                end = Offset(11.9713f, 42.0911f)
            )
        ) {
            moveTo(3f, 14f)
            horizontalLineToRelative(26f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 28f, 3f, 25.985f, 3f, 23.5f)
            verticalLineTo(14f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.336754f to Color(0xFF194694),
                    0.74691f to Color(0x00367AF2)
                ),
                center = Offset(16f, 14f),
                radius = 14f
            )
        ) {
            moveTo(3f, 14f)
            horizontalLineToRelative(26f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 28f, 3f, 25.985f, 3f, 23.5f)
            verticalLineTo(14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF80F1E6),
                    0.551691f to Color(0xFF40C4F5),
                    1f to Color(0xFF00A2FA)
                ),
                start = Offset(5.6f, 8.45662f),
                end = Offset(17.6404f, 22.8538f)
            )
        ) {
            moveTo(3f, 12.5f)
            curveTo(3f, 10.015f, 5.015f, 8f, 7.5f, 8f)
            horizontalLineToRelative(17f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineTo(16f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB8F5FF),
                    0.843749f to Color(0xFF7CECFF)
                ),
                start = Offset(16f, 15f),
                end = Offset(16f, 21f)
            )
        ) {
            moveTo(17.5f, 15f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.build()
}

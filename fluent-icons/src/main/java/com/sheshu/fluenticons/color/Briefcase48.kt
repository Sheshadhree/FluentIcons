package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Briefcase48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Briefcase48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF163697)
                ),
                start = Offset(15.1553f, 5.26963f),
                end = Offset(19.6734f, 18.7008f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(27.75f, 4f)
            curveTo(30.097f, 4f, 32f, 5.903f, 32f, 8.25f)
            verticalLineTo(12f)
            horizontalLineToRelative(0.634f)
            lineTo(24.5f, 16.696f)
            lineTo(15.914f, 12f)
            horizontalLineTo(16f)
            verticalLineTo(8.25f)
            curveTo(16f, 5.903f, 17.903f, 4f, 20.25f, 4f)
            horizontalLineToRelative(7.5f)
            close()
            moveToRelative(-7.5f, 2.5f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineTo(12f)
            horizontalLineToRelative(11f)
            verticalLineTo(8.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(7.28571f, 24.5625f),
                end = Offset(18.0225f, 59.2473f)
            )
        ) {
            moveTo(6f, 21f)
            horizontalLineToRelative(36f)
            verticalLineToRelative(12.75f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 40f, 6f, 37.202f, 6f, 33.75f)
            verticalLineTo(21f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.336754f to Color(0xFF194694),
                    0.74691f to Color(0x00367AF2)
                ),
                center = Offset(24f, 21f),
                radius = 19f
            )
        ) {
            moveTo(6f, 21f)
            horizontalLineToRelative(36f)
            verticalLineToRelative(12.75f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 40f, 6f, 37.202f, 6f, 33.75f)
            verticalLineTo(21f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF80F1E6),
                    0.551691f to Color(0xFF40C4F5),
                    1f to Color(0xFF00A2FA)
                ),
                start = Offset(9.6f, 12.6642f),
                end = Offset(27.2458f, 32.7495f)
            )
        ) {
            moveTo(6f, 18.25f)
            curveTo(6f, 14.798f, 8.798f, 12f, 12.25f, 12f)
            horizontalLineToRelative(23.5f)
            curveToRelative(3.452f, 0f, 6.25f, 2.798f, 6.25f, 6.25f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(9.75f)
            curveTo(7.679f, 28f, 6f, 26.321f, 6f, 24.25f)
            verticalLineToRelative(-6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB8F5FF),
                    0.843749f to Color(0xFF7CECFF)
                ),
                start = Offset(24f, 23f),
                end = Offset(24f, 31f)
            )
        ) {
            moveTo(26f, 23f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
        }
    }.build()
}

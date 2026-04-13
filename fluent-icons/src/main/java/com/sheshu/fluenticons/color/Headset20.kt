package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headset20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headset20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9CA5AD),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(6.91667f, 16.1667f),
                end = Offset(5.28935f, 12.07f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6f, 12f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineTo(7f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF383B3D),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(11.5f, 17.5f),
                end = Offset(8.11168f, 15.5206f)
            )
        ) {
            moveTo(12f, 16f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(2f, -8f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveTo(4f, 4.686f, 4f, 8f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(13.5417f, 8f),
                end = Offset(13.5417f, 13f)
            )
        ) {
            moveTo(6f, 8f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            lineToRelative(-1f, -2.5f)
            lineTo(6f, 8f)
            close()
            moveToRelative(9f, 4f)
            lineToRelative(-1f, 1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1f)
            lineToRelative(1f, 1f)
            verticalLineToRelative(3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(15f, 8f),
                end = Offset(14.3264f, 12.9075f)
            )
        ) {
            moveTo(6f, 8f)
            horizontalLineTo(4f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(2f)
            verticalLineTo(8f)
            close()
            moveToRelative(10f, 0f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}

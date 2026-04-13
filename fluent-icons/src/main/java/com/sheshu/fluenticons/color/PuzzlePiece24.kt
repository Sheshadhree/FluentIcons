package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PuzzlePiece24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PuzzlePiece24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(5.83333f, 0.888889f),
                end = Offset(16.8833f, 21.7611f)
            )
        ) {
            moveTo(13f, 2f)
            curveToRelative(1.364f, 0f, 2.47f, 1.106f, 2.47f, 2.47f)
            lineTo(15.469f, 5f)
            horizontalLineTo(19f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            lineToRelative(-0.001f, 3.499f)
            lineToRelative(-1.53f, 0.001f)
            curveToRelative(-1.309f, 0f, -2.38f, 1.019f, -2.464f, 2.307f)
            lineTo(16f, 11.97f)
            verticalLineToRelative(0.06f)
            curveToRelative(0f, 1.31f, 1.019f, 2.381f, 2.307f, 2.465f)
            lineTo(18.47f, 14.5f)
            lineToRelative(1.529f, -0.001f)
            lineTo(20f, 18.003f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            lineToRelative(-3.531f, -0.001f)
            verticalLineToRelative(0.528f)
            curveTo(15.47f, 20.894f, 14.365f, 22f, 13f, 22f)
            curveToRelative(-1.364f, 0f, -2.47f, -1.106f, -2.47f, -2.47f)
            verticalLineToRelative(-0.528f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, -0.447f, -1f, -1f)
            lineToRelative(-0.001f, -3.531f)
            horizontalLineToRelative(-0.53f)
            curveTo(4.107f, 14.471f, 3f, 13.365f, 3f, 12.001f)
            reflectiveCurveToRelative(1.106f, -2.47f, 2.47f, -2.47f)
            horizontalLineToRelative(0.529f)
            lineTo(6f, 6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.53f)
            verticalLineTo(4.47f)
            curveTo(10.53f, 3.106f, 11.636f, 2f, 13f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.53288f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(14.131f, 4.45614f),
                end = Offset(18.7254f, 23.8609f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(13f, 2f)
            curveToRelative(1.364f, 0f, 2.47f, 1.106f, 2.47f, 2.47f)
            lineTo(15.469f, 5f)
            horizontalLineTo(19f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            lineToRelative(-0.001f, 3.499f)
            lineToRelative(-1.53f, 0.001f)
            curveToRelative(-1.309f, 0f, -2.38f, 1.019f, -2.464f, 2.307f)
            lineTo(16f, 11.97f)
            verticalLineToRelative(0.06f)
            curveToRelative(0f, 1.31f, 1.019f, 2.381f, 2.307f, 2.465f)
            lineTo(18.47f, 14.5f)
            lineToRelative(1.529f, -0.001f)
            lineTo(20f, 18.003f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            lineToRelative(-3.531f, -0.001f)
            verticalLineToRelative(0.528f)
            curveTo(15.47f, 20.894f, 14.365f, 22f, 13f, 22f)
            curveToRelative(-1.364f, 0f, -2.47f, -1.106f, -2.47f, -2.47f)
            verticalLineToRelative(-0.528f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, -0.447f, -1f, -1f)
            lineToRelative(-0.001f, -3.531f)
            horizontalLineToRelative(-0.53f)
            curveTo(4.107f, 14.471f, 3f, 13.365f, 3f, 12.001f)
            reflectiveCurveToRelative(1.106f, -2.47f, 2.47f, -2.47f)
            horizontalLineToRelative(0.529f)
            lineTo(6f, 6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.53f)
            verticalLineTo(4.47f)
            curveTo(10.53f, 3.106f, 11.636f, 2f, 13f, 2f)
            close()
        }
    }.build()
}

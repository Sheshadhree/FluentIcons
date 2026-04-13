package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headphones32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headphones32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCAD2D9),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(-6.4375f, 4.50996f),
                end = Offset(1.79464f, 22.6561f)
            )
        ) {
            moveTo(4f, 15.5f)
            curveTo(4f, 9.149f, 9.149f, 4f, 15.5f, 4f)
            reflectiveCurveTo(27f, 9.149f, 27f, 15.5f)
            verticalLineTo(18f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            verticalLineToRelative(-2.5f)
            curveTo(29f, 8.044f, 22.956f, 2f, 15.5f, 2f)
            reflectiveCurveTo(2f, 8.044f, 2f, 15.5f)
            verticalLineTo(18f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            verticalLineToRelative(-2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(-7.64286f, 2f),
                end = Offset(-4.55462f, 15.5774f)
            )
        ) {
            moveTo(4f, 15.5f)
            curveTo(4f, 9.149f, 9.149f, 4f, 15.5f, 4f)
            reflectiveCurveTo(27f, 9.149f, 27f, 15.5f)
            verticalLineTo(18f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            verticalLineToRelative(-2.5f)
            curveTo(29f, 8.044f, 22.956f, 2f, 15.5f, 2f)
            reflectiveCurveTo(2f, 8.044f, 2f, 15.5f)
            verticalLineTo(18f)
            lineToRelative(1f, 1f)
            lineToRelative(1f, -1f)
            verticalLineToRelative(-2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(28f, 18f),
                end = Offset(28f, 29.2422f)
            )
        ) {
            moveTo(2f, 25.5f)
            curveToRelative(0f, 1.56f, 0.794f, 2.935f, 2f, 3.742f)
            lineTo(6f, 23.5f)
            lineTo(4f, 18f)
            horizontalLineTo(2f)
            verticalLineToRelative(7.5f)
            close()
            moveToRelative(27f, 0f)
            curveToRelative(0f, 1.56f, -0.794f, 2.935f, -2f, 3.742f)
            lineTo(25f, 23.5f)
            lineToRelative(2f, -5.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(13.8125f, 18f),
                end = Offset(13.8125f, 30f)
            )
        ) {
            moveTo(4f, 29.242f)
            verticalLineTo(18f)
            horizontalLineToRelative(7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6.5f)
            curveToRelative(-0.925f, 0f, -1.785f, -0.28f, -2.5f, -0.758f)
            close()
            moveTo(27f, 18f)
            verticalLineToRelative(11.242f)
            curveTo(26.285f, 29.721f, 25.425f, 30f, 24.5f, 30f)
            horizontalLineTo(20f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(19f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(7f)
            close()
        }
    }.build()
}

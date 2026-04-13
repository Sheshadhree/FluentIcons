package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BuildingStore16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BuildingStore16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.312325f to Color(0xFF29C3FF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(5f, 6.81818f),
                end = Offset(6.56686f, 15.4359f)
            )
        ) {
            moveTo(2f, 6.5f)
            curveTo(2f, 6.224f, 2.224f, 6f, 2.5f, 6f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 6f, 14f, 6.224f, 14f, 6.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 15f, 2f, 14.776f, 2f, 14.5f)
            verticalLineToRelative(-8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0067BF),
                    1f to Color(0xFF003580)
                ),
                start = Offset(4.14286f, 10.125f),
                end = Offset(8.02206f, 12.8119f)
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(4f, 9.5f)
            curveTo(4f, 9.224f, 4.224f, 9f, 4.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 9f, 8f, 9.224f, 8f, 9.5f)
            verticalLineTo(15f)
            horizontalLineTo(4f)
            verticalLineTo(9.5f)
            close()
            moveToRelative(5f, 0f)
            curveTo(9f, 9.224f, 9.224f, 9f, 9.5f, 9f)
            horizontalLineToRelative(2f)
            curveTo(11.776f, 9f, 12f, 9.224f, 12f, 9.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-2f)
            curveTo(9.224f, 12f, 9f, 11.776f, 9f, 11.5f)
            verticalLineToRelative(-2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB6F7B),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(4.03846f, 1f),
                end = Offset(4.03846f, 4.0625f)
            )
        ) {
            moveTo(7f, 2.5f)
            verticalLineTo(1f)
            horizontalLineTo(4.5f)
            curveTo(4.387f, 1f, 4.277f, 1.039f, 4.188f, 1.11f)
            lineToRelative(-2.5f, 2f)
            curveToRelative(-0.12f, 0.095f, -0.164f, 0.24f, -0.18f, 0.388f)
            lineTo(1.5f, 3.5f)
            verticalLineToRelative(2f)
            curveTo(1.5f, 6.88f, 2.62f, 8f, 4f, 8f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-2f)
            lineTo(6.083f, 3.417f)
            lineTo(7f, 2.5f)
            close()
            moveToRelative(7.493f, 0.999f)
            curveToRelative(-0.015f, -0.149f, -0.06f, -0.293f, -0.18f, -0.39f)
            lineToRelative(-2.5f, -2f)
            curveTo(11.724f, 1.04f, 11.614f, 1f, 11.5f, 1f)
            horizontalLineTo(9f)
            verticalLineToRelative(1.5f)
            lineToRelative(0.917f, 0.917f)
            lineTo(9.5f, 3.5f)
            verticalLineToRelative(2f)
            curveTo(9.5f, 6.88f, 10.62f, 8f, 12f, 8f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-2f)
            lineToRelative(-0.007f, -0.001f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.303571f to Color(0xFFFF9FB2),
                    1f to Color(0xFFF97DBD)
                ),
                start = Offset(8f, 1f),
                end = Offset(8f, 4.0625f)
            )
        ) {
            moveTo(9.5f, 1f)
            lineToRelative(1f, 2.5f)
            verticalLineToRelative(2f)
            curveTo(10.5f, 6.88f, 9.38f, 8f, 8f, 8f)
            reflectiveCurveTo(5.5f, 6.88f, 5.5f, 5.5f)
            verticalLineToRelative(-2f)
            lineToRelative(1f, -2.5f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}

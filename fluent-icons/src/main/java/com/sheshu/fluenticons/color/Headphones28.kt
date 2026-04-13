package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headphones28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headphones28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCAD2D9),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(-5.5f, 4.19621f),
                end = Offset(1.6283f, 20.1585f)
            )
        ) {
            moveTo(26f, 16f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(4f, 8.477f, 4f, 14f)
            verticalLineToRelative(2f)
            horizontalLineTo(2f)
            verticalLineToRelative(-2f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            verticalLineToRelative(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(-6.57143f, 2f),
                end = Offset(-3.90738f, 13.8984f)
            )
        ) {
            moveTo(26f, 16f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(4f, 8.477f, 4f, 14f)
            verticalLineToRelative(2f)
            horizontalLineTo(2f)
            verticalLineToRelative(-2f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            verticalLineToRelative(2f)
            close()
            moveTo(4f, 16f)
            verticalLineToRelative(9.465f)
            curveTo(2.804f, 24.773f, 2f, 23.48f, 2f, 22f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(20f, 0f)
            verticalLineToRelative(9.465f)
            curveToRelative(1.196f, -0.692f, 2f, -1.984f, 2f, -3.465f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(4f, 25.465f)
            verticalLineTo(16f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            curveToRelative(-0.729f, 0f, -1.412f, -0.195f, -2f, -0.535f)
            close()
            moveTo(22f, 26f)
            curveToRelative(0.729f, 0f, 1.412f, -0.195f, 2f, -0.535f)
            verticalLineTo(16f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}

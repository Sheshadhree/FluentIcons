package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataTrending32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataTrending32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.445478f to Color(0xFF9C6CFE),
                    0.956907f to Color(0xFFE656EB)
                ),
                start = Offset(5.34645f, 19.25f),
                end = Offset(34.3893f, 7.68876f)
            )
        ) {
            moveTo(18.996f, 7.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(7f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineToRelative(-3.978f)
            lineToRelative(-6.612f, 6.612f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            lineTo(14.5f, 14.268f)
            lineToRelative(-5.366f, 5.366f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(6.25f, -6.25f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(3.116f, 3.116f)
            lineTo(24.232f, 9f)
            horizontalLineToRelative(-3.986f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF70777D),
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(26.5625f, 4.625f),
                end = Offset(3.80949f, 38.5051f)
            )
        ) {
            moveTo(4f, 3f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(20.5f)
            curveTo(5f, 25.88f, 6.12f, 27f, 7.5f, 27f)
            horizontalLineTo(28f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}

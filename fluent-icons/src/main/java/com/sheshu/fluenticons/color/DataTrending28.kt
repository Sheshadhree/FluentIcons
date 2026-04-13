package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataTrending28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataTrending28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.445478f to Color(0xFF9C6CFE),
                    0.956907f to Color(0xFFE656EB)
                ),
                start = Offset(5.61522f, 17.3333f),
                end = Offset(30.3171f, 8.06902f)
            )
        ) {
            moveTo(23.002f, 9.412f)
            verticalLineTo(12f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.551f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.449f, 1f, 1f, 1f)
            horizontalLineToRelative(2.584f)
            lineTo(16.5f, 13.086f)
            lineToRelative(-2.293f, -2.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-5.5f, 5.5f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(4.793f, -4.793f)
            lineToRelative(2.293f, 2.293f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(5.795f, -5.795f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF70777D),
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(22.9375f, 4.375f),
                end = Offset(3.68495f, 33.0427f)
            )
        ) {
            moveTo(4f, 3f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(17f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}

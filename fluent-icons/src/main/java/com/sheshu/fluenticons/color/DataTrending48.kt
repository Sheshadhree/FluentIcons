package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataTrending48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataTrending48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.445478f to Color(0xFF9C6CFE),
                    0.956907f to Color(0xFFE656EB)
                ),
                start = Offset(9.76923f, 29f),
                end = Offset(48.8234f, 13.2698f)
            )
        ) {
            moveTo(38f, 17.121f)
            verticalLineTo(23.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -0.398f, -0.158f, -0.78f, -0.44f, -1.06f)
            curveTo(40.28f, 12.157f, 39.899f, 12f, 39.5f, 12f)
            horizontalLineToRelative(-10f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6.379f)
            lineToRelative(-8.428f, 8.428f)
            lineToRelative(-4.442f, -4.038f)
            curveToRelative(-0.58f, -0.527f, -1.467f, -0.52f, -2.037f, 0.018f)
            lineToRelative(-8.5f, 8f)
            curveToRelative(-0.603f, 0.567f, -0.632f, 1.517f, -0.064f, 2.12f)
            curveToRelative(0.568f, 0.603f, 1.517f, 0.632f, 2.12f, 0.064f)
            lineToRelative(7.49f, -7.049f)
            lineToRelative(4.473f, 4.067f)
            curveToRelative(0.593f, 0.538f, 1.503f, 0.517f, 2.07f, -0.05f)
            lineTo(38f, 17.122f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF70777D),
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(38.625f, 8.25f),
                end = Offset(7.12083f, 55.1609f)
            )
        ) {
            moveTo(7.5f, 6f)
            curveTo(8.328f, 6f, 9f, 6.672f, 9f, 7.5f)
            verticalLineToRelative(28f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(28f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(41.328f, 42f, 40.5f, 42f)
            horizontalLineToRelative(-28f)
            curveTo(8.91f, 42f, 6f, 39.09f, 6f, 35.5f)
            verticalLineToRelative(-28f)
            curveTo(6f, 6.672f, 6.672f, 6f, 7.5f, 6f)
            close()
        }
    }.build()
}

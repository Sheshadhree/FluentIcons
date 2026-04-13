package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Bot24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Bot24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535356f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(0.311344f, 11.538f),
                radius = 22.2527f
            )
        ) {
            moveTo(17.753f, 14f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(0.905f)
            curveToRelative(0f, 1.094f, -0.477f, 2.133f, -1.307f, 2.845f)
            curveToRelative(-1.566f, 1.344f, -3.806f, 2.001f, -6.696f, 2.001f)
            curveToRelative(-2.89f, 0f, -5.128f, -0.657f, -6.691f, -2f)
            curveToRelative(-0.829f, -0.713f, -1.306f, -1.751f, -1.306f, -2.844f)
            verticalLineTo(16.25f)
            curveToRelative(0f, -1.243f, 1.008f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(12.0033f, 13.0474f),
                end = Offset(15.6234f, 26.5728f)
            )
        ) {
            moveTo(17.753f, 14f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(0.905f)
            curveToRelative(0f, 1.094f, -0.477f, 2.133f, -1.307f, 2.845f)
            curveToRelative(-1.566f, 1.344f, -3.806f, 2.001f, -6.696f, 2.001f)
            curveToRelative(-2.89f, 0f, -5.128f, -0.657f, -6.691f, -2f)
            curveToRelative(-0.829f, -0.713f, -1.306f, -1.751f, -1.306f, -2.844f)
            verticalLineTo(16.25f)
            curveToRelative(0f, -1.243f, 1.008f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(11.5f)
            close()
            moveTo(12f, 2.5f)
            lineToRelative(-0.102f, 0.007f)
            curveTo(11.532f, 2.557f, 11.25f, 2.87f, 11.25f, 3.25f)
            lineTo(11.243f, 5f)
            horizontalLineToRelative(1.5f)
            lineToRelative(0.007f, -1.75f)
            lineToRelative(-0.007f, -0.102f)
            curveTo(12.693f, 2.782f, 12.38f, 2.5f, 12f, 2.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF08AF4),
                    0.535356f to Color(0xFF9C6CFE),
                    1f to Color(0xFF4E44DB)
                ),
                center = Offset(1.8f, 0.571427f),
                radius = 19.9992f
            )
        ) {
            moveTo(18f, 6.25f)
            curveTo(18f, 5.007f, 16.993f, 4f, 15.75f, 4f)
            horizontalLineToRelative(-7.5f)
            curveTo(7.007f, 4f, 6f, 5.007f, 6f, 6.25f)
            verticalLineToRelative(3.5f)
            curveTo(6f, 10.993f, 7.007f, 12f, 8.25f, 12f)
            horizontalLineToRelative(7.5f)
            curveTo(16.993f, 12f, 18f, 10.993f, 18f, 9.75f)
            verticalLineToRelative(-3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFF9DCFA)
                ),
                start = Offset(13.5851f, 6.59611f),
                end = Offset(15.4791f, 9.86463f)
            )
        ) {
            moveTo(14.242f, 6.5f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.249f, 1.25f, 1.249f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.249f, -1.25f, -1.249f)
            close()
            moveToRelative(-4.492f, 0f)
            curveTo(9.06f, 6.5f, 8.5f, 7.06f, 8.5f, 7.75f)
            reflectiveCurveToRelative(0.56f, 1.249f, 1.25f, 1.249f)
            reflectiveCurveToRelative(1.249f, -0.56f, 1.249f, -1.25f)
            reflectiveCurveTo(10.439f, 6.5f, 9.749f, 6.5f)
            close()
        }
    }.build()
}

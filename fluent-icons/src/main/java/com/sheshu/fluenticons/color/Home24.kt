package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Home24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Home24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                start = Offset(12f, 13f),
                end = Offset(6.7067f, 21.8251f)
            )
        ) {
            moveTo(9f, 13f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(8f)
            horizontalLineTo(9f)
            verticalLineToRelative(-8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD394),
                    1f to Color(0xFFFFB357)
                ),
                start = Offset(4.71799f, 3.17161f),
                end = Offset(21.5682f, 17.6733f)
            )
        ) {
            moveTo(13.45f, 4.533f)
            curveToRelative(-0.837f, -0.707f, -2.063f, -0.707f, -2.9f, 0f)
            lineTo(3.8f, 10.228f)
            curveTo(3.291f, 10.655f, 3f, 11.284f, 3f, 11.948f)
            verticalLineToRelative(7.305f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineTo(9.5f)
            verticalLineTo(15.25f)
            curveToRelative(0f, -0.68f, 0.542f, -1.232f, 1.217f, -1.25f)
            horizontalLineToRelative(2.566f)
            curveToRelative(0.675f, 0.018f, 1.217f, 0.57f, 1.217f, 1.25f)
            verticalLineToRelative(5.753f)
            horizontalLineToRelative(4.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-7.306f)
            curveToRelative(0f, -0.662f, -0.292f, -1.292f, -0.8f, -1.72f)
            lineToRelative(-6.75f, -5.694f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(8.76835f, -0.375046f),
                end = Offset(13.1615f, 11.5055f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.804f, 2.299f)
            curveToRelative(-0.459f, -0.399f, -1.15f, -0.399f, -1.608f, 0f)
            lineToRelative(-8.789f, 7.63f)
            curveToRelative(-0.5f, 0.434f, -0.546f, 1.183f, -0.102f, 1.672f)
            curveToRelative(0.445f, 0.49f, 1.21f, 0.535f, 1.711f, 0.1f)
            lineTo(12f, 4.771f)
            lineToRelative(7.984f, 6.93f)
            curveToRelative(0.5f, 0.435f, 1.266f, 0.39f, 1.71f, -0.1f)
            curveToRelative(0.445f, -0.49f, 0.4f, -1.238f, -0.101f, -1.673f)
            lineToRelative(-8.789f, -7.63f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(8.76835f, -0.375046f),
                end = Offset(13.1615f, 11.5055f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.196f, 2.299f)
            curveToRelative(0.459f, -0.399f, 1.15f, -0.399f, 1.608f, 0f)
            lineToRelative(8.789f, 7.63f)
            curveToRelative(0.5f, 0.434f, 0.546f, 1.183f, 0.102f, 1.672f)
            curveToRelative(-0.445f, 0.49f, -1.21f, 0.535f, -1.711f, 0.1f)
            lineTo(12f, 4.771f)
            lineTo(4.016f, 11.7f)
            curveToRelative(-0.5f, 0.435f, -1.266f, 0.39f, -1.71f, -0.1f)
            curveToRelative(-0.445f, -0.49f, -0.4f, -1.238f, 0.101f, -1.673f)
            lineToRelative(8.789f, -7.63f)
            close()
        }
    }.build()
}

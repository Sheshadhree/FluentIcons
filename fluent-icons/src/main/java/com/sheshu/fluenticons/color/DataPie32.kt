package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataPie32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataPie32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6D37CD),
                    0.640625f to Color(0xFFEA71EF)
                ),
                start = Offset(25.9883f, 29f),
                end = Offset(-10.793f, -7.78126f)
            )
        ) {
            moveTo(15f, 7.012f)
            curveToRelative(0f, -0.274f, -0.112f, -0.535f, -0.31f, -0.724f)
            curveTo(14.493f, 6.1f, 14.226f, 6f, 13.953f, 6.013f)
            curveTo(7.855f, 6.299f, 3f, 11.332f, 3f, 17.5f)
            curveTo(3f, 23.851f, 8.149f, 29f, 14.5f, 29f)
            curveToRelative(6.168f, 0f, 11.201f, -4.855f, 11.487f, -10.953f)
            curveToRelative(0.013f, -0.273f, -0.086f, -0.54f, -0.275f, -0.737f)
            curveToRelative(-0.189f, -0.198f, -0.45f, -0.31f, -0.724f, -0.31f)
            horizontalLineTo(17.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineTo(7.012f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE23CB4),
                    1f to Color(0xFFEA71EF)
                ),
                start = Offset(27.9893f, 12.8022f),
                end = Offset(19.3977f, 3.01172f)
            )
        ) {
            moveTo(18.047f, 3.013f)
            curveTo(17.774f, 3f, 17.507f, 3.1f, 17.31f, 3.288f)
            curveTo(17.112f, 3.477f, 17f, 3.738f, 17f, 4.012f)
            verticalLineTo(14f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(9.988f)
            curveToRelative(0.274f, 0f, 0.535f, -0.112f, 0.724f, -0.31f)
            curveToRelative(0.189f, -0.197f, 0.288f, -0.464f, 0.275f, -0.737f)
            curveToRelative(-0.277f, -5.916f, -5.024f, -10.663f, -10.94f, -10.94f)
            close()
        }
    }.build()
}

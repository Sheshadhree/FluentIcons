package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Pin16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Pin16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.113865f to Color(0xFF7B7BFF),
                    0.559383f to Color(0xFF102784)
                ),
                start = Offset(3.13258f, 12.8671f),
                end = Offset(8.98616f, 8.20071f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.53f, 10.53f)
            lineToRelative(-3.25f, 3.25f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.292f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.25f, -3.25f)
            lineToRelative(1.06f, 1.06f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF1384B1)
                ),
                start = Offset(2.91007f, 4.15923f),
                end = Offset(10.8443f, 12.3923f)
            )
        ) {
            moveTo(10.059f, 2.445f)
            curveTo(9.347f, 1.731f, 8.147f, 1.908f, 7.673f, 2.798f)
            lineToRelative(-2.02f, 3.79f)
            lineToRelative(-2.811f, 0.938f)
            curveToRelative(-0.164f, 0.054f, -0.289f, 0.19f, -0.329f, 0.36f)
            curveToRelative(-0.04f, 0.168f, 0.01f, 0.345f, 0.134f, 0.468f)
            lineToRelative(5f, 5f)
            curveToRelative(0.122f, 0.122f, 0.3f, 0.173f, 0.468f, 0.133f)
            curveToRelative(0.168f, -0.04f, 0.304f, -0.165f, 0.36f, -0.329f)
            lineToRelative(0.936f, -2.811f)
            lineToRelative(3.779f, -2.023f)
            curveToRelative(0.886f, -0.474f, 1.064f, -1.669f, 0.354f, -2.381f)
            lineTo(10.06f, 2.445f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE362F8),
                    1f to Color(0x009966FF)
                ),
                center = Offset(11.3667f, 11.2297f),
                radius = 5.10742f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(10.059f, 2.445f)
            curveTo(9.347f, 1.731f, 8.147f, 1.908f, 7.673f, 2.798f)
            lineToRelative(-2.02f, 3.79f)
            lineToRelative(-2.811f, 0.938f)
            curveToRelative(-0.164f, 0.054f, -0.289f, 0.19f, -0.329f, 0.36f)
            curveToRelative(-0.04f, 0.168f, 0.01f, 0.345f, 0.134f, 0.468f)
            lineToRelative(5f, 5f)
            curveToRelative(0.122f, 0.122f, 0.3f, 0.173f, 0.468f, 0.133f)
            curveToRelative(0.168f, -0.04f, 0.304f, -0.165f, 0.36f, -0.329f)
            lineToRelative(0.936f, -2.811f)
            lineToRelative(3.779f, -2.023f)
            curveToRelative(0.886f, -0.474f, 1.064f, -1.669f, 0.354f, -2.381f)
            lineTo(10.06f, 2.445f)
            close()
        }
    }.build()
}

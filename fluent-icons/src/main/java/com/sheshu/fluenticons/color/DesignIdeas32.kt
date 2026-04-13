package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DesignIdeas32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DesignIdeas32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.221888f to Color(0xFF4E46E2),
                    0.577558f to Color(0xFF625DF6),
                    0.954926f to Color(0xFFE37DFF)
                ),
                center = Offset(6.67183f, 26.4025f),
                radius = 24.3503f
            )
        ) {
            moveTo(5f, 13f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 0f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.566147f to Color(0xFF251FBA),
                    1f to Color(0x005E51E4)
                ),
                center = Offset(2.63524f, 17.7265f),
                radius = 9.83002f
            ),
            fillAlpha = 0.6f
        ) {
            moveTo(5f, 13f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 0f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.566147f to Color(0xFF251FBA),
                    1f to Color(0x005E51E4)
                ),
                center = Offset(1.96249f, 11.0508f),
                radius = 9.04231f
            ),
            fillAlpha = 0.6f
        ) {
            moveTo(5f, 13f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 0f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFC354FF),
                    0.157798f to Color(0xFFB339F0),
                    0.429343f to Color(0xFFF24A9D),
                    0.748908f to Color(0xFFFF835C),
                    1f to Color(0xFFFFC470)
                ),
                center = Offset(15.1715f, 13.2142f),
                radius = 20.1004f
            )
        ) {
            moveTo(17.5f, 12f)
            horizontalLineToRelative(8f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 4.5f)
            verticalLineToRelative(8f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 4.5f)
            horizontalLineToRelative(-8f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, -4.5f)
            verticalLineToRelative(-8f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.194812f to Color(0xFF6D37CD),
                    0.764931f to Color(0xFFEA71EF)
                ),
                start = Offset(22.1007f, 21.913f),
                end = Offset(14.8339f, 11.2336f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14f, 22f)
            curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
            curveToRelative(0f, -0.338f, -0.019f, -0.672f, -0.055f, -1f)
            horizontalLineTo(17.5f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            verticalLineToRelative(5.445f)
            curveTo(13.328f, 21.981f, 13.662f, 22f, 14f, 22f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.194812f to Color(0xFF7631FF),
                    0.885651f to Color(0xFFE63080)
                ),
                start = Offset(23.6384f, 24.4241f),
                end = Offset(12.0502f, 8.22752f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14f, 22f)
            curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
            curveToRelative(0f, -0.338f, -0.019f, -0.672f, -0.055f, -1f)
            horizontalLineTo(17.5f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            verticalLineToRelative(5.445f)
            curveTo(13.328f, 21.981f, 13.662f, 22f, 14f, 22f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(0.125f, 18.8203f),
                end = Offset(8.8461f, 28.2949f)
            )
        ) {
            moveTo(10f, 18.627f)
            curveTo(10f, 26.098f, 7.875f, 30f, 6f, 30f)
            curveToRelative(-1.625f, 0f, -4f, -3.238f, -4f, -11.373f)
            curveToRelative(0f, -6.946f, 1.79f, -8.053f, 4f, -8.053f)
            curveToRelative(1.969f, 0f, 4f, 0.581f, 4f, 8.053f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(5.66667f, 9.35978f),
                radius = 19.3137f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(10f, 18.627f)
            curveTo(10f, 26.098f, 7.875f, 30f, 6f, 30f)
            curveToRelative(-1.625f, 0f, -4f, -3.238f, -4f, -11.373f)
            curveToRelative(0f, -6.946f, 1.79f, -8.053f, 4f, -8.053f)
            curveToRelative(1.969f, 0f, 4f, 0.581f, 4f, 8.053f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.307407f to Color(0xFF0D91E1),
                    0.760677f to Color(0xFF52B471)
                ),
                start = Offset(13f, 19.4721f),
                end = Offset(-0.999999f, 19.4721f)
            )
        ) {
            moveTo(10f, 18.627f)
            curveTo(10f, 26.098f, 7.875f, 30f, 6f, 30f)
            curveToRelative(-1.625f, 0f, -4f, -3.238f, -4f, -11.373f)
            curveToRelative(0f, -6.946f, 1.79f, -8.053f, 4f, -8.053f)
            curveToRelative(1.969f, 0f, 4f, 0.581f, 4f, 8.053f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.168605f to Color(0xFF02888D),
                    0.259941f to Color(0x0002888D)
                ),
                center = Offset(3.45968f, 10.3004f),
                radius = 9.85094f
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(10f, 18.627f)
            curveTo(10f, 26.098f, 7.875f, 30f, 6f, 30f)
            curveToRelative(-1.625f, 0f, -4f, -3.238f, -4f, -11.373f)
            curveToRelative(0f, -6.946f, 1.79f, -8.053f, 4f, -8.053f)
            curveToRelative(1.969f, 0f, 4f, 0.581f, 4f, 8.053f)
            close()
        }
        path(
            fill = SolidColor(Color.White),
            fillAlpha = 0.15f
        ) {
            moveTo(2.092f, 16.155f)
            curveToRelative(0.392f, -4.748f, 1.993f, -5.58f, 3.908f, -5.58f)
            curveToRelative(1.725f, 0f, 3.498f, 0.446f, 3.91f, 5.583f)
            curveToRelative(-1.107f, 0.684f, -2.455f, 1.086f, -3.908f, 1.086f)
            curveToRelative(-1.454f, 0f, -2.802f, -0.402f, -3.91f, -1.087f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF9532),
                    0.251092f to Color(0xFFFF835C),
                    1f to Color(0xFFF24A9D)
                ),
                center = Offset(7.69826f, 5.5938f),
                radius = 8.43491f
            )
        ) {
            moveTo(7.75f, 2.977f)
            curveTo(7.742f, 2.594f, 7.515f, 2.25f, 7.167f, 2.09f)
            curveToRelative(-0.35f, -0.16f, -0.759f, -0.105f, -1.054f, 0.14f)
            curveToRelative(-1.72f, 1.427f, -2.763f, 2.607f, -3.369f, 3.71f)
            curveTo(2.119f, 7.077f, 2f, 8.064f, 2f, 9f)
            curveToRelative(0f, 2.209f, 1.79f, 4f, 4f, 4f)
            curveToRelative(2.209f, 0f, 4f, -1.791f, 4f, -4f)
            curveToRelative(0f, -1.28f, -0.626f, -2.23f, -1.116f, -2.974f)
            lineTo(8.74f, 5.806f)
            curveTo(8.22f, 5f, 7.778f, 4.216f, 7.751f, 2.977f)
            close()
        }
    }.build()
}

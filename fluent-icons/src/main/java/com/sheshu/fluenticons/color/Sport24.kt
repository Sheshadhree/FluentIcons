package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Sport24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Sport24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    0.977705f to Color(0xFFFF921F)
                ),
                center = Offset(16.1542f, 26.3333f),
                radius = 27.9566f
            )
        ) {
            moveTo(6f, 10f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5875f to Color(0xFFAA1D2D),
                    0.93125f to Color(0x19EB4824)
                ),
                center = Offset(8f, 16f),
                radius = 9.42809f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(6f, 10f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.712577f to Color(0xFF8E250B),
                    0.90252f to Color(0x008E250B)
                ),
                start = Offset(20.0498f, 4.19379f),
                end = Offset(11.5765f, 12.6672f)
            ),
            fillAlpha = 0.6f,
            strokeAlpha = 0.6f
        ) {
            moveTo(9.468f, 3.407f)
            lineTo(14.5f, 8.439f)
            lineToRelative(0.761f, -0.761f)
            curveToRelative(-0.48f, -0.689f, -0.76f, -1.526f, -0.76f, -2.428f)
            curveToRelative(0f, -1.196f, 0.493f, -2.277f, 1.289f, -3.05f)
            curveToRelative(0.596f, 0.137f, 1.168f, 0.34f, 1.706f, 0.602f)
            curveTo(16.608f, 3.258f, 16f, 4.182f, 16f, 5.25f)
            curveToRelative(0f, 0.487f, 0.127f, 0.944f, 0.349f, 1.34f)
            lineToRelative(2.753f, -2.753f)
            curveToRelative(0.386f, 0.32f, 0.74f, 0.675f, 1.06f, 1.061f)
            lineTo(17.41f, 7.651f)
            curveTo(17.806f, 7.873f, 18.263f, 8f, 18.75f, 8f)
            curveToRelative(1.067f, 0f, 1.992f, -0.608f, 2.448f, -1.496f)
            curveToRelative(0.262f, 0.538f, 0.465f, 1.11f, 0.601f, 1.707f)
            curveTo(21.027f, 9.005f, 19.946f, 9.5f, 18.75f, 9.5f)
            curveToRelative(-0.903f, 0f, -1.74f, -0.282f, -2.428f, -0.761f)
            lineToRelative(-0.761f, 0.76f)
            lineToRelative(5.032f, 5.033f)
            curveToRelative(-0.286f, 0.415f, -0.61f, 0.802f, -0.966f, 1.155f)
            lineTo(14.5f, 10.56f)
            lineToRelative(-3.97f, 3.97f)
            lineToRelative(-1.06f, -1.06f)
            lineToRelative(3.97f, -3.97f)
            lineToRelative(-5.127f, -5.127f)
            curveToRelative(0.353f, -0.357f, 0.74f, -0.68f, 1.155f, -0.966f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.240266f to Color(0xFFAE5606),
                    1f to Color(0xFF944600)
                ),
                center = Offset(3.18182f, 9.59091f),
                radius = 16.9004f
            )
        ) {
            moveTo(4.25f, 9f)
            curveTo(3.007f, 9f, 2f, 10.007f, 2f, 11.25f)
            verticalLineToRelative(2f)
            curveTo(2f, 18.082f, 5.918f, 22f, 10.75f, 22f)
            horizontalLineToRelative(2f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-2f)
            curveTo(15f, 12.918f, 11.082f, 9f, 6.25f, 9f)
            horizontalLineToRelative(-2f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.625628f to Color(0x00FFA43D),
                    0.926787f to Color(0xFFFFA43D)
                ),
                center = Offset(6.74843f, 25.4406f),
                radius = 19.2374f
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(4.25f, 9f)
            curveTo(3.007f, 9f, 2f, 10.007f, 2f, 11.25f)
            verticalLineToRelative(2f)
            curveTo(2f, 18.082f, 5.918f, 22f, 10.75f, 22f)
            horizontalLineToRelative(2f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-2f)
            curveTo(15f, 12.918f, 11.082f, 9f, 6.25f, 9f)
            horizontalLineToRelative(-2f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFC470))) {
            moveTo(7.78f, 13.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2.5f, -2.5f)
            close()
        }
    }.build()
}

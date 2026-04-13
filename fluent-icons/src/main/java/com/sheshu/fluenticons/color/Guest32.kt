package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Guest32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Guest32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    0.217751f to Color(0xFF35DAF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-2.33333f, -4.12276f),
                end = Offset(25.8417f, 21.731f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(23.5f, 2f)
            curveTo(25.433f, 2f, 27f, 3.567f, 27f, 5.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 30f, 5f, 28.433f, 5f, 26.5f)
            verticalLineToRelative(-21f)
            curveTo(5f, 3.567f, 6.567f, 2f, 8.5f, 2f)
            horizontalLineToRelative(15f)
            close()
            moveTo(14f, 5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.549232f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(19.4048f, 5.4386f),
                end = Offset(27.8944f, 33.8762f)
            ),
            fillAlpha = 0.7f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(23.5f, 2f)
            curveTo(25.433f, 2f, 27f, 3.567f, 27f, 5.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 30f, 5f, 28.433f, 5f, 26.5f)
            verticalLineToRelative(-21f)
            curveTo(5f, 3.567f, 6.567f, 2f, 8.5f, 2f)
            horizontalLineToRelative(15f)
            close()
            moveTo(14f, 5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(25.7558f, 33f),
                end = Offset(18.6171f, 8.68672f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(12.09f, 20f)
            curveToRelative(-1.43f, 0f, -2.59f, 1.16f, -2.59f, 2.59f)
            curveToRelative(0f, 1.556f, 0.837f, 2.71f, 2.07f, 3.423f)
            curveTo(12.76f, 26.701f, 14.33f, 27f, 16f, 27f)
            reflectiveCurveToRelative(3.24f, -0.299f, 4.43f, -0.987f)
            curveToRelative(1.233f, -0.713f, 2.07f, -1.867f, 2.07f, -3.422f)
            curveTo(22.5f, 21.16f, 21.34f, 20f, 19.91f, 20f)
            horizontalLineToRelative(-7.82f)
            close()
            moveTo(12f, 15f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
        }
    }.build()
}

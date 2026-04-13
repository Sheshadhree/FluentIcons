package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Guest24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Guest24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    0.217751f to Color(0xFF35DAF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-1.33333f, -2.3744f),
                end = Offset(18.8239f, 16.4541f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(19.995f, 4.096f)
            curveTo(19.915f, 2.926f, 18.94f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.926f, 2.085f, 4f, 3.06f, 4f, 4.25f)
            verticalLineToRelative(15.505f)
            lineToRelative(0.005f, 0.154f)
            curveToRelative(0.08f, 1.17f, 1.054f, 2.096f, 2.245f, 2.096f)
            horizontalLineToRelative(11.5f)
            lineToRelative(0.154f, -0.006f)
            curveTo(19.074f, 21.92f, 20f, 20.946f, 20f, 19.755f)
            verticalLineTo(4.25f)
            lineToRelative(-0.005f, -0.154f)
            close()
            moveTo(10.75f, 5f)
            curveTo(10.336f, 5f, 10f, 5.336f, 10f, 5.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveTo(13.664f, 6.5f, 14f, 6.164f, 14f, 5.75f)
            reflectiveCurveTo(13.664f, 5f, 13.25f, 5f)
            horizontalLineToRelative(-2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.549232f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(14.4762f, 4.4567f),
                end = Offset(20.4518f, 24.8322f)
            ),
            fillAlpha = 0.7f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(19.995f, 4.096f)
            curveTo(19.915f, 2.926f, 18.94f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.926f, 2.085f, 4f, 3.06f, 4f, 4.25f)
            verticalLineToRelative(15.505f)
            lineToRelative(0.005f, 0.154f)
            curveToRelative(0.08f, 1.17f, 1.054f, 2.096f, 2.245f, 2.096f)
            horizontalLineToRelative(11.5f)
            lineToRelative(0.154f, -0.006f)
            curveTo(19.074f, 21.92f, 20f, 20.946f, 20f, 19.755f)
            verticalLineTo(4.25f)
            lineToRelative(-0.005f, -0.154f)
            close()
            moveTo(10.75f, 5f)
            curveTo(10.336f, 5f, 10f, 5.336f, 10f, 5.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveTo(13.664f, 6.5f, 14f, 6.164f, 14f, 5.75f)
            reflectiveCurveTo(13.664f, 5f, 13.25f, 5f)
            horizontalLineToRelative(-2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(18.0036f, 23.3595f),
                end = Offset(13.237f, 7.83158f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(14.75f, 14.996f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(0.499f)
            curveToRelative(0f, 1.846f, -1.472f, 2.754f, -4f, 2.754f)
            reflectiveCurveToRelative(-4f, -0.909f, -4f, -2.756f)
            verticalLineToRelative(-0.497f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(5.5f)
            close()
            moveToRelative(-2.75f, -6f)
            curveToRelative(1.38f, 0f, 2.5f, 1.119f, 2.5f, 2.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            curveToRelative(0f, -1.381f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
    }.build()
}

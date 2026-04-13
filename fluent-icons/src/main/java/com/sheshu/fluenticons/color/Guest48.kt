package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Guest48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Guest48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    0.217751f to Color(0xFF35DAF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-2.66667f, -4.7468f),
                end = Offset(37.6391f, 32.9108f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(35.75f, 4f)
            curveTo(38.097f, 4f, 40f, 5.903f, 40f, 8.25f)
            verticalLineToRelative(31.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(9.903f, 44f, 8f, 42.097f, 8f, 39.75f)
            verticalLineTo(8.25f)
            curveTo(8f, 5.903f, 9.903f, 4f, 12.25f, 4f)
            horizontalLineToRelative(23.5f)
            close()
            moveToRelative(-14.5f, 5f)
            curveTo(20.56f, 9f, 20f, 9.56f, 20f, 10.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(27.44f, 9f, 26.75f, 9f)
            horizontalLineToRelative(-5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.549232f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(28.9524f, 8.91228f),
                end = Offset(40.8985f, 49.6554f)
            ),
            fillAlpha = 0.7f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(35.75f, 4f)
            curveTo(38.097f, 4f, 40f, 5.903f, 40f, 8.25f)
            verticalLineToRelative(31.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(9.903f, 44f, 8f, 42.097f, 8f, 39.75f)
            verticalLineTo(8.25f)
            curveTo(8f, 5.903f, 9.903f, 4f, 12.25f, 4f)
            horizontalLineToRelative(23.5f)
            close()
            moveToRelative(-14.5f, 5f)
            curveTo(20.56f, 9f, 20f, 9.56f, 20f, 10.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(27.44f, 9f, 26.75f, 9f)
            horizontalLineToRelative(-5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color.White
                ),
                start = Offset(39.0089f, 48.4286f),
                end = Offset(27.5898f, 10.3529f)
            ),
            fillAlpha = 0.9f
        ) {
            moveTo(17.8f, 28f)
            curveToRelative(-2.099f, 0f, -3.8f, 1.701f, -3.8f, 3.8f)
            curveToRelative(0f, 2.407f, 1.198f, 4.27f, 3.074f, 5.475f)
            curveTo(18.902f, 38.451f, 21.35f, 39f, 24f, 39f)
            curveToRelative(2.65f, 0f, 5.098f, -0.55f, 6.926f, -1.725f)
            curveTo(32.802f, 36.07f, 34f, 34.207f, 34f, 31.8f)
            curveToRelative(0f, -2.099f, -1.701f, -3.8f, -3.8f, -3.8f)
            horizontalLineTo(17.8f)
            close()
            moveToRelative(0.7f, -7.5f)
            curveToRelative(0f, -3.038f, 2.462f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveTo(27.038f, 26f, 24f, 26f)
            reflectiveCurveToRelative(-5.5f, -2.462f, -5.5f, -5.5f)
            close()
        }
    }.build()
}

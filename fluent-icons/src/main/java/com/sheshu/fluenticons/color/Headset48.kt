package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headset48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headset48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9CA5AD),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(15.8333f, 38.7083f),
                end = Offset(12.9927f, 30.9774f)
            )
        ) {
            moveTo(11.25f, 31f)
            lineTo(10f, 32f)
            curveToRelative(0f, 4.556f, 3.694f, 8.25f, 8.25f, 8.25f)
            horizontalLineTo(20f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(-1.75f)
            curveToRelative(-3.176f, 0f, -5.75f, -2.574f, -5.75f, -5.75f)
            lineToRelative(-1.25f, -1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF383B3D),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(27.75f, 42.75f),
                end = Offset(19.2792f, 37.8016f)
            )
        ) {
            moveTo(29f, 39f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            close()
            moveTo(12.5f, 18f)
            curveToRelative(0f, -6.351f, 5.149f, -11.5f, 11.5f, -11.5f)
            reflectiveCurveTo(35.5f, 11.649f, 35.5f, 18f)
            verticalLineToRelative(2f)
            lineToRelative(1f, 1.5f)
            lineTo(38f, 20f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -7.732f, -6.268f, -14f, -14f, -14f)
            reflectiveCurveToRelative(-14f, 6.268f, -14f, 14f)
            verticalLineToRelative(2f)
            lineToRelative(1.5f, 1.5f)
            lineToRelative(1f, -1.5f)
            verticalLineToRelative(-2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(24f, 20f),
                end = Offset(24f, 32f)
            )
        ) {
            moveTo(12.5f, 20f)
            horizontalLineToRelative(5.25f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(12.5f)
            lineTo(11f, 26f)
            lineToRelative(1.5f, -6f)
            close()
            moveToRelative(23f, 11.624f)
            lineToRelative(1.5f, -5.812f)
            lineTo(35.5f, 20f)
            horizontalLineToRelative(-5.25f)
            curveTo(29.007f, 20f, 28f, 21.007f, 28f, 22.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.624f, 0f, 1.216f, -0.134f, 1.75f, -0.376f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(24f, 20f),
                end = Offset(23.7178f, 31.9934f)
            )
        ) {
            moveTo(12.5f, 20f)
            horizontalLineTo(10f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(20f)
            close()
            moveToRelative(23f, 11.624f)
            curveToRelative(1.474f, -0.667f, 2.5f, -2.15f, 2.5f, -3.874f)
            verticalLineTo(20f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(11.624f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Home20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Home20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                start = Offset(10f, 11f),
                end = Offset(6.63275f, 18.4852f)
            )
        ) {
            moveTo(7f, 11f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(6f)
            horizontalLineTo(7f)
            verticalLineToRelative(-6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD394),
                    1f to Color(0xFFFFB357)
                ),
                start = Offset(4.33621f, 2.31537f),
                end = Offset(18.0736f, 13.4811f)
            )
        ) {
            moveTo(11.002f, 3.384f)
            curveToRelative(-0.57f, -0.512f, -1.434f, -0.512f, -2.005f, 0f)
            lineToRelative(-5.5f, 4.942f)
            curveTo(3.182f, 8.61f, 3f, 9.016f, 3f, 9.44f)
            verticalLineToRelative(6.055f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineTo(6f)
            verticalLineTo(17f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-5.504f)
            curveToRelative(0f, -0.277f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.223f, 0.5f, 0.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-0.004f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(9.44f)
            curveToRelative(0f, -0.425f, -0.18f, -0.83f, -0.497f, -1.115f)
            lineToRelative(-5.5f, -4.942f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(7.41468f, 0.0999635f),
                end = Offset(10.9292f, 9.60436f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.643f, 2.239f)
            curveToRelative(-0.367f, -0.319f, -0.92f, -0.319f, -1.287f, 0f)
            lineToRelative(-7.03f, 6.103f)
            curveToRelative(-0.4f, 0.348f, -0.437f, 0.947f, -0.082f, 1.34f)
            curveToRelative(0.356f, 0.39f, 0.968f, 0.427f, 1.369f, 0.079f)
            lineTo(10f, 4.216f)
            lineToRelative(6.387f, 5.545f)
            curveToRelative(0.4f, 0.348f, 1.013f, 0.312f, 1.369f, -0.08f)
            curveToRelative(0.355f, -0.392f, 0.319f, -0.99f, -0.082f, -1.338f)
            lineToRelative(-7.03f, -6.104f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(7.41468f, 0.0999635f),
                end = Offset(10.9292f, 9.60436f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.357f, 2.239f)
            curveToRelative(0.367f, -0.319f, 0.92f, -0.319f, 1.287f, 0f)
            lineToRelative(7.03f, 6.103f)
            curveToRelative(0.4f, 0.348f, 0.437f, 0.947f, 0.082f, 1.34f)
            curveToRelative(-0.356f, 0.39f, -0.968f, 0.427f, -1.369f, 0.079f)
            lineTo(10f, 4.216f)
            lineTo(3.613f, 9.761f)
            curveToRelative(-0.4f, 0.348f, -1.013f, 0.312f, -1.369f, -0.08f)
            curveTo(1.89f, 9.29f, 1.925f, 8.691f, 2.326f, 8.343f)
            lineToRelative(7.03f, -6.104f)
            close()
        }
    }.build()
}

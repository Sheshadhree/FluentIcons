package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Home28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Home28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                start = Offset(14f, 15f),
                end = Offset(7.5916f, 26.3965f)
            )
        ) {
            moveTo(10f, 15f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(-8f)
            verticalLineTo(15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD394),
                    1f to Color(0xFFFFB357)
                ),
                start = Offset(5.90887f, 2.97612f),
                end = Offset(26.2853f, 18.7516f)
            )
        ) {
            moveTo(15.408f, 4.498f)
            curveToRelative(-0.823f, -0.66f, -1.993f, -0.66f, -2.816f, 0f)
            lineToRelative(-7.75f, 6.217f)
            curveTo(4.31f, 11.142f, 4f, 11.787f, 4f, 12.47f)
            verticalLineToRelative(10.28f)
            curveTo(4f, 23.993f, 5.007f, 25f, 6.25f, 25f)
            horizontalLineTo(11f)
            verticalLineToRelative(-7.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineTo(25f)
            horizontalLineToRelative(4.75f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(12.47f)
            curveToRelative(0f, -0.683f, -0.31f, -1.328f, -0.842f, -1.755f)
            lineToRelative(-7.75f, -6.217f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(10.2028f, 0.421474f),
                end = Offset(14.6886f, 13.5508f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14f, 5.715f)
            lineToRelative(-9.713f, 7.863f)
            curveToRelative(-0.537f, 0.435f, -1.324f, 0.352f, -1.759f, -0.185f)
            curveToRelative(-0.434f, -0.536f, -0.351f, -1.324f, 0.185f, -1.758f)
            lineTo(12.9f, 3.39f)
            curveToRelative(0.642f, -0.52f, 1.56f, -0.52f, 2.202f, 0f)
            lineToRelative(10.185f, 8.245f)
            curveToRelative(0.537f, 0.434f, 0.62f, 1.222f, 0.185f, 1.758f)
            curveToRelative(-0.434f, 0.537f, -1.221f, 0.62f, -1.758f, 0.185f)
            lineTo(14f, 5.715f)
            close()
        }
    }.build()
}

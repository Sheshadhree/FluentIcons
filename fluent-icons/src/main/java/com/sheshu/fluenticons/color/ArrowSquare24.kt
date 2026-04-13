package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ArrowSquare24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ArrowSquare24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.64286f, 6.375f),
                end = Offset(17.7857f, 17.625f)
            )
        ) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(9.07626f, 7.76938f),
                end = Offset(16.75f, 25.2721f)
            )
        ) {
            moveTo(16.53f, 11.72f)
            lineToRelative(-0.084f, -0.072f)
            curveToRelative(-0.293f, -0.218f, -0.71f, -0.194f, -0.976f, 0.072f)
            lineToRelative(-2.72f, 2.72f)
            verticalLineTo(7.75f)
            lineToRelative(-0.007f, -0.102f)
            curveTo(12.693f, 7.282f, 12.38f, 7f, 12f, 7f)
            lineToRelative(-0.102f, 0.007f)
            curveTo(11.532f, 7.057f, 11.25f, 7.37f, 11.25f, 7.75f)
            verticalLineToRelative(6.692f)
            lineTo(8.53f, 11.72f)
            lineToRelative(-0.085f, -0.073f)
            curveToRelative(-0.293f, -0.218f, -0.71f, -0.194f, -0.976f, 0.073f)
            curveToRelative(-0.293f, 0.292f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(4f, 4.002f)
            lineToRelative(0.084f, 0.072f)
            curveToRelative(0.293f, 0.218f, 0.71f, 0.194f, 0.976f, -0.072f)
            lineToRelative(4.001f, -4f)
            lineToRelative(0.073f, -0.085f)
            curveToRelative(0.218f, -0.294f, 0.194f, -0.71f, -0.073f, -0.977f)
            close()
        }
    }.build()
}

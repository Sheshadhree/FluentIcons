package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Library20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Library20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(7.52047f, 4.99365f),
                end = Offset(9.5042f, 22.3506f)
            )
        ) {
            moveTo(2f, 3.498f)
            curveTo(2f, 2.67f, 2.671f, 2f, 3.5f, 2f)
            horizontalLineToRelative(1f)
            curveToRelative(0.827f, 0f, 1.499f, 0.67f, 1.499f, 1.498f)
            verticalLineToRelative(12.981f)
            curveToRelative(0f, 0.828f, -0.672f, 1.498f, -1.5f, 1.498f)
            horizontalLineToRelative(-1f)
            curveTo(2.671f, 17.977f, 2f, 17.307f, 2f, 16.48f)
            verticalLineTo(3.498f)
            close()
            moveToRelative(5f, 0f)
            curveTo(7f, 2.67f, 7.671f, 2f, 8.5f, 2f)
            horizontalLineToRelative(1f)
            curveToRelative(0.827f, 0f, 1.499f, 0.67f, 1.499f, 1.498f)
            verticalLineToRelative(12.981f)
            curveToRelative(0f, 0.828f, -0.672f, 1.498f, -1.5f, 1.498f)
            horizontalLineToRelative(-1f)
            curveTo(7.671f, 17.977f, 7f, 17.307f, 7f, 16.48f)
            verticalLineTo(3.498f)
            close()
            moveToRelative(8.718f, 2.659f)
            curveToRelative(-0.192f, -0.835f, -1.045f, -1.34f, -1.87f, -1.106f)
            lineToRelative(-0.745f, 0.21f)
            curveToRelative(-0.755f, 0.214f, -1.218f, 0.973f, -1.06f, 1.741f)
            lineToRelative(2.003f, 9.8f)
            curveToRelative(0.171f, 0.837f, 1.01f, 1.362f, 1.839f, 1.151f)
            lineToRelative(0.985f, -0.25f)
            curveToRelative(0.79f, -0.2f, 1.274f, -0.994f, 1.092f, -1.787f)
            lineToRelative(-2.244f, -9.76f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(7f, 4.08887f),
                end = Offset(11f, 6.5f)
            )
        ) {
            moveTo(6f, 7f)
            horizontalLineTo(2f)
            verticalLineTo(5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(6.32f, 1.357f)
            lineToRelative(3.729f, -0.761f)
            lineToRelative(0.45f, 1.954f)
            lineToRelative(-3.78f, 0.76f)
            lineToRelative(-0.4f, -1.953f)
            close()
            moveTo(7f, 7f)
            horizontalLineToRelative(4f)
            verticalLineTo(5f)
            horizontalLineTo(7f)
            verticalLineToRelative(2f)
            close()
        }
    }.build()
}

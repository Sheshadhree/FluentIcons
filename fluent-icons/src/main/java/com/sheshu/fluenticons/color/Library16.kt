package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Library16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Library16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4.46843f, 3.99365f),
                end = Offset(5.64311f, 17.4191f)
            )
        ) {
            moveTo(1f, 3.25f)
            curveTo(1f, 2.56f, 1.56f, 2f, 2.249f, 2f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.69f, 0f, 1.248f, 0.56f, 1.248f, 1.25f)
            verticalLineToRelative(9.495f)
            curveToRelative(0f, 0.69f, -0.559f, 1.25f, -1.248f, 1.25f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.69f, 0f, -1.249f, -0.56f, -1.249f, -1.25f)
            verticalLineTo(3.249f)
            close()
            moveToRelative(3.997f, 0f)
            curveTo(4.997f, 2.56f, 5.556f, 2f, 6.246f, 2f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.689f, 0f, 1.248f, 0.56f, 1.248f, 1.25f)
            verticalLineToRelative(9.495f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.249f, 1.25f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.69f, 0f, -1.248f, -0.56f, -1.248f, -1.25f)
            verticalLineTo(3.249f)
            close()
            moveToRelative(6.975f, 1.527f)
            curveToRelative(-0.249f, -0.62f, -0.941f, -0.933f, -1.571f, -0.713f)
            lineTo(9.819f, 4.268f)
            curveTo(9.146f, 4.503f, 8.807f, 5.252f, 9.073f, 5.913f)
            lineToRelative(2.937f, 7.304f)
            curveToRelative(0.249f, 0.62f, 0.94f, 0.933f, 1.571f, 0.713f)
            lineToRelative(0.582f, -0.204f)
            curveToRelative(0.672f, -0.236f, 1.012f, -0.985f, 0.746f, -1.646f)
            lineToRelative(-2.937f, -7.303f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(5f, 0.177734f),
                end = Offset(8.89122f, 1.05732f)
            )
        ) {
            moveTo(1f, 4f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            horizontalLineTo(1f)
            verticalLineTo(4f)
            close()
            moveToRelative(11.31f, 1.619f)
            lineTo(9.425f, 6.787f)
            lineToRelative(0.742f, 1.846f)
            lineToRelative(2.889f, -1.165f)
            lineToRelative(-0.744f, -1.85f)
            close()
            moveTo(8f, 4f)
            horizontalLineTo(5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            verticalLineTo(4f)
            close()
        }
    }.build()
}

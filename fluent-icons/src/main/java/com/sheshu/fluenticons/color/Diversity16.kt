package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Diversity16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Diversity16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(5.51724f, 5.94935f),
                end = Offset(13.6241f, 14.3393f)
            )
        ) {
            moveTo(12.495f, 8.831f)
            curveToRelative(-0.31f, -0.178f, -0.69f, -0.178f, -1f, 0f)
            lineToRelative(-1.99f, 1.15f)
            curveToRelative(-0.309f, 0.178f, -0.5f, 0.508f, -0.5f, 0.865f)
            verticalLineToRelative(2.298f)
            curveToRelative(0f, 0.357f, 0.191f, 0.687f, 0.5f, 0.866f)
            lineToRelative(1.99f, 1.149f)
            curveToRelative(0.31f, 0.178f, 0.69f, 0.178f, 1f, 0f)
            lineToRelative(1.99f, -1.15f)
            curveToRelative(0.31f, -0.178f, 0.5f, -0.508f, 0.5f, -0.865f)
            verticalLineToRelative(-2.298f)
            curveToRelative(0f, -0.357f, -0.19f, -0.687f, -0.5f, -0.866f)
            lineToRelative(-1.99f, -1.149f)
            close()
            moveTo(4f, 9f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(6.5f, -8f)
            curveTo(9.672f, 1f, 9f, 1.672f, 9f, 2.5f)
            verticalLineToRelative(3f)
            curveTo(9f, 6.328f, 9.672f, 7f, 10.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(14.328f, 7f, 15f, 6.328f, 15f, 5.5f)
            verticalLineToRelative(-3f)
            curveTo(15f, 1.672f, 14.328f, 1f, 13.5f, 1f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(2.913f, 1.674f)
            curveToRelative(0.452f, -0.899f, 1.722f, -0.899f, 2.174f, 0f)
            lineToRelative(1.78f, 3.537f)
            curveTo(7.277f, 6.03f, 6.688f, 7f, 5.778f, 7f)
            horizontalLineTo(2.22f)
            curveToRelative(-0.91f, 0f, -1.5f, -0.97f, -1.087f, -1.79f)
            lineToRelative(1.779f, -3.536f)
            close()
        }
    }.build()
}

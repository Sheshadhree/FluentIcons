package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Diversity20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Diversity20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(7.51724f, 7.94935f),
                end = Offset(15.6241f, 16.3393f)
            )
        ) {
            moveTo(14.495f, 10.831f)
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
            moveTo(6f, 11f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(6.5f, -8f)
            curveTo(11.672f, 3f, 11f, 3.672f, 11f, 4.5f)
            verticalLineToRelative(3f)
            curveTo(11f, 8.328f, 11.672f, 9f, 12.5f, 9f)
            horizontalLineToRelative(3f)
            curveTo(16.328f, 9f, 17f, 8.328f, 17f, 7.5f)
            verticalLineToRelative(-3f)
            curveTo(17f, 3.672f, 16.328f, 3f, 15.5f, 3f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(4.913f, 3.674f)
            curveToRelative(0.452f, -0.899f, 1.722f, -0.899f, 2.174f, 0f)
            lineToRelative(1.78f, 3.537f)
            curveTo(9.277f, 8.03f, 8.688f, 9f, 7.778f, 9f)
            horizontalLineTo(4.22f)
            curveToRelative(-0.91f, 0f, -1.5f, -0.97f, -1.087f, -1.79f)
            lineToRelative(1.779f, -3.536f)
            close()
        }
    }.build()
}

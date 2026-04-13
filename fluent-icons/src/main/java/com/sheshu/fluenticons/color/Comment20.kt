package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Comment20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Comment20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFAB500),
                    0.535356f to Color(0xFFFE8401),
                    1f to Color(0xFFFB5937)
                ),
                center = Offset(-1.69231f, -1.61538f),
                radius = 28.5343f
            )
        ) {
            moveTo(6.799f, 17.803f)
            curveToRelative(-0.442f, 0.327f, -1.069f, 0.238f, -1.4f, -0.199f)
            curveToRelative(-0.13f, -0.17f, -0.199f, -0.378f, -0.199f, -0.59f)
            verticalLineToRelative(-2.172f)
            horizontalLineTo(4.6f)
            curveToRelative(-1.436f, 0f, -2.6f, -1.149f, -2.6f, -2.566f)
            verticalLineToRelative(-6.71f)
            curveTo(2f, 4.149f, 3.164f, 3f, 4.6f, 3f)
            horizontalLineToRelative(10.8f)
            curveTo(16.836f, 3f, 18f, 4.149f, 18f, 5.566f)
            verticalLineToRelative(6.71f)
            curveToRelative(0f, 1.418f, -1.164f, 2.566f, -2.6f, 2.566f)
            horizontalLineToRelative(-4.59f)
            lineToRelative(-4.011f, 2.961f)
            close()
        }
    }.build()
}

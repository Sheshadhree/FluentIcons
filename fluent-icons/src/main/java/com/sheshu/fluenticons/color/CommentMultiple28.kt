package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CommentMultiple28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CommentMultiple28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color(0xFFCD3E1D))) {
            moveTo(4.5f, 6.75f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(12f)
            curveToRelative(3.176f, 0f, 5.75f, 2.574f, 5.75f, 5.75f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(9f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFAB500),
                    0.535356f to Color(0xFFFE8401),
                    1f to Color(0xFFFB5937)
                ),
                center = Offset(-2.84616f, -0.153843f),
                radius = 37.7779f
            )
        ) {
            moveTo(6.69f, 25.87f)
            curveTo(6.87f, 25.96f, 7.06f, 26f, 7.25f, 26f)
            horizontalLineToRelative(0.01f)
            curveToRelative(0.26f, 0f, 0.52f, -0.08f, 0.74f, -0.25f)
            lineTo(13.04f, 22f)
            horizontalLineToRelative(6.71f)
            curveToRelative(1.79f, 0f, 3.25f, -1.46f, 3.25f, -3.25f)
            verticalLineToRelative(-9.5f)
            curveTo(23f, 7.46f, 21.54f, 6f, 19.75f, 6f)
            horizontalLineTo(5.25f)
            curveTo(3.46f, 6f, 2f, 7.46f, 2f, 9.25f)
            verticalLineToRelative(9.5f)
            curveTo(2f, 20.54f, 3.46f, 22f, 5.25f, 22f)
            horizontalLineTo(6f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 0.48f, 0.26f, 0.91f, 0.69f, 1.12f)
            close()
        }
    }.build()
}

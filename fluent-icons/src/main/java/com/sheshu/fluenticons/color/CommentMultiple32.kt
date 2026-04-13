package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CommentMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CommentMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color(0xFFCD3E1D))) {
            moveTo(6.5f, 8f)
            curveToRelative(0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(10.5f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            verticalLineTo(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(11f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            verticalLineTo(8f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFAB500),
                    0.535356f to Color(0xFFFE8401),
                    1f to Color(0xFFFB5937)
                ),
                center = Offset(-2.30769f, -0.0762594f),
                radius = 42.5349f
            )
        ) {
            moveTo(3f, 11.5f)
            curveTo(3f, 9.015f, 5.015f, 7f, 7.5f, 7f)
            horizontalLineToRelative(14f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-4.89f)
            lineToRelative(-6.205f, 4.692f)
            curveTo(9.416f, 30.439f, 8f, 29.734f, 8f, 28.495f)
            verticalLineTo(25f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 25f, 3f, 22.985f, 3f, 20.5f)
            verticalLineToRelative(-9f)
            close()
        }
    }.build()
}

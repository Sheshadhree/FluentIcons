package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CommentMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CommentMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFFCD3E1D))) {
            moveTo(4.5f, 6.75f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(8f)
            curveToRelative(3.176f, 0f, 5.75f, 2.574f, 5.75f, 5.75f)
            verticalLineToRelative(4f)
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
                center = Offset(-1.92308f, 1.07563f),
                radius = 30.3872f
            )
        ) {
            moveTo(2f, 9.25f)
            curveTo(2f, 7.455f, 3.455f, 6f, 5.25f, 6f)
            horizontalLineToRelative(10.5f)
            curveTo(17.545f, 6f, 19f, 7.455f, 19f, 9.25f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-5.002f)
            lineTo(6.99f, 21.76f)
            curveTo(6.164f, 22.366f, 5f, 21.775f, 5f, 20.752f)
            verticalLineToRelative(-1.761f)
            curveToRelative(-1.678f, -0.128f, -3f, -1.53f, -3f, -3.241f)
            verticalLineToRelative(-6.5f)
            close()
        }
    }.build()
}

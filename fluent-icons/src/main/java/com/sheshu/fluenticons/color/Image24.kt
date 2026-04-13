package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Image24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Image24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFF0FAFFF),
                    0.529425f to Color(0xFF367AF2)
                ),
                center = Offset(-4.07143f, -7.125f),
                radius = 49.7729f
            )
        ) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(9.56733f, 12.0032f),
                end = Offset(11.5942f, 21.4772f)
            )
        ) {
            moveTo(20.515f, 19.46f)
            curveTo(19.942f, 20.383f, 18.918f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.168f, 0f, -2.192f, -0.616f, -2.765f, -1.54f)
            lineToRelative(6.939f, -6.813f)
            lineToRelative(0.135f, -0.122f)
            curveToRelative(0.835f, -0.698f, 2.056f, -0.696f, 2.889f, 0.006f)
            lineToRelative(0.128f, 0.117f)
            lineToRelative(6.939f, 6.811f)
            close()
            moveTo(16f, 6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            close()
        }
    }.build()
}

package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Lightbulb48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Lightbulb48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.376456f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(14.8928f, 15.142f),
                radius = 28.9188f
            )
        ) {
            moveTo(31.265f, 37f)
            lineToRelative(-0.88f, 3.43f)
            curveToRelative(-0.538f, 2.1f, -2.432f, 3.57f, -4.6f, 3.57f)
            horizontalLineToRelative(-3.57f)
            curveToRelative(-2.168f, 0f, -4.061f, -1.47f, -4.6f, -3.57f)
            lineTo(16.735f, 37f)
            horizontalLineToRelative(14.53f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD34719),
                    1f to Color(0x00D34719)
                ),
                start = Offset(23.9991f, 37f),
                end = Offset(23.9996f, 44f)
            )
        ) {
            moveTo(31.265f, 37f)
            lineToRelative(-0.88f, 3.43f)
            curveToRelative(-0.538f, 2.1f, -2.432f, 3.57f, -4.6f, 3.57f)
            horizontalLineToRelative(-3.57f)
            curveToRelative(-2.168f, 0f, -4.061f, -1.47f, -4.6f, -3.57f)
            lineTo(16.735f, 37f)
            horizontalLineToRelative(14.53f)
            close()
            moveTo(24f, 4f)
            curveTo(15.992f, 4f, 9.5f, 10.492f, 9.5f, 18.5f)
            curveToRelative(0f, 4.235f, 1.817f, 8.047f, 4.71f, 10.696f)
            curveToRelative(0.448f, 0.41f, 0.748f, 0.873f, 0.87f, 1.349f)
            lineTo(16.479f, 36f)
            horizontalLineTo(31.52f)
            lineToRelative(1.399f, -5.455f)
            curveToRelative(0.122f, -0.476f, 0.422f, -0.938f, 0.87f, -1.35f)
            curveToRelative(2.893f, -2.648f, 4.71f, -6.46f, 4.71f, -10.695f)
            curveTo(38.5f, 10.492f, 32.008f, 4f, 24f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC7A3),
                    1f to Color(0xFFFF9C70)
                ),
                start = Offset(22.7899f, 36.493f),
                end = Offset(24.7881f, 41.3862f)
            )
        ) {
            moveTo(31.65f, 35.5f)
            horizontalLineToRelative(-15.3f)
            lineToRelative(0.642f, 2.5f)
            horizontalLineToRelative(14.016f)
            lineToRelative(0.641f, -2.5f)
            close()
        }
    }.build()
}

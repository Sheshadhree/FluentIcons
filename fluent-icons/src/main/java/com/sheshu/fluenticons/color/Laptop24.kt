package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Laptop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Laptop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(22f, 18.9122f),
                end = Offset(20.7655f, 12.2542f)
            )
        ) {
            moveTo(6.254f, 16f)
            lineTo(12f, 15.469f)
            lineTo(17.754f, 16f)
            horizontalLineToRelative(0.065f)
            curveToRelative(0.12f, 0f, 0.239f, 0.022f, 0.35f, 0.064f)
            lineToRelative(3.126f, 1.172f)
            curveToRelative(0.423f, 0.158f, 0.704f, 0.562f, 0.705f, 1.014f)
            horizontalLineTo(2f)
            curveToRelative(0f, -0.451f, 0.28f, -0.855f, 0.702f, -1.013f)
            lineToRelative(3.128f, -1.173f)
            curveTo(5.942f, 16.022f, 6.061f, 16f, 6.181f, 16f)
            horizontalLineToRelative(0.073f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFFAAB3BD)
                ),
                start = Offset(22f, 18.8929f),
                end = Offset(21.7922f, 16.1227f)
            )
        ) {
            moveTo(2.75f, 17.5f)
            curveTo(2.336f, 17.5f, 2f, 17.836f, 2f, 18.25f)
            reflectiveCurveTo(2.336f, 19f, 2.75f, 19f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(2.75f)
            close()
            moveTo(4f, 6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            horizontalLineToRelative(11.5f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 16f, 4f, 14.993f, 4f, 13.75f)
            verticalLineToRelative(-7.5f)
            close()
        }
    }.build()
}

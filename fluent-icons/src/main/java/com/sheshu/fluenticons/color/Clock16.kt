package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Clock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Clock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4f, 1.33333f),
                end = Offset(10f, 14.6667f)
            )
        ) {
            moveTo(8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(7.26383f, 5.61224f),
                end = Offset(6.23084f, 8.79709f)
            )
        ) {
            moveTo(7.502f, 5f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.491f, 0.41f)
            lineTo(8.001f, 5.5f)
            verticalLineTo(8f)
            horizontalLineTo(9.5f)
            curveTo(9.776f, 8f, 10f, 8.224f, 10f, 8.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(9.5f, 9f)
            horizontalLineTo(7.502f)
            curveTo(7.255f, 9f, 7.051f, 8.823f, 7.01f, 8.59f)
            lineTo(7.002f, 8.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, 0.223f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}

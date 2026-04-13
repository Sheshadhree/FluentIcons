package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Laptop32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Laptop32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(29.9129f, 27.0714f),
                end = Offset(27.6169f, 16.4236f)
            )
        ) {
            moveTo(7.5f, 22f)
            lineToRelative(8.5f, -0.5f)
            lineToRelative(8.5f, 0.5f)
            horizontalLineToRelative(0.307f)
            curveToRelative(0.128f, 0f, 0.254f, 0.024f, 0.372f, 0.072f)
            lineToRelative(3.893f, 1.557f)
            curveTo(29.631f, 23.853f, 30f, 24.396f, 30f, 25f)
            horizontalLineTo(2f)
            curveToRelative(0f, -0.604f, 0.368f, -1.147f, 0.929f, -1.371f)
            lineTo(6.82f, 22.07f)
            curveTo(6.94f, 22.024f, 7.065f, 22f, 7.193f, 22f)
            horizontalLineTo(7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFFAAB3BD)
                ),
                start = Offset(30f, 25.8571f),
                end = Offset(29.736f, 22.1617f)
            )
        ) {
            moveTo(3f, 24f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(26f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            close()
            moveTo(4f, 9.25f)
            curveTo(4f, 7.455f, 5.455f, 6f, 7.25f, 6f)
            horizontalLineToRelative(17.5f)
            curveTo(26.545f, 6f, 28f, 7.455f, 28f, 9.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineToRelative(-9.5f)
            close()
        }
    }.build()
}

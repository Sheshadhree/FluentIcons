package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Warning32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Warning32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401)
                ),
                start = Offset(6.37667f, -2.06137f),
                end = Offset(22.7067f, 31.4333f)
            )
        ) {
            moveTo(12.937f, 3.809f)
            curveToRelative(1.33f, -2.41f, 4.796f, -2.41f, 6.127f, 0f)
            lineToRelative(10.494f, 18.999f)
            curveTo(30.846f, 25.14f, 29.158f, 28f, 26.494f, 28f)
            horizontalLineTo(5.507f)
            curveToRelative(-2.665f, 0f, -4.352f, -2.86f, -3.064f, -5.192f)
            lineToRelative(10.494f, -19f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF212121)
                ),
                start = Offset(12.6664f, 9f),
                end = Offset(20.0707f, 22.8559f)
            )
        ) {
            moveTo(17.25f, 22f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveTo(16f, 9f)
            curveToRelative(-0.553f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.447f, 1f, 1f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}

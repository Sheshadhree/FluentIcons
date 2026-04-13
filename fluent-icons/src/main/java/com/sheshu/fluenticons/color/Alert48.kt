package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Alert48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Alert48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(23.9927f, 36.2857f),
                end = Offset(24.0315f, 43.9988f)
            )
        ) {
            moveTo(29.993f, 38f)
            curveToRelative(0f, 3.314f, -2.687f, 6f, -6f, 6f)
            curveToRelative(-3.314f, 0f, -6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            curveToRelative(3.313f, 0f, 6f, 2.686f, 6f, 6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(37.4873f, 33.3329f),
                end = Offset(10.2261f, 8.69963f)
            )
        ) {
            moveTo(24f, 4f)
            curveTo(15.716f, 4f, 9f, 10.716f, 9f, 19f)
            verticalLineToRelative(8.486f)
            lineToRelative(-2.804f, 6.356f)
            curveTo(5.54f, 35.329f, 6.629f, 37f, 8.254f, 37f)
            horizontalLineToRelative(31.492f)
            curveToRelative(1.625f, 0f, 2.715f, -1.671f, 2.058f, -3.158f)
            lineTo(39f, 27.487f)
            verticalLineTo(19f)
            curveToRelative(0f, -8.284f, -6.716f, -15f, -15f, -15f)
            close()
        }
    }.build()
}

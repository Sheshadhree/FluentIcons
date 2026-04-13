package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CoinMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CoinMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(5.65236f, 12.6044f),
                end = Offset(7.30179f, 16.2736f)
            )
        ) {
            moveTo(13f, 13.5f)
            curveToRelative(0f, 1.381f, -2.239f, 2.5f, -5f, 2.5f)
            reflectiveCurveToRelative(-5f, -1.119f, -5f, -2.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(13.0143f, 13.9981f),
                end = Offset(8.70233f, 6.9433f)
            )
        ) {
            moveTo(13f, 11.5f)
            curveToRelative(0f, 1.38f, -2.239f, 2.5f, -5f, 2.5f)
            reflectiveCurveToRelative(-5f, -1.12f, -5f, -2.5f)
            reflectiveCurveTo(5.239f, 9f, 8f, 9f)
            reflectiveCurveToRelative(5f, 1.12f, 5f, 2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(5.65236f, 8.60437f),
                end = Offset(7.30179f, 12.2736f)
            )
        ) {
            moveTo(13f, 9.5f)
            curveToRelative(0f, 1.381f, -2.239f, 2.5f, -5f, 2.5f)
            reflectiveCurveToRelative(-5f, -1.119f, -5f, -2.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(13.0143f, 9.99806f),
                end = Offset(8.70233f, 2.9433f)
            )
        ) {
            moveTo(13f, 7.5f)
            curveToRelative(0f, 1.38f, -2.239f, 2.5f, -5f, 2.5f)
            reflectiveCurveTo(3f, 8.88f, 3f, 7.5f)
            reflectiveCurveTo(5.239f, 5f, 8f, 5f)
            reflectiveCurveToRelative(5f, 1.12f, 5f, 2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(5.65236f, 4.60437f),
                end = Offset(7.30179f, 8.27361f)
            )
        ) {
            moveTo(13f, 5.5f)
            curveTo(13f, 6.881f, 10.761f, 8f, 8f, 8f)
            reflectiveCurveTo(3f, 6.881f, 3f, 5.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(13.0143f, 5.99806f),
                end = Offset(8.70233f, -1.0567f)
            )
        ) {
            moveTo(13f, 3.5f)
            curveTo(13f, 4.88f, 10.761f, 6f, 8f, 6f)
            reflectiveCurveTo(3f, 4.88f, 3f, 3.5f)
            reflectiveCurveTo(5.239f, 1f, 8f, 1f)
            reflectiveCurveToRelative(5f, 1.12f, 5f, 2.5f)
            close()
        }
    }.build()
}

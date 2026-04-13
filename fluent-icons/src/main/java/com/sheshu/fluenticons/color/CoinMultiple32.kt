package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CoinMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CoinMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(11.3047f, 23.5859f),
                end = Offset(14.3014f, 30.6446f)
            )
        ) {
            moveTo(16f, 30f)
            curveToRelative(5.523f, 0f, 10f, -2.462f, 10f, -5.5f)
            verticalLineToRelative(-3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 3.038f, 4.477f, 5.5f, 10f, 5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(26.0286f, 26.9957f),
                end = Offset(16.1574f, 12.3138f)
            )
        ) {
            moveTo(6f, 21.5f)
            arcToRelative(10f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 0f)
            arcToRelative(10f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -20f, 0f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(11.3047f, 16.5859f),
                end = Offset(14.3014f, 23.6446f)
            )
        ) {
            moveTo(16f, 23f)
            curveToRelative(5.523f, 0f, 10f, -2.462f, 10f, -5.5f)
            verticalLineToRelative(-3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 3.038f, 4.477f, 5.5f, 10f, 5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(26.0286f, 19.9957f),
                end = Offset(16.1574f, 5.31382f)
            )
        ) {
            moveTo(6f, 14.5f)
            arcToRelative(10f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 0f)
            arcToRelative(10f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -20f, 0f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(11.3047f, 9.58591f),
                end = Offset(14.3014f, 16.6446f)
            )
        ) {
            moveTo(16f, 16f)
            curveToRelative(5.523f, 0f, 10f, -2.462f, 10f, -5.5f)
            verticalLineToRelative(-3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 3.038f, 4.477f, 5.5f, 10f, 5.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(26.0286f, 12.9957f),
                end = Offset(16.1574f, -1.68618f)
            )
        ) {
            moveTo(6f, 7.5f)
            arcToRelative(10f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 0f)
            arcToRelative(10f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -20f, 0f)
            close()
        }
    }.build()
}

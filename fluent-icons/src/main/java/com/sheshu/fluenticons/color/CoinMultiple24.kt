package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CoinMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CoinMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(8.7133f, 17.4724f),
                end = Offset(10.8409f, 22.4422f)
            )
        ) {
            moveTo(12f, 22f)
            curveToRelative(3.866f, 0f, 7f, -1.79f, 7f, -4f)
            verticalLineToRelative(-2f)
            horizontalLineTo(5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, 3.134f, 4f, 7f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(19.02f, 19.9969f),
                end = Offset(11.7413f, 9.57683f)
            )
        ) {
            moveTo(5f, 16f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14f, 0f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(8.7133f, 12.4724f),
                end = Offset(10.8409f, 17.4422f)
            )
        ) {
            moveTo(12f, 17f)
            curveToRelative(3.866f, 0f, 7f, -1.79f, 7f, -4f)
            verticalLineToRelative(-2f)
            horizontalLineTo(5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, 3.134f, 4f, 7f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(19.02f, 14.9969f),
                end = Offset(11.7413f, 4.57683f)
            )
        ) {
            moveTo(5f, 11f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -14f, 0f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(8.7133f, 7.47241f),
                end = Offset(10.8409f, 12.4422f)
            )
        ) {
            moveTo(12f, 12f)
            curveToRelative(3.866f, 0f, 7f, -1.79f, 7f, -4f)
            verticalLineTo(6f)
            horizontalLineTo(5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, 3.134f, 4f, 7f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF8A69),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(19.02f, 9.9969f),
                end = Offset(11.7413f, -0.423166f)
            )
        ) {
            moveTo(5f, 6f)
            arcToRelative(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
            arcTo(7f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 6f)
            close()
        }
    }.build()
}

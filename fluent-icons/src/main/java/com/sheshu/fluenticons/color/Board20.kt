package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Board20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Board20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF52D17C)
                ),
                start = Offset(7f, 9.5f),
                end = Offset(11.0998f, 18.877f)
            )
        ) {
            moveTo(17f, 12f)
            lineToRelative(-3.5f, -0.5f)
            lineTo(10f, 12f)
            lineToRelative(-0.5f, 2.5f)
            lineTo(10f, 17f)
            horizontalLineToRelative(4f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF309C61)
                ),
                start = Offset(11f, 4f),
                end = Offset(16.3275f, 10.7411f)
            )
        ) {
            moveTo(10f, 3f)
            lineTo(9.5f, 7.5f)
            lineTo(10f, 12f)
            horizontalLineToRelative(7f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineToRelative(-4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(4f, 9f),
                end = Offset(9.4562f, 14.562f)
            )
        ) {
            moveTo(10f, 17f)
            verticalLineTo(8f)
            lineTo(6.5f, 7.5f)
            lineTo(3f, 8f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF64DE89)
                ),
                start = Offset(4f, 4f),
                end = Offset(6.07107f, 9.00508f)
            )
        ) {
            moveTo(10f, 3f)
            verticalLineToRelative(5f)
            horizontalLineTo(3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(4f)
            close()
        }
    }.build()
}
